/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageDetailDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;

/**
 * A <code>DTO</code> for pathology image detail data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageDetailDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBPathologyImageDetailDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    // pathology information
    private String pathologyDescription;
    private String pathologyNote;
    private String ageAtNecropsy;

    // image information
    private int imageKey;
    private String imageName;
    private String caption;
    private String copyright;
    private String imageUrl;
    private String imageUrlPath;
    private String imageThumbName;
    private String zoomifyDir;
    private String method;
    private String imageNote;
    private String sourceOfImage;  //contributor
    private String pathologist;
    private String pathologistAccId;
    private String pathologistRefKey;
    private String institution;
    private String reproductiveStatus;
    private String imgRefAccId;
    private int imgRefKey;

    // frequency information
    private int tumorFrequencyKey;
    private String ageOfOnset;
    private String ageOfDetection;
    private String colonySize;
    private String numMiceAffected;
    private String frequency;
    private String frequencyString;
    private String frequencyNote;
    private String sex;
    private String treatmentType;
    private String organAffected;
    private Collection agents;
    private String referenceKey;
    private String accessionId;

    // tumor information
    private int tumorTypeKey;
    private String organOrigin;
    private String tumorClassName;
    private Collection tumorSynonyms;

    // strain information
    private int strainKey;
    private String strainName;
    private String strainNote;
    private Collection strainSynonyms;
    private Collection strainTypes;
    private Collection probes;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    // image information
    public void setImageKey(int key) {
        this.imageKey = key;
    }

    public int getImageId() {
        return this.imageKey;
    }

    public void setImageName(String imageName_loc) {
        this.imageName = imageName_loc;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setCaption(String caption_loc) {
        this.caption = caption_loc;
    }

    public String getCaption() {
        return this.caption;
    }
    
    public void setCopyright(String copyright_loc){
        this.copyright = copyright_loc;
    }
    
    public String getCopyright(){
        return this.copyright;
    }

    public void setImageUrl(String imageUrl_loc) {
        this.imageUrl = imageUrl_loc;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrlPath(String imageUrlPath_loc) {
        this.imageUrlPath = imageUrlPath_loc;
    }

    public String getImageUrlPath() {
        return this.imageUrlPath;
    }

    public void setSex(String sex_loc) {
        this.sex = sex_loc;
    }

    public String getSex() {
        return this.sex;
    }

    public void setAgents(Collection agents_loc) {
        this.agents = agents_loc;
    }

    public Collection getAgents() {
        return this.agents;
    }

    public void setImageThumbName(String imageThumbName_loc) {
        this.imageThumbName = imageThumbName_loc;
    }

    public String getImageThumbName() {
       return this.imageThumbName;
    }

    public void setMethod(String method_loc) {
        this.method = method_loc;
    }

    public String getMethod() {
        return this.method;
    }

    public void setSourceOfImage(String sourceOfImage_loc) {
        this.sourceOfImage = sourceOfImage_loc;
    }

    public String getSourceOfImage() {
        return this.sourceOfImage;
    }

    public void setInstitution(String institution_loc) {
        this.institution = institution_loc;
    }

    public String getInstitution() {
        return this.institution;
    }

    public void setZoomifyDir(String dir) {
        this.zoomifyDir = dir;
    }

    public String getZoomifyDir() {
        return this.zoomifyDir;
    }

    public void setReproductiveStatus(String reproductiveStatus_loc) {
        this.reproductiveStatus = reproductiveStatus_loc;
    }

    public String getReproductiveStatus() {
        return this.reproductiveStatus;
    }

    // tumor information
    public void setTumorTypeKey(int tumorTypeKey_loc) {
        this.tumorTypeKey = tumorTypeKey_loc;
    }

    public int getTumorTypeKey() {
        return this.tumorTypeKey;
    }

    public void setTumorFrequencyKey(int tumorFrequencyKey_loc) {
        this.tumorFrequencyKey = tumorFrequencyKey_loc;
    }

    public int getTumorFrequencyKey() {
        return this.tumorFrequencyKey;
    }

    public void setPathologyDescription(String pathologyDescription_loc) {
        this.pathologyDescription = pathologyDescription_loc;
    }

    public String getPathologyDescription() {
        return this.pathologyDescription;
    }

    public void setImageNote(String imageNote_loc) {
        this.imageNote = imageNote_loc;
    }

    public String getImageNote() {
        return this.imageNote;
    }

    public void setPathologyNote(String pathologyNote_loc) {
        this.pathologyNote = pathologyNote_loc;
    }

    public String getPathologyNote() {
        return this.pathologyNote;
    }

    public void setOrganOrigin(String organOrigin_loc) {
        this.organOrigin = organOrigin_loc;
    }

    public String getOrganOrigin() {
        return this.organOrigin;
    }

    public void setOrganAffected(String organAffected_loc) {
        this.organAffected = organAffected_loc;
    }

    public String getOrganAffected() {
        return this.organAffected;
    }

    public void setTumorClassName(String tumorClassName_loc) {
        this.tumorClassName = tumorClassName_loc;
    }

    public String getTumorClassName() {
        return this.tumorClassName;
    }

    public void setTreatmentType(String treatmentType_loc) {
        this.treatmentType = treatmentType_loc;
    }

    public String getTreatmentType() {
        return this.treatmentType;
    }

    public void setFrequency(String frequency_loc) {
        this.frequency = frequency_loc;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequencyString(String frequencyString_loc) {
        this.frequencyString = frequencyString_loc;
    }

    public String getFrequencyString() {
        if ((frequency != null) && (frequency.length() != 0)) {

            try {
                Double.parseDouble(frequency);
                frequencyString = frequency + "%";
            } catch (Exception e) {
                frequencyString = frequency;
            }
        }

        return this.frequencyString;
    }

    public void setFrequencyNote(String frequencyNote_loc) {
        this.frequencyNote = frequencyNote_loc;
    }

    public String getFrequencyNote() {
        return this.frequencyNote;
    }

    public void setReferenceKey(String referenceKey_loc) {
        this.referenceKey = referenceKey_loc;
    }

    public String getReferenceKey() {
        return this.referenceKey;
    }

    public void setAccessionId(String accessionId_loc) {
        this.accessionId = accessionId_loc;
    }

    public String getAccessionId() {
        return this.accessionId;
    }

    public void setAgeAtNecropsy(String ageAtNecropsy_loc) {
        this.ageAtNecropsy = ageAtNecropsy_loc;
    }

    public String getAgeAtNecropsy() {
        return this.ageAtNecropsy;
    }

    public void setAgeOfOnset(String ageOfOnset_loc) {
        this.ageOfOnset = ageOfOnset_loc;
    }

    public String getAgeOfOnset() {
        return this.ageOfOnset;
    }

    public void setAgeOfDetection(String ageOfDetection_loc) {
        this.ageOfDetection = ageOfDetection_loc;
    }

    public String getAgeOfDetection() {
        return this.ageOfDetection;
    }

    public void setColonySize(String colonySize_loc) {
        this.colonySize = colonySize_loc;
    }

    public String getColonySize() {
        return this.colonySize;
    }

    public void setNumMiceAffected(String numMiceAffected_loc) {
        this.numMiceAffected = numMiceAffected_loc;
    }

    public String getNumMiceAffected() {
        return this.numMiceAffected;
    }

    public void setTumorSynonyms(Collection tumorSynonyms_loc) {
        this.tumorSynonyms = tumorSynonyms_loc;
    }

    public Collection getTumorSynonyms() {
        return this.tumorSynonyms;
    }


    // strain information
    public void setStrainKey(int strainKey_loc) {
        this.strainKey = strainKey_loc;
    }

    public int getStrainKey() {
        return this.strainKey;
    }

    public void setStrainName(String strainName_loc) {
        this.strainName = strainName_loc;
    }

    public String getStrainName() {
        return this.strainName;
    }

    public void setStrainNote(String strainNote_loc) {
        this.strainNote = strainNote_loc;
    }

    public String getStrainNote() {
        return this.strainNote;
    }

    public void setStrainSynonyms(Collection strainSynonyms_loc) {
        this.strainSynonyms = strainSynonyms_loc;
    }

    public Collection getStrainSynonyms() {
        return this.strainSynonyms;
    }

    public void setStrainTypes(Collection strainTypes_loc) {
        this.strainTypes = strainTypes_loc;
    }

    public Collection getStrainTypes() {
        return this.strainTypes;
    }
    
    public void setProbes(Collection probes_loc){
      this.probes = probes_loc;
    }
    
    public Collection getProbes(){
      return this.probes;
    }
    
    public void setImgRefAccId(String id){
      this.imgRefAccId = id;
    }
    
    public String getImgRefAccId(){
      return this.imgRefAccId;
    }
    
    public void setImgRefKey(int key){
      this.imgRefKey = key;
    }
    
    public int getImgRefKey(){
      return this.imgRefKey;
    }

  public String getPathologist() {
    return pathologist;
  }

  public void setPathologist(String pathologist) {
    this.pathologist = pathologist;
  }

  public String getPathologistAccId() {
    return pathologistAccId;
  }

  public void setPathologistAccId(String pathologistAccId) {
    this.pathologistAccId = pathologistAccId;
  }

  public String getPathologistRefKey() {
    return pathologistRefKey;
  }

  public void setPathologistRefKey(String pathologistRefKey) {
    this.pathologistRefKey = pathologistRefKey;
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}