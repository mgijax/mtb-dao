
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 

/**
 * Comparator class is used to sort the HumanMarkerReferenceDTO objects.
 */
public class HumanMarkerReferenceComparator
       implements Comparator<HumanMarkerReferenceDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for HumanMarkerReferenceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new HumanMarkerReferenceComparator(HumanMarkerReferenceDAO._MARKER_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>HumanMarkerReferenceDAO.ID__MARKER_KEY
     *   <li>HumanMarkerReferenceDAO.ID__REFERENCE_KEY
     *   <li>HumanMarkerReferenceDAO.ID_CREATE_USER
     *   <li>HumanMarkerReferenceDAO.ID_CREATE_DATE
     *   <li>HumanMarkerReferenceDAO.ID_UPDATE_USER
     *   <li>HumanMarkerReferenceDAO.ID_UPDATE_DATE
     * </ul>
     */
    public HumanMarkerReferenceComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for HumanMarkerReferenceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new HumanMarkerReferenceComparator(HumanMarkerReferenceDAO._MARKER_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>HumanMarkerReferenceDAO.ID__MARKER_KEY
     *   <li>HumanMarkerReferenceDAO.ID__REFERENCE_KEY
     *   <li>HumanMarkerReferenceDAO.ID_CREATE_USER
     *   <li>HumanMarkerReferenceDAO.ID_CREATE_DATE
     *   <li>HumanMarkerReferenceDAO.ID_UPDATE_USER
     *   <li>HumanMarkerReferenceDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public HumanMarkerReferenceComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(HumanMarkerReferenceDTO dto1, HumanMarkerReferenceDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case HumanMarkerReferenceDAO.ID__MARKER_KEY:
                if (dto1.getMarkerKey() == null && dto2.getMarkerKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMarkerKey() == null && dto2.getMarkerKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMarkerKey() != null && dto2.getMarkerKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMarkerKey().compareTo(dto2.getMarkerKey());
                }
                break;
            case HumanMarkerReferenceDAO.ID__REFERENCE_KEY:
                if (dto1.getReferenceKey() == null && dto2.getReferenceKey() != null) {
                    nReturn = -1;
                } else if (dto1.getReferenceKey() == null && dto2.getReferenceKey() == null) {
                    nReturn = 0;
                } else if (dto1.getReferenceKey() != null && dto2.getReferenceKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReferenceKey().compareTo(dto2.getReferenceKey());
                }
                break;
            case HumanMarkerReferenceDAO.ID_CREATE_USER:
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
            case HumanMarkerReferenceDAO.ID_CREATE_DATE:
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
            case HumanMarkerReferenceDAO.ID_UPDATE_USER:
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
            case HumanMarkerReferenceDAO.ID_UPDATE_DATE:
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
