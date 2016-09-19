
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the ReferenceTumorTypeAssocDTO objects.
 */
public class ReferenceTumorTypeAssocComparator
       implements Comparator<ReferenceTumorTypeAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for ReferenceTumorTypeAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ReferenceTumorTypeAssocComparator(ReferenceTumorTypeAssocDAO._REFERENCETUMORTYPEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ReferenceTumorTypeAssocDAO.ID__REFERENCETUMORTYPEASSOC_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__REFERENCE_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__TUMORTYPE_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__MTBDATASTATUS_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID_CREATE_USER
     *   <li>ReferenceTumorTypeAssocDAO.ID_CREATE_DATE
     *   <li>ReferenceTumorTypeAssocDAO.ID_UPDATE_USER
     *   <li>ReferenceTumorTypeAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public ReferenceTumorTypeAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for ReferenceTumorTypeAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ReferenceTumorTypeAssocComparator(ReferenceTumorTypeAssocDAO._REFERENCETUMORTYPEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ReferenceTumorTypeAssocDAO.ID__REFERENCETUMORTYPEASSOC_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__REFERENCE_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__TUMORTYPE_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID__MTBDATASTATUS_KEY
     *   <li>ReferenceTumorTypeAssocDAO.ID_CREATE_USER
     *   <li>ReferenceTumorTypeAssocDAO.ID_CREATE_DATE
     *   <li>ReferenceTumorTypeAssocDAO.ID_UPDATE_USER
     *   <li>ReferenceTumorTypeAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ReferenceTumorTypeAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(ReferenceTumorTypeAssocDTO dto1, ReferenceTumorTypeAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case ReferenceTumorTypeAssocDAO.ID__REFERENCETUMORTYPEASSOC_KEY:
                if (dto1.getReferenceTumorTypeAssocKey() == null && dto2.getReferenceTumorTypeAssocKey() != null) {
                    nReturn = -1;
                } else if (dto1.getReferenceTumorTypeAssocKey() == null && dto2.getReferenceTumorTypeAssocKey() == null) {
                    nReturn = 0;
                } else if (dto1.getReferenceTumorTypeAssocKey() != null && dto2.getReferenceTumorTypeAssocKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReferenceTumorTypeAssocKey().compareTo(dto2.getReferenceTumorTypeAssocKey());
                }
                break;
            case ReferenceTumorTypeAssocDAO.ID__REFERENCE_KEY:
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
            case ReferenceTumorTypeAssocDAO.ID__TUMORTYPE_KEY:
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
            case ReferenceTumorTypeAssocDAO.ID__MTBDATASTATUS_KEY:
                if (dto1.getMTBDataStatusKey() == null && dto2.getMTBDataStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBDataStatusKey() == null && dto2.getMTBDataStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBDataStatusKey() != null && dto2.getMTBDataStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBDataStatusKey().compareTo(dto2.getMTBDataStatusKey());
                }
                break;
            case ReferenceTumorTypeAssocDAO.ID_CREATE_USER:
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
            case ReferenceTumorTypeAssocDAO.ID_CREATE_DATE:
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
            case ReferenceTumorTypeAssocDAO.ID_UPDATE_USER:
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
            case ReferenceTumorTypeAssocDAO.ID_UPDATE_DATE:
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
