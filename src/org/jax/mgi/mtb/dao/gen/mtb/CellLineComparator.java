
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the CellLineDTO objects.
 */
public class CellLineComparator
       implements Comparator<CellLineDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for CellLineComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new CellLineComparator(CellLineDAO._CELLLINE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>CellLineDAO.ID__CELLLINE_KEY
     *   <li>CellLineDAO.ID__STRAIN_KEY
     *   <li>CellLineDAO.ID_NAME
     *   <li>CellLineDAO.ID_DESCRIPTION
     *   <li>CellLineDAO.ID_CREATE_USER
     *   <li>CellLineDAO.ID_CREATE_DATE
     *   <li>CellLineDAO.ID_UPDATE_USER
     *   <li>CellLineDAO.ID_UPDATE_DATE
     * </ul>
     */
    public CellLineComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for CellLineComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new CellLineComparator(CellLineDAO._CELLLINE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>CellLineDAO.ID__CELLLINE_KEY
     *   <li>CellLineDAO.ID__STRAIN_KEY
     *   <li>CellLineDAO.ID_NAME
     *   <li>CellLineDAO.ID_DESCRIPTION
     *   <li>CellLineDAO.ID_CREATE_USER
     *   <li>CellLineDAO.ID_CREATE_DATE
     *   <li>CellLineDAO.ID_UPDATE_USER
     *   <li>CellLineDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public CellLineComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(CellLineDTO dto1, CellLineDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case CellLineDAO.ID__CELLLINE_KEY:
                if (dto1.getCellLineKey() == null && dto2.getCellLineKey() != null) {
                    nReturn = -1;
                } else if (dto1.getCellLineKey() == null && dto2.getCellLineKey() == null) {
                    nReturn = 0;
                } else if (dto1.getCellLineKey() != null && dto2.getCellLineKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCellLineKey().compareTo(dto2.getCellLineKey());
                }
                break;
            case CellLineDAO.ID__STRAIN_KEY:
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
            case CellLineDAO.ID_NAME:
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
            case CellLineDAO.ID_DESCRIPTION:
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
            case CellLineDAO.ID_CREATE_USER:
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
            case CellLineDAO.ID_CREATE_DATE:
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
            case CellLineDAO.ID_UPDATE_USER:
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
            case CellLineDAO.ID_UPDATE_DATE:
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
