
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AssayImagesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AssayImagesKeyOriginal;
    
    private Long AssayImagesKey;
    private boolean AssayImagesKey_is_modified = false;
    private boolean AssayImagesKey_is_initialized = false;
    
    private String HighResName;
    private boolean HighResName_is_modified = false;
    private boolean HighResName_is_initialized = false;
    
    private String LowResName;
    private boolean LowResName_is_modified = false;
    private boolean LowResName_is_initialized = false;
    
    private String Note;
    private boolean Note_is_modified = false;
    private boolean Note_is_initialized = false;
    
    private String Caption;
    private boolean Caption_is_modified = false;
    private boolean Caption_is_initialized = false;
    
    private String Copyright;
    private boolean Copyright_is_modified = false;
    private boolean Copyright_is_initialized = false;
    
    private Long PrivateFlag;
    private boolean PrivateFlag_is_modified = false;
    private boolean PrivateFlag_is_initialized = false;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
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
    AssayImagesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AssayImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages._AssayImages_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AssayImagesKey
     */
    public Long getAssayImagesKeyOriginal() {
        return AssayImagesKeyOriginal; 
    }

    /**
     * Getter method for AssayImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages._AssayImages_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AssayImagesKey
     */
    public Long getAssayImagesKey() {
        return AssayImagesKey; 
    }

    /**
     * Setter method for AssayImagesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AssayImagesKey
     */
    public void setAssayImagesKey(Long newVal) {
        if ((newVal != null && this.AssayImagesKey != null && (newVal.compareTo(this.AssayImagesKey) == 0)) || 
            (newVal == null && this.AssayImagesKey == null && AssayImagesKey_is_initialized)) {
            return; 
        } 

        if(this.AssayImagesKeyOriginal == null) {
            this.AssayImagesKeyOriginal = newVal;
        }
        this.AssayImagesKey = newVal; 

        AssayImagesKey_is_modified = true; 
        AssayImagesKey_is_initialized = true; 
    }

    /**
     * Setter method for AssayImagesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AssayImagesKey
     */
    public void setAssayImagesKey(long newVal) {
        setAssayImagesKey(new Long(newVal));
    }

    /**
     * Determines if the AssayImagesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAssayImagesKeyModified() {
        return AssayImagesKey_is_modified; 
    }

    /**
     * Determines if the AssayImagesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAssayImagesKeyInitialized() {
        return AssayImagesKey_is_initialized; 
    }

    /**
     * Getter method for HighResName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.HighResName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of HighResName
     */
    public String getHighResName() {
        return HighResName; 
    }

    /**
     * Setter method for HighResName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to HighResName
     */
    public void setHighResName(String newVal) {
        if ((newVal != null && this.HighResName != null && (newVal.compareTo(this.HighResName) == 0)) || 
            (newVal == null && this.HighResName == null && HighResName_is_initialized)) {
            return; 
        } 
        this.HighResName = newVal; 

        HighResName_is_modified = true; 
        HighResName_is_initialized = true; 
    }

    /**
     * Determines if the HighResName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isHighResNameModified() {
        return HighResName_is_modified; 
    }

    /**
     * Determines if the HighResName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isHighResNameInitialized() {
        return HighResName_is_initialized; 
    }

    /**
     * Getter method for LowResName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.LowResName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of LowResName
     */
    public String getLowResName() {
        return LowResName; 
    }

    /**
     * Setter method for LowResName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to LowResName
     */
    public void setLowResName(String newVal) {
        if ((newVal != null && this.LowResName != null && (newVal.compareTo(this.LowResName) == 0)) || 
            (newVal == null && this.LowResName == null && LowResName_is_initialized)) {
            return; 
        } 
        this.LowResName = newVal; 

        LowResName_is_modified = true; 
        LowResName_is_initialized = true; 
    }

    /**
     * Determines if the LowResName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isLowResNameModified() {
        return LowResName_is_modified; 
    }

    /**
     * Determines if the LowResName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isLowResNameInitialized() {
        return LowResName_is_initialized; 
    }

    /**
     * Getter method for Note.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.Note
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of Note
     */
    public String getNote() {
        return Note; 
    }

    /**
     * Setter method for Note.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to Note
     */
    public void setNote(String newVal) {
        if ((newVal != null && this.Note != null && (newVal.compareTo(this.Note) == 0)) || 
            (newVal == null && this.Note == null && Note_is_initialized)) {
            return; 
        } 
        this.Note = newVal; 

        Note_is_modified = true; 
        Note_is_initialized = true; 
    }

    /**
     * Determines if the Note has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNoteModified() {
        return Note_is_modified; 
    }

    /**
     * Determines if the Note has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNoteInitialized() {
        return Note_is_initialized; 
    }

    /**
     * Getter method for Caption.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.Caption
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of Caption
     */
    public String getCaption() {
        return Caption; 
    }

    /**
     * Setter method for Caption.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to Caption
     */
    public void setCaption(String newVal) {
        if ((newVal != null && this.Caption != null && (newVal.compareTo(this.Caption) == 0)) || 
            (newVal == null && this.Caption == null && Caption_is_initialized)) {
            return; 
        } 
        this.Caption = newVal; 

        Caption_is_modified = true; 
        Caption_is_initialized = true; 
    }

    /**
     * Determines if the Caption has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCaptionModified() {
        return Caption_is_modified; 
    }

    /**
     * Determines if the Caption has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCaptionInitialized() {
        return Caption_is_initialized; 
    }

    /**
     * Getter method for Copyright.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.Copyright
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of Copyright
     */
    public String getCopyright() {
        return Copyright; 
    }

    /**
     * Setter method for Copyright.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to Copyright
     */
    public void setCopyright(String newVal) {
        if ((newVal != null && this.Copyright != null && (newVal.compareTo(this.Copyright) == 0)) || 
            (newVal == null && this.Copyright == null && Copyright_is_initialized)) {
            return; 
        } 
        this.Copyright = newVal; 

        Copyright_is_modified = true; 
        Copyright_is_initialized = true; 
    }

    /**
     * Determines if the Copyright has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCopyrightModified() {
        return Copyright_is_modified; 
    }

    /**
     * Determines if the Copyright has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCopyrightInitialized() {
        return Copyright_is_initialized; 
    }

    /**
     * Getter method for PrivateFlag.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.PrivateFlag
     * <li>column size: 2
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of PrivateFlag
     */
    public Long getPrivateFlag() {
        return PrivateFlag; 
    }

    /**
     * Setter method for PrivateFlag.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to PrivateFlag
     */
    public void setPrivateFlag(Long newVal) {
        if ((newVal != null && this.PrivateFlag != null && (newVal.compareTo(this.PrivateFlag) == 0)) || 
            (newVal == null && this.PrivateFlag == null && PrivateFlag_is_initialized)) {
            return; 
        } 
        this.PrivateFlag = newVal; 

        PrivateFlag_is_modified = true; 
        PrivateFlag_is_initialized = true; 
    }

    /**
     * Setter method for PrivateFlag.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to PrivateFlag
     */
    public void setPrivateFlag(long newVal) {
        setPrivateFlag(new Long(newVal));
    }

    /**
     * Determines if the PrivateFlag has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPrivateFlagModified() {
        return PrivateFlag_is_modified; 
    }

    /**
     * Determines if the PrivateFlag has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPrivateFlagInitialized() {
        return PrivateFlag_is_initialized; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages._Reference_key
     * <li> foreign key: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ReferenceKey
     */
    public Long getReferenceKey() {
        return ReferenceKey; 
    }

    /**
     * Setter method for ReferenceKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ReferenceKey
     */
    public void setReferenceKey(Long newVal) {
        if ((newVal != null && this.ReferenceKey != null && (newVal.compareTo(this.ReferenceKey) == 0)) || 
            (newVal == null && this.ReferenceKey == null && ReferenceKey_is_initialized)) {
            return; 
        } 
        this.ReferenceKey = newVal; 

        ReferenceKey_is_modified = true; 
        ReferenceKey_is_initialized = true; 
    }

    /**
     * Setter method for ReferenceKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ReferenceKey
     */
    public void setReferenceKey(long newVal) {
        setReferenceKey(new Long(newVal));
    }

    /**
     * Determines if the ReferenceKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isReferenceKeyModified() {
        return ReferenceKey_is_modified; 
    }

    /**
     * Determines if the ReferenceKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isReferenceKeyInitialized() {
        return ReferenceKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AssayImages.create_user
     * <li>column size: 12
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
     * <li>full name: AssayImages.create_date
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
     * <li>full name: AssayImages.update_user
     * <li>column size: 12
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
     * <li>full name: AssayImages.update_date
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
        return AssayImagesKey_is_modified || 
     HighResName_is_modified || 
     LowResName_is_modified || 
     Note_is_modified || 
     Caption_is_modified || 
     Copyright_is_modified || 
     PrivateFlag_is_modified || 
     ReferenceKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AssayImagesKey_is_modified = false;
        HighResName_is_modified = false;
        LowResName_is_modified = false;
        Note_is_modified = false;
        Caption_is_modified = false;
        Copyright_is_modified = false;
        PrivateFlag_is_modified = false;
        ReferenceKey_is_modified = false;
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
    public void copy(AssayImagesDTO bean) {
        setAssayImagesKey(bean.getAssayImagesKey());
        setHighResName(bean.getHighResName());
        setLowResName(bean.getLowResName());
        setNote(bean.getNote());
        setCaption(bean.getCaption());
        setCopyright(bean.getCopyright());
        setPrivateFlag(bean.getPrivateFlag());
        setReferenceKey(bean.getReferenceKey());
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
            ret.append("\n[AssayImages] ");
            ret.append("\n - AssayImages._AssayImages_key = ").append((AssayImagesKey_is_initialized ? ("[" + (AssayImagesKey == null ? null : AssayImagesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AssayImages.HighResName = ").append((HighResName_is_initialized ? ("[" + (HighResName == null ? null : HighResName) + "]") : "not initialized"));
            ret.append("\n - AssayImages.LowResName = ").append((LowResName_is_initialized ? ("[" + (LowResName == null ? null : LowResName) + "]") : "not initialized"));
            ret.append("\n - AssayImages.Note = ").append((Note_is_initialized ? ("[" + (Note == null ? null : Note) + "]") : "not initialized"));
            ret.append("\n - AssayImages.Caption = ").append((Caption_is_initialized ? ("[" + (Caption == null ? null : Caption) + "]") : "not initialized"));
            ret.append("\n - AssayImages.Copyright = ").append((Copyright_is_initialized ? ("[" + (Copyright == null ? null : Copyright) + "]") : "not initialized"));
            ret.append("\n - AssayImages.PrivateFlag = ").append((PrivateFlag_is_initialized ? ("[" + (PrivateFlag == null ? null : PrivateFlag.toString()) + "]") : "not initialized"));
            ret.append("\n - AssayImages._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AssayImages.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - AssayImages.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - AssayImages.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - AssayImages.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AssayImages\">\n");
        ret.append("    <column name=\"_AssayImages_key\"\n");
        ret.append("            value=\"").append((AssayImagesKey_is_initialized ? ((AssayImagesKey == null ? null : AssayImagesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"HighResName\"\n");
        ret.append("            value=\"").append((HighResName_is_initialized ? ((HighResName == null ? null : HighResName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"LowResName\"\n");
        ret.append("            value=\"").append((LowResName_is_initialized ? ((LowResName == null ? null : LowResName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"Note\"\n");
        ret.append("            value=\"").append((Note_is_initialized ? ((Note == null ? null : Note)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"Caption\"\n");
        ret.append("            value=\"").append((Caption_is_initialized ? ((Caption == null ? null : Caption)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"Copyright\"\n");
        ret.append("            value=\"").append((Copyright_is_initialized ? ((Copyright == null ? null : Copyright)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"PrivateFlag\"\n");
        ret.append("            value=\"").append((PrivateFlag_is_initialized ? ((PrivateFlag == null ? null : PrivateFlag.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
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
