
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainTypeDTO objects.
 */
public class StrainTypeComparator
       implements Comparator<StrainTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainTypeComparator(StrainTypeDAO._STRAINTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainTypeDAO.ID__STRAINTYPE_KEY
     *   <li>StrainTypeDAO.ID_TYPE
     *   <li>StrainTypeDAO.ID_DESCRIPTION
     *   <li>StrainTypeDAO.ID_CREATE_USER
     *   <li>StrainTypeDAO.ID_CREATE_DATE
     *   <li>StrainTypeDAO.ID_UPDATE_USER
     *   <li>StrainTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainTypeComparator(StrainTypeDAO._STRAINTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainTypeDAO.ID__STRAINTYPE_KEY
     *   <li>StrainTypeDAO.ID_TYPE
     *   <li>StrainTypeDAO.ID_DESCRIPTION
     *   <li>StrainTypeDAO.ID_CREATE_USER
     *   <li>StrainTypeDAO.ID_CREATE_DATE
     *   <li>StrainTypeDAO.ID_UPDATE_USER
     *   <li>StrainTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainTypeDTO dto1, StrainTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainTypeDAO.ID__STRAINTYPE_KEY:
                if (dto1.getStrainTypeKey() == null && dto2.getStrainTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainTypeKey() == null && dto2.getStrainTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainTypeKey() != null && dto2.getStrainTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainTypeKey().compareTo(dto2.getStrainTypeKey());
                }
                break;
            case StrainTypeDAO.ID_TYPE:
                if (dto1.getType() == null && dto2.getType() != null) {
                    nReturn = -1;
                } else if (dto1.getType() == null && dto2.getType() == null) {
                    nReturn = 0;
                } else if (dto1.getType() != null && dto2.getType() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getType().compareTo(dto2.getType());
                }
                break;
            case StrainTypeDAO.ID_DESCRIPTION:
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
            case StrainTypeDAO.ID_CREATE_USER:
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
            case StrainTypeDAO.ID_CREATE_DATE:
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
            case StrainTypeDAO.ID_UPDATE_USER:
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
            case StrainTypeDAO.ID_UPDATE_DATE:
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
