/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceSearchComparator.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Comparator;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBReferenceSearchDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceSearchComparator.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBReferenceSearchComparator
       implements Comparator<MTBReferenceSearchDTO>  {

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
    public MTBReferenceSearchComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBReferenceSearchComparator(int nCol, boolean bReverse) {
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
    public int compare(MTBReferenceSearchDTO pObj1, MTBReferenceSearchDTO pObj2) {
        int nReturn = 0;

        switch(nColumn) {
            case MTBReferenceUtilDAO.ID_FIRST_AUTHOR:
                nReturn = StringUtils.compare(pObj1.getFirstAuthor(), pObj1.getFirstAuthor());
                break;
            case MTBReferenceUtilDAO.ID_JNUMBER:
                nReturn = StringUtils.compare(pObj1.getAccId(), pObj1.getAccId());
                break;
            case MTBReferenceUtilDAO.ID_YEAR:
                int year1 = -1;
                try {
                    year1 = Integer.parseInt(pObj1.getYear());
                } catch (Exception e) {}

                int year2 = -1;
                try {
                    year2 = Integer.parseInt(pObj1.getYear());
                } catch (Exception e) {}

                if (year1 > year2) {
                    nReturn = -1;
                } else if (year1 == year2) {
                    nReturn = 0;
                } else if (year1 < year2) {
                    nReturn = 1;
                }
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