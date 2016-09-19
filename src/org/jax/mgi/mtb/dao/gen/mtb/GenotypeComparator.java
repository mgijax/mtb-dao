
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the GenotypeDTO objects.
 */
public class GenotypeComparator
       implements Comparator<GenotypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for GenotypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new GenotypeComparator(GenotypeDAO._GENOTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>GenotypeDAO.ID__GENOTYPE_KEY
     *   <li>GenotypeDAO.ID__STRAIN_KEY
     *   <li>GenotypeDAO.ID__ALLELEPAIR_KEY
     *   <li>GenotypeDAO.ID__REFERENCE_KEY
     *   <li>GenotypeDAO.ID_CREATE_USER
     *   <li>GenotypeDAO.ID_CREATE_DATE
     *   <li>GenotypeDAO.ID_UPDATE_USER
     *   <li>GenotypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public GenotypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for GenotypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new GenotypeComparator(GenotypeDAO._GENOTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>GenotypeDAO.ID__GENOTYPE_KEY
     *   <li>GenotypeDAO.ID__STRAIN_KEY
     *   <li>GenotypeDAO.ID__ALLELEPAIR_KEY
     *   <li>GenotypeDAO.ID__REFERENCE_KEY
     *   <li>GenotypeDAO.ID_CREATE_USER
     *   <li>GenotypeDAO.ID_CREATE_DATE
     *   <li>GenotypeDAO.ID_UPDATE_USER
     *   <li>GenotypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public GenotypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(GenotypeDTO dto1, GenotypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case GenotypeDAO.ID__GENOTYPE_KEY:
                if (dto1.getGenotypeKey() == null && dto2.getGenotypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getGenotypeKey() == null && dto2.getGenotypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getGenotypeKey() != null && dto2.getGenotypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getGenotypeKey().compareTo(dto2.getGenotypeKey());
                }
                break;
            case GenotypeDAO.ID__STRAIN_KEY:
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
            case GenotypeDAO.ID__ALLELEPAIR_KEY:
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
            case GenotypeDAO.ID__REFERENCE_KEY:
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
            case GenotypeDAO.ID_CREATE_USER:
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
            case GenotypeDAO.ID_CREATE_DATE:
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
            case GenotypeDAO.ID_UPDATE_USER:
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
            case GenotypeDAO.ID_UPDATE_DATE:
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
