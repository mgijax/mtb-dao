
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.mysql.jdbc.Driver
// Generation Time: : Fri Jul 08 13:46:52 EDT 2011

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TumorGeneticChangesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorGeneticChangesKeyOriginal;
    
    private Long TumorGeneticChangesKey;
    private boolean TumorGeneticChangesKey_is_modified = false;
    private boolean TumorGeneticChangesKey_is_initialized = false;
    
    private Long TumorFrequencyKey;
    private boolean TumorFrequencyKey_is_modified = false;
    private boolean TumorFrequencyKey_is_initialized = false;
    
    private String name;
    private boolean name_is_modified = false;
    private boolean name_is_initialized = false;
    
    private String notes;
    private boolean notes_is_modified = false;
    private boolean notes_is_initialized = false;
    
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
    
    private Long AlleleTypeKey;
    private boolean AlleleTypeKey_is_modified = false;
    private boolean AlleleTypeKey_is_initialized = false;
    
    private Long AssayTypeKey;
    private boolean AssayTypeKey_is_modified = false;
    private boolean AssayTypeKey_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    TumorGeneticChangesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorGeneticChangesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges._TumorGeneticChanges_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of TumorGeneticChangesKey
     */
    public Long getTumorGeneticChangesKeyOriginal() {
        return TumorGeneticChangesKeyOriginal; 
    }

    /**
     * Getter method for TumorGeneticChangesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges._TumorGeneticChanges_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of TumorGeneticChangesKey
     */
    public Long getTumorGeneticChangesKey() {
        return TumorGeneticChangesKey; 
    }

    /**
     * Setter method for TumorGeneticChangesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorGeneticChangesKey
     */
    public void setTumorGeneticChangesKey(Long newVal) {
        if ((newVal != null && this.TumorGeneticChangesKey != null && (newVal.compareTo(this.TumorGeneticChangesKey) == 0)) || 
            (newVal == null && this.TumorGeneticChangesKey == null && TumorGeneticChangesKey_is_initialized)) {
            return; 
        } 

        if(this.TumorGeneticChangesKeyOriginal == null) {
            this.TumorGeneticChangesKeyOriginal = newVal;
        }
        this.TumorGeneticChangesKey = newVal; 

        TumorGeneticChangesKey_is_modified = true; 
        TumorGeneticChangesKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorGeneticChangesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorGeneticChangesKey
     */
    public void setTumorGeneticChangesKey(long newVal) {
        setTumorGeneticChangesKey(new Long(newVal));
    }

    /**
     * Determines if the TumorGeneticChangesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorGeneticChangesKeyModified() {
        return TumorGeneticChangesKey_is_modified; 
    }

    /**
     * Determines if the TumorGeneticChangesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorGeneticChangesKeyInitialized() {
        return TumorGeneticChangesKey_is_initialized; 
    }

    /**
     * Getter method for TumorFrequencyKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges._TumorFrequency_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of TumorFrequencyKey
     */
    public Long getTumorFrequencyKey() {
        return TumorFrequencyKey; 
    }

    /**
     * Setter method for TumorFrequencyKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorFrequencyKey
     */
    public void setTumorFrequencyKey(Long newVal) {
        if ((newVal != null && this.TumorFrequencyKey != null && (newVal.compareTo(this.TumorFrequencyKey) == 0)) || 
            (newVal == null && this.TumorFrequencyKey == null && TumorFrequencyKey_is_initialized)) {
            return; 
        } 
        this.TumorFrequencyKey = newVal; 

        TumorFrequencyKey_is_modified = true; 
        TumorFrequencyKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorFrequencyKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorFrequencyKey
     */
    public void setTumorFrequencyKey(long newVal) {
        setTumorFrequencyKey(new Long(newVal));
    }

    /**
     * Determines if the TumorFrequencyKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorFrequencyKeyModified() {
        return TumorFrequencyKey_is_modified; 
    }

    /**
     * Determines if the TumorFrequencyKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorFrequencyKeyInitialized() {
        return TumorFrequencyKey_is_initialized; 
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges.name
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of name
     */
    public String getName() {
        return name; 
    }

    /**
     * Setter method for name.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to name
     */
    public void setName(String newVal) {
        if ((newVal != null && this.name != null && (newVal.compareTo(this.name) == 0)) || 
            (newVal == null && this.name == null && name_is_initialized)) {
            return; 
        } 
        this.name = newVal; 

        name_is_modified = true; 
        name_is_initialized = true; 
    }

    /**
     * Determines if the name has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNameModified() {
        return name_is_modified; 
    }

    /**
     * Determines if the name has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNameInitialized() {
        return name_is_initialized; 
    }

    /**
     * Getter method for notes.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges.notes
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
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges.create_user
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
     * <li>full name: TumorGeneticChanges.create_date
     * <li>column size: 19
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
     * <li>full name: TumorGeneticChanges.update_user
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
     * <li>full name: TumorGeneticChanges.update_date
     * <li>column size: 19
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
     * Getter method for AlleleTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges._AlleleType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of AlleleTypeKey
     */
    public Long getAlleleTypeKey() {
        return AlleleTypeKey; 
    }

    /**
     * Setter method for AlleleTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlleleTypeKey
     */
    public void setAlleleTypeKey(Long newVal) {
        if ((newVal != null && this.AlleleTypeKey != null && (newVal.compareTo(this.AlleleTypeKey) == 0)) || 
            (newVal == null && this.AlleleTypeKey == null && AlleleTypeKey_is_initialized)) {
            return; 
        } 
        this.AlleleTypeKey = newVal; 

        AlleleTypeKey_is_modified = true; 
        AlleleTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for AlleleTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlleleTypeKey
     */
    public void setAlleleTypeKey(long newVal) {
        setAlleleTypeKey(new Long(newVal));
    }

    /**
     * Determines if the AlleleTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlleleTypeKeyModified() {
        return AlleleTypeKey_is_modified; 
    }

    /**
     * Determines if the AlleleTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlleleTypeKeyInitialized() {
        return AlleleTypeKey_is_initialized; 
    }

    /**
     * Getter method for AssayTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorGeneticChanges._AssayType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of AssayTypeKey
     */
    public Long getAssayTypeKey() {
        return AssayTypeKey; 
    }

    /**
     * Setter method for AssayTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AssayTypeKey
     */
    public void setAssayTypeKey(Long newVal) {
        if ((newVal != null && this.AssayTypeKey != null && (newVal.compareTo(this.AssayTypeKey) == 0)) || 
            (newVal == null && this.AssayTypeKey == null && AssayTypeKey_is_initialized)) {
            return; 
        } 
        this.AssayTypeKey = newVal; 

        AssayTypeKey_is_modified = true; 
        AssayTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for AssayTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AssayTypeKey
     */
    public void setAssayTypeKey(long newVal) {
        setAssayTypeKey(new Long(newVal));
    }

    /**
     * Determines if the AssayTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAssayTypeKeyModified() {
        return AssayTypeKey_is_modified; 
    }

    /**
     * Determines if the AssayTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAssayTypeKeyInitialized() {
        return AssayTypeKey_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return TumorGeneticChangesKey_is_modified || 
     TumorFrequencyKey_is_modified || 
     name_is_modified || 
     notes_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified || 
     AlleleTypeKey_is_modified || 
     AssayTypeKey_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorGeneticChangesKey_is_modified = false;
        TumorFrequencyKey_is_modified = false;
        name_is_modified = false;
        notes_is_modified = false;
        createUser_is_modified = false;
        createDate_is_modified = false;
        updateUser_is_modified = false;
        updateDate_is_modified = false;
        AlleleTypeKey_is_modified = false;
        AssayTypeKey_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(TumorGeneticChangesDTO bean) {
        setTumorGeneticChangesKey(bean.getTumorGeneticChangesKey());
        setTumorFrequencyKey(bean.getTumorFrequencyKey());
        setName(bean.getName());
        setNotes(bean.getNotes());
        setCreateUser(bean.getCreateUser());
        setCreateDate(bean.getCreateDate());
        setUpdateUser(bean.getUpdateUser());
        setUpdateDate(bean.getUpdateDate());
        setAlleleTypeKey(bean.getAlleleTypeKey());
        setAssayTypeKey(bean.getAssayTypeKey());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[TumorGeneticChanges] ");
            ret.append("\n - TumorGeneticChanges._TumorGeneticChanges_key = ").append((TumorGeneticChangesKey_is_initialized ? ("[" + (TumorGeneticChangesKey == null ? null : TumorGeneticChangesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges._TumorFrequency_key = ").append((TumorFrequencyKey_is_initialized ? ("[" + (TumorFrequencyKey == null ? null : TumorFrequencyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.name = ").append((name_is_initialized ? ("[" + (name == null ? null : name) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.notes = ").append((notes_is_initialized ? ("[" + (notes == null ? null : notes) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges._AlleleType_key = ").append((AlleleTypeKey_is_initialized ? ("[" + (AlleleTypeKey == null ? null : AlleleTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorGeneticChanges._AssayType_key = ").append((AssayTypeKey_is_initialized ? ("[" + (AssayTypeKey == null ? null : AssayTypeKey.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TumorGeneticChanges\">\n");
        ret.append("    <column name=\"_TumorGeneticChanges_key\"\n");
        ret.append("            value=\"").append((TumorGeneticChangesKey_is_initialized ? ((TumorGeneticChangesKey == null ? null : TumorGeneticChangesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorFrequency_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyKey_is_initialized ? ((TumorFrequencyKey == null ? null : TumorFrequencyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"name\"\n");
        ret.append("            value=\"").append((name_is_initialized ? ((name == null ? null : name)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"notes\"\n");
        ret.append("            value=\"").append((notes_is_initialized ? ((notes == null ? null : notes)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_user\"\n");
        ret.append("            value=\"").append((createUser_is_initialized ? ((createUser == null ? null : createUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_date\"\n");
        ret.append("            value=\"").append((createDate_is_initialized ? ((createDate == null ? null : createDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_user\"\n");
        ret.append("            value=\"").append((updateUser_is_initialized ? ((updateUser == null ? null : updateUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_date\"\n");
        ret.append("            value=\"").append((updateDate_is_initialized ? ((updateDate == null ? null : updateDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_AlleleType_key\"\n");
        ret.append("            value=\"").append((AlleleTypeKey_is_initialized ? ((AlleleTypeKey == null ? null : AlleleTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_AssayType_key\"\n");
        ret.append("            value=\"").append((AssayTypeKey_is_initialized ? ((AssayTypeKey == null ? null : AssayTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
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
