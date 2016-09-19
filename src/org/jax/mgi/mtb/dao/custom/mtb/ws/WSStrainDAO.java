/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainDAO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.mtb.MTBStrainDetailDTO;
import org.jax.mgi.mtb.dao.custom.mtb.MTBStrainUtilDAO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Strain</code>
 * data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainDAO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class WSStrainDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants

    private final String SQL_STRAIN_SEARCH =
         "select distinct s._Strain_key, s.name strainName, " +
         "       s.description, " +
         "       sf.family, " +
         "       st.type, " +
         "       sn.note, " +
         "       (select accId from Accession where _Object_key = sn._Reference_key and _MTBTypes_key = 6 and _SiteInfo_key = 1) jnum1, " +
         "       ss.name strainSynonym, " +
         "       (select accId from Accession where _Object_key = ss._Reference_key and _MTBTypes_key = 6 and _SiteInfo_key = 1) jnum2, " +
         "       (select accId from Accession where _Object_key = s._Strain_key and _MTBTypes_key = 1 and _SiteInfo_key = 0) accID " +
         "  from Strain s left join StrainFamily sf on ( s._Strain_key = sf._StrainFamily_key) " +
         "       left join StrainNotes sn on (s._Strain_key = sn._Strain_key) " +
         "       left join StrainSynonyms ss on (s._Strain_key = ss._Strain_key), " +
         "       StrainTypeAssoc sta left join  StrainType st on (sta._StrainType_key = st._StrainType_key) " +
         " where s._Strain_key = sta._Strain_key " +
         "   and s._Strain_key in (select _Strain_key from test._strain_data) " +
         " order by s.name, s._Strain_key, st.type";

    private final String SQL_STRAIN_SEARCH_TEMP =
         "create temporary table test._strain_data "+
         "select distinct s._Strain_key " +
         "  from Strain s " +
         " where 1 = 1 ";

    private final String SQL_STRAIN_SEARCH_TF =
         "select (select accId from Accession where _Object_key = tf._Strain_key and _MTBTypes_key = 1 and _SiteInfo_key = 0) strainID, " +
         "       (select accId from Accession where _Object_key = tf._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfID " +
         "  from TumorFrequency tf " +
         " where _Strain_key in (select _Strain_key from test._strain_data)";

    // ----------------------------------------------------- Instance Variables

    private static WSStrainDAO singleton = new WSStrainDAO();
    private final static Logger log =
            Logger.getLogger(WSStrainDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBStrainUtilDAO
     */
    private WSStrainDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBStrainUtilDAO singleton.
     *
     * @return MTBStrainUtilDAO
     */
    public static WSStrainDAO getInstance() {
        return singleton;
    }

    public MTBStrainDetailDTO getStrain(String mtbId) {
        // check for validity
        if (!StringUtils.hasValue(mtbId)) {
            return null;
        }

        long key = -1l;

        //
        try {
            key = Long.parseLong(mtbId);
        } catch (NumberFormatException nfe) {
            return null;
        }

        MTBStrainUtilDAO daoStrainUtil = MTBStrainUtilDAO.getInstance();
        // the strain detail object to return
        return daoStrainUtil.getStrain(key);
    }


    /**
     * Search for a strain.
     */
    public List<WSStrainDTO> searchStrain(WSStrainSearchDTO dtoParams,
                                          String strOrderBy,
                                          long lMaxItems)
            throws NullPointerException, IllegalArgumentException, DAOException {
        Map<String,WSStrainDTO> mapStrains = new HashMap<String,WSStrainDTO>();
        Connection conn = null;
        ResultSet rs = null;
        ResultSet rsTF = null;
        Statement stmtSelect = null;
        Statement stmtSelectTF = null;
        Statement stmtBatch = null;
        Timer timerDAO = new Timer();
        Timer timerTempDAO = new Timer();
        timerDAO.start();

        try {
            // create the connection and the batch statement
            conn = getConnection();
            stmtBatch = conn.createStatement();

            // NOTE: The case statement is used because Janan wanted to have the
            // strains that have a name of "[unspecified]" placed at the end
            // of the search results
            StringBuffer sbSelectTemp = new StringBuffer();
            sbSelectTemp.append(SQL_STRAIN_SEARCH_TEMP);

            // name
            if (StringUtils.hasValue(dtoParams.getName())) {
                // since Sybase does not like UNION syntax in subselects we must
                // create a temp table
                sbSelectTemp.append("and s._Strain_key in (select _Strain_key from test._name) ").append(EOL);

                StringBuffer sbNameSelect = new StringBuffer();
                sbNameSelect.append("create temporary table test._name ");
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from StrainSynonyms ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", "contains", dtoParams.getName(), "'"));
                sbNameSelect.append(EOL).append(" union ").append(EOL);
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from Strain ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", "contains", dtoParams.getName(), "'"));

                log.debug(sbNameSelect.toString());
                

                stmtBatch.addBatch(sbNameSelect.toString());
            }

            // family
            if (StringUtils.hasValue(dtoParams.getFamily())) {
                sbSelectTemp.append("and s._StrainFamily_key in (select _StrainFamily_key from test._family) ").append(EOL);

                StringBuffer sbFamilySelect = new StringBuffer();
                sbFamilySelect.append("create temporary table test._family ");
                sbFamilySelect.append("select _StrainFamily_key ").append(EOL);
                sbFamilySelect.append("  from StrainFamily ").append(EOL);
                sbFamilySelect.append(" where ").append(DAOUtils.formatCondition("family", "contains", dtoParams.getFamily(), "'"));

                log.debug(sbFamilySelect.toString());
           
                stmtBatch.addBatch(sbFamilySelect.toString());
            }


            // jnums
            if ((dtoParams.getReferences() != null) && (dtoParams.getReferences().size() > 0)) {
                // since Sybase does not like UNION syntax in subselects we must
                // create a temp table
                String strRefs = DAOUtils.collectionToString(dtoParams.getReferences(), ", ", "'");

                StringBuffer sbRefTemp = new StringBuffer();
                sbRefTemp.append("create temporary table test._ref_acc ");
                sbRefTemp.append("select distinct _Object_key ").append(EOL);
                sbRefTemp.append("  from Accession ").append(EOL);
                sbRefTemp.append(" where accId in (").append(strRefs).append(')');

               
                log.debug(sbRefTemp.toString());
                

                stmtBatch.addBatch(sbRefTemp.toString());

                StringBuffer sbRef = new StringBuffer();
                sbRef.append("create temporary table test._ref ");
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainSynonyms ").append(EOL);
                sbRef.append(" where _Reference_key in (select _Object_key from test._ref_acc)").append(EOL);
                
                stmtBatch.addBatch(sbRef.toString());
                sbRef = new StringBuffer();
                
                sbRef.append("insert into test._ref ").append(EOL);
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainReferences ").append(EOL);
                sbRef.append(" where _Reference_key in (select _Object_key from test._ref_acc)").append(EOL);
              
                stmtBatch.addBatch(sbRef.toString());
                sbRef = new StringBuffer();
                
                sbRef.append(" insert into test._ref ").append(EOL);
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainNotes ").append(EOL);
                sbRef.append(" where _Reference_key in (select _Object_key from test._ref_acc)");

                log.debug(sbRef.toString());
                

                sbSelectTemp.append("and s._Strain_key in (select _Strain_key from test._ref) ").append(EOL);
                stmtBatch.addBatch(sbRef.toString());
            }

            // strain types
            if ((dtoParams.getTypes() != null) && (dtoParams.getTypes().size() > 0)) {
                String t = DAOUtils.collectionToString(dtoParams.getTypes(), ", ", "");
                sbSelectTemp.append(" and s._Strain_key in (select _Strain_key from StrainTypeAssoc where _StrainType_key in (").append(t).append(")) ").append(EOL);
            }

            log.debug(sbSelectTemp.toString());
            
            stmtBatch.addBatch(sbSelectTemp.toString());

            timerTempDAO.start();
            stmtBatch.executeBatch();
            timerTempDAO.stop();

            log.info("Batch took: " + timerTempDAO.toString());
            
            stmtSelect = conn.createStatement();

            timerTempDAO.restart();
            rs = stmtSelect.executeQuery(SQL_STRAIN_SEARCH);
            timerTempDAO.stop();

            log.info("Getting ResultSet took: " + timerTempDAO.toString());
            
            timerTempDAO.restart();
            WSStrainDTO dtoStrain = null;
            String accId = null;

            while (rs.next()) {
                accId = rs.getString(10);

                if (mapStrains.containsKey(accId)) {
                    dtoStrain = mapStrains.get(accId);
                } else {
                    dtoStrain = new WSStrainDTO();
                }

                dtoStrain.setMTBId(accId);
                dtoStrain.setName(StringUtils.xmlEncodeString(rs.getString(2)));
                dtoStrain.setDescription(StringUtils.xmlEncodeString(rs.getString(3)));
                dtoStrain.setFamily(StringUtils.xmlEncodeString(rs.getString(4)));
                dtoStrain.addType(StringUtils.xmlEncodeString(rs.getString(5)));
                dtoStrain.addNote(StringUtils.xmlEncodeString(rs.getString(6)));
                dtoStrain.addReference(StringUtils.xmlEncodeString(rs.getString(7)));
                dtoStrain.addSynonym(StringUtils.xmlEncodeString(rs.getString(8)));
                dtoStrain.addReference(StringUtils.xmlEncodeString(rs.getString(9)));

                mapStrains.put(accId, dtoStrain);
            }

            timerTempDAO.stop();

            log.info("Looping through ResultSet took: " + timerTempDAO.toString());
            
            // now find each tumor frequency accession id for each strain
            stmtSelectTF = conn.createStatement();
            rsTF = stmtSelectTF.executeQuery(SQL_STRAIN_SEARCH_TF);

            while (rsTF.next()) {
                WSStrainDTO dto = mapStrains.get(rsTF.getString(1));

                if (dto != null) {
                    dto.addTumorId(rsTF.getString(2));
                }

                mapStrains.put(rsTF.getString(1), dto);
            }

            if (mapStrains.values().size() < 1) {
                log.warn("No strains found.");
                throw new DAOException("No strains found.");
            }
        } catch (Exception e) {
            log.error("Error performing strain search", e);
            throw new DAOException(e);
        } finally {
            close(stmtBatch);
            close(stmtSelect, rs);
            close(stmtSelectTF, rsTF);
            freeConnection(conn);
        }

        timerDAO.stop();

        log.info("Search took: " + timerDAO.toString());
        
        return new ArrayList<WSStrainDTO>(mapStrains.values());
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
