
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the OrganDTO objects.
 */
public class OrganComparator
       implements Comparator<OrganDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for OrganComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OrganComparator(OrganDAO._ORGAN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OrganDAO.ID__ORGAN_KEY
     *   <li>OrganDAO.ID__ANATOMICALSYSTEM_KEY
     *   <li>OrganDAO.ID_NAME
     *   <li>OrganDAO.ID_DESCRIPTION
     *   <li>OrganDAO.ID_CREATE_USER
     *   <li>OrganDAO.ID_CREATE_DATE
     *   <li>OrganDAO.ID_UPDATE_USER
     *   <li>OrganDAO.ID_UPDATE_DATE
     *   <li>OrganDAO.ID__ORGANPARENT_KEY
     * </ul>
     */
    public OrganComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for OrganComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OrganComparator(OrganDAO._ORGAN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OrganDAO.ID__ORGAN_KEY
     *   <li>OrganDAO.ID__ANATOMICALSYSTEM_KEY
     *   <li>OrganDAO.ID_NAME
     *   <li>OrganDAO.ID_DESCRIPTION
     *   <li>OrganDAO.ID_CREATE_USER
     *   <li>OrganDAO.ID_CREATE_DATE
     *   <li>OrganDAO.ID_UPDATE_USER
     *   <li>OrganDAO.ID_UPDATE_DATE
     *   <li>OrganDAO.ID__ORGANPARENT_KEY
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public OrganComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(OrganDTO dto1, OrganDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case OrganDAO.ID__ORGAN_KEY:
                if (dto1.getOrganKey() == null && dto2.getOrganKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganKey() == null && dto2.getOrganKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganKey() != null && dto2.getOrganKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganKey().compareTo(dto2.getOrganKey());
                }
                break;
            case OrganDAO.ID__ANATOMICALSYSTEM_KEY:
                if (dto1.getAnatomicalSystemKey() == null && dto2.getAnatomicalSystemKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAnatomicalSystemKey() == null && dto2.getAnatomicalSystemKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAnatomicalSystemKey() != null && dto2.getAnatomicalSystemKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAnatomicalSystemKey().compareTo(dto2.getAnatomicalSystemKey());
                }
                break;
            case OrganDAO.ID_NAME:
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
            case OrganDAO.ID_DESCRIPTION:
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
            case OrganDAO.ID_CREATE_USER:
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
            case OrganDAO.ID_CREATE_DATE:
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
            case OrganDAO.ID_UPDATE_USER:
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
            case OrganDAO.ID_UPDATE_DATE:
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
            case OrganDAO.ID__ORGANPARENT_KEY:
                if (dto1.getOrganParentKey() == null && dto2.getOrganParentKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganParentKey() == null && dto2.getOrganParentKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganParentKey() != null && dto2.getOrganParentKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganParentKey().compareTo(dto2.getOrganParentKey());
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
