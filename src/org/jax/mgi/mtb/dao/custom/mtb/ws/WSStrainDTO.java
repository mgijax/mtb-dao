/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

import java.util.HashMap;
import java.util.Map;

/**
 * A DTO for managing <code>Strain</code> search results.
 *
 * @author mjv
 * @date 2007/04/30 15:47:24
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 */
public class WSStrainDTO  {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String mtbId = null;
    private String name = null;
    private String description = null;
    private String family = null;
    private Map<String,String> types = null;
    private Map<String,String> references = null;
    private Map<String,String> notes = null;
    private Map<String,String> synonyms = null;
    private Map<String,String> links = null;
    private Map<String,String> tumorIds = null;

    // ----------------------------------------------------------- Constructors
    
    public WSStrainDTO() {
        types = new HashMap<String, String>();
        references = new HashMap<String, String>();
        notes = new HashMap<String, String>();
        synonyms = new HashMap<String, String>();
        links = new HashMap<String, String>();
        tumorIds = new HashMap<String, String>();
    }

    // --------------------------------------------------------- Public Methods


    public String getMTBId() {
        return mtbId;
    }

    public void setMTBId(String mtbId) {
        this.mtbId = mtbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Map<String,String> getTypes() {
        return types;
    }

    public void setTypes(Map<String,String> types) {
        this.types = types;
    }

    public void addType(String type) {
        types.put(type, type);
    }

    public Map<String,String> getReferences() {
        return references;
    }

    public void setReferences(Map<String,String> references) {
        this.references = references;
    }

    public void addReference(String reference) {
        references.put(reference, reference);
    }

    public Map<String,String> getNotes() {
        return notes;
    }

    public void setNotes(Map<String,String> notes) {
        this.notes = notes;
    }

    public void addNote(String note) {
        notes.put(note, note);
    }

    public Map<String,String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(Map<String,String> synonyms) {
        this.synonyms = synonyms;
    }

    public void addSynonym(String synonym) {
        synonyms.put(synonym, synonym);
    }

    public Map<String,String> getLinks() {
        return links;
    }

    public void setLinks(Map<String,String> links) {
        this.links = links;
    }

    public void addLink(String link) {
        links.put(link, link);
    }

    public Map<String,String> getTumorIds() {
        return tumorIds;
    }

    public void setTumorIds(Map<String,String> tumorIds) {
        this.tumorIds = tumorIds;
    }

    public void addTumorId(String tumorId) {
        tumorIds.put(tumorId, tumorId);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}