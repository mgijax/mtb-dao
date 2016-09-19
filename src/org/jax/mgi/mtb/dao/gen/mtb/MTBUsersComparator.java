
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBUsersDTO objects.
 */
public class MTBUsersComparator
       implements Comparator<MTBUsersDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBUsersComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBUsersComparator(MTBUsersDAO._MTBUSERS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBUsersDAO.ID__MTBUSERS_KEY
     *   <li>MTBUsersDAO.ID_USERNAME
     *   <li>MTBUsersDAO.ID_PASSWORD
     *   <li>MTBUsersDAO.ID_FULLNAME
     *   <li>MTBUsersDAO.ID_TELEPHONE
     *   <li>MTBUsersDAO.ID_EMAIL
     *   <li>MTBUsersDAO.ID__MTBSECURITYLEVEL_KEY
     *   <li>MTBUsersDAO.ID_ACTIVEIND
     *   <li>MTBUsersDAO.ID_CREATE_USER
     *   <li>MTBUsersDAO.ID_CREATE_DATE
     *   <li>MTBUsersDAO.ID_UPDATE_USER
     *   <li>MTBUsersDAO.ID_UPDATE_DATE
     * </ul>
     */
    public MTBUsersComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBUsersComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBUsersComparator(MTBUsersDAO._MTBUSERS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBUsersDAO.ID__MTBUSERS_KEY
     *   <li>MTBUsersDAO.ID_USERNAME
     *   <li>MTBUsersDAO.ID_PASSWORD
     *   <li>MTBUsersDAO.ID_FULLNAME
     *   <li>MTBUsersDAO.ID_TELEPHONE
     *   <li>MTBUsersDAO.ID_EMAIL
     *   <li>MTBUsersDAO.ID__MTBSECURITYLEVEL_KEY
     *   <li>MTBUsersDAO.ID_ACTIVEIND
     *   <li>MTBUsersDAO.ID_CREATE_USER
     *   <li>MTBUsersDAO.ID_CREATE_DATE
     *   <li>MTBUsersDAO.ID_UPDATE_USER
     *   <li>MTBUsersDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBUsersComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBUsersDTO dto1, MTBUsersDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBUsersDAO.ID__MTBUSERS_KEY:
                if (dto1.getMTBUsersKey() == null && dto2.getMTBUsersKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBUsersKey() == null && dto2.getMTBUsersKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBUsersKey() != null && dto2.getMTBUsersKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBUsersKey().compareTo(dto2.getMTBUsersKey());
                }
                break;
            case MTBUsersDAO.ID_USERNAME:
                if (dto1.getUserName() == null && dto2.getUserName() != null) {
                    nReturn = -1;
                } else if (dto1.getUserName() == null && dto2.getUserName() == null) {
                    nReturn = 0;
                } else if (dto1.getUserName() != null && dto2.getUserName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUserName().compareTo(dto2.getUserName());
                }
                break;
            case MTBUsersDAO.ID_PASSWORD:
                if (dto1.getPassword() == null && dto2.getPassword() != null) {
                    nReturn = -1;
                } else if (dto1.getPassword() == null && dto2.getPassword() == null) {
                    nReturn = 0;
                } else if (dto1.getPassword() != null && dto2.getPassword() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPassword().compareTo(dto2.getPassword());
                }
                break;
            case MTBUsersDAO.ID_FULLNAME:
                if (dto1.getFullName() == null && dto2.getFullName() != null) {
                    nReturn = -1;
                } else if (dto1.getFullName() == null && dto2.getFullName() == null) {
                    nReturn = 0;
                } else if (dto1.getFullName() != null && dto2.getFullName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getFullName().compareTo(dto2.getFullName());
                }
                break;
            case MTBUsersDAO.ID_TELEPHONE:
                if (dto1.getTelephone() == null && dto2.getTelephone() != null) {
                    nReturn = -1;
                } else if (dto1.getTelephone() == null && dto2.getTelephone() == null) {
                    nReturn = 0;
                } else if (dto1.getTelephone() != null && dto2.getTelephone() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTelephone().compareTo(dto2.getTelephone());
                }
                break;
            case MTBUsersDAO.ID_EMAIL:
                if (dto1.getEmail() == null && dto2.getEmail() != null) {
                    nReturn = -1;
                } else if (dto1.getEmail() == null && dto2.getEmail() == null) {
                    nReturn = 0;
                } else if (dto1.getEmail() != null && dto2.getEmail() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getEmail().compareTo(dto2.getEmail());
                }
                break;
            case MTBUsersDAO.ID__MTBSECURITYLEVEL_KEY:
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
            case MTBUsersDAO.ID_ACTIVEIND:
                if (dto1.getActiveInd() == null && dto2.getActiveInd() != null) {
                    nReturn = -1;
                } else if (dto1.getActiveInd() == null && dto2.getActiveInd() == null) {
                    nReturn = 0;
                } else if (dto1.getActiveInd() != null && dto2.getActiveInd() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getActiveInd().compareTo(dto2.getActiveInd());
                }
                break;
            case MTBUsersDAO.ID_CREATE_USER:
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
            case MTBUsersDAO.ID_CREATE_DATE:
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
            case MTBUsersDAO.ID_UPDATE_USER:
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
            case MTBUsersDAO.ID_UPDATE_DATE:
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
