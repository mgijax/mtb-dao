
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the ChromosomeDTO objects.
 */
public class ChromosomeComparator
       implements Comparator<ChromosomeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for ChromosomeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ChromosomeComparator(ChromosomeDAO._CHROMOSOME_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ChromosomeDAO.ID__CHROMOSOME_KEY
     *   <li>ChromosomeDAO.ID__ORGANISM_KEY
     *   <li>ChromosomeDAO.ID_CHROMOSOME
     *   <li>ChromosomeDAO.ID_ORDERNUM
     *   <li>ChromosomeDAO.ID_CREATE_USER
     *   <li>ChromosomeDAO.ID_CREATE_DATE
     *   <li>ChromosomeDAO.ID_UPDATE_USER
     *   <li>ChromosomeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public ChromosomeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for ChromosomeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ChromosomeComparator(ChromosomeDAO._CHROMOSOME_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ChromosomeDAO.ID__CHROMOSOME_KEY
     *   <li>ChromosomeDAO.ID__ORGANISM_KEY
     *   <li>ChromosomeDAO.ID_CHROMOSOME
     *   <li>ChromosomeDAO.ID_ORDERNUM
     *   <li>ChromosomeDAO.ID_CREATE_USER
     *   <li>ChromosomeDAO.ID_CREATE_DATE
     *   <li>ChromosomeDAO.ID_UPDATE_USER
     *   <li>ChromosomeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ChromosomeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(ChromosomeDTO dto1, ChromosomeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case ChromosomeDAO.ID__CHROMOSOME_KEY:
                if (dto1.getChromosomeKey() == null && dto2.getChromosomeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getChromosomeKey() == null && dto2.getChromosomeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getChromosomeKey() != null && dto2.getChromosomeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getChromosomeKey().compareTo(dto2.getChromosomeKey());
                }
                break;
            case ChromosomeDAO.ID__ORGANISM_KEY:
                if (dto1.getOrganismKey() == null && dto2.getOrganismKey() != null) {
                    nReturn = -1;
                } else if (dto1.getOrganismKey() == null && dto2.getOrganismKey() == null) {
                    nReturn = 0;
                } else if (dto1.getOrganismKey() != null && dto2.getOrganismKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrganismKey().compareTo(dto2.getOrganismKey());
                }
                break;
            case ChromosomeDAO.ID_CHROMOSOME:
                if (dto1.getChromosome() == null && dto2.getChromosome() != null) {
                    nReturn = -1;
                } else if (dto1.getChromosome() == null && dto2.getChromosome() == null) {
                    nReturn = 0;
                } else if (dto1.getChromosome() != null && dto2.getChromosome() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getChromosome().compareTo(dto2.getChromosome());
                }
                break;
            case ChromosomeDAO.ID_ORDERNUM:
                if (dto1.getOrderNum() == null && dto2.getOrderNum() != null) {
                    nReturn = -1;
                } else if (dto1.getOrderNum() == null && dto2.getOrderNum() == null) {
                    nReturn = 0;
                } else if (dto1.getOrderNum() != null && dto2.getOrderNum() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getOrderNum().compareTo(dto2.getOrderNum());
                }
                break;
            case ChromosomeDAO.ID_CREATE_USER:
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
            case ChromosomeDAO.ID_CREATE_DATE:
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
            case ChromosomeDAO.ID_UPDATE_USER:
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
            case ChromosomeDAO.ID_UPDATE_DATE:
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
