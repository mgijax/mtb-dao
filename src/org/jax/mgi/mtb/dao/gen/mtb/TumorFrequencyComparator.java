
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorFrequencyDTO objects.
 */
public class TumorFrequencyComparator
       implements Comparator<TumorFrequencyDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorFrequencyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyComparator(TumorFrequencyDAO._TUMORFREQUENCY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyDAO.ID__TUMORTYPE_KEY
     *   <li>TumorFrequencyDAO.ID__STRAIN_KEY
     *   <li>TumorFrequencyDAO.ID__SEX_KEY
     *   <li>TumorFrequencyDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencyDAO.ID__ORGANAFFECTED_KEY
     *   <li>TumorFrequencyDAO.ID_NOTE
     *   <li>TumorFrequencyDAO.ID_COLONYSIZE
     *   <li>TumorFrequencyDAO.ID_AGEONSET
     *   <li>TumorFrequencyDAO.ID_AGEDETECTION
     *   <li>TumorFrequencyDAO.ID_NUMMICEAFFECTED
     *   <li>TumorFrequencyDAO.ID_INCIDENCE
     *   <li>TumorFrequencyDAO.ID_FREQNUM
     *   <li>TumorFrequencyDAO.ID_BREEDINGSTATUS
     *   <li>TumorFrequencyDAO.ID_INFECTIONSTATUS
     *   <li>TumorFrequencyDAO.ID_CREATE_USER
     *   <li>TumorFrequencyDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TumorFrequencyComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorFrequencyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorFrequencyComparator(TumorFrequencyDAO._TUMORFREQUENCY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorFrequencyDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorFrequencyDAO.ID__TUMORTYPE_KEY
     *   <li>TumorFrequencyDAO.ID__STRAIN_KEY
     *   <li>TumorFrequencyDAO.ID__SEX_KEY
     *   <li>TumorFrequencyDAO.ID__REFERENCE_KEY
     *   <li>TumorFrequencyDAO.ID__ORGANAFFECTED_KEY
     *   <li>TumorFrequencyDAO.ID_NOTE
     *   <li>TumorFrequencyDAO.ID_COLONYSIZE
     *   <li>TumorFrequencyDAO.ID_AGEONSET
     *   <li>TumorFrequencyDAO.ID_AGEDETECTION
     *   <li>TumorFrequencyDAO.ID_NUMMICEAFFECTED
     *   <li>TumorFrequencyDAO.ID_INCIDENCE
     *   <li>TumorFrequencyDAO.ID_FREQNUM
     *   <li>TumorFrequencyDAO.ID_BREEDINGSTATUS
     *   <li>TumorFrequencyDAO.ID_INFECTIONSTATUS
     *   <li>TumorFrequencyDAO.ID_CREATE_USER
     *   <li>TumorFrequencyDAO.ID_CREATE_DATE
     *   <li>TumorFrequencyDAO.ID_UPDATE_USER
     *   <li>TumorFrequencyDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorFrequencyComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorFrequencyDTO dto1, TumorFrequencyDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorFrequencyDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorFrequencyDAO.ID__TUMORTYPE_KEY:
                if (dto1.getTumorTypeKey() == null && dto2.getTumorTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorTypeKey() == null && dto2.getTumorTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorTypeKey() != null && dto2.getTumorTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorTypeKey().compareTo(dto2.getTumorTypeKey());
                }
                break;
            case TumorFrequencyDAO.ID__STRAIN_KEY:
                if (dto1.getStrainKey() == null && dto2.getStrainKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainKey() == null && dto2.getStrainKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainKey() != null && dto2.getStrainKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainKey().compareTo(dto2.getStrainKey());
                }
                break;
            case TumorFrequencyDAO.ID__SEX_KEY:
                if (dto1.getSexKey() == null && dto2.getSexKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSexKey() == null && dto2.getSexKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSexKey() != null && dto2.getSexKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSexKey().compareTo(dto2.getSexKey());
                }
                break;
            case TumorFrequencyDAO.ID__REFERENCE_KEY:
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
            case TumorFrequencyDAO.ID__ORGANAFFECTED_KEY:
                if (dto1.getOrganAffectedKey() == null && dto2.getOrganAffectedKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganAffectedKey() == null && dto2.getOrganAffectedKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganAffectedKey() != null && dto2.getOrganAffectedKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganAffectedKey().compareTo(dto2.getOrganAffectedKey());
                }
                break;
            case TumorFrequencyDAO.ID_NOTE:
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
            case TumorFrequencyDAO.ID_COLONYSIZE:
                if (dto1.getColonySize() == null && dto2.getColonySize() != null) {
                    nReturn = -1;
                } else if (dto1.getColonySize() == null && dto2.getColonySize() == null) {
                    nReturn = 0;
                } else if (dto1.getColonySize() != null && dto2.getColonySize() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getColonySize().compareTo(dto2.getColonySize());
                }
                break;
            case TumorFrequencyDAO.ID_AGEONSET:
                if (dto1.getAgeOnset() == null && dto2.getAgeOnset() != null) {
                    nReturn = -1;
                } else if (dto1.getAgeOnset() == null && dto2.getAgeOnset() == null) {
                    nReturn = 0;
                } else if (dto1.getAgeOnset() != null && dto2.getAgeOnset() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAgeOnset().compareTo(dto2.getAgeOnset());
                }
                break;
            case TumorFrequencyDAO.ID_AGEDETECTION:
                if (dto1.getAgeDetection() == null && dto2.getAgeDetection() != null) {
                    nReturn = -1;
                } else if (dto1.getAgeDetection() == null && dto2.getAgeDetection() == null) {
                    nReturn = 0;
                } else if (dto1.getAgeDetection() != null && dto2.getAgeDetection() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAgeDetection().compareTo(dto2.getAgeDetection());
                }
                break;
            case TumorFrequencyDAO.ID_NUMMICEAFFECTED:
                if (dto1.getNumMiceAffected() == null && dto2.getNumMiceAffected() != null) {
                    nReturn = -1;
                } else if (dto1.getNumMiceAffected() == null && dto2.getNumMiceAffected() == null) {
                    nReturn = 0;
                } else if (dto1.getNumMiceAffected() != null && dto2.getNumMiceAffected() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNumMiceAffected().compareTo(dto2.getNumMiceAffected());
                }
                break;
            case TumorFrequencyDAO.ID_INCIDENCE:
                if (dto1.getIncidence() == null && dto2.getIncidence() != null) {
                    nReturn = -1;
                } else if (dto1.getIncidence() == null && dto2.getIncidence() == null) {
                    nReturn = 0;
                } else if (dto1.getIncidence() != null && dto2.getIncidence() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getIncidence().compareTo(dto2.getIncidence());
                }
                break;
            case TumorFrequencyDAO.ID_FREQNUM:
                if (dto1.getFreqNum() == null && dto2.getFreqNum() != null) {
                    nReturn = -1;
                } else if (dto1.getFreqNum() == null && dto2.getFreqNum() == null) {
                    nReturn = 0;
                } else if (dto1.getFreqNum() != null && dto2.getFreqNum() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getFreqNum().compareTo(dto2.getFreqNum());
                }
                break;
            case TumorFrequencyDAO.ID_BREEDINGSTATUS:
                if (dto1.getBreedingStatus() == null && dto2.getBreedingStatus() != null) {
                    nReturn = -1;
                } else if (dto1.getBreedingStatus() == null && dto2.getBreedingStatus() == null) {
                    nReturn = 0;
                } else if (dto1.getBreedingStatus() != null && dto2.getBreedingStatus() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getBreedingStatus().compareTo(dto2.getBreedingStatus());
                }
                break;
            case TumorFrequencyDAO.ID_INFECTIONSTATUS:
                if (dto1.getInfectionStatus() == null && dto2.getInfectionStatus() != null) {
                    nReturn = -1;
                } else if (dto1.getInfectionStatus() == null && dto2.getInfectionStatus() == null) {
                    nReturn = 0;
                } else if (dto1.getInfectionStatus() != null && dto2.getInfectionStatus() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getInfectionStatus().compareTo(dto2.getInfectionStatus());
                }
                break;
            case TumorFrequencyDAO.ID_CREATE_USER:
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
            case TumorFrequencyDAO.ID_CREATE_DATE:
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
            case TumorFrequencyDAO.ID_UPDATE_USER:
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
            case TumorFrequencyDAO.ID_UPDATE_DATE:
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
