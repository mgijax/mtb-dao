
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the PathologyImagesProbesDTO objects.
 */
public class PathologyImagesProbesComparator
       implements Comparator<PathologyImagesProbesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for PathologyImagesProbesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyImagesProbesComparator(PathologyImagesProbesDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyImagesProbesDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyImagesProbesDAO.ID__IMAGES_KEY
     *   <li>PathologyImagesProbesDAO.ID__PROBE_KEY
     *   <li>PathologyImagesProbesDAO.ID_CREATE_USER
     *   <li>PathologyImagesProbesDAO.ID_CREATE_DATE
     *   <li>PathologyImagesProbesDAO.ID_UPDATE_USER
     *   <li>PathologyImagesProbesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public PathologyImagesProbesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for PathologyImagesProbesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyImagesProbesComparator(PathologyImagesProbesDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyImagesProbesDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyImagesProbesDAO.ID__IMAGES_KEY
     *   <li>PathologyImagesProbesDAO.ID__PROBE_KEY
     *   <li>PathologyImagesProbesDAO.ID_CREATE_USER
     *   <li>PathologyImagesProbesDAO.ID_CREATE_DATE
     *   <li>PathologyImagesProbesDAO.ID_UPDATE_USER
     *   <li>PathologyImagesProbesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public PathologyImagesProbesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(PathologyImagesProbesDTO dto1, PathologyImagesProbesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case PathologyImagesProbesDAO.ID__PATHOLOGY_KEY:
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
            case PathologyImagesProbesDAO.ID__IMAGES_KEY:
                if (dto1.getImagesKey() == null && dto2.getImagesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getImagesKey() == null && dto2.getImagesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getImagesKey() != null && dto2.getImagesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getImagesKey().compareTo(dto2.getImagesKey());
                }
                break;
            case PathologyImagesProbesDAO.ID__PROBE_KEY:
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
            case PathologyImagesProbesDAO.ID_CREATE_USER:
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
            case PathologyImagesProbesDAO.ID_CREATE_DATE:
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
            case PathologyImagesProbesDAO.ID_UPDATE_USER:
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
            case PathologyImagesProbesDAO.ID_UPDATE_DATE:
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
