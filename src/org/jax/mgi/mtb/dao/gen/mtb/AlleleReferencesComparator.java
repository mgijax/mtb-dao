
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AlleleReferencesDTO objects.
 */
public class AlleleReferencesComparator
       implements Comparator<AlleleReferencesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AlleleReferencesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleReferencesComparator(AlleleReferencesDAO._ALLELEREFERENCES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleReferencesDAO.ID__ALLELEREFERENCES_KEY
     *   <li>AlleleReferencesDAO.ID__ALLELE_KEY
     *   <li>AlleleReferencesDAO.ID__REFERENCE_KEY
     *   <li>AlleleReferencesDAO.ID_PRIMARYREF
     *   <li>AlleleReferencesDAO.ID_CREATE_USER
     *   <li>AlleleReferencesDAO.ID_CREATE_DATE
     *   <li>AlleleReferencesDAO.ID_UPDATE_USER
     *   <li>AlleleReferencesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AlleleReferencesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AlleleReferencesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AlleleReferencesComparator(AlleleReferencesDAO._ALLELEREFERENCES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AlleleReferencesDAO.ID__ALLELEREFERENCES_KEY
     *   <li>AlleleReferencesDAO.ID__ALLELE_KEY
     *   <li>AlleleReferencesDAO.ID__REFERENCE_KEY
     *   <li>AlleleReferencesDAO.ID_PRIMARYREF
     *   <li>AlleleReferencesDAO.ID_CREATE_USER
     *   <li>AlleleReferencesDAO.ID_CREATE_DATE
     *   <li>AlleleReferencesDAO.ID_UPDATE_USER
     *   <li>AlleleReferencesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AlleleReferencesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AlleleReferencesDTO dto1, AlleleReferencesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AlleleReferencesDAO.ID__ALLELEREFERENCES_KEY:
                if (dto1.getAlleleReferencesKey() == null && dto2.getAlleleReferencesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleReferencesKey() == null && dto2.getAlleleReferencesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleReferencesKey() != null && dto2.getAlleleReferencesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleReferencesKey().compareTo(dto2.getAlleleReferencesKey());
                }
                break;
            case AlleleReferencesDAO.ID__ALLELE_KEY:
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
            case AlleleReferencesDAO.ID__REFERENCE_KEY:
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
            case AlleleReferencesDAO.ID_PRIMARYREF:
                if (dto1.getPrimaryRef() == null && dto2.getPrimaryRef() != null) {
                    nReturn = -1;
                } else if (dto1.getPrimaryRef() == null && dto2.getPrimaryRef() == null) {
                    nReturn = 0;
                } else if (dto1.getPrimaryRef() != null && dto2.getPrimaryRef() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPrimaryRef().compareTo(dto2.getPrimaryRef());
                }
                break;
            case AlleleReferencesDAO.ID_CREATE_USER:
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
            case AlleleReferencesDAO.ID_CREATE_DATE:
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
            case AlleleReferencesDAO.ID_UPDATE_USER:
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
            case AlleleReferencesDAO.ID_UPDATE_DATE:
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
