
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the PathologyImagesDTO objects.
 */
public class PathologyImagesComparator
       implements Comparator<PathologyImagesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for PathologyImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyImagesComparator(PathologyImagesDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyImagesDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyImagesDAO.ID__IMAGES_KEY
     *   <li>PathologyImagesDAO.ID_MAGNIFICATION
     *   <li>PathologyImagesDAO.ID_STAIN
     *   <li>PathologyImagesDAO.ID_CAPTION
     *   <li>PathologyImagesDAO.ID_COPYRIGHT
     *   <li>PathologyImagesDAO.ID_NOTES
     *   <li>PathologyImagesDAO.ID__FIXATIVE_KEY
     *   <li>PathologyImagesDAO.ID_CREATE_USER
     *   <li>PathologyImagesDAO.ID_CREATE_DATE
     *   <li>PathologyImagesDAO.ID_UPDATE_USER
     *   <li>PathologyImagesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public PathologyImagesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for PathologyImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new PathologyImagesComparator(PathologyImagesDAO._PATHOLOGY_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>PathologyImagesDAO.ID__PATHOLOGY_KEY
     *   <li>PathologyImagesDAO.ID__IMAGES_KEY
     *   <li>PathologyImagesDAO.ID_MAGNIFICATION
     *   <li>PathologyImagesDAO.ID_STAIN
     *   <li>PathologyImagesDAO.ID_CAPTION
     *   <li>PathologyImagesDAO.ID_COPYRIGHT
     *   <li>PathologyImagesDAO.ID_NOTES
     *   <li>PathologyImagesDAO.ID__FIXATIVE_KEY
     *   <li>PathologyImagesDAO.ID_CREATE_USER
     *   <li>PathologyImagesDAO.ID_CREATE_DATE
     *   <li>PathologyImagesDAO.ID_UPDATE_USER
     *   <li>PathologyImagesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public PathologyImagesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(PathologyImagesDTO dto1, PathologyImagesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case PathologyImagesDAO.ID__PATHOLOGY_KEY:
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
            case PathologyImagesDAO.ID__IMAGES_KEY:
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
            case PathologyImagesDAO.ID_MAGNIFICATION:
                if (dto1.getMagnification() == null && dto2.getMagnification() != null) {
                    nReturn = -1;
                } else if (dto1.getMagnification() == null && dto2.getMagnification() == null) {
                    nReturn = 0;
                } else if (dto1.getMagnification() != null && dto2.getMagnification() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMagnification().compareTo(dto2.getMagnification());
                }
                break;
            case PathologyImagesDAO.ID_STAIN:
                if (dto1.getStain() == null && dto2.getStain() != null) {
                    nReturn = -1;
                } else if (dto1.getStain() == null && dto2.getStain() == null) {
                    nReturn = 0;
                } else if (dto1.getStain() != null && dto2.getStain() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStain().compareTo(dto2.getStain());
                }
                break;
            case PathologyImagesDAO.ID_CAPTION:
                if (dto1.getCaption() == null && dto2.getCaption() != null) {
                    nReturn = -1;
                } else if (dto1.getCaption() == null && dto2.getCaption() == null) {
                    nReturn = 0;
                } else if (dto1.getCaption() != null && dto2.getCaption() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCaption().compareTo(dto2.getCaption());
                }
                break;
            case PathologyImagesDAO.ID_COPYRIGHT:
                if (dto1.getCopyright() == null && dto2.getCopyright() != null) {
                    nReturn = -1;
                } else if (dto1.getCopyright() == null && dto2.getCopyright() == null) {
                    nReturn = 0;
                } else if (dto1.getCopyright() != null && dto2.getCopyright() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCopyright().compareTo(dto2.getCopyright());
                }
                break;
            case PathologyImagesDAO.ID_NOTES:
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
            case PathologyImagesDAO.ID__FIXATIVE_KEY:
                if (dto1.getFixativeKey() == null && dto2.getFixativeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getFixativeKey() == null && dto2.getFixativeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getFixativeKey() != null && dto2.getFixativeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getFixativeKey().compareTo(dto2.getFixativeKey());
                }
                break;
            case PathologyImagesDAO.ID_CREATE_USER:
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
            case PathologyImagesDAO.ID_CREATE_DATE:
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
            case PathologyImagesDAO.ID_UPDATE_USER:
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
            case PathologyImagesDAO.ID_UPDATE_DATE:
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
