/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

import java.util.ArrayList;

/**
 *
 * @author sbn
 */
public class GenomicsLink {
    
    private String sample = "";
    private String passage = "";
    private String platform = "";
    private String derivedLink = "";
    private ArrayList<String> rawLinks = new ArrayList<>();

    /**
     * @return the sample
     */
    public String getSample() {
        return sample;
    }

    /**
     * @param sample the sample to set
     */
    public void setSample(String sample) {
        this.sample = sample;
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
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return the derivedLink
     */
    public String getDerivedLink() {
        return derivedLink;
    }

    /**
     * @param derivedLink the derivedLink to set
     */
    public void setDerivedLink(String derivedLink) {
        this.derivedLink = derivedLink;
    }

    /**
     * @return the rawLinks
     */
    public ArrayList<String> getRawLinks() {
        return rawLinks;
    }

    /**
     * @param rawLinks the rawLink to add
     */
    public void addRawLinks( String rawLink) {
        this.rawLinks.add(rawLink);
    }
            
            
    
    
}
