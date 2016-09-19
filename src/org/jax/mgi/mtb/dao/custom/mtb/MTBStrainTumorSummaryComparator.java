/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorSummaryComparator.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBStrainTumorSummaryDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorSummaryComparator.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBStrainTumorSummaryComparator
        implements Comparator<MTBStrainTumorSummaryDTO> {

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
    public MTBStrainTumorSummaryComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBStrainTumorSummaryComparator(int nCol, boolean bReverse) {
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
    public int compare(MTBStrainTumorSummaryDTO pObj1,
                       MTBStrainTumorSummaryDTO pObj2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBTumorUtilDAO.ID_ORGAN:
                nReturn = StringUtils.compare(pObj1.getTumorName(),
                                              pObj2.getTumorName(), true);
                break;
            case MTBTumorUtilDAO.ID_STRAIN:
                nReturn = StringUtils.compare(pObj1.getStrainName(),
                                              pObj2.getStrainName(), true);
                break;
            case MTBAdvancedSearchDAO.ID_TUMOR_CLASS:
                nReturn = StringUtils.compare(pObj1.getTumorClassName(),
                                              pObj2.getTumorClassName(), true);
                break;
            case MTBAdvancedSearchDAO.ID_STRAIN_TYPE:
                List arrTypes1 = new ArrayList<String>(pObj1.getStrainTypesCollection());
                List arrTypes2 = new ArrayList<String>(pObj2.getStrainTypesCollection());

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
            case MTBAdvancedSearchDAO.ID_TREATMENT_TYPE:
                nReturn = StringUtils.compare(pObj1.getTreatmentType(),
                                              pObj2.getTreatmentType());
                break;
            default:
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }
        
        // use TFKey to impose an absolute order on otherwise matching objects
        if(nReturn == 0){
          nReturn = (new Integer(pObj1.getFrequencyKey())).compareTo(new Integer(pObj2.getFrequencyKey()));
        }
        return bReverse ? (-1 * nReturn) : nReturn;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
