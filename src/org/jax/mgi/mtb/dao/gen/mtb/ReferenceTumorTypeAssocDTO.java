
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.mysql.jdbc.Driver
// Generation Time: : Fri Jul 08 13:46:52 EDT 2011

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class ReferenceTumorTypeAssocDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long ReferenceTumorTypeAssocKeyOriginal;
    
    private Long ReferenceTumorTypeAssocKey;
    private boolean ReferenceTumorTypeAssocKey_is_modified = false;
    private boolean ReferenceTumorTypeAssocKey_is_initialized = false;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
    private Long TumorTypeKey;
    private boolean TumorTypeKey_is_modified = false;
    private boolean TumorTypeKey_is_initialized = false;
    
    private Long MTBDataStatusKey;
    private boolean MTBDataStatusKey_is_modified = false;
    private boolean MTBDataStatusKey_is_initialized = false;
    
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
    ReferenceTumorTypeAssocDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for ReferenceTumorTypeAssocKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of ReferenceTumorTypeAssocKey
     */
    public Long getReferenceTumorTypeAssocKeyOriginal() {
        return ReferenceTumorTypeAssocKeyOriginal; 
    }

    /**
     * Getter method for ReferenceTumorTypeAssocKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of ReferenceTumorTypeAssocKey
     */
    public Long getReferenceTumorTypeAssocKey() {
        return ReferenceTumorTypeAssocKey; 
    }

    /**
     * Setter method for ReferenceTumorTypeAssocKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ReferenceTumorTypeAssocKey
     */
    public void setReferenceTumorTypeAssocKey(Long newVal) {
        if ((newVal != null && this.ReferenceTumorTypeAssocKey != null && (newVal.compareTo(this.ReferenceTumorTypeAssocKey) == 0)) || 
            (newVal == null && this.ReferenceTumorTypeAssocKey == null && ReferenceTumorTypeAssocKey_is_initialized)) {
            return; 
        } 

        if(this.ReferenceTumorTypeAssocKeyOriginal == null) {
            this.ReferenceTumorTypeAssocKeyOriginal = newVal;
        }
        this.ReferenceTumorTypeAssocKey = newVal; 

        ReferenceTumorTypeAssocKey_is_modified = true; 
        ReferenceTumorTypeAssocKey_is_initialized = true; 
    }

    /**
     * Setter method for ReferenceTumorTypeAssocKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ReferenceTumorTypeAssocKey
     */
    public void setReferenceTumorTypeAssocKey(long newVal) {
        setReferenceTumorTypeAssocKey(new Long(newVal));
    }

    /**
     * Determines if the ReferenceTumorTypeAssocKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isReferenceTumorTypeAssocKeyModified() {
        return ReferenceTumorTypeAssocKey_is_modified; 
    }

    /**
     * Determines if the ReferenceTumorTypeAssocKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isReferenceTumorTypeAssocKeyInitialized() {
        return ReferenceTumorTypeAssocKey_is_initialized; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
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
     * Getter method for TumorTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc._TumorType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of TumorTypeKey
     */
    public Long getTumorTypeKey() {
        return TumorTypeKey; 
    }

    /**
     * Setter method for TumorTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorTypeKey
     */
    public void setTumorTypeKey(Long newVal) {
        if ((newVal != null && this.TumorTypeKey != null && (newVal.compareTo(this.TumorTypeKey) == 0)) || 
            (newVal == null && this.TumorTypeKey == null && TumorTypeKey_is_initialized)) {
            return; 
        } 
        this.TumorTypeKey = newVal; 

        TumorTypeKey_is_modified = true; 
        TumorTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorTypeKey
     */
    public void setTumorTypeKey(long newVal) {
        setTumorTypeKey(new Long(newVal));
    }

    /**
     * Determines if the TumorTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorTypeKeyModified() {
        return TumorTypeKey_is_modified; 
    }

    /**
     * Determines if the TumorTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorTypeKeyInitialized() {
        return TumorTypeKey_is_initialized; 
    }

    /**
     * Getter method for MTBDataStatusKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc._MTBDataStatus_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
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
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: ReferenceTumorTypeAssoc.create_user
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
     * <li>full name: ReferenceTumorTypeAssoc.create_date
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
     * <li>full name: ReferenceTumorTypeAssoc.update_user
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
     * <li>full name: ReferenceTumorTypeAssoc.update_date
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
        return ReferenceTumorTypeAssocKey_is_modified || 
     ReferenceKey_is_modified || 
     TumorTypeKey_is_modified || 
     MTBDataStatusKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        ReferenceTumorTypeAssocKey_is_modified = false;
        ReferenceKey_is_modified = false;
        TumorTypeKey_is_modified = false;
        MTBDataStatusKey_is_modified = false;
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
    public void copy(ReferenceTumorTypeAssocDTO bean) {
        setReferenceTumorTypeAssocKey(bean.getReferenceTumorTypeAssocKey());
        setReferenceKey(bean.getReferenceKey());
        setTumorTypeKey(bean.getTumorTypeKey());
        setMTBDataStatusKey(bean.getMTBDataStatusKey());
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
            ret.append("\n[ReferenceTumorTypeAssoc] ");
            ret.append("\n - ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key = ").append((ReferenceTumorTypeAssocKey_is_initialized ? ("[" + (ReferenceTumorTypeAssocKey == null ? null : ReferenceTumorTypeAssocKey.toString()) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc._TumorType_key = ").append((TumorTypeKey_is_initialized ? ("[" + (TumorTypeKey == null ? null : TumorTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc._MTBDataStatus_key = ").append((MTBDataStatusKey_is_initialized ? ("[" + (MTBDataStatusKey == null ? null : MTBDataStatusKey.toString()) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - ReferenceTumorTypeAssoc.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"ReferenceTumorTypeAssoc\">\n");
        ret.append("    <column name=\"_ReferenceTumorTypeAssoc_key\"\n");
        ret.append("            value=\"").append((ReferenceTumorTypeAssocKey_is_initialized ? ((ReferenceTumorTypeAssocKey == null ? null : ReferenceTumorTypeAssocKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorType_key\"\n");
        ret.append("            value=\"").append((TumorTypeKey_is_initialized ? ((TumorTypeKey == null ? null : TumorTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBDataStatus_key\"\n");
        ret.append("            value=\"").append((MTBDataStatusKey_is_initialized ? ((MTBDataStatusKey == null ? null : MTBDataStatusKey.toString())) : "[not initialized]")).append("\"/>\n");
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
