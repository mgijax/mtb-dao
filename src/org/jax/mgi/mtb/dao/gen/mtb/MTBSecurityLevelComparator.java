
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBSecurityLevelDTO objects.
 */
public class MTBSecurityLevelComparator
       implements Comparator<MTBSecurityLevelDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBSecurityLevelComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBSecurityLevelComparator(MTBSecurityLevelDAO._MTBSECURITYLEVEL_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBSecurityLevelDAO.ID__MTBSECURITYLEVEL_KEY
     *   <li>MTBSecurityLevelDAO.ID_DESCRIPTION
     *   <li>MTBSecurityLevelDAO.ID_CREATE_USER
     *   <li>MTBSecurityLevelDAO.ID_CREATE_DATE
     *   <li>MTBSecurityLevelDAO.ID_UPDATE_USER
     *   <li>MTBSecurityLevelDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MTBSecurityLevelComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBSecurityLevelComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBSecurityLevelComparator(MTBSecurityLevelDAO._MTBSECURITYLEVEL_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBSecurityLevelDAO.ID__MTBSECURITYLEVEL_KEY
     *   <li>MTBSecurityLevelDAO.ID_DESCRIPTION
     *   <li>MTBSecurityLevelDAO.ID_CREATE_USER
     *   <li>MTBSecurityLevelDAO.ID_CREATE_DATE
     *   <li>MTBSecurityLevelDAO.ID_UPDATE_USER
     *   <li>MTBSecurityLevelDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBSecurityLevelComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBSecurityLevelDTO dto1, MTBSecurityLevelDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBSecurityLevelDAO.ID__MTBSECURITYLEVEL_KEY:
                if (dto1.getMTBSecurityLevelKey() == null && dto2.getMTBSecurityLevelKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBSecurityLevelKey() == null && dto2.getMTBSecurityLevelKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBSecurityLevelKey() != null && dto2.getMTBSecurityLevelKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBSecurityLevelKey().compareTo(dto2.getMTBSecurityLevelKey());
                }
                break;
            case MTBSecurityLevelDAO.ID_DESCRIPTION:
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
            case MTBSecurityLevelDAO.ID_CREATE_USER:
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
            case MTBSecurityLevelDAO.ID_CREATE_DATE:
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
            case MTBSecurityLevelDAO.ID_UPDATE_USER:
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
            case MTBSecurityLevelDAO.ID_UPDATE_DATE:
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
