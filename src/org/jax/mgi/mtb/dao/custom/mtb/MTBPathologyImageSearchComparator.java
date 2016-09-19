/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageSearchComparator.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBPathologyImageSearchDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageSearchComparator.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBPathologyImageSearchComparator
       implements Comparator<MTBPathologyImageSearchDTO> {

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
    public MTBPathologyImageSearchComparator(int nCol) {
        this(nCol, false);
    }

    /**
     * Constructor.
     *
     * @param nCol the column
     * @param bReverse set this value to true, if you want to reverse the
     *        sorting results
     */
    public MTBPathologyImageSearchComparator(int nCol, boolean bReverse) {
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
    public int compare(MTBPathologyImageSearchDTO pObj1,
                       MTBPathologyImageSearchDTO pObj2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBPathologyImageUtilDAO.ID_ORGAN:
                nReturn = StringUtils.compare(pObj1.getOrganOriginName(),
                                              pObj2.getOrganOriginName(),
                                              true);
                break;
            case MTBPathologyImageUtilDAO.ID_STRAIN:
                nReturn = StringUtils.compare(pObj1.getStrainName(),
                                              pObj2.getStrainName(),
                                              true);
                break;
            case MTBPathologyImageUtilDAO.ID_ANTIBODY:
                List<String> listAgents1 = null;
                List<String> listAgents2 = null;
                try{
                  listAgents1 = new ArrayList<String>(pObj1.getAgents());
                }catch(Exception e){}
                
                try{
                  listAgents2 = new ArrayList<String>(pObj2.getAgents());
                }catch(Exception e){}

                if (listAgents1 == null && listAgents2 != null) {
                    nReturn = -1;
                } else if (listAgents1 == null && listAgents2 == null) {
                    nReturn = 0;
                } else if (listAgents1 != null && listAgents2 == null) {
                    nReturn = 1;
                } else {
                    // compare each item in the array
                    int i1 = listAgents1.size();
                    int i2 = listAgents2.size();
                    int items = Math.max(i1, i2);

                    for (int i = 0; i < items; i++) {
                        if (listAgents1 == null && listAgents2 != null) {
                            nReturn = -1;
                        } else if (listAgents1 == null && listAgents2 == null) {
                            nReturn = 0;
                        } else if (listAgents1 != null && listAgents2 == null) {
                            nReturn = 1;
                        } else {
                            String s1 = (i < i1) ? listAgents1.get(i) : "";
                            String s2 = (i < i2) ? listAgents2.get(i) : "";

                            int val = StringUtils.compare(s1, s2);

                            if (val != 0) {
                                nReturn = val;
                                break;
                            }
                        }
                    }
                }
                break;
            case MTBPathologyImageUtilDAO.ID_METHOD:
                nReturn = StringUtils.compare(pObj1.getStainMethod(), pObj2.getStainMethod());
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