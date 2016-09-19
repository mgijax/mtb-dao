 /**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBAssayImageUtilDAO.java,v 1.1 2008/11/04 
 * Author: sbn
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.gen.mtb.AgentDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AgentDTO;

import org.jax.mgi.mtb.dao.gen.mtb.StrainDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TmrGntcCngAssayImageAssocDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TmrGntcCngAssayImageAssocDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyTreatmentsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyTreatmentsDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Assay Image</code>
 * data and related information.
 *
 * @author sbn
 * @date 2008/11/04 
 * @version 1.0
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBAssayImageUtilDAO.java
 */
public class MTBAssayImageUtilDAO extends MTBUtilDAO  {

    private final static String SQL_ASSAYIMAGE_DETAIL =
        "select ai._assayimages_key aiKey, " +
        "       ai.lowResName lowRes, " +
        "       ai.HighResName highRes, " +
        "       ai.caption capt, " +
        "       ai.copyright copyr, " +
        "       r2._Reference_key tfRefKey, " +
        "       a2.accId tfAccId, " +
        "       o1.name organOrigin, " +
        "       tc.name tumorClassName, " +
        "       o2.name organAffected, " +
        "       tf._TumorFrequency_key tfKey, " +
        "       sx.sex sex, " +
        "       tf.colonySize cSize, " +
        "       tf.numMiceAffected numMice, " +
        "       tf.note tfNote, " +
        "       tf.ageOnset ageO, " +
        "       tf.ageDetection ageD, " +
        "       tf.incidence inci, " +
        "       tf.breedingStatus bStatus, " +
        "       s._Strain_key sKey, " +
        "       s.name strainName, " +
        "       s.description strainNote, " +
        "       tt._TumorType_key ttKey, " +
        "       r1.primaryAuthor pAuthor, " +
        "       r1.institution inst, " +
        "       a1.accId imgRefAccId, " +
        "       r1._reference_key imgRefKey" +
       
        "  from AssayImages ai, " +
        "       TmrGntcCngAssayImageAssoc tgcaIa, " +
        "       TumorGeneticChanges tgc, " +
        "       TumorFrequency tf, Reference r2, Accession a2, " +
        "       TumorType tt, " +
        "       TumorClassification tc, " +
        "       Organ o1, " +
        "       Organ o2, " +
        "       Strain s, " +
        "       Sex sx, " +
        "       Reference r1, Accession a1 " +
        " where ai._assayImages_key = tgcaIa._assayImages_key " +
        "   and tgcaIa._tumorgeneticchanges_key = tgc._tumorgeneticchanges_key " +
        "   and tgc._TumorFrequency_key = tf._TumorFrequency_key " +
        "   and tf._TumorType_key= tt._TumorType_key " +
        "   and tc._TumorClassification_key = tt._TumorClassification_key " +
        "   and tt._Organ_key = o1._Organ_key " +
        "   and tf._OrganAffected_key = o2._Organ_key " +
        "   and tf._Strain_key = s._Strain_key " +
        "   and tf._Sex_key = sx._Sex_key " +
        "   and ai._reference_key = r1._Reference_key " +
        "   and tf._Reference_key = r2._Reference_key " +
        "   and r2._Reference_key = a2._Object_key " +
        "   and r1._reference_key = a1._object_key " +
        "   and a1._MTBTypes_key = 6 " +
        "   and a1._SiteInfo_key = 1 " +
        "   and a2._MTBTypes_key = 6 " +
        "   and a2._SiteInfo_key = 1 " +
        "   and ai.privateFlag = 0 "+
        "   and ai._assayimages_key = ? ";

 
   

