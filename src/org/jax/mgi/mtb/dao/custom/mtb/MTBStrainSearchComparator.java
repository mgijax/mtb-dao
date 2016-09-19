/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainSearchComparator.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBStrainSearchDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainSearchComparator.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainSearchComparator
       implements Comparator<MTBStrainSearchDTO> {

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
    public MTBStrainSearchComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBStrainSearchComparator(int nCol, boolean bReverse) {
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
    public int compare(MTBStrainSearchDTO pObj1, MTBStrainSearchDTO pObj2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBStrainUtilDAO.ID_STRAIN_ID:
                nReturn = (new Long(pObj1.getKey())).compareTo(
                                    new Long(pObj2.getKey()));
                break;
            case MTBStrainUtilDAO.ID_STRAIN_NAME:
                nReturn = StringUtils.compare(pObj1.getName(),
                                              pObj2.getName(), true);
                break;
            case MTBStrainUtilDAO.ID_STRAIN_TYPE:
                List<String> arrTypes1 = new ArrayList<String>(pObj1.getTypes());
                List<String> arrTypes2 = new ArrayList<String>(pObj2.getTypes());

                if (arrTypes1 == null && arrTypes2 != null) {
                    nReturn = -1;
                } else if (arrTypes1 == null && arrTypes2 == null) {
                    nReturn = 0;
                } else if (arrTypes1 != null && arrTypes2 == null) {
                    nReturn = 1;
                } else {
                    // compare each item in the array
                    int i1 = arrTypes1.size();
                    int i2 = arrTypes2.size();

                    int items = Math.max(i1, i2);

                    for (int i = 0; i < items; i++) {
                        Object obj1 = null;
                        Object obj2 = null;

                        try {
                            obj1 = arrTypes1.get(i);
                        } catch (Exception e1) {}

                        try {
                            obj2 = arrTypes2.get(i);
                        } catch (Exception e1) {}

                        if (arrTypes1 == null && arrTypes2 != null) {
                            nReturn = -1;
                        } else if (arrTypes1 == null && arrTypes2 == null) {
                            nReturn = 0;
                        } else if (arrTypes1 != null && arrTypes2 == null) {
                            nReturn = 1;
                        } else {
                            nReturn = StringUtils.compare((String)obj1,
                                                          (String)obj2);

                            if (nReturn != 0) {
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                throw new IllegalArgumentException(
                        "Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}