
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 

/**
 * Comparator class is used to sort the SeriesDTO objects.
 */
public class SeriesComparator
       implements Comparator<SeriesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SeriesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SeriesComparator(SeriesDAO._SERIES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SeriesDAO.ID__SERIES_KEY
     *   <li>SeriesDAO.ID_ID
     *   <li>SeriesDAO.ID__SITEINFO_KEY
     *   <li>SeriesDAO.ID_SUMMARY
     *   <li>SeriesDAO.ID_TITLE
     *   <li>SeriesDAO.ID_REFERENCE
     *   <li>SeriesDAO.ID_CREATE_USER
     *   <li>SeriesDAO.ID_CREATE_DATE
     *   <li>SeriesDAO.ID_UPDATE_USER
     *   <li>SeriesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SeriesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SeriesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SeriesComparator(SeriesDAO._SERIES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SeriesDAO.ID__SERIES_KEY
     *   <li>SeriesDAO.ID_ID
     *   <li>SeriesDAO.ID__SITEINFO_KEY
     *   <li>SeriesDAO.ID_SUMMARY
     *   <li>SeriesDAO.ID_TITLE
     *   <li>SeriesDAO.ID_REFERENCE
     *   <li>SeriesDAO.ID_CREATE_USER
     *   <li>SeriesDAO.ID_CREATE_DATE
     *   <li>SeriesDAO.ID_UPDATE_USER
     *   <li>SeriesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SeriesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SeriesDTO dto1, SeriesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SeriesDAO.ID__SERIES_KEY:
                if (dto1.getSeriesKey() == null && dto2.getSeriesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSeriesKey() == null && dto2.getSeriesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSeriesKey() != null && dto2.getSeriesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSeriesKey().compareTo(dto2.getSeriesKey());
                }
                break;
            case SeriesDAO.ID_ID:
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
            case SeriesDAO.ID__SITEINFO_KEY:
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
            case SeriesDAO.ID_SUMMARY:
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
            case SeriesDAO.ID_TITLE:
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
            case SeriesDAO.ID_REFERENCE:
                if (dto1.getReference() == null && dto2.getReference() != null) {
                    nReturn = -1;
                } else if (dto1.getReference() == null && dto2.getReference() == null) {
                    nReturn = 0;
                } else if (dto1.getReference() != null && dto2.getReference() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReference().compareTo(dto2.getReference());
                }
                break;
            case SeriesDAO.ID_CREATE_USER:
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
            case SeriesDAO.ID_CREATE_DATE:
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
            case SeriesDAO.ID_UPDATE_USER:
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
            case SeriesDAO.ID_UPDATE_DATE:
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
