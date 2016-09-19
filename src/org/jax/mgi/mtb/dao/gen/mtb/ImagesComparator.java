
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the ImagesDTO objects.
 */
public class ImagesComparator
       implements Comparator<ImagesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for ImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ImagesComparator(ImagesDAO._IMAGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ImagesDAO.ID__IMAGES_KEY
     *   <li>ImagesDAO.ID_HIGHRESNAME
     *   <li>ImagesDAO.ID_MEDIUMRESNAME
     *   <li>ImagesDAO.ID_LOWRESNAME
     *   <li>ImagesDAO.ID_SERVER
     *   <li>ImagesDAO.ID_SERVERPATH
     *   <li>ImagesDAO.ID_URL
     *   <li>ImagesDAO.ID_URLPATH
     *   <li>ImagesDAO.ID_ZOOMIFYPATH
     *   <li>ImagesDAO.ID_PRIVATEFLAG
     *   <li>ImagesDAO.ID_DESCRIPTION
     *   <li>ImagesDAO.ID_CREATE_USER
     *   <li>ImagesDAO.ID_CREATE_DATE
     *   <li>ImagesDAO.ID_UPDATE_USER
     *   <li>ImagesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public ImagesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for ImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ImagesComparator(ImagesDAO._IMAGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ImagesDAO.ID__IMAGES_KEY
     *   <li>ImagesDAO.ID_HIGHRESNAME
     *   <li>ImagesDAO.ID_MEDIUMRESNAME
     *   <li>ImagesDAO.ID_LOWRESNAME
     *   <li>ImagesDAO.ID_SERVER
     *   <li>ImagesDAO.ID_SERVERPATH
     *   <li>ImagesDAO.ID_URL
     *   <li>ImagesDAO.ID_URLPATH
     *   <li>ImagesDAO.ID_ZOOMIFYPATH
     *   <li>ImagesDAO.ID_PRIVATEFLAG
     *   <li>ImagesDAO.ID_DESCRIPTION
     *   <li>ImagesDAO.ID_CREATE_USER
     *   <li>ImagesDAO.ID_CREATE_DATE
     *   <li>ImagesDAO.ID_UPDATE_USER
     *   <li>ImagesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ImagesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(ImagesDTO dto1, ImagesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case ImagesDAO.ID__IMAGES_KEY:
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
            case ImagesDAO.ID_HIGHRESNAME:
                if (dto1.getHighResName() == null && dto2.getHighResName() != null) {
                    nReturn = -1;
                } else if (dto1.getHighResName() == null && dto2.getHighResName() == null) {
                    nReturn = 0;
                } else if (dto1.getHighResName() != null && dto2.getHighResName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getHighResName().compareTo(dto2.getHighResName());
                }
                break;
            case ImagesDAO.ID_MEDIUMRESNAME:
                if (dto1.getMediumResName() == null && dto2.getMediumResName() != null) {
                    nReturn = -1;
                } else if (dto1.getMediumResName() == null && dto2.getMediumResName() == null) {
                    nReturn = 0;
                } else if (dto1.getMediumResName() != null && dto2.getMediumResName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMediumResName().compareTo(dto2.getMediumResName());
                }
                break;
            case ImagesDAO.ID_LOWRESNAME:
                if (dto1.getLowResName() == null && dto2.getLowResName() != null) {
                    nReturn = -1;
                } else if (dto1.getLowResName() == null && dto2.getLowResName() == null) {
                    nReturn = 0;
                } else if (dto1.getLowResName() != null && dto2.getLowResName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getLowResName().compareTo(dto2.getLowResName());
                }
                break;
            case ImagesDAO.ID_SERVER:
                if (dto1.getServer() == null && dto2.getServer() != null) {
                    nReturn = -1;
                } else if (dto1.getServer() == null && dto2.getServer() == null) {
                    nReturn = 0;
                } else if (dto1.getServer() != null && dto2.getServer() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getServer().compareTo(dto2.getServer());
                }
                break;
            case ImagesDAO.ID_SERVERPATH:
                if (dto1.getServerPath() == null && dto2.getServerPath() != null) {
                    nReturn = -1;
                } else if (dto1.getServerPath() == null && dto2.getServerPath() == null) {
                    nReturn = 0;
                } else if (dto1.getServerPath() != null && dto2.getServerPath() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getServerPath().compareTo(dto2.getServerPath());
                }
                break;
            case ImagesDAO.ID_URL:
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
            case ImagesDAO.ID_URLPATH:
                if (dto1.getUrlPath() == null && dto2.getUrlPath() != null) {
                    nReturn = -1;
                } else if (dto1.getUrlPath() == null && dto2.getUrlPath() == null) {
                    nReturn = 0;
                } else if (dto1.getUrlPath() != null && dto2.getUrlPath() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUrlPath().compareTo(dto2.getUrlPath());
                }
                break;
            case ImagesDAO.ID_ZOOMIFYPATH:
                if (dto1.getZoomifyPath() == null && dto2.getZoomifyPath() != null) {
                    nReturn = -1;
                } else if (dto1.getZoomifyPath() == null && dto2.getZoomifyPath() == null) {
                    nReturn = 0;
                } else if (dto1.getZoomifyPath() != null && dto2.getZoomifyPath() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getZoomifyPath().compareTo(dto2.getZoomifyPath());
                }
                break;
            case ImagesDAO.ID_PRIVATEFLAG:
                if (dto1.getPrivateFlag() == null && dto2.getPrivateFlag() != null) {
                    nReturn = -1;
                } else if (dto1.getPrivateFlag() == null && dto2.getPrivateFlag() == null) {
                    nReturn = 0;
                } else if (dto1.getPrivateFlag() != null && dto2.getPrivateFlag() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPrivateFlag().compareTo(dto2.getPrivateFlag());
                }
                break;
            case ImagesDAO.ID_DESCRIPTION:
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
            case ImagesDAO.ID_CREATE_USER:
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
            case ImagesDAO.ID_CREATE_DATE:
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
            case ImagesDAO.ID_UPDATE_USER:
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
            case ImagesDAO.ID_UPDATE_DATE:
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
