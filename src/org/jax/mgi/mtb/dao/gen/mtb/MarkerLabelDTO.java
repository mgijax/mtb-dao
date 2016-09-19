
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class MarkerLabelDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long MarkerLabelKeyOriginal;
    
    private Long MarkerLabelKey;
    private boolean MarkerLabelKey_is_modified = false;
    private boolean MarkerLabelKey_is_initialized = false;
    
    private Long MarkerKey;
    private boolean MarkerKey_is_modified = false;
    private boolean MarkerKey_is_initialized = false;
    
    private String LabelTypeKey;
    private boolean LabelTypeKey_is_modified = false;
    private boolean LabelTypeKey_is_initialized = false;
    
    private String label;
    private boolean label_is_modified = false;
    private boolean label_is_initialized = false;
    
    private Long LabelStatusKey;
    private boolean LabelStatusKey_is_modified = false;
    private boolean LabelStatusKey_is_initialized = false;
    
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
    MarkerLabelDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for MarkerLabelKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel._MarkerLabel_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MarkerLabelKey
     */
    public Long getMarkerLabelKeyOriginal() {
        return MarkerLabelKeyOriginal; 
    }

    /**
     * Getter method for MarkerLabelKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel._MarkerLabel_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MarkerLabelKey
     */
    public Long getMarkerLabelKey() {
        return MarkerLabelKey; 
    }

    /**
     * Setter method for MarkerLabelKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MarkerLabelKey
     */
    public void setMarkerLabelKey(Long newVal) {
        if ((newVal != null && this.MarkerLabelKey != null && (newVal.compareTo(this.MarkerLabelKey) == 0)) || 
            (newVal == null && this.MarkerLabelKey == null && MarkerLabelKey_is_initialized)) {
            return; 
        } 

        if(this.MarkerLabelKeyOriginal == null) {
            this.MarkerLabelKeyOriginal = newVal;
        }
        this.MarkerLabelKey = newVal; 

        MarkerLabelKey_is_modified = true; 
        MarkerLabelKey_is_initialized = true; 
    }

    /**
     * Setter method for MarkerLabelKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MarkerLabelKey
     */
    public void setMarkerLabelKey(long newVal) {
        setMarkerLabelKey(new Long(newVal));
    }

    /**
     * Determines if the MarkerLabelKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMarkerLabelKeyModified() {
        return MarkerLabelKey_is_modified; 
    }

    /**
     * Determines if the MarkerLabelKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMarkerLabelKeyInitialized() {
        return MarkerLabelKey_is_initialized; 
    }

    /**
     * Getter method for MarkerKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel._Marker_key
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
     * Getter method for LabelTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel._LabelType_key
     * <li> foreign key: LabelType._LabelType_key
     * <li>column size: 2
     * <li>jdbc type returned by the driver: Types.CHAR
     * </ul>
     *
     * @return the value of LabelTypeKey
     */
    public String getLabelTypeKey() {
        return LabelTypeKey; 
    }

    /**
     * Setter method for LabelTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to LabelTypeKey
     */
    public void setLabelTypeKey(String newVal) {
        if ((newVal != null && this.LabelTypeKey != null && (newVal.compareTo(this.LabelTypeKey) == 0)) || 
            (newVal == null && this.LabelTypeKey == null && LabelTypeKey_is_initialized)) {
            return; 
        } 
        this.LabelTypeKey = newVal; 

        LabelTypeKey_is_modified = true; 
        LabelTypeKey_is_initialized = true; 
    }

    /**
     * Determines if the LabelTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isLabelTypeKeyModified() {
        return LabelTypeKey_is_modified; 
    }

    /**
     * Determines if the LabelTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isLabelTypeKeyInitialized() {
        return LabelTypeKey_is_initialized; 
    }

    /**
     * Getter method for label.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel.label
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of label
     */
    public String getLabel() {
        return label; 
    }

    /**
     * Setter method for label.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to label
     */
    public void setLabel(String newVal) {
        if ((newVal != null && this.label != null && (newVal.compareTo(this.label) == 0)) || 
            (newVal == null && this.label == null && label_is_initialized)) {
            return; 
        } 
        this.label = newVal; 

        label_is_modified = true; 
        label_is_initialized = true; 
    }

    /**
     * Determines if the label has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isLabelModified() {
        return label_is_modified; 
    }

    /**
     * Determines if the label has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isLabelInitialized() {
        return label_is_initialized; 
    }

    /**
     * Getter method for LabelStatusKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel._LabelStatus_key
     * <li> foreign key: LabelStatus._LabelStatus_key
     * <li>column size: 1
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of LabelStatusKey
     */
    public Long getLabelStatusKey() {
        return LabelStatusKey; 
    }

    /**
     * Setter method for LabelStatusKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to LabelStatusKey
     */
    public void setLabelStatusKey(Long newVal) {
        if ((newVal != null && this.LabelStatusKey != null && (newVal.compareTo(this.LabelStatusKey) == 0)) || 
            (newVal == null && this.LabelStatusKey == null && LabelStatusKey_is_initialized)) {
            return; 
        } 
        this.LabelStatusKey = newVal; 

        LabelStatusKey_is_modified = true; 
        LabelStatusKey_is_initialized = true; 
    }

    /**
     * Setter method for LabelStatusKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to LabelStatusKey
     */
    public void setLabelStatusKey(long newVal) {
        setLabelStatusKey(new Long(newVal));
    }

    /**
     * Determines if the LabelStatusKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isLabelStatusKeyModified() {
        return LabelStatusKey_is_modified; 
    }

    /**
     * Determines if the LabelStatusKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isLabelStatusKeyInitialized() {
        return LabelStatusKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MarkerLabel.create_user
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
     * <li>full name: MarkerLabel.create_date
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
     * <li>full name: MarkerLabel.update_user
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
     * <li>full name: MarkerLabel.update_date
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
        return MarkerLabelKey_is_modified || 
     MarkerKey_is_modified || 
     LabelTypeKey_is_modified || 
     label_is_modified || 
     LabelStatusKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        MarkerLabelKey_is_modified = false;
        MarkerKey_is_modified = false;
        LabelTypeKey_is_modified = false;
        label_is_modified = false;
        LabelStatusKey_is_modified = false;
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
    public void copy(MarkerLabelDTO bean) {
        setMarkerLabelKey(bean.getMarkerLabelKey());
        setMarkerKey(bean.getMarkerKey());
        setLabelTypeKey(bean.getLabelTypeKey());
        setLabel(bean.getLabel());
        setLabelStatusKey(bean.getLabelStatusKey());
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
            ret.append("\n[MarkerLabel] ");
            ret.append("\n - MarkerLabel._MarkerLabel_key = ").append((MarkerLabelKey_is_initialized ? ("[" + (MarkerLabelKey == null ? null : MarkerLabelKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel._Marker_key = ").append((MarkerKey_is_initialized ? ("[" + (MarkerKey == null ? null : MarkerKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel._LabelType_key = ").append((LabelTypeKey_is_initialized ? ("[" + (LabelTypeKey == null ? null : LabelTypeKey) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel.label = ").append((label_is_initialized ? ("[" + (label == null ? null : label) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel._LabelStatus_key = ").append((LabelStatusKey_is_initialized ? ("[" + (LabelStatusKey == null ? null : LabelStatusKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - MarkerLabel.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"MarkerLabel\">\n");
        ret.append("    <column name=\"_MarkerLabel_key\"\n");
        ret.append("            value=\"").append((MarkerLabelKey_is_initialized ? ((MarkerLabelKey == null ? null : MarkerLabelKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Marker_key\"\n");
        ret.append("            value=\"").append((MarkerKey_is_initialized ? ((MarkerKey == null ? null : MarkerKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_LabelType_key\"\n");
        ret.append("            value=\"").append((LabelTypeKey_is_initialized ? ((LabelTypeKey == null ? null : LabelTypeKey)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"label\"\n");
        ret.append("            value=\"").append((label_is_initialized ? ((label == null ? null : label)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_LabelStatus_key\"\n");
        ret.append("            value=\"").append((LabelStatusKey_is_initialized ? ((LabelStatusKey == null ? null : LabelStatusKey.toString())) : "[not initialized]")).append("\"/>\n");
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
