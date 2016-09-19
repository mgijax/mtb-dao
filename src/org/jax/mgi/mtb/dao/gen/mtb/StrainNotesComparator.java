
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the StrainNotesDTO objects.
 */
public class StrainNotesComparator
       implements Comparator<StrainNotesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for StrainNotesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainNotesComparator(StrainNotesDAO._STRAINNOTES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainNotesDAO.ID__STRAINNOTES_KEY
     *   <li>StrainNotesDAO.ID__STRAIN_KEY
     *   <li>StrainNotesDAO.ID__REFERENCE_KEY
     *   <li>StrainNotesDAO.ID_NOTE
     *   <li>StrainNotesDAO.ID_CREATE_USER
     *   <li>StrainNotesDAO.ID_CREATE_DATE
     *   <li>StrainNotesDAO.ID_UPDATE_USER
     *   <li>StrainNotesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public StrainNotesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for StrainNotesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new StrainNotesComparator(StrainNotesDAO._STRAINNOTES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>StrainNotesDAO.ID__STRAINNOTES_KEY
     *   <li>StrainNotesDAO.ID__STRAIN_KEY
     *   <li>StrainNotesDAO.ID__REFERENCE_KEY
     *   <li>StrainNotesDAO.ID_NOTE
     *   <li>StrainNotesDAO.ID_CREATE_USER
     *   <li>StrainNotesDAO.ID_CREATE_DATE
     *   <li>StrainNotesDAO.ID_UPDATE_USER
     *   <li>StrainNotesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public StrainNotesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(StrainNotesDTO dto1, StrainNotesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case StrainNotesDAO.ID__STRAINNOTES_KEY:
                if (dto1.getStrainNotesKey() == null && dto2.getStrainNotesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getStrainNotesKey() == null && dto2.getStrainNotesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getStrainNotesKey() != null && dto2.getStrainNotesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStrainNotesKey().compareTo(dto2.getStrainNotesKey());
                }
                break;
            case StrainNotesDAO.ID__STRAIN_KEY:
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
            case StrainNotesDAO.ID__REFERENCE_KEY:
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
            case StrainNotesDAO.ID_NOTE:
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
            case StrainNotesDAO.ID_CREATE_USER:
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
            case StrainNotesDAO.ID_CREATE_DATE:
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
            case StrainNotesDAO.ID_UPDATE_USER:
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
            case StrainNotesDAO.ID_UPDATE_DATE:
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
