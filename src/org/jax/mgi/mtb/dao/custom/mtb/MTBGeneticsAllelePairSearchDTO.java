/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsAllelePairSearchDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

/**
 * A <code>DTO</code> for <code>AllelePair</code> search data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsAllelePairSearchDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBGeneticsAllelePairSearchDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int allelePairKey = -1;
    private int allele1Key = -1;
    private int allele2Key = -1;
    private String allele1Name = null;
    private String allele2Name = null;
    private String allele1Type = null;
    private String allele2Type = null;
    private String allele1Symbol = null;
    private String allele2Symbol = null;
    private int numAssociatedStrains = 0;
    private int numAssociatedTFs = 0;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    /**
     *
     * @param apKey
     */
    public final void setAllelePairKey(int apKey) {
        this.allelePairKey = apKey;
    }

    /**
     *
     * @return
     */
    public final int getAllelePairKey() {
        return this.allelePairKey;
    }

    /**
     *
     * @return
     */
    public int getAllele1Key() {
        return allele1Key;
    }

    /**
     *
     * @param allele1Key
     */
    public void setAllele1Key(int allele1Key) {
        this.allele1Key = allele1Key;
    }

    /**
     *
     * @return
     */
    public int getAllele2Key() {
        return allele2Key;
    }

    /**
     *
     * @param allele2Key
     */
    public void setAllele2Key(int allele2Key) {
        this.allele2Key = allele2Key;
    }

    /**
     *
     * @return
     */
    public String getAllele1Name() {
        return allele1Name;
    }

    /**
     *
     * @param allele1Name
     */
    public void setAllele1Name(String allele1Name) {
        this.allele1Name = allele1Name;
    }

    /**
     *
     * @return
     */
    public String getAllele2Name() {
        return allele2Name;
    }

    /**
     *
     * @param allele2Name
     */
    public void setAllele2Name(String allele2Name) {
        this.allele2Name = allele2Name;
    }

    /**
     *
     * @return
     */
    public String getAllele1Type() {
        return allele1Type;
    }

    /**
     *
     * @param allele1Type
     */
    public void setAllele1Type(String allele1Type) {
        this.allele1Type = allele1Type;
    }

    /**
     *
     * @return
     */
    public String getAllele2Type() {
        return allele2Type;
    }

    /**
     *
     * @param allele2Type
     */
    public void setAllele2Type(String allele2Type) {
        this.allele2Type = allele2Type;
    }

    /**
     *
     * @return
     */
    public String getAllele1Symbol() {
        return allele1Symbol;
    }

    /**
     *
     * @param allele1Symbol
     */
    public void setAllele1Symbol(String allele1Symbol) {
        this.allele1Symbol = allele1Symbol;
    }

    /**
     *
     * @return
     */
    public String getAllele2Symbol() {
        return allele2Symbol;
    }

    /**
     *
     * @param allele2Symbol
     */
    public void setAllele2Symbol(String allele2Symbol) {
        this.allele2Symbol = allele2Symbol;
    }

    /**
     *
     * @return
     */
    public int getNumAssociatedStrains() {
        return numAssociatedStrains;
    }

    /**
     *
     * @param numAssociatedStrains
     */
    public void setNumAssociatedStrains(int numAssociatedStrains) {
        this.numAssociatedStrains = numAssociatedStrains;
    }

    /**
     *
     * @return
     */
    public int getNumAssociatedTFs() {
        return numAssociatedTFs;
    }

    /**
     *
     * @param numAssociatedTFs
     */
    public void setNumAssociatedTFs(int numAssociatedTFs) {
        this.numAssociatedTFs = numAssociatedTFs;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}