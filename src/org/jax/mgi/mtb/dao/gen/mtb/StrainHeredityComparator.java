
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainHeredityDTO objects.
 */
public class StrainHeredityComparator
       implements Comparator<StrainHeredityDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainHeredityComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainHeredityComparator(StrainHeredityDAO._STRAINHEREDITY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainHeredityDAO.ID__STRAINHEREDITY_KEY
     *   <li>StrainHeredityDAO.ID_NAME
     *   <li>StrainHeredityDAO.ID_DESCRIPTION
     *   <li>StrainHeredityDAO.ID_CREATE_USER
     *   <li>StrainHeredityDAO.ID_CREATE_DATE
     *   <li>StrainHeredityDAO.ID_UPDATE_USER
     *   <li>StrainHeredityDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainHeredityComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainHeredityComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainHeredityComparator(StrainHeredityDAO._STRAINHEREDITY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainHeredityDAO.ID__STRAINHEREDITY_KEY
     *   <li>StrainHeredityDAO.ID_NAME
     *   <li>StrainHeredityDAO.ID_DESCRIPTION
     *   <li>StrainHeredityDAO.ID_CREATE_USER
     *   <li>StrainHeredityDAO.ID_CREATE_DATE
     *   <li>StrainHeredityDAO.ID_UPDATE_USER
     *   <li>StrainHeredityDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainHeredityComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainHeredityDTO dto1, StrainHeredityDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainHeredityDAO.ID__STRAINHEREDITY_KEY:
                if (dto1.getStrainHeredityKey() == null && dto2.getStrainHeredityKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainHeredityKey() == null && dto2.getStrainHeredityKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainHeredityKey() != null && dto2.getStrainHeredityKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainHeredityKey().compareTo(dto2.getStrainHeredityKey());
                }
                break;
            case StrainHeredityDAO.ID_NAME:
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
            case StrainHeredityDAO.ID_DESCRIPTION:
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
            case StrainHeredityDAO.ID_CREATE_USER:
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
            case StrainHeredityDAO.ID_CREATE_DATE:
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
            case StrainHeredityDAO.ID_UPDATE_USER:
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
            case StrainHeredityDAO.ID_UPDATE_DATE:
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
