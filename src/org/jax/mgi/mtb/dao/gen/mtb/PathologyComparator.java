
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the PathologyDTO objects.
 */
public class PathologyComparator
       implements Comparator<PathologyDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for PathologyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyComparator(PathologyDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyDAO.ID_AGEATNECROPSY
     *   <li>PathologyDAO.ID__PATHOLOGIST_KEY
     *   <li>PathologyDAO.ID__CONTRIBUTOR_KEY
     *   <li>PathologyDAO.ID_DESCRIPTION
     *   <li>PathologyDAO.ID_NOTE
     *   <li>PathologyDAO.ID_CREATE_USER
     *   <li>PathologyDAO.ID_CREATE_DATE
     *   <li>PathologyDAO.ID_UPDATE_USER
     *   <li>PathologyDAO.ID_UPDATE_DATE
     * </ul>
     */
    public PathologyComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for PathologyComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyComparator(PathologyDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyDAO.ID_AGEATNECROPSY
     *   <li>PathologyDAO.ID__PATHOLOGIST_KEY
     *   <li>PathologyDAO.ID__CONTRIBUTOR_KEY
     *   <li>PathologyDAO.ID_DESCRIPTION
     *   <li>PathologyDAO.ID_NOTE
     *   <li>PathologyDAO.ID_CREATE_USER
     *   <li>PathologyDAO.ID_CREATE_DATE
     *   <li>PathologyDAO.ID_UPDATE_USER
     *   <li>PathologyDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public PathologyComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(PathologyDTO dto1, PathologyDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case PathologyDAO.ID__PATHOLOGY_KEY:
                if (dto1.getPathologyKey() == null && dto2.getPathologyKey() != null) {
                    nReturn = -1;
                } else if (dto1.getPathologyKey() == null && dto2.getPathologyKey() == null) {
                    nReturn = 0;
                } else if (dto1.getPathologyKey() != null && dto2.getPathologyKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPathologyKey().compareTo(dto2.getPathologyKey());
                }
                break;
            case PathologyDAO.ID_AGEATNECROPSY:
                if (dto1.getAgeAtNecropsy() == null && dto2.getAgeAtNecropsy() != null) {
                    nReturn = -1;
                } else if (dto1.getAgeAtNecropsy() == null && dto2.getAgeAtNecropsy() == null) {
                    nReturn = 0;
                } else if (dto1.getAgeAtNecropsy() != null && dto2.getAgeAtNecropsy() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAgeAtNecropsy().compareTo(dto2.getAgeAtNecropsy());
                }
                break;
            case PathologyDAO.ID__PATHOLOGIST_KEY:
                if (dto1.getPathologistKey() == null && dto2.getPathologistKey() != null) {
                    nReturn = -1;
                } else if (dto1.getPathologistKey() == null && dto2.getPathologistKey() == null) {
                    nReturn = 0;
                } else if (dto1.getPathologistKey() != null && dto2.getPathologistKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPathologistKey().compareTo(dto2.getPathologistKey());
                }
                break;
            case PathologyDAO.ID__CONTRIBUTOR_KEY:
                if (dto1.getContributorKey() == null && dto2.getContributorKey() != null) {
                    nReturn = -1;
                } else if (dto1.getContributorKey() == null && dto2.getContributorKey() == null) {
                    nReturn = 0;
                } else if (dto1.getContributorKey() != null && dto2.getContributorKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getContributorKey().compareTo(dto2.getContributorKey());
                }
                break;
            case PathologyDAO.ID_DESCRIPTION:
                if (dto1.getDescription() == null && dto2.getDescription() != null) {
                    nReturn = -1;
                } else if (dto1.getDescription() == null && dto2.getDescription() == null) {
                    nReturn = 0;
                } else if (dto1.getDescription() != null && dto2.getDescription() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getDescription().compareTo(dto2.getDescription());
                }
                break;
            case PathologyDAO.ID_NOTE:
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
            case PathologyDAO.ID_CREATE_USER:
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
            case PathologyDAO.ID_CREATE_DATE:
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
            case PathologyDAO.ID_UPDATE_USER:
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
            case PathologyDAO.ID_UPDATE_DATE:
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
