/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A DTO for managing <code>Tumor</code> search results.
 *
 * @author mjv
 * @date 2007/04/30 15:47:24
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 */
public class WSTumorDTO  {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String mtbId = null;
    private String name = null;
    private String sex = null;
    private String organOrigin = null;
    private String organAffected = null;
    private String frequency = null;
    private String strainId = null;
    private String ageOnset = null;
    private String ageDetection = null;
    private String reproductiveStatus = null;
    private String infectionStatus = null;
    private Map<String,String> notes = null;
    private List<String> synonyms = null;
    private List<String> references = null;
    private List<WSTumorAgentsDTO> treatments = null;
    private List<WSTumorMetsDTO> metastases = null;

    // ----------------------------------------------------------- Constructors

    public WSTumorDTO() {
        setNotes(new HashMap<String, String>());
        setSynonyms(new ArrayList<String>());
        setReferences(new ArrayList<String>());
        setTreatments(new ArrayList<WSTumorAgentsDTO>());
        setMetastases(new ArrayList<WSTumorMetsDTO>());
    }

    // --------------------------------------------------------- Public Methods

    public String getMtbId() {
        return mtbId;
    }

    public void setMtbId(String mtbId) {
        this.mtbId = mtbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOrganOrigin() {
        return organOrigin;
    }

    public void setOrganOrigin(String organOrigin) {
        this.organOrigin = organOrigin;
    }

    public String getOrganAffected() {
        return organAffected;
    }

    public void setOrganAffected(String organAffected) {
        this.organAffected = organAffected;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getStrainId() {
        return strainId;
    }

    public void setStrainId(String strainId) {
        this.strainId = strainId;
    }

    public String getAgeOnset() {
        return ageOnset;
    }

    public void setAgeOnset(String ageOnset) {
        this.ageOnset = ageOnset;
    }

    public String getAgeDetection() {
        return ageDetection;
    }

    public void setAgeDetection(String ageDetection) {
        this.ageDetection = ageDetection;
    }

    public String getReproductiveStatus() {
        return reproductiveStatus;
    }

    public void setReproductiveStatus(String reproductiveStatus) {
        this.reproductiveStatus = reproductiveStatus;
    }

    public String getInfectionStatus() {
        return infectionStatus;
    }

    public void setInfectionStatus(String infectionStatus) {
        this.infectionStatus = infectionStatus;
    }

    public Map<String, String> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, String> notes) {
        this.notes = notes;
    }

    public void addNote(String note) {
        notes.put(note, note);
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = new ArrayList<String>(synonyms);
    }

    public void addSynonym(String synonym) {
        synonyms.add(synonym);
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = new ArrayList<String>(references);
    }

    public void addReference(String reference) {
        references.add(reference);
    }

    public List<WSTumorAgentsDTO> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<WSTumorAgentsDTO> treatments) {
        this.treatments = new ArrayList<WSTumorAgentsDTO>(treatments);
    }

    public void addTreatment(WSTumorAgentsDTO dto) {
        this.treatments.add(dto);
    }

    public List<WSTumorMetsDTO> getMetastases() {
        return metastases;
    }

    public void setMetastases(List<WSTumorMetsDTO> metastases) {
        this.metastases = new ArrayList<WSTumorMetsDTO>(metastases);
    }

    public void addMetastases(WSTumorMetsDTO mets) {
        this.metastases.add(mets);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

}