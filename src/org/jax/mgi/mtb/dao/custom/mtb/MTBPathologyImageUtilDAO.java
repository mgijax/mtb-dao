/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageUtilDAO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.gen.mtb.AgentDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AgentDTO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyDAO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyDTO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyImagesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyImagesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ProbeDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ProbeDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyTreatmentsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyTreatmentsDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.LabelValueBeanComparator;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Image</code>
 * data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageUtilDAO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBPathologyImageUtilDAO  extends MTBUtilDAO {

    private final static String SQL_PATHOLOGY_DETAIL =
        "select distinct i._Images_key, " +
        "       i.url, " +
        "       i.urlPath, " +
        "       i.lowResName, " +
        "       i.mediumResName, " +
        "       pi.caption caption, " +
        "       pi.notes imageNotes, " +
        "       p.ageAtNecropsy, " +
        "       p.description pathologyDescription, " +
        "       p.note pathologyNote, " +
        "       r1._Reference_key, " +
        "       a1.accId, " +
        "       r1.primaryauthor, " +
        "       r1.institution, " +
        "       pi.stain, " +
        "       o1.name organOrigin, " +
        "       tc.name tumorClassName, " +
        "       o2.name organAffected, " +
        "       tf._TumorFrequency_key, " +
        "       sx.sex, " +
        "       tf.colonySize, " +
        "       tf.numMiceAffected, " +
        "       tf.note frequencyNote, " +
        "       tf.ageOnset, " +
        "       tf.ageDetection, " +
        "       tf.incidence, " +
        "       tf.breedingStatus, " +
        "       s._Strain_key, " +
        "       s.name strainName, " +
        "       s.description strainNote, " +
        "       tt._TumorType_key, " +
        "       i.zoomifyPath, " +
        "       p._Pathology_key, " +
        "       r2.primaryauthor pauthor, " +
        "       r2._reference_key imgRefKey, " +
        "       a2.accId imgRefAccId, " +
        "       r3.primaryAuthor pathologist, "+
        "       a3.accId pathAccId, "+
        "       r3._reference_key "+
        "  from Pathology p, " +
        "       PathologyImages pi, " +
        "       Images i, " +
        "       TumorPathologyAssoc tpa, " +
         "      TumorFrequency tf, " +
        "       TumorType tt, " +
        "       TumorClassification tc, " +
        "       Organ o1, " +
        "       Organ o2, " +
        "       Strain s, " +
        "       Sex sx, " +
        "       Reference r1, Accession a1, " +
        "       Reference r2, Accession a2, " +
        "       Reference r3, Accession a3  " +
        " where p._Pathology_key = pi._Pathology_key " +
        "   and pi._Pathology_key = tpa._Pathology_key " +
        "   and i._Images_key = pi._Images_key " +
        "   and i.privateFlag = 0 " +
        "   and tpa._TumorFrequency_key = tf._TumorFrequency_key " +
        "   and tf._TumorType_key= tt._TumorType_key " +
        "   and tc._TumorClassification_key = tt._TumorClassification_key " +
        "   and tt._Organ_key = o1._Organ_key " +
        "   and tf._OrganAffected_key = o2._Organ_key " +
        "   and tf._Strain_key = s._Strain_key " +
        "   and tf._Sex_key = sx._Sex_key " +
        "   and tf._Reference_key = r1._Reference_key "+
        "   and p._Contributor_key = r2._Reference_key " +
        "   and p._pathologist_key = r3._reference_key "+
        "   and a1._MTBTypes_key = 6 " +
        "   and a1._SiteInfo_key = 1 " +
        "   and a2._MTBTypes_key = 6 " +
        "   and a2._SiteInfo_key = 1 " +
        "   and a3._MTBTypes_key = 6 " +
        "   and a3._SiteInfo_key = 1 " +
        "   and r1._reference_key = a1._object_key "+
        "   and r2._reference_key = a2._object_key "+
        "   and r3._reference_key = a3._object_key "+
        "   and pi._Images_key = ? ";

    private final static String SQL_IMAGE_CONTRIBUTORS =
        "select distinct r._Reference_key, " +
        "      r.person || ', ' || r.institution n " +
        "  from Pathology p, " +
        "       PathologyImages pi, " +
        "       Reference r " +
        " where p._Pathology_key = pi._Pathology_key " +
        "   and p._Contributor_key = r._Reference_key " +
        "   and r.person is not null " +
        " order by n ";

    private final static String SQL_TUMOR_CLASSIFICATION_WITH_IMAGES =
        "select distinct tc._TumorClassification_key, " +
        "        tc.name " +
        "  from Pathology p, " +
        "       PathologyImages pi, " +
        "       Images i, " +
        "       TumorPathologyAssoc tpa, " +
        "       TumorFrequency tf, " +
        "       TumorType tt, " +
        "       TumorClassification tc " +
        " where p._Pathology_key = pi._Pathology_key " +
        "   and pi._Pathology_key = tpa._Pathology_key " +
        "   and pi._Images_key = i._Images_key " +
        "   and i.privateFlag = 0 " +
        "   and tpa._TumorFrequency_key = tf._TumorFrequency_key " +
        "   and tf._TumorType_key = tt._TumorType_key " +
        "   and tt._TumorClassification_key = tc._TumorClassification_key " +
        "order by tc.name ";

    private final static String SQL_ORGANS_AFFECTED_WITH_IMAGES =
        "select distinct o._Organ_key, " +
        "       o.name, " +
        "       as.name "+
        "  from Organ o, " +
        "       Pathology p, " +
        "       PathologyImages pi, " +
        "       TumorPathologyAssoc tpa, " +
        "       TumorFrequency tf, " +
        "       AnatomicalSystem a "+
        " where p._Pathology_key = pi._Pathology_key " +
        "   and pi._Pathology_key = tpa._Pathology_key " +
        "   and i.privateFlag = 0 " +
        "   and tpa._TumorFrequency_key = tf._TumorFrequency_key " +
        "   and tf._OrganAffected_key = o._Organ_key " +
        "   and o._anatomicalsystem_key = a._anatomicalsystem_key "+
        " order by o.name ";

    private final static String SQL_ORGANS_ORIGIN_WITH_IMAGES =
        "select distinct o._Organ_key, " +
        "       o.name, " +
        "       a.name " +
        "  from Pathology p, " +
        "       PathologyImages pi, " +
        "       Images i, " +
        "       TumorPathologyAssoc tpa, " +
        "       TumorFrequency tf, " +
        "       TumorType tt, " +
        "       Organ o, " +
        "       AnatomicalSystem a "+
        " where p._Pathology_key = pi._Pathology_key " +
        "   and pi._Pathology_key = tpa._Pathology_key " +
        "   and pi._Images_key = i._Images_key " +
        "   and i.privateFlag = 0 " +
        "   and tpa._TumorFrequency_key = tf._TumorFrequency_key " +
        "   and tf._TumorType_key = tt._TumorType_key " +
        "   and tt._Organ_key = o._Organ_key " +
       "   and o._anatomicalsystem_key = a._anatomicalsystem_key "+     
        " order by o.name ";

    // -------------------------------------------------------------- Constants

    public static final int ID_ORGAN = 0;
    public static final int ID_STRAIN = 1;
    public static final int ID_METHOD = 2;
    public static final int ID_ANTIBODY = 3;

    // ----------------------------------------------------- Instance Variables

    private static MTBPathologyImageUtilDAO singleton =
            new MTBPathologyImageUtilDAO();
    private final static Logger log =
            Logger.getLogger(MTBPathologyImageUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBPathologyImageUtilDAO
     */
    private MTBPathologyImageUtilDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBPathologyImageUtilDAO singleton.
     *
     * @return MTBPathologyImageUtilDAO
     */
    public static MTBPathologyImageUtilDAO getInstance() {
        return singleton;
    }

    /**
     * Get a pathology image detail record for the images key.
     *
     * @param lImagesKey the image key
     * @return a MTBPathologyImageDetailDTO object
     */
     public MTBPathologyImageDetailDTO getPathology(long lImagesKey) {
        MTBPathologyImageDetailDTO detail = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_PATHOLOGY_DETAIL);
            pstmt.setLong(1, lImagesKey);
            rs = pstmt.executeQuery();
            long lPathKey = -1l;

            while (rs.next()) {
                detail = new MTBPathologyImageDetailDTO();
                lPathKey = rs.getLong(33);

               
                
                detail.setImgRefKey(rs.getInt(35));
                detail.setImgRefAccId(rs.getString(36));
                
                detail.setPathologist(rs.getString(37));
                detail.setPathologistAccId(rs.getString(38));
                detail.setPathologistRefKey(rs.getString(39));

            
                detail.setImageKey(rs.getInt(1));
                detail.setImageUrl(rs.getString(2));
                detail.setImageUrlPath(rs.getString(3));
                detail.setImageThumbName(rs.getString(4));
                detail.setImageName(rs.getString(5));
                detail.setZoomifyDir(rs.getString(32));
                detail.setCaption(rs.getString(6));
                detail.setImageNote(rs.getString(7));
                detail.setAgeAtNecropsy(rs.getString(8));
                detail.setPathologyDescription(rs.getString(9));
                detail.setPathologyNote(rs.getString(10));
                
                //contributor author
                detail.setSourceOfImage(rs.getString(34));
                detail.setInstitution(rs.getString(14));
                detail.setMethod(rs.getString(15));
                if((detail.getMethod() != null)&&
                  (detail.getMethod().length() < 2)){
                  detail.setMethod(null);
                }

                // frequency information
                detail.setReferenceKey(rs.getString(11));
                detail.setAccessionId(rs.getString(12));
                detail.setTumorFrequencyKey(rs.getInt(19));
                detail.setSex(rs.getString(20));
                detail.setColonySize(rs.getString(21));
                detail.setNumMiceAffected(rs.getString(22));
                detail.setFrequencyNote(rs.getString(23));
                detail.setAgeOfOnset(rs.getString(24));
                detail.setAgeOfDetection(rs.getString(25));
                detail.setFrequency(rs.getString(26));

                // tumor information
                detail.setOrganOrigin(rs.getString(16));
                detail.setTumorClassName(rs.getString(17));
                detail.setOrganAffected(rs.getString(18));
                detail.setReproductiveStatus(rs.getString(27));
                detail.setTumorTypeKey(rs.getInt(31));
                
                
                
             
                // tumor synomyms
                try {
                    TumorFrequencySynonymsDAO tumorSynonymsDAO = TumorFrequencySynonymsDAO.getInstance();
                    List<TumorFrequencySynonymsDTO> tumorSynonymsArr = tumorSynonymsDAO.loadByTumorFrequencyKey(new Long(detail.getTumorFrequencyKey()));
                    detail.setTumorSynonyms(new ArrayList<TumorFrequencySynonymsDTO>(tumorSynonymsArr));
                } catch (Exception e) {
                    log.error("Error retrieving tumor synonyms for tfKey " +
                              detail.getTumorFrequencyKey(), e);
                }

                // tumor frequency treatments
                try {
                    TumorFrequencyTreatmentsDAO tftDAO = TumorFrequencyTreatmentsDAO.getInstance();
                    List<TumorFrequencyTreatmentsDTO> tftArr = tftDAO.loadByTumorFrequencyKey(new Long(detail.getTumorFrequencyKey()));
                    List<AgentDTO> agents = new ArrayList<AgentDTO>();

                    for (TumorFrequencyTreatmentsDTO dtoTF : tftArr) {
                        AgentDTO dto = tftDAO.getAgentDTO(dtoTF);
                        agents.add(dto);
                    }

                    detail.setAgents(agents);

                    if (agents.size() > 0) {
                        AgentDAO agentDAO = AgentDAO.getInstance();
                        AgentDTO dto = agents.get(0);
                        detail.setTreatmentType(DAOUtils.nvl(agentDAO.getAgentTypeDTO(dto).getName(), NONE));
                    } else {
                        detail.setTreatmentType(NONE);
                    }
                } catch (Exception e) {
                    log.error("Error retrieving tumor treatments for tfKey " +
                              detail.getTumorFrequencyKey(), e);
                }

                // retrive the TEXT columns
                // the reason for this is because the data was being truncated
                PathologyDAO daoPath = PathologyDAO.getInstance();
                PathologyImagesDAO daoPathImages = PathologyImagesDAO.getInstance();
                PathologyDTO dtoPath = daoPath.loadByPrimaryKey(lPathKey);
                PathologyImagesDTO dtoPathImages = daoPathImages.loadByPrimaryKey(lImagesKey, lPathKey);
                detail.setPathologyDescription(dtoPath.getDescription());
                detail.setPathologyNote(dtoPath.getNote());
                detail.setCaption(dtoPathImages.getCaption());
                detail.setImageNote(dtoPathImages.getNotes());
                
                if(dtoPathImages.getCopyright() != null && 
                        dtoPathImages.getCopyright().length() >2){
                  detail.setCopyright(dtoPathImages.getCopyright());
                }
                
                if(dtoPathImages.getCopyright()!=null && dtoPathImages.getCopyright().length()>1)
                {
                   detail.setCopyright(dtoPathImages.getCopyright());
                }

                // strain information
                detail.setStrainKey(rs.getInt(28));
                detail.setStrainName(rs.getString(29));
                detail.setStrainNote(rs.getString(30));

                // get the strain types
                StrainDAO strainDAO = StrainDAO.getInstance();
                StrainDTO strainDTO = strainDAO.createStrainDTO();
                strainDTO.setStrainKey(detail.getStrainKey());
                List<StrainTypeDTO> listStrainTypes = strainDAO.loadStrainTypeViaStrainTypeAssoc(strainDTO);
                detail.setStrainTypes(new ArrayList<StrainTypeDTO>(listStrainTypes));
               
                // get the associated strain synonyms
                StrainSynonymsDAO strainSynonymsDAO = StrainSynonymsDAO.getInstance();
                List <StrainSynonymsDTO> listSynonym = strainSynonymsDAO.loadByStrainKey(new Long(detail.getStrainKey()));
                detail.setStrainSynonyms(new ArrayList<StrainSynonymsDTO>(listSynonym));
                
                // get the image probes
                ProbeDAO probeDAO = ProbeDAO.getInstance();
                StringBuffer sql = new StringBuffer();
                sql.append("where _probe_key in ");
                sql.append("(select _probe_key from PathologyImagesProbes");
                sql.append(" where _pathology_key = ");
                sql.append(lPathKey);
                sql.append(" and _images_key =");
                sql.append(lImagesKey);
                sql.append(")");
                List<ProbeDTO> listProbes = probeDAO.loadByWhere(sql.toString());
              
                detail.setProbes(listProbes);
                
            }
        } catch (SQLException sqle) {
            log.error("Error getting pathology data for key = " + lImagesKey,
                      sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        return detail;
    }

    /**
     * Get all the image contributors.
     *
     * @return a List of LabelValueBeans that contain image contributors
     */
    public List<LabelValueBean<String,Long>> getImageContributors() {
        List<LabelValueBean<String,Long>> listContributors = 
                new ArrayList<LabelValueBean<String,Long>>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_IMAGE_CONTRIBUTORS);
                       
            while (rs.next()) {
                LabelValueBean<String,Long> bean = 
                        new LabelValueBean<String,Long>(rs.getString(2),
                                                        rs.getLong(1));
                listContributors.add(bean);
            }
        } catch (SQLException sqle) {
            log.error("Error getting image contributors.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return listContributors;
    }

    /**
     * Get all the tumor classifications that have images.
     *
     * @return a List of LabelValueBeans of tumor classifications
     */
    public List<LabelValueBean<String,Long>> getTumorClassificationsWithImages() {
        List<LabelValueBean<String,Long>> listTC = new ArrayList<LabelValueBean<String,Long>>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_TUMOR_CLASSIFICATION_WITH_IMAGES);

            while (rs.next()) {
                LabelValueBean<String,Long> tc = new LabelValueBean<String,Long>(rs.getString(2),
                                                       rs.getLong(1));
                listTC.add(tc);
            }
        } catch (SQLException sqle) {
            log.error("Error tumor classifications with images.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return listTC;
    }

    /**
     * Get all the affected organs that have images.
     *
     * @return a List of LabelValueBeans of organs
     */
    public List<LabelValueBean<String,Long>> getOrgansAffectedWithImages() {

        return getOrgans(SQL_ORGANS_AFFECTED_WITH_IMAGES);

    }

    /**
     * Get all the organs of origin that have images.
     *
     * @return a List of LabelValueBeans of organs
     */
    public List<LabelValueBean<String,Long>> getOrgansOfOriginWithImages() {
       
        return getOrgans(SQL_ORGANS_ORIGIN_WITH_IMAGES);

    }
    
    
    private List<LabelValueBean<String,Long>> getOrgans(String sql){
        
        List<LabelValueBean<String,Long>> listOrgans = new ArrayList<LabelValueBean<String,Long>>();
      
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            String name = "";
            while (rs.next()) {
                name = rs.getString(2);
                if(name.equals("(Unspecified organ)")){
                    name = rs.getString(3) +" - "+rs.getString(2);
                }
                LabelValueBean<String,Long> bean = new LabelValueBean<String,Long>(name,
                                                         rs.getLong(1));
                listOrgans.add( bean);
            }
            
           Collections.sort(listOrgans,new LabelValueBeanComparator(LabelValueBeanComparator.TYPE_LABEL));
            
        } catch (SQLException sqle) {
            log.error("Error getting organs affected with images.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }


        return listOrgans;
    }
        
    

    /**
     * Get a list of all the stains/listMethods used.
     * 
     * @return a List of LabelValueBeans of stains/listMethods
     */
    public List<LabelValueBean<String,String>> getMethods() {
        List<LabelValueBean<String,String>> listMethods = new ArrayList<LabelValueBean<String,String>>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmtSelect = null;

        Timer t = new Timer();
        t.start();

        try {
            conn = getConnection();
            stmtSelect = conn.createStatement();
            rs = stmtSelect.executeQuery("select distinct stain from PathologyImages where stain is not null order by stain");

            while (rs.next()) {
                LabelValueBean method = 
                        new LabelValueBean<String,String>(rs.getString(1),
                                                          rs.getString(1));
                listMethods.add(method);
            }
        } catch (SQLException sqle) {
            log.error("Error getting methods.", sqle);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        return listMethods;
    }
    
   // called by faceted search
      public SearchResults<MTBPathologyImageSearchDTO> searchPathologyByTF(String tfKeys)
        throws NullPointerException, IllegalArgumentException, DAOException {
          
          return searchPathologyExtended(null,
                                            null,
                                            -1,
                                            null,
                                            null,
                                            null,
                                            null,
                                            -1,
                                            tfKeys,
                                            "strain",
                                            -1);
      }
    
    // called by WI
      // for backwards compatability add null tfKeys as a parameter then call extended search
       public SearchResults<MTBPathologyImageSearchDTO> searchPathology(Collection organTissuesOrigin,
                                            Collection tumorClassifications,
                                            int organTissuesAffected,
                                            String imagePathologyDescription,
                                            String method,
                                            Collection antibodies,
                                            Collection contributors,
                                            int referenceKey,
                                            String orderBy,
                                            int maxItems)
        throws NullPointerException, IllegalArgumentException, DAOException {
       
           return  searchPathologyExtended(organTissuesOrigin,
                                            tumorClassifications,
                                            organTissuesAffected,
                                            imagePathologyDescription,
                                            method,
                                            antibodies,
                                            contributors,
                                            referenceKey,
                                            null,
                                            orderBy,
                                            maxItems);
       
       }
      
     private  SearchResults<MTBPathologyImageSearchDTO> searchPathologyExtended(Collection organTissuesOrigin,
                                            Collection tumorClassifications,
                                            int organTissuesAffected,
                                            String imagePathologyDescription,
                                            String method,
                                            Collection antibodies,
                                            Collection contributors,
                                            int referenceKey,
                                            String tfKeys,
                                            String orderBy,
                                            int maxItems)
        throws NullPointerException, IllegalArgumentException, DAOException {

        Connection conn = null;
        ResultSet rs = null;
        Statement stmtSelect = null;
        List<MTBPathologyImageSearchDTO> path = new ArrayList<MTBPathologyImageSearchDTO>();
        int loops = 0;
        int added = 0;
        
        HashMap<Integer,Integer> uniqueImages = new HashMap<Integer,Integer>();

        String joinType = " join ";
         // antibodies
            if ((antibodies == null) || (antibodies.isEmpty())) {
                joinType = " left join ";
                 
            }


        try {
            conn = getConnection();
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select o1.name organOrigin, ").append(EOL);
            sbSelect.append("       tc.name tumorClassName, ").append(EOL);
            sbSelect.append("       o2.name organAffected, ").append(EOL);
            sbSelect.append("       s.name strainName, ").append(EOL);
            sbSelect.append("       s._Strain_key, ").append(EOL);
            sbSelect.append("       tf.colonySize, ").append(EOL);
            sbSelect.append("       tf.numMiceAffected, ").append(EOL);
            sbSelect.append("       tf.note frequencyNote, ").append(EOL);
            sbSelect.append("       p.ageAtNecropsy, ").append(EOL);
            sbSelect.append("       p.description, ").append(EOL); 
            sbSelect.append("       pi._Images_key, ").append(EOL);
            sbSelect.append("       pi.caption, ").append(EOL); 
            sbSelect.append("       rContrib.primaryauthor as sourceOfImage, ").append(EOL);
            sbSelect.append("       rContrib.institution as institution, ").append(EOL);
            sbSelect.append("       pi.stain, ").append(EOL);
            sbSelect.append("       tf._TumorFrequency_key, ").append(EOL);
            sbSelect.append("       tf.incidence, ").append(EOL);
            sbSelect.append("       tf.breedingStatus, ").append(EOL); 
            sbSelect.append("       sx.sex, ").append(EOL); 
            sbSelect.append("       i.url, ").append(EOL); 
            sbSelect.append("       i.urlPath, ").append(EOL);
            sbSelect.append("       i.lowResName, ").append(EOL);
            sbSelect.append("       i.mediumResName, ").append(EOL);
            sbSelect.append("       tft._TumorFrequencyTreatments_key, ").append(EOL);
            sbSelect.append("       a.name agentName, ").append(EOL);
            sbSelect.append("       ay.name treatmentType, ").append(EOL);
            sbSelect.append("       rPath.primaryauthor as pathologist, ").append(EOL);
           sbSelect.append("        acc.accID ").append(EOL);
            sbSelect.append("  from Pathology p, ").append(EOL);
            sbSelect.append("       PathologyImages pi "+joinType+" PathologyImagesProbes pip ").append(EOL);
            sbSelect.append("               on (pi._Images_key = pip._Images_key and pi._Pathology_key = pip._Pathology_key " ).append(EOL);
            
            
             // antibodies
            if ((antibodies != null) && (!antibodies.isEmpty())) {
                if (antibodies.size() == 1) {
                    sbSelect.append(" and pip._Probe_key = ").append(antibodies.iterator().next()).append(EOL);
                } else {
                    sbSelect.append(" and pip._Probe_key in (").append(DAOUtils.collectionToString(antibodies, ",", "")).append(") ").append(EOL);
                }
            }
            
             if (StringUtils.hasValue(method)) {
               sbSelect.append (" and pi.stain = '").append(method).append("' ").append(EOL);
            }
                    
            sbSelect.append(" ),").append(EOL);
            sbSelect.append("       Images i, ").append(EOL);
            sbSelect.append("       TumorPathologyAssoc tpa, ").append(EOL);
            sbSelect.append("        TumorFrequency tf left join ").append(EOL);
            sbSelect.append("       (TumorFrequencyTreatments tft left join Agent a on ( tft._Agent_key = a._Agent_key ) ").append(EOL);
	      sbSelect.append("               left join AgentType ay on ( a._AgentType_key = ay._AgentType_key )) ");
            sbSelect.append("               on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), ");
            sbSelect.append("       TumorType tt, ").append(EOL);
            sbSelect.append("       TumorClassification tc, ").append(EOL);
            sbSelect.append("       Organ o1, ").append(EOL);
            sbSelect.append("       Organ o2, ").append(EOL);
            sbSelect.append("       Sex sx, ").append(EOL);
            sbSelect.append("       Strain s, ").append(EOL);
            sbSelect.append("       Reference rContrib, ").append(EOL);
            sbSelect.append("       Reference rPath, ").append(EOL);
            sbSelect.append("      Accession acc ").append(EOL);
            sbSelect.append(" where o1._Organ_key = tt._Organ_key ").append(EOL);
            sbSelect.append("   and tt._TumorType_key = tf._TumorType_key ").append(EOL);
            sbSelect.append("   and tf._Strain_key = s._Strain_key ").append(EOL);
            sbSelect.append("   and p._Pathology_key = pi._Pathology_key ").append(EOL);
            sbSelect.append("   and pi._Pathology_key = tpa._Pathology_key ").append(EOL);
            sbSelect.append("   and pi._Images_key = i._Images_key ").append(EOL);
            sbSelect.append("   and i.privateFlag = 0 ").append(EOL);
            sbSelect.append("   and tpa._TumorFrequency_key = tf._TumorFrequency_key ").append(EOL);
            sbSelect.append("   and o2._organ_key = tf._organaffected_key ").append(EOL);
            sbSelect.append("   and tc._TumorClassification_key = tt._TumorClassification_key ").append(EOL);
            sbSelect.append("   and tt._Organ_key = o1._Organ_key ").append(EOL);
            sbSelect.append("   and rPath._Reference_key = p._pathologist_key ").append(EOL); 
            sbSelect.append("   and rContrib._Reference_key = p._Contributor_key").append(EOL);
            sbSelect .append("  and tf._reference_key = acc._object_key and acc._siteinfo_key = 1 and acc._mtbtypes_key = 6 ").append(EOL);
            sbSelect.append("   and tf._Sex_key = sx._Sex_key ").append(EOL);

            // organs and tissues of origin
            if ((organTissuesOrigin != null) && (!organTissuesOrigin.isEmpty())) {
                sbSelect.append("  and ( o1._Organ_key in (").append(DAOUtils.collectionToString(organTissuesOrigin, ",", "")).append(") ").append(EOL);
                sbSelect.append("  or o1._OrganParent_key in (").append(DAOUtils.collectionToString(organTissuesOrigin, ",", "")).append(") ) ").append(EOL);
            }

            // tumor classifications
            if ((tumorClassifications != null) && (!tumorClassifications.isEmpty())) {
                sbSelect.append(" and ( tc._TumorClassification_key in (").append(DAOUtils.collectionToString(tumorClassifications, ",", "")).append(") ").append(EOL);
                sbSelect.append(" or tc._TCParent_key in (").append(DAOUtils.collectionToString(tumorClassifications, ",", "")).append(") ) ").append(EOL);
            }

            // affected organ
            if (organTissuesAffected != -1) {
                sbSelect.append(" and o2._Organ_key = ").append(organTissuesAffected).append(' ').append(EOL);
               
            }

            // imagePathologyDescription
            StringBuffer description = new StringBuffer();

            description.append(DAOUtils.formatCondition("p.note", "contains", imagePathologyDescription, "'"));
            description.append(DAOUtils.formatCondition(" or p.description", "contains", imagePathologyDescription, "'"));
            description.append(DAOUtils.formatCondition(" or pi.caption ", "contains", imagePathologyDescription, "'"));

            if (description.length() > 0) {
                sbSelect.append(" and ( ").append(EOL);
                sbSelect.append(description);
                sbSelect.append(EOL).append(" ) ").append(EOL);
            }

  
            // contributors
            if ((contributors != null) && (!contributors.isEmpty())) {
                sbSelect.append(" and p._Contributor_key in (").append(DAOUtils.collectionToString(contributors, ",", "")).append(") ").append(EOL);
            }

            // reference
            if (referenceKey > 0) {
                // create a temp table
                sbSelect.append("and p._Pathology_key = temp_pathology._Pathology_key  ").append(EOL);
                
               sbSelect.insert(sbSelect.indexOf("where" )-1,", temp_pathology");

                StringBuffer sbPath  = new StringBuffer();
                sbPath.append("create temporary table temp_pathology as ");
                sbPath.append("select p._Pathology_key ").append(EOL);
                sbPath.append("  from Pathology p, ").append(EOL);
                sbPath.append("       PathologyImages pi, ").append(EOL);
                sbPath.append("       Images i ").append(EOL);
                sbPath.append(" where p._Pathology_key = pi._Pathology_key ").append(EOL);
                sbPath.append("   and i._images_key = pi._images_key ").append(EOL);
                sbPath.append("   and i.privateFlag = 0 ").append(EOL);
                sbPath.append("   and p._Pathologist_key = ");
                sbPath.append(referenceKey);
                sbPath.append(EOL).append(" union ").append(EOL);
                sbPath.append("select p._Pathology_key ").append(EOL);
                sbPath.append("  from Pathology p, ").append(EOL);
                sbPath.append("       PathologyImages pi, ").append(EOL);
                sbPath.append("       Images i ").append(EOL);
                sbPath.append(" where p._Pathology_key = pi._Pathology_key ").append(EOL);
                sbPath.append("   and i._images_key = pi._images_key ").append(EOL);
                sbPath.append("   and i.privateFlag = 0 ").append(EOL);
                sbPath.append("   and p._Contributor_key = ");
                sbPath.append(referenceKey);

                Statement stmtTemp = conn.createStatement();
                stmtTemp.executeUpdate(sbPath.toString());
                getManager().close(stmtTemp);
            }
            
            // if we have tfKeys (from faceted search just show those images)
            if(tfKeys != null){
                sbSelect.append(" and tf._tumorfrequency_key in (").append(tfKeys).append(")");
            }
            
            sbSelect.append(" order by tf._TumorFrequency_key ").append(EOL);

            
           
            log.debug(sbSelect.toString());
            

            stmtSelect = conn.createStatement();

            

            rs = stmtSelect.executeQuery(sbSelect.toString());

            List<MTBPathologyImageHelperDTO> images = new ArrayList<MTBPathologyImageHelperDTO>();

            MTBPathologyImageSearchDTO prevPathology = new MTBPathologyImageSearchDTO();

            boolean add = true;
            
            while (rs.next()) {
                loops++;
                MTBPathologyImageSearchDTO currentPathology = new MTBPathologyImageSearchDTO();
                int currentImageId = 0;

                currentPathology.setOrganOriginName(rs.getString(1));
                currentPathology.setTumorClassName(rs.getString(2));
                currentPathology.setOrganAffectedName(rs.getString(3));
                currentPathology.setStrainName(rs.getString(4));
                currentPathology.setStrainKey(rs.getInt(5));
                currentPathology.setColonySize(Integer.parseInt(DAOUtils.nvl(rs.getString(6), "-1")));
                currentPathology.setNumMiceAffected(Integer.parseInt(DAOUtils.nvl(rs.getString(7), "-1")));
                currentPathology.setFrequencyNote(rs.getString(8));
                currentPathology.setAgeAtNecropsy(rs.getString(9));
                currentPathology.setNote(rs.getString(10));
                currentPathology.setStainMethod(rs.getString(15));
                currentPathology.setTumorFrequencyKey(rs.getInt(16));
                currentPathology.setFrequency(rs.getString(17));
                currentPathology.setReproductiveStatus(rs.getString(18));
                currentPathology.setStrainSex(rs.getString(19));
                currentPathology.setTreatmentType(DAOUtils.nvl(rs.getString(26), NONE));
                currentPathology.setAccID(rs.getString(28));
                currentImageId = rs.getInt(11);
                uniqueImages.put(new Integer(currentImageId), new Integer(currentImageId));
             

                MTBPathologyImageHelperDTO helper = new MTBPathologyImageHelperDTO();
                helper.setImageId(currentImageId);
                helper.setImageCaption(rs.getString(12));
                helper.setSourceOfImage(rs.getString(13));
                helper.setPathologist(rs.getString(27));
                helper.setInstitution(rs.getString(14));
                helper.setStainMethod(rs.getString(15));
                helper.setImageUrl(rs.getString(20));
                helper.setImageUrlPath(rs.getString(21));
                helper.setImageThumbName(rs.getString(22));
                helper.setImageName(rs.getString(23));

                String agentName = rs.getString(25);

                images = new ArrayList<MTBPathologyImageHelperDTO>();
                images.add(helper);
                currentPathology.setImages(images);

                if (currentPathology.getTumorFrequencyKey() != prevPathology.getTumorFrequencyKey()) {
                    prevPathology = currentPathology;
                    path.add(currentPathology);
                    added++;
                } else {
                    MTBPathologyImageSearchDTO p = path.get(path.size() - 1);

                    Collection<MTBPathologyImageHelperDTO> c = p.getImages();

                    if (c == null) {
                        c = new ArrayList<MTBPathologyImageHelperDTO>();
                    }
                    // exclude duplicate images
                    // can result from multiple probes etc.
                    add = true;
                    
                    for(MTBPathologyImageHelperDTO pihDTO : c){
                      if(pihDTO.getImageId() == helper.getImageId()){
                        add = false;
                      }
                    }
                    if(add){
                      c.add(helper);
                    }

                    p.setImages(c);

                    Collection<String> c2 = p.getAgents();

                    if (c2 == null) {
                        c2 = new ArrayList<String>();
                    }

                    if ((agentName != null) && (agentName.trim().length() > 0) && (!c2.contains(agentName))) {
                        c2.add(agentName);
                    }

                    p.setAgents(c2);

                    path.set(path.size() - 1, p);
                }
            }

           
        } catch (SQLException sqle) {
            log.error("Error searching for pathology.", sqle);
            throw new DAOException(sqle);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        SearchResults<MTBPathologyImageSearchDTO> res = 
                new SearchResults<MTBPathologyImageSearchDTO>();
        res.setAncillaryTotal(uniqueImages.size());
        res.setAncillarySize(loops);
        res.setTotal(added);

        // here is where the magic of sorting and returning the corect number
        // of rows happens
        MTBPathologyImageSearchDTO pathArrTemp[] = (MTBPathologyImageSearchDTO [])path.toArray(new MTBPathologyImageSearchDTO[path.size()]);
        MTBPathologyImageSearchDTO pathArr[] = null;

        orderBy = DAOUtils.nvl(orderBy, "organ");

        if ("organ".equalsIgnoreCase(orderBy)) {
            //debug("ordering by organ");
            Arrays.sort(pathArrTemp, new MTBPathologyImageSearchComparator(MTBPathologyImageUtilDAO.ID_ORGAN));
        } else if ("strain".equalsIgnoreCase(orderBy)) {
            //debug("ordering by strain");
            Arrays.sort(pathArrTemp, new MTBPathologyImageSearchComparator(MTBPathologyImageUtilDAO.ID_STRAIN));
        } else if ("method".equalsIgnoreCase(orderBy)) {
            //debug("ordering by method");
            Arrays.sort(pathArrTemp, new MTBPathologyImageSearchComparator(MTBPathologyImageUtilDAO.ID_METHOD));
        } else if ("antibody".equalsIgnoreCase(orderBy)) {
            //debug("ordering by antibody");
            Arrays.sort(pathArrTemp, new MTBPathologyImageSearchComparator(MTBPathologyImageUtilDAO.ID_ANTIBODY));
        }

        if (maxItems > 0) {
            //debug("limiting matching items");
            pathArr = new MTBPathologyImageSearchDTO[Math.min(maxItems, pathArrTemp.length)];
            System.arraycopy(pathArrTemp, 0, pathArr, 0, Math.min(maxItems, pathArrTemp.length));
            path = new ArrayList<MTBPathologyImageSearchDTO>(Arrays.asList(pathArr));

            int images = 0;
            for (int i = path.size(); --i >= 0; ) {
                images += ((MTBPathologyImageSearchDTO)path.get(i)).getImages().size();
            }
            res.setAncillaryTotal(images);
        } else {
            //debug("NOT limiting matching items");
            path = new ArrayList<MTBPathologyImageSearchDTO>(Arrays.asList(pathArrTemp));
        }

        res.setList(new ArrayList<MTBPathologyImageSearchDTO>(path));
        //debug("Pathology image search total: " + t.toString());
        return res;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
