
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AlleleDTO objects.
 */
public class AlleleComparator
       implements Comparator<AlleleDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AlleleComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleComparator(AlleleDAO._ALLELE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleDAO.ID__ALLELE_KEY
     *   <li>AlleleDAO.ID__ALLELETYPE_KEY
     *   <li>AlleleDAO.ID_NAME
     *   <li>AlleleDAO.ID_SYMBOL
     *   <li>AlleleDAO.ID_SOMATICIND
     *   <li>AlleleDAO.ID__CELLLINE_KEY
     *   <li>AlleleDAO.ID_NOTE
     *   <li>AlleleDAO.ID_CREATE_USER
     *   <li>AlleleDAO.ID_CREATE_DATE
     *   <li>AlleleDAO.ID_UPDATE_USER
     *   <li>AlleleDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AlleleComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AlleleComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleComparator(AlleleDAO._ALLELE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleDAO.ID__ALLELE_KEY
     *   <li>AlleleDAO.ID__ALLELETYPE_KEY
     *   <li>AlleleDAO.ID_NAME
     *   <li>AlleleDAO.ID_SYMBOL
     *   <li>AlleleDAO.ID_SOMATICIND
     *   <li>AlleleDAO.ID__CELLLINE_KEY
     *   <li>AlleleDAO.ID_NOTE
     *   <li>AlleleDAO.ID_CREATE_USER
     *   <li>AlleleDAO.ID_CREATE_DATE
     *   <li>AlleleDAO.ID_UPDATE_USER
     *   <li>AlleleDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AlleleComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AlleleDTO dto1, AlleleDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AlleleDAO.ID__ALLELE_KEY:
                if (dto1.getAlleleKey() == null && dto2.getAlleleKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleKey() == null && dto2.getAlleleKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleKey() != null && dto2.getAlleleKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleKey().compareTo(dto2.getAlleleKey());
                }
                break;
            case AlleleDAO.ID__ALLELETYPE_KEY:
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
            case AlleleDAO.ID_NAME:
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
            case AlleleDAO.ID_SYMBOL:
                if (dto1.getSymbol() == null && dto2.getSymbol() != null) {
                    nReturn = -1;
                } else if (dto1.getSymbol() == null && dto2.getSymbol() == null) {
                    nReturn = 0;
                } else if (dto1.getSymbol() != null && dto2.getSymbol() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSymbol().compareTo(dto2.getSymbol());
                }
                break;
            case AlleleDAO.ID_SOMATICIND:
                if (dto1.getSomaticInd() == null && dto2.getSomaticInd() != null) {
                    nReturn = -1;
                } else if (dto1.getSomaticInd() == null && dto2.getSomaticInd() == null) {
                    nReturn = 0;
                } else if (dto1.getSomaticInd() != null && dto2.getSomaticInd() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSomaticInd().compareTo(dto2.getSomaticInd());
                }
                break;
            case AlleleDAO.ID__CELLLINE_KEY:
                if (dto1.getCellLineKey() == null && dto2.getCellLineKey() != null) {
                    nReturn = -1;
                } else if (dto1.getCellLineKey() == null && dto2.getCellLineKey() == null) {
                    nReturn = 0;
                } else if (dto1.getCellLineKey() != null && dto2.getCellLineKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCellLineKey().compareTo(dto2.getCellLineKey());
                }
                break;
            case AlleleDAO.ID_NOTE:
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
            case AlleleDAO.ID_CREATE_USER:
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
            case AlleleDAO.ID_CREATE_DATE:
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
            case AlleleDAO.ID_UPDATE_USER:
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
            case AlleleDAO.ID_UPDATE_DATE:
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
