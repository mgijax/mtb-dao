
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MarkerLabelDTO objects.
 */
public class MarkerLabelComparator
       implements Comparator<MarkerLabelDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MarkerLabelComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MarkerLabelComparator(MarkerLabelDAO._MARKERLABEL_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MarkerLabelDAO.ID__MARKERLABEL_KEY
     *   <li>MarkerLabelDAO.ID__MARKER_KEY
     *   <li>MarkerLabelDAO.ID__LABELTYPE_KEY
     *   <li>MarkerLabelDAO.ID_LABEL
     *   <li>MarkerLabelDAO.ID__LABELSTATUS_KEY
     *   <li>MarkerLabelDAO.ID_CREATE_USER
     *   <li>MarkerLabelDAO.ID_CREATE_DATE
     *   <li>MarkerLabelDAO.ID_UPDATE_USER
     *   <li>MarkerLabelDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MarkerLabelComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MarkerLabelComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MarkerLabelComparator(MarkerLabelDAO._MARKERLABEL_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MarkerLabelDAO.ID__MARKERLABEL_KEY
     *   <li>MarkerLabelDAO.ID__MARKER_KEY
     *   <li>MarkerLabelDAO.ID__LABELTYPE_KEY
     *   <li>MarkerLabelDAO.ID_LABEL
     *   <li>MarkerLabelDAO.ID__LABELSTATUS_KEY
     *   <li>MarkerLabelDAO.ID_CREATE_USER
     *   <li>MarkerLabelDAO.ID_CREATE_DATE
     *   <li>MarkerLabelDAO.ID_UPDATE_USER
     *   <li>MarkerLabelDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MarkerLabelComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MarkerLabelDTO dto1, MarkerLabelDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MarkerLabelDAO.ID__MARKERLABEL_KEY:
                if (dto1.getMarkerLabelKey() == null && dto2.getMarkerLabelKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMarkerLabelKey() == null && dto2.getMarkerLabelKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMarkerLabelKey() != null && dto2.getMarkerLabelKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMarkerLabelKey().compareTo(dto2.getMarkerLabelKey());
                }
                break;
            case MarkerLabelDAO.ID__MARKER_KEY:
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
            case MarkerLabelDAO.ID__LABELTYPE_KEY:
                if (dto1.getLabelTypeKey() == null && dto2.getLabelTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getLabelTypeKey() == null && dto2.getLabelTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getLabelTypeKey() != null && dto2.getLabelTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLabelTypeKey().compareTo(dto2.getLabelTypeKey());
                }
                break;
            case MarkerLabelDAO.ID_LABEL:
                if (dto1.getLabel() == null && dto2.getLabel() != null) {
                    nReturn = -1;
                } else if (dto1.getLabel() == null && dto2.getLabel() == null) {
                    nReturn = 0;
                } else if (dto1.getLabel() != null && dto2.getLabel() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLabel().compareTo(dto2.getLabel());
                }
                break;
            case MarkerLabelDAO.ID__LABELSTATUS_KEY:
                if (dto1.getLabelStatusKey() == null && dto2.getLabelStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getLabelStatusKey() == null && dto2.getLabelStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getLabelStatusKey() != null && dto2.getLabelStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLabelStatusKey().compareTo(dto2.getLabelStatusKey());
                }
                break;
            case MarkerLabelDAO.ID_CREATE_USER:
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
            case MarkerLabelDAO.ID_CREATE_DATE:
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
            case MarkerLabelDAO.ID_UPDATE_USER:
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
            case MarkerLabelDAO.ID_UPDATE_DATE:
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
