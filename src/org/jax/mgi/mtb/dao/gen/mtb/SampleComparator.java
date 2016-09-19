
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the SampleDTO objects.
 */
public class SampleComparator
       implements Comparator<SampleDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SampleComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleComparator(SampleDAO._SAMPLE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleDAO.ID__SAMPLE_KEY
     *   <li>SampleDAO.ID_ID
     *   <li>SampleDAO.ID__SITEINFO_KEY
     *   <li>SampleDAO.ID_SUMMARY
     *   <li>SampleDAO.ID_TITLE
     *   <li>SampleDAO.ID_PLATFORM
     *   <li>SampleDAO.ID_URL
     *   <li>SampleDAO.ID_CREATE_USER
     *   <li>SampleDAO.ID_CREATE_DATE
     *   <li>SampleDAO.ID_UPDATE_USER
     *   <li>SampleDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SampleComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SampleComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleComparator(SampleDAO._SAMPLE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleDAO.ID__SAMPLE_KEY
     *   <li>SampleDAO.ID_ID
     *   <li>SampleDAO.ID__SITEINFO_KEY
     *   <li>SampleDAO.ID_SUMMARY
     *   <li>SampleDAO.ID_TITLE
     *   <li>SampleDAO.ID_PLATFORM
     *   <li>SampleDAO.ID_ISCONTROL
     *   <li>SampleDAO.ID_URL
     *   <li>SampleDAO.ID_CREATE_USER
     *   <li>SampleDAO.ID_CREATE_DATE
     *   <li>SampleDAO.ID_UPDATE_USER
     *   <li>SampleDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SampleComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SampleDTO dto1, SampleDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SampleDAO.ID__SAMPLE_KEY:
                if (dto1.getSampleKey() == null && dto2.getSampleKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSampleKey() == null && dto2.getSampleKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSampleKey() != null && dto2.getSampleKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSampleKey().compareTo(dto2.getSampleKey());
                }
                break;
            case SampleDAO.ID_ID:
                if (dto1.getId() == null && dto2.getId() != null) {
                    nReturn = -1;
                } else if (dto1.getId() == null && dto2.getId() == null) {
                    nReturn = 0;
                } else if (dto1.getId() != null && dto2.getId() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getId().compareTo(dto2.getId());
                }
                break;
            case SampleDAO.ID__SITEINFO_KEY:
                if (dto1.getSiteinfoKey() == null && dto2.getSiteinfoKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSiteinfoKey() == null && dto2.getSiteinfoKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSiteinfoKey() != null && dto2.getSiteinfoKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSiteinfoKey().compareTo(dto2.getSiteinfoKey());
                }
                break;
            case SampleDAO.ID_SUMMARY:
                if (dto1.getSummary() == null && dto2.getSummary() != null) {
                    nReturn = -1;
                } else if (dto1.getSummary() == null && dto2.getSummary() == null) {
                    nReturn = 0;
                } else if (dto1.getSummary() != null && dto2.getSummary() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSummary().compareTo(dto2.getSummary());
                }
                break;
            case SampleDAO.ID_TITLE:
                if (dto1.getTitle() == null && dto2.getTitle() != null) {
                    nReturn = -1;
                } else if (dto1.getTitle() == null && dto2.getTitle() == null) {
                    nReturn = 0;
                } else if (dto1.getTitle() != null && dto2.getTitle() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTitle().compareTo(dto2.getTitle());
                }
                break;
            case SampleDAO.ID_PLATFORM:
                if (dto1.getPlatform() == null && dto2.getPlatform() != null) {
                    nReturn = -1;
                } else if (dto1.getPlatform() == null && dto2.getPlatform() == null) {
                    nReturn = 0;
                } else if (dto1.getPlatform() != null && dto2.getPlatform() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPlatform().compareTo(dto2.getPlatform());
                }
                break;
            case SampleDAO.ID_URL:
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
            case SampleDAO.ID_CREATE_USER:
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
            case SampleDAO.ID_CREATE_DATE:
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
            case SampleDAO.ID_UPDATE_USER:
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
            case SampleDAO.ID_UPDATE_DATE:
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
