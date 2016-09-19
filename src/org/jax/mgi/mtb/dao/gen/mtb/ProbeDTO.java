
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class ProbeDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long ProbeKeyOriginal;
    
    private Long ProbeKey;
    private boolean ProbeKey_is_modified = false;
    private boolean ProbeKey_is_initialized = false;
    
    private String name;
    private boolean name_is_modified = false;
    private boolean name_is_initialized = false;
    
    private String target;
    private boolean target_is_modified = false;
    private boolean target_is_initialized = false;
    
    private String counterstain;
    private boolean counterstain_is_modified = false;
    private boolean counterstain_is_initialized = false;
    
    private String url;
    private boolean url_is_modified = false;
    private boolean url_is_initialized = false;
    
    private String type;
    private boolean type_is_modified = false;
    private boolean type_is_initialized = false;
    
    private String notes;
    private boolean notes_is_modified = false;
    private boolean notes_is_initialized = false;
    
    private String supplierName;
    private boolean supplierName_is_modified = false;
    private boolean supplierName_is_initialized = false;
    
    private String supplierAddress;
    private boolean supplierAddress_is_modified = false;
    private boolean supplierAddress_is_initialized = false;
    
    private String supplierUrl;
    private boolean supplierUrl_is_modified = false;
    private boolean supplierUrl_is_initialized = false;
    
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
    ProbeDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for ProbeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe._Probe_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ProbeKey
     */
    public Long getProbeKeyOriginal() {
        return ProbeKeyOriginal; 
    }

    /**
     * Getter method for ProbeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe._Probe_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ProbeKey
     */
    public Long getProbeKey() {
        return ProbeKey; 
    }

    /**
     * Setter method for ProbeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ProbeKey
     */
    public void setProbeKey(Long newVal) {
        if ((newVal != null && this.ProbeKey != null && (newVal.compareTo(this.ProbeKey) == 0)) || 
            (newVal == null && this.ProbeKey == null && ProbeKey_is_initialized)) {
            return; 
        } 

        if(this.ProbeKeyOriginal == null) {
            this.ProbeKeyOriginal = newVal;
        }
        this.ProbeKey = newVal; 

        ProbeKey_is_modified = true; 
        ProbeKey_is_initialized = true; 
    }

    /**
     * Setter method for ProbeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ProbeKey
     */
    public void setProbeKey(long newVal) {
        setProbeKey(new Long(newVal));
    }

    /**
     * Determines if the ProbeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isProbeKeyModified() {
        return ProbeKey_is_modified; 
    }

    /**
     * Determines if the ProbeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isProbeKeyInitialized() {
        return ProbeKey_is_initialized; 
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.name
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
     * Getter method for target.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.target
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of target
     */
    public String getTarget() {
        return target; 
    }

    /**
     * Setter method for target.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to target
     */
    public void setTarget(String newVal) {
        if ((newVal != null && this.target != null && (newVal.compareTo(this.target) == 0)) || 
            (newVal == null && this.target == null && target_is_initialized)) {
            return; 
        } 
        this.target = newVal; 

        target_is_modified = true; 
        target_is_initialized = true; 
    }

    /**
     * Determines if the target has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTargetModified() {
        return target_is_modified; 
    }

    /**
     * Determines if the target has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTargetInitialized() {
        return target_is_initialized; 
    }

    /**
     * Getter method for counterstain.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.counterstain
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of counterstain
     */
    public String getCounterstain() {
        return counterstain; 
    }

    /**
     * Setter method for counterstain.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to counterstain
     */
    public void setCounterstain(String newVal) {
        if ((newVal != null && this.counterstain != null && (newVal.compareTo(this.counterstain) == 0)) || 
            (newVal == null && this.counterstain == null && counterstain_is_initialized)) {
            return; 
        } 
        this.counterstain = newVal; 

        counterstain_is_modified = true; 
        counterstain_is_initialized = true; 
    }

    /**
     * Determines if the counterstain has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCounterstainModified() {
        return counterstain_is_modified; 
    }

    /**
     * Determines if the counterstain has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCounterstainInitialized() {
        return counterstain_is_initialized; 
    }

    /**
     * Getter method for url.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.url
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of url
     */
    public String getUrl() {
        return url; 
    }

    /**
     * Setter method for url.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to url
     */
    public void setUrl(String newVal) {
        if ((newVal != null && this.url != null && (newVal.compareTo(this.url) == 0)) || 
            (newVal == null && this.url == null && url_is_initialized)) {
            return; 
        } 
        this.url = newVal; 

        url_is_modified = true; 
        url_is_initialized = true; 
    }

    /**
     * Determines if the url has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUrlModified() {
        return url_is_modified; 
    }

    /**
     * Determines if the url has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUrlInitialized() {
        return url_is_initialized; 
    }

    /**
     * Getter method for type.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.type
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
     * Getter method for notes.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.notes
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
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
     * Getter method for supplierName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.supplierName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of supplierName
     */
    public String getSupplierName() {
        return supplierName; 
    }

    /**
     * Setter method for supplierName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to supplierName
     */
    public void setSupplierName(String newVal) {
        if ((newVal != null && this.supplierName != null && (newVal.compareTo(this.supplierName) == 0)) || 
            (newVal == null && this.supplierName == null && supplierName_is_initialized)) {
            return; 
        } 
        this.supplierName = newVal; 

        supplierName_is_modified = true; 
        supplierName_is_initialized = true; 
    }

    /**
     * Determines if the supplierName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSupplierNameModified() {
        return supplierName_is_modified; 
    }

    /**
     * Determines if the supplierName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSupplierNameInitialized() {
        return supplierName_is_initialized; 
    }

    /**
     * Getter method for supplierAddress.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.supplierAddress
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of supplierAddress
     */
    public String getSupplierAddress() {
        return supplierAddress; 
    }

    /**
     * Setter method for supplierAddress.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to supplierAddress
     */
    public void setSupplierAddress(String newVal) {
        if ((newVal != null && this.supplierAddress != null && (newVal.compareTo(this.supplierAddress) == 0)) || 
            (newVal == null && this.supplierAddress == null && supplierAddress_is_initialized)) {
            return; 
        } 
        this.supplierAddress = newVal; 

        supplierAddress_is_modified = true; 
        supplierAddress_is_initialized = true; 
    }

    /**
     * Determines if the supplierAddress has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSupplierAddressModified() {
        return supplierAddress_is_modified; 
    }

    /**
     * Determines if the supplierAddress has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSupplierAddressInitialized() {
        return supplierAddress_is_initialized; 
    }

    /**
     * Getter method for supplierUrl.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.supplierUrl
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of supplierUrl
     */
    public String getSupplierUrl() {
        return supplierUrl; 
    }

    /**
     * Setter method for supplierUrl.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to supplierUrl
     */
    public void setSupplierUrl(String newVal) {
        if ((newVal != null && this.supplierUrl != null && (newVal.compareTo(this.supplierUrl) == 0)) || 
            (newVal == null && this.supplierUrl == null && supplierUrl_is_initialized)) {
            return; 
        } 
        this.supplierUrl = newVal; 

        supplierUrl_is_modified = true; 
        supplierUrl_is_initialized = true; 
    }

    /**
     * Determines if the supplierUrl has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSupplierUrlModified() {
        return supplierUrl_is_modified; 
    }

    /**
     * Determines if the supplierUrl has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSupplierUrlInitialized() {
        return supplierUrl_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Probe.create_user
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
     * <li>full name: Probe.create_date
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
     * <li>full name: Probe.update_user
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
     * <li>full name: Probe.update_date
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
        return ProbeKey_is_modified || 
     name_is_modified || 
     target_is_modified || 
     counterstain_is_modified || 
     url_is_modified || 
     type_is_modified || 
     notes_is_modified || 
     supplierName_is_modified || 
     supplierAddress_is_modified || 
     supplierUrl_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        ProbeKey_is_modified = false;
        name_is_modified = false;
        target_is_modified = false;
        counterstain_is_modified = false;
        url_is_modified = false;
        type_is_modified = false;
        notes_is_modified = false;
        supplierName_is_modified = false;
        supplierAddress_is_modified = false;
        supplierUrl_is_modified = false;
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
    public void copy(ProbeDTO bean) {
        setProbeKey(bean.getProbeKey());
        setName(bean.getName());
        setTarget(bean.getTarget());
        setCounterstain(bean.getCounterstain());
        setUrl(bean.getUrl());
        setType(bean.getType());
        setNotes(bean.getNotes());
        setSupplierName(bean.getSupplierName());
        setSupplierAddress(bean.getSupplierAddress());
        setSupplierUrl(bean.getSupplierUrl());
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
            ret.append("\n[Probe] ");
            ret.append("\n - Probe._Probe_key = ").append((ProbeKey_is_initialized ? ("[" + (ProbeKey == null ? null : ProbeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Probe.name = ").append((name_is_initialized ? ("[" + (name == null ? null : name) + "]") : "not initialized"));
            ret.append("\n - Probe.target = ").append((target_is_initialized ? ("[" + (target == null ? null : target) + "]") : "not initialized"));
            ret.append("\n - Probe.counterstain = ").append((counterstain_is_initialized ? ("[" + (counterstain == null ? null : counterstain) + "]") : "not initialized"));
            ret.append("\n - Probe.url = ").append((url_is_initialized ? ("[" + (url == null ? null : url) + "]") : "not initialized"));
            ret.append("\n - Probe.type = ").append((type_is_initialized ? ("[" + (type == null ? null : type) + "]") : "not initialized"));
            ret.append("\n - Probe.notes = ").append((notes_is_initialized ? ("[" + (notes == null ? null : notes) + "]") : "not initialized"));
            ret.append("\n - Probe.supplierName = ").append((supplierName_is_initialized ? ("[" + (supplierName == null ? null : supplierName) + "]") : "not initialized"));
            ret.append("\n - Probe.supplierAddress = ").append((supplierAddress_is_initialized ? ("[" + (supplierAddress == null ? null : supplierAddress) + "]") : "not initialized"));
            ret.append("\n - Probe.supplierUrl = ").append((supplierUrl_is_initialized ? ("[" + (supplierUrl == null ? null : supplierUrl) + "]") : "not initialized"));
            ret.append("\n - Probe.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Probe.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Probe.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Probe.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Probe\">\n");
        ret.append("    <column name=\"_Probe_key\"\n");
        ret.append("            value=\"").append((ProbeKey_is_initialized ? ((ProbeKey == null ? null : ProbeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"name\"\n");
        ret.append("            value=\"").append((name_is_initialized ? ((name == null ? null : name)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"target\"\n");
        ret.append("            value=\"").append((target_is_initialized ? ((target == null ? null : target)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"counterstain\"\n");
        ret.append("            value=\"").append((counterstain_is_initialized ? ((counterstain == null ? null : counterstain)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"url\"\n");
        ret.append("            value=\"").append((url_is_initialized ? ((url == null ? null : url)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"type\"\n");
        ret.append("            value=\"").append((type_is_initialized ? ((type == null ? null : type)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"notes\"\n");
        ret.append("            value=\"").append((notes_is_initialized ? ((notes == null ? null : notes)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"supplierName\"\n");
        ret.append("            value=\"").append((supplierName_is_initialized ? ((supplierName == null ? null : supplierName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"supplierAddress\"\n");
        ret.append("            value=\"").append((supplierAddress_is_initialized ? ((supplierAddress == null ? null : supplierAddress)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"supplierUrl\"\n");
        ret.append("            value=\"").append((supplierUrl_is_initialized ? ((supplierUrl == null ? null : supplierUrl)) : "[not initialized]")).append("\"/>\n");
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
