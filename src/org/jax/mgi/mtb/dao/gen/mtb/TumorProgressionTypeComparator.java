
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorProgressionTypeDTO objects.
 */
public class TumorProgressionTypeComparator
       implements Comparator<TumorProgressionTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorProgressionTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorProgressionTypeComparator(TumorProgressionTypeDAO._TUMORPROGRESSIONTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorProgressionTypeDAO.ID__TUMORPROGRESSIONTYPE_KEY
     *   <li>TumorProgressionTypeDAO.ID_NAME
     *   <li>TumorProgressionTypeDAO.ID_DESCRIPTION
     *   <li>TumorProgressionTypeDAO.ID_CREATE_USER
     *   <li>TumorProgressionTypeDAO.ID_CREATE_DATE
     *   <li>TumorProgressionTypeDAO.ID_UPDATE_USER
     *   <li>TumorProgressionTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorProgressionTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorProgressionTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorProgressionTypeComparator(TumorProgressionTypeDAO._TUMORPROGRESSIONTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorProgressionTypeDAO.ID__TUMORPROGRESSIONTYPE_KEY
     *   <li>TumorProgressionTypeDAO.ID_NAME
     *   <li>TumorProgressionTypeDAO.ID_DESCRIPTION
     *   <li>TumorProgressionTypeDAO.ID_CREATE_USER
     *   <li>TumorProgressionTypeDAO.ID_CREATE_DATE
     *   <li>TumorProgressionTypeDAO.ID_UPDATE_USER
     *   <li>TumorProgressionTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorProgressionTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorProgressionTypeDTO dto1, TumorProgressionTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorProgressionTypeDAO.ID__TUMORPROGRESSIONTYPE_KEY:
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
            case TumorProgressionTypeDAO.ID_NAME:
                if (dto1.getName() == null && dto2.getName() != null) {
                    nReturn = -1;
                } else if (dto1.getName() == null && dto2.getName() == null) {
                    nReturn = 0;
                } else if (dto1.getName() != null && dto2.getName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getName().compareTo(dto2.getName());
                }
                break;
            case TumorProgressionTypeDAO.ID_DESCRIPTION:
                if (dto1.getDescription() == null && dto2.getDescription() != null) {
                    nReturn = -1;
                } else if (dto1.getDescription() == null && dto2.getDescription() == null) {
                    nReturn = 0;
                } else if (dto1.getDescription() != null && dto2.getDescription() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getDescription().compareTo(dto2.getDescription());
                }
                break;
            case TumorProgressionTypeDAO.ID_CREATE_USER:
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
            case TumorProgressionTypeDAO.ID_CREATE_DATE:
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
            case TumorProgressionTypeDAO.ID_UPDATE_USER:
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
            case TumorProgressionTypeDAO.ID_UPDATE_DATE:
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
