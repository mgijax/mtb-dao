/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencyDetailDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jax.mgi.mtb.utils.LabelValueDataBean;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for <code>TumorFrequency</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencyDetailDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBTumorFrequencyDetailDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String mtbId = null;
    private int tumorFrequencyKey = -1;
    private int parentFrequencyKey = -1;
    private String tumorName = null;
    private String organOfOrigin = null;
    private String tumorClassification = null;
    private List<String> agents = null;
    private List<String> tumorSynonyms = null;
    private String treatmentType = null;
    private String organAffected = null;
    private String strainSex = null;
    private String reproductiveStatus = null;
    private String infectionStatus = null;
    private String frequency = null;
    private String frequencyString = null;
    private String colonySize = null;
    private String numMiceAffected = null;
    private String ageOnset = null;
    private String ageDetection = null;
    private String note = null;
    private String reference = null;
    private int numImages = 0;
    private List additionalNotes = null;
    private List associatedFrequencyInfo = null;
    private List tumorGenetics = null;
    private List tumorCytogenetics = null;
    private List<LabelValueDataBean<String,String,Long>> notes = null;
    private List<String> references = null;

    // strain related information
    private MTBStrainDetailDTO strain = null;
    private long strainKey = -1;
    private String strainName = null;
    private Collection strainTypes = null;
    private String strainNote  = null;
    private Collection strainSynonyms = null;

    private List pathologyRecs = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public void setStrain(MTBStrainDetailDTO dto) {
        this.strain = dto;
    }

    public MTBStrainDetailDTO getStrain() {
        return this.strain;
    }


    public void setTumorFrequencyKey(int key) {
        this.tumorFrequencyKey = key;
    }

    public int getTumorFrequencyKey() {
        return this.tumorFrequencyKey;
    }

    // ---------------------------------------------------Tumor Related Methods
    public void setMtbId(String id) {
        this.mtbId = id;
    }
    
    public String getMtbId() {
        return this.mtbId;
    }
    
    public void setParentFrequencyKey(int key) {
        this.parentFrequencyKey = key;
    }

    public int getParentFrequencyKey() {
        return this.parentFrequencyKey;
    }

    public void setOrganAffected(String affected) {
        this.organAffected = affected;
    }

    public String getOrganAffected() {
        return this.organAffected;
    }

    public void setStrainSex(String sex) {
        this.strainSex = sex;
    }

    public String getStrainSex() {
        return this.strainSex;
    }

    public void setReproductiveStatus(String status) {
        this.reproductiveStatus = status;
    }

    public String getReproductiveStatus() {
        return this.reproductiveStatus;
    }

    public void setInfectionStatus(String status) {
        this.infectionStatus = status;
    }

    public String getInfectionStatus() {
        return this.infectionStatus;
    }

    public void setFrequency(String freq) {
        this.frequency = freq;
        setFrequencyString(freq);
    }

    public String getFrequency() {
        return this.frequency;
    }

    private void setFrequencyString(String freq) {
        try {
            Double.parseDouble(freq);
            this.frequencyString = freq + "%";
        } catch (Exception e) {
            this.frequencyString = freq;
        }
    }

    public String getFrequencyString() {
        return this.frequencyString;
    }

    public void setColonySize(String size) {
        this.colonySize = size;
    }

    public String getColonySize() {
        return this.colonySize;
    }

    public void setNumMiceAffected(String num) {
        this.numMiceAffected = num;
    }

    public String getNumMiceAffected() {
        return this.numMiceAffected;
    }

    public void setAgeOnset(String age) {
        this.ageOnset = age;
    }

    public String getAgeOnset() {
        return this.ageOnset;
    }

    public void setAgeDetection(String age) {
        this.ageDetection = age;
    }

    public String getAgeDetection() {
        return this.ageDetection;
    }

    public void setNote(String n) {
        this.note = n;
    }

    public String getNote() {
        return this.note;
    }
    public List<LabelValueDataBean<String,String,Long>> getTumorNotes() {
        return this.notes;
    }
    
    public void setNotes(List<LabelValueDataBean<String,String,Long>> notes) {
        this.notes = new ArrayList<LabelValueDataBean<String,String,Long>>(notes);
    }

    public String getTumorName() {
        return this.tumorName;
    }

    public void setTumorName(String name) {
        this.tumorName = name;
    }

    public String getOrganOfOrigin() {
        return this.organOfOrigin;
    }

    public void setOrganOfOrigin(String organ) {
        this.organOfOrigin = organ;
    }

    public String getTumorClassification() {
        return this.tumorClassification;
    }

    public void setTumorClassification(String classification) {
        this.tumorClassification = classification;
    }

    public List<String> getAgents() {
        return this.agents;
    }

    public void setAgents(List<String> arr) {
        this.agents = arr;
    }

    public void addAgent(String agent) {
        if (this.agents == null) {
            this.agents = new ArrayList<String>();
        }

        if (StringUtils.hasValue(agent)) {
            this.agents.add(agent);
        }
    }

    public List<String> getTumorSynonyms() {
        return this.tumorSynonyms;
    }

    public void setTumorSynonyms(List<String> synonyms) {
        this.tumorSynonyms = synonyms;
    }

    public List getTumorGenetics() {
        return this.tumorGenetics;
    }

    public void setTumorGenetics(List genetics) {
        this.tumorGenetics = genetics;
    }
    
     public List getTumorCytogenetics() {
        return this.tumorCytogenetics;
    }

    public void setTumorCytogenetics(List genetics) {
        this.tumorCytogenetics = genetics;
    }

    public void addSynonym(String synonym) {
        if (this.tumorSynonyms == null) {
            this.tumorSynonyms = new ArrayList<String>();
        }

        if (StringUtils.hasValue(synonym)) {
            this.tumorSynonyms.add(synonym);
        }
    }

    public String getTreatmentType() {
        return this.treatmentType;
    }

    public void setTreatmentType(String type) {
        this.treatmentType = type;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String ref) {
        this.reference = ref;
    }

    public List getAdditionalNotes() {
        return this.additionalNotes;
    }

    public void setAdditionalNotes(List notes) {
        this.additionalNotes = notes;
    }

    public List getAssociatedFrequencyInfo() {
        return this.associatedFrequencyInfo;
    }

    public void setAssociatedFrequencyInfo(List freqs) {
        this.associatedFrequencyInfo = freqs;
    }

    // ------------------------------------------------- Strain Related Methods

    public long getStrainKey() {
        return this.strainKey;
    }

    public void setStrainKey(long key) {
        this.strainKey = key;
    }

    public String getStrainName() {
        return this.strainName;
    }

    public void setStrainName(String name) {
        this.strainName = name;
    }

    public Collection getStrainTypes() {
        return this.strainTypes;
    }

    public void setStrainTypes(Collection types) {
        this.strainTypes = types;
    }

    public String getStrainNote() {
        return this.strainNote;
    }

    public void setStrainNote(String note) {
        this.strainNote = note;
    }

    public Collection getStrainSynonyms() {
        return this.strainSynonyms;
    }

    public void setStrainSynonyms(Collection syns) {
        this.strainSynonyms = syns;
    }

    // pathology information
    public List getPathologyRecs() {
        return this.pathologyRecs;
    }

    public void setPathologyRecs(List recs) {
        this.pathologyRecs = recs;
    }

    public int getNumPathologyRecs() {
        if ((this.pathologyRecs == null) || (this.pathologyRecs.isEmpty())) {
            return 0;
        }
        return this.pathologyRecs.size();
    }

    public int setNumImages(int imgs) {
        return this.numImages = imgs;
    }

    public int getNumImages() {
        return this.numImages;
    }
    public List<String> getReferences() {
        return this.references;
    }
    
    public void setReferences(List<String> refs) {
        this.references = new ArrayList<String>(refs);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}