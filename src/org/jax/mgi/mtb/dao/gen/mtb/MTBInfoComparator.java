
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBInfoDTO objects.
 */
public class MTBInfoComparator
       implements Comparator<MTBInfoDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBInfoComparator(MTBInfoDAO._MTBINFO_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBInfoDAO.ID__MTBINFO_KEY
     *   <li>MTBInfoDAO.ID_MTBPROPERTY
     *   <li>MTBInfoDAO.ID_MTBVALUE
     * </ul>
     */
    public MTBInfoComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBInfoComparator(MTBInfoDAO._MTBINFO_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBInfoDAO.ID__MTBINFO_KEY
     *   <li>MTBInfoDAO.ID_MTBPROPERTY
     *   <li>MTBInfoDAO.ID_MTBVALUE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBInfoComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBInfoDTO dto1, MTBInfoDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBInfoDAO.ID__MTBINFO_KEY:
                if (dto1.getMTBInfoKey() == null && dto2.getMTBInfoKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBInfoKey() == null && dto2.getMTBInfoKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBInfoKey() != null && dto2.getMTBInfoKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBInfoKey().compareTo(dto2.getMTBInfoKey());
                }
                break;
            case MTBInfoDAO.ID_MTBPROPERTY:
                if (dto1.getMTBProperty() == null && dto2.getMTBProperty() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBProperty() == null && dto2.getMTBProperty() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBProperty() != null && dto2.getMTBProperty() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBProperty().compareTo(dto2.getMTBProperty());
                }
                break;
            case MTBInfoDAO.ID_MTBVALUE:
                if (dto1.getMTBValue() == null && dto2.getMTBValue() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBValue() == null && dto2.getMTBValue() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBValue() != null && dto2.getMTBValue() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBValue().compareTo(dto2.getMTBValue());
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
