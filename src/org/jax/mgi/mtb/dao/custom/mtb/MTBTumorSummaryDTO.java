/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorSummaryDTO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A DTO for managing <code>Tumor</code> summary data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorSummaryDTO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class MTBTumorSummaryDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    // tumor related information
    private String tumorName = null;
    private String organOfOrigin = null;
    private String tumorClassification = null;
    private HashMap agents = null;
    private Map<String, String> tumorSynonyms = null;
    private String treatmentType = null;

    // strain related information
    private long strainKey = -1;
    private String strainName = null;
    private Collection strainTypes = null;
    private String strainNote  = null;
    private Collection strainSynonyms = null;

    // frequency records
    private Collection frequencyRecs = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    // -------------------------------------------------- Tumor Related Methods

    public final String getTumorName() {
        return this.tumorName;
    }

    public final void setTumorName(String name) {
        this.tumorName = name;
    }

    public final String getOrganOfOrigin() {
        return this.organOfOrigin;
    }

    public final void setOrganOfOrigin(String origin) {
        this.organOfOrigin = origin;
    }

    public final String getTumorClassification() {
        return this.tumorClassification;
    }

    public final void setTumorClassification(String classification) {
        this.tumorClassification = classification;
    }

    public final HashMap getAgents() {
        return this.agents;
    }

    public final void setAgents(HashMap ags) {
        this.agents = ags;
    }

    public final Map<String, String> getTumorSynonyms() {
        return this.tumorSynonyms;
    }

    public final void setTumorSynonyms(Map<String, String> arr) {
        this.tumorSynonyms = arr;
    }

    public void addSynonym(String synonym) {
        if (this.tumorSynonyms == null) {
            this.tumorSynonyms = new HashMap<String, String>();
        }

        if (StringUtils.hasValue(synonym)) {
            this.tumorSynonyms.put(synonym, synonym);
        }
    }

    public final String getTreatmentType() {
        return this.treatmentType;
    }

    public final void setTreatmentType(String type) {
        this.treatmentType = type;
    }

    // ------------------------------------------------- Strain Related Methods

    public final long getStrainKey() {
        return this.strainKey;
    }

    public final void setStrainKey(long key) {
        this.strainKey = key;
    }

    public final String getStrainName() {
        return this.strainName;
    }

    public final void setStrainName(String name) {
        this.strainName = name;
    }

    public final Collection getStrainTypes() {
        return this.strainTypes;
    }

    public final void setStrainTypes(Collection types) {
        this.strainTypes = types;
    }

    public final String getStrainNote() {
        return this.strainNote;
    }

    public final void setStrainNote(String note) {
        this.strainNote = note;
    }

    public final Collection getStrainSynonyms() {
        return this.strainSynonyms;
    }

    public final void setStrainSynonyms(Collection synonyms) {
        this.strainSynonyms = synonyms;
    }

    // ---------------------------------------- Tumor Frequency Related Methods

    public final Collection getFrequencyRecs() {
        return this.frequencyRecs;
    }

    public final void setFrequencyRecs(Collection recs) {
        this.frequencyRecs = recs;
    }


    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}