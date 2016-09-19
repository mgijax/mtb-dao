/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainGeneticsDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import org.jax.mgi.mtb.dao.gen.TableDTO;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for strain genetics search data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainGeneticsDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainGeneticsDTO extends TableDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int genotypeId = -1;
    private int markerId = -1;
    private String markerName;
    private String markerSymbol;
    private String markerUrl;
    private String chromosome;
    private String organism;
    private int allelePairId = -1;
    private int allele1Id = -1;
    private String allele1Name;
    private String allele1Symbol;
    private String allele1Type;
    private String allele1Url;
    private int allele2Id = -1;
    private String allele2Name;
    private String allele2Symbol;
    private String allele2Type;
    private String allele2Url;
    private int referenceId = -1;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final void setGenotypeId(int id) {
        this.genotypeId = id;
    }

    public final int getGenotypeId() {
        return this.genotypeId;
    }

    public final void setMarkerId(int id) {
        this.markerId = id;
    }

    public final int getMarkerId() {
        return this.markerId;
    }

    public final void setMarkerName(String name) {
        this.markerName = name;
    }

    public final String getMarkerName() {
        return this.markerName;
    }

    public final void setMarkerSymbol(String symbol) {
        this.markerSymbol = symbol;
    }

    public final String getMarkerSymbol() {
        return this.markerSymbol;
    }

    public final void setMarkerUrl(String url) {
        this.markerUrl = url;
    }

    public final String getMarkerUrl() {
        return this.markerUrl;
    }

    public final void setChromosome(String c) {
        this.chromosome = c;
    }

    public final String getChromosome() {
        return this.chromosome;
    }

    public final void setOrganism(String org) {
        this.organism = org;
    }

    public final String getOrganism() {
        return this.organism;
    }

    public final void setAllelePairId(int id) {
        this.allelePairId = id;
    }

    public final int getAllelePairId() {
        return this.allelePairId;
    }

    public final void setAllele1Id(int id) {
        this.allele1Id = id;
    }

    public final int getAllele1Id() {
        return this.allele1Id;
    }

    public final void setAllele1Name(String name) {
        this.allele1Name = name;
    }

    public final String getAllele1Name() {
        return this.allele1Name;
    }

    public final void setAllele1Symbol(String symbol) {
        this.allele1Symbol = symbol;
    }

    public final String getAllele1Symbol() {
        return this.allele1Symbol;
    }

    public final void setAllele1Type(String type) {
        this.allele1Type = type;
    }

    public final String getAllele1Type() {
        return this.allele1Type;
    }

    public final void setAllele1Url(String url) {
        this.allele1Url = url;
    }

    public final String getAllele1Url() {
        return this.allele1Url;
    }

    public final void setAllele2Id(int id) {
        this.allele2Id = id;
    }

    public final int getAllele2Id() {
        return this.allele2Id;
    }

    public final void setAllele2Name(String name) {
        this.allele2Name = name;
    }

    public final String getAllele2Name() {
        return this.allele2Name;
    }

    public final void setAllele2Symbol(String symbol) {
        this.allele2Symbol = symbol;
    }

    public final String getAllele2Symbol() {
        return this.allele2Symbol;
    }

    public final void setAllele2Type(String type) {
        this.allele2Type = type;
    }

    public final String getAllele2Type() {
        return this.allele2Type;
    }

    public final void setAllele2Url(String url) {
        this.allele2Url = url;
    }

    public final String getAllele2Url() {
        return this.allele2Url;
    }

    public final String getAlleleTypes() {
        String ret = "";

        if (StringUtils.hasValue(getAllele1Type()) && StringUtils.hasValue(getAllele2Type())) {
            if (StringUtils.equals(getAllele1Type(), getAllele2Type())) {
                ret = getAllele1Type();
            } else {
                ret = getAllele1Type() + " / " + getAllele2Type();
            }
        } else if (!StringUtils.hasValue(getAllele1Type()) && StringUtils.hasValue(getAllele2Type())) {
            ret = getAllele2Type();
        } else if (StringUtils.hasValue(getAllele1Type()) && !StringUtils.hasValue(getAllele2Type())) {
            ret = getAllele1Type();
        } else {
            ret = "Unknown";
        }

        return ret;
    }

    public final void setReferenceId(int id) {
        this.referenceId = id;
    }

    public final int getReferenceId() {
        return this.referenceId;
    }

    public boolean isModified() {
        return false;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}