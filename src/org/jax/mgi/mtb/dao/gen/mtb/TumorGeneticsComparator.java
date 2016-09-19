
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorGeneticsDTO objects.
 */
public class TumorGeneticsComparator
       implements Comparator<TumorGeneticsDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorGeneticsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorGeneticsComparator(TumorGeneticsDAO._TUMORGENETICS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorGeneticsDAO.ID__TUMORGENETICS_KEY
     *   <li>TumorGeneticsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorGeneticsDAO.ID__ALLELEPAIR_KEY
     *   <li>TumorGeneticsDAO.ID_NOTES
     *   <li>TumorGeneticsDAO.ID_CREATE_USER
     *   <li>TumorGeneticsDAO.ID_CREATE_DATE
     *   <li>TumorGeneticsDAO.ID_UPDATE_USER
     *   <li>TumorGeneticsDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorGeneticsComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorGeneticsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorGeneticsComparator(TumorGeneticsDAO._TUMORGENETICS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorGeneticsDAO.ID__TUMORGENETICS_KEY
     *   <li>TumorGeneticsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorGeneticsDAO.ID__ALLELEPAIR_KEY
     *   <li>TumorGeneticsDAO.ID_NOTES
     *   <li>TumorGeneticsDAO.ID_CREATE_USER
     *   <li>TumorGeneticsDAO.ID_CREATE_DATE
     *   <li>TumorGeneticsDAO.ID_UPDATE_USER
     *   <li>TumorGeneticsDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorGeneticsComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorGeneticsDTO dto1, TumorGeneticsDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorGeneticsDAO.ID__TUMORGENETICS_KEY:
                if (dto1.getTumorGeneticsKey() == null && dto2.getTumorGeneticsKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorGeneticsKey() == null && dto2.getTumorGeneticsKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorGeneticsKey() != null && dto2.getTumorGeneticsKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorGeneticsKey().compareTo(dto2.getTumorGeneticsKey());
                }
                break;
            case TumorGeneticsDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorGeneticsDAO.ID__ALLELEPAIR_KEY:
                if (dto1.getAllelePairKey() == null && dto2.getAllelePairKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAllelePairKey() == null && dto2.getAllelePairKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAllelePairKey() != null && dto2.getAllelePairKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAllelePairKey().compareTo(dto2.getAllelePairKey());
                }
                break;
            case TumorGeneticsDAO.ID_NOTES:
                if (dto1.getNotes() == null && dto2.getNotes() != null) {
                    nReturn = -1;
                } else if (dto1.getNotes() == null && dto2.getNotes() == null) {
                    nReturn = 0;
                } else if (dto1.getNotes() != null && dto2.getNotes() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNotes().compareTo(dto2.getNotes());
                }
                break;
            case TumorGeneticsDAO.ID_CREATE_USER:
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
            case TumorGeneticsDAO.ID_CREATE_DATE:
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
            case TumorGeneticsDAO.ID_UPDATE_USER:
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
            case TumorGeneticsDAO.ID_UPDATE_DATE:
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
