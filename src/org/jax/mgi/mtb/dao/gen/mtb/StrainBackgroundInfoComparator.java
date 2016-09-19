
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainBackgroundInfoDTO objects.
 */
public class StrainBackgroundInfoComparator
       implements Comparator<StrainBackgroundInfoDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainBackgroundInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainBackgroundInfoComparator(StrainBackgroundInfoDAO._STRAIN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainBackgroundInfoDAO.ID__STRAIN_KEY
     *   <li>StrainBackgroundInfoDAO.ID__STRAINBACKGROUND_KEY
     *   <li>StrainBackgroundInfoDAO.ID_CREATE_USER
     *   <li>StrainBackgroundInfoDAO.ID_CREATE_DATE
     *   <li>StrainBackgroundInfoDAO.ID_UPDATE_USER
     *   <li>StrainBackgroundInfoDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainBackgroundInfoComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainBackgroundInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainBackgroundInfoComparator(StrainBackgroundInfoDAO._STRAIN_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainBackgroundInfoDAO.ID__STRAIN_KEY
     *   <li>StrainBackgroundInfoDAO.ID__STRAINBACKGROUND_KEY
     *   <li>StrainBackgroundInfoDAO.ID_CREATE_USER
     *   <li>StrainBackgroundInfoDAO.ID_CREATE_DATE
     *   <li>StrainBackgroundInfoDAO.ID_UPDATE_USER
     *   <li>StrainBackgroundInfoDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainBackgroundInfoComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainBackgroundInfoDTO dto1, StrainBackgroundInfoDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainBackgroundInfoDAO.ID__STRAIN_KEY:
                if (dto1.getStrainKey() == null && dto2.getStrainKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainKey() == null && dto2.getStrainKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainKey() != null && dto2.getStrainKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainKey().compareTo(dto2.getStrainKey());
                }
                break;
            case StrainBackgroundInfoDAO.ID__STRAINBACKGROUND_KEY:
                if (dto1.getStrainBackgroundKey() == null && dto2.getStrainBackgroundKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainBackgroundKey() == null && dto2.getStrainBackgroundKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainBackgroundKey() != null && dto2.getStrainBackgroundKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainBackgroundKey().compareTo(dto2.getStrainBackgroundKey());
                }
                break;
            case StrainBackgroundInfoDAO.ID_CREATE_USER:
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
            case StrainBackgroundInfoDAO.ID_CREATE_DATE:
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
            case StrainBackgroundInfoDAO.ID_UPDATE_USER:
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
            case StrainBackgroundInfoDAO.ID_UPDATE_DATE:
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
