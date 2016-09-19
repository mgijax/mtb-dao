
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TumorFrequencyNotesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorFrequencyNotesKeyOriginal;
    
    private Long TumorFrequencyNotesKey;
    private boolean TumorFrequencyNotesKey_is_modified = false;
    private boolean TumorFrequencyNotesKey_is_initialized = false;
    
    private Long TumorFrequencyKey;
    private boolean TumorFrequencyKey_is_modified = false;
    private boolean TumorFrequencyKey_is_initialized = false;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
    private String note;
    private boolean note_is_modified = false;
    private boolean note_is_initialized = false;
    
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
    TumorFrequencyNotesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorFrequencyNotesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes._TumorFrequencyNotes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyNotesKey
     */
    public Long getTumorFrequencyNotesKeyOriginal() {
        return TumorFrequencyNotesKeyOriginal; 
    }

    /**
     * Getter method for TumorFrequencyNotesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes._TumorFrequencyNotes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyNotesKey
     */
    public Long getTumorFrequencyNotesKey() {
        return TumorFrequencyNotesKey; 
    }

    /**
     * Setter method for TumorFrequencyNotesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorFrequencyNotesKey
     */
    public void setTumorFrequencyNotesKey(Long newVal) {
        if ((newVal != null && this.TumorFrequencyNotesKey != null && (newVal.compareTo(this.TumorFrequencyNotesKey) == 0)) || 
            (newVal == null && this.TumorFrequencyNotesKey == null && TumorFrequencyNotesKey_is_initialized)) {
            return; 
        } 

        if(this.TumorFrequencyNotesKeyOriginal == null) {
            this.TumorFrequencyNotesKeyOriginal = newVal;
        }
        this.TumorFrequencyNotesKey = newVal; 

        TumorFrequencyNotesKey_is_modified = true; 
        TumorFrequencyNotesKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorFrequencyNotesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorFrequencyNotesKey
     */
    public void setTumorFrequencyNotesKey(long newVal) {
        setTumorFrequencyNotesKey(new Long(newVal));
    }

    /**
     * Determines if the TumorFrequencyNotesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorFrequencyNotesKeyModified() {
        return TumorFrequencyNotesKey_is_modified; 
    }

    /**
     * Determines if the TumorFrequencyNotesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorFrequencyNotesKeyInitialized() {
        return TumorFrequencyNotesKey_is_initialized; 
    }

    /**
     * Getter method for TumorFrequencyKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes._TumorFrequency_key
     * <li> foreign key: TumorFrequency._TumorFrequency_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
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
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes._Reference_key
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
     * Getter method for note.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes.note
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of note
     */
    public String getNote() {
        return note; 
    }

    /**
     * Setter method for note.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to note
     */
    public void setNote(String newVal) {
        if ((newVal != null && this.note != null && (newVal.compareTo(this.note) == 0)) || 
            (newVal == null && this.note == null && note_is_initialized)) {
            return; 
        } 
        this.note = newVal; 

        note_is_modified = true; 
        note_is_initialized = true; 
    }

    /**
     * Determines if the note has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNoteModified() {
        return note_is_modified; 
    }

    /**
     * Determines if the note has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNoteInitialized() {
        return note_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyNotes.create_user
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
     * <li>full name: TumorFrequencyNotes.create_date
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
     * <li>full name: TumorFrequencyNotes.update_user
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
     * <li>full name: TumorFrequencyNotes.update_date
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
        return TumorFrequencyNotesKey_is_modified || 
     TumorFrequencyKey_is_modified || 
     ReferenceKey_is_modified || 
     note_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorFrequencyNotesKey_is_modified = false;
        TumorFrequencyKey_is_modified = false;
        ReferenceKey_is_modified = false;
        note_is_modified = false;
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
    public void copy(TumorFrequencyNotesDTO bean) {
        setTumorFrequencyNotesKey(bean.getTumorFrequencyNotesKey());
        setTumorFrequencyKey(bean.getTumorFrequencyKey());
        setReferenceKey(bean.getReferenceKey());
        setNote(bean.getNote());
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
            ret.append("\n[TumorFrequencyNotes] ");
            ret.append("\n - TumorFrequencyNotes._TumorFrequencyNotes_key = ").append((TumorFrequencyNotesKey_is_initialized ? ("[" + (TumorFrequencyNotesKey == null ? null : TumorFrequencyNotesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes._TumorFrequency_key = ").append((TumorFrequencyKey_is_initialized ? ("[" + (TumorFrequencyKey == null ? null : TumorFrequencyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes.note = ").append((note_is_initialized ? ("[" + (note == null ? null : note) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyNotes.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TumorFrequencyNotes\">\n");
        ret.append("    <column name=\"_TumorFrequencyNotes_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyNotesKey_is_initialized ? ((TumorFrequencyNotesKey == null ? null : TumorFrequencyNotesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorFrequency_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyKey_is_initialized ? ((TumorFrequencyKey == null ? null : TumorFrequencyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"note\"\n");
        ret.append("            value=\"").append((note_is_initialized ? ((note == null ? null : note)) : "[not initialized]")).append("\"/>\n");
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
