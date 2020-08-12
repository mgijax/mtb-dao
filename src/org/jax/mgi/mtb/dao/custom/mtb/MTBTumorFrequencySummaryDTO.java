/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencySummaryDTO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * A DTO for managing <code>TumorFrequency</code> summary data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencySummaryDTO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class MTBTumorFrequencySummaryDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int tumorFrequencyKey = -1;
    private int parentFrequencyKey = -1;
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
    private Map<String, String> agents = null;
    private int numImages = -1;
    private int numPathEntries = -1;
    private int numNotes = -1;
    private int numGenetics = -1;
    private int numAssayImages = -1;
    private int numSamples = -1;
    private int sortOrder;
    private boolean isParent = false;
    private String shortCitation = null;
    private String refYear = null;
    private Double incidence;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final void setTumorFrequencyKey(int key) {
        this.tumorFrequencyKey = key;
    }

    public final int getTumorFrequencyKey() {
        return this.tumorFrequencyKey;
    }

    public final void setParentFrequencyKey(int key) {
        this.parentFrequencyKey = key;
    }

    public final int getParentFrequencyKey() {
        return this.parentFrequencyKey;
    }

    public final void setOrganAffected(String affected) {
        this.organAffected = affected;
    }

    public final String getOrganAffected() {
        return this.organAffected;
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

    public final void setInfectionStatus(String status) {
        this.infectionStatus = status;
    }

    public final String getInfectionStatus() {
        return this.infectionStatus;
    }

    public void setFrequency(String freq) {
        this.frequency = freq;
        setFrequencyString(frequency);
    }

    public final String getFrequency() {
        return this.frequency;
    }

    private void setFrequencyString(String frequency) {
        try {
            Double.parseDouble(frequency);
            this.frequencyString = frequency + "%";
        } catch (Exception e) {
            this.frequencyString = frequency;
        }
    }

    public final String getFrequencyString() {
        return this.frequencyString;
    }

    public final void setColonySize(String size) {
        this.colonySize = size;
    }

    public final String getColonySize() {
        return this.colonySize;
    }

    public final void setNumMiceAffected(String num) {
        this.numMiceAffected = num;
    }

    public final String getNumMiceAffected() {
        return this.numMiceAffected;
    }

    public final void setAgeOnset(String onset) {
        this.ageOnset = onset;
    }

    public final String getAgeOnset() {
        return this.ageOnset;
    }

    public void setAgeDetection(String detection) {
        this.ageDetection = detection;
    }

    public final String getAgeDetection() {
        return this.ageDetection;
    }

    public final void setNote(String n) {
        this.note = n;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setReference(String ref) {
        this.reference = ref;
    }

    public final String getReference() {
        return this.reference;
    }

    public final Collection getSortedAgents() {
        List<String> a = new ArrayList<String>(this.agents.values());
        Collections.sort(a);
        return a;
    }

    public final Map<String, String> getAgents() {
        return this.agents;
    }

    public final void setAgents(Map<String, String> ags) {
        this.agents = ags;
    }


    public final void setNumImages(int images) {
        this.numImages = images;
    }

    public final int getNumImages() {
        return this.numImages;
    }
    
     public final void setNumAssayImages(int images) {
        this.numAssayImages = images;
    }

    public final int getNumAssayImages() {
        return this.numAssayImages;
    }

    public final void setNumPathEntries(int num) {
        this.numPathEntries = num;
    }

    public final int getNumPathEntries() {
        return this.numPathEntries;
    }

    public final void setNumNotes(int num) {
        this.numNotes = num;
    }

    public final int getNumNotes() {
        return this.numNotes;
    }

    public final void setNumGenetics(int num) {
        this.numGenetics = num;
    }

    public final int getNumGenetics() {
        return this.numGenetics;
    }

    public final void setSortOrder(int so) {
        this.sortOrder = so;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final void setIsParent(boolean is) {
        this.isParent = is;
    }

    public final boolean getIsParent() {
        return this.isParent;
    }

  public int getNumSamples() {
    return numSamples;
  }

  public void setNumSamples(int numSamples) {
    this.numSamples = numSamples;
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

    /**
     * @return the shortCitation
     */
    public String getShortCitation() {
        return shortCitation;
    }

    /**
     * @param shortCitation the shortCitation to set
     */
    public void setShortCitation(String shortCitation) {
        this.shortCitation = shortCitation;
    }

    /**
     * @return the refYear
     */
    public String getRefYear() {
        return refYear;
    }

    /**
     * @param refYear the refYear to set
     */
    public void setRefYear(String refYear) {
        this.refYear = refYear;
    }

    /**
     * @return the incidence
     */
    public Double getIncidence() {
        return incidence;
    }

    /**
     * @param incidence the incidence to set
     */
    public void setIncidence(Double incidence) {
        this.incidence = incidence;
    }
}