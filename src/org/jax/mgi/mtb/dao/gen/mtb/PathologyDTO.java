
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class PathologyDTO extends TableDTO
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
    
    private String ageAtNecropsy;
    private boolean ageAtNecropsy_is_modified = false;
    private boolean ageAtNecropsy_is_initialized = false;
    
    private Long PathologistKey;
    private boolean PathologistKey_is_modified = false;
    private boolean PathologistKey_is_initialized = false;
    
    private Long ContributorKey;
    private boolean ContributorKey_is_modified = false;
    private boolean ContributorKey_is_initialized = false;
    
    private String description;
    private boolean description_is_modified = false;
    private boolean description_is_initialized = false;
    
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
    PathologyDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for PathologyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology._Pathology_key
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
     * <li>full name: Pathology._Pathology_key
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
     * Getter method for ageAtNecropsy.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology.ageAtNecropsy
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of ageAtNecropsy
     */
    public String getAgeAtNecropsy() {
        return ageAtNecropsy; 
    }

    /**
     * Setter method for ageAtNecropsy.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ageAtNecropsy
     */
    public void setAgeAtNecropsy(String newVal) {
        if ((newVal != null && this.ageAtNecropsy != null && (newVal.compareTo(this.ageAtNecropsy) == 0)) || 
            (newVal == null && this.ageAtNecropsy == null && ageAtNecropsy_is_initialized)) {
            return; 
        } 
        this.ageAtNecropsy = newVal; 

        ageAtNecropsy_is_modified = true; 
        ageAtNecropsy_is_initialized = true; 
    }

    /**
     * Determines if the ageAtNecropsy has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAgeAtNecropsyModified() {
        return ageAtNecropsy_is_modified; 
    }

    /**
     * Determines if the ageAtNecropsy has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAgeAtNecropsyInitialized() {
        return ageAtNecropsy_is_initialized; 
    }

    /**
     * Getter method for PathologistKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology._Pathologist_key
     * <li> foreign key: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of PathologistKey
     */
    public Long getPathologistKey() {
        return PathologistKey; 
    }

    /**
     * Setter method for PathologistKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to PathologistKey
     */
    public void setPathologistKey(Long newVal) {
        if ((newVal != null && this.PathologistKey != null && (newVal.compareTo(this.PathologistKey) == 0)) || 
            (newVal == null && this.PathologistKey == null && PathologistKey_is_initialized)) {
            return; 
        } 
        this.PathologistKey = newVal; 

        PathologistKey_is_modified = true; 
        PathologistKey_is_initialized = true; 
    }

    /**
     * Setter method for PathologistKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to PathologistKey
     */
    public void setPathologistKey(long newVal) {
        setPathologistKey(new Long(newVal));
    }

    /**
     * Determines if the PathologistKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPathologistKeyModified() {
        return PathologistKey_is_modified; 
    }

    /**
     * Determines if the PathologistKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPathologistKeyInitialized() {
        return PathologistKey_is_initialized; 
    }

    /**
     * Getter method for ContributorKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology._Contributor_key
     * <li> foreign key: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ContributorKey
     */
    public Long getContributorKey() {
        return ContributorKey; 
    }

    /**
     * Setter method for ContributorKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ContributorKey
     */
    public void setContributorKey(Long newVal) {
        if ((newVal != null && this.ContributorKey != null && (newVal.compareTo(this.ContributorKey) == 0)) || 
            (newVal == null && this.ContributorKey == null && ContributorKey_is_initialized)) {
            return; 
        } 
        this.ContributorKey = newVal; 

        ContributorKey_is_modified = true; 
        ContributorKey_is_initialized = true; 
    }

    /**
     * Setter method for ContributorKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ContributorKey
     */
    public void setContributorKey(long newVal) {
        setContributorKey(new Long(newVal));
    }

    /**
     * Determines if the ContributorKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isContributorKeyModified() {
        return ContributorKey_is_modified; 
    }

    /**
     * Determines if the ContributorKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isContributorKeyInitialized() {
        return ContributorKey_is_initialized; 
    }

    /**
     * Getter method for description.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology.description
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of description
     */
    public String getDescription() {
        return description; 
    }

    /**
     * Setter method for description.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to description
     */
    public void setDescription(String newVal) {
        if ((newVal != null && this.description != null && (newVal.compareTo(this.description) == 0)) || 
            (newVal == null && this.description == null && description_is_initialized)) {
            return; 
        } 
        this.description = newVal; 

        description_is_modified = true; 
        description_is_initialized = true; 
    }

    /**
     * Determines if the description has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDescriptionModified() {
        return description_is_modified; 
    }

    /**
     * Determines if the description has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDescriptionInitialized() {
        return description_is_initialized; 
    }

    /**
     * Getter method for note.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Pathology.note
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
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
     * <li>full name: Pathology.create_user
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
     * <li>full name: Pathology.create_date
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
     * <li>full name: Pathology.update_user
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
     * <li>full name: Pathology.update_date
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
     ageAtNecropsy_is_modified || 
     PathologistKey_is_modified || 
     ContributorKey_is_modified || 
     description_is_modified || 
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
        PathologyKey_is_modified = false;
        ageAtNecropsy_is_modified = false;
        PathologistKey_is_modified = false;
        ContributorKey_is_modified = false;
        description_is_modified = false;
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
    public void copy(PathologyDTO bean) {
        setPathologyKey(bean.getPathologyKey());
        setAgeAtNecropsy(bean.getAgeAtNecropsy());
        setPathologistKey(bean.getPathologistKey());
        setContributorKey(bean.getContributorKey());
        setDescription(bean.getDescription());
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
            ret.append("\n[Pathology] ");
            ret.append("\n - Pathology._Pathology_key = ").append((PathologyKey_is_initialized ? ("[" + (PathologyKey == null ? null : PathologyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Pathology.ageAtNecropsy = ").append((ageAtNecropsy_is_initialized ? ("[" + (ageAtNecropsy == null ? null : ageAtNecropsy) + "]") : "not initialized"));
            ret.append("\n - Pathology._Pathologist_key = ").append((PathologistKey_is_initialized ? ("[" + (PathologistKey == null ? null : PathologistKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Pathology._Contributor_key = ").append((ContributorKey_is_initialized ? ("[" + (ContributorKey == null ? null : ContributorKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Pathology.description = ").append((description_is_initialized ? ("[" + (description == null ? null : description) + "]") : "not initialized"));
            ret.append("\n - Pathology.note = ").append((note_is_initialized ? ("[" + (note == null ? null : note) + "]") : "not initialized"));
            ret.append("\n - Pathology.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Pathology.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Pathology.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Pathology.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Pathology\">\n");
        ret.append("    <column name=\"_Pathology_key\"\n");
        ret.append("            value=\"").append((PathologyKey_is_initialized ? ((PathologyKey == null ? null : PathologyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"ageAtNecropsy\"\n");
        ret.append("            value=\"").append((ageAtNecropsy_is_initialized ? ((ageAtNecropsy == null ? null : ageAtNecropsy)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Pathologist_key\"\n");
        ret.append("            value=\"").append((PathologistKey_is_initialized ? ((PathologistKey == null ? null : PathologistKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Contributor_key\"\n");
        ret.append("            value=\"").append((ContributorKey_is_initialized ? ((ContributorKey == null ? null : ContributorKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"description\"\n");
        ret.append("            value=\"").append((description_is_initialized ? ((description == null ? null : description)) : "[not initialized]")).append("\"/>\n");
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
