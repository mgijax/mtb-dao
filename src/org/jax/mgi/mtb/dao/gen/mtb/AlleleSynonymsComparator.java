
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AlleleSynonymsDTO objects.
 */
public class AlleleSynonymsComparator
       implements Comparator<AlleleSynonymsDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AlleleSynonymsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleSynonymsComparator(AlleleSynonymsDAO._ALELLESYNONYMS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleSynonymsDAO.ID__ALELLESYNONYMS_KEY
     *   <li>AlleleSynonymsDAO.ID__ALLELE_KEY
     *   <li>AlleleSynonymsDAO.ID_SYNONYM
     *   <li>AlleleSynonymsDAO.ID__REFERENCE_KEY
     *   <li>AlleleSynonymsDAO.ID_CREATE_USER
     *   <li>AlleleSynonymsDAO.ID_CREATE_DATE
     *   <li>AlleleSynonymsDAO.ID_UPDATE_USER
     *   <li>AlleleSynonymsDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AlleleSynonymsComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AlleleSynonymsComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleSynonymsComparator(AlleleSynonymsDAO._ALELLESYNONYMS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleSynonymsDAO.ID__ALELLESYNONYMS_KEY
     *   <li>AlleleSynonymsDAO.ID__ALLELE_KEY
     *   <li>AlleleSynonymsDAO.ID_SYNONYM
     *   <li>AlleleSynonymsDAO.ID__REFERENCE_KEY
     *   <li>AlleleSynonymsDAO.ID_CREATE_USER
     *   <li>AlleleSynonymsDAO.ID_CREATE_DATE
     *   <li>AlleleSynonymsDAO.ID_UPDATE_USER
     *   <li>AlleleSynonymsDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AlleleSynonymsComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AlleleSynonymsDTO dto1, AlleleSynonymsDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AlleleSynonymsDAO.ID__ALELLESYNONYMS_KEY:
                if (dto1.getAlelleSynonymsKey() == null && dto2.getAlelleSynonymsKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlelleSynonymsKey() == null && dto2.getAlelleSynonymsKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlelleSynonymsKey() != null && dto2.getAlelleSynonymsKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlelleSynonymsKey().compareTo(dto2.getAlelleSynonymsKey());
                }
                break;
            case AlleleSynonymsDAO.ID__ALLELE_KEY:
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
            case AlleleSynonymsDAO.ID_SYNONYM:
                if (dto1.getSynonym() == null && dto2.getSynonym() != null) {
                    nReturn = -1;
                } else if (dto1.getSynonym() == null && dto2.getSynonym() == null) {
                    nReturn = 0;
                } else if (dto1.getSynonym() != null && dto2.getSynonym() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSynonym().compareTo(dto2.getSynonym());
                }
                break;
            case AlleleSynonymsDAO.ID__REFERENCE_KEY:
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
            case AlleleSynonymsDAO.ID_CREATE_USER:
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
            case AlleleSynonymsDAO.ID_CREATE_DATE:
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
            case AlleleSynonymsDAO.ID_UPDATE_USER:
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
            case AlleleSynonymsDAO.ID_UPDATE_DATE:
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
