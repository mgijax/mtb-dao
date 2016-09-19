
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AssayImagesDTO objects.
 */
public class AssayImagesComparator
       implements Comparator<AssayImagesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AssayImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AssayImagesComparator(AssayImagesDAO._ASSAYIMAGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AssayImagesDAO.ID__ASSAYIMAGES_KEY
     *   <li>AssayImagesDAO.ID_HIGHRESNAME
     *   <li>AssayImagesDAO.ID_LOWRESNAME
     *   <li>AssayImagesDAO.ID_NOTE
     *   <li>AssayImagesDAO.ID_CAPTION
     *   <li>AssayImagesDAO.ID_COPYRIGHT
     *   <li>AssayImagesDAO.ID_PRIVATEFLAG
     *   <li>AssayImagesDAO.ID__REFERENCE_KEY
     *   <li>AssayImagesDAO.ID_CREATE_USER
     *   <li>AssayImagesDAO.ID_CREATE_DATE
     *   <li>AssayImagesDAO.ID_UPDATE_USER
     *   <li>AssayImagesDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AssayImagesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AssayImagesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AssayImagesComparator(AssayImagesDAO._ASSAYIMAGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AssayImagesDAO.ID__ASSAYIMAGES_KEY
     *   <li>AssayImagesDAO.ID_HIGHRESNAME
     *   <li>AssayImagesDAO.ID_LOWRESNAME
     *   <li>AssayImagesDAO.ID_NOTE
     *   <li>AssayImagesDAO.ID_CAPTION
     *   <li>AssayImagesDAO.ID_COPYRIGHT
     *   <li>AssayImagesDAO.ID_PRIVATEFLAG
     *   <li>AssayImagesDAO.ID__REFERENCE_KEY
     *   <li>AssayImagesDAO.ID_CREATE_USER
     *   <li>AssayImagesDAO.ID_CREATE_DATE
     *   <li>AssayImagesDAO.ID_UPDATE_USER
     *   <li>AssayImagesDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AssayImagesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AssayImagesDTO dto1, AssayImagesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AssayImagesDAO.ID__ASSAYIMAGES_KEY:
                if (dto1.getAssayImagesKey() == null && dto2.getAssayImagesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAssayImagesKey() == null && dto2.getAssayImagesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAssayImagesKey() != null && dto2.getAssayImagesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAssayImagesKey().compareTo(dto2.getAssayImagesKey());
                }
                break;
            case AssayImagesDAO.ID_HIGHRESNAME:
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
            case AssayImagesDAO.ID_LOWRESNAME:
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
            case AssayImagesDAO.ID_NOTE:
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
            case AssayImagesDAO.ID_CAPTION:
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
            case AssayImagesDAO.ID_COPYRIGHT:
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
            case AssayImagesDAO.ID_PRIVATEFLAG:
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
            case AssayImagesDAO.ID__REFERENCE_KEY:
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
            case AssayImagesDAO.ID_CREATE_USER:
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
            case AssayImagesDAO.ID_CREATE_DATE:
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
            case AssayImagesDAO.ID_UPDATE_USER:
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
            case AssayImagesDAO.ID_UPDATE_DATE:
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
