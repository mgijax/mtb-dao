
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorProgressionDTO objects.
 */
public class TumorProgressionComparator
       implements Comparator<TumorProgressionDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorProgressionComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorProgressionComparator(TumorProgressionDAO._TUMORPROGRESSION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorProgressionDAO.ID__TUMORPROGRESSION_KEY
     *   <li>TumorProgressionDAO.ID__PARENT_KEY
     *   <li>TumorProgressionDAO.ID__CHILD_KEY
     *   <li>TumorProgressionDAO.ID__TUMORPROGRESSIONTYPE_KEY
     *   <li>TumorProgressionDAO.ID_CREATE_USER
     *   <li>TumorProgressionDAO.ID_CREATE_DATE
     *   <li>TumorProgressionDAO.ID_UPDATE_USER
     *   <li>TumorProgressionDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorProgressionComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorProgressionComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorProgressionComparator(TumorProgressionDAO._TUMORPROGRESSION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorProgressionDAO.ID__TUMORPROGRESSION_KEY
     *   <li>TumorProgressionDAO.ID__PARENT_KEY
     *   <li>TumorProgressionDAO.ID__CHILD_KEY
     *   <li>TumorProgressionDAO.ID__TUMORPROGRESSIONTYPE_KEY
     *   <li>TumorProgressionDAO.ID_CREATE_USER
     *   <li>TumorProgressionDAO.ID_CREATE_DATE
     *   <li>TumorProgressionDAO.ID_UPDATE_USER
     *   <li>TumorProgressionDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorProgressionComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorProgressionDTO dto1, TumorProgressionDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorProgressionDAO.ID__TUMORPROGRESSION_KEY:
                if (dto1.getTumorProgressionKey() == null && dto2.getTumorProgressionKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorProgressionKey() == null && dto2.getTumorProgressionKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorProgressionKey() != null && dto2.getTumorProgressionKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorProgressionKey().compareTo(dto2.getTumorProgressionKey());
                }
                break;
            case TumorProgressionDAO.ID__PARENT_KEY:
                if (dto1.getParentKey() == null && dto2.getParentKey() != null) {
                    nReturn = -1;
                } else if (dto1.getParentKey() == null && dto2.getParentKey() == null) {
                    nReturn = 0;
                } else if (dto1.getParentKey() != null && dto2.getParentKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getParentKey().compareTo(dto2.getParentKey());
                }
                break;
            case TumorProgressionDAO.ID__CHILD_KEY:
                if (dto1.getChildKey() == null && dto2.getChildKey() != null) {
                    nReturn = -1;
                } else if (dto1.getChildKey() == null && dto2.getChildKey() == null) {
                    nReturn = 0;
                } else if (dto1.getChildKey() != null && dto2.getChildKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getChildKey().compareTo(dto2.getChildKey());
                }
                break;
            case TumorProgressionDAO.ID__TUMORPROGRESSIONTYPE_KEY:
                if (dto1.getTumorProgressionTypeKey() == null && dto2.getTumorProgressionTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorProgressionTypeKey() == null && dto2.getTumorProgressionTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorProgressionTypeKey() != null && dto2.getTumorProgressionTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorProgressionTypeKey().compareTo(dto2.getTumorProgressionTypeKey());
                }
                break;
            case TumorProgressionDAO.ID_CREATE_USER:
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
            case TumorProgressionDAO.ID_CREATE_DATE:
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
            case TumorProgressionDAO.ID_UPDATE_USER:
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
            case TumorProgressionDAO.ID_UPDATE_DATE:
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
