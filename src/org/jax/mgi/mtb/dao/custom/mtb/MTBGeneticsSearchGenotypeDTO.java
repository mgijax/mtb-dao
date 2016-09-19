/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchGenotypeDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

/**
 * A <code>DTO</code> for genetic search genotype data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchGenotypeDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBGeneticsSearchGenotypeDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String allele1Symbol = null;
    private String allele2Symbol = null;
    private int allelePairKey = -1;
    private int count = 0;

    // ----------------------------------------------------------- Constructors

    public MTBGeneticsSearchGenotypeDTO() {
    }

    public MTBGeneticsSearchGenotypeDTO(String a1Symbol, String a2Symbol) {
        setAllele1Symbol(a1Symbol);
        setAllele2Symbol(a2Symbol);
    }

    // --------------------------------------------------------- Public Methods

    public final void setAllele1Symbol(String symbol) {
        this.allele1Symbol = symbol;
    }

    public final String getAllele1Symbol() {
        return this.allele1Symbol;
    }

    public final void setAllele2Symbol(String symbol) {
        this.allele2Symbol = symbol;
    }

    public final String getAllele2Symbol() {
        return this.allele2Symbol;
    }

    public final void setCount(int n) {
        this.count = n;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setAllelePairKey(int key) {
        this.allelePairKey = key;
    }

    public final int getAllelePairKey() {
        return this.allelePairKey;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}