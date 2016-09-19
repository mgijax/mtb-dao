
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TmrGntcCngAssayImageAssocDTO objects.
 */
public class TmrGntcCngAssayImageAssocComparator
       implements Comparator<TmrGntcCngAssayImageAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TmrGntcCngAssayImageAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TmrGntcCngAssayImageAssocComparator(TmrGntcCngAssayImageAssocDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TmrGntcCngAssayImageAssocDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>TmrGntcCngAssayImageAssocDAO.ID__ASSAYIMAGES_KEY
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_CREATE_USER
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_CREATE_DATE
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_UPDATE_USER
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public TmrGntcCngAssayImageAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TmrGntcCngAssayImageAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TmrGntcCngAssayImageAssocComparator(TmrGntcCngAssayImageAssocDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TmrGntcCngAssayImageAssocDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>TmrGntcCngAssayImageAssocDAO.ID__ASSAYIMAGES_KEY
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_CREATE_USER
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_CREATE_DATE
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_UPDATE_USER
     *   <li>TmrGntcCngAssayImageAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TmrGntcCngAssayImageAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TmrGntcCngAssayImageAssocDTO dto1, TmrGntcCngAssayImageAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TmrGntcCngAssayImageAssocDAO.ID__TUMORGENETICCHANGES_KEY:
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
            case TmrGntcCngAssayImageAssocDAO.ID__ASSAYIMAGES_KEY:
                if (dto1.getAssayImagesKey() == null && dto2.getAssayImagesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAssayImagesKey() == null && dto2.getAssayImagesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAssayImagesKey() != null && dto2.getAssayImagesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAssayImagesKey().compareTo(dto2.getAssayImagesKey());
                }
                break;
            case TmrGntcCngAssayImageAssocDAO.ID_CREATE_USER:
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
            case TmrGntcCngAssayImageAssocDAO.ID_CREATE_DATE:
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
            case TmrGntcCngAssayImageAssocDAO.ID_UPDATE_USER:
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
            case TmrGntcCngAssayImageAssocDAO.ID_UPDATE_DATE:
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
