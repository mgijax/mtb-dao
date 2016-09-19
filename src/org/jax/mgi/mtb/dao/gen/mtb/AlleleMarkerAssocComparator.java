
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AlleleMarkerAssocDTO objects.
 */
public class AlleleMarkerAssocComparator
       implements Comparator<AlleleMarkerAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AlleleMarkerAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleMarkerAssocComparator(AlleleMarkerAssocDAO._ALLELE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleMarkerAssocDAO.ID__ALLELE_KEY
     *   <li>AlleleMarkerAssocDAO.ID__MARKER_KEY
     *   <li>AlleleMarkerAssocDAO.ID__ALLELEMARKERASSOCTYPE_KEY
     *   <li>AlleleMarkerAssocDAO.ID_CREATE_USER
     *   <li>AlleleMarkerAssocDAO.ID_CREATE_DATE
     *   <li>AlleleMarkerAssocDAO.ID_UPDATE_USER
     *   <li>AlleleMarkerAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AlleleMarkerAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AlleleMarkerAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleMarkerAssocComparator(AlleleMarkerAssocDAO._ALLELE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleMarkerAssocDAO.ID__ALLELE_KEY
     *   <li>AlleleMarkerAssocDAO.ID__MARKER_KEY
     *   <li>AlleleMarkerAssocDAO.ID__ALLELEMARKERASSOCTYPE_KEY
     *   <li>AlleleMarkerAssocDAO.ID_CREATE_USER
     *   <li>AlleleMarkerAssocDAO.ID_CREATE_DATE
     *   <li>AlleleMarkerAssocDAO.ID_UPDATE_USER
     *   <li>AlleleMarkerAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AlleleMarkerAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AlleleMarkerAssocDTO dto1, AlleleMarkerAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AlleleMarkerAssocDAO.ID__ALLELE_KEY:
                if (dto1.getAlleleKey() == null && dto2.getAlleleKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleKey() == null && dto2.getAlleleKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleKey() != null && dto2.getAlleleKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleKey().compareTo(dto2.getAlleleKey());
                }
                break;
            case AlleleMarkerAssocDAO.ID__MARKER_KEY:
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
            case AlleleMarkerAssocDAO.ID__ALLELEMARKERASSOCTYPE_KEY:
                if (dto1.getAlleleMarkerAssocTypeKey() == null && dto2.getAlleleMarkerAssocTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleMarkerAssocTypeKey() == null && dto2.getAlleleMarkerAssocTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleMarkerAssocTypeKey() != null && dto2.getAlleleMarkerAssocTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleMarkerAssocTypeKey().compareTo(dto2.getAlleleMarkerAssocTypeKey());
                }
                break;
            case AlleleMarkerAssocDAO.ID_CREATE_USER:
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
            case AlleleMarkerAssocDAO.ID_CREATE_DATE:
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
            case AlleleMarkerAssocDAO.ID_UPDATE_USER:
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
            case AlleleMarkerAssocDAO.ID_UPDATE_DATE:
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
