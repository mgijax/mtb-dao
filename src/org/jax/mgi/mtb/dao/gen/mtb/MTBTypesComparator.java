
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBTypesDTO objects.
 */
public class MTBTypesComparator
       implements Comparator<MTBTypesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBTypesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBTypesComparator(MTBTypesDAO._MTBTYPES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBTypesDAO.ID__MTBTYPES_KEY
     *   <li>MTBTypesDAO.ID_TYPE
     *   <li>MTBTypesDAO.ID_DESCRIPTION
     *   <li>MTBTypesDAO.ID_TABLENAME
     *   <li>MTBTypesDAO.ID_COLUMNNAME
     *   <li>MTBTypesDAO.ID_CREATE_USER
     *   <li>MTBTypesDAO.ID_CREATE_DATE
     *   <li>MTBTypesDAO.ID_UPDATE_USER
     *   <li>MTBTypesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MTBTypesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBTypesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBTypesComparator(MTBTypesDAO._MTBTYPES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBTypesDAO.ID__MTBTYPES_KEY
     *   <li>MTBTypesDAO.ID_TYPE
     *   <li>MTBTypesDAO.ID_DESCRIPTION
     *   <li>MTBTypesDAO.ID_TABLENAME
     *   <li>MTBTypesDAO.ID_COLUMNNAME
     *   <li>MTBTypesDAO.ID_CREATE_USER
     *   <li>MTBTypesDAO.ID_CREATE_DATE
     *   <li>MTBTypesDAO.ID_UPDATE_USER
     *   <li>MTBTypesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBTypesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBTypesDTO dto1, MTBTypesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBTypesDAO.ID__MTBTYPES_KEY:
                if (dto1.getMTBTypesKey() == null && dto2.getMTBTypesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBTypesKey() == null && dto2.getMTBTypesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBTypesKey() != null && dto2.getMTBTypesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBTypesKey().compareTo(dto2.getMTBTypesKey());
                }
                break;
            case MTBTypesDAO.ID_TYPE:
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
            case MTBTypesDAO.ID_DESCRIPTION:
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
            case MTBTypesDAO.ID_TABLENAME:
                if (dto1.getTableName() == null && dto2.getTableName() != null) {
                    nReturn = -1;
                } else if (dto1.getTableName() == null && dto2.getTableName() == null) {
                    nReturn = 0;
                } else if (dto1.getTableName() != null && dto2.getTableName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTableName().compareTo(dto2.getTableName());
                }
                break;
            case MTBTypesDAO.ID_COLUMNNAME:
                if (dto1.getColumnName() == null && dto2.getColumnName() != null) {
                    nReturn = -1;
                } else if (dto1.getColumnName() == null && dto2.getColumnName() == null) {
                    nReturn = 0;
                } else if (dto1.getColumnName() != null && dto2.getColumnName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getColumnName().compareTo(dto2.getColumnName());
                }
                break;
            case MTBTypesDAO.ID_CREATE_USER:
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
            case MTBTypesDAO.ID_CREATE_DATE:
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
            case MTBTypesDAO.ID_UPDATE_USER:
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
            case MTBTypesDAO.ID_UPDATE_DATE:
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