    // ----------------------------------------------------- Instance Variables

 
    private final static Logger log =
            Logger.getLogger(MTBAssayImageUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors

   

   public MTBAssayImageUtilDAO(){
     super();
   }

    /**
     * Get an pathology image detail record for the assay images key.
     * Pathology image detail dto is used for assay image data
     * @param lImagesKey the image key
     * @return a MTBPathologyImageDetailDTO object
     */
     public MTBPathologyImageDetailDTO getAssayImage(long lImagesKey) {
        MTBPathologyImageDetailDTO detail = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSAYIMAGE_DETAIL);
            pstmt.setLong(1, lImagesKey);
            rs = pstmt.executeQuery();
          
            while (rs.next()) {
                detail = new MTBPathologyImageDetailDTO();
               
                // image information
                detail.setImageKey(rs.getInt("aiKey"));
               
                detail.setImageThumbName(rs.getString("lowRes"));
                detail.setImageName(rs.getString("highRes"));
               
                 //empty text fields come back as a single space
                detail.setCaption(rs.getString("capt"));
                if(detail.getCaption().length() < 2){
                  detail.setCaption(null);
                }
                detail.setCopyright(rs.getString("copyr"));
                if(detail.getCopyright().length()< 2){
                  detail.setCopyright(null);
                }
               
                detail.setSourceOfImage(rs.getString("pAuthor"));
                detail.setInstitution(rs.getString("inst"));
           
                // frequency information
                detail.setReferenceKey(rs.getString("tfRefKey"));
                detail.setAccessionId(rs.getString("tfAccId"));
                detail.setTumorFrequencyKey(rs.getInt("tfKey"));
                detail.setSex(rs.getString("sex"));
                detail.setColonySize(rs.getString("cSize"));
                detail.setNumMiceAffected(rs.getString("numMice"));
                detail.setFrequencyNote(rs.getString("tfNote"));
                detail.setAgeOfOnset(rs.getString("ageO"));
                detail.setAgeOfDetection(rs.getString("ageD"));
                detail.setFrequency(rs.getString("inci"));

                // tumor information
                detail.setOrganOrigin(rs.getString("organOrigin"));
                detail.setTumorClassName(rs.getString("tumorClassName"));
                detail.setOrganAffected(rs.getString("organAffected"));
                detail.setReproductiveStatus(rs.getString("bStatus"));
                detail.setTumorTypeKey(rs.getInt("ttKey"));
                detail.setImgRefAccId(rs.getString("imgRefAccId"));
                detail.setImgRefKey(rs.getInt("imgRefKey"));
                
                  // strain information
                detail.setStrainKey(rs.getInt("sKey"));
                detail.setStrainName(rs.getString("strainName"));
                detail.setStrainNote(rs.getString("strainNote"));

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
            }
        } catch (SQLException sqle) {
            log.error("Error getting assay image data for key = " + lImagesKey,
                      sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }
        
        return detail;
    }
     
    /**
     * Returns all the tumor genetic changes wich the assay image is associated
     * @param assayImagesKey Long
     * @param tumorFrequencyKey Long
     * @return ArrayList<MTBTuorGeneticChangeDTO>
     */
     
    public ArrayList<MTBTumorGeneticChangesDTO> getTGCsFromAssayImageKey(Long assayImagesKey, Long tumorFrequencyKey){
       ArrayList<MTBTumorGeneticChangesDTO> tgcDTOs = 
               new ArrayList<MTBTumorGeneticChangesDTO>();
       try{
         TmrGntcCngAssayImageAssocDAO tgcAIAdao = 
                 TmrGntcCngAssayImageAssocDAO.getInstance();
         
         List<TmrGntcCngAssayImageAssocDTO> dtos =
                 tgcAIAdao.loadByAssayImagesKey(assayImagesKey);
         
         MTBGeneticsUtilDAO mtbGUdao =MTBGeneticsUtilDAO.getInstance();
         for(TmrGntcCngAssayImageAssocDTO tgcaiDTO: dtos){
           long tgcKey = tgcaiDTO.getTumorGeneticChangesKey().longValue();
           
           MTBTumorGeneticChangesDTO tgcDTO = mtbGUdao.getTumorGeneticChanges(tgcKey);
           
           // just in case the image is associated with more than one tumor frequency
           if (tgcDTO.getTumorFrequencyKey().equals(tumorFrequencyKey)){
             
           
            tgcDTOs.add(tgcDTO);
           }
         }
         
        
       }catch(Exception e){
         log.error("Error getting TGCdto for key "+assayImagesKey,e);
       }
       return tgcDTOs;
        

       
    }

 
}