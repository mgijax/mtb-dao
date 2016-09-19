
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MarkerTypeDTO objects.
 */
public class MarkerTypeComparator
       implements Comparator<MarkerTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MarkerTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MarkerTypeComparator(MarkerTypeDAO._MARKERTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MarkerTypeDAO.ID__MARKERTYPE_KEY
     *   <li>MarkerTypeDAO.ID_NAME
     *   <li>MarkerTypeDAO.ID_CREATE_USER
     *   <li>MarkerTypeDAO.ID_CREATE_DATE
     *   <li>MarkerTypeDAO.ID_UPDATE_USER
     *   <li>MarkerTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MarkerTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MarkerTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MarkerTypeComparator(MarkerTypeDAO._MARKERTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MarkerTypeDAO.ID__MARKERTYPE_KEY
     *   <li>MarkerTypeDAO.ID_NAME
     *   <li>MarkerTypeDAO.ID_CREATE_USER
     *   <li>MarkerTypeDAO.ID_CREATE_DATE
     *   <li>MarkerTypeDAO.ID_UPDATE_USER
     *   <li>MarkerTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MarkerTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MarkerTypeDTO dto1, MarkerTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MarkerTypeDAO.ID__MARKERTYPE_KEY:
                if (dto1.getMarkerTypeKey() == null && dto2.getMarkerTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMarkerTypeKey() == null && dto2.getMarkerTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMarkerTypeKey() != null && dto2.getMarkerTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMarkerTypeKey().compareTo(dto2.getMarkerTypeKey());
                }
                break;
            case MarkerTypeDAO.ID_NAME:
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
            case MarkerTypeDAO.ID_CREATE_USER:
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
            case MarkerTypeDAO.ID_CREATE_DATE:
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
            case MarkerTypeDAO.ID_UPDATE_USER:
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
            case MarkerTypeDAO.ID_UPDATE_DATE:
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
