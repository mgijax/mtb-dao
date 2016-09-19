
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AlleleTypeDTO objects.
 */
public class AlleleTypeComparator
       implements Comparator<AlleleTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AlleleTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleTypeComparator(AlleleTypeDAO._ALLELETYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleTypeDAO.ID__ALLELETYPE_KEY
     *   <li>AlleleTypeDAO.ID__ALLELEGROUPTYPE_KEY
     *   <li>AlleleTypeDAO.ID_TYPE
     *   <li>AlleleTypeDAO.ID_SORTORDER
     *   <li>AlleleTypeDAO.ID_CREATE_USER
     *   <li>AlleleTypeDAO.ID_CREATE_DATE
     *   <li>AlleleTypeDAO.ID_UPDATE_USER
     *   <li>AlleleTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AlleleTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AlleleTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleTypeComparator(AlleleTypeDAO._ALLELETYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleTypeDAO.ID__ALLELETYPE_KEY
     *   <li>AlleleTypeDAO.ID__ALLELEGROUPTYPE_KEY
     *   <li>AlleleTypeDAO.ID_TYPE
     *   <li>AlleleTypeDAO.ID_SORTORDER
     *   <li>AlleleTypeDAO.ID_CREATE_USER
     *   <li>AlleleTypeDAO.ID_CREATE_DATE
     *   <li>AlleleTypeDAO.ID_UPDATE_USER
     *   <li>AlleleTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AlleleTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AlleleTypeDTO dto1, AlleleTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AlleleTypeDAO.ID__ALLELETYPE_KEY:
                if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleTypeKey() != null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleTypeKey().compareTo(dto2.getAlleleTypeKey());
                }
                break;
            case AlleleTypeDAO.ID__ALLELEGROUPTYPE_KEY:
                if (dto1.getAlleleGroupTypeKey() == null && dto2.getAlleleGroupTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleGroupTypeKey() == null && dto2.getAlleleGroupTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleGroupTypeKey() != null && dto2.getAlleleGroupTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleGroupTypeKey().compareTo(dto2.getAlleleGroupTypeKey());
                }
                break;
            case AlleleTypeDAO.ID_TYPE:
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
            case AlleleTypeDAO.ID_SORTORDER:
                if (dto1.getSortOrder() == null && dto2.getSortOrder() != null) {
                    nReturn = -1;
                } else if (dto1.getSortOrder() == null && dto2.getSortOrder() == null) {
                    nReturn = 0;
                } else if (dto1.getSortOrder() != null && dto2.getSortOrder() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSortOrder().compareTo(dto2.getSortOrder());
                }
                break;
            case AlleleTypeDAO.ID_CREATE_USER:
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
            case AlleleTypeDAO.ID_CREATE_DATE:
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
            case AlleleTypeDAO.ID_UPDATE_USER:
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
            case AlleleTypeDAO.ID_UPDATE_DATE:
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
