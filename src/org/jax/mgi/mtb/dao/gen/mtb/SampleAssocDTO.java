
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.mysql.jdbc.Driver
// Generation Time: : Tue Jun 15 09:27:26 EDT 2010

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 

public class SampleAssocDTO extends TableDTO
// extends+ 

// extends- 
{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long sampleassocKeyOriginal;
    
    private Long sampleassocKey;
    private boolean sampleassocKey_is_modified = false;
    private boolean sampleassocKey_is_initialized = false;
    
    private Long sampleKey;
    private boolean sampleKey_is_modified = false;
    private boolean sampleKey_is_initialized = false;
    
    private Long objectKey;
    private boolean objectKey_is_modified = false;
    private boolean objectKey_is_initialized = false;
    
    private Long MTBTypesKey;
    private boolean MTBTypesKey_is_modified = false;
    private boolean MTBTypesKey_is_initialized = false;
    
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
    SampleAssocDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for sampleassocKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc._sampleassoc_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of sampleassocKey
     */
    public Long getSampleassocKeyOriginal() {
        return sampleassocKeyOriginal; 
    }

    /**
     * Getter method for sampleassocKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc._sampleassoc_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of sampleassocKey
     */
    public Long getSampleassocKey() {
        return sampleassocKey; 
    }

    /**
     * Setter method for sampleassocKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to sampleassocKey
     */
    public void setSampleassocKey(Long newVal) {
        if ((newVal != null && this.sampleassocKey != null && (newVal.compareTo(this.sampleassocKey) == 0)) || 
            (newVal == null && this.sampleassocKey == null && sampleassocKey_is_initialized)) {
            return; 
        } 

        if(this.sampleassocKeyOriginal == null) {
            this.sampleassocKeyOriginal = newVal;
        }
        this.sampleassocKey = newVal; 

        sampleassocKey_is_modified = true; 
        sampleassocKey_is_initialized = true; 
    }

    /**
     * Setter method for sampleassocKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sampleassocKey
     */
    public void setSampleassocKey(long newVal) {
        setSampleassocKey(new Long(newVal));
    }

    /**
     * Determines if the sampleassocKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSampleassocKeyModified() {
        return sampleassocKey_is_modified; 
    }

    /**
     * Determines if the sampleassocKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSampleassocKeyInitialized() {
        return sampleassocKey_is_initialized; 
    }

    /**
     * Getter method for sampleKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc._sample_key
     * <li> foreign key: Sample._sample_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of sampleKey
     */
    public Long getSampleKey() {
        return sampleKey; 
    }

    /**
     * Setter method for sampleKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to sampleKey
     */
    public void setSampleKey(Long newVal) {
        if ((newVal != null && this.sampleKey != null && (newVal.compareTo(this.sampleKey) == 0)) || 
            (newVal == null && this.sampleKey == null && sampleKey_is_initialized)) {
            return; 
        } 
        this.sampleKey = newVal; 

        sampleKey_is_modified = true; 
        sampleKey_is_initialized = true; 
    }

    /**
     * Setter method for sampleKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sampleKey
     */
    public void setSampleKey(long newVal) {
        setSampleKey(new Long(newVal));
    }

    /**
     * Determines if the sampleKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSampleKeyModified() {
        return sampleKey_is_modified; 
    }

    /**
     * Determines if the sampleKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSampleKeyInitialized() {
        return sampleKey_is_initialized; 
    }

    /**
     * Getter method for objectKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc._object_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of objectKey
     */
    public Long getObjectKey() {
        return objectKey; 
    }

    /**
     * Setter method for objectKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to objectKey
     */
    public void setObjectKey(Long newVal) {
        if ((newVal != null && this.objectKey != null && (newVal.compareTo(this.objectKey) == 0)) || 
            (newVal == null && this.objectKey == null && objectKey_is_initialized)) {
            return; 
        } 
        this.objectKey = newVal; 

        objectKey_is_modified = true; 
        objectKey_is_initialized = true; 
    }

    /**
     * Setter method for objectKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to objectKey
     */
    public void setObjectKey(long newVal) {
        setObjectKey(new Long(newVal));
    }

    /**
     * Determines if the objectKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isObjectKeyModified() {
        return objectKey_is_modified; 
    }

    /**
     * Determines if the objectKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isObjectKeyInitialized() {
        return objectKey_is_initialized; 
    }

    /**
     * Getter method for MTBTypesKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc._MTBTypes_key
     * <li> foreign key: MTBTypes._MTBTypes_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
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
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: SampleAssoc.create_user
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
     * <li>full name: SampleAssoc.create_date
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
     * <li>full name: SampleAssoc.update_user
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
     * <li>full name: SampleAssoc.update_date
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
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return sampleassocKey_is_modified || 
     sampleKey_is_modified || 
     objectKey_is_modified || 
     MTBTypesKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        sampleassocKey_is_modified = false;
        sampleKey_is_modified = false;
        objectKey_is_modified = false;
        MTBTypesKey_is_modified = false;
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
    public void copy(SampleAssocDTO bean) {
        setSampleassocKey(bean.getSampleassocKey());
        setSampleKey(bean.getSampleKey());
        setObjectKey(bean.getObjectKey());
        setMTBTypesKey(bean.getMTBTypesKey());
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
            ret.append("\n[SampleAssoc] ");
            ret.append("\n - SampleAssoc._sampleassoc_key = ").append((sampleassocKey_is_initialized ? ("[" + (sampleassocKey == null ? null : sampleassocKey.toString()) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc._sample_key = ").append((sampleKey_is_initialized ? ("[" + (sampleKey == null ? null : sampleKey.toString()) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc._object_key = ").append((objectKey_is_initialized ? ("[" + (objectKey == null ? null : objectKey.toString()) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc._MTBTypes_key = ").append((MTBTypesKey_is_initialized ? ("[" + (MTBTypesKey == null ? null : MTBTypesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - SampleAssoc.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"SampleAssoc\">\n");
        ret.append("    <column name=\"_sampleassoc_key\"\n");
        ret.append("            value=\"").append((sampleassocKey_is_initialized ? ((sampleassocKey == null ? null : sampleassocKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_sample_key\"\n");
        ret.append("            value=\"").append((sampleKey_is_initialized ? ((sampleKey == null ? null : sampleKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_object_key\"\n");
        ret.append("            value=\"").append((objectKey_is_initialized ? ((objectKey == null ? null : objectKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBTypes_key\"\n");
        ret.append("            value=\"").append((MTBTypesKey_is_initialized ? ((MTBTypesKey == null ? null : MTBTypesKey.toString())) : "[not initialized]")).append("\"/>\n");
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
