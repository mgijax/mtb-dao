/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

/**
 *
 * @author sbn
 */
public class PDXImage extends PDXContent {
    
    private String fileName;
    private String caption;
    private String description;
    private String pathologist;
    private String diagnosis;
    private String source;
    private String passage;
    private String mouseID;
    private double sortOrder;
   

    /**
     * @return the name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param name the name to set
     */
    public void setFileName(String name) {
        this.fileName = name;
    }

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @param set the caption
     */
    public void setCaption(String cap) {
        this.caption = cap;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the pathologist
     */
    public String getPathologist() {
        return pathologist;
    }

    /**
     * @param pathologist the pathologist to set
     */
    public void setPathologist(String pathologist) {
        this.pathologist = pathologist;
    }

    /**
     * @return the diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * @param diagnosis the diagnosis to set
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the passage
     */
    public String getPassage() {
        return passage;
    }

    /**
     * @param passage the passage to set
     */
    public void setPassage(String passage) {
        this.passage = passage;
    }

    /**
     * @return the mouseID
     */
    public String getMouseID() {
        return mouseID;
    }

    /**
     * @param mouseID the mouseID to set
     */
    public void setMouseID(String mouseID) {
        this.mouseID = mouseID;
    }

    /**
     * @return the sortOrder
     */
    public double getSortOrder() {
        return sortOrder;
    }

    /**
     * @param sortOrder the sortOrder to set
     */
    public void setSortOrder(double sortOrder) {
        this.sortOrder = sortOrder;
    }

   
    
    
}
