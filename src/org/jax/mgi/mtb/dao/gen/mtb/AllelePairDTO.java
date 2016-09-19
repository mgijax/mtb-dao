
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AllelePairDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long AllelePairKeyOriginal;
    
    private Long AllelePairKey;
    private boolean AllelePairKey_is_modified = false;
    private boolean AllelePairKey_is_initialized = false;
    
    private Long Allele1Key;
    private boolean Allele1Key_is_modified = false;
    private boolean Allele1Key_is_initialized = false;
    
    private Long Allele2Key;
    private boolean Allele2Key_is_modified = false;
    private boolean Allele2Key_is_initialized = false;
    
    private Long sequence;
    private boolean sequence_is_modified = false;
    private boolean sequence_is_initialized = false;
    
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
    AllelePairDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for AllelePairKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair._AllelePair_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AllelePairKey
     */
    public Long getAllelePairKeyOriginal() {
        return AllelePairKeyOriginal; 
    }

    /**
     * Getter method for AllelePairKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair._AllelePair_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of AllelePairKey
     */
    public Long getAllelePairKey() {
        return AllelePairKey; 
    }

    /**
     * Setter method for AllelePairKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to AllelePairKey
     */
    public void setAllelePairKey(Long newVal) {
        if ((newVal != null && this.AllelePairKey != null && (newVal.compareTo(this.AllelePairKey) == 0)) || 
            (newVal == null && this.AllelePairKey == null && AllelePairKey_is_initialized)) {
            return; 
        } 

        if(this.AllelePairKeyOriginal == null) {
            this.AllelePairKeyOriginal = newVal;
        }
        this.AllelePairKey = newVal; 

        AllelePairKey_is_modified = true; 
        AllelePairKey_is_initialized = true; 
    }

    /**
     * Setter method for AllelePairKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to AllelePairKey
     */
    public void setAllelePairKey(long newVal) {
        setAllelePairKey(new Long(newVal));
    }

    /**
     * Determines if the AllelePairKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAllelePairKeyModified() {
        return AllelePairKey_is_modified; 
    }

    /**
     * Determines if the AllelePairKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAllelePairKeyInitialized() {
        return AllelePairKey_is_initialized; 
    }

    /**
     * Getter method for Allele1Key.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair._Allele1_key
     * <li> foreign key: Allele._Allele_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of Allele1Key
     */
    public Long getAllele1Key() {
        return Allele1Key; 
    }

    /**
     * Setter method for Allele1Key.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to Allele1Key
     */
    public void setAllele1Key(Long newVal) {
        if ((newVal != null && this.Allele1Key != null && (newVal.compareTo(this.Allele1Key) == 0)) || 
            (newVal == null && this.Allele1Key == null && Allele1Key_is_initialized)) {
            return; 
        } 
        this.Allele1Key = newVal; 

        Allele1Key_is_modified = true; 
        Allele1Key_is_initialized = true; 
    }

    /**
     * Setter method for Allele1Key.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to Allele1Key
     */
    public void setAllele1Key(long newVal) {
        setAllele1Key(new Long(newVal));
    }

    /**
     * Determines if the Allele1Key has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAllele1KeyModified() {
        return Allele1Key_is_modified; 
    }

    /**
     * Determines if the Allele1Key has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAllele1KeyInitialized() {
        return Allele1Key_is_initialized; 
    }

    /**
     * Getter method for Allele2Key.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair._Allele2_key
     * <li> foreign key: Allele._Allele_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of Allele2Key
     */
    public Long getAllele2Key() {
        return Allele2Key; 
    }

    /**
     * Setter method for Allele2Key.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to Allele2Key
     */
    public void setAllele2Key(Long newVal) {
        if ((newVal != null && this.Allele2Key != null && (newVal.compareTo(this.Allele2Key) == 0)) || 
            (newVal == null && this.Allele2Key == null && Allele2Key_is_initialized)) {
            return; 
        } 
        this.Allele2Key = newVal; 

        Allele2Key_is_modified = true; 
        Allele2Key_is_initialized = true; 
    }

    /**
     * Setter method for Allele2Key.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to Allele2Key
     */
    public void setAllele2Key(long newVal) {
        setAllele2Key(new Long(newVal));
    }

    /**
     * Determines if the Allele2Key has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAllele2KeyModified() {
        return Allele2Key_is_modified; 
    }

    /**
     * Determines if the Allele2Key has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAllele2KeyInitialized() {
        return Allele2Key_is_initialized; 
    }

    /**
     * Getter method for sequence.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair.sequence
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of sequence
     */
    public Long getSequence() {
        return sequence; 
    }

    /**
     * Setter method for sequence.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to sequence
     */
    public void setSequence(Long newVal) {
        if ((newVal != null && this.sequence != null && (newVal.compareTo(this.sequence) == 0)) || 
            (newVal == null && this.sequence == null && sequence_is_initialized)) {
            return; 
        } 
        this.sequence = newVal; 

        sequence_is_modified = true; 
        sequence_is_initialized = true; 
    }

    /**
     * Setter method for sequence.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sequence
     */
    public void setSequence(long newVal) {
        setSequence(new Long(newVal));
    }

    /**
     * Determines if the sequence has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSequenceModified() {
        return sequence_is_modified; 
    }

    /**
     * Determines if the sequence has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSequenceInitialized() {
        return sequence_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AllelePair.create_user
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
     * <li>full name: AllelePair.create_date
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
     * <li>full name: AllelePair.update_user
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
     * <li>full name: AllelePair.update_date
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
        return AllelePairKey_is_modified || 
     Allele1Key_is_modified || 
     Allele2Key_is_modified || 
     sequence_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        AllelePairKey_is_modified = false;
        Allele1Key_is_modified = false;
        Allele2Key_is_modified = false;
        sequence_is_modified = false;
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
    public void copy(AllelePairDTO bean) {
        setAllelePairKey(bean.getAllelePairKey());
        setAllele1Key(bean.getAllele1Key());
        setAllele2Key(bean.getAllele2Key());
        setSequence(bean.getSequence());
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
            ret.append("\n[AllelePair] ");
            ret.append("\n - AllelePair._AllelePair_key = ").append((AllelePairKey_is_initialized ? ("[" + (AllelePairKey == null ? null : AllelePairKey.toString()) + "]") : "not initialized"));
            ret.append("\n - AllelePair._Allele1_key = ").append((Allele1Key_is_initialized ? ("[" + (Allele1Key == null ? null : Allele1Key.toString()) + "]") : "not initialized"));
            ret.append("\n - AllelePair._Allele2_key = ").append((Allele2Key_is_initialized ? ("[" + (Allele2Key == null ? null : Allele2Key.toString()) + "]") : "not initialized"));
            ret.append("\n - AllelePair.sequence = ").append((sequence_is_initialized ? ("[" + (sequence == null ? null : sequence.toString()) + "]") : "not initialized"));
            ret.append("\n - AllelePair.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - AllelePair.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - AllelePair.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - AllelePair.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AllelePair\">\n");
        ret.append("    <column name=\"_AllelePair_key\"\n");
        ret.append("            value=\"").append((AllelePairKey_is_initialized ? ((AllelePairKey == null ? null : AllelePairKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Allele1_key\"\n");
        ret.append("            value=\"").append((Allele1Key_is_initialized ? ((Allele1Key == null ? null : Allele1Key.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Allele2_key\"\n");
        ret.append("            value=\"").append((Allele2Key_is_initialized ? ((Allele2Key == null ? null : Allele2Key.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"sequence\"\n");
        ret.append("            value=\"").append((sequence_is_initialized ? ((sequence == null ? null : sequence.toString())) : "[not initialized]")).append("\"/>\n");
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
