/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchGenotypeComparator.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Comparator;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBGeneticsSearchGenotypeDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchGenotypeComparator.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBGeneticsSearchGenotypeComparator
       implements Comparator<MTBGeneticsSearchGenotypeDTO> {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    /**
     * Holds the field on which the comparison is performed.
     */
    protected int nColumn;

    /**
     * Value that will contain the information about the order of the sort:
     * normal or reversal.
     */
    protected boolean bReverse = false;


    // ----------------------------------------------------------- Constructors

    /**
     * Constructor.
     *
     * @param nCol the column
     */
    public MTBGeneticsSearchGenotypeComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBGeneticsSearchGenotypeComparator(int nCol, boolean bReverse) {
        this.nColumn = nCol;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     *
     * @param pObj1 the first object to be compared.
     * @param pObj2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     *         first argument is less than, equal to, or greater than the
     *         second.
     * @throws ClassCastException if the arguments' types prevent them from
     *         being compared by this Comparator.
     * @throws IllegalArgumentException if the column to sort on is not defined
     */
    public int compare(MTBGeneticsSearchGenotypeDTO pObj1,
                       MTBGeneticsSearchGenotypeDTO pObj2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBGeneticsUtilDAO.ID_GENOTYPE:
                nReturn = StringUtils.compare(pObj1.getAllele1Symbol()+"/"+pObj1.getAllele2Symbol(),
                                         pObj2.getAllele1Symbol()+"/"+pObj2.getAllele2Symbol());
                break;
            default:
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}