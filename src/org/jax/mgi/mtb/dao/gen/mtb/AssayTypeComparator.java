
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AssayTypeDTO objects.
 */
public class AssayTypeComparator
       implements Comparator<AssayTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AssayTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AssayTypeComparator(AssayTypeDAO._ASSAYTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AssayTypeDAO.ID__ASSAYTYPE_KEY
     *   <li>AssayTypeDAO.ID_NAME
     *   <li>AssayTypeDAO.ID_CREATE_USER
     *   <li>AssayTypeDAO.ID_CREATE_DATE
     *   <li>AssayTypeDAO.ID_UPDATE_USER
     *   <li>AssayTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AssayTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AssayTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AssayTypeComparator(AssayTypeDAO._ASSAYTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AssayTypeDAO.ID__ASSAYTYPE_KEY
     *   <li>AssayTypeDAO.ID_NAME
     *   <li>AssayTypeDAO.ID_CREATE_USER
     *   <li>AssayTypeDAO.ID_CREATE_DATE
     *   <li>AssayTypeDAO.ID_UPDATE_USER
     *   <li>AssayTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AssayTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AssayTypeDTO dto1, AssayTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AssayTypeDAO.ID__ASSAYTYPE_KEY:
                if (dto1.getAssayTypeKey() == null && dto2.getAssayTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAssayTypeKey() == null && dto2.getAssayTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAssayTypeKey() != null && dto2.getAssayTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAssayTypeKey().compareTo(dto2.getAssayTypeKey());
                }
                break;
            case AssayTypeDAO.ID_NAME:
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
            case AssayTypeDAO.ID_CREATE_USER:
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
            case AssayTypeDAO.ID_CREATE_DATE:
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
            case AssayTypeDAO.ID_UPDATE_USER:
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
            case AssayTypeDAO.ID_UPDATE_DATE:
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
