
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainFamilyDTO objects.
 */
public class StrainFamilyComparator
       implements Comparator<StrainFamilyDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainFamilyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainFamilyComparator(StrainFamilyDAO._STRAINFAMILY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainFamilyDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainFamilyDAO.ID_FAMILY
     *   <li>StrainFamilyDAO.ID_CREATE_USER
     *   <li>StrainFamilyDAO.ID_CREATE_DATE
     *   <li>StrainFamilyDAO.ID_UPDATE_USER
     *   <li>StrainFamilyDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainFamilyComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainFamilyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainFamilyComparator(StrainFamilyDAO._STRAINFAMILY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainFamilyDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainFamilyDAO.ID_FAMILY
     *   <li>StrainFamilyDAO.ID_CREATE_USER
     *   <li>StrainFamilyDAO.ID_CREATE_DATE
     *   <li>StrainFamilyDAO.ID_UPDATE_USER
     *   <li>StrainFamilyDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainFamilyComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainFamilyDTO dto1, StrainFamilyDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainFamilyDAO.ID__STRAINFAMILY_KEY:
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
            case StrainFamilyDAO.ID_FAMILY:
                if (dto1.getFamily() == null && dto2.getFamily() != null) {
                    nReturn = -1;
                } else if (dto1.getFamily() == null && dto2.getFamily() == null) {
                    nReturn = 0;
                } else if (dto1.getFamily() != null && dto2.getFamily() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getFamily().compareTo(dto2.getFamily());
                }
                break;
            case StrainFamilyDAO.ID_CREATE_USER:
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
            case StrainFamilyDAO.ID_CREATE_DATE:
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
            case StrainFamilyDAO.ID_UPDATE_USER:
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
            case StrainFamilyDAO.ID_UPDATE_DATE:
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
