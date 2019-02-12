/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainUtilDAO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.custom.mtb.param.StrainSearchParams;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainNotesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainNotesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeComparator;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Strain</code>
 * data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainUtilDAO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBStrainUtilDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants

    public static final int ID_STRAIN_ID = 0;
    public static final int ID_STRAIN_NAME = 1;
    public static final int ID_STRAIN_TYPE = 2;

    private final int SITE_ID_LOTHAR  = 100;
    private final int SITE_ID_NCIMR   = 101;
    private final int SITE_ID_CARDIFF = 102;
    private final String COLLECTION_LINKS = "links";
    private final String COLLECTION_LINKS_GENERAL = "linksGeneral";

   
    private static final String SQL_ACCESSION_BY_STRAIN_KEY =
         "select accId " +
         "  from Accession " +
         " where _Object_key = ? " +
         "   and _MTBTypes_key = 1";
    
    private final static String SQL_ASSOCIATED_TUMORS =
            "select tf._TumorFrequency_key, " +
            "       coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), tf._TumorFrequency_key) _Parent_key, " +
            "       (select count(1) from TumorFrequencyTreatments where _TumorFrequency_key = tft._TumorFrequency_key) numAgents, " +
            "       case when (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1) is null then 0 else 1 end metastasis, " +
            "       (select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i where a._Pathology_key = pi._Pathology_key and  pi._images_key = i._images_key and i.privateFlag = 0 and a._TumorFrequency_key = tf._TumorFrequency_key) numImages, " +
            "       oo._Organ_key organOriginKey, " +
            "       oo.name organOriginName, " +
            "       tc._TumorClassification_key, " +
            "       tc.name tumorClassName, " +
            "       oo.name || ' ' || tc.name tumorName, " +
            "       s._Strain_key, " +
            "       s.name strainName, " +
            "       tf._Sex_key, " +
            "       tf.incidence, " +
            "       oa.name organAffectedName, " +
            "       aty.name treatmentType, " +
            "       a._Agent_key, " +
            "       a.name agentName, " +
            "       acc.accId " +
            "   from TumorFrequency tf left join " +
            "       ( TumorFrequencyTreatments tft join Agent a on ( tft._Agent_key = a._Agent_key ) " +
			      "        join AgentType aty on ( a._AgentType_key = aty._AgentType_key )) " +
            "        on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), " +
            "       TumorType tt, " +
            "       TumorClassification tc, " +
            "       Strain s, " +
            "       Accession acc, " +
            "       Organ oa, " +
            "       Organ oo " +
            " where tf._TumorType_key = tt._TumorType_key " +
            "   and tt._TumorClassification_key = tc._TumorClassification_key " +
            "   and tt._Organ_key = oo._Organ_key " +
            "   and tf._Reference_key = acc._Object_key " +
            "   and acc._SiteInfo_key = 1 " +
            "   and acc._MTBTypes_key = 6 " +
            "   and tf._Strain_key = s._Strain_key " +
            "   and tf._OrganAffected_key = oa._Organ_key " +
            "   and tf._Strain_key = ?" +
            " order by metastasis, _Parent_key, oo.name, tc.name, oa.name";

    private final static String SQL_STRAIN_REFERENCES =
            "select r._Reference_key, r.shortCitation, a.accId " +
            "  from StrainReferences sr, Reference r, Accession a " +
            " where a._Object_key = r._Reference_key " +
            "   and a._MTBTypes_key = 6 " +
            "   and sr._Reference_key = r._Reference_key " +
            "   and sr._Strain_key = ? " +
            " order by r.year desc, r.shortCitation";

    private final static String SQL_STRAIN_SYNONYMS =
            "select ss._StrainSynonyms_key, ss._Strain_key, ss._Reference_key, ss.name, a.accId " +
            "  from StrainSynonyms ss, Accession a " +
            " where a._Object_key = ss._Reference_key " +
            "   and a._MTBTypes_key = 6 " +
            "   and ss._Strain_key = ? " +
            " order by ss.name";

    private final static String SQL_STRAIN_NOTES =
            "select sn._StrainNotes_key, sn._Strain_key, sn._Reference_key, sn.note, a.accId " +
            "  from StrainNotes sn, Accession a " +
            " where a._Object_key = sn._Reference_key " +
            "   and a._MTBTypes_key = 6 " +
            "   and sn._Strain_key = ? " +
            " order by sn._StrainNotes_key";

    private final static String SQL_STRAIN_GENETICS =
            "select distinct c.chromosome, o.commonName, m._Marker_key, " +
            "       m.symbol, m.name, ap._Allele1_key, " +
            "       (select symbol from Allele where _Allele_key = ap._Allele1_key) allele1Symbol, " +
            "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele1_key) allele1Type, " +
            "       ap._Allele2_key, " +
            "       (select symbol from Allele where _Allele_key = ap._Allele2_key) allele2Symbol, " +
            "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele2_key) allele2Type, " +
            "       (select replace(sl.url,'@@@@',ai.accId) " +
            "          from Accession ai, SiteInfo si, SiteLinks sl " +
            "         where ai._Object_key = m._Marker_key " +
            "           and ai._MTBTypes_key = 2  " +
            "           and si._SiteInfo_key = 1  " +
            "           and ai._SiteInfo_key = si._SiteInfo_key " +
            "           and si._SiteInfo_key = sl._SiteLinks_key) markerUrl, " +
            "       (select replace(sl.url, '@@@@', ai.accId)  " +
            "          from Accession ai, SiteInfo si, SiteLinks sl " +
            "         where ai._Object_key = ap._Allele1_key " +
            "           and ai._MTBTypes_key = 3 " +
            "           and si._SiteInfo_key = 1 " +
            "           and ai._SiteInfo_key = si._SiteInfo_key " +
            "           and si._SiteInfo_key = sl._SiteLinks_key) allele1Url, " +
            "       (select replace (sl.url,'@@@@', ai.accId) " +
            "          from Accession ai, SiteInfo si, SiteLinks sl " +
            "         where ai._Object_key= ap._Allele2_key " +
            "           and ai._MTBTypes_key = 3 " +
            "           and si._SiteInfo_key = 1 " +
            "           and ai._SiteInfo_key = si._SiteInfo_key " +
            "           and si._SiteInfo_key = sl._SiteLinks_key) allele2Url, " +
            "       g._Reference_key, " +
            "       ap._AllelePair_key, " +
            "       g._Genotype_key " +
            "  from AllelePair ap, " +
            "       Allele a, " +
            "       AlleleMarkerAssoc ama, " +
            "       Marker m, " +
            "       Chromosome c, " +
            "       Organism o, " +
            "       Genotype g " +
            " where ap._AllelePair_key = g._AllelePair_key " +
            "   and g._Strain_key = ? " +
            "   and a._Allele_key in (ap._Allele1_key, ap._Allele2_key) " +
            "   and a._Allele_key = ama._Allele_key " +
            "   and ama._Marker_key = m._Marker_key " +
            "   and m._Chromosome_key = c._Chromosome_key " +
            "   and c._Organism_key = o._Organism_key " +
            "   and ama._AlleleMarkerAssocType_key in (1,3,4) " +  // exclude alleles that have no expressed component (key 2: Regulatory - Promoter)
            " order by symbol ";


    // ----------------------------------------------------- Instance Variables

    private static MTBStrainUtilDAO singleton = new MTBStrainUtilDAO();
    private final static Logger log =
            Logger.getLogger(MTBStrainUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBStrainUtilDAO
     */
    private MTBStrainUtilDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBStrainUtilDAO singleton.
     *
     * @return MTBStrainUtilDAO
     */
    public static MTBStrainUtilDAO getInstance() {
        return singleton;
    }

    public MTBStrainDetailDTO getStrain(long key) {
        return getStrain(key, false);
    }

    public MTBStrainDetailDTO getStrain(long lKey, boolean bSimple) {
        // the strain detail object to return
        MTBStrainDetailDTO dtoStrainDetail = new MTBStrainDetailDTO();
        StrainDTO dtoStrain = null;
        StrainDAO daoStrain = null;

        // retrieve main strain information, strain types, and strain synonyms
        try {
            // get the strain information
            daoStrain = StrainDAO.getInstance();
            dtoStrain = daoStrain.loadByPrimaryKey(new Long(lKey));
             dtoStrainDetail.setStrainKey(dtoStrain.getStrainKey().longValue());
            dtoStrainDetail.setName(dtoStrain.getName());
            dtoStrainDetail.setDescription(dtoStrain.getDescription());

            // strain family name
            if (dtoStrain.getStrainFamilyKey() != null) {
                dtoStrainDetail.setStrainFamilyName(getStrainFamilyName(dtoStrain.getStrainFamilyKey()));
            }

            // get the associated types
            List<StrainTypeDTO> listStrainTypes = daoStrain.loadStrainTypeViaStrainTypeAssoc(dtoStrain);
            Collections.sort(listStrainTypes, new StrainTypeComparator(StrainTypeDAO.ID_TYPE));
            dtoStrainDetail.setTypes(new ArrayList<StrainTypeDTO>(listStrainTypes));
            MTBStrainUtilDAO daoStrainUtil = MTBStrainUtilDAO.getInstance();
            dtoStrainDetail.setMtbId(daoStrainUtil.getAccessionId(lKey));
            
        } catch (SQLException sqle) {
            log.error("Unable to retrieve strain information.", sqle);
        }

        // retrieve the associated synonyms and accession number
        dtoStrainDetail.setSynonyms(getStrainSynonyms(lKey));

        // retrieve the associated notes and accession number
        dtoStrainDetail.setNotes(getStrainNotes(lKey));

        // retrieve the associated references and accession number
        dtoStrainDetail.setReferences(getStrainReferences(lKey));

        // retrieve the associated tumor frequency information
        dtoStrainDetail.setTumors(getAssociatedTumors(lKey, bSimple));
        dtoStrainDetail.setTumorFrequencyIds(getAssociatedTumorIds(lKey));

        // retrieve the associated genetic information
        dtoStrainDetail.setGenetics(getStrainGenetics(lKey));

        // Retrieve the associated accession information
        Map<String, List<MTBStrainLinksDTO>> hashMap = getAccessionInfo(lKey);
        dtoStrainDetail.setLinks(hashMap.get(COLLECTION_LINKS));
        dtoStrainDetail.setLinksGeneral(hashMap.get(COLLECTION_LINKS_GENERAL));

        return dtoStrainDetail;
    }

    /**
     * Quickly retrieve the name for a strain.
     *
     * @param lStrainKey the key of the strain
     * @return the name of the strain
     */
    public String getStrainName(long lStrainKey) {
        String strName = null;
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select name ");
            sbSelect.append("  from Strain ");
            sbSelect.append(" where _Strain_key = ").append(lStrainKey);

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                strName = rs.getString(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving strain name for strain key " + lStrainKey, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return strName;
    }

    /**
     * Quickly retrieve the family name for a strain.
     *
     * @param lStrainFamilyKey the key of the strain family
     * @return the name of the strain family
     */
    public String getStrainFamilyName(long lStrainFamilyKey) {
        String strName = null;
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select family ");
            sbSelect.append("  from StrainFamily ");
            sbSelect.append(" where _StrainFamily_key = ").append(lStrainFamilyKey);

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                strName = rs.getString(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving strain family name for strain family key " + lStrainFamilyKey, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return strName;
    }

    public List<String> getAssociatedTumorIds(long key) {
        List<String> listIds = new ArrayList<String>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select _TumorFrequency_key ");
            sbSelect.append("  from TumorFrequency ");
            sbSelect.append(" where _Strain_key = ").append(key);

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                listIds.add("MTB:" + rs.getString(1));
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving tumor frequency records for strain key" + key, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return listIds;
    }

    /**
     * Search for a strain.
     */
    public SearchResults<MTBStrainSearchDTO> 
            searchStrain(StrainSearchParams strainParams,
                         String strOrderBy,
                         long lMaxItems)
            throws NullPointerException, IllegalArgumentException, DAOException {

        SearchResults<MTBStrainSearchDTO> resultWrapper = 
                new SearchResults<MTBStrainSearchDTO>();
        List<MTBStrainSearchDTO> arrStrains = 
                new ArrayList<MTBStrainSearchDTO>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmtSelect = null;
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
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select case when position('[' in s.name) = 1 ").append(EOL);
            sbSelect.append("            then 1 ").append(EOL);
            sbSelect.append("            else 0 ").append(EOL);
            sbSelect.append("       end unspec, ").append(EOL);
            sbSelect.append("       s._Strain_key, s.name, s.description, ").append(EOL);
            sbSelect.append("       st._StrainType_key, st.type ").append(EOL);
            sbSelect.append("  from Strain s  join (StrainTypeAssoc sta join StrainType st on (sta._StrainType_key = st._StrainType_key)) ").append(EOL);
            sbSelect.append("        on (s._Strain_key = sta._Strain_key) ");

            // add the Accession table if a jax mice staock number is passed in
            if (StringUtils.hasValue(strainParams.getJAXMiceStockNumber())) {
                sbSelect.append(", Accession a0 ").append(EOL);
            }

            // add the Accession table each time for as many sites
            if ((strainParams.getSites() != null) && (strainParams.getSites().size() > 0)) {
                for (int i = 1; i <= strainParams.getSites().size(); i++) {
                    sbSelect.append(", Accession a").append(i).append(EOL);
                }
            }

            // rather than figure out if the following half dozen sbSelect.appends need to start with a "where" or an "and"
            // put a dummy where in and let the rest use 'and'
            sbSelect.append("where 1 = 1 ");

            // strain key search criteria
            if ((StringUtils.hasValue(strainParams.getStrainKeyComparison())) && (strainParams.getStrainKey() > 0)) {
                sbSelect.append("  and ").append(DAOUtils.formatNumericCondition("s._Strain_key", strainParams.getStrainKeyComparison(), Long.valueOf(strainParams.getStrainKey()))).append(EOL);
            }

            // name
            if (StringUtils.hasValue(strainParams.getStrainName())) {
                
              
                sbSelect.insert(sbSelect.indexOf("from ")+5, " temp_name ttn, ");
                sbSelect.append("and s._Strain_key = ttn._Strain_key ").append(EOL);

                StringBuffer sbNameSelect = new StringBuffer();
                sbNameSelect.append("create temporary table temp_name as ");
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from StrainSynonyms ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", strainParams.getStrainNameComparison(), strainParams.getStrainName(), "'"));
                sbNameSelect.append(EOL).append(" union ").append(EOL);
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from Strain ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", strainParams.getStrainNameComparison(), strainParams.getStrainName(), "'"));

                
                log.debug(sbNameSelect.toString());
                

                stmtBatch.addBatch(sbNameSelect.toString());
            }

            // allelepair key
            if (strainParams.getAllelePairKey() > 0) {
                sbSelect.insert(sbSelect.indexOf("from ")+5, " Genotype gt, ");
                sbSelect.append("and  s._Strain_key = gt._Strain_key and gt._AllelePair_key = ").append(strainParams.getAllelePairKey()).append(EOL);
            }

            // reference key
            if (strainParams.getReferenceKey() != 0) {
               
              
                sbSelect.insert(sbSelect.indexOf("from ")+5, " temp_ref ttr, ");
                sbSelect.append("and s._Strain_key = ttr._Strain_key ").append(EOL);

                StringBuffer sbRef = new StringBuffer();
                sbRef.append("create temporary table temp_ref as ");
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainSynonyms ").append(EOL);
                sbRef.append(" where _Reference_key = ").append(strainParams.getReferenceKey());
                sbRef.append(EOL).append(" union ").append(EOL);
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainReferences ").append(EOL);
                sbRef.append(" where _Reference_key = ").append(strainParams.getReferenceKey());
                sbRef.append(EOL).append(" union ").append(EOL);
                sbRef.append("select distinct _Strain_key ").append(EOL);
                sbRef.append("  from StrainNotes ").append(EOL);
                sbRef.append(" where _Reference_key = ").append(strainParams.getReferenceKey());

                
                log.debug(sbRef.toString());
                
                stmtBatch.addBatch(sbRef.toString());
            }

            // genetic name SQL Injection
            if (StringUtils.hasValue(strainParams.getGeneticName())) {
                sbSelect.insert(sbSelect.indexOf("from ")+5, " temp_genetic_name tgn, ");
                sbSelect.append("and s._Strain_key = tgn._Strain_key ").append(EOL);

                StringBuffer sbGenetics = new StringBuffer();
                sbGenetics.append("create temporary table temp_genetic_name as ");
                sbGenetics.append("select distinct g._Strain_key ").append(EOL);
                sbGenetics.append("  from Genotype g, ").append(EOL);
                sbGenetics.append("       AllelePair ap, ").append(EOL);
                sbGenetics.append("       Allele a1, ").append(EOL);
                sbGenetics.append("       AlleleMarkerAssoc ama, ").append(EOL);
                sbGenetics.append("       MarkerLabel ml ").append(EOL);
                sbGenetics.append(" where g._AllelePair_key = ap._AllelePair_key ").append(EOL);
                sbGenetics.append("   and ap._Allele1_key = a1._Allele_key ").append(EOL);
                sbGenetics.append("   and a1._Allele_key = ama._Allele_key ").append(EOL);
                sbGenetics.append("   and ama._Marker_key = ml._Marker_key ").append(EOL);
                sbGenetics.append("   and (lower(ml.label) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%' ").append(EOL);
                sbGenetics.append("        or lower(a1.name) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%' ").append(EOL);
                sbGenetics.append("        or lower(a1.symbol) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%') ").append(EOL);
                sbGenetics.append("   and ama._AlleleMarkerAssocType_key in (1,3,4) ").append(EOL);
                sbGenetics.append(" union ").append(EOL);
                sbGenetics.append("select distinct g._Strain_key ").append(EOL);
                sbGenetics.append("  from Genotype g, ").append(EOL);
                sbGenetics.append("       AllelePair ap, ").append(EOL);
                sbGenetics.append("       Allele a2, ").append(EOL);
                sbGenetics.append("       AlleleMarkerAssoc ama, ").append(EOL);
                sbGenetics.append("       MarkerLabel ml ").append(EOL);
                sbGenetics.append(" where g._AllelePair_key = ap._AllelePair_key ").append(EOL);
                sbGenetics.append("   and ap._Allele2_key = a2._Allele_key ").append(EOL);
                sbGenetics.append("   and a2._Allele_key = ama._Allele_key ").append(EOL);
                sbGenetics.append("   and ama._Marker_key = ml._Marker_key ").append(EOL);
                sbGenetics.append("   and ( lower(ml.label) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%' ").append(EOL);
                sbGenetics.append("        or lower(a2.name) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%' ").append(EOL);
                sbGenetics.append("        or lower(a2.symbol) like '%").append(strainParams.getGeneticName().toLowerCase()).append("%') ").append(EOL);
                sbGenetics.append("   and ama._AlleleMarkerAssocType_key in (1,3,4) ").append(EOL);

               
                log.debug(sbGenetics.toString());
                
                stmtBatch.addBatch(sbGenetics.toString());
            }

            // types
            if ((strainParams.getStrainTypes() != null) && (strainParams.getStrainTypes().size() != 0)) {
                String t = DAOUtils.collectionToString(strainParams.getStrainTypes(), ", ", "");
    
               // sbSelect.append(" and sta._StrainType_key in (").append(t).append(") ").append(EOL);
                sbSelect.append(" and s._strain_key in (select _strain_key from StrainTypeAssoc where _straintype_key in  (").append(t).append(") )").append(EOL);
            }

            if (StringUtils.hasValue(strainParams.getJAXMiceStockNumber())) {
                sbSelect.append(" and a0._Object_key = s._Strain_key ").append(EOL);
                sbSelect.append(" and a0._MTBTypes_key = 1 ").append(EOL);
                sbSelect.append(" and a0._SiteInfo_key = 105 ").append(EOL);
                sbSelect.append(" and a0.accId = '").append(strainParams.getJAXMiceStockNumber()).append("' ").append(EOL);
            }

            // sites
            if ((strainParams.getSites() != null) && (strainParams.getSites().size() > 0)) {
                int i = 1;
                for (String site : strainParams.getSites()) {
                    sbSelect.append(" and a").append(i).append("._Object_key = s._Strain_key ").append(EOL);
                    sbSelect.append(" and a").append(i).append("._MTBTypes_key = 1 ").append(EOL);
                    sbSelect.append(" and a").append(i).append("._SiteInfo_key = ").append(site).append(EOL);
                    i++;
                }
            }

            sbSelect.append(" order by unspec, s.name, s._Strain_key, st.type ").append(EOL);

            timerTempDAO.start();
            stmtBatch.executeBatch();
            timerTempDAO.stop();

            
            log.info("Batch took: " + timerTempDAO.toString());

            stmtSelect = conn.createStatement();
            
            log.debug(sbSelect.toString());

            timerTempDAO.restart();
            rs = stmtSelect.executeQuery(sbSelect.toString());
            timerTempDAO.stop();

            
            log.info("Getting ResultSet took: " + timerTempDAO.toString());
            

            List<String> strainTypes = null;
            MTBStrainSearchDTO prevStrain = new MTBStrainSearchDTO();

            timerTempDAO.restart();

            while (rs.next()) {
                MTBStrainSearchDTO currentStrain = new MTBStrainSearchDTO();
                currentStrain.setKey(rs.getInt(2));
                currentStrain.setName(rs.getString(3));
                currentStrain.setDescription(rs.getString(4));

                strainTypes = new ArrayList<String>();

                String strainType = rs.getString(6);

                strainTypes.add(strainType);

                currentStrain.setTypes(strainTypes);

                if (prevStrain.getKey() == currentStrain.getKey()) {
                    MTBStrainSearchDTO s = arrStrains.get(arrStrains.size() - 1);

                    Collection<String> c = s.getTypes();

                    if (c == null) {
                        c = new ArrayList<String>();
                    }else{
                   // dont include duplicate types
                    if(!((ArrayList<String>)c).get(c.size()-1).equals(strainType))
                     
                    c.add(strainType);
                    }
                    s.setTypes(c);

                    arrStrains.set(arrStrains.size() - 1, s);
                } else {
                    prevStrain = currentStrain;
                    arrStrains.add(currentStrain);
                }
            }

            timerTempDAO.stop();

            

           
        } catch (SQLException sqle) {
            log.error("Error performing strain search", sqle);
            throw new DAOException(sqle);
        } finally {
            close(stmtBatch);
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        int totalItemsFound = arrStrains.size();

        // here is where the magic of sorting and returning the corect number
        // of rows happens

        timerTempDAO.restart();

        MTBStrainSearchDTO strainArrTemp[] = (MTBStrainSearchDTO [])arrStrains.toArray(new MTBStrainSearchDTO[arrStrains.size()]);
        MTBStrainSearchDTO strainArr[] = null;

        if ("name".equalsIgnoreCase(strOrderBy)) {
            Arrays.sort(strainArrTemp, new MTBStrainSearchComparator(MTBStrainUtilDAO.ID_STRAIN_NAME));
        } else if ("type".equalsIgnoreCase(strOrderBy)) {
            Arrays.sort(strainArrTemp, new MTBStrainSearchComparator(MTBStrainUtilDAO.ID_STRAIN_TYPE));
        }

        if (lMaxItems > 0) {
            strainArr = new MTBStrainSearchDTO[Math.min((int)lMaxItems, strainArrTemp.length)];
            System.arraycopy(strainArrTemp, 0, strainArr, 0, Math.min((int)lMaxItems, strainArrTemp.length));
            arrStrains = new ArrayList<MTBStrainSearchDTO>(Arrays.asList(strainArr));
        } else {
            arrStrains = new ArrayList<MTBStrainSearchDTO>(Arrays.asList(strainArrTemp));
        }

        timerTempDAO.stop();
        timerDAO.stop();

        
        log.info("Sorting ResultSet took: " + timerTempDAO.toString());
        log.info("Search took: " + timerDAO.toString());


        resultWrapper.setList(arrStrains);
        resultWrapper.setTotal(totalItemsFound);

        return resultWrapper;
    }
    /**
     * Get an accession id by the strain key.
     *
     * @param lKey the strain key
     * @return the accession id
     */
    public String getAccessionId(long key) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String accId = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_ACCESSION_BY_STRAIN_KEY);
            stmt.setLong(1, key);
            rs = stmt.executeQuery();

            while (rs.next()) {
                accId = rs.getString(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retreiving accession for strain key = " + key, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return accId;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods

   
    private List<StrainNotesDTO> getStrainNotes(long lKey) {
        Timer timer = new Timer();
        List<StrainNotesDTO> strainNotes = new ArrayList<StrainNotesDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_STRAIN_NOTES);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();
            StrainNotesDAO daoStrainNotes = StrainNotesDAO.getInstance();

            // loop through the results
            while (rs.next()) {
                //"select sn._StrainNotes_key, sn._Strain_key, sn._Reference_key, sn.note, a.accId " +
                StrainNotesDTO note = daoStrainNotes.createStrainNotesDTO();
                note.setStrainNotesKey(rs.getLong(1));
                note.setStrainKey(rs.getLong(2));
                note.setReferenceKey(rs.getLong(3));
                note.setNote(rs.getString(4));
                note.getDataBean().put("ACCID", rs.getString(5));
                strainNotes.add(note);
            }
        } catch (SQLException sqle) {
            log.error("Error getting strain notes.", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        if (log.isInfoEnabled()) {
            log.info("Getting strain notes took: " + timer.toString());
        }

        return strainNotes;
    }

    private List<StrainSynonymsDTO> getStrainSynonyms(long lKey) {
        Timer timer = new Timer();
        List<StrainSynonymsDTO> strainSynonyms = new ArrayList<StrainSynonymsDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_STRAIN_SYNONYMS);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();
            StrainSynonymsDAO daoStrainSynonyms = StrainSynonymsDAO.getInstance();

            // loop through the results
            while (rs.next()) {
                StrainSynonymsDTO note = daoStrainSynonyms.createStrainSynonymsDTO();
                note.setStrainSynonymsKey(rs.getLong(1));
                note.setStrainKey(rs.getLong(2));
                note.setReferenceKey(rs.getLong(3));
                note.setName(rs.getString(4));
                note.getDataBean().put("ACCID", rs.getString(5));
                strainSynonyms.add(note);
            }
        } catch (SQLException sqle) {
            log.error("Error getting strain synonyms.", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        
        log.info("Getting strain synonyms took: " + timer.toString());
        

        return strainSynonyms;
    }

    private List<ReferenceDTO> getStrainReferences(long lKey) {
        Timer timer = new Timer();
        List<ReferenceDTO> strainReferences = new ArrayList<ReferenceDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_STRAIN_REFERENCES);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();
            ReferenceDAO daoReferences = ReferenceDAO.getInstance();

            // loop through the results
            while (rs.next()) {
                ReferenceDTO reference = daoReferences.createReferenceDTO();

                reference.setReferenceKey(rs.getLong(1));
                reference.setShortCitation(DAOUtils.nvl(rs.getString(2), ""));
                reference.getDataBean().put("ACCID", rs.getString(3));

                strainReferences.add(reference);
            }
        } catch (SQLException sqle) {
            log.error("Error getting strain references.", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        
        log.info("Getting strain references took: " + timer.toString());
        

        return strainReferences;
    }

    private List<MTBStrainTumorSummaryDTO> getAssociatedTumors(long lKey, boolean bSimple) {
        Timer timer = new Timer();
        List<MTBStrainTumorDetailsDTO> listTumors = new ArrayList<MTBStrainTumorDetailsDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSOCIATED_TUMORS);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();

            List<String> arrAgents = null;
            List<String> agentKeys = null;
            MTBStrainTumorDetailsDTO dtoPrevTumor = new MTBStrainTumorDetailsDTO();

            // loop through the results
            while (rs.next()) {
                MTBStrainTumorDetailsDTO currentTumor = new MTBStrainTumorDetailsDTO();
                currentTumor.setTumorFrequencyKey(rs.getInt(1));
                currentTumor.setParentFrequencyKey(rs.getInt(2));
                currentTumor.setMetastasis(rs.getInt(4) == 1);
                currentTumor.setImages(rs.getInt(5) > 0);
                currentTumor.setOrganOfOriginKey(rs.getInt(6));
                currentTumor.setOrganOfOriginName(rs.getString(7));
                currentTumor.setTumorClassKey(rs.getInt(8));
                currentTumor.setTumorName(rs.getString(10));
                currentTumor.setStrainKey(rs.getInt(11));
                currentTumor.setSex(rs.getString(13));
                currentTumor.setFrequency(rs.getString(14));
                currentTumor.setOrganAffectedName(rs.getString(15));
                currentTumor.setTreatmentType(DAOUtils.nvl(rs.getString(16), NONE));
                currentTumor.setRefAccId(rs.getString(19));
                String agent = rs.getString(18);
                String agentKey = rs.getString(17);

                arrAgents = new ArrayList<String>();
                agentKeys = new ArrayList<String>();

                arrAgents.add(agent);
                agentKeys.add(agentKey);

                currentTumor.setAgents(arrAgents);
                currentTumor.setAgentKeys(agentKeys);

                if (dtoPrevTumor.getTumorFrequencyKey() == currentTumor.getTumorFrequencyKey()) {
                    MTBStrainTumorDetailsDTO ts = listTumors.get(listTumors.size() - 1);

                    Collection<String> c = ts.getAgents();
                    Collection<String> c2 = ts.getAgentKeys();

                    if (c == null) {
                        c = new ArrayList<String>();
                    }

                    if (c2 == null) {
                        c2 = new ArrayList<String>();
                    }

                    c.add(agent);
                    c2.add(agentKey);

                    ts.setAgents(c);
                    ts.setAgentKeys(c2);

                    listTumors.set(listTumors.size() - 1, ts);
                } else {
                    dtoPrevTumor = currentTumor;
                    listTumors.add(currentTumor);
                }
            }
        } catch (SQLException sqle) {
            log.error("Error getting associated tumor information.", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        
        Map<String, MTBStrainTumorSummaryDTO> mapConsolidatedMetsTumors = consolidateMetastatsis(listTumors, bSimple);
        Map<String, MTBStrainTumorSummaryDTO> mapConsolidatedTumors = consolidateTumors(mapConsolidatedMetsTumors, bSimple);
        Collection<MTBStrainTumorSummaryDTO> colTumors = mapConsolidatedTumors.values();

        MTBStrainTumorSummaryDTO tumorArrTemp[] = (MTBStrainTumorSummaryDTO [])colTumors.toArray(new MTBStrainTumorSummaryDTO[colTumors.size()]);
        MTBStrainTumorSummaryDTO arrTumor[] = null;
        arrTumor = new MTBStrainTumorSummaryDTO[tumorArrTemp.length];
        System.arraycopy(tumorArrTemp, 0, arrTumor, 0, tumorArrTemp.length);

        // sort the tumors
        Arrays.sort(arrTumor, new MTBStrainTumorSummaryComparator(MTBTumorUtilDAO.ID_ORGAN));

        
        log.info("Getting associated tumors took: " + timer.toString());
        

        return new ArrayList<MTBStrainTumorSummaryDTO>(Arrays.asList(arrTumor));
    }

    private List<MTBStrainGeneticsDTO> getStrainGenetics(long lKey) {
        Timer timer = new Timer();
        List<MTBStrainGeneticsDTO> strainGenetics = new ArrayList<MTBStrainGeneticsDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_STRAIN_GENETICS);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();

            // loop through the results
            while (rs.next()) {
                MTBStrainGeneticsDTO dtoStrainGenetics = new MTBStrainGeneticsDTO();
                // postgres returns this as an integer?
                //String strTemp = rs.getString(3);
              
               
                    dtoStrainGenetics.setMarkerId(rs.getInt(3));
                

               // strTemp = rs.getString(16);
              
               
                    dtoStrainGenetics.setAllelePairId(rs.getInt(16));
               

            
               
                    dtoStrainGenetics.setGenotypeId(rs.getInt(17));
               

                dtoStrainGenetics.setChromosome(DAOUtils.nvl(rs.getString(1), ""));
                dtoStrainGenetics.setOrganism(DAOUtils.nvl(rs.getString(2), ""));
                dtoStrainGenetics.setMarkerSymbol(DAOUtils.nvl(rs.getString(4), ""));
                dtoStrainGenetics.setMarkerName(DAOUtils.nvl(rs.getString(5), ""));
                dtoStrainGenetics.setMarkerUrl(DAOUtils.nvl(rs.getString(12), ""));

              
                 dtoStrainGenetics.setAllele1Id(rs.getInt(6));
              
                    
                dtoStrainGenetics.setAllele1Type(DAOUtils.nvl(rs.getString(8), ""));
                dtoStrainGenetics.setAllele1Symbol(DAOUtils.nvl(rs.getString(7), ""));

                // NOTE: not supposed to link to any alleles that hava a
                // '+' character in the name
              String  strTemp = DAOUtils.nvl(rs.getString(13), "");

                if (StringUtils.hasValue(strTemp)) {
                    String symb = dtoStrainGenetics.getAllele1Symbol();
                    if (symb.indexOf('+') == -1) {
                        dtoStrainGenetics.setAllele1Url(strTemp);
                    }
                }

       
                    dtoStrainGenetics.setAllele2Id(rs.getInt(9));
           

                dtoStrainGenetics.setAllele2Type(DAOUtils.nvl(rs.getString(11), ""));
                dtoStrainGenetics.setAllele2Symbol(DAOUtils.nvl(rs.getString(10), ""));

                // NOTE: not supposed to link to any alleles that hava a
                // '+' character in the name
                strTemp = DAOUtils.nvl(rs.getString(14), "");

                if (StringUtils.hasValue(strTemp)) {
                    String symb = dtoStrainGenetics.getAllele2Symbol();
                    if (symb.indexOf('+') == -1) {
                        dtoStrainGenetics.setAllele2Url(strTemp);
                    }
                }

                // reference
                
                    dtoStrainGenetics.setReferenceId(rs.getInt(15));
                

                strainGenetics.add(dtoStrainGenetics);
            }
        } catch (SQLException sqle) {
            log.error("Error getting strain genetics.", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        
        log.info("Getting strain genetics took: " + timer.toString());
        
        return strainGenetics;
    }

    private Map<String, List<MTBStrainLinksDTO>> getAccessionInfo(long lKey) {
        Timer timer = new Timer();
        Map<String, List<MTBStrainLinksDTO>> hashMap = new HashMap<String, List<MTBStrainLinksDTO>>();
        List<MTBStrainLinksDTO> linksGeneral = new ArrayList<MTBStrainLinksDTO>();
        List<MTBStrainLinksDTO> links = new ArrayList<MTBStrainLinksDTO>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // create the query
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select s._Strain_key, s.name, a._Accession_key, a.accId, a._SiteInfo_key, si.name, si.description, si.url siteUrl, sl.url accessionUrl ").append(EOL);
            sbSelect.append("  from Strain s, ").append(EOL);
            sbSelect.append("       Accession a, ").append(EOL);
            sbSelect.append("       SiteInfo si, ").append(EOL);
            sbSelect.append("       SiteLinks sl ").append(EOL);
            sbSelect.append(" where s._Strain_key = a._Object_key ").append(EOL);
            sbSelect.append("   and a._MTBTypes_key = 1 ").append(EOL);
            sbSelect.append("   and a._SiteInfo_key > 0 ").append(EOL);
            sbSelect.append("   and a._SiteInfo_key = si._SiteInfo_key ").append(EOL);
            sbSelect.append("   and si._SiteInfo_key = sl._SiteInfo_key ").append(EOL);
            sbSelect.append("   and s._Strain_key = ").append(lKey);

            // get a connection, create a statement, and execute the query
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            // loop through the results
            while (rs.next()) {
                MTBStrainLinksDTO link = new MTBStrainLinksDTO();
                String siteName = rs.getString(7);
                String siteUrl = rs.getString(8);
                String accessionUrl = rs.getString(9);
                String accessionNumber = rs.getString(4);
                int siteId = rs.getInt(5);
                
                accessionUrl = accessionUrl.replaceAll("@@@@", accessionNumber);

                link.setSiteName(DAOUtils.nvl(siteName, siteUrl));
                link.setSiteUrl(siteUrl);
                link.setAccessionUrl(accessionUrl);

               
                 

                if ((siteId == SITE_ID_CARDIFF) ||
                    (siteId == SITE_ID_LOTHAR) ||
                    (siteId == SITE_ID_NCIMR)) {
                    linksGeneral.add(link);
                } else {
                    links.add(link);
                }
            }
        } catch (SQLException sqle) {
            log.error("Error getting strain accession data.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        hashMap.put(COLLECTION_LINKS, links);
        hashMap.put(COLLECTION_LINKS_GENERAL, linksGeneral);

        
        log.info("Getting strain accession data took: " + timer.toString());
        
        return hashMap;
    }
        
      private Map<String, MTBStrainTumorSummaryDTO> consolidateMetastatsis(List<MTBStrainTumorDetailsDTO> t, boolean simple) {
        Map<String, MTBStrainTumorSummaryDTO> mapTumors  = new LinkedHashMap<String, MTBStrainTumorSummaryDTO>();

        for (MTBStrainTumorDetailsDTO detail : t) {
            MTBStrainTumorSummaryDTO sumTemp = null;

            StringBuffer key = new StringBuffer();
            key.append(detail.getStrainKey());
            key.append("::");
  //          key.append(detail.getTumorName());
            key.append("::");
            key.append(detail.getTreatmentType());
            key.append("::");
            key.append(detail.getParentFrequencyKey());
            key.append("::");

            if (!simple) {
                

                if (detail.getAgents() == null) {
                    key.append("NULL");
                } else {
                    key.append(detail.getAgents().toString());
                }
            }

            if (mapTumors.containsKey(key.toString())) {
                sumTemp = mapTumors.get(key.toString());
                sumTemp.addTumorFrequencyKey(detail.getTumorFrequencyKey());

             
                if ("0".equalsIgnoreCase(detail.getFrequency())) {
                    sumTemp.addMetastasizesTo("<i>not</i> " + detail.getOrganAffectedName());
                } else {
                    sumTemp.addMetastasizesTo(detail.getOrganAffectedName());
                    sumTemp.addTFKeyWithFrequency(detail.getTumorFrequencyKey());
                }

                sumTemp.setImages(detail.getImages());
                sumTemp.setMetastasis(detail.getMetastasis());
            } else {
                sumTemp = new MTBStrainTumorSummaryDTO(detail);
            }

            mapTumors.put(key.toString(), sumTemp);
        }

        return mapTumors;
    }

     public ArrayList<LabelValueBean> getStrainsForGrid() {
        ArrayList<LabelValueBean> strains = new ArrayList<LabelValueBean>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select distinct sf.family, sf._strainfamily_key from StrainFamily sf, Strain s, TumorFrequency tf ");
            sbSelect.append("where sf._strainfamily_key = s._strainfamily_key ");
            sbSelect.append("and  s._strain_key = tf._strain_key "); 
            sbSelect.append("and s._strain_key in (select _Strain_key from StrainTypeAssoc where _StrainType_key in (8)) ");
            sbSelect.append(" order by sf.family ");

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                LabelValueBean lvb = new LabelValueBean(rs.getString(1), rs.getLong(2));
                strains.add(lvb);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving strains for grid", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return strains;
    }
     
     public ArrayList<LabelValueBean> getStrainsFromFamilies(String[] familyKeys) {
        ArrayList<LabelValueBean> strains = new ArrayList<LabelValueBean>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        StringBuffer keysList = new StringBuffer();
        keysList.append("( "+familyKeys[0]);
        for(int i =1; i < familyKeys.length; i++){
          keysList.append(", "+familyKeys[i]);
        }
        keysList.append(" ) ");
        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select distinct s.name, s._strain_key from Strain s, TumorFrequency tf ");
            sbSelect.append("where  s._strain_key = tf._strain_key "); 
            sbSelect.append("and s._strain_key in (select _Strain_key from StrainTypeAssoc where _StrainType_key in (8)) ");
            sbSelect.append("and s._strainfamily_key in "+keysList.toString());
            sbSelect.append(" order by s.name ");

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                LabelValueBean lvb = new LabelValueBean(rs.getString(1), rs.getLong(2));
                strains.add(lvb);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving strains for grid", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return strains;
    }


   
}
