
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AllelePairDTO objects.
 */
public class AllelePairComparator
       implements Comparator<AllelePairDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AllelePairComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AllelePairComparator(AllelePairDAO._ALLELEPAIR_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AllelePairDAO.ID__ALLELEPAIR_KEY
     *   <li>AllelePairDAO.ID__ALLELE1_KEY
     *   <li>AllelePairDAO.ID__ALLELE2_KEY
     *   <li>AllelePairDAO.ID_SEQUENCE
     *   <li>AllelePairDAO.ID_CREATE_USER
     *   <li>AllelePairDAO.ID_CREATE_DATE
     *   <li>AllelePairDAO.ID_UPDATE_USER
     *   <li>AllelePairDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AllelePairComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AllelePairComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AllelePairComparator(AllelePairDAO._ALLELEPAIR_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AllelePairDAO.ID__ALLELEPAIR_KEY
     *   <li>AllelePairDAO.ID__ALLELE1_KEY
     *   <li>AllelePairDAO.ID__ALLELE2_KEY
     *   <li>AllelePairDAO.ID_SEQUENCE
     *   <li>AllelePairDAO.ID_CREATE_USER
     *   <li>AllelePairDAO.ID_CREATE_DATE
     *   <li>AllelePairDAO.ID_UPDATE_USER
     *   <li>AllelePairDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AllelePairComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AllelePairDTO dto1, AllelePairDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AllelePairDAO.ID__ALLELEPAIR_KEY:
                if (dto1.getAllelePairKey() == null && dto2.getAllelePairKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAllelePairKey() == null && dto2.getAllelePairKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAllelePairKey() != null && dto2.getAllelePairKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAllelePairKey().compareTo(dto2.getAllelePairKey());
                }
                break;
            case AllelePairDAO.ID__ALLELE1_KEY:
                if (dto1.getAllele1Key() == null && dto2.getAllele1Key() != null) {
                    nReturn = -1;
                } else if (dto1.getAllele1Key() == null && dto2.getAllele1Key() == null) {
                    nReturn = 0;
                } else if (dto1.getAllele1Key() != null && dto2.getAllele1Key() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAllele1Key().compareTo(dto2.getAllele1Key());
                }
                break;
            case AllelePairDAO.ID__ALLELE2_KEY:
                if (dto1.getAllele2Key() == null && dto2.getAllele2Key() != null) {
                    nReturn = -1;
                } else if (dto1.getAllele2Key() == null && dto2.getAllele2Key() == null) {
                    nReturn = 0;
                } else if (dto1.getAllele2Key() != null && dto2.getAllele2Key() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAllele2Key().compareTo(dto2.getAllele2Key());
                }
                break;
            case AllelePairDAO.ID_SEQUENCE:
                if (dto1.getSequence() == null && dto2.getSequence() != null) {
                    nReturn = -1;
                } else if (dto1.getSequence() == null && dto2.getSequence() == null) {
                    nReturn = 0;
                } else if (dto1.getSequence() != null && dto2.getSequence() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSequence().compareTo(dto2.getSequence());
                }
                break;
            case AllelePairDAO.ID_CREATE_USER:
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
            case AllelePairDAO.ID_CREATE_DATE:
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
            case AllelePairDAO.ID_UPDATE_USER:
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
            case AllelePairDAO.ID_UPDATE_DATE:
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
