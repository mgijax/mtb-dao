/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageSearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;
import org.jax.mgi.mtb.utils.FieldPrinter;

/**
 * A <code>DTO</code> for pathology image search data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageSearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBPathologyImageSearchDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String organOriginName = null;
    private String tumorClassName = null;
    private String organAffectedName = null;
    private int strainKey = -1;
    private String strainName = null;
    private String strainSex = null;
    private int colonySize = -1;
    private int numMiceAffected = -1;
    private String reproductiveStatus = null;
    private String frequency = null;
    private String frequencyString = null;
    private String frequencyNote = null;
    private String ageAtNecropsy = null;
    private String note = null;
    private int tumorFrequencyKey = -1;
    private Collection<MTBPathologyImageHelperDTO> images = null;
    private String treatmentType = null;
    private Collection<String> agents = null;
    private String stainMethod = null;
    private String accID = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final void setOrganOriginName(String organ) {
        this.organOriginName = organ;
    }

    public final String getOrganOriginName() {
        return this.organOriginName;
    }

    public final void setTumorClassName(String classification) {
        this.tumorClassName = classification;
    }

    public final String getTumorClassName() {
        return this.tumorClassName;
    }

    public final void setOrganAffectedName(String organ) {
        this.organAffectedName = organ;
    }

    public final String getOrganAffectedName() {
        return this.organAffectedName;
    }

    public final void setStrainKey(int key) {
        this.strainKey = key;
    }

    public final int getStrainKey() {
        return this.strainKey;
    }

    public final void setStrainName(String name) {
        this.strainName = name;
    }

    public final String getStrainName() {
        return this.strainName;
    }

    public final void setStrainSex(String sex) {
        this.strainSex = sex;
    }

    public final String getStrainSex() {
        return this.strainSex;
    }

    public final void setReproductiveStatus(String status) {
        this.reproductiveStatus = status;
    }

    public final String getReproductiveStatus() {
        return this.reproductiveStatus;
    }

    public final void setColonySize(int size) {
        this.colonySize = size;
    }

    public final int getColonySize() {
        return this.colonySize;
    }

    public final void setNumMiceAffected(int num) {
        this.numMiceAffected = num;
    }

    public final int getNumMiceAffected() {
        return this.numMiceAffected;
    }

    public final void setFrequency(String freq) {
        this.frequency = freq;
    }

    public final String getFrequency() {
        return this.frequency;
    }

    public final void setFrequencyString(String freqString) {
        this.frequencyString = freqString;
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

    public final void setFrequencyNote(String note) {
        this.frequencyNote = note;
    }

    public final String getFrequencyNote() {
        return this.frequencyNote;
    }

    public final void setAgeAtNecropsy(String age) {
        this.ageAtNecropsy = age;
    }

    public final String getAgeAtNecropsy() {
        return this.ageAtNecropsy;
    }

    public final void setNote(String n) {
        this.note = n;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setTumorFrequencyKey(int key) {
        this.tumorFrequencyKey = key;
    }

    public final int getTumorFrequencyKey() {
        return this.tumorFrequencyKey;
    }

    public final void setImages(Collection<MTBPathologyImageHelperDTO> imgs) {
        this.images = imgs;
    }

    public final Collection<MTBPathologyImageHelperDTO> getImages() {
        return this.images;
    }

    public final void setAgents(Collection<String> a) {
        this.agents = a;
    }

    public final Collection<String> getAgents() {
        return this.agents;
    }

    public final void setTreatmentType(String type) {
        this.treatmentType = type;
    }

    public final String getTreatmentType() {
        return this.treatmentType;
    }

    public final void setStainMethod(String method) {
        this.stainMethod = method;
    }

    public final String getStainMethod() {
        return this.stainMethod;
    }

    public String toString() {
        return FieldPrinter.getFieldsAsString(this);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

    /**
     * @return the accID
     */
    public String getAccID() {
        return accID;
    }

    /**
     * @param accID the accID to set
     */
    public void setAccID(String accID) {
        this.accID = accID;
    }
}