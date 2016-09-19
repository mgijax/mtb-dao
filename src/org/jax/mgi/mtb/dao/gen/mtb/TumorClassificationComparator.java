
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorClassificationDTO objects.
 */
public class TumorClassificationComparator
       implements Comparator<TumorClassificationDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorClassificationComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorClassificationComparator(TumorClassificationDAO._TUMORCLASSIFICATION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorClassificationDAO.ID__TUMORCLASSIFICATION_KEY
     *   <li>TumorClassificationDAO.ID_NAME
     *   <li>TumorClassificationDAO.ID_CREATE_USER
     *   <li>TumorClassificationDAO.ID_CREATE_DATE
     *   <li>TumorClassificationDAO.ID_UPDATE_USER
     *   <li>TumorClassificationDAO.ID_UPDATE_DATE
     *   <li>TumorClassificationDAO.ID__TCPARENT_KEY
     * </ul>
     */
    public TumorClassificationComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorClassificationComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorClassificationComparator(TumorClassificationDAO._TUMORCLASSIFICATION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorClassificationDAO.ID__TUMORCLASSIFICATION_KEY
     *   <li>TumorClassificationDAO.ID_NAME
     *   <li>TumorClassificationDAO.ID_CREATE_USER
     *   <li>TumorClassificationDAO.ID_CREATE_DATE
     *   <li>TumorClassificationDAO.ID_UPDATE_USER
     *   <li>TumorClassificationDAO.ID_UPDATE_DATE
     *   <li>TumorClassificationDAO.ID__TCPARENT_KEY
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorClassificationComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorClassificationDTO dto1, TumorClassificationDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorClassificationDAO.ID__TUMORCLASSIFICATION_KEY:
                if (dto1.getTumorClassificationKey() == null && dto2.getTumorClassificationKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorClassificationKey() == null && dto2.getTumorClassificationKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorClassificationKey() != null && dto2.getTumorClassificationKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorClassificationKey().compareTo(dto2.getTumorClassificationKey());
                }
                break;
            case TumorClassificationDAO.ID_NAME:
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
            case TumorClassificationDAO.ID_CREATE_USER:
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
            case TumorClassificationDAO.ID_CREATE_DATE:
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
            case TumorClassificationDAO.ID_UPDATE_USER:
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
            case TumorClassificationDAO.ID_UPDATE_DATE:
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
            case TumorClassificationDAO.ID__TCPARENT_KEY:
                if (dto1.getTCParentKey() == null && dto2.getTCParentKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTCParentKey() == null && dto2.getTCParentKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTCParentKey() != null && dto2.getTCParentKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTCParentKey().compareTo(dto2.getTCParentKey());
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
