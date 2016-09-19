
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the LabelStatusDTO objects.
 */
public class LabelStatusComparator
       implements Comparator<LabelStatusDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for LabelStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new LabelStatusComparator(LabelStatusDAO._LABELSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>LabelStatusDAO.ID__LABELSTATUS_KEY
     *   <li>LabelStatusDAO.ID_STATUS
     *   <li>LabelStatusDAO.ID_CREATE_USER
     *   <li>LabelStatusDAO.ID_CREATE_DATE
     *   <li>LabelStatusDAO.ID_UPDATE_USER
     *   <li>LabelStatusDAO.ID_UPDATE_DATE
     * </ul>
     */
    public LabelStatusComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for LabelStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new LabelStatusComparator(LabelStatusDAO._LABELSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>LabelStatusDAO.ID__LABELSTATUS_KEY
     *   <li>LabelStatusDAO.ID_STATUS
     *   <li>LabelStatusDAO.ID_CREATE_USER
     *   <li>LabelStatusDAO.ID_CREATE_DATE
     *   <li>LabelStatusDAO.ID_UPDATE_USER
     *   <li>LabelStatusDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public LabelStatusComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(LabelStatusDTO dto1, LabelStatusDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case LabelStatusDAO.ID__LABELSTATUS_KEY:
                if (dto1.getLabelStatusKey() == null && dto2.getLabelStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getLabelStatusKey() == null && dto2.getLabelStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getLabelStatusKey() != null && dto2.getLabelStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLabelStatusKey().compareTo(dto2.getLabelStatusKey());
                }
                break;
            case LabelStatusDAO.ID_STATUS:
                if (dto1.getStatus() == null && dto2.getStatus() != null) {
                    nReturn = -1;
                } else if (dto1.getStatus() == null && dto2.getStatus() == null) {
                    nReturn = 0;
                } else if (dto1.getStatus() != null && dto2.getStatus() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStatus().compareTo(dto2.getStatus());
                }
                break;
            case LabelStatusDAO.ID_CREATE_USER:
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
            case LabelStatusDAO.ID_CREATE_DATE:
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
            case LabelStatusDAO.ID_UPDATE_USER:
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
            case LabelStatusDAO.ID_UPDATE_DATE:
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
