
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AccessionDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AccessionKeyOriginal;
    
    private Long AccessionKey;
    private boolean AccessionKey_is_modified = false;
    private boolean AccessionKey_is_initialized = false;
    
    private String accID;
    private boolean accID_is_modified = false;
    private boolean accID_is_initialized = false;
    
    private String prefixPart;
    private boolean prefixPart_is_modified = false;
    private boolean prefixPart_is_initialized = false;
    
    private Long numericPart;
    private boolean numericPart_is_modified = false;
    private boolean numericPart_is_initialized = false;
    
    private Long ObjectKey;
    private boolean ObjectKey_is_modified = false;
    private boolean ObjectKey_is_initialized = false;
    
    private Long MTBTypesKey;
    private boolean MTBTypesKey_is_modified = false;
    private boolean MTBTypesKey_is_initialized = false;
    
    private Long SiteInfoKey;
    private boolean SiteInfoKey_is_modified = false;
    private boolean SiteInfoKey_is_initialized = false;
    
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
    AccessionDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AccessionKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession._Accession_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AccessionKey
     */
    public Long getAccessionKeyOriginal() {
        return AccessionKeyOriginal; 
    }

    /**
     * Getter method for AccessionKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession._Accession_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AccessionKey
     */
    public Long getAccessionKey() {
        return AccessionKey; 
    }

    /**
     * Setter method for AccessionKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AccessionKey
     */
    public void setAccessionKey(Long newVal) {
        if ((newVal != null && this.AccessionKey != null && (newVal.compareTo(this.AccessionKey) == 0)) || 
            (newVal == null && this.AccessionKey == null && AccessionKey_is_initialized)) {
            return; 
        } 

        if(this.AccessionKeyOriginal == null) {
            this.AccessionKeyOriginal = newVal;
        }
        this.AccessionKey = newVal; 

        AccessionKey_is_modified = true; 
        AccessionKey_is_initialized = true; 
    }

    /**
     * Setter method for AccessionKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AccessionKey
     */
    public void setAccessionKey(long newVal) {
        setAccessionKey(new Long(newVal));
    }

    /**
     * Determines if the AccessionKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAccessionKeyModified() {
        return AccessionKey_is_modified; 
    }

    /**
     * Determines if the AccessionKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAccessionKeyInitialized() {
        return AccessionKey_is_initialized; 
    }

    /**
     * Getter method for accID.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession.accID
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of accID
     */
    public String getAccID() {
        return accID; 
    }

    /**
     * Setter method for accID.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to accID
     */
    public void setAccID(String newVal) {
        if ((newVal != null && this.accID != null && (newVal.compareTo(this.accID) == 0)) || 
            (newVal == null && this.accID == null && accID_is_initialized)) {
            return; 
        } 
        this.accID = newVal; 

        accID_is_modified = true; 
        accID_is_initialized = true; 
    }

    /**
     * Determines if the accID has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAccIDModified() {
        return accID_is_modified; 
    }

    /**
     * Determines if the accID has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAccIDInitialized() {
        return accID_is_initialized; 
    }

    /**
     * Getter method for prefixPart.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession.prefixPart
     * <li>column size: 25
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of prefixPart
     */
    public String getPrefixPart() {
        return prefixPart; 
    }

    /**
     * Setter method for prefixPart.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to prefixPart
     */
    public void setPrefixPart(String newVal) {
        if ((newVal != null && this.prefixPart != null && (newVal.compareTo(this.prefixPart) == 0)) || 
            (newVal == null && this.prefixPart == null && prefixPart_is_initialized)) {
            return; 
        } 
        this.prefixPart = newVal; 

        prefixPart_is_modified = true; 
        prefixPart_is_initialized = true; 
    }

    /**
     * Determines if the prefixPart has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPrefixPartModified() {
        return prefixPart_is_modified; 
    }

    /**
     * Determines if the prefixPart has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPrefixPartInitialized() {
        return prefixPart_is_initialized; 
    }

    /**
     * Getter method for numericPart.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession.numericPart
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of numericPart
     */
    public Long getNumericPart() {
        return numericPart; 
    }

    /**
     * Setter method for numericPart.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to numericPart
     */
    public void setNumericPart(Long newVal) {
        if ((newVal != null && this.numericPart != null && (newVal.compareTo(this.numericPart) == 0)) || 
            (newVal == null && this.numericPart == null && numericPart_is_initialized)) {
            return; 
        } 
        this.numericPart = newVal; 

        numericPart_is_modified = true; 
        numericPart_is_initialized = true; 
    }

    /**
     * Setter method for numericPart.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to numericPart
     */
    public void setNumericPart(long newVal) {
        setNumericPart(new Long(newVal));
    }

    /**
     * Determines if the numericPart has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNumericPartModified() {
        return numericPart_is_modified; 
    }

    /**
     * Determines if the numericPart has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNumericPartInitialized() {
        return numericPart_is_initialized; 
    }

    /**
     * Getter method for ObjectKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession._Object_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ObjectKey
     */
    public Long getObjectKey() {
        return ObjectKey; 
    }

    /**
     * Setter method for ObjectKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ObjectKey
     */
    public void setObjectKey(Long newVal) {
        if ((newVal != null && this.ObjectKey != null && (newVal.compareTo(this.ObjectKey) == 0)) || 
            (newVal == null && this.ObjectKey == null && ObjectKey_is_initialized)) {
            return; 
        } 
        this.ObjectKey = newVal; 

        ObjectKey_is_modified = true; 
        ObjectKey_is_initialized = true; 
    }

    /**
     * Setter method for ObjectKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ObjectKey
     */
    public void setObjectKey(long newVal) {
        setObjectKey(new Long(newVal));
    }

    /**
     * Determines if the ObjectKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isObjectKeyModified() {
        return ObjectKey_is_modified; 
    }

    /**
     * Determines if the ObjectKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isObjectKeyInitialized() {
        return ObjectKey_is_initialized; 
    }

    /**
     * Getter method for MTBTypesKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession._MTBTypes_key
     * <li> foreign key: MTBTypes._MTBTypes_key
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
     * Getter method for SiteInfoKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession._SiteInfo_key
     * <li> foreign key: SiteInfo._SiteInfo_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of SiteInfoKey
     */
    public Long getSiteInfoKey() {
        return SiteInfoKey; 
    }

    /**
     * Setter method for SiteInfoKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to SiteInfoKey
     */
    public void setSiteInfoKey(Long newVal) {
        if ((newVal != null && this.SiteInfoKey != null && (newVal.compareTo(this.SiteInfoKey) == 0)) || 
            (newVal == null && this.SiteInfoKey == null && SiteInfoKey_is_initialized)) {
            return; 
        } 
        this.SiteInfoKey = newVal; 

        SiteInfoKey_is_modified = true; 
        SiteInfoKey_is_initialized = true; 
    }

    /**
     * Setter method for SiteInfoKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to SiteInfoKey
     */
    public void setSiteInfoKey(long newVal) {
        setSiteInfoKey(new Long(newVal));
    }

    /**
     * Determines if the SiteInfoKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSiteInfoKeyModified() {
        return SiteInfoKey_is_modified; 
    }

    /**
     * Determines if the SiteInfoKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSiteInfoKeyInitialized() {
        return SiteInfoKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Accession.create_user
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
     * <li>full name: Accession.create_date
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
     * <li>full name: Accession.update_user
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
     * <li>full name: Accession.update_date
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
        return AccessionKey_is_modified || 
     accID_is_modified || 
     prefixPart_is_modified || 
     numericPart_is_modified || 
     ObjectKey_is_modified || 
     MTBTypesKey_is_modified || 
     SiteInfoKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AccessionKey_is_modified = false;
        accID_is_modified = false;
        prefixPart_is_modified = false;
        numericPart_is_modified = false;
        ObjectKey_is_modified = false;
        MTBTypesKey_is_modified = false;
        SiteInfoKey_is_modified = false;
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
    public void copy(AccessionDTO bean) {
        setAccessionKey(bean.getAccessionKey());
        setAccID(bean.getAccID());
        setPrefixPart(bean.getPrefixPart());
        setNumericPart(bean.getNumericPart());
        setObjectKey(bean.getObjectKey());
        setMTBTypesKey(bean.getMTBTypesKey());
        setSiteInfoKey(bean.getSiteInfoKey());
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
            ret.append("\n[Accession] ");
            ret.append("\n - Accession._Accession_key = ").append((AccessionKey_is_initialized ? ("[" + (AccessionKey == null ? null : AccessionKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession.accID = ").append((accID_is_initialized ? ("[" + (accID == null ? null : accID) + "]") : "not initialized"));
            ret.append("\n - Accession.prefixPart = ").append((prefixPart_is_initialized ? ("[" + (prefixPart == null ? null : prefixPart) + "]") : "not initialized"));
            ret.append("\n - Accession.numericPart = ").append((numericPart_is_initialized ? ("[" + (numericPart == null ? null : numericPart.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession._Object_key = ").append((ObjectKey_is_initialized ? ("[" + (ObjectKey == null ? null : ObjectKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession._MTBTypes_key = ").append((MTBTypesKey_is_initialized ? ("[" + (MTBTypesKey == null ? null : MTBTypesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession._SiteInfo_key = ").append((SiteInfoKey_is_initialized ? ("[" + (SiteInfoKey == null ? null : SiteInfoKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Accession.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Accession.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Accession.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Accession\">\n");
        ret.append("    <column name=\"_Accession_key\"\n");
        ret.append("            value=\"").append((AccessionKey_is_initialized ? ((AccessionKey == null ? null : AccessionKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"accID\"\n");
        ret.append("            value=\"").append((accID_is_initialized ? ((accID == null ? null : accID)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"prefixPart\"\n");
        ret.append("            value=\"").append((prefixPart_is_initialized ? ((prefixPart == null ? null : prefixPart)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"numericPart\"\n");
        ret.append("            value=\"").append((numericPart_is_initialized ? ((numericPart == null ? null : numericPart.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Object_key\"\n");
        ret.append("            value=\"").append((ObjectKey_is_initialized ? ((ObjectKey == null ? null : ObjectKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBTypes_key\"\n");
        ret.append("            value=\"").append((MTBTypesKey_is_initialized ? ((MTBTypesKey == null ? null : MTBTypesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_SiteInfo_key\"\n");
        ret.append("            value=\"").append((SiteInfoKey_is_initialized ? ((SiteInfoKey == null ? null : SiteInfoKey.toString())) : "[not initialized]")).append("\"/>\n");
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
