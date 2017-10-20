/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

/**
 * Base class for all pdx content types
 * @author sbn
 */
public class PDXContent {
    
    private int contentKey;
    private String modelID;
    private String user;
    
    private int characterization;
    
    // characterization keys
    public static final int HISTOLOGY=1;
    public static final int TUMOR_MARKER=2;
    public static final int GENE_EXPRESSION = 3;
    public static final int CNV = 4;
    public static final int MUTATION = 5;
    public static final int DRUG_SENSITIVITY = 6;
    public static final int ADDITIONAL_GRAPHIC= 7;
    public static final int TUMOR_GROWTH_RATE=8;
    public static final int HISTOLOGY_SUMMARY = 9;
    public static final int PATHOLOGIST = 10;
    public static final int REFERENCE = 11;

    /**
     * @return the modelID
     */
    public String getModelID() {
        return modelID;
    }

    /**
     * @param modelID the modelID to set
     */
    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the characterization
     */
    public int getCharacterization() {
        return characterization;
    }

    /**
     * @param characterization the characterization to set
     */
    public void setCharacterization(int characterization) {
        this.characterization = characterization;
    }

    /**
     * @return the contentKey
     */
    public int getContentKey() {
        return contentKey;
    }

    /**
     * @param contentKey the contentKey to set
     */
    public void setContentKey(int contentKey) {
        this.contentKey = contentKey;
    }
    
    
}
