/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorDetailsDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */

package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * A <code>DTO</code> for <code>Strain</code> tumor details.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorDetailsDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainTumorDetailsDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int tumorFrequencyKey = -1;
    private int strainKey = -1;
    private String strainName;
    private String strainDescription;
    private String tumorName;
    private String tumorClassName;
    private String ageOnset;
    private String ageDetection;
    private String reproductiveStatus;
    private int tumorClassKey = -1;
    private int organOfOriginKey = -1;
    private String organOfOriginName;
    private Collection<String> agents;
    private Collection<String> agentKeys;
    private String sex;
    private String frequency;
    private int images = 0;
    private int cytoImages = 0;
    private String treatmentType;
    private String organAffectedName;
    private int parentFrequencyKey = -1;
    private boolean metastasis = false;
    private String refAccId = null;
    private String refShortCitation = null;
    private Map<String, String> mapStrainTypes = null;
    private Map<String, String> mapAgents = null;
    private Map<String, String> mapAgentKeys = null;
    private Map<String, String> mapReferences = null;


    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBStrainTumorDetailsDTO
     */
    public MTBStrainTumorDetailsDTO() {
        this(-1, -1, -1, null, null, -1, null, -1, null, null, null, null, null, 0, null, null, null);
    }

    public MTBStrainTumorDetailsDTO(int tfKey,
                                    int strainKey,
                                    int parentFrequencyKey,
                                    String strainName,
                                    String strainDescription,
                                    int tumorClassKey,
                                    String tcName,
                                    int organKey,
                                    String toName,
                                    Collection<String> agents,
                                    Collection<String> agentsKey,
                                    String sex,
                                    String frequency,
                                    int images,
                                    String treatment,
                                    String organAffected,
                                    String refAccId) {
        setTumorFrequencyKey(tfKey);
        setParentFrequencyKey(parentFrequencyKey);
        setStrainKey(strainKey);
        setStrainName(strainName);
        setStrainDescription(strainDescription);
        setTumorClassName(tcName);
        setOrganOfOriginName(toName);
        setAgents(agents);
        setSex(sex);
        setFrequency(frequency);
        setImages(images);
        setTreatmentType(treatment);
        setOrganAffectedName(organAffected);
        setRefAccId(refAccId);
    }

    // --------------------------------------------------------- Public Methods

    public void setTumorFrequencyKey(int key) {
        this.tumorFrequencyKey = key;
    }

    public int getTumorFrequencyKey() {
        return this.tumorFrequencyKey ;
    }

    public void setParentFrequencyKey(int key) {
        this.parentFrequencyKey = key;
    }

    public int getParentFrequencyKey() {
        return this.parentFrequencyKey ;
    }

    public void setStrainKey(int key) {
        this.strainKey = key;
    }

    public int getStrainKey() {
        return this.strainKey ;
    }

    public void setStrainName(String name) {
        this.strainName = name;
    }

    public String getStrainName() {
        return this.strainName;
    }

    public void setStrainDescription(String desc) {
        this.strainDescription = desc;
    }

    public String getStrainDescription() {
        return this.strainDescription;
    }

    public void setTumorName(String name) {
        this.tumorName = name;
    }

    public String getTumorName() {
        return this.tumorName;
    }

    public void setTumorClassKey(int key) {
        this.tumorClassKey = key;
    }

    public int getTumorClassKey() {
        return this.tumorClassKey;
    }

    public void setTumorClassName(String name) {
        this.tumorClassName = name;
    }

    public String getTumorClassName() {
        return this.tumorClassName;
    }

    public void setOrganOfOriginName(String name) {
        this.organOfOriginName = name;
    }

    public String getOrganOfOriginName() {
        return this.organOfOriginName;
    }

    public void setOrganOfOriginKey(int key) {
        this.organOfOriginKey = key;
    }

    public int getOrganOfOriginKey() {
        return this.organOfOriginKey;
    }

    public void setAgents(Collection<String> a) {
        this.agents = a;
    }

    public Collection<String> getAgents() {
        return this.agents;
    }

    public void setAgentKeys(Collection<String> keys) {
        this.agentKeys = keys;
    }

    public Collection<String> getAgentKeys() {
        return this.agentKeys;
    }

    public void setSex(String s) {
        this.sex = s;
    }

    public String getSex() {
        return this.sex;
    }

    public void setFrequency(String freq) {
        this.frequency = freq;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setImages(int imgs) {
        this.images = imgs;
    }

    public boolean getImages() {
        return this.images > 0;
    }
    
    public int getImageCount(){
        return this.images;
    }
    
    public String getAgeOnset() {
        return this.ageOnset;
    }
    
    public void setAgeOnset(String age) {
        this.ageOnset = age;
    }

    public String getAgeDetection() {
        return this.ageDetection;
    }
    
    public void setAgeDetection(String age) {
        this.ageDetection = age;
    }
    
    public void setReproductiveStatus(String status) {
        this.reproductiveStatus = status;
    }
    
    public void setTreatmentType(String treatment) {
        this.treatmentType = treatment;
    }

    public String getTreatmentType() {
        return this.treatmentType;
    }

    public void setOrganAffectedName(String organ) {
        this.organAffectedName = organ;
    }

    public String getOrganAffectedName() {
        return this.organAffectedName;
    }

    public void setMetastasis(boolean mets) {
        this.metastasis = mets;
    }

    public boolean getMetastasis() {
        return this.metastasis;
    }

    public void setRefAccId(String accId) {
        this.refAccId = accId;
    }

    public String getRefAccId() {
        return this.refAccId;
    }

    public Collection<String> getAgentCollection() {
        if (mapAgents == null) {
            return new ArrayList<String>();
        } else {
            return  mapAgents.values();
            
        }
    }

    public Collection<String> getStrainTypeCollection() {
        if (mapStrainTypes == null) {
            return new ArrayList<String>();
        } else {
            return new ArrayList<String>(mapStrainTypes.keySet());
        }
    }

    public Collection<String> DontGetReferenceCollection() {
        if (mapReferences == null) {
            return new ArrayList<String>();
        } else {
            return new ArrayList<String>(mapReferences.keySet());
        }
    }

    public Collection<String> getAgentKeysCollection() {
        if (mapAgentKeys == null) {
            return new ArrayList<String>();
        } else {
            return new ArrayList<String>(mapAgentKeys.keySet());
        }
    }

    public void addAgent(String strAgent) {
        if (mapAgents == null) {
            mapAgents = new HashMap<String, String>();
        }

        mapAgents.put(strAgent, strAgent);
    }

    public void addStrainType(String strStrainType) {
        if (mapStrainTypes == null) {
            mapStrainTypes = new HashMap<String, String>();
        }

        mapStrainTypes.put(strStrainType, strStrainType);
    }

    public void DontAddReference(String strRef) {
        if (mapReferences == null) {
            mapReferences = new HashMap<String, String>();
        }

        mapReferences.put(strRef, strRef);
    }

    public void addAgentKey(String strAgentKey) {
        if (mapAgentKeys == null) {
            mapAgentKeys = new HashMap<String, String>();
        }

        mapAgentKeys.put(strAgentKey, strAgentKey);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        char NL = '\n';
        sb.append("<TF>").append(NL);
        sb.append("<TFKEY>").append(tumorFrequencyKey).append("</TFKEY>").append(NL);
        sb.append("<STRAIN_KEY>").append(strainKey).append("</STRAIN_KEY>").append(NL);
        sb.append("<TUMOR_NAME>").append(tumorName).append("</TUMOR_NAME>").append(NL);
        sb.append("<TUMOR_CLASS_NAME>").append(tumorClassName).append("</TUMOR_CLASS_NAME>").append(NL);
        sb.append("<TUMOR_CLASS_KEY>").append(tumorClassKey).append("</TUMOR_CLASS_KEY>").append(NL);
        sb.append("<ORGAN_OF_ORIGIN_KEY>").append(organOfOriginKey).append("</ORGAN_OF_ORIGIN_KEY>").append(NL);
        sb.append("<ORGAN_OF_ORIGIN_NAME>").append(organOfOriginName).append("</ORGAN_OF_ORIGIN_NAME>").append(NL);
        sb.append("<AGENTS>").append(agents).append("</AGENTS>").append(NL);
        sb.append("<AGENT_KEYS>").append(agentKeys).append("</AGENT_KEYS>").append(NL);
        sb.append("<SEX>").append(sex).append("</SEX>").append(NL);
        sb.append("<FREQUENCY>").append(frequency).append("</FREQUENCY>").append(NL);
        sb.append("<IMAGES>").append(images).append("</IMAGES>").append(NL);
        sb.append("<TREATMENT_TYPE>").append(treatmentType).append("</TREATMENT_TYPE>").append(NL);
        sb.append("<ORGAN_AFFECTED_NAME>").append(organAffectedName).append("</ORGAN_AFFECTED_NAME>").append(NL);
        sb.append("<PARENT_FREQUENCY_KEY>").append(parentFrequencyKey).append("</PARENT_FREQUENCY_KEY>").append(NL);
        sb.append("<METASTATSIS>").append(metastasis).append("</METASTATSIS>").append(NL);
        sb.append("<REF_ACC_ID>").append(refAccId).append("</REF_ACC_ID>").append(NL);
        sb.append("</TF>").append(NL);
        return sb.toString();
    }

    /**
     * @return the refShortCitation
     */
    public String getRefShortCitation() {
        return refShortCitation;
    }

    /**
     * @param refShortCitation the refShortCitation to set
     */
    public void setRefShortCitation(String refShortCitation) {
        this.refShortCitation = refShortCitation;
    }

    /**
     * @return the cytoImages
     */
    public int getCytoImages() {
        return cytoImages;
    }

    /**
     * @param cytoImages the cytoImages to set
     */
    public void setCytoImages(int cytoImages) {
        this.cytoImages = cytoImages;
    }

   
}
