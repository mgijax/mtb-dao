
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBViewStatusDTO objects.
 */
public class MTBViewStatusComparator
       implements Comparator<MTBViewStatusDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBViewStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBViewStatusComparator(MTBViewStatusDAO._MTBVIEWSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBViewStatusDAO.ID__MTBVIEWSTATUS_KEY
     *   <li>MTBViewStatusDAO.ID_VIEWSTATUS
     *   <li>MTBViewStatusDAO.ID_CREATE_USER
     *   <li>MTBViewStatusDAO.ID_CREATE_DATE
     *   <li>MTBViewStatusDAO.ID_UPDATE_USER
     *   <li>MTBViewStatusDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MTBViewStatusComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBViewStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBViewStatusComparator(MTBViewStatusDAO._MTBVIEWSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBViewStatusDAO.ID__MTBVIEWSTATUS_KEY
     *   <li>MTBViewStatusDAO.ID_VIEWSTATUS
     *   <li>MTBViewStatusDAO.ID_CREATE_USER
     *   <li>MTBViewStatusDAO.ID_CREATE_DATE
     *   <li>MTBViewStatusDAO.ID_UPDATE_USER
     *   <li>MTBViewStatusDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBViewStatusComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBViewStatusDTO dto1, MTBViewStatusDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBViewStatusDAO.ID__MTBVIEWSTATUS_KEY:
                if (dto1.getMTBViewStatusKey() == null && dto2.getMTBViewStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBViewStatusKey() == null && dto2.getMTBViewStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBViewStatusKey() != null && dto2.getMTBViewStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBViewStatusKey().compareTo(dto2.getMTBViewStatusKey());
                }
                break;
            case MTBViewStatusDAO.ID_VIEWSTATUS:
                if (dto1.getViewStatus() == null && dto2.getViewStatus() != null) {
                    nReturn = -1;
                } else if (dto1.getViewStatus() == null && dto2.getViewStatus() == null) {
                    nReturn = 0;
                } else if (dto1.getViewStatus() != null && dto2.getViewStatus() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getViewStatus().compareTo(dto2.getViewStatus());
                }
                break;
            case MTBViewStatusDAO.ID_CREATE_USER:
                if (dto1.getCreateUser() == null && dto2.getCreateUser() != null) {
                    nReturn = -1;
                } else if (dto1.getCreateUser() == null && dto2.getCreateUser() == null) {
                    nReturn = 0;
                } else if (dto1.getCreateUser() != null && dto2.getCreateUser() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCreateUser().compareTo(dto2.getCreateUser());
                }
                break;
            case MTBViewStatusDAO.ID_CREATE_DATE:
                if (dto1.getCreateDate() == null && dto2.getCreateDate() != null) {
                    nReturn = -1;
                } else if (dto1.getCreateDate() == null && dto2.getCreateDate() == null) {
                    nReturn = 0;
                } else if (dto1.getCreateDate() != null && dto2.getCreateDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCreateDate().compareTo(dto2.getCreateDate());
                }
                break;
            case MTBViewStatusDAO.ID_UPDATE_USER:
                if (dto1.getUpdateUser() == null && dto2.getUpdateUser() != null) {
                    nReturn = -1;
                } else if (dto1.getUpdateUser() == null && dto2.getUpdateUser() == null) {
                    nReturn = 0;
                } else if (dto1.getUpdateUser() != null && dto2.getUpdateUser() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUpdateUser().compareTo(dto2.getUpdateUser());
                }
                break;
            case MTBViewStatusDAO.ID_UPDATE_DATE:
                if (dto1.getUpdateDate() == null && dto2.getUpdateDate() != null) {
                    nReturn = -1;
                } else if (dto1.getUpdateDate() == null && dto2.getUpdateDate() == null) {
                    nReturn = 0;
                } else if (dto1.getUpdateDate() != null && dto2.getUpdateDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUpdateDate().compareTo(dto2.getUpdateDate());
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
