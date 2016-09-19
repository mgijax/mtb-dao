
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the TumorTypeDTO objects.
 */
public class TumorTypeComparator
       implements Comparator<TumorTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for TumorTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorTypeComparator(TumorTypeDAO._TUMORTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorTypeDAO.ID__TUMORTYPE_KEY
     *   <li>TumorTypeDAO.ID__TUMORCLASSIFICATION_KEY
     *   <li>TumorTypeDAO.ID__ORGAN_KEY
     *   <li>TumorTypeDAO.ID_COMMONNAME
     *   <li>TumorTypeDAO.ID_CREATE_USER
     *   <li>TumorTypeDAO.ID_CREATE_DATE
     *   <li>TumorTypeDAO.ID_UPDATE_USER
     *   <li>TumorTypeDAO.ID_UPDATE_DATE
     *   <li>TumorTypeDAO.ID__CONS_TT_KEY
     * </ul>
     */
    public TumorTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for TumorTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new TumorTypeComparator(TumorTypeDAO._TUMORTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>TumorTypeDAO.ID__TUMORTYPE_KEY
     *   <li>TumorTypeDAO.ID__TUMORCLASSIFICATION_KEY
     *   <li>TumorTypeDAO.ID__ORGAN_KEY
     *   <li>TumorTypeDAO.ID_COMMONNAME
     *   <li>TumorTypeDAO.ID_CREATE_USER
     *   <li>TumorTypeDAO.ID_CREATE_DATE
     *   <li>TumorTypeDAO.ID_UPDATE_USER
     *   <li>TumorTypeDAO.ID_UPDATE_DATE
     *   <li>TumorTypeDAO.ID__CONS_TT_KEY
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public TumorTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(TumorTypeDTO dto1, TumorTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case TumorTypeDAO.ID__TUMORTYPE_KEY:
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
            case TumorTypeDAO.ID__TUMORCLASSIFICATION_KEY:
                if (dto1.getTumorClassificationKey() == null && dto2.getTumorClassificationKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorClassificationKey() == null && dto2.getTumorClassificationKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorClassificationKey() != null && dto2.getTumorClassificationKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorClassificationKey().compareTo(dto2.getTumorClassificationKey());
                }
                break;
            case TumorTypeDAO.ID__ORGAN_KEY:
                if (dto1.getOrganKey() == null && dto2.getOrganKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganKey() == null && dto2.getOrganKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganKey() != null && dto2.getOrganKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganKey().compareTo(dto2.getOrganKey());
                }
                break;
            case TumorTypeDAO.ID_COMMONNAME:
                if (dto1.getCommonName() == null && dto2.getCommonName() != null) {
                    nReturn = -1;
                } else if (dto1.getCommonName() == null && dto2.getCommonName() == null) {
                    nReturn = 0;
                } else if (dto1.getCommonName() != null && dto2.getCommonName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCommonName().compareTo(dto2.getCommonName());
                }
                break;
            case TumorTypeDAO.ID_CREATE_USER:
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
            case TumorTypeDAO.ID_CREATE_DATE:
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
            case TumorTypeDAO.ID_UPDATE_USER:
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
            case TumorTypeDAO.ID_UPDATE_DATE:
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
            case TumorTypeDAO.ID__CONS_TT_KEY:
                if (dto1.getConsTtKey() == null && dto2.getConsTtKey() != null) {
                    nReturn = -1;
                } else if (dto1.getConsTtKey() == null && dto2.getConsTtKey() == null) {
                    nReturn = 0;
                } else if (dto1.getConsTtKey() != null && dto2.getConsTtKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getConsTtKey().compareTo(dto2.getConsTtKey());
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
