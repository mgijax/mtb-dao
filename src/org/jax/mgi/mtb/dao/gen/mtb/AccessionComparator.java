
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AccessionDTO objects.
 */
public class AccessionComparator
       implements Comparator<AccessionDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AccessionComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AccessionComparator(AccessionDAO._ACCESSION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AccessionDAO.ID__ACCESSION_KEY
     *   <li>AccessionDAO.ID_ACCID
     *   <li>AccessionDAO.ID_PREFIXPART
     *   <li>AccessionDAO.ID_NUMERICPART
     *   <li>AccessionDAO.ID__OBJECT_KEY
     *   <li>AccessionDAO.ID__MTBTYPES_KEY
     *   <li>AccessionDAO.ID__SITEINFO_KEY
     *   <li>AccessionDAO.ID_CREATE_USER
     *   <li>AccessionDAO.ID_CREATE_DATE
     *   <li>AccessionDAO.ID_UPDATE_USER
     *   <li>AccessionDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AccessionComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AccessionComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AccessionComparator(AccessionDAO._ACCESSION_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AccessionDAO.ID__ACCESSION_KEY
     *   <li>AccessionDAO.ID_ACCID
     *   <li>AccessionDAO.ID_PREFIXPART
     *   <li>AccessionDAO.ID_NUMERICPART
     *   <li>AccessionDAO.ID__OBJECT_KEY
     *   <li>AccessionDAO.ID__MTBTYPES_KEY
     *   <li>AccessionDAO.ID__SITEINFO_KEY
     *   <li>AccessionDAO.ID_CREATE_USER
     *   <li>AccessionDAO.ID_CREATE_DATE
     *   <li>AccessionDAO.ID_UPDATE_USER
     *   <li>AccessionDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AccessionComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AccessionDTO dto1, AccessionDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AccessionDAO.ID__ACCESSION_KEY:
                if (dto1.getAccessionKey() == null && dto2.getAccessionKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAccessionKey() == null && dto2.getAccessionKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAccessionKey() != null && dto2.getAccessionKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAccessionKey().compareTo(dto2.getAccessionKey());
                }
                break;
            case AccessionDAO.ID_ACCID:
                if (dto1.getAccID() == null && dto2.getAccID() != null) {
                    nReturn = -1;
                } else if (dto1.getAccID() == null && dto2.getAccID() == null) {
                    nReturn = 0;
                } else if (dto1.getAccID() != null && dto2.getAccID() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAccID().compareTo(dto2.getAccID());
                }
                break;
            case AccessionDAO.ID_PREFIXPART:
                if (dto1.getPrefixPart() == null && dto2.getPrefixPart() != null) {
                    nReturn = -1;
                } else if (dto1.getPrefixPart() == null && dto2.getPrefixPart() == null) {
                    nReturn = 0;
                } else if (dto1.getPrefixPart() != null && dto2.getPrefixPart() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPrefixPart().compareTo(dto2.getPrefixPart());
                }
                break;
            case AccessionDAO.ID_NUMERICPART:
                if (dto1.getNumericPart() == null && dto2.getNumericPart() != null) {
                    nReturn = -1;
                } else if (dto1.getNumericPart() == null && dto2.getNumericPart() == null) {
                    nReturn = 0;
                } else if (dto1.getNumericPart() != null && dto2.getNumericPart() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNumericPart().compareTo(dto2.getNumericPart());
                }
                break;
            case AccessionDAO.ID__OBJECT_KEY:
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
            case AccessionDAO.ID__MTBTYPES_KEY:
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
            case AccessionDAO.ID__SITEINFO_KEY:
                if (dto1.getSiteInfoKey() == null && dto2.getSiteInfoKey() != null) {
                    nReturn = -1;
                } else if (dto1.getSiteInfoKey() == null && dto2.getSiteInfoKey() == null) {
                    nReturn = 0;
                } else if (dto1.getSiteInfoKey() != null && dto2.getSiteInfoKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSiteInfoKey().compareTo(dto2.getSiteInfoKey());
                }
                break;
            case AccessionDAO.ID_CREATE_USER:
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
            case AccessionDAO.ID_CREATE_DATE:
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
            case AccessionDAO.ID_UPDATE_USER:
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
            case AccessionDAO.ID_UPDATE_DATE:
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
