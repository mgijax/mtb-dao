/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBAdvancedSearchDAO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults; 
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs a composite search on
 * <code>TumorFrequency</code> data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBAdvancedSearchDAO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBAdvancedSearchDAO extends MTBUtilDAO {

    //SQL Injection
    private final static String SQL_SEARCH_GENETIC_TEMP =
        "create temporary table temp_genetic_name  as "+
        "select distinct g._Strain_key " +
        "  from Genotype g, " +
        "       AllelePair ap, " +
        "       Allele a1, " +
        "       AlleleMarkerAssoc ama, " +
        "       MarkerLabel ml " +
        " where g._AllelePair_key = ap._AllelePair_key " +
        "   and ap._Allele1_key = a1._Allele_key " +
        "   and a1._Allele_key = ama._Allele_key " +
        "   and ama._Marker_key = ml._Marker_key " +
        "   and (lower(ml.label) like '%%%s%%' " +
        "        or lower(a1.name) like '%%%s%%' " +
        "        or lower(a1.symbol) like '%%%s%%') " +
        "   and ama._AlleleMarkerAssocType_key in (1,3,4) " +
        " union " +
        "select distinct g._Strain_key " +
        "  from Genotype g, " +
        "       AllelePair ap, " +
        "       Allele a2, " +
        "       AlleleMarkerAssoc ama, " +
        "       MarkerLabel ml " +
        " where g._AllelePair_key = ap._AllelePair_key " +
        "   and ap._Allele2_key = a2._Allele_key " +
        "   and a2._Allele_key = ama._Allele_key " +
        "   and ama._Marker_key = ml._Marker_key " +
        "   and (lower(ml.label) like '%%%s%%' " +
        "        or lower(a2.name) like '%%%s%%' " +
        "        or lower(a2.symbol) like '%%%s%%') " +
        "   and ama._AlleleMarkerAssocType_key in (1,3,4) ";

    private final static String SQL_ADVANCED_SEARCH_TEMP_TF =
        "create temporary table freqsfortemp as " +
        "select tf._TumorFrequency_key tfkey " +
        "  from TumorFrequency tf, " +
        "       TumorType tt, " +
        "       TumorClassification tc, " +
        "       Strain s, " +
        "       Organ oa, " +
        "       Organ ot " +
        " where tf._TumorType_key = tt._TumorType_key " +
        "   and tt._TumorClassification_key = tc._TumorClassification_key " +
        "   and tt._Organ_key = ot._Organ_key " +
        "   and tf._Strain_key = s._Strain_key " +
        "   and tf._OrganAffected_key = oa._Organ_key ";
       

    private final static String[] SQL_ADVANCED_SEARCH_TEMP_MASTER =
    {" create temporary table master as select tp._Child_key tfkey from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Child_key = tft.tfkey " 
        ,
        "insert into master select tp._Child_key tfkey from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Parent_key = tft.tfkey  " 
        ,
        "insert into master select tp._Parent_key tfkey from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Child_key = tft.tfkey " 
        ,
        "insert into master select tp._Parent_key tfkey from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Parent_key = tft.tfkey" 
        ,
        "insert into master select distinct tfkey from freqsfortemp"};

   

    private final static String SQL_ADVANCED_SEARCH =
        "select distinct tf._TumorFrequency_key, " +
        "       coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), tf._TumorFrequency_key) _Parent_key, " +
        "       (select count(1) from TumorFrequencyTreatments where _TumorFrequency_key = tft._TumorFrequency_key) numAgents, " +
        "       case when (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1) is null then 0 else 1 end metastasis, " +
        "       (select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i where a._Pathology_key = pi._Pathology_key and pi._images_key = i._images_key and i.privateFlag = 0 and a._TumorFrequency_key = tf._TumorFrequency_key) numImages, " +
        "       ot._Organ_key, " +
        "       ot.name tumorOrganName, " +
        "       tc._TumorClassification_key, " +
        "       tc.name tumorClassName, " +
        "       ot.name || ' ' || tc.name tumorName, " +
        "       s._Strain_key, " +
        "       s.name, " +
        "       tf._Sex_key, " +
        "       tf.incidence, " +
        "       oa.name organAffectedName, " +
        "       coalesce(aty._AgentType_key, 0) _AgentType_key, " +
        "       aty.name treatmentType, " +
        "       a._Agent_key, " +
        "       a.name agentName, " +
        "       st.type, " +
        "       acc.accID, "+
        "       tf.incidence "+
        "  from TumorFrequency tf left join "+
        "     (TumorFrequencyTreatments tft join Agent a on ( tft._Agent_key = a._Agent_key ) "+
			  "       join AgentType aty on ( a._AgentType_key = aty._AgentType_key )) "+
        "      on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), "+
        "       TumorType tt, " +
        "       TumorClassification tc, " +
        "       Strain s, " +
        "       StrainType st, " +
        "       StrainTypeAssoc sta, " +
        "       Organ oa, " +
        "       Organ ot, " +
        "       master m, " +
        "       Accession acc " +   
        " where tf._TumorType_key = tt._TumorType_key " +
        "   and tt._TumorClassification_key = tc._TumorClassification_key " +
        "   and tt._Organ_key = ot._Organ_key " +
        "   and s._Strain_key = sta._Strain_key " +
        "   and sta._StrainType_key = st._StrainType_key " +
        "   and tf._Strain_key = s._Strain_key " +
        "   and tf._OrganAffected_key = oa._Organ_key " +
        "   and tf._TumorFrequency_key = m.tfkey " +
        "   and tf._reference_key = acc._object_key and acc._mtbtypes_key = 6 and acc._siteinfo_key = 1 "+
        "   and tc._tumorclassification_key != 228 ";  // added this 09-15-15

    // -------------------------------------------------------------- Constants

    public static final int ID_ORGAN_ORIGIN = 0;
    public static final int ID_STRAIN_NAME = 1;
    public static final int ID_TUMOR_CLASS = 2;
    public static final int ID_STRAIN_TYPE = 3;
    public static final int ID_TREATMENT_TYPE = 4;

    // ----------------------------------------------------- Instance Variables

    private static MTBAdvancedSearchDAO singleton = new MTBAdvancedSearchDAO();
    private static final Logger log =
            Logger.getLogger(MTBAdvancedSearchDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBAdvancedSearchDAO.  Singleton pattern is
     * used.
     */
    private MTBAdvancedSearchDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBAdvancedSearchDAO singleton.
     *
     * @return MTBAdvancedSearchDAO
     */
    public static MTBAdvancedSearchDAO getInstance() {
        return singleton;
    }

    /**
     * Perform the composite search.
     */
    public SearchResults<MTBStrainTumorSummaryDTO> search(Collection<String> colOrgansOrigin,
                                Collection<String> colTumorClassifications,
                                int nAgentType,
                                boolean bRestrictToMetastasis,
                                boolean bMustHaveImages,
                                String strStrainNameComparison,
                                String strStrainName,
                                Collection<String> colStrainTypes,
                                String strGeneticName,
                                String strOrderBy,
                                int nMaxItems, int colonySize, int freq)
        throws NullPointerException, IllegalArgumentException, DAOException {

        SearchResults<MTBStrainTumorSummaryDTO> resultWrapper = null;
        Connection conn = null;
        Statement stmtSelect = null;
        Statement stmtBatch = null;
        ResultSet rs = null;
        List<MTBStrainTumorDetailsDTO> tumors =
                new ArrayList<MTBStrainTumorDetailsDTO>();
        int tumorFrequencyCount = 0;
        Timer timerDAO = new Timer();
        Timer timerTempDAO = new Timer();
        timerDAO.start();
        
        try {
            conn = getConnection();
            stmtSelect = conn.createStatement();
            stmtBatch = conn.createStatement();

            StringBuffer sbSelect = new StringBuffer(SQL_ADVANCED_SEARCH);
            StringBuffer sbSelectTFs = new StringBuffer(SQL_ADVANCED_SEARCH_TEMP_TF);
            
            //not in search form, must twiddle url
             if(colonySize> 0){
                sbSelect.append("and tf.colonySize > " + colonySize +" ");
            }
            
            if(freq > 0){
                sbSelect.append("and tf.freqNum >= "+freq+" ");
            }
            
            
            ///////////////////////////////////////////////////////////////////
            // agent
            ///////////////////////////////////////////////////////////////////
           
            
            
            if (nAgentType == 0) {
              
                sbSelectTFs.append("   and tf._TumorFrequency_key not in (select _TumorFrequency_key from TumorFrequencyTreatments) ").append(EOL);
                
            } else if (nAgentType > 0) {
              
                StringBuffer sbAgentType = new StringBuffer();
                sbAgentType.append("create temporary table temptft as select tft._TumorFrequency_key from TumorFrequencyTreatments tft, Agent a ").append(EOL);
                sbAgentType.append(" where tft._Agent_key = a._Agent_key and a._AgentType_key = ").append(nAgentType).append(EOL);
                log.debug(sbAgentType.toString());
                stmtBatch.addBatch(sbAgentType.toString());
                sbSelectTFs.insert(sbSelectTFs.indexOf("from")+5, " temptft ttft, ");
                sbSelectTFs.append("   and tf._TumorFrequency_key = ttft._TumorFrequency_key ").append(EOL);
            }

            if ((colOrgansOrigin != null) && (colOrgansOrigin.size() > 0)) {
                sbSelectTFs.append("   and ot._Organ_key in (select _Organ_key from temporganb) ").append(EOL);

                StringBuffer sbOrganSelect = new StringBuffer();
                sbOrganSelect.append("create temporary table temporganb as ").append(EOL);
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);

                if (colOrgansOrigin.size() == 1) {
                    sbOrganSelect.append("   where _OrganParent_key = ").append(colOrgansOrigin.iterator().next()).append(EOL);
                } else if (colOrgansOrigin.size() > 1) {
                    sbOrganSelect.append("   where _OrganParent_key in (").append(DAOUtils.collectionToString(colOrgansOrigin, ",", "")).append(')').append(EOL);
                }

                sbOrganSelect.append(EOL).append(" union ").append(EOL);
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);
                if (colOrgansOrigin.size() == 1) {
                    sbOrganSelect.append("   where _Organ_key = ").append(colOrgansOrigin.iterator().next()).append(EOL);
                } else if (colOrgansOrigin.size() > 1) {
                    sbOrganSelect.append("   where _Organ_key in (").append(DAOUtils.collectionToString(colOrgansOrigin, ",", "")).append(')').append(EOL);
                }

                if (log.isDebugEnabled()) {
                    log.debug(sbOrganSelect.toString());
                }
                stmtBatch.addBatch(sbOrganSelect.toString());
            }
           
            if ((colTumorClassifications != null) && (colTumorClassifications.size()>0)) {
                sbSelectTFs.append("   and tc._TumorClassification_key in (select _TumorClassification_key from temptc) ").append(EOL);

                StringBuffer sbTCSelect = new StringBuffer();
                sbTCSelect.append("create temporary table temptc as ").append(EOL);
                sbTCSelect.append("select _TumorClassification_key ").append(EOL);
                sbTCSelect.append("  from TumorClassification ").append(EOL);

                if (colTumorClassifications.size() == 1) {
                    sbTCSelect.append("   where _TCParent_key = ").append(colTumorClassifications.iterator().next()).append(EOL);
                } else if (colTumorClassifications.size() > 1) {
                    sbTCSelect.append("   where _TCParent_key in (").append(DAOUtils.collectionToString(colTumorClassifications, ",", "")).append(')').append(EOL);
                }

                sbTCSelect.append(EOL).append(" union ").append(EOL);
                sbTCSelect.append("select _TumorCLassification_key ").append(EOL);
                sbTCSelect.append("  from TumorClassification ").append(EOL);
                if (colTumorClassifications.size() == 1) {
                    sbTCSelect.append("   where _TumorClassification_key = ").append(colTumorClassifications.iterator().next()).append(EOL);
                } else if (colTumorClassifications.size() > 1) {
                    sbTCSelect.append("   where _TumorClassification_key in (").append(DAOUtils.collectionToString(colTumorClassifications, ",", "")).append(')').append(EOL);
                }

                if (log.isDebugEnabled()) {
                    log.debug(sbTCSelect.toString());
                }
                stmtBatch.addBatch(sbTCSelect.toString());
            }


            if (bMustHaveImages) {
                sbSelectTFs.append("   and (select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i where a._Pathology_key = pi._Pathology_key and pi._images_key = i._images_key and i.privateFlag = 0 and a._TumorFrequency_key = tf._TumorFrequency_key) > 0 ").append(EOL);
            }

            if (bRestrictToMetastasis) {
                sbSelectTFs.insert(sbSelectTFs.indexOf("from")+4, " TumorProgression tp, ");
                sbSelectTFs.append("   and tf._TumorFrequency_key = tp._child_key and tp._TumorProgressionType_key = 1  ").append(EOL);

            
            }

            ///////////////////////////////////////////////////////////////////
            // strain name
            ///////////////////////////////////////////////////////////////////
            if (StringUtils.hasValue(strStrainName)) {
              
                sbSelectTFs.insert(sbSelectTFs.indexOf("from")+4, " temp_name ttstrname, ");
                sbSelectTFs.append("and s._Strain_key = ttstrname._Strain_key  ").append(EOL);

                StringBuffer sbNameSelect = new StringBuffer();
                sbNameSelect.append("create temporary table temp_name as ").append(EOL);
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from StrainSynonyms ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", strStrainNameComparison, strStrainName, "'"));
                sbNameSelect.append(EOL).append(" union ").append(EOL);
                sbNameSelect.append("select _Strain_key ").append(EOL);
                sbNameSelect.append("  from Strain ").append(EOL);
                sbNameSelect.append(" where ").append(DAOUtils.formatCondition("name", strStrainNameComparison, strStrainName, "'"));

                if (log.isDebugEnabled()) {
                    log.debug(sbNameSelect.toString());
                }
                stmtBatch.addBatch(sbNameSelect.toString());
            }

            ///////////////////////////////////////////////////////////////////
            // strain types
            ///////////////////////////////////////////////////////////////////
            if ((colStrainTypes != null) && (colStrainTypes.size() != 0)) {
                String types = DAOUtils.collectionToString(colStrainTypes, ", ", "");
                sbSelectTFs.append(" and s._Strain_key in (select distinct _Strain_key from StrainTypeAssoc where _StrainType_key in (").append(types).append(")) ").append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // genetic name
            ///////////////////////////////////////////////////////////////////
            if ((strGeneticName != null) && (strGeneticName.trim().length() > 0)) {
                
                strGeneticName = strGeneticName.toLowerCase();
                sbSelectTFs.insert(sbSelectTFs.indexOf("from")+4, " temp_genetic_name ttgn, ");
                sbSelectTFs.append(" and s._Strain_key = ttgn._Strain_key  ").append(EOL);

                if (log.isDebugEnabled()) {
                    log.debug(String.format(SQL_SEARCH_GENETIC_TEMP,
                                            strGeneticName,strGeneticName,
                                            strGeneticName,strGeneticName,
                                            strGeneticName,strGeneticName));
                }
                stmtBatch.addBatch(String.format(SQL_SEARCH_GENETIC_TEMP,
                                                 strGeneticName,strGeneticName,
                                                 strGeneticName,strGeneticName,
                                                 strGeneticName,strGeneticName));
            }

            sbSelect.append(" order by metastasis, _Parent_key, ot.name, tc.name, oa.name, _tumorfrequency_key, treatmenttype");

            
            log.debug(sbSelectTFs.toString());
            
            stmtBatch.addBatch(sbSelectTFs.toString());

            
            timerTempDAO.start();
            
            log.debug(SQL_ADVANCED_SEARCH_TEMP_MASTER[0]);
            
            stmtBatch.addBatch(SQL_ADVANCED_SEARCH_TEMP_MASTER[0]);
            stmtBatch.executeBatch();
            stmtBatch.addBatch(SQL_ADVANCED_SEARCH_TEMP_MASTER[1]);
            log.debug(SQL_ADVANCED_SEARCH_TEMP_MASTER[1]);
            stmtBatch.executeBatch();
            stmtBatch.addBatch(SQL_ADVANCED_SEARCH_TEMP_MASTER[2]);
            log.debug(SQL_ADVANCED_SEARCH_TEMP_MASTER[2]);
            stmtBatch.executeBatch();
            
            stmtBatch.addBatch(SQL_ADVANCED_SEARCH_TEMP_MASTER[3]);
            log.debug(SQL_ADVANCED_SEARCH_TEMP_MASTER[3]);
            stmtBatch.executeBatch();
            
            stmtBatch.addBatch(SQL_ADVANCED_SEARCH_TEMP_MASTER[4]);
            log.debug(SQL_ADVANCED_SEARCH_TEMP_MASTER[4]);
            stmtBatch.executeBatch();
            
            stmtBatch.addBatch("create index test_master_idx on master (tfkey)");
            
            stmtBatch.executeBatch();
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Batch took: " + timerTempDAO.toString());
            }

            if (log.isDebugEnabled()) {
                log.debug("EXECUTING: " + sbSelect.toString());
            }

            stmtSelect = conn.createStatement();

            timerTempDAO.restart();
            rs = stmtSelect.executeQuery(sbSelect.toString());
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Getting ResultSet took: " + timerTempDAO.toString());
            }

            timerTempDAO.restart();

            MTBStrainTumorDetailsDTO prevTumor = new MTBStrainTumorDetailsDTO();

            while (rs.next()) {
                MTBStrainTumorDetailsDTO currentTumor = new MTBStrainTumorDetailsDTO();
                currentTumor.setTumorFrequencyKey(rs.getInt(1));
                currentTumor.setParentFrequencyKey(rs.getInt(2));
                currentTumor.setImages(rs.getInt(5) > 0);
                currentTumor.setOrganOfOriginKey(rs.getInt(6));
                currentTumor.setOrganOfOriginName(rs.getString(7));
                currentTumor.setTumorClassKey(rs.getInt(8));
                currentTumor.setTumorClassName(rs.getString(9));
                currentTumor.setTumorName(rs.getString(10));
                currentTumor.setStrainKey(rs.getInt(11));
                currentTumor.setStrainName(rs.getString(12));
                currentTumor.setSex(rs.getString(13));
                currentTumor.setFrequency(rs.getString(14));
                currentTumor.setOrganAffectedName(rs.getString(15));
                currentTumor.setTreatmentType(DAOUtils.nvl(rs.getString(17), NONE));
                currentTumor.setRefAccId(rs.getString(21));
                currentTumor.setIncidence(rs.getDouble(22));

                if (prevTumor.getTumorFrequencyKey() == currentTumor.getTumorFrequencyKey()) {
                    MTBStrainTumorDetailsDTO ts = tumors.get(tumors.size() - 1);
                    ts.addAgentKey(rs.getString(18));
                    ts.addAgent(rs.getString(19));
                    ts.addStrainType(rs.getString(20));
                    
                    if(ts.getTreatmentType().indexOf(currentTumor.getTreatmentType()) == -1){
                      ts.setTreatmentType(ts.getTreatmentType()+", "+currentTumor.getTreatmentType());
                    }
                    
                    tumors.set(tumors.size() - 1, ts);
                } else {
                    prevTumor = currentTumor;
                    currentTumor.addAgentKey(rs.getString(18));
                    currentTumor.addAgent(rs.getString(19));
                    currentTumor.addStrainType(rs.getString(20));
                    tumors.add(currentTumor);
                    tumorFrequencyCount++;
                }
            }
        } catch (SQLException sqle) {
            log.error("Error looping through search results.", sqle);
        } finally {
            close(stmtBatch);
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        timerTempDAO.stop();

        if (log.isInfoEnabled()) {
            log.info("Looping through ResultSet took: " + timerTempDAO.toString());
        }

        resultWrapper = configureSearchResults(tumors, strOrderBy, nMaxItems);
        resultWrapper.setAncillaryTotal(tumorFrequencyCount);

        timerDAO.stop();

        if (log.isInfoEnabled()) {
            log.info("Search took: " + timerDAO.toString());
        }

        return resultWrapper;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods

    private SearchResults<MTBStrainTumorSummaryDTO> 
            configureSearchResults(List<MTBStrainTumorDetailsDTO> tumors,
                                   String strOrderBy,
                                   int nMaxItems) {
        SearchResults<MTBStrainTumorSummaryDTO> resultWrapper = 
                new SearchResults<MTBStrainTumorSummaryDTO>();
        Timer timer = new Timer();
        timer.start();

        try {
            Map<String, MTBStrainTumorSummaryDTO> consMetsTumors = consolidateMetastatsis(tumors);
            Map<String, MTBStrainTumorSummaryDTO> consTumors = consolidateTumors(consMetsTumors);
            Collection<MTBStrainTumorSummaryDTO> tums = consTumors.values();
            List<MTBStrainTumorSummaryDTO> rets = new ArrayList<MTBStrainTumorSummaryDTO>();

            int totalItemsFound = tums.size();

            // here is where the magic of sorting and returning the corect number
            // of rows happens
            MTBStrainTumorSummaryDTO tumorArrTemp[] = (MTBStrainTumorSummaryDTO [])tums.toArray(new MTBStrainTumorSummaryDTO[tums.size()]);
            MTBStrainTumorSummaryDTO tumorArr[] = null;

            if ("strainname".equalsIgnoreCase(strOrderBy)) {
                Arrays.sort(tumorArrTemp, new MTBStrainTumorSummaryComparator(MTBAdvancedSearchDAO.ID_STRAIN_NAME));
            } else if ("organ".equalsIgnoreCase(strOrderBy)) {
                Arrays.sort(tumorArrTemp, new MTBStrainTumorSummaryComparator(MTBAdvancedSearchDAO.ID_ORGAN_ORIGIN));
            } else if ("tumorclassification".equalsIgnoreCase(strOrderBy)) {
                Arrays.sort(tumorArrTemp, new MTBStrainTumorSummaryComparator(MTBAdvancedSearchDAO.ID_TUMOR_CLASS));
            } else if ("straintype".equalsIgnoreCase(strOrderBy)) {
                Arrays.sort(tumorArrTemp, new MTBStrainTumorSummaryComparator(MTBAdvancedSearchDAO.ID_STRAIN_TYPE));
            } else if ("treatmenttype".equalsIgnoreCase(strOrderBy)) {
                Arrays.sort(tumorArrTemp, new MTBStrainTumorSummaryComparator(MTBAdvancedSearchDAO.ID_TREATMENT_TYPE));
            }

            if (nMaxItems > 0) {
                tumorArr = new MTBStrainTumorSummaryDTO[Math.min(nMaxItems, tumorArrTemp.length)];
                System.arraycopy(tumorArrTemp, 0, tumorArr, 0, Math.min(nMaxItems, tumorArrTemp.length));
                rets = new ArrayList<MTBStrainTumorSummaryDTO>(Arrays.asList(tumorArr));
            } else {
                rets = new ArrayList<MTBStrainTumorSummaryDTO>(Arrays.asList(tumorArrTemp));
            }
            resultWrapper.setList(rets);
            resultWrapper.setTotal(totalItemsFound);
        } catch (Exception e) {
            log.error("Error constructing search results wrapper.", e);
        }

        return resultWrapper;
    }
}