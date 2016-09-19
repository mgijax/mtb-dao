
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class PathologyImagesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long PathologyKeyOriginal;
    
    private Long PathologyKey;
    private boolean PathologyKey_is_modified = false;
    private boolean PathologyKey_is_initialized = false;
    
    private Long ImagesKeyOriginal;
    
    private Long ImagesKey;
    private boolean ImagesKey_is_modified = false;
    private boolean ImagesKey_is_initialized = false;
    
    private String magnification;
    private boolean magnification_is_modified = false;
    private boolean magnification_is_initialized = false;
    
    private String stain;
    private boolean stain_is_modified = false;
    private boolean stain_is_initialized = false;
    
    private String caption;
    private boolean caption_is_modified = false;
    private boolean caption_is_initialized = false;
    
    private String copyright;
    private boolean copyright_is_modified = false;
    private boolean copyright_is_initialized = false;
    
    private String notes;
    private boolean notes_is_modified = false;
    private boolean notes_is_initialized = false;
    
    private Long FixativeKey;
    private boolean FixativeKey_is_modified = false;
    private boolean FixativeKey_is_initialized = false;
    
    private String createUser;
    private boolean createUser_is_modified = false;
    private boolean createUser_is_initialized = false;
    
    private java.util.Date createDate;
    private boolean createDate_is_modified = false;
    private boolean createDate_is_initialized = false;
    
    private String updateUser;
    private boolean updateUser_is_modified = false;
    private boolean updateUser_is_initialized = false;
    
    private java.util.Date updateDate;
    private boolean updateDate_is_modified = false;
    private boolean updateDate_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    PathologyImagesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for PathologyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages._Pathology_key
     * <li> foreign key: Pathology._Pathology_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of PathologyKey
     */
    public Long getPathologyKeyOriginal() {
        return PathologyKeyOriginal; 
    }

    /**
     * Getter method for PathologyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages._Pathology_key
     * <li> foreign key: Pathology._Pathology_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of PathologyKey
     */
    public Long getPathologyKey() {
        return PathologyKey; 
    }

    /**
     * Setter method for PathologyKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to PathologyKey
     */
    public void setPathologyKey(Long newVal) {
        if ((newVal != null && this.PathologyKey != null && (newVal.compareTo(this.PathologyKey) == 0)) || 
            (newVal == null && this.PathologyKey == null && PathologyKey_is_initialized)) {
            return; 
        } 

        if(this.PathologyKeyOriginal == null) {
            this.PathologyKeyOriginal = newVal;
        }
        this.PathologyKey = newVal; 

        PathologyKey_is_modified = true; 
        PathologyKey_is_initialized = true; 
    }

    /**
     * Setter method for PathologyKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to PathologyKey
     */
    public void setPathologyKey(long newVal) {
        setPathologyKey(new Long(newVal));
    }

    /**
     * Determines if the PathologyKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPathologyKeyModified() {
        return PathologyKey_is_modified; 
    }

    /**
     * Determines if the PathologyKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPathologyKeyInitialized() {
        return PathologyKey_is_initialized; 
    }

    /**
     * Getter method for ImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages._Images_key
     * <li> foreign key: Images._Images_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ImagesKey
     */
    public Long getImagesKeyOriginal() {
        return ImagesKeyOriginal; 
    }

    /**
     * Getter method for ImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages._Images_key
     * <li> foreign key: Images._Images_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ImagesKey
     */
    public Long getImagesKey() {
        return ImagesKey; 
    }

    /**
     * Setter method for ImagesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ImagesKey
     */
    public void setImagesKey(Long newVal) {
        if ((newVal != null && this.ImagesKey != null && (newVal.compareTo(this.ImagesKey) == 0)) || 
            (newVal == null && this.ImagesKey == null && ImagesKey_is_initialized)) {
            return; 
        } 

        if(this.ImagesKeyOriginal == null) {
            this.ImagesKeyOriginal = newVal;
        }
        this.ImagesKey = newVal; 

        ImagesKey_is_modified = true; 
        ImagesKey_is_initialized = true; 
    }

    /**
     * Setter method for ImagesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ImagesKey
     */
    public void setImagesKey(long newVal) {
        setImagesKey(new Long(newVal));
    }

    /**
     * Determines if the ImagesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isImagesKeyModified() {
        return ImagesKey_is_modified; 
    }

    /**
     * Determines if the ImagesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isImagesKeyInitialized() {
        return ImagesKey_is_initialized; 
    }

    /**
     * Getter method for magnification.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.magnification
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of magnification
     */
    public String getMagnification() {
        return magnification; 
    }

    /**
     * Setter method for magnification.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to magnification
     */
    public void setMagnification(String newVal) {
        if ((newVal != null && this.magnification != null && (newVal.compareTo(this.magnification) == 0)) || 
            (newVal == null && this.magnification == null && magnification_is_initialized)) {
            return; 
        } 
        this.magnification = newVal; 

        magnification_is_modified = true; 
        magnification_is_initialized = true; 
    }

    /**
     * Determines if the magnification has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMagnificationModified() {
        return magnification_is_modified; 
    }

    /**
     * Determines if the magnification has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMagnificationInitialized() {
        return magnification_is_initialized; 
    }

    /**
     * Getter method for stain.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.stain
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of stain
     */
    public String getStain() {
        return stain; 
    }

    /**
     * Setter method for stain.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to stain
     */
    public void setStain(String newVal) {
        if ((newVal != null && this.stain != null && (newVal.compareTo(this.stain) == 0)) || 
            (newVal == null && this.stain == null && stain_is_initialized)) {
            return; 
        } 
        this.stain = newVal; 

        stain_is_modified = true; 
        stain_is_initialized = true; 
    }

    /**
     * Determines if the stain has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStainModified() {
        return stain_is_modified; 
    }

    /**
     * Determines if the stain has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStainInitialized() {
        return stain_is_initialized; 
    }

    /**
     * Getter method for caption.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.caption
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of caption
     */
    public String getCaption() {
        return caption; 
    }

    /**
     * Setter method for caption.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to caption
     */
    public void setCaption(String newVal) {
        if ((newVal != null && this.caption != null && (newVal.compareTo(this.caption) == 0)) || 
            (newVal == null && this.caption == null && caption_is_initialized)) {
            return; 
        } 
        this.caption = newVal; 

        caption_is_modified = true; 
        caption_is_initialized = true; 
    }

    /**
     * Determines if the caption has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCaptionModified() {
        return caption_is_modified; 
    }

    /**
     * Determines if the caption has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCaptionInitialized() {
        return caption_is_initialized; 
    }

    /**
     * Getter method for copyright.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.copyright
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of copyright
     */
    public String getCopyright() {
        return copyright; 
    }

    /**
     * Setter method for copyright.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to copyright
     */
    public void setCopyright(String newVal) {
        if ((newVal != null && this.copyright != null && (newVal.compareTo(this.copyright) == 0)) || 
            (newVal == null && this.copyright == null && copyright_is_initialized)) {
            return; 
        } 
        this.copyright = newVal; 

        copyright_is_modified = true; 
        copyright_is_initialized = true; 
    }

    /**
     * Determines if the copyright has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCopyrightModified() {
        return copyright_is_modified; 
    }

    /**
     * Determines if the copyright has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCopyrightInitialized() {
        return copyright_is_initialized; 
    }

    /**
     * Getter method for notes.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.notes
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of notes
     */
    public String getNotes() {
        return notes; 
    }

    /**
     * Setter method for notes.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to notes
     */
    public void setNotes(String newVal) {
        if ((newVal != null && this.notes != null && (newVal.compareTo(this.notes) == 0)) || 
            (newVal == null && this.notes == null && notes_is_initialized)) {
            return; 
        } 
        this.notes = newVal; 

        notes_is_modified = true; 
        notes_is_initialized = true; 
    }

    /**
     * Determines if the notes has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNotesModified() {
        return notes_is_modified; 
    }

    /**
     * Determines if the notes has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNotesInitialized() {
        return notes_is_initialized; 
    }

    /**
     * Getter method for FixativeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages._Fixative_key
     * <li> foreign key: Fixative._Fixative_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of FixativeKey
     */
    public Long getFixativeKey() {
        return FixativeKey; 
    }

    /**
     * Setter method for FixativeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to FixativeKey
     */
    public void setFixativeKey(Long newVal) {
        if ((newVal != null && this.FixativeKey != null && (newVal.compareTo(this.FixativeKey) == 0)) || 
            (newVal == null && this.FixativeKey == null && FixativeKey_is_initialized)) {
            return; 
        } 
        this.FixativeKey = newVal; 

        FixativeKey_is_modified = true; 
        FixativeKey_is_initialized = true; 
    }

    /**
     * Setter method for FixativeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to FixativeKey
     */
    public void setFixativeKey(long newVal) {
        setFixativeKey(new Long(newVal));
    }

    /**
     * Determines if the FixativeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFixativeKeyModified() {
        return FixativeKey_is_modified; 
    }

    /**
     * Determines if the FixativeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFixativeKeyInitialized() {
        return FixativeKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.create_user
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of createUser
     */
    public String getCreateUser() {
        return createUser; 
    }

    /**
     * Setter method for createUser.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to createUser
     */
    public void setCreateUser(String newVal) {
        if ((newVal != null && this.createUser != null && (newVal.compareTo(this.createUser) == 0)) || 
            (newVal == null && this.createUser == null && createUser_is_initialized)) {
            return; 
        } 
        this.createUser = newVal; 

        createUser_is_modified = true; 
        createUser_is_initialized = true; 
    }

    /**
     * Determines if the createUser has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCreateUserModified() {
        return createUser_is_modified; 
    }

    /**
     * Determines if the createUser has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCreateUserInitialized() {
        return createUser_is_initialized; 
    }

    /**
     * Getter method for createDate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.create_date
     * <li>column size: 23
     * <li>jdbc type returned by the driver: Types.TIMESTAMP
     * </ul>
     *
     * @return the value of createDate
     */
    public java.util.Date getCreateDate() {
        if (createDate == null) {
            return null;
        }
        return (java.util.Date)createDate.clone();
    }

    /**
     * Setter method for createDate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to createDate
     */
    public void setCreateDate(java.util.Date newVal) {
        if ((newVal != null && this.createDate != null && (newVal.compareTo(this.createDate) == 0)) || 
            (newVal == null && this.createDate == null && createDate_is_initialized)) {
            return; 
        } 
        try {
            this.createDate = (java.util.Date)newVal.clone();
        } catch (Exception e) {
            // do nothing
        }

        createDate_is_modified = true; 
        createDate_is_initialized = true; 
    }

    /**
     * Setter method for createDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to createDate
     */
    public void setCreateDate(long newVal) {
        setCreateDate(new java.util.Date(newVal));
    }

    /**
     * Determines if the createDate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCreateDateModified() {
        return createDate_is_modified; 
    }

    /**
     * Determines if the createDate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCreateDateInitialized() {
        return createDate_is_initialized; 
    }

    /**
     * Getter method for updateUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.update_user
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of updateUser
     */
    public String getUpdateUser() {
        return updateUser; 
    }

    /**
     * Setter method for updateUser.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to updateUser
     */
    public void setUpdateUser(String newVal) {
        if ((newVal != null && this.updateUser != null && (newVal.compareTo(this.updateUser) == 0)) || 
            (newVal == null && this.updateUser == null && updateUser_is_initialized)) {
            return; 
        } 
        this.updateUser = newVal; 

        updateUser_is_modified = true; 
        updateUser_is_initialized = true; 
    }

    /**
     * Determines if the updateUser has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUpdateUserModified() {
        return updateUser_is_modified; 
    }

    /**
     * Determines if the updateUser has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUpdateUserInitialized() {
        return updateUser_is_initialized; 
    }

    /**
     * Getter method for updateDate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: PathologyImages.update_date
     * <li>column size: 23
     * <li>jdbc type returned by the driver: Types.TIMESTAMP
     * </ul>
     *
     * @return the value of updateDate
     */
    public java.util.Date getUpdateDate() {
        if (updateDate == null) {
            return null;
        }
        return (java.util.Date)updateDate.clone();
    }

    /**
     * Setter method for updateDate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to updateDate
     */
    public void setUpdateDate(java.util.Date newVal) {
        if ((newVal != null && this.updateDate != null && (newVal.compareTo(this.updateDate) == 0)) || 
            (newVal == null && this.updateDate == null && updateDate_is_initialized)) {
            return; 
        } 
        try {
            this.updateDate = (java.util.Date)newVal.clone();
        } catch (Exception e) {
            // do nothing
        }

        updateDate_is_modified = true; 
        updateDate_is_initialized = true; 
    }

    /**
     * Setter method for updateDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to updateDate
     */
    public void setUpdateDate(long newVal) {
        setUpdateDate(new java.util.Date(newVal));
    }

    /**
     * Determines if the updateDate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUpdateDateModified() {
        return updateDate_is_modified; 
    }

    /**
     * Determines if the updateDate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUpdateDateInitialized() {
        return updateDate_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return PathologyKey_is_modified || 
     ImagesKey_is_modified || 
     magnification_is_modified || 
     stain_is_modified || 
     caption_is_modified || 
     copyright_is_modified || 
     notes_is_modified || 
     FixativeKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        PathologyKey_is_modified = false;
        ImagesKey_is_modified = false;
        magnification_is_modified = false;
        stain_is_modified = false;
        caption_is_modified = false;
        copyright_is_modified = false;
        notes_is_modified = false;
        FixativeKey_is_modified = false;
        createUser_is_modified = false;
        createDate_is_modified = false;
        updateUser_is_modified = false;
        updateDate_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(PathologyImagesDTO bean) {
        setPathologyKey(bean.getPathologyKey());
        setImagesKey(bean.getImagesKey());
        setMagnification(bean.getMagnification());
        setStain(bean.getStain());
        setCaption(bean.getCaption());
        setCopyright(bean.getCopyright());
        setNotes(bean.getNotes());
        setFixativeKey(bean.getFixativeKey());
        setCreateUser(bean.getCreateUser());
        setCreateDate(bean.getCreateDate());
        setUpdateUser(bean.getUpdateUser());
        setUpdateDate(bean.getUpdateDate());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[PathologyImages] ");
            ret.append("\n - PathologyImages._Pathology_key = ").append((PathologyKey_is_initialized ? ("[" + (PathologyKey == null ? null : PathologyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - PathologyImages._Images_key = ").append((ImagesKey_is_initialized ? ("[" + (ImagesKey == null ? null : ImagesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.magnification = ").append((magnification_is_initialized ? ("[" + (magnification == null ? null : magnification) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.stain = ").append((stain_is_initialized ? ("[" + (stain == null ? null : stain) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.caption = ").append((caption_is_initialized ? ("[" + (caption == null ? null : caption) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.copyright = ").append((copyright_is_initialized ? ("[" + (copyright == null ? null : copyright) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.notes = ").append((notes_is_initialized ? ("[" + (notes == null ? null : notes) + "]") : "not initialized"));
            ret.append("\n - PathologyImages._Fixative_key = ").append((FixativeKey_is_initialized ? ("[" + (FixativeKey == null ? null : FixativeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - PathologyImages.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"PathologyImages\">\n");
        ret.append("    <column name=\"_Pathology_key\"\n");
        ret.append("            value=\"").append((PathologyKey_is_initialized ? ((PathologyKey == null ? null : PathologyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Images_key\"\n");
        ret.append("            value=\"").append((ImagesKey_is_initialized ? ((ImagesKey == null ? null : ImagesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"magnification\"\n");
        ret.append("            value=\"").append((magnification_is_initialized ? ((magnification == null ? null : magnification)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"stain\"\n");
        ret.append("            value=\"").append((stain_is_initialized ? ((stain == null ? null : stain)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"caption\"\n");
        ret.append("            value=\"").append((caption_is_initialized ? ((caption == null ? null : caption)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"copyright\"\n");
        ret.append("            value=\"").append((copyright_is_initialized ? ((copyright == null ? null : copyright)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"notes\"\n");
        ret.append("            value=\"").append((notes_is_initialized ? ((notes == null ? null : notes)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Fixative_key\"\n");
        ret.append("            value=\"").append((FixativeKey_is_initialized ? ((FixativeKey == null ? null : FixativeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_user\"\n");
        ret.append("            value=\"").append((createUser_is_initialized ? ((createUser == null ? null : createUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_date\"\n");
        ret.append("            value=\"").append((createDate_is_initialized ? ((createDate == null ? null : createDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_user\"\n");
        ret.append("            value=\"").append((updateUser_is_initialized ? ((updateUser == null ? null : updateUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_date\"\n");
        ret.append("            value=\"").append((updateDate_is_initialized ? ((updateDate == null ? null : updateDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("</table>");
        return ret.toString();
    }


    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
// class+ 

// class- 

}
