
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the ProbeDTO objects.
 */
public class ProbeComparator
       implements Comparator<ProbeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for ProbeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProbeComparator(ProbeDAO._PROBE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProbeDAO.ID__PROBE_KEY
     *   <li>ProbeDAO.ID_NAME
     *   <li>ProbeDAO.ID_TARGET
     *   <li>ProbeDAO.ID_COUNTERSTAIN
     *   <li>ProbeDAO.ID_URL
     *   <li>ProbeDAO.ID_TYPE
     *   <li>ProbeDAO.ID_NOTES
     *   <li>ProbeDAO.ID_SUPPLIERNAME
     *   <li>ProbeDAO.ID_SUPPLIERADDRESS
     *   <li>ProbeDAO.ID_SUPPLIERURL
     *   <li>ProbeDAO.ID_CREATE_USER
     *   <li>ProbeDAO.ID_CREATE_DATE
     *   <li>ProbeDAO.ID_UPDATE_USER
     *   <li>ProbeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public ProbeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for ProbeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ProbeComparator(ProbeDAO._PROBE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ProbeDAO.ID__PROBE_KEY
     *   <li>ProbeDAO.ID_NAME
     *   <li>ProbeDAO.ID_TARGET
     *   <li>ProbeDAO.ID_COUNTERSTAIN
     *   <li>ProbeDAO.ID_URL
     *   <li>ProbeDAO.ID_TYPE
     *   <li>ProbeDAO.ID_NOTES
     *   <li>ProbeDAO.ID_SUPPLIERNAME
     *   <li>ProbeDAO.ID_SUPPLIERADDRESS
     *   <li>ProbeDAO.ID_SUPPLIERURL
     *   <li>ProbeDAO.ID_CREATE_USER
     *   <li>ProbeDAO.ID_CREATE_DATE
     *   <li>ProbeDAO.ID_UPDATE_USER
     *   <li>ProbeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ProbeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(ProbeDTO dto1, ProbeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case ProbeDAO.ID__PROBE_KEY:
                if (dto1.getProbeKey() == null && dto2.getProbeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getProbeKey() == null && dto2.getProbeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getProbeKey() != null && dto2.getProbeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getProbeKey().compareTo(dto2.getProbeKey());
                }
                break;
            case ProbeDAO.ID_NAME:
                if (dto1.getName() == null && dto2.getName() != null) {
                    nReturn = -1;
                } else if (dto1.getName() == null && dto2.getName() == null) {
                    nReturn = 0;
                } else if (dto1.getName() != null && dto2.getName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getName().compareTo(dto2.getName());
                }
                break;
            case ProbeDAO.ID_TARGET:
                if (dto1.getTarget() == null && dto2.getTarget() != null) {
                    nReturn = -1;
                } else if (dto1.getTarget() == null && dto2.getTarget() == null) {
                    nReturn = 0;
                } else if (dto1.getTarget() != null && dto2.getTarget() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTarget().compareTo(dto2.getTarget());
                }
                break;
            case ProbeDAO.ID_COUNTERSTAIN:
                if (dto1.getCounterstain() == null && dto2.getCounterstain() != null) {
                    nReturn = -1;
                } else if (dto1.getCounterstain() == null && dto2.getCounterstain() == null) {
                    nReturn = 0;
                } else if (dto1.getCounterstain() != null && dto2.getCounterstain() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCounterstain().compareTo(dto2.getCounterstain());
                }
                break;
            case ProbeDAO.ID_URL:
                if (dto1.getUrl() == null && dto2.getUrl() != null) {
                    nReturn = -1;
                } else if (dto1.getUrl() == null && dto2.getUrl() == null) {
                    nReturn = 0;
                } else if (dto1.getUrl() != null && dto2.getUrl() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUrl().compareTo(dto2.getUrl());
                }
                break;
            case ProbeDAO.ID_TYPE:
                if (dto1.getType() == null && dto2.getType() != null) {
                    nReturn = -1;
                } else if (dto1.getType() == null && dto2.getType() == null) {
                    nReturn = 0;
                } else if (dto1.getType() != null && dto2.getType() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getType().compareTo(dto2.getType());
                }
                break;
            case ProbeDAO.ID_NOTES:
                if (dto1.getNotes() == null && dto2.getNotes() != null) {
                    nReturn = -1;
                } else if (dto1.getNotes() == null && dto2.getNotes() == null) {
                    nReturn = 0;
                } else if (dto1.getNotes() != null && dto2.getNotes() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNotes().compareTo(dto2.getNotes());
                }
                break;
            case ProbeDAO.ID_SUPPLIERNAME:
                if (dto1.getSupplierName() == null && dto2.getSupplierName() != null) {
                    nReturn = -1;
                } else if (dto1.getSupplierName() == null && dto2.getSupplierName() == null) {
                    nReturn = 0;
                } else if (dto1.getSupplierName() != null && dto2.getSupplierName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSupplierName().compareTo(dto2.getSupplierName());
                }
                break;
            case ProbeDAO.ID_SUPPLIERADDRESS:
                if (dto1.getSupplierAddress() == null && dto2.getSupplierAddress() != null) {
                    nReturn = -1;
                } else if (dto1.getSupplierAddress() == null && dto2.getSupplierAddress() == null) {
                    nReturn = 0;
                } else if (dto1.getSupplierAddress() != null && dto2.getSupplierAddress() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSupplierAddress().compareTo(dto2.getSupplierAddress());
                }
                break;
            case ProbeDAO.ID_SUPPLIERURL:
                if (dto1.getSupplierUrl() == null && dto2.getSupplierUrl() != null) {
                    nReturn = -1;
                } else if (dto1.getSupplierUrl() == null && dto2.getSupplierUrl() == null) {
                    nReturn = 0;
                } else if (dto1.getSupplierUrl() != null && dto2.getSupplierUrl() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getSupplierUrl().compareTo(dto2.getSupplierUrl());
                }
                break;
            case ProbeDAO.ID_CREATE_USER:
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
            case ProbeDAO.ID_CREATE_DATE:
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
            case ProbeDAO.ID_UPDATE_USER:
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
            case ProbeDAO.ID_UPDATE_DATE:
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
