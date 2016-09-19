
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 

/**
 * Comparator class is used to sort the SeriesSampleAssocDTO objects.
 */
public class SeriesSampleAssocComparator
       implements Comparator<SeriesSampleAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SeriesSampleAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SeriesSampleAssocComparator(SeriesSampleAssocDAO._SERIESSAMPLEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SeriesSampleAssocDAO.ID__SERIESSAMPLEASSOC_KEY
     *   <li>SeriesSampleAssocDAO.ID__SERIES_KEY
     *   <li>SeriesSampleAssocDAO.ID__SAMPLE_KEY
     *   <li>SeriesSampleAssocDAO.ID_CREATE_USER
     *   <li>SeriesSampleAssocDAO.ID_CREATE_DATE
     *   <li>SeriesSampleAssocDAO.ID_UPDATE_USER
     *   <li>SeriesSampleAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SeriesSampleAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SeriesSampleAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SeriesSampleAssocComparator(SeriesSampleAssocDAO._SERIESSAMPLEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SeriesSampleAssocDAO.ID__SERIESSAMPLEASSOC_KEY
     *   <li>SeriesSampleAssocDAO.ID__SERIES_KEY
     *   <li>SeriesSampleAssocDAO.ID__SAMPLE_KEY
     *   <li>SeriesSampleAssocDAO.ID_CREATE_USER
     *   <li>SeriesSampleAssocDAO.ID_CREATE_DATE
     *   <li>SeriesSampleAssocDAO.ID_UPDATE_USER
     *   <li>SeriesSampleAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SeriesSampleAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SeriesSampleAssocDTO dto1, SeriesSampleAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SeriesSampleAssocDAO.ID__SERIESSAMPLEASSOC_KEY:
                if (dto1.getSeriessampleassocKey() == null && dto2.getSeriessampleassocKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSeriessampleassocKey() == null && dto2.getSeriessampleassocKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSeriessampleassocKey() != null && dto2.getSeriessampleassocKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSeriessampleassocKey().compareTo(dto2.getSeriessampleassocKey());
                }
                break;
            case SeriesSampleAssocDAO.ID__SERIES_KEY:
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
            case SeriesSampleAssocDAO.ID__SAMPLE_KEY:
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
            case SeriesSampleAssocDAO.ID_CREATE_USER:
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
            case SeriesSampleAssocDAO.ID_CREATE_DATE:
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
            case SeriesSampleAssocDAO.ID_UPDATE_USER:
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
            case SeriesSampleAssocDAO.ID_UPDATE_DATE:
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
