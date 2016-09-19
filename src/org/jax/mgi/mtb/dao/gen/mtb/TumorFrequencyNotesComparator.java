
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorFrequencyNotesDTO objects.
 */
public class TumorFrequencyNotesComparator
       implements Comparator<TumorFrequencyNotesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorFrequencyNotesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyNotesComparator(TumorFrequencyNotesDAO._TUMORFREQUENCYNOTES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyNotesDAO.ID__TUMORFREQUENCYNOTES_KEY
     *   <li>TumorFrequencyNotesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyNotesDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencyNotesDAO.ID_NOTE
     *   <li>TumorFrequencyNotesDAO.ID_CREATE_USER
     *   <li>TumorFrequencyNotesDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyNotesDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyNotesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorFrequencyNotesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorFrequencyNotesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyNotesComparator(TumorFrequencyNotesDAO._TUMORFREQUENCYNOTES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyNotesDAO.ID__TUMORFREQUENCYNOTES_KEY
     *   <li>TumorFrequencyNotesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyNotesDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencyNotesDAO.ID_NOTE
     *   <li>TumorFrequencyNotesDAO.ID_CREATE_USER
     *   <li>TumorFrequencyNotesDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyNotesDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyNotesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorFrequencyNotesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorFrequencyNotesDTO dto1, TumorFrequencyNotesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorFrequencyNotesDAO.ID__TUMORFREQUENCYNOTES_KEY:
                if (dto1.getTumorFrequencyNotesKey() == null && dto2.getTumorFrequencyNotesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorFrequencyNotesKey() == null && dto2.getTumorFrequencyNotesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorFrequencyNotesKey() != null && dto2.getTumorFrequencyNotesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorFrequencyNotesKey().compareTo(dto2.getTumorFrequencyNotesKey());
                }
                break;
            case TumorFrequencyNotesDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorFrequencyNotesDAO.ID__REFERENCE_KEY:
                if (dto1.getReferenceKey() == null && dto2.getReferenceKey() != null) {
                    nReturn = -1;
                } else if (dto1.getReferenceKey() == null && dto2.getReferenceKey() == null) {
                    nReturn = 0;
                } else if (dto1.getReferenceKey() != null && dto2.getReferenceKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReferenceKey().compareTo(dto2.getReferenceKey());
                }
                break;
            case TumorFrequencyNotesDAO.ID_NOTE:
                if (dto1.getNote() == null && dto2.getNote() != null) {
                    nReturn = -1;
                } else if (dto1.getNote() == null && dto2.getNote() == null) {
                    nReturn = 0;
                } else if (dto1.getNote() != null && dto2.getNote() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNote().compareTo(dto2.getNote());
                }
                break;
            case TumorFrequencyNotesDAO.ID_CREATE_USER:
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
            case TumorFrequencyNotesDAO.ID_CREATE_DATE:
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
            case TumorFrequencyNotesDAO.ID_UPDATE_USER:
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
            case TumorFrequencyNotesDAO.ID_UPDATE_DATE:
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
