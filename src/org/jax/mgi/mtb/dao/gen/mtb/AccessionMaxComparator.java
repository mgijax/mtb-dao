
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AccessionMaxDTO objects.
 */
public class AccessionMaxComparator
       implements Comparator<AccessionMaxDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AccessionMaxComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AccessionMaxComparator(AccessionMaxDAO.PREFIXPART, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AccessionMaxDAO.ID_PREFIXPART
     *   <li>AccessionMaxDAO.ID_MAXNUMERICPART
     * </ul>
     */
    public AccessionMaxComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AccessionMaxComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AccessionMaxComparator(AccessionMaxDAO.PREFIXPART, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AccessionMaxDAO.ID_PREFIXPART
     *   <li>AccessionMaxDAO.ID_MAXNUMERICPART
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AccessionMaxComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AccessionMaxDTO dto1, AccessionMaxDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AccessionMaxDAO.ID_PREFIXPART:
                if (dto1.getPrefixPart() == null && dto2.getPrefixPart() != null) {
                    nReturn = -1;
                } else if (dto1.getPrefixPart() == null && dto2.getPrefixPart() == null) {
                    nReturn = 0;
                } else if (dto1.getPrefixPart() != null && dto2.getPrefixPart() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPrefixPart().compareTo(dto2.getPrefixPart());
                }
                break;
            case AccessionMaxDAO.ID_MAXNUMERICPART:
                if (dto1.getMaxNumericPart() == null && dto2.getMaxNumericPart() != null) {
                    nReturn = -1;
                } else if (dto1.getMaxNumericPart() == null && dto2.getMaxNumericPart() == null) {
                    nReturn = 0;
                } else if (dto1.getMaxNumericPart() != null && dto2.getMaxNumericPart() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMaxNumericPart().compareTo(dto2.getMaxNumericPart());
                }
                break;
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }
// class+ 

// class- 

}
