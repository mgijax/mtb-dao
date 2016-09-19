/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencySummaryComparator.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Comparator;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBTumorFrequencySummaryComparatorDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencySummaryComparator.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBTumorFrequencySummaryComparator
       implements Comparator<MTBTumorFrequencySummaryDTO> {

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
    public MTBTumorFrequencySummaryComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBTumorFrequencySummaryComparator(int nCol, boolean bReverse) {
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
    public int compare(MTBTumorFrequencySummaryDTO pObj1,
                       MTBTumorFrequencySummaryDTO pObj2) {
        int nRet = 0;

        //organ affected; sex; reproductive status; freq (highest on top)
        // have to look at parent frequencies first

        int a = pObj1.getSortOrder();
        int b = pObj2.getSortOrder();

        if (a < b) {
            nRet = -1;
        } else if (a > b) {
            nRet = 1;
        } else {
            boolean b1p = pObj1.getIsParent();
            boolean b2p = pObj2.getIsParent();

            if (b1p && !b2p) {
                nRet = -1;
            } else if (!b1p && b2p) {
                nRet = 1;
            }
        }

        if (nRet == 0) {
            nRet = StringUtils.compare(pObj1.getOrganAffected(),
                                       pObj2.getOrganAffected(), true);

            if (nRet == 0) {
                nRet = StringUtils.compare(pObj1.getStrainSex(),
                                           pObj2.getStrainSex(), true);

                if (nRet == 0) {
                    nRet = StringUtils.compare(pObj1.getReproductiveStatus(),
                                               pObj2.getReproductiveStatus(),
                                               true);

                    if (nRet == 0) {
                        nRet = StringUtils.compare(pObj1.getFrequencyString(),
                                                   pObj2.getFrequencyString());
                    }
                }
            }
        }

        return nRet;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
