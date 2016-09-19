
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainReferencesDTO objects.
 */
public class StrainReferencesComparator
       implements Comparator<StrainReferencesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainReferencesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainReferencesComparator(StrainReferencesDAO._STRAINREFERENCES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainReferencesDAO.ID__STRAINREFERENCES_KEY
     *   <li>StrainReferencesDAO.ID__STRAIN_KEY
     *   <li>StrainReferencesDAO.ID__REFERENCE_KEY
     *   <li>StrainReferencesDAO.ID_CREATE_USER
     *   <li>StrainReferencesDAO.ID_CREATE_DATE
     *   <li>StrainReferencesDAO.ID_UPDATE_USER
     *   <li>StrainReferencesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainReferencesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainReferencesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainReferencesComparator(StrainReferencesDAO._STRAINREFERENCES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainReferencesDAO.ID__STRAINREFERENCES_KEY
     *   <li>StrainReferencesDAO.ID__STRAIN_KEY
     *   <li>StrainReferencesDAO.ID__REFERENCE_KEY
     *   <li>StrainReferencesDAO.ID_CREATE_USER
     *   <li>StrainReferencesDAO.ID_CREATE_DATE
     *   <li>StrainReferencesDAO.ID_UPDATE_USER
     *   <li>StrainReferencesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainReferencesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainReferencesDTO dto1, StrainReferencesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainReferencesDAO.ID__STRAINREFERENCES_KEY:
                if (dto1.getStrainReferencesKey() == null && dto2.getStrainReferencesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainReferencesKey() == null && dto2.getStrainReferencesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainReferencesKey() != null && dto2.getStrainReferencesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainReferencesKey().compareTo(dto2.getStrainReferencesKey());
                }
                break;
            case StrainReferencesDAO.ID__STRAIN_KEY:
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
            case StrainReferencesDAO.ID__REFERENCE_KEY:
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
            case StrainReferencesDAO.ID_CREATE_USER:
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
            case StrainReferencesDAO.ID_CREATE_DATE:
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
            case StrainReferencesDAO.ID_UPDATE_USER:
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
            case StrainReferencesDAO.ID_UPDATE_DATE:
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
