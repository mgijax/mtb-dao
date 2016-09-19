
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AlleleSynonymsDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AlelleSynonymsKeyOriginal;
    
    private Long AlelleSynonymsKey;
    private boolean AlelleSynonymsKey_is_modified = false;
    private boolean AlelleSynonymsKey_is_initialized = false;
    
    private Long AlleleKey;
    private boolean AlleleKey_is_modified = false;
    private boolean AlleleKey_is_initialized = false;
    
    private String synonym;
    private boolean synonym_is_modified = false;
    private boolean synonym_is_initialized = false;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
    private Long createUser;
    private boolean createUser_is_modified = false;
    private boolean createUser_is_initialized = false;
    
    private Long createDate;
    private boolean createDate_is_modified = false;
    private boolean createDate_is_initialized = false;
    
    private Long updateUser;
    private boolean updateUser_is_modified = false;
    private boolean updateUser_is_initialized = false;
    
    private Long updateDate;
    private boolean updateDate_is_modified = false;
    private boolean updateDate_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    AlleleSynonymsDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AlelleSynonymsKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms._AlelleSynonyms_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlelleSynonymsKey
     */
    public Long getAlelleSynonymsKeyOriginal() {
        return AlelleSynonymsKeyOriginal; 
    }

    /**
     * Getter method for AlelleSynonymsKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms._AlelleSynonyms_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AlelleSynonymsKey
     */
    public Long getAlelleSynonymsKey() {
        return AlelleSynonymsKey; 
    }

    /**
     * Setter method for AlelleSynonymsKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AlelleSynonymsKey
     */
    public void setAlelleSynonymsKey(Long newVal) {
        if ((newVal != null && this.AlelleSynonymsKey != null && (newVal.compareTo(this.AlelleSynonymsKey) == 0)) || 
            (newVal == null && this.AlelleSynonymsKey == null && AlelleSynonymsKey_is_initialized)) {
            return; 
        } 

        if(this.AlelleSynonymsKeyOriginal == null) {
            this.AlelleSynonymsKeyOriginal = newVal;
        }
        this.AlelleSynonymsKey = newVal; 

        AlelleSynonymsKey_is_modified = true; 
        AlelleSynonymsKey_is_initialized = true; 
    }

    /**
     * Setter method for AlelleSynonymsKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AlelleSynonymsKey
     */
    public void setAlelleSynonymsKey(long newVal) {
        setAlelleSynonymsKey(new Long(newVal));
    }

    /**
     * Determines if the AlelleSynonymsKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAlelleSynonymsKeyModified() {
        return AlelleSynonymsKey_is_modified; 
    }

    /**
     * Determines if the AlelleSynonymsKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAlelleSynonymsKeyInitialized() {
        return AlelleSynonymsKey_is_initialized; 
    }

    /**
     * Getter method for AlleleKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms._Allele_key
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
     * Getter method for synonym.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms.synonym
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of synonym
     */
    public String getSynonym() {
        return synonym; 
    }

    /**
     * Setter method for synonym.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to synonym
     */
    public void setSynonym(String newVal) {
        if ((newVal != null && this.synonym != null && (newVal.compareTo(this.synonym) == 0)) || 
            (newVal == null && this.synonym == null && synonym_is_initialized)) {
            return; 
        } 
        this.synonym = newVal; 

        synonym_is_modified = true; 
        synonym_is_initialized = true; 
    }

    /**
     * Determines if the synonym has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSynonymModified() {
        return synonym_is_modified; 
    }

    /**
     * Determines if the synonym has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSynonymInitialized() {
        return synonym_is_initialized; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms._Reference_key
     * <li> foreign key: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
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
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AlleleSynonyms.create_user
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of createUser
     */
    public Long getCreateUser() {
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
    public void setCreateUser(Long newVal) {
        if ((newVal != null && this.createUser != null && (newVal.compareTo(this.createUser) == 0)) || 
            (newVal == null && this.createUser == null && createUser_is_initialized)) {
            return; 
        } 
        this.createUser = newVal; 

        createUser_is_modified = true; 
        createUser_is_initialized = true; 
    }

    /**
     * Setter method for createUser.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to createUser
     */
    public void setCreateUser(long newVal) {
        setCreateUser(new Long(newVal));
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
     * <li>full name: AlleleSynonyms.create_date
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of createDate
     */
    public Long getCreateDate() {
        return createDate; 
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
    public void setCreateDate(Long newVal) {
        if ((newVal != null && this.createDate != null && (newVal.compareTo(this.createDate) == 0)) || 
            (newVal == null && this.createDate == null && createDate_is_initialized)) {
            return; 
        } 
        this.createDate = newVal; 

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
        setCreateDate(new Long(newVal));
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
     * <li>full name: AlleleSynonyms.update_user
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of updateUser
     */
    public Long getUpdateUser() {
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
    public void setUpdateUser(Long newVal) {
        if ((newVal != null && this.updateUser != null && (newVal.compareTo(this.updateUser) == 0)) || 
            (newVal == null && this.updateUser == null && updateUser_is_initialized)) {
            return; 
        } 
        this.updateUser = newVal; 

        updateUser_is_modified = true; 
        updateUser_is_initialized = true; 
    }

    /**
     * Setter method for updateUser.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to updateUser
     */
    public void setUpdateUser(long newVal) {
        setUpdateUser(new Long(newVal));
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
     * <li>full name: AlleleSynonyms.update_date
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of updateDate
     */
    public Long getUpdateDate() {
        return updateDate; 
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
    public void setUpdateDate(Long newVal) {
        if ((newVal != null && this.updateDate != null && (newVal.compareTo(this.updateDate) == 0)) || 
            (newVal == null && this.updateDate == null && updateDate_is_initialized)) {
            return; 
        } 
        this.updateDate = newVal; 

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
        setUpdateDate(new Long(newVal));
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
        return AlelleSynonymsKey_is_modified || 
     AlleleKey_is_modified || 
     synonym_is_modified || 
     ReferenceKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AlelleSynonymsKey_is_modified = false;
        AlleleKey_is_modified = false;
        synonym_is_modified = false;
        ReferenceKey_is_modified = false;
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
    public void copy(AlleleSynonymsDTO bean) {
        setAlelleSynonymsKey(bean.getAlelleSynonymsKey());
        setAlleleKey(bean.getAlleleKey());
        setSynonym(bean.getSynonym());
        setReferenceKey(bean.getReferenceKey());
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
            ret.append("\n[AlleleSynonyms] ");
            ret.append("\n - AlleleSynonyms._AlelleSynonyms_key = ").append((AlelleSynonymsKey_is_initialized ? ("[" + (AlelleSynonymsKey == null ? null : AlelleSynonymsKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms._Allele_key = ").append((AlleleKey_is_initialized ? ("[" + (AlleleKey == null ? null : AlleleKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms.synonym = ").append((synonym_is_initialized ? ("[" + (synonym == null ? null : synonym) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser.toString()) + "]") : "not initialized"));
            ret.append("\n - AlleleSynonyms.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AlleleSynonyms\">\n");
        ret.append("    <column name=\"_AlelleSynonyms_key\"\n");
        ret.append("            value=\"").append((AlelleSynonymsKey_is_initialized ? ((AlelleSynonymsKey == null ? null : AlelleSynonymsKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Allele_key\"\n");
        ret.append("            value=\"").append((AlleleKey_is_initialized ? ((AlleleKey == null ? null : AlleleKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"synonym\"\n");
        ret.append("            value=\"").append((synonym_is_initialized ? ((synonym == null ? null : synonym)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_user\"\n");
        ret.append("            value=\"").append((createUser_is_initialized ? ((createUser == null ? null : createUser.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_date\"\n");
        ret.append("            value=\"").append((createDate_is_initialized ? ((createDate == null ? null : createDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_user\"\n");
        ret.append("            value=\"").append((updateUser_is_initialized ? ((updateUser == null ? null : updateUser.toString())) : "[not initialized]")).append("\"/>\n");
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
