
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AlleleMarkerAssocDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AlleleKeyOriginal;
    
    private Long AlleleKey;
    private boolean AlleleKey_is_modified = false;
    private boolean AlleleKey_is_initialized = false;
    
    private Long MarkerKeyOriginal;
    
    private Long MarkerKey;
    private boolean MarkerKey_is_modified = false;
    private boolean MarkerKey_is_initialized = false;
    
    private Long AlleleMarkerAssocTypeKeyOriginal;
    
    private Long AlleleMarkerAssocTypeKey;
    private boolean AlleleMarkerAssocTypeKey_is_modified = false;
    private boolean AlleleMarkerAssocTypeKey_is_initialized = false;
    
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
    AlleleMarkerAssocDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AlleleKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._Allele_key
     * <li> foreign key: Allele._Allele_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleKey
     */
    public Long getAlleleKeyOriginal() {
        return AlleleKeyOriginal; 
    }

    /**
     * Getter method for AlleleKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._Allele_key
     * <li> foreign key: Allele._Allele_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleKey
     */
    public Long getAlleleKey() {
        return AlleleKey; 
    }

    /**
     * Setter method for AlleleKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlleleKey
     */
    public void setAlleleKey(Long newVal) {
        if ((newVal != null && this.AlleleKey != null && (newVal.compareTo(this.AlleleKey) == 0)) || 
            (newVal == null && this.AlleleKey == null && AlleleKey_is_initialized)) {
            return; 
        } 

        if(this.AlleleKeyOriginal == null) {
            this.AlleleKeyOriginal = newVal;
        }
        this.AlleleKey = newVal; 

        AlleleKey_is_modified = true; 
        AlleleKey_is_initialized = true; 
    }

    /**
     * Setter method for AlleleKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlleleKey
     */
    public void setAlleleKey(long newVal) {
        setAlleleKey(new Long(newVal));
    }

    /**
     * Determines if the AlleleKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlleleKeyModified() {
        return AlleleKey_is_modified; 
    }

    /**
     * Determines if the AlleleKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlleleKeyInitialized() {
        return AlleleKey_is_initialized; 
    }

    /**
     * Getter method for MarkerKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._Marker_key
     * <li> foreign key: Marker._Marker_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MarkerKey
     */
    public Long getMarkerKeyOriginal() {
        return MarkerKeyOriginal; 
    }

    /**
     * Getter method for MarkerKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._Marker_key
     * <li> foreign key: Marker._Marker_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MarkerKey
     */
    public Long getMarkerKey() {
        return MarkerKey; 
    }

    /**
     * Setter method for MarkerKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MarkerKey
     */
    public void setMarkerKey(Long newVal) {
        if ((newVal != null && this.MarkerKey != null && (newVal.compareTo(this.MarkerKey) == 0)) || 
            (newVal == null && this.MarkerKey == null && MarkerKey_is_initialized)) {
            return; 
        } 

        if(this.MarkerKeyOriginal == null) {
            this.MarkerKeyOriginal = newVal;
        }
        this.MarkerKey = newVal; 

        MarkerKey_is_modified = true; 
        MarkerKey_is_initialized = true; 
    }

    /**
     * Setter method for MarkerKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MarkerKey
     */
    public void setMarkerKey(long newVal) {
        setMarkerKey(new Long(newVal));
    }

    /**
     * Determines if the MarkerKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMarkerKeyModified() {
        return MarkerKey_is_modified; 
    }

    /**
     * Determines if the MarkerKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMarkerKeyInitialized() {
        return MarkerKey_is_initialized; 
    }

    /**
     * Getter method for AlleleMarkerAssocTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._AlleleMarkerAssocType_key
     * <li> foreign key: AlleleMarkerAssocType._AlleleMarkerAssocType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleMarkerAssocTypeKey
     */
    public Long getAlleleMarkerAssocTypeKeyOriginal() {
        return AlleleMarkerAssocTypeKeyOriginal; 
    }

    /**
     * Getter method for AlleleMarkerAssocTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc._AlleleMarkerAssocType_key
     * <li> foreign key: AlleleMarkerAssocType._AlleleMarkerAssocType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleMarkerAssocTypeKey
     */
    public Long getAlleleMarkerAssocTypeKey() {
        return AlleleMarkerAssocTypeKey; 
    }

    /**
     * Setter method for AlleleMarkerAssocTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlleleMarkerAssocTypeKey
     */
    public void setAlleleMarkerAssocTypeKey(Long newVal) {
        if ((newVal != null && this.AlleleMarkerAssocTypeKey != null && (newVal.compareTo(this.AlleleMarkerAssocTypeKey) == 0)) || 
            (newVal == null && this.AlleleMarkerAssocTypeKey == null && AlleleMarkerAssocTypeKey_is_initialized)) {
            return; 
        } 

        if(this.AlleleMarkerAssocTypeKeyOriginal == null) {
            this.AlleleMarkerAssocTypeKeyOriginal = newVal;
        }
        this.AlleleMarkerAssocTypeKey = newVal; 

        AlleleMarkerAssocTypeKey_is_modified = true; 
        AlleleMarkerAssocTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for AlleleMarkerAssocTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlleleMarkerAssocTypeKey
     */
    public void setAlleleMarkerAssocTypeKey(long newVal) {
        setAlleleMarkerAssocTypeKey(new Long(newVal));
    }

    /**
     * Determines if the AlleleMarkerAssocTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlleleMarkerAssocTypeKeyModified() {
        return AlleleMarkerAssocTypeKey_is_modified; 
    }

    /**
     * Determines if the AlleleMarkerAssocTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlleleMarkerAssocTypeKeyInitialized() {
        return AlleleMarkerAssocTypeKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleMarkerAssoc.create_user
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
     * <li>full name: AlleleMarkerAssoc.create_date
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
     * <li>full name: AlleleMarkerAssoc.update_user
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
     * <li>full name: AlleleMarkerAssoc.update_date
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
        return AlleleKey_is_modified || 
     MarkerKey_is_modified || 
     AlleleMarkerAssocTypeKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AlleleKey_is_modified = false;
        MarkerKey_is_modified = false;
        AlleleMarkerAssocTypeKey_is_modified = false;
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
    public void copy(AlleleMarkerAssocDTO bean) {
        setAlleleKey(bean.getAlleleKey());
        setMarkerKey(bean.getMarkerKey());
        setAlleleMarkerAssocTypeKey(bean.getAlleleMarkerAssocTypeKey());
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
            ret.append("\n[AlleleMarkerAssoc] ");
            ret.append("\n - AlleleMarkerAssoc._Allele_key = ").append((AlleleKey_is_initialized ? ("[" + (AlleleKey == null ? null : AlleleKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc._Marker_key = ").append((MarkerKey_is_initialized ? ("[" + (MarkerKey == null ? null : MarkerKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc._AlleleMarkerAssocType_key = ").append((AlleleMarkerAssocTypeKey_is_initialized ? ("[" + (AlleleMarkerAssocTypeKey == null ? null : AlleleMarkerAssocTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - AlleleMarkerAssoc.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AlleleMarkerAssoc\">\n");
        ret.append("    <column name=\"_Allele_key\"\n");
        ret.append("            value=\"").append((AlleleKey_is_initialized ? ((AlleleKey == null ? null : AlleleKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Marker_key\"\n");
        ret.append("            value=\"").append((MarkerKey_is_initialized ? ((MarkerKey == null ? null : MarkerKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_AlleleMarkerAssocType_key\"\n");
        ret.append("            value=\"").append((AlleleMarkerAssocTypeKey_is_initialized ? ((AlleleMarkerAssocTypeKey == null ? null : AlleleMarkerAssocTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
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
