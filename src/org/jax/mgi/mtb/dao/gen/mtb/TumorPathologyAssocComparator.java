
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorPathologyAssocDTO objects.
 */
public class TumorPathologyAssocComparator
       implements Comparator<TumorPathologyAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorPathologyAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorPathologyAssocComparator(TumorPathologyAssocDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorPathologyAssocDAO.ID__PATHOLOGY_KEY
     *   <li>TumorPathologyAssocDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorPathologyAssocDAO.ID_CREATE_USER
     *   <li>TumorPathologyAssocDAO.ID_CREATE_DATE
     *   <li>TumorPathologyAssocDAO.ID_UPDATE_USER
     *   <li>TumorPathologyAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorPathologyAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorPathologyAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorPathologyAssocComparator(TumorPathologyAssocDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorPathologyAssocDAO.ID__PATHOLOGY_KEY
     *   <li>TumorPathologyAssocDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorPathologyAssocDAO.ID_CREATE_USER
     *   <li>TumorPathologyAssocDAO.ID_CREATE_DATE
     *   <li>TumorPathologyAssocDAO.ID_UPDATE_USER
     *   <li>TumorPathologyAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorPathologyAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorPathologyAssocDTO dto1, TumorPathologyAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorPathologyAssocDAO.ID__PATHOLOGY_KEY:
                if (dto1.getPathologyKey() == null && dto2.getPathologyKey() != null) {
                    nReturn = -1;
                } else if (dto1.getPathologyKey() == null && dto2.getPathologyKey() == null) {
                    nReturn = 0;
                } else if (dto1.getPathologyKey() != null && dto2.getPathologyKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPathologyKey().compareTo(dto2.getPathologyKey());
                }
                break;
            case TumorPathologyAssocDAO.ID__TUMORFREQUENCY_KEY:
                if (dto1.getTumorFrequencyKey() == null && dto2.getTumorFrequencyKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorFrequencyKey() == null && dto2.getTumorFrequencyKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorFrequencyKey() != null && dto2.getTumorFrequencyKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorFrequencyKey().compareTo(dto2.getTumorFrequencyKey());
                }
                break;
            case TumorPathologyAssocDAO.ID_CREATE_USER:
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
            case TumorPathologyAssocDAO.ID_CREATE_DATE:
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
            case TumorPathologyAssocDAO.ID_UPDATE_USER:
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
            case TumorPathologyAssocDAO.ID_UPDATE_DATE:
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
