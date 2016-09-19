
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the SexDTO objects.
 */
public class SexComparator
       implements Comparator<SexDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SexComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SexComparator(SexDAO._SEX_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SexDAO.ID__SEX_KEY
     *   <li>SexDAO.ID_SEX
     *   <li>SexDAO.ID_CREATE_USER
     *   <li>SexDAO.ID_CREATE_DATE
     *   <li>SexDAO.ID_UPDATE_USER
     *   <li>SexDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SexComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SexComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SexComparator(SexDAO._SEX_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SexDAO.ID__SEX_KEY
     *   <li>SexDAO.ID_SEX
     *   <li>SexDAO.ID_CREATE_USER
     *   <li>SexDAO.ID_CREATE_DATE
     *   <li>SexDAO.ID_UPDATE_USER
     *   <li>SexDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SexComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SexDTO dto1, SexDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SexDAO.ID__SEX_KEY:
                if (dto1.getSexKey() == null && dto2.getSexKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSexKey() == null && dto2.getSexKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSexKey() != null && dto2.getSexKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSexKey().compareTo(dto2.getSexKey());
                }
                break;
            case SexDAO.ID_SEX:
                if (dto1.getSex() == null && dto2.getSex() != null) {
                    nReturn = -1;
                } else if (dto1.getSex() == null && dto2.getSex() == null) {
                    nReturn = 0;
                } else if (dto1.getSex() != null && dto2.getSex() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSex().compareTo(dto2.getSex());
                }
                break;
            case SexDAO.ID_CREATE_USER:
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
            case SexDAO.ID_CREATE_DATE:
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
            case SexDAO.ID_UPDATE_USER:
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
            case SexDAO.ID_UPDATE_DATE:
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
