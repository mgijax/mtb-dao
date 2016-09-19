
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TumorFrequencyTreatmentsDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorFrequencyTreatmentsKeyOriginal;
    
    private Long TumorFrequencyTreatmentsKey;
    private boolean TumorFrequencyTreatmentsKey_is_modified = false;
    private boolean TumorFrequencyTreatmentsKey_is_initialized = false;
    
    private Long TumorFrequencyKey;
    private boolean TumorFrequencyKey_is_modified = false;
    private boolean TumorFrequencyKey_is_initialized = false;
    
    private Long AgentKey;
    private boolean AgentKey_is_modified = false;
    private boolean AgentKey_is_initialized = false;
    
    private Long dose;
    private boolean dose_is_modified = false;
    private boolean dose_is_initialized = false;
    
    private Long age;
    private boolean age_is_modified = false;
    private boolean age_is_initialized = false;
    
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
    TumorFrequencyTreatmentsDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorFrequencyTreatmentsKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments._TumorFrequencyTreatments_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyTreatmentsKey
     */
    public Long getTumorFrequencyTreatmentsKeyOriginal() {
        return TumorFrequencyTreatmentsKeyOriginal; 
    }

    /**
     * Getter method for TumorFrequencyTreatmentsKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments._TumorFrequencyTreatments_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyTreatmentsKey
     */
    public Long getTumorFrequencyTreatmentsKey() {
        return TumorFrequencyTreatmentsKey; 
    }

    /**
     * Setter method for TumorFrequencyTreatmentsKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorFrequencyTreatmentsKey
     */
    public void setTumorFrequencyTreatmentsKey(Long newVal) {
        if ((newVal != null && this.TumorFrequencyTreatmentsKey != null && (newVal.compareTo(this.TumorFrequencyTreatmentsKey) == 0)) || 
            (newVal == null && this.TumorFrequencyTreatmentsKey == null && TumorFrequencyTreatmentsKey_is_initialized)) {
            return; 
        } 

        if(this.TumorFrequencyTreatmentsKeyOriginal == null) {
            this.TumorFrequencyTreatmentsKeyOriginal = newVal;
        }
        this.TumorFrequencyTreatmentsKey = newVal; 

        TumorFrequencyTreatmentsKey_is_modified = true; 
        TumorFrequencyTreatmentsKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorFrequencyTreatmentsKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorFrequencyTreatmentsKey
     */
    public void setTumorFrequencyTreatmentsKey(long newVal) {
        setTumorFrequencyTreatmentsKey(new Long(newVal));
    }

    /**
     * Determines if the TumorFrequencyTreatmentsKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorFrequencyTreatmentsKeyModified() {
        return TumorFrequencyTreatmentsKey_is_modified; 
    }

    /**
     * Determines if the TumorFrequencyTreatmentsKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorFrequencyTreatmentsKeyInitialized() {
        return TumorFrequencyTreatmentsKey_is_initialized; 
    }

    /**
     * Getter method for TumorFrequencyKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments._TumorFrequency_key
     * <li> foreign key: TumorFrequency._TumorFrequency_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyKey
     */
    public Long getTumorFrequencyKey() {
        return TumorFrequencyKey; 
    }

    /**
     * Setter method for TumorFrequencyKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorFrequencyKey
     */
    public void setTumorFrequencyKey(Long newVal) {
        if ((newVal != null && this.TumorFrequencyKey != null && (newVal.compareTo(this.TumorFrequencyKey) == 0)) || 
            (newVal == null && this.TumorFrequencyKey == null && TumorFrequencyKey_is_initialized)) {
            return; 
        } 
        this.TumorFrequencyKey = newVal; 

        TumorFrequencyKey_is_modified = true; 
        TumorFrequencyKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorFrequencyKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorFrequencyKey
     */
    public void setTumorFrequencyKey(long newVal) {
        setTumorFrequencyKey(new Long(newVal));
    }

    /**
     * Determines if the TumorFrequencyKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorFrequencyKeyModified() {
        return TumorFrequencyKey_is_modified; 
    }

    /**
     * Determines if the TumorFrequencyKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorFrequencyKeyInitialized() {
        return TumorFrequencyKey_is_initialized; 
    }

    /**
     * Getter method for AgentKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments._Agent_key
     * <li> foreign key: Agent._Agent_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AgentKey
     */
    public Long getAgentKey() {
        return AgentKey; 
    }

    /**
     * Setter method for AgentKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AgentKey
     */
    public void setAgentKey(Long newVal) {
        if ((newVal != null && this.AgentKey != null && (newVal.compareTo(this.AgentKey) == 0)) || 
            (newVal == null && this.AgentKey == null && AgentKey_is_initialized)) {
            return; 
        } 
        this.AgentKey = newVal; 

        AgentKey_is_modified = true; 
        AgentKey_is_initialized = true; 
    }

    /**
     * Setter method for AgentKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AgentKey
     */
    public void setAgentKey(long newVal) {
        setAgentKey(new Long(newVal));
    }

    /**
     * Determines if the AgentKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAgentKeyModified() {
        return AgentKey_is_modified; 
    }

    /**
     * Determines if the AgentKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAgentKeyInitialized() {
        return AgentKey_is_initialized; 
    }

    /**
     * Getter method for dose.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments.dose
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of dose
     */
    public Long getDose() {
        return dose; 
    }

    /**
     * Setter method for dose.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to dose
     */
    public void setDose(Long newVal) {
        if ((newVal != null && this.dose != null && (newVal.compareTo(this.dose) == 0)) || 
            (newVal == null && this.dose == null && dose_is_initialized)) {
            return; 
        } 
        this.dose = newVal; 

        dose_is_modified = true; 
        dose_is_initialized = true; 
    }

    /**
     * Setter method for dose.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to dose
     */
    public void setDose(long newVal) {
        setDose(new Long(newVal));
    }

    /**
     * Determines if the dose has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDoseModified() {
        return dose_is_modified; 
    }

    /**
     * Determines if the dose has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDoseInitialized() {
        return dose_is_initialized; 
    }

    /**
     * Getter method for age.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments.age
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of age
     */
    public Long getAge() {
        return age; 
    }

    /**
     * Setter method for age.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to age
     */
    public void setAge(Long newVal) {
        if ((newVal != null && this.age != null && (newVal.compareTo(this.age) == 0)) || 
            (newVal == null && this.age == null && age_is_initialized)) {
            return; 
        } 
        this.age = newVal; 

        age_is_modified = true; 
        age_is_initialized = true; 
    }

    /**
     * Setter method for age.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to age
     */
    public void setAge(long newVal) {
        setAge(new Long(newVal));
    }

    /**
     * Determines if the age has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAgeModified() {
        return age_is_modified; 
    }

    /**
     * Determines if the age has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAgeInitialized() {
        return age_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequencyTreatments.create_user
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
     * <li>full name: TumorFrequencyTreatments.create_date
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
     * <li>full name: TumorFrequencyTreatments.update_user
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
     * <li>full name: TumorFrequencyTreatments.update_date
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
        return TumorFrequencyTreatmentsKey_is_modified || 
     TumorFrequencyKey_is_modified || 
     AgentKey_is_modified || 
     dose_is_modified || 
     age_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorFrequencyTreatmentsKey_is_modified = false;
        TumorFrequencyKey_is_modified = false;
        AgentKey_is_modified = false;
        dose_is_modified = false;
        age_is_modified = false;
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
    public void copy(TumorFrequencyTreatmentsDTO bean) {
        setTumorFrequencyTreatmentsKey(bean.getTumorFrequencyTreatmentsKey());
        setTumorFrequencyKey(bean.getTumorFrequencyKey());
        setAgentKey(bean.getAgentKey());
        setDose(bean.getDose());
        setAge(bean.getAge());
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
            ret.append("\n[TumorFrequencyTreatments] ");
            ret.append("\n - TumorFrequencyTreatments._TumorFrequencyTreatments_key = ").append((TumorFrequencyTreatmentsKey_is_initialized ? ("[" + (TumorFrequencyTreatmentsKey == null ? null : TumorFrequencyTreatmentsKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments._TumorFrequency_key = ").append((TumorFrequencyKey_is_initialized ? ("[" + (TumorFrequencyKey == null ? null : TumorFrequencyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments._Agent_key = ").append((AgentKey_is_initialized ? ("[" + (AgentKey == null ? null : AgentKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.dose = ").append((dose_is_initialized ? ("[" + (dose == null ? null : dose.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.age = ").append((age_is_initialized ? ("[" + (age == null ? null : age.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequencyTreatments.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TumorFrequencyTreatments\">\n");
        ret.append("    <column name=\"_TumorFrequencyTreatments_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyTreatmentsKey_is_initialized ? ((TumorFrequencyTreatmentsKey == null ? null : TumorFrequencyTreatmentsKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorFrequency_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyKey_is_initialized ? ((TumorFrequencyKey == null ? null : TumorFrequencyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Agent_key\"\n");
        ret.append("            value=\"").append((AgentKey_is_initialized ? ((AgentKey == null ? null : AgentKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"dose\"\n");
        ret.append("            value=\"").append((dose_is_initialized ? ((dose == null ? null : dose.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"age\"\n");
        ret.append("            value=\"").append((age_is_initialized ? ((age == null ? null : age.toString())) : "[not initialized]")).append("\"/>\n");
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
