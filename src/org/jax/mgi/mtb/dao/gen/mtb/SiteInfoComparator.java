
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the SiteInfoDTO objects.
 */
public class SiteInfoComparator
       implements Comparator<SiteInfoDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SiteInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SiteInfoComparator(SiteInfoDAO._SITEINFO_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SiteInfoDAO.ID__SITEINFO_KEY
     *   <li>SiteInfoDAO.ID_NAME
     *   <li>SiteInfoDAO.ID_DESCRIPTION
     *   <li>SiteInfoDAO.ID_URL
     *   <li>SiteInfoDAO.ID_CREATE_USER
     *   <li>SiteInfoDAO.ID_CREATE_DATE
     *   <li>SiteInfoDAO.ID_UPDATE_USER
     *   <li>SiteInfoDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SiteInfoComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SiteInfoComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SiteInfoComparator(SiteInfoDAO._SITEINFO_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SiteInfoDAO.ID__SITEINFO_KEY
     *   <li>SiteInfoDAO.ID_NAME
     *   <li>SiteInfoDAO.ID_DESCRIPTION
     *   <li>SiteInfoDAO.ID_URL
     *   <li>SiteInfoDAO.ID_CREATE_USER
     *   <li>SiteInfoDAO.ID_CREATE_DATE
     *   <li>SiteInfoDAO.ID_UPDATE_USER
     *   <li>SiteInfoDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SiteInfoComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SiteInfoDTO dto1, SiteInfoDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SiteInfoDAO.ID__SITEINFO_KEY:
                if (dto1.getSiteInfoKey() == null && dto2.getSiteInfoKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSiteInfoKey() == null && dto2.getSiteInfoKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSiteInfoKey() != null && dto2.getSiteInfoKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSiteInfoKey().compareTo(dto2.getSiteInfoKey());
                }
                break;
            case SiteInfoDAO.ID_NAME:
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
            case SiteInfoDAO.ID_DESCRIPTION:
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
            case SiteInfoDAO.ID_URL:
                if (dto1.getUrl() == null && dto2.getUrl() != null) {
                    nReturn = -1;
                } else if (dto1.getUrl() == null && dto2.getUrl() == null) {
                    nReturn = 0;
                } else if (dto1.getUrl() != null && dto2.getUrl() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUrl().compareTo(dto2.getUrl());
                }
                break;
            case SiteInfoDAO.ID_CREATE_USER:
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
            case SiteInfoDAO.ID_CREATE_DATE:
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
            case SiteInfoDAO.ID_UPDATE_USER:
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
            case SiteInfoDAO.ID_UPDATE_DATE:
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
