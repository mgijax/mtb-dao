
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class MTBDataStatusDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long MTBDataStatusKeyOriginal;
    
    private Long MTBDataStatusKey;
    private boolean MTBDataStatusKey_is_modified = false;
    private boolean MTBDataStatusKey_is_initialized = false;
    
    private String dataStatus;
    private boolean dataStatus_is_modified = false;
    private boolean dataStatus_is_initialized = false;
    
    private Long MTBViewStatusKey;
    private boolean MTBViewStatusKey_is_modified = false;
    private boolean MTBViewStatusKey_is_initialized = false;
    
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
    MTBDataStatusDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for MTBDataStatusKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBDataStatus._MTBDataStatus_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBDataStatusKey
     */
    public Long getMTBDataStatusKeyOriginal() {
        return MTBDataStatusKeyOriginal; 
    }

    /**
     * Getter method for MTBDataStatusKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBDataStatus._MTBDataStatus_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBDataStatusKey
     */
    public Long getMTBDataStatusKey() {
        return MTBDataStatusKey; 
    }

    /**
     * Setter method for MTBDataStatusKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBDataStatusKey
     */
    public void setMTBDataStatusKey(Long newVal) {
        if ((newVal != null && this.MTBDataStatusKey != null && (newVal.compareTo(this.MTBDataStatusKey) == 0)) || 
            (newVal == null && this.MTBDataStatusKey == null && MTBDataStatusKey_is_initialized)) {
            return; 
        } 

        if(this.MTBDataStatusKeyOriginal == null) {
            this.MTBDataStatusKeyOriginal = newVal;
        }
        this.MTBDataStatusKey = newVal; 

        MTBDataStatusKey_is_modified = true; 
        MTBDataStatusKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBDataStatusKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBDataStatusKey
     */
    public void setMTBDataStatusKey(long newVal) {
        setMTBDataStatusKey(new Long(newVal));
    }

    /**
     * Determines if the MTBDataStatusKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBDataStatusKeyModified() {
        return MTBDataStatusKey_is_modified; 
    }

    /**
     * Determines if the MTBDataStatusKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBDataStatusKeyInitialized() {
        return MTBDataStatusKey_is_initialized; 
    }

    /**
     * Getter method for dataStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBDataStatus.dataStatus
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of dataStatus
     */
    public String getDataStatus() {
        return dataStatus; 
    }

    /**
     * Setter method for dataStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to dataStatus
     */
    public void setDataStatus(String newVal) {
        if ((newVal != null && this.dataStatus != null && (newVal.compareTo(this.dataStatus) == 0)) || 
            (newVal == null && this.dataStatus == null && dataStatus_is_initialized)) {
            return; 
        } 
        this.dataStatus = newVal; 

        dataStatus_is_modified = true; 
        dataStatus_is_initialized = true; 
    }

    /**
     * Determines if the dataStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDataStatusModified() {
        return dataStatus_is_modified; 
    }

    /**
     * Determines if the dataStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDataStatusInitialized() {
        return dataStatus_is_initialized; 
    }

    /**
     * Getter method for MTBViewStatusKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBDataStatus._MTBViewStatus_key
     * <li> foreign key: MTBViewStatus._MTBViewStatus_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBViewStatusKey
     */
    public Long getMTBViewStatusKey() {
        return MTBViewStatusKey; 
    }

    /**
     * Setter method for MTBViewStatusKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBViewStatusKey
     */
    public void setMTBViewStatusKey(Long newVal) {
        if ((newVal != null && this.MTBViewStatusKey != null && (newVal.compareTo(this.MTBViewStatusKey) == 0)) || 
            (newVal == null && this.MTBViewStatusKey == null && MTBViewStatusKey_is_initialized)) {
            return; 
        } 
        this.MTBViewStatusKey = newVal; 

        MTBViewStatusKey_is_modified = true; 
        MTBViewStatusKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBViewStatusKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBViewStatusKey
     */
    public void setMTBViewStatusKey(long newVal) {
        setMTBViewStatusKey(new Long(newVal));
    }

    /**
     * Determines if the MTBViewStatusKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBViewStatusKeyModified() {
        return MTBViewStatusKey_is_modified; 
    }

    /**
     * Determines if the MTBViewStatusKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBViewStatusKeyInitialized() {
        return MTBViewStatusKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBDataStatus.create_user
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
     * <li>full name: MTBDataStatus.create_date
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
     * <li>full name: MTBDataStatus.update_user
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
     * <li>full name: MTBDataStatus.update_date
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
        return MTBDataStatusKey_is_modified || 
     dataStatus_is_modified || 
     MTBViewStatusKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        MTBDataStatusKey_is_modified = false;
        dataStatus_is_modified = false;
        MTBViewStatusKey_is_modified = false;
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
    public void copy(MTBDataStatusDTO bean) {
        setMTBDataStatusKey(bean.getMTBDataStatusKey());
        setDataStatus(bean.getDataStatus());
        setMTBViewStatusKey(bean.getMTBViewStatusKey());
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
            ret.append("\n[MTBDataStatus] ");
            ret.append("\n - MTBDataStatus._MTBDataStatus_key = ").append((MTBDataStatusKey_is_initialized ? ("[" + (MTBDataStatusKey == null ? null : MTBDataStatusKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus.dataStatus = ").append((dataStatus_is_initialized ? ("[" + (dataStatus == null ? null : dataStatus) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus._MTBViewStatus_key = ").append((MTBViewStatusKey_is_initialized ? ("[" + (MTBViewStatusKey == null ? null : MTBViewStatusKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - MTBDataStatus.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"MTBDataStatus\">\n");
        ret.append("    <column name=\"_MTBDataStatus_key\"\n");
        ret.append("            value=\"").append((MTBDataStatusKey_is_initialized ? ((MTBDataStatusKey == null ? null : MTBDataStatusKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"dataStatus\"\n");
        ret.append("            value=\"").append((dataStatus_is_initialized ? ((dataStatus == null ? null : dataStatus)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBViewStatus_key\"\n");
        ret.append("            value=\"").append((MTBViewStatusKey_is_initialized ? ((MTBViewStatusKey == null ? null : MTBViewStatusKey.toString())) : "[not initialized]")).append("\"/>\n");
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
