/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorDAO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.custom.mtb.MTBTFDetailMetsDTO;
import org.jax.mgi.mtb.dao.custom.mtb.MTBTumorFrequencyDetailDTO;
import org.jax.mgi.mtb.dao.custom.mtb.MTBTumorUtilDAO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs operations on
 * <code>TumorFrequency</code> data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:24
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorDAO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 */
public class WSTumorDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants

    private final String SQL_TUMOR_SEARCH_DATA =
        "select tf._TumorFrequency_key, " +
        "       (select accId from Accession where _Object_key = tf._TumorFRequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfAccId, " +
        "       concat(oo.name,' ',tc.name) tumorName, " +
        "       tf._Sex_key, " +
        "       oo.name organOriginName, " +
        "       oa.name organAffectedName, " +
        "       (select accId from Accession where _Object_key = tf._Strain_key and _MTBTypes_key = 1 and _SiteInfo_key = 0) strainAccId, " +
        "       tf.ageOnset, " +
        "       tf.ageDetection, " +
        "       tf.breedingStatus, " +
        "       tf.infectionStatus, " +
        "       tf.incidence, " +
        "       case when (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1) is null then 0 else 1 end metastasis, " +
        "       coalesce(aty._AgentType_key, 0) _AgentType_key, " +
        "       aty.name treatmentType, " +
        "       a._Agent_key, " +
        "       a.name agentName " +
       
        " From TumorFrequency tf left join  (TumorFrequencyTreatments tft left join "+
        "                                        (Agent a left join AgentType aty on (a._AgentType_key = aty._AgentType_key )) "+
        "                                     on  (tft._Agent_key = a._Agent_key)) "+
        "                         on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), "+

        "       TumorType tt, "+
        "       TumorClassification tc, "+
        "       Organ oa, "+
        "       Organ oo "+
        
        " Where tf._TumorType_key = tt._TumorType_key " +
        "       and tt._TumorClassification_key = tc._TumorClassification_key " +
        "       and tt._Organ_key = oo._Organ_key " +
        "       and tf.freqNum >= 0 " +
        "       and tf._OrganAffected_key = oa._Organ_key " +
        "       and tf._TumorFrequency_key in (select _TumorFrequency_key from test._tf_data) " +
        " order by tfAccId";

    private final String SQL_TUMOR_SEARCH_DATA_PROGRESSION =
        "select tp._Parent_key, " +
        "       (select accId from Accession where _Object_key = tp._Parent_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfAccId, " +
        "       tp._Child_key _key2, " +
        "       (select accId from Accession where _Object_key = tp._Child_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfAccId2, " +
        "       (select o.name from Organ o, TumorFrequency tf where tf._TumorFrequency_key = tp._Child_key and tf._OrganAffected_key = o._Organ_key) oName " +
        "  from TumorProgression tp " +
        " where tp._Parent_key in (select _TumorFrequency_key from test._tf_data) ";
        //TODO: FIGURE OUT"    or tp._Child_key in (select _TumorFrequency_key from #temp_tf_data) "; 

    private final String[] SQL_TUMOR_SEARCH_DATA_REF ={
        "select tf._TumorFrequency_key, " +
        "       (select accId from Accession where _Object_key = tf._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 1) tfaccId," +
        "       (select accId from Accession where _Object_key = tf._Reference_key and _MTBTypes_key = 6 and _SiteInfo_key = 1) refaccId" +
        "  from TumorFrequency tf " +
        " where tf._TumorFrequency_key in (select _TumorFrequency_key from test._tf_data) " 
        ,
        "select tfn._TumorFrequency_key, " +
        "       (select accId from Accession where _Object_key = tfn._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 1) tfaccId, " +
        "       (select accId from Accession where _Object_key = tfn._Reference_key and _MTBTypes_key = 6 and _SiteInfo_key = 1) refaccId " +
        "  from TumorFrequencyNotes tfn " +
        " where tfn._TumorFrequency_key in (select _TumorFrequency_key from test._tf_data) " 
        ,
        "select tfs._TumorFrequency_key, " +
        "       (select accId from Accession where _Object_key = tfs._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 1) tfaccId, " +
        "       (select accId from Accession where _Object_key = tfs._Reference_key and _MTBTypes_key = 6 and _SiteInfo_key = 1) refaccId" +
        "  from TumorFrequencySynonyms tfs" +
        " where tfs._TumorFrequency_key in (select _TumorFrequency_key from test._tf_data) "};

    private final String SQL_TUMOR_SEARCH_TEMP =
        "create temporary table test._tf_data "+
        "select tf._TumorFrequency_key " +
        "  from TumorFrequency tf, " +
        "       TumorType tt, " +
        "       TumorClassification tc, " +
        "       Organ oa, " +
        "       Organ oo " +
        " where tf._TumorType_key = tt._TumorType_key " +
        "       and tt._TumorClassification_key = tc._TumorClassification_key " +
        "       and tt._Organ_key = oo._Organ_key " +
        "       and tf.freqNum >= 0 " +
        "       and tf._OrganAffected_key = oa._Organ_key";

    // ----------------------------------------------------- Instance Variables

    private static WSTumorDAO singleton = new WSTumorDAO();
    private static final Logger log =
            Logger.getLogger(WSTumorDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of WSTumorDAO.  Insures <b>Singleton</b>
     * pattern.
     */
    private WSTumorDAO() {
        super();
    }


    // --------------------------------------------------------- Public Methods

    /**
     * Get the WSTumorDAO singleton.
     *
     * @return WSTumorDAO
     */
    public static WSTumorDAO getInstance() {
        return singleton;
    }

    public WSTumorDTO getTumorFrequency(String mtbId) {
        // check for validity
        if (!StringUtils.hasValue(mtbId)) {
            return null;
        }

        long key = -1l;

        
        try {
            key = Long.parseLong(mtbId);
        } catch (NumberFormatException nfe) {
            return null;
        }

        MTBTumorUtilDAO daoTumorUtil = MTBTumorUtilDAO.getInstance();
        
        // get the tumor details
        MTBTumorFrequencyDetailDTO t = daoTumorUtil.getTumorFrequencyDetail(key);
        
        List<MTBTFDetailMetsDTO> l = daoTumorUtil.getAssociatedFrequencyInfoWS(key);
        List<WSTumorMetsDTO> nl = new ArrayList<WSTumorMetsDTO>();
        for (MTBTFDetailMetsDTO m : l) {
            WSTumorMetsDTO dto = new WSTumorMetsDTO();
            dto.setChildRec(m.isChildRec());
            dto.setMtbId(m.getMtbId());
            dto.setOrgan(m.getOrgan());
            dto.setOrganKey(m.getOrganKey());
            dto.setTumorFrequencyKey(m.getTumorFrequencyKey());
            nl.add(dto);
        }
        
        List<String> agents = t.getAgents();
        List<WSTumorAgentsDTO> ta = new ArrayList<WSTumorAgentsDTO>();
        for (String s : agents) {
            WSTumorAgentsDTO tadto = new WSTumorAgentsDTO();
            tadto.setTreatment(s);
            tadto.setType(t.getTreatmentType());
            ta.add(tadto);
        }

        WSTumorDTO dto = new WSTumorDTO();
        dto.setAgeDetection(t.getAgeDetection());
        dto.setAgeOnset(t.getAgeOnset());
        dto.setFrequency(t.getFrequency());
        dto.setInfectionStatus(t.getInfectionStatus());
        dto.setMetastases(nl);
        dto.setMtbId(t.getMtbId());
        dto.setName(t.getTumorName());
        dto.setOrganAffected(t.getOrganAffected());
        dto.setOrganOrigin(t.getOrganOfOrigin());
        dto.setReferences(t.getReferences());
        dto.setReproductiveStatus(t.getReproductiveStatus());
        dto.setSex(t.getStrainSex());
        dto.setStrainId(t.getStrain().getMtbId());
        dto.setSynonyms(t.getTumorSynonyms());
        dto.setTreatments(ta);
        
        return dto;
    }
    
    public List<WSTumorDTO> searchTumor(WSTumorSearchDTO dtoParams,
                                     String strOrderBy,
                                     long lMaxItems) {
        Map<String,WSTumorDTO> mapTumors = new HashMap<String,WSTumorDTO>();
        Connection conn = null;
        ResultSet rs = null;
        ResultSet rsTP = null;
        ResultSet rsTRef = null;
        Statement stmtSelect = null;
        Statement stmtSelectTP = null;
        Statement stmtSelectTRef = null;
        Statement stmtBatch = null;
        Timer timerDAO = new Timer();
        timerDAO.start();

        try {
            conn = getConnection();
            stmtSelect = conn.createStatement();
            stmtBatch = conn.createStatement();

            StringBuffer sbSelect = new StringBuffer(SQL_TUMOR_SEARCH_TEMP);

            ///////////////////////////////////////////////////////////////////
            // tumor name
            ///////////////////////////////////////////////////////////////////
            if (StringUtils.hasValue(dtoParams.getName())) {
                sbSelect.append("   and concat(oo.name, ' ', tc.name) like '%").append(dtoParams.getName()).append("%' ").append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // organs of origin name
            ///////////////////////////////////////////////////////////////////
            if (StringUtils.hasValue(dtoParams.getOrganOriginName())) {
                sbSelect.append("   and oo._Organ_key in (select _Organ_key from test.temporganb) ").append(EOL);

                StringBuffer sbOrganSelect = new StringBuffer();
                sbOrganSelect.append("create temporary table test.temporganb ");
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                
                sbOrganSelect.append("  from Organ ").append(EOL);
                sbOrganSelect.append("   where _OrganParent_key in (select _OrganParent_key from Organ where name like '%").append(dtoParams.getOrganOriginName()).append("%')");
                sbOrganSelect.append(EOL).append(" union ").append(EOL);
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);
                sbOrganSelect.append(" where _Organ_name like '%").append(dtoParams.getOrganOriginName()).append("%'");

                log.debug(sbOrganSelect.toString());
                
                stmtBatch.addBatch(sbOrganSelect.toString());
            }

            ///////////////////////////////////////////////////////////////////
            // organs affected name
            ///////////////////////////////////////////////////////////////////
            if (StringUtils.hasValue(dtoParams.getOrganAffectedName())) {
                sbSelect.append("   and oa._Organ_key in (select _Organ_key from test.temporgana) ").append(EOL);

                StringBuffer sbOrganSelect = new StringBuffer();
                sbOrganSelect.append("create temporary table test.temporgana ");
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);
                sbOrganSelect.append("   where _OrganParent_key in (select _OrganParent_key from Organ where name like '%").append(dtoParams.getOrganAffectedName()).append("%')");
                sbOrganSelect.append(EOL).append(" union ").append(EOL);
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);
                sbOrganSelect.append(" where _Organ_name like '%").append(dtoParams.getOrganAffectedName()).append("%'");

                log.debug(sbOrganSelect.toString());
                
                stmtBatch.addBatch(sbOrganSelect.toString());
            }


            ///////////////////////////////////////////////////////////////////
            // tumor frequency
            ///////////////////////////////////////////////////////////////////
            if (StringUtils.hasValue(dtoParams.getFrequency())) {
                //sbSelect.append("   and tf.freqNum").append(strCompare).append(tfParams.getFrequency()).append(' ').append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // strain ids
            ///////////////////////////////////////////////////////////////////
            if ((dtoParams.getStrainIds() != null) && (dtoParams.getStrainIds().size() > 0)) {
                List<String> listStrains = new ArrayList<String>(dtoParams.getStrainIds());
                String strStrainIds = DAOUtils.collectionToString(listStrains, ",", "'");

                StringBuffer temp = new StringBuffer();
                temp.append("Create temporary tabel test.tempstrain ");
                temp.append("select s._Strain_key ").append(EOL);
                temp.append(" from Strain s, Accession a ").append(EOL);
                temp.append("where s._Strain_key = a._Object_key ").append(EOL);
                temp.append("  and a._MTBTypes_key = 1 ").append(EOL);
                temp.append("  and a._SiteInfo_key = 0 ").append(EOL);
                temp.append("  and a.accId in (").append(strStrainIds).append(')');

                log.debug(temp.toString());
                
                stmtBatch.addBatch(temp.toString());

                sbSelect.append(" and tf._Strain_key in (select distinct _Strain_key from test.tempstrain)").append(EOL);
            }


            ///////////////////////////////////////////////////////////////////
            // jnumbers
            ///////////////////////////////////////////////////////////////////
            if ((dtoParams.getReferences() != null) && (dtoParams.getReferences().size() > 0)) {
                List<String> listRefs = new ArrayList<String>(dtoParams.getReferences());
                String strRefIds = DAOUtils.collectionToString(listRefs, ",", "'");

                StringBuffer temp = new StringBuffer();
                temp.append("create temporary table test.tempreference ");
                temp.append("select r._Reference_key ").append(EOL);
                temp.append(" from Reference r, Accession a ").append(EOL);
                temp.append("where r._Reference_key = a._Object_key ").append(EOL);
                temp.append("  and a._MTBTypes_key = 6 ").append(EOL);
                temp.append("  and a._SiteInfo_key = 0 ").append(EOL);
                temp.append("  and a.accId in (").append(strRefIds).append(')');

                log.debug(temp.toString());
                
                StringBuffer tempTF = new StringBuffer();
                tempTF.append("create temporary table test.temptf ");
                tempTF.append("select _TumorFrequency_key from TumorFrequency where _Reference_key in (select _Reference_key from test.tempreference) ").append(EOL);
                tempTF.append("union ").append(EOL);
                tempTF.append("select _TumorFrequency_key from TumorFrequencyNotes where _Reference_key in (select _Reference_key from test.tempreference) ").append(EOL);
                tempTF.append("union ").append(EOL);
                tempTF.append("select _TumorFrequency_key from TumorFrequencySynonyms where _Reference_key in (select _Reference_key from test.tempreference)");

                log.debug(tempTF.toString());
                
                stmtBatch.addBatch(temp.toString());
                stmtBatch.addBatch(tempTF.toString());

                sbSelect.append(" and tf._TumorFrequency_key in (select distinct _TumorFrequency_key from test.temptf)").append(EOL);
            }

            log.debug(sbSelect.toString());
            
            stmtBatch.addBatch(sbSelect.toString());

            stmtBatch.executeBatch();
            stmtBatch.close();

            stmtSelect = conn.createStatement();

            log.debug(sbSelect.toString());
            log.debug(SQL_TUMOR_SEARCH_DATA);
           
            rs = stmtSelect.executeQuery(SQL_TUMOR_SEARCH_DATA);

            WSTumorDTO dtoTumor = null;
            String accId = null;

            while (rs.next()) {
                accId = rs.getString(2);

                if (mapTumors.containsKey(accId)) {
                    dtoTumor = mapTumors.get(accId);
                } else {
                    dtoTumor = new WSTumorDTO();
                }

                dtoTumor.setMtbId(accId);
                dtoTumor.setName(StringUtils.xmlEncodeString(rs.getString(3)));
                dtoTumor.setSex(StringUtils.xmlEncodeString(rs.getString(4)));
                dtoTumor.setOrganOrigin(StringUtils.xmlEncodeString(rs.getString(5)));
                dtoTumor.setOrganAffected(StringUtils.xmlEncodeString(rs.getString(6)));
                dtoTumor.setStrainId(StringUtils.xmlEncodeString(rs.getString(7)));
                dtoTumor.setAgeOnset(StringUtils.xmlEncodeString(rs.getString(8)));
                dtoTumor.setAgeDetection(StringUtils.xmlEncodeString(rs.getString(9)));
                dtoTumor.setReproductiveStatus(StringUtils.xmlEncodeString(rs.getString(10)));
                dtoTumor.setInfectionStatus(StringUtils.xmlEncodeString(rs.getString(11)));
                dtoTumor.setFrequency(StringUtils.xmlEncodeString(rs.getString(12)));
                //dtoTumor.addTreatment(rs.getString(15), rs.getString(17));

                mapTumors.put(accId, dtoTumor);
            }

            // now find each tumor frequency parent/child relationship
            log.debug(SQL_TUMOR_SEARCH_DATA_PROGRESSION);
            
            stmtSelectTP = conn.createStatement();
            
           
              rsTP = stmtSelectTP.executeQuery(SQL_TUMOR_SEARCH_DATA_PROGRESSION);

              while (rsTP.next()) {
                  WSTumorDTO dto = mapTumors.get(rsTP.getString(2));

                  if (dto != null) {
                     // dto.addMetastases(rsTP.getString(4), rsTP.getString(5));

                    // moved put into if block so nulls are not added to map
                    mapTumors.put(rsTP.getString(2), dto);
                  }
                  // put was here

              }
        

            log.debug(SQL_TUMOR_SEARCH_DATA_REF);

            stmtSelectTRef = conn.createStatement();
            
             for(int i = 0; i < SQL_TUMOR_SEARCH_DATA_REF.length; i++){
               
              rsTRef = stmtSelectTRef.executeQuery(SQL_TUMOR_SEARCH_DATA_REF[i]);

              while (rsTRef.next()) {
                  WSTumorDTO dto = mapTumors.get(rsTRef.getString(2));

                  if (dto != null) {
                      dto.addReference(rsTRef.getString(3));

                      mapTumors.put(rsTRef.getString(2), dto);
                  }
                  // put was here, again don't add nulls

              }
           }
        } catch (SQLException ex) {
            log.error("Error performing search", ex);
        } finally {
            close(stmtBatch);
            close(stmtSelect, rs);
            close(stmtSelectTP, rsTP);
            close(stmtSelectTRef, rsTRef);
            freeConnection(conn);
        }

        return new ArrayList<WSTumorDTO>(mapTumors.values());
    }
}

