
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class MTBTypesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long MTBTypesKeyOriginal;
    
    private Long MTBTypesKey;
    private boolean MTBTypesKey_is_modified = false;
    private boolean MTBTypesKey_is_initialized = false;
    
    private String type;
    private boolean type_is_modified = false;
    private boolean type_is_initialized = false;
    
    private String description;
    private boolean description_is_modified = false;
    private boolean description_is_initialized = false;
    
    private String tableName;
    private boolean tableName_is_modified = false;
    private boolean tableName_is_initialized = false;
    
    private String columnName;
    private boolean columnName_is_modified = false;
    private boolean columnName_is_initialized = false;
    
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
    MTBTypesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for MTBTypesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes._MTBTypes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBTypesKey
     */
    public Long getMTBTypesKeyOriginal() {
        return MTBTypesKeyOriginal; 
    }

    /**
     * Getter method for MTBTypesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes._MTBTypes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBTypesKey
     */
    public Long getMTBTypesKey() {
        return MTBTypesKey; 
    }

    /**
     * Setter method for MTBTypesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBTypesKey
     */
    public void setMTBTypesKey(Long newVal) {
        if ((newVal != null && this.MTBTypesKey != null && (newVal.compareTo(this.MTBTypesKey) == 0)) || 
            (newVal == null && this.MTBTypesKey == null && MTBTypesKey_is_initialized)) {
            return; 
        } 

        if(this.MTBTypesKeyOriginal == null) {
            this.MTBTypesKeyOriginal = newVal;
        }
        this.MTBTypesKey = newVal; 

        MTBTypesKey_is_modified = true; 
        MTBTypesKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBTypesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBTypesKey
     */
    public void setMTBTypesKey(long newVal) {
        setMTBTypesKey(new Long(newVal));
    }

    /**
     * Determines if the MTBTypesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBTypesKeyModified() {
        return MTBTypesKey_is_modified; 
    }

    /**
     * Determines if the MTBTypesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBTypesKeyInitialized() {
        return MTBTypesKey_is_initialized; 
    }

    /**
     * Getter method for type.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes.type
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of type
     */
    public String getType() {
        return type; 
    }

    /**
     * Setter method for type.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to type
     */
    public void setType(String newVal) {
        if ((newVal != null && this.type != null && (newVal.compareTo(this.type) == 0)) || 
            (newVal == null && this.type == null && type_is_initialized)) {
            return; 
        } 
        this.type = newVal; 

        type_is_modified = true; 
        type_is_initialized = true; 
    }

    /**
     * Determines if the type has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTypeModified() {
        return type_is_modified; 
    }

    /**
     * Determines if the type has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTypeInitialized() {
        return type_is_initialized; 
    }

    /**
     * Getter method for description.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes.description
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
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
     * Getter method for tableName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes.tableName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of tableName
     */
    public String getTableName() {
        return tableName; 
    }

    /**
     * Setter method for tableName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to tableName
     */
    public void setTableName(String newVal) {
        if ((newVal != null && this.tableName != null && (newVal.compareTo(this.tableName) == 0)) || 
            (newVal == null && this.tableName == null && tableName_is_initialized)) {
            return; 
        } 
        this.tableName = newVal; 

        tableName_is_modified = true; 
        tableName_is_initialized = true; 
    }

    /**
     * Determines if the tableName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTableNameModified() {
        return tableName_is_modified; 
    }

    /**
     * Determines if the tableName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTableNameInitialized() {
        return tableName_is_initialized; 
    }

    /**
     * Getter method for columnName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes.columnName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of columnName
     */
    public String getColumnName() {
        return columnName; 
    }

    /**
     * Setter method for columnName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to columnName
     */
    public void setColumnName(String newVal) {
        if ((newVal != null && this.columnName != null && (newVal.compareTo(this.columnName) == 0)) || 
            (newVal == null && this.columnName == null && columnName_is_initialized)) {
            return; 
        } 
        this.columnName = newVal; 

        columnName_is_modified = true; 
        columnName_is_initialized = true; 
    }

    /**
     * Determines if the columnName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isColumnNameModified() {
        return columnName_is_modified; 
    }

    /**
     * Determines if the columnName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isColumnNameInitialized() {
        return columnName_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBTypes.create_user
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
     * <li>full name: MTBTypes.create_date
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
     * <li>full name: MTBTypes.update_user
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
     * <li>full name: MTBTypes.update_date
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
        return MTBTypesKey_is_modified || 
     type_is_modified || 
     description_is_modified || 
     tableName_is_modified || 
     columnName_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        MTBTypesKey_is_modified = false;
        type_is_modified = false;
        description_is_modified = false;
        tableName_is_modified = false;
        columnName_is_modified = false;
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
    public void copy(MTBTypesDTO bean) {
        setMTBTypesKey(bean.getMTBTypesKey());
        setType(bean.getType());
        setDescription(bean.getDescription());
        setTableName(bean.getTableName());
        setColumnName(bean.getColumnName());
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
            ret.append("\n[MTBTypes] ");
            ret.append("\n - MTBTypes._MTBTypes_key = ").append((MTBTypesKey_is_initialized ? ("[" + (MTBTypesKey == null ? null : MTBTypesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.type = ").append((type_is_initialized ? ("[" + (type == null ? null : type) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.description = ").append((description_is_initialized ? ("[" + (description == null ? null : description) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.tableName = ").append((tableName_is_initialized ? ("[" + (tableName == null ? null : tableName) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.columnName = ").append((columnName_is_initialized ? ("[" + (columnName == null ? null : columnName) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - MTBTypes.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"MTBTypes\">\n");
        ret.append("    <column name=\"_MTBTypes_key\"\n");
        ret.append("            value=\"").append((MTBTypesKey_is_initialized ? ((MTBTypesKey == null ? null : MTBTypesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"type\"\n");
        ret.append("            value=\"").append((type_is_initialized ? ((type == null ? null : type)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"description\"\n");
        ret.append("            value=\"").append((description_is_initialized ? ((description == null ? null : description)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"tableName\"\n");
        ret.append("            value=\"").append((tableName_is_initialized ? ((tableName == null ? null : tableName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"columnName\"\n");
        ret.append("            value=\"").append((columnName_is_initialized ? ((columnName == null ? null : columnName)) : "[not initialized]")).append("\"/>\n");
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
