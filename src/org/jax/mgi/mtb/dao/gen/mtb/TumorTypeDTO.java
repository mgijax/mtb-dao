
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:39 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TumorTypeDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorTypeKeyOriginal;
    
    private Long TumorTypeKey;
    private boolean TumorTypeKey_is_modified = false;
    private boolean TumorTypeKey_is_initialized = false;
    
    private Long TumorClassificationKey;
    private boolean TumorClassificationKey_is_modified = false;
    private boolean TumorClassificationKey_is_initialized = false;
    
    private Long OrganKey;
    private boolean OrganKey_is_modified = false;
    private boolean OrganKey_is_initialized = false;
    
    private String commonName;
    private boolean commonName_is_modified = false;
    private boolean commonName_is_initialized = false;
    
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
    
    private Long consTtKey;
    private boolean consTtKey_is_modified = false;
    private boolean consTtKey_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    TumorTypeDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType._TumorType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorTypeKey
     */
    public Long getTumorTypeKeyOriginal() {
        return TumorTypeKeyOriginal; 
    }

    /**
     * Getter method for TumorTypeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType._TumorType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
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

        if(this.TumorTypeKeyOriginal == null) {
            this.TumorTypeKeyOriginal = newVal;
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
     * Getter method for TumorClassificationKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType._TumorClassification_key
     * <li> foreign key: TumorClassification._TumorClassification_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorClassificationKey
     */
    public Long getTumorClassificationKey() {
        return TumorClassificationKey; 
    }

    /**
     * Setter method for TumorClassificationKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorClassificationKey
     */
    public void setTumorClassificationKey(Long newVal) {
        if ((newVal != null && this.TumorClassificationKey != null && (newVal.compareTo(this.TumorClassificationKey) == 0)) || 
            (newVal == null && this.TumorClassificationKey == null && TumorClassificationKey_is_initialized)) {
            return; 
        } 
        this.TumorClassificationKey = newVal; 

        TumorClassificationKey_is_modified = true; 
        TumorClassificationKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorClassificationKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorClassificationKey
     */
    public void setTumorClassificationKey(long newVal) {
        setTumorClassificationKey(new Long(newVal));
    }

    /**
     * Determines if the TumorClassificationKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorClassificationKeyModified() {
        return TumorClassificationKey_is_modified; 
    }

    /**
     * Determines if the TumorClassificationKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorClassificationKeyInitialized() {
        return TumorClassificationKey_is_initialized; 
    }

    /**
     * Getter method for OrganKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType._Organ_key
     * <li> foreign key: Organ._Organ_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of OrganKey
     */
    public Long getOrganKey() {
        return OrganKey; 
    }

    /**
     * Setter method for OrganKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to OrganKey
     */
    public void setOrganKey(Long newVal) {
        if ((newVal != null && this.OrganKey != null && (newVal.compareTo(this.OrganKey) == 0)) || 
            (newVal == null && this.OrganKey == null && OrganKey_is_initialized)) {
            return; 
        } 
        this.OrganKey = newVal; 

        OrganKey_is_modified = true; 
        OrganKey_is_initialized = true; 
    }

    /**
     * Setter method for OrganKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to OrganKey
     */
    public void setOrganKey(long newVal) {
        setOrganKey(new Long(newVal));
    }

    /**
     * Determines if the OrganKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOrganKeyModified() {
        return OrganKey_is_modified; 
    }

    /**
     * Determines if the OrganKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOrganKeyInitialized() {
        return OrganKey_is_initialized; 
    }

    /**
     * Getter method for commonName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType.commonName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of commonName
     */
    public String getCommonName() {
        return commonName; 
    }

    /**
     * Setter method for commonName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to commonName
     */
    public void setCommonName(String newVal) {
        if ((newVal != null && this.commonName != null && (newVal.compareTo(this.commonName) == 0)) || 
            (newVal == null && this.commonName == null && commonName_is_initialized)) {
            return; 
        } 
        this.commonName = newVal; 

        commonName_is_modified = true; 
        commonName_is_initialized = true; 
    }

    /**
     * Determines if the commonName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCommonNameModified() {
        return commonName_is_modified; 
    }

    /**
     * Determines if the commonName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCommonNameInitialized() {
        return commonName_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType.create_user
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
     * <li>full name: TumorType.create_date
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
     * <li>full name: TumorType.update_user
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
     * <li>full name: TumorType.update_date
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
     * Getter method for consTtKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorType._cons_tt_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of consTtKey
     */
    public Long getConsTtKey() {
        return consTtKey; 
    }

    /**
     * Setter method for consTtKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to consTtKey
     */
    public void setConsTtKey(Long newVal) {
        if ((newVal != null && this.consTtKey != null && (newVal.compareTo(this.consTtKey) == 0)) || 
            (newVal == null && this.consTtKey == null && consTtKey_is_initialized)) {
            return; 
        } 
        this.consTtKey = newVal; 

        consTtKey_is_modified = true; 
        consTtKey_is_initialized = true; 
    }

    /**
     * Setter method for consTtKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to consTtKey
     */
    public void setConsTtKey(long newVal) {
        setConsTtKey(new Long(newVal));
    }

    /**
     * Determines if the consTtKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isConsTtKeyModified() {
        return consTtKey_is_modified; 
    }

    /**
     * Determines if the consTtKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isConsTtKeyInitialized() {
        return consTtKey_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return TumorTypeKey_is_modified || 
     TumorClassificationKey_is_modified || 
     OrganKey_is_modified || 
     commonName_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified || 
     consTtKey_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorTypeKey_is_modified = false;
        TumorClassificationKey_is_modified = false;
        OrganKey_is_modified = false;
        commonName_is_modified = false;
        createUser_is_modified = false;
        createDate_is_modified = false;
        updateUser_is_modified = false;
        updateDate_is_modified = false;
        consTtKey_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(TumorTypeDTO bean) {
        setTumorTypeKey(bean.getTumorTypeKey());
        setTumorClassificationKey(bean.getTumorClassificationKey());
        setOrganKey(bean.getOrganKey());
        setCommonName(bean.getCommonName());
        setCreateUser(bean.getCreateUser());
        setCreateDate(bean.getCreateDate());
        setUpdateUser(bean.getUpdateUser());
        setUpdateDate(bean.getUpdateDate());
        setConsTtKey(bean.getConsTtKey());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[TumorType] ");
            ret.append("\n - TumorType._TumorType_key = ").append((TumorTypeKey_is_initialized ? ("[" + (TumorTypeKey == null ? null : TumorTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorType._TumorClassification_key = ").append((TumorClassificationKey_is_initialized ? ("[" + (TumorClassificationKey == null ? null : TumorClassificationKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorType._Organ_key = ").append((OrganKey_is_initialized ? ("[" + (OrganKey == null ? null : OrganKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorType.commonName = ").append((commonName_is_initialized ? ("[" + (commonName == null ? null : commonName) + "]") : "not initialized"));
            ret.append("\n - TumorType.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TumorType.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorType.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TumorType.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorType._cons_tt_key = ").append((consTtKey_is_initialized ? ("[" + (consTtKey == null ? null : consTtKey.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TumorType\">\n");
        ret.append("    <column name=\"_TumorType_key\"\n");
        ret.append("            value=\"").append((TumorTypeKey_is_initialized ? ((TumorTypeKey == null ? null : TumorTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorClassification_key\"\n");
        ret.append("            value=\"").append((TumorClassificationKey_is_initialized ? ((TumorClassificationKey == null ? null : TumorClassificationKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Organ_key\"\n");
        ret.append("            value=\"").append((OrganKey_is_initialized ? ((OrganKey == null ? null : OrganKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"commonName\"\n");
        ret.append("            value=\"").append((commonName_is_initialized ? ((commonName == null ? null : commonName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_user\"\n");
        ret.append("            value=\"").append((createUser_is_initialized ? ((createUser == null ? null : createUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_date\"\n");
        ret.append("            value=\"").append((createDate_is_initialized ? ((createDate == null ? null : createDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_user\"\n");
        ret.append("            value=\"").append((updateUser_is_initialized ? ((updateUser == null ? null : updateUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_date\"\n");
        ret.append("            value=\"").append((updateDate_is_initialized ? ((updateDate == null ? null : updateDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_cons_tt_key\"\n");
        ret.append("            value=\"").append((consTtKey_is_initialized ? ((consTtKey == null ? null : consTtKey.toString())) : "[not initialized]")).append("\"/>\n");
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
