
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 

/**
 * Comparator class is used to sort the SampleAssocDTO objects.
 */
public class SampleAssocComparator
       implements Comparator<SampleAssocDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for SampleAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleAssocComparator(SampleAssocDAO._SAMPLEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleAssocDAO.ID__SAMPLEASSOC_KEY
     *   <li>SampleAssocDAO.ID__SAMPLE_KEY
     *   <li>SampleAssocDAO.ID__OBJECT_KEY
     *   <li>SampleAssocDAO.ID__MTBTYPES_KEY
     *   <li>SampleAssocDAO.ID_CREATE_USER
     *   <li>SampleAssocDAO.ID_CREATE_DATE
     *   <li>SampleAssocDAO.ID_UPDATE_USER
     *   <li>SampleAssocDAO.ID_UPDATE_DATE
     * </ul>
     */
    public SampleAssocComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for SampleAssocComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new SampleAssocComparator(SampleAssocDAO._SAMPLEASSOC_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>SampleAssocDAO.ID__SAMPLEASSOC_KEY
     *   <li>SampleAssocDAO.ID__SAMPLE_KEY
     *   <li>SampleAssocDAO.ID__OBJECT_KEY
     *   <li>SampleAssocDAO.ID__MTBTYPES_KEY
     *   <li>SampleAssocDAO.ID_CREATE_USER
     *   <li>SampleAssocDAO.ID_CREATE_DATE
     *   <li>SampleAssocDAO.ID_UPDATE_USER
     *   <li>SampleAssocDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public SampleAssocComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(SampleAssocDTO dto1, SampleAssocDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case SampleAssocDAO.ID__SAMPLEASSOC_KEY:
                if (dto1.getSampleassocKey() == null && dto2.getSampleassocKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSampleassocKey() == null && dto2.getSampleassocKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSampleassocKey() != null && dto2.getSampleassocKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSampleassocKey().compareTo(dto2.getSampleassocKey());
                }
                break;
            case SampleAssocDAO.ID__SAMPLE_KEY:
                if (dto1.getSampleKey() == null && dto2.getSampleKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSampleKey() == null && dto2.getSampleKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSampleKey() != null && dto2.getSampleKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSampleKey().compareTo(dto2.getSampleKey());
                }
                break;
            case SampleAssocDAO.ID__OBJECT_KEY:
                if (dto1.getObjectKey() == null && dto2.getObjectKey() != null) {
                    nReturn = -1;
                } else if (dto1.getObjectKey() == null && dto2.getObjectKey() == null) {
                    nReturn = 0;
                } else if (dto1.getObjectKey() != null && dto2.getObjectKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getObjectKey().compareTo(dto2.getObjectKey());
                }
                break;
            case SampleAssocDAO.ID__MTBTYPES_KEY:
                if (dto1.getMTBTypesKey() == null && dto2.getMTBTypesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBTypesKey() == null && dto2.getMTBTypesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBTypesKey() != null && dto2.getMTBTypesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBTypesKey().compareTo(dto2.getMTBTypesKey());
                }
                break;
            case SampleAssocDAO.ID_CREATE_USER:
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
            case SampleAssocDAO.ID_CREATE_DATE:
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
            case SampleAssocDAO.ID_UPDATE_USER:
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
            case SampleAssocDAO.ID_UPDATE_DATE:
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
