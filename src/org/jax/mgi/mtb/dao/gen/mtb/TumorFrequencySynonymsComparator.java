
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorFrequencySynonymsDTO objects.
 */
public class TumorFrequencySynonymsComparator
       implements Comparator<TumorFrequencySynonymsDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorFrequencySynonymsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencySynonymsComparator(TumorFrequencySynonymsDAO._TUMORFREQUENCYSYNONYMS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencySynonymsDAO.ID__TUMORFREQUENCYSYNONYMS_KEY
     *   <li>TumorFrequencySynonymsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencySynonymsDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencySynonymsDAO.ID_NAME
     *   <li>TumorFrequencySynonymsDAO.ID_CREATE_USER
     *   <li>TumorFrequencySynonymsDAO.ID_CREATE_DATE
     *   <li>TumorFrequencySynonymsDAO.ID_UPDATE_USER
     *   <li>TumorFrequencySynonymsDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorFrequencySynonymsComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorFrequencySynonymsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencySynonymsComparator(TumorFrequencySynonymsDAO._TUMORFREQUENCYSYNONYMS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencySynonymsDAO.ID__TUMORFREQUENCYSYNONYMS_KEY
     *   <li>TumorFrequencySynonymsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencySynonymsDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencySynonymsDAO.ID_NAME
     *   <li>TumorFrequencySynonymsDAO.ID_CREATE_USER
     *   <li>TumorFrequencySynonymsDAO.ID_CREATE_DATE
     *   <li>TumorFrequencySynonymsDAO.ID_UPDATE_USER
     *   <li>TumorFrequencySynonymsDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorFrequencySynonymsComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorFrequencySynonymsDTO dto1, TumorFrequencySynonymsDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorFrequencySynonymsDAO.ID__TUMORFREQUENCYSYNONYMS_KEY:
                if (dto1.getTumorFrequencySynonymsKey() == null && dto2.getTumorFrequencySynonymsKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorFrequencySynonymsKey() == null && dto2.getTumorFrequencySynonymsKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorFrequencySynonymsKey() != null && dto2.getTumorFrequencySynonymsKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorFrequencySynonymsKey().compareTo(dto2.getTumorFrequencySynonymsKey());
                }
                break;
            case TumorFrequencySynonymsDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorFrequencySynonymsDAO.ID__REFERENCE_KEY:
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
            case TumorFrequencySynonymsDAO.ID_NAME:
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
            case TumorFrequencySynonymsDAO.ID_CREATE_USER:
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
            case TumorFrequencySynonymsDAO.ID_CREATE_DATE:
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
            case TumorFrequencySynonymsDAO.ID_UPDATE_USER:
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
            case TumorFrequencySynonymsDAO.ID_UPDATE_DATE:
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
