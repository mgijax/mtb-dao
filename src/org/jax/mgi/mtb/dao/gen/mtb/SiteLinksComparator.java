
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the SiteLinksDTO objects.
 */
public class SiteLinksComparator
       implements Comparator<SiteLinksDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SiteLinksComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SiteLinksComparator(SiteLinksDAO._SITELINKS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SiteLinksDAO.ID__SITELINKS_KEY
     *   <li>SiteLinksDAO.ID__SITEINFO_KEY
     *   <li>SiteLinksDAO.ID_NAME
     *   <li>SiteLinksDAO.ID_URL
     *   <li>SiteLinksDAO.ID_ACTIVE
     *   <li>SiteLinksDAO.ID_CREATE_USER
     *   <li>SiteLinksDAO.ID_CREATE_DATE
     *   <li>SiteLinksDAO.ID_UPDATE_USER
     *   <li>SiteLinksDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SiteLinksComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SiteLinksComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SiteLinksComparator(SiteLinksDAO._SITELINKS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SiteLinksDAO.ID__SITELINKS_KEY
     *   <li>SiteLinksDAO.ID__SITEINFO_KEY
     *   <li>SiteLinksDAO.ID_NAME
     *   <li>SiteLinksDAO.ID_URL
     *   <li>SiteLinksDAO.ID_ACTIVE
     *   <li>SiteLinksDAO.ID_CREATE_USER
     *   <li>SiteLinksDAO.ID_CREATE_DATE
     *   <li>SiteLinksDAO.ID_UPDATE_USER
     *   <li>SiteLinksDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SiteLinksComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SiteLinksDTO dto1, SiteLinksDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SiteLinksDAO.ID__SITELINKS_KEY:
                if (dto1.getSiteLinksKey() == null && dto2.getSiteLinksKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSiteLinksKey() == null && dto2.getSiteLinksKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSiteLinksKey() != null && dto2.getSiteLinksKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSiteLinksKey().compareTo(dto2.getSiteLinksKey());
                }
                break;
            case SiteLinksDAO.ID__SITEINFO_KEY:
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
            case SiteLinksDAO.ID_NAME:
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
            case SiteLinksDAO.ID_URL:
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
            case SiteLinksDAO.ID_ACTIVE:
                if (dto1.getActive() == null && dto2.getActive() != null) {
                    nReturn = -1;
                } else if (dto1.getActive() == null && dto2.getActive() == null) {
                    nReturn = 0;
                } else if (dto1.getActive() != null && dto2.getActive() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getActive().compareTo(dto2.getActive());
                }
                break;
            case SiteLinksDAO.ID_CREATE_USER:
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
            case SiteLinksDAO.ID_CREATE_DATE:
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
            case SiteLinksDAO.ID_UPDATE_USER:
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
            case SiteLinksDAO.ID_UPDATE_DATE:
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
