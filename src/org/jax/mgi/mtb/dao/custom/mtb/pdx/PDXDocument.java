/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

/**
 *
 * @author sbn
 */
public class PDXDocument extends PDXContent {
    
  
    private String description;
    private String linkText;
    private String fileName;
   
   

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
     * @return the linkText
     */
    public String getLinkText() {
        return linkText;
    }

    /**
     * @param linkText the linkText to set
     */
    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

   
    
}
