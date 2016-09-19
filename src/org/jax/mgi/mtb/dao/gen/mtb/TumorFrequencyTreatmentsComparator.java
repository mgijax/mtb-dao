
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorFrequencyTreatmentsDTO objects.
 */
public class TumorFrequencyTreatmentsComparator
       implements Comparator<TumorFrequencyTreatmentsDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorFrequencyTreatmentsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyTreatmentsComparator(TumorFrequencyTreatmentsDAO._TUMORFREQUENCYTREATMENTS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCYTREATMENTS_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID__AGENT_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID_DOSE
     *   <li>TumorFrequencyTreatmentsDAO.ID_AGE
     *   <li>TumorFrequencyTreatmentsDAO.ID_CREATE_USER
     *   <li>TumorFrequencyTreatmentsDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyTreatmentsDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyTreatmentsDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorFrequencyTreatmentsComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorFrequencyTreatmentsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyTreatmentsComparator(TumorFrequencyTreatmentsDAO._TUMORFREQUENCYTREATMENTS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCYTREATMENTS_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID__AGENT_KEY
     *   <li>TumorFrequencyTreatmentsDAO.ID_DOSE
     *   <li>TumorFrequencyTreatmentsDAO.ID_AGE
     *   <li>TumorFrequencyTreatmentsDAO.ID_CREATE_USER
     *   <li>TumorFrequencyTreatmentsDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyTreatmentsDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyTreatmentsDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorFrequencyTreatmentsComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorFrequencyTreatmentsDTO dto1, TumorFrequencyTreatmentsDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCYTREATMENTS_KEY:
                if (dto1.getTumorFrequencyTreatmentsKey() == null && dto2.getTumorFrequencyTreatmentsKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorFrequencyTreatmentsKey() == null && dto2.getTumorFrequencyTreatmentsKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorFrequencyTreatmentsKey() != null && dto2.getTumorFrequencyTreatmentsKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorFrequencyTreatmentsKey().compareTo(dto2.getTumorFrequencyTreatmentsKey());
                }
                break;
            case TumorFrequencyTreatmentsDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorFrequencyTreatmentsDAO.ID__AGENT_KEY:
                if (dto1.getAgentKey() == null && dto2.getAgentKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAgentKey() == null && dto2.getAgentKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAgentKey() != null && dto2.getAgentKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAgentKey().compareTo(dto2.getAgentKey());
                }
                break;
            case TumorFrequencyTreatmentsDAO.ID_DOSE:
                if (dto1.getDose() == null && dto2.getDose() != null) {
                    nReturn = -1;
                } else if (dto1.getDose() == null && dto2.getDose() == null) {
                    nReturn = 0;
                } else if (dto1.getDose() != null && dto2.getDose() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getDose().compareTo(dto2.getDose());
                }
                break;
            case TumorFrequencyTreatmentsDAO.ID_AGE:
                if (dto1.getAge() == null && dto2.getAge() != null) {
                    nReturn = -1;
                } else if (dto1.getAge() == null && dto2.getAge() == null) {
                    nReturn = 0;
                } else if (dto1.getAge() != null && dto2.getAge() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAge().compareTo(dto2.getAge());
                }
                break;
            case TumorFrequencyTreatmentsDAO.ID_CREATE_USER:
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
            case TumorFrequencyTreatmentsDAO.ID_CREATE_DATE:
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
            case TumorFrequencyTreatmentsDAO.ID_UPDATE_USER:
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
            case TumorFrequencyTreatmentsDAO.ID_UPDATE_DATE:
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
