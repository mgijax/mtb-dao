
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorGeneticChangesDTO objects.
 */
public class TumorGeneticChangesComparator
       implements Comparator<TumorGeneticChangesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorGeneticChangesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorGeneticChangesComparator(TumorGeneticChangesDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>TumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorGeneticChangesDAO.ID_NAME
     *   <li>TumorGeneticChangesDAO.ID_NOTES
     *   <li>TumorGeneticChangesDAO.ID_CREATE_USER
     *   <li>TumorGeneticChangesDAO.ID_CREATE_DATE
     *   <li>TumorGeneticChangesDAO.ID_UPDATE_USER
     *   <li>TumorGeneticChangesDAO.ID_UPDATE_DATE
     *   <li>TumorGeneticChangesDAO.ID__ALLELETYPE_KEY
     *   <li>TumorGeneticChangesDAO.ID__ASSAYTYPE_KEY
     * </ul>
     */
    public TumorGeneticChangesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorGeneticChangesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorGeneticChangesComparator(TumorGeneticChangesDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>TumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>TumorGeneticChangesDAO.ID_NAME
     *   <li>TumorGeneticChangesDAO.ID_NOTES
     *   <li>TumorGeneticChangesDAO.ID_CREATE_USER
     *   <li>TumorGeneticChangesDAO.ID_CREATE_DATE
     *   <li>TumorGeneticChangesDAO.ID_UPDATE_USER
     *   <li>TumorGeneticChangesDAO.ID_UPDATE_DATE
     *   <li>TumorGeneticChangesDAO.ID__ALLELETYPE_KEY
     *   <li>TumorGeneticChangesDAO.ID__ASSAYTYPE_KEY
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorGeneticChangesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorGeneticChangesDTO dto1, TumorGeneticChangesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY:
                if (dto1.getTumorGeneticChangesKey() == null && dto2.getTumorGeneticChangesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorGeneticChangesKey() == null && dto2.getTumorGeneticChangesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorGeneticChangesKey() != null && dto2.getTumorGeneticChangesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorGeneticChangesKey().compareTo(dto2.getTumorGeneticChangesKey());
                }
                break;
            case TumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY:
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
            case TumorGeneticChangesDAO.ID_NAME:
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
            case TumorGeneticChangesDAO.ID_NOTES:
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
            case TumorGeneticChangesDAO.ID_CREATE_USER:
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
            case TumorGeneticChangesDAO.ID_CREATE_DATE:
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
            case TumorGeneticChangesDAO.ID_UPDATE_USER:
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
            case TumorGeneticChangesDAO.ID_UPDATE_DATE:
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
            case TumorGeneticChangesDAO.ID__ALLELETYPE_KEY:
                if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleTypeKey() != null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleTypeKey().compareTo(dto2.getAlleleTypeKey());
                }
                break;
            case TumorGeneticChangesDAO.ID__ASSAYTYPE_KEY:
                if (dto1.getAssayTypeKey() == null && dto2.getAssayTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAssayTypeKey() == null && dto2.getAssayTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAssayTypeKey() != null && dto2.getAssayTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAssayTypeKey().compareTo(dto2.getAssayTypeKey());
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
