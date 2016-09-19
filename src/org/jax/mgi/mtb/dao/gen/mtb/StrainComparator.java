
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainDTO objects.
 */
public class StrainComparator
       implements Comparator<StrainDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainComparator(StrainDAO._STRAIN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainDAO.ID__STRAIN_KEY
     *   <li>StrainDAO.ID_NAME
     *   <li>StrainDAO.ID_DESCRIPTION
     *   <li>StrainDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainDAO.ID_CREATE_USER
     *   <li>StrainDAO.ID_CREATE_DATE
     *   <li>StrainDAO.ID_UPDATE_USER
     *   <li>StrainDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainComparator(StrainDAO._STRAIN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainDAO.ID__STRAIN_KEY
     *   <li>StrainDAO.ID_NAME
     *   <li>StrainDAO.ID_DESCRIPTION
     *   <li>StrainDAO.ID__STRAINFAMILY_KEY
     *   <li>StrainDAO.ID_CREATE_USER
     *   <li>StrainDAO.ID_CREATE_DATE
     *   <li>StrainDAO.ID_UPDATE_USER
     *   <li>StrainDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainDTO dto1, StrainDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainDAO.ID__STRAIN_KEY:
                if (dto1.getStrainKey() == null && dto2.getStrainKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainKey() == null && dto2.getStrainKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainKey() != null && dto2.getStrainKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainKey().compareTo(dto2.getStrainKey());
                }
                break;
            case StrainDAO.ID_NAME:
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
            case StrainDAO.ID_DESCRIPTION:
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
            case StrainDAO.ID__STRAINFAMILY_KEY:
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
            case StrainDAO.ID_CREATE_USER:
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
            case StrainDAO.ID_CREATE_DATE:
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
            case StrainDAO.ID_UPDATE_USER:
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
            case StrainDAO.ID_UPDATE_DATE:
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
