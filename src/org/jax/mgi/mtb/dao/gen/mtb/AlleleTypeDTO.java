
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AlleleTypeDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AlleleTypeKeyOriginal;
    
    private Long AlleleTypeKey;
    private boolean AlleleTypeKey_is_modified = false;
    private boolean AlleleTypeKey_is_initialized = false;
    
    private Long AlleleGroupTypeKey;
    private boolean AlleleGroupTypeKey_is_modified = false;
    private boolean AlleleGroupTypeKey_is_initialized = false;
    
    private String type;
    private boolean type_is_modified = false;
    private boolean type_is_initialized = false;
    
    private Long sortOrder;
    private boolean sortOrder_is_modified = false;
    private boolean sortOrder_is_initialized = false;
    
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
    AlleleTypeDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AlleleTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType._AlleleType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleTypeKey
     */
    public Long getAlleleTypeKeyOriginal() {
        return AlleleTypeKeyOriginal; 
    }

    /**
     * Getter method for AlleleTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType._AlleleType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleTypeKey
     */
    public Long getAlleleTypeKey() {
        return AlleleTypeKey; 
    }

    /**
     * Setter method for AlleleTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlleleTypeKey
     */
    public void setAlleleTypeKey(Long newVal) {
        if ((newVal != null && this.AlleleTypeKey != null && (newVal.compareTo(this.AlleleTypeKey) == 0)) || 
            (newVal == null && this.AlleleTypeKey == null && AlleleTypeKey_is_initialized)) {
            return; 
        } 

        if(this.AlleleTypeKeyOriginal == null) {
            this.AlleleTypeKeyOriginal = newVal;
        }
        this.AlleleTypeKey = newVal; 

        AlleleTypeKey_is_modified = true; 
        AlleleTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for AlleleTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlleleTypeKey
     */
    public void setAlleleTypeKey(long newVal) {
        setAlleleTypeKey(new Long(newVal));
    }

    /**
     * Determines if the AlleleTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlleleTypeKeyModified() {
        return AlleleTypeKey_is_modified; 
    }

    /**
     * Determines if the AlleleTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlleleTypeKeyInitialized() {
        return AlleleTypeKey_is_initialized; 
    }

    /**
     * Getter method for AlleleGroupTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType._AlleleGroupType_key
     * <li> foreign key: AlleleGroupType._AlleleGroupType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlleleGroupTypeKey
     */
    public Long getAlleleGroupTypeKey() {
        return AlleleGroupTypeKey; 
    }

    /**
     * Setter method for AlleleGroupTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlleleGroupTypeKey
     */
    public void setAlleleGroupTypeKey(Long newVal) {
        if ((newVal != null && this.AlleleGroupTypeKey != null && (newVal.compareTo(this.AlleleGroupTypeKey) == 0)) || 
            (newVal == null && this.AlleleGroupTypeKey == null && AlleleGroupTypeKey_is_initialized)) {
            return; 
        } 
        this.AlleleGroupTypeKey = newVal; 

        AlleleGroupTypeKey_is_modified = true; 
        AlleleGroupTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for AlleleGroupTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlleleGroupTypeKey
     */
    public void setAlleleGroupTypeKey(long newVal) {
        setAlleleGroupTypeKey(new Long(newVal));
    }

    /**
     * Determines if the AlleleGroupTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlleleGroupTypeKeyModified() {
        return AlleleGroupTypeKey_is_modified; 
    }

    /**
     * Determines if the AlleleGroupTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlleleGroupTypeKeyInitialized() {
        return AlleleGroupTypeKey_is_initialized; 
    }

    /**
     * Getter method for type.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType.type
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
     * Getter method for sortOrder.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType.sortOrder
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of sortOrder
     */
    public Long getSortOrder() {
        return sortOrder; 
    }

    /**
     * Setter method for sortOrder.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to sortOrder
     */
    public void setSortOrder(Long newVal) {
        if ((newVal != null && this.sortOrder != null && (newVal.compareTo(this.sortOrder) == 0)) || 
            (newVal == null && this.sortOrder == null && sortOrder_is_initialized)) {
            return; 
        } 
        this.sortOrder = newVal; 

        sortOrder_is_modified = true; 
        sortOrder_is_initialized = true; 
    }

    /**
     * Setter method for sortOrder.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sortOrder
     */
    public void setSortOrder(long newVal) {
        setSortOrder(new Long(newVal));
    }

    /**
     * Determines if the sortOrder has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSortOrderModified() {
        return sortOrder_is_modified; 
    }

    /**
     * Determines if the sortOrder has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSortOrderInitialized() {
        return sortOrder_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleType.create_user
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
     * <li>full name: AlleleType.create_date
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
     * <li>full name: AlleleType.update_user
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
     * <li>full name: AlleleType.update_date
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
        return AlleleTypeKey_is_modified || 
     AlleleGroupTypeKey_is_modified || 
     type_is_modified || 
     sortOrder_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AlleleTypeKey_is_modified = false;
        AlleleGroupTypeKey_is_modified = false;
        type_is_modified = false;
        sortOrder_is_modified = false;
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
    public void copy(AlleleTypeDTO bean) {
        setAlleleTypeKey(bean.getAlleleTypeKey());
        setAlleleGroupTypeKey(bean.getAlleleGroupTypeKey());
        setType(bean.getType());
        setSortOrder(bean.getSortOrder());
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
            ret.append("\n[AlleleType] ");
            ret.append("\n - AlleleType._AlleleType_key = ").append((AlleleTypeKey_is_initialized ? ("[" + (AlleleTypeKey == null ? null : AlleleTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleType._AlleleGroupType_key = ").append((AlleleGroupTypeKey_is_initialized ? ("[" + (AlleleGroupTypeKey == null ? null : AlleleGroupTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleType.type = ").append((type_is_initialized ? ("[" + (type == null ? null : type) + "]") : "not initialized"));
            ret.append("\n - AlleleType.sortOrder = ").append((sortOrder_is_initialized ? ("[" + (sortOrder == null ? null : sortOrder.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleType.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - AlleleType.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleType.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - AlleleType.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AlleleType\">\n");
        ret.append("    <column name=\"_AlleleType_key\"\n");
        ret.append("            value=\"").append((AlleleTypeKey_is_initialized ? ((AlleleTypeKey == null ? null : AlleleTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_AlleleGroupType_key\"\n");
        ret.append("            value=\"").append((AlleleGroupTypeKey_is_initialized ? ((AlleleGroupTypeKey == null ? null : AlleleGroupTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"type\"\n");
        ret.append("            value=\"").append((type_is_initialized ? ((type == null ? null : type)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"sortOrder\"\n");
        ret.append("            value=\"").append((sortOrder_is_initialized ? ((sortOrder == null ? null : sortOrder.toString())) : "[not initialized]")).append("\"/>\n");
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
