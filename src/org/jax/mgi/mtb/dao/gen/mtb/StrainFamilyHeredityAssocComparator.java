
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainFamilyHeredityAssocDTO objects.
 */
public class StrainFamilyHeredityAssocComparator
       implements Comparator<StrainFamilyHeredityAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainFamilyHeredityAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainFamilyHeredityAssocComparator(StrainFamilyHeredityAssocDAO._STRAINFAMILY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainFamilyHeredityAssocDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainFamilyHeredityAssocDAO.ID__STRAINHEREDITY_KEY
     *   <li>StrainFamilyHeredityAssocDAO.ID_DESCRIPTION
     *   <li>StrainFamilyHeredityAssocDAO.ID_ORDERING
     *   <li>StrainFamilyHeredityAssocDAO.ID_CREATE_USER
     *   <li>StrainFamilyHeredityAssocDAO.ID_CREATE_DATE
     *   <li>StrainFamilyHeredityAssocDAO.ID_UPDATE_USER
     *   <li>StrainFamilyHeredityAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainFamilyHeredityAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainFamilyHeredityAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainFamilyHeredityAssocComparator(StrainFamilyHeredityAssocDAO._STRAINFAMILY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainFamilyHeredityAssocDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainFamilyHeredityAssocDAO.ID__STRAINHEREDITY_KEY
     *   <li>StrainFamilyHeredityAssocDAO.ID_DESCRIPTION
     *   <li>StrainFamilyHeredityAssocDAO.ID_ORDERING
     *   <li>StrainFamilyHeredityAssocDAO.ID_CREATE_USER
     *   <li>StrainFamilyHeredityAssocDAO.ID_CREATE_DATE
     *   <li>StrainFamilyHeredityAssocDAO.ID_UPDATE_USER
     *   <li>StrainFamilyHeredityAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainFamilyHeredityAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainFamilyHeredityAssocDTO dto1, StrainFamilyHeredityAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainFamilyHeredityAssocDAO.ID__STRAINFAMILY_KEY:
                if (dto1.getStrainFamilyKey() == null && dto2.getStrainFamilyKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainFamilyKey() == null && dto2.getStrainFamilyKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainFamilyKey() != null && dto2.getStrainFamilyKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainFamilyKey().compareTo(dto2.getStrainFamilyKey());
                }
                break;
            case StrainFamilyHeredityAssocDAO.ID__STRAINHEREDITY_KEY:
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
            case StrainFamilyHeredityAssocDAO.ID_DESCRIPTION:
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
            case StrainFamilyHeredityAssocDAO.ID_ORDERING:
                if (dto1.getOrdering() == null && dto2.getOrdering() != null) {
                    nReturn = -1;
                } else if (dto1.getOrdering() == null && dto2.getOrdering() == null) {
                    nReturn = 0;
                } else if (dto1.getOrdering() != null && dto2.getOrdering() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrdering().compareTo(dto2.getOrdering());
                }
                break;
            case StrainFamilyHeredityAssocDAO.ID_CREATE_USER:
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
            case StrainFamilyHeredityAssocDAO.ID_CREATE_DATE:
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
            case StrainFamilyHeredityAssocDAO.ID_UPDATE_USER:
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
            case StrainFamilyHeredityAssocDAO.ID_UPDATE_DATE:
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
