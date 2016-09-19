
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the OrganismDTO objects.
 */
public class OrganismComparator
       implements Comparator<OrganismDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for OrganismComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OrganismComparator(OrganismDAO._ORGANISM_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OrganismDAO.ID__ORGANISM_KEY
     *   <li>OrganismDAO.ID_COMMONNAME
     *   <li>OrganismDAO.ID_LATINNAME
     *   <li>OrganismDAO.ID_CREATE_USER
     *   <li>OrganismDAO.ID_CREATE_DATE
     *   <li>OrganismDAO.ID_UPDATE_USER
     *   <li>OrganismDAO.ID_UPDATE_DATE
     * </ul>
     */
    public OrganismComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for OrganismComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new OrganismComparator(OrganismDAO._ORGANISM_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>OrganismDAO.ID__ORGANISM_KEY
     *   <li>OrganismDAO.ID_COMMONNAME
     *   <li>OrganismDAO.ID_LATINNAME
     *   <li>OrganismDAO.ID_CREATE_USER
     *   <li>OrganismDAO.ID_CREATE_DATE
     *   <li>OrganismDAO.ID_UPDATE_USER
     *   <li>OrganismDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public OrganismComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(OrganismDTO dto1, OrganismDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case OrganismDAO.ID__ORGANISM_KEY:
                if (dto1.getOrganismKey() == null && dto2.getOrganismKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganismKey() == null && dto2.getOrganismKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganismKey() != null && dto2.getOrganismKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganismKey().compareTo(dto2.getOrganismKey());
                }
                break;
            case OrganismDAO.ID_COMMONNAME:
                if (dto1.getCommonName() == null && dto2.getCommonName() != null) {
                    nReturn = -1;
                } else if (dto1.getCommonName() == null && dto2.getCommonName() == null) {
                    nReturn = 0;
                } else if (dto1.getCommonName() != null && dto2.getCommonName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCommonName().compareTo(dto2.getCommonName());
                }
                break;
            case OrganismDAO.ID_LATINNAME:
                if (dto1.getLatinName() == null && dto2.getLatinName() != null) {
                    nReturn = -1;
                } else if (dto1.getLatinName() == null && dto2.getLatinName() == null) {
                    nReturn = 0;
                } else if (dto1.getLatinName() != null && dto2.getLatinName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLatinName().compareTo(dto2.getLatinName());
                }
                break;
            case OrganismDAO.ID_CREATE_USER:
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
            case OrganismDAO.ID_CREATE_DATE:
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
            case OrganismDAO.ID_UPDATE_USER:
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
            case OrganismDAO.ID_UPDATE_DATE:
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
