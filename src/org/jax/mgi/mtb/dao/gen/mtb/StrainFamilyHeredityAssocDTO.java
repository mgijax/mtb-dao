
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class StrainFamilyHeredityAssocDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long StrainFamilyKeyOriginal;
    
    private Long StrainFamilyKey;
    private boolean StrainFamilyKey_is_modified = false;
    private boolean StrainFamilyKey_is_initialized = false;
    
    private Long StrainHeredityKeyOriginal;
    
    private Long StrainHeredityKey;
    private boolean StrainHeredityKey_is_modified = false;
    private boolean StrainHeredityKey_is_initialized = false;
    
    private String description;
    private boolean description_is_modified = false;
    private boolean description_is_initialized = false;
    
    private Long ordering;
    private boolean ordering_is_modified = false;
    private boolean ordering_is_initialized = false;
    
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
    StrainFamilyHeredityAssocDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for StrainFamilyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc._StrainFamily_key
     * <li> foreign key: StrainFamily._StrainFamily_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainFamilyKey
     */
    public Long getStrainFamilyKeyOriginal() {
        return StrainFamilyKeyOriginal; 
    }

    /**
     * Getter method for StrainFamilyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc._StrainFamily_key
     * <li> foreign key: StrainFamily._StrainFamily_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainFamilyKey
     */
    public Long getStrainFamilyKey() {
        return StrainFamilyKey; 
    }

    /**
     * Setter method for StrainFamilyKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to StrainFamilyKey
     */
    public void setStrainFamilyKey(Long newVal) {
        if ((newVal != null && this.StrainFamilyKey != null && (newVal.compareTo(this.StrainFamilyKey) == 0)) || 
            (newVal == null && this.StrainFamilyKey == null && StrainFamilyKey_is_initialized)) {
            return; 
        } 

        if(this.StrainFamilyKeyOriginal == null) {
            this.StrainFamilyKeyOriginal = newVal;
        }
        this.StrainFamilyKey = newVal; 

        StrainFamilyKey_is_modified = true; 
        StrainFamilyKey_is_initialized = true; 
    }

    /**
     * Setter method for StrainFamilyKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to StrainFamilyKey
     */
    public void setStrainFamilyKey(long newVal) {
        setStrainFamilyKey(new Long(newVal));
    }

    /**
     * Determines if the StrainFamilyKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStrainFamilyKeyModified() {
        return StrainFamilyKey_is_modified; 
    }

    /**
     * Determines if the StrainFamilyKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStrainFamilyKeyInitialized() {
        return StrainFamilyKey_is_initialized; 
    }

    /**
     * Getter method for StrainHeredityKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc._StrainHeredity_key
     * <li> foreign key: StrainHeredity._StrainHeredity_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainHeredityKey
     */
    public Long getStrainHeredityKeyOriginal() {
        return StrainHeredityKeyOriginal; 
    }

    /**
     * Getter method for StrainHeredityKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc._StrainHeredity_key
     * <li> foreign key: StrainHeredity._StrainHeredity_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainHeredityKey
     */
    public Long getStrainHeredityKey() {
        return StrainHeredityKey; 
    }

    /**
     * Setter method for StrainHeredityKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to StrainHeredityKey
     */
    public void setStrainHeredityKey(Long newVal) {
        if ((newVal != null && this.StrainHeredityKey != null && (newVal.compareTo(this.StrainHeredityKey) == 0)) || 
            (newVal == null && this.StrainHeredityKey == null && StrainHeredityKey_is_initialized)) {
            return; 
        } 

        if(this.StrainHeredityKeyOriginal == null) {
            this.StrainHeredityKeyOriginal = newVal;
        }
        this.StrainHeredityKey = newVal; 

        StrainHeredityKey_is_modified = true; 
        StrainHeredityKey_is_initialized = true; 
    }

    /**
     * Setter method for StrainHeredityKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to StrainHeredityKey
     */
    public void setStrainHeredityKey(long newVal) {
        setStrainHeredityKey(new Long(newVal));
    }

    /**
     * Determines if the StrainHeredityKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStrainHeredityKeyModified() {
        return StrainHeredityKey_is_modified; 
    }

    /**
     * Determines if the StrainHeredityKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStrainHeredityKeyInitialized() {
        return StrainHeredityKey_is_initialized; 
    }

    /**
     * Getter method for description.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc.description
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
     * Getter method for ordering.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc.ordering
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ordering
     */
    public Long getOrdering() {
        return ordering; 
    }

    /**
     * Setter method for ordering.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ordering
     */
    public void setOrdering(Long newVal) {
        if ((newVal != null && this.ordering != null && (newVal.compareTo(this.ordering) == 0)) || 
            (newVal == null && this.ordering == null && ordering_is_initialized)) {
            return; 
        } 
        this.ordering = newVal; 

        ordering_is_modified = true; 
        ordering_is_initialized = true; 
    }

    /**
     * Setter method for ordering.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ordering
     */
    public void setOrdering(long newVal) {
        setOrdering(new Long(newVal));
    }

    /**
     * Determines if the ordering has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOrderingModified() {
        return ordering_is_modified; 
    }

    /**
     * Determines if the ordering has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOrderingInitialized() {
        return ordering_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: StrainFamilyHeredityAssoc.create_user
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
     * <li>full name: StrainFamilyHeredityAssoc.create_date
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
     * <li>full name: StrainFamilyHeredityAssoc.update_user
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
     * <li>full name: StrainFamilyHeredityAssoc.update_date
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
        return StrainFamilyKey_is_modified || 
     StrainHeredityKey_is_modified || 
     description_is_modified || 
     ordering_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        StrainFamilyKey_is_modified = false;
        StrainHeredityKey_is_modified = false;
        description_is_modified = false;
        ordering_is_modified = false;
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
    public void copy(StrainFamilyHeredityAssocDTO bean) {
        setStrainFamilyKey(bean.getStrainFamilyKey());
        setStrainHeredityKey(bean.getStrainHeredityKey());
        setDescription(bean.getDescription());
        setOrdering(bean.getOrdering());
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
            ret.append("\n[StrainFamilyHeredityAssoc] ");
            ret.append("\n - StrainFamilyHeredityAssoc._StrainFamily_key = ").append((StrainFamilyKey_is_initialized ? ("[" + (StrainFamilyKey == null ? null : StrainFamilyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc._StrainHeredity_key = ").append((StrainHeredityKey_is_initialized ? ("[" + (StrainHeredityKey == null ? null : StrainHeredityKey.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.description = ").append((description_is_initialized ? ("[" + (description == null ? null : description) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.ordering = ").append((ordering_is_initialized ? ("[" + (ordering == null ? null : ordering.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - StrainFamilyHeredityAssoc.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"StrainFamilyHeredityAssoc\">\n");
        ret.append("    <column name=\"_StrainFamily_key\"\n");
        ret.append("            value=\"").append((StrainFamilyKey_is_initialized ? ((StrainFamilyKey == null ? null : StrainFamilyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_StrainHeredity_key\"\n");
        ret.append("            value=\"").append((StrainHeredityKey_is_initialized ? ((StrainHeredityKey == null ? null : StrainHeredityKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"description\"\n");
        ret.append("            value=\"").append((description_is_initialized ? ((description == null ? null : description)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"ordering\"\n");
        ret.append("            value=\"").append((ordering_is_initialized ? ((ordering == null ? null : ordering.toString())) : "[not initialized]")).append("\"/>\n");
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
