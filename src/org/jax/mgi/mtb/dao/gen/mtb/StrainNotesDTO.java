
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class StrainNotesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long StrainNotesKeyOriginal;
    
    private Long StrainNotesKey;
    private boolean StrainNotesKey_is_modified = false;
    private boolean StrainNotesKey_is_initialized = false;
    
    private Long StrainKey;
    private boolean StrainKey_is_modified = false;
    private boolean StrainKey_is_initialized = false;
    
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
    StrainNotesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for StrainNotesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainNotes._StrainNotes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainNotesKey
     */
    public Long getStrainNotesKeyOriginal() {
        return StrainNotesKeyOriginal; 
    }

    /**
     * Getter method for StrainNotesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainNotes._StrainNotes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainNotesKey
     */
    public Long getStrainNotesKey() {
        return StrainNotesKey; 
    }

    /**
     * Setter method for StrainNotesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to StrainNotesKey
     */
    public void setStrainNotesKey(Long newVal) {
        if ((newVal != null && this.StrainNotesKey != null && (newVal.compareTo(this.StrainNotesKey) == 0)) || 
            (newVal == null && this.StrainNotesKey == null && StrainNotesKey_is_initialized)) {
            return; 
        } 

        if(this.StrainNotesKeyOriginal == null) {
            this.StrainNotesKeyOriginal = newVal;
        }
        this.StrainNotesKey = newVal; 

        StrainNotesKey_is_modified = true; 
        StrainNotesKey_is_initialized = true; 
    }

    /**
     * Setter method for StrainNotesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to StrainNotesKey
     */
    public void setStrainNotesKey(long newVal) {
        setStrainNotesKey(new Long(newVal));
    }

    /**
     * Determines if the StrainNotesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStrainNotesKeyModified() {
        return StrainNotesKey_is_modified; 
    }

    /**
     * Determines if the StrainNotesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStrainNotesKeyInitialized() {
        return StrainNotesKey_is_initialized; 
    }

    /**
     * Getter method for StrainKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainNotes._Strain_key
     * <li> foreign key: Strain._Strain_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainKey
     */
    public Long getStrainKey() {
        return StrainKey; 
    }

    /**
     * Setter method for StrainKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to StrainKey
     */
    public void setStrainKey(Long newVal) {
        if ((newVal != null && this.StrainKey != null && (newVal.compareTo(this.StrainKey) == 0)) || 
            (newVal == null && this.StrainKey == null && StrainKey_is_initialized)) {
            return; 
        } 
        this.StrainKey = newVal; 

        StrainKey_is_modified = true; 
        StrainKey_is_initialized = true; 
    }

    /**
     * Setter method for StrainKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to StrainKey
     */
    public void setStrainKey(long newVal) {
        setStrainKey(new Long(newVal));
    }

    /**
     * Determines if the StrainKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStrainKeyModified() {
        return StrainKey_is_modified; 
    }

    /**
     * Determines if the StrainKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStrainKeyInitialized() {
        return StrainKey_is_initialized; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainNotes._Reference_key
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
     * <li>full name: StrainNotes.note
     * <li>column size: 500
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
     * <li>full name: StrainNotes.create_user
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
     * <li>full name: StrainNotes.create_date
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
     * <li>full name: StrainNotes.update_user
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
     * <li>full name: StrainNotes.update_date
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
        return StrainNotesKey_is_modified || 
     StrainKey_is_modified || 
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
        StrainNotesKey_is_modified = false;
        StrainKey_is_modified = false;
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
    public void copy(StrainNotesDTO bean) {
        setStrainNotesKey(bean.getStrainNotesKey());
        setStrainKey(bean.getStrainKey());
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
            ret.append("\n[StrainNotes] ");
            ret.append("\n - StrainNotes._StrainNotes_key = ").append((StrainNotesKey_is_initialized ? ("[" + (StrainNotesKey == null ? null : StrainNotesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainNotes._Strain_key = ").append((StrainKey_is_initialized ? ("[" + (StrainKey == null ? null : StrainKey.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainNotes._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainNotes.note = ").append((note_is_initialized ? ("[" + (note == null ? null : note) + "]") : "not initialized"));
            ret.append("\n - StrainNotes.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - StrainNotes.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainNotes.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - StrainNotes.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"StrainNotes\">\n");
        ret.append("    <column name=\"_StrainNotes_key\"\n");
        ret.append("            value=\"").append((StrainNotesKey_is_initialized ? ((StrainNotesKey == null ? null : StrainNotesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Strain_key\"\n");
        ret.append("            value=\"").append((StrainKey_is_initialized ? ((StrainKey == null ? null : StrainKey.toString())) : "[not initialized]")).append("\"/>\n");
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
