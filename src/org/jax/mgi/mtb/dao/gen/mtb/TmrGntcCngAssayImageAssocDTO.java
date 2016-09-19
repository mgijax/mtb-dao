
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TmrGntcCngAssayImageAssocDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorGeneticChangesKey;
    private boolean TumorGeneticChangesKey_is_modified = false;
    private boolean TumorGeneticChangesKey_is_initialized = false;
    
    private Long AssayImagesKey;
    private boolean AssayImagesKey_is_modified = false;
    private boolean AssayImagesKey_is_initialized = false;
    
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
    TmrGntcCngAssayImageAssocDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorGeneticChangesKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TmrGntcCngAssayImageAssoc._TumorGeneticChanges_key
     * <li> foreign key: TumorGeneticChanges._TumorGeneticChanges_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorGeneticChangesKey
     */
    public Long getTumorGeneticChangesKey() {
        return TumorGeneticChangesKey; 
    }

    /**
     * Setter method for TumorGeneticChangesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorGeneticChangesKey
     */
    public void setTumorGeneticChangesKey(Long newVal) {
        if ((newVal != null && this.TumorGeneticChangesKey != null && (newVal.compareTo(this.TumorGeneticChangesKey) == 0)) || 
            (newVal == null && this.TumorGeneticChangesKey == null && TumorGeneticChangesKey_is_initialized)) {
            return; 
        } 
        this.TumorGeneticChangesKey = newVal; 

        TumorGeneticChangesKey_is_modified = true; 
        TumorGeneticChangesKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorGeneticChangesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorGeneticChangesKey
     */
    public void setTumorGeneticChangesKey(long newVal) {
        setTumorGeneticChangesKey(new Long(newVal));
    }

    /**
     * Determines if the TumorGeneticChangesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorGeneticChangesKeyModified() {
        return TumorGeneticChangesKey_is_modified; 
    }

    /**
     * Determines if the TumorGeneticChangesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorGeneticChangesKeyInitialized() {
        return TumorGeneticChangesKey_is_initialized; 
    }

    /**
     * Getter method for AssayImagesKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TmrGntcCngAssayImageAssoc._AssayImages_key
     * <li> foreign key: AssayImages._AssayImages_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AssayImagesKey
     */
    public Long getAssayImagesKey() {
        return AssayImagesKey; 
    }

    /**
     * Setter method for AssayImagesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AssayImagesKey
     */
    public void setAssayImagesKey(Long newVal) {
        if ((newVal != null && this.AssayImagesKey != null && (newVal.compareTo(this.AssayImagesKey) == 0)) || 
            (newVal == null && this.AssayImagesKey == null && AssayImagesKey_is_initialized)) {
            return; 
        } 
        this.AssayImagesKey = newVal; 

        AssayImagesKey_is_modified = true; 
        AssayImagesKey_is_initialized = true; 
    }

    /**
     * Setter method for AssayImagesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AssayImagesKey
     */
    public void setAssayImagesKey(long newVal) {
        setAssayImagesKey(new Long(newVal));
    }

    /**
     * Determines if the AssayImagesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAssayImagesKeyModified() {
        return AssayImagesKey_is_modified; 
    }

    /**
     * Determines if the AssayImagesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAssayImagesKeyInitialized() {
        return AssayImagesKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TmrGntcCngAssayImageAssoc.create_user
     * <li>column size: 12
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
     * <li>full name: TmrGntcCngAssayImageAssoc.create_date
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
     * <li>full name: TmrGntcCngAssayImageAssoc.update_user
     * <li>column size: 12
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
     * <li>full name: TmrGntcCngAssayImageAssoc.update_date
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
        return TumorGeneticChangesKey_is_modified || 
     AssayImagesKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorGeneticChangesKey_is_modified = false;
        AssayImagesKey_is_modified = false;
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
    public void copy(TmrGntcCngAssayImageAssocDTO bean) {
        setTumorGeneticChangesKey(bean.getTumorGeneticChangesKey());
        setAssayImagesKey(bean.getAssayImagesKey());
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
            ret.append("\n[TmrGntcCngAssayImageAssoc] ");
            ret.append("\n - TmrGntcCngAssayImageAssoc._TumorGeneticChanges_key = ").append((TumorGeneticChangesKey_is_initialized ? ("[" + (TumorGeneticChangesKey == null ? null : TumorGeneticChangesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TmrGntcCngAssayImageAssoc._AssayImages_key = ").append((AssayImagesKey_is_initialized ? ("[" + (AssayImagesKey == null ? null : AssayImagesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TmrGntcCngAssayImageAssoc.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TmrGntcCngAssayImageAssoc.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TmrGntcCngAssayImageAssoc.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TmrGntcCngAssayImageAssoc.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TmrGntcCngAssayImageAssoc\">\n");
        ret.append("    <column name=\"_TumorGeneticChanges_key\"\n");
        ret.append("            value=\"").append((TumorGeneticChangesKey_is_initialized ? ((TumorGeneticChangesKey == null ? null : TumorGeneticChangesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_AssayImages_key\"\n");
        ret.append("            value=\"").append((AssayImagesKey_is_initialized ? ((AssayImagesKey == null ? null : AssayImagesKey.toString())) : "[not initialized]")).append("\"/>\n");
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
