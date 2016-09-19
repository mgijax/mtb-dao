
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the BreedingStatusDTO objects.
 */
public class BreedingStatusComparator
       implements Comparator<BreedingStatusDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for BreedingStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new BreedingStatusComparator(BreedingStatusDAO._BREEDINGSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>BreedingStatusDAO.ID__BREEDINGSTATUS_KEY
     *   <li>BreedingStatusDAO.ID_TEXT
     *   <li>BreedingStatusDAO.ID_CREATE_USER
     *   <li>BreedingStatusDAO.ID_CREATE_DATE
     *   <li>BreedingStatusDAO.ID_UPDATE_USER
     *   <li>BreedingStatusDAO.ID_UPDATE_DATE
     * </ul>
     */
    public BreedingStatusComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for BreedingStatusComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new BreedingStatusComparator(BreedingStatusDAO._BREEDINGSTATUS_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>BreedingStatusDAO.ID__BREEDINGSTATUS_KEY
     *   <li>BreedingStatusDAO.ID_TEXT
     *   <li>BreedingStatusDAO.ID_CREATE_USER
     *   <li>BreedingStatusDAO.ID_CREATE_DATE
     *   <li>BreedingStatusDAO.ID_UPDATE_USER
     *   <li>BreedingStatusDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public BreedingStatusComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(BreedingStatusDTO dto1, BreedingStatusDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case BreedingStatusDAO.ID__BREEDINGSTATUS_KEY:
                if (dto1.getBreedingStatusKey() == null && dto2.getBreedingStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getBreedingStatusKey() == null && dto2.getBreedingStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getBreedingStatusKey() != null && dto2.getBreedingStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getBreedingStatusKey().compareTo(dto2.getBreedingStatusKey());
                }
                break;
            case BreedingStatusDAO.ID_TEXT:
                if (dto1.getText() == null && dto2.getText() != null) {
                    nReturn = -1;
                } else if (dto1.getText() == null && dto2.getText() == null) {
                    nReturn = 0;
                } else if (dto1.getText() != null && dto2.getText() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getText().compareTo(dto2.getText());
                }
                break;
            case BreedingStatusDAO.ID_CREATE_USER:
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
            case BreedingStatusDAO.ID_CREATE_DATE:
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
            case BreedingStatusDAO.ID_UPDATE_USER:
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
            case BreedingStatusDAO.ID_UPDATE_DATE:
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
