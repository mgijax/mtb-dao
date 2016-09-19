
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class MTBUsersDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long MTBUsersKeyOriginal;
    
    private Long MTBUsersKey;
    private boolean MTBUsersKey_is_modified = false;
    private boolean MTBUsersKey_is_initialized = false;
    
    private String userName;
    private boolean userName_is_modified = false;
    private boolean userName_is_initialized = false;
    
    private String password;
    private boolean password_is_modified = false;
    private boolean password_is_initialized = false;
    
    private String fullName;
    private boolean fullName_is_modified = false;
    private boolean fullName_is_initialized = false;
    
    private String telephone;
    private boolean telephone_is_modified = false;
    private boolean telephone_is_initialized = false;
    
    private String email;
    private boolean email_is_modified = false;
    private boolean email_is_initialized = false;
    
    private Long MTBSecurityLevelKey;
    private boolean MTBSecurityLevelKey_is_modified = false;
    private boolean MTBSecurityLevelKey_is_initialized = false;
    
    private Long activeInd;
    private boolean activeInd_is_modified = false;
    private boolean activeInd_is_initialized = false;
    
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
    MTBUsersDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for MTBUsersKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers._MTBUsers_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBUsersKey
     */
    public Long getMTBUsersKeyOriginal() {
        return MTBUsersKeyOriginal; 
    }

    /**
     * Getter method for MTBUsersKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers._MTBUsers_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBUsersKey
     */
    public Long getMTBUsersKey() {
        return MTBUsersKey; 
    }

    /**
     * Setter method for MTBUsersKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBUsersKey
     */
    public void setMTBUsersKey(Long newVal) {
        if ((newVal != null && this.MTBUsersKey != null && (newVal.compareTo(this.MTBUsersKey) == 0)) || 
            (newVal == null && this.MTBUsersKey == null && MTBUsersKey_is_initialized)) {
            return; 
        } 

        if(this.MTBUsersKeyOriginal == null) {
            this.MTBUsersKeyOriginal = newVal;
        }
        this.MTBUsersKey = newVal; 

        MTBUsersKey_is_modified = true; 
        MTBUsersKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBUsersKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBUsersKey
     */
    public void setMTBUsersKey(long newVal) {
        setMTBUsersKey(new Long(newVal));
    }

    /**
     * Determines if the MTBUsersKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBUsersKeyModified() {
        return MTBUsersKey_is_modified; 
    }

    /**
     * Determines if the MTBUsersKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBUsersKeyInitialized() {
        return MTBUsersKey_is_initialized; 
    }

    /**
     * Getter method for userName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.userName
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName; 
    }

    /**
     * Setter method for userName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to userName
     */
    public void setUserName(String newVal) {
        if ((newVal != null && this.userName != null && (newVal.compareTo(this.userName) == 0)) || 
            (newVal == null && this.userName == null && userName_is_initialized)) {
            return; 
        } 
        this.userName = newVal; 

        userName_is_modified = true; 
        userName_is_initialized = true; 
    }

    /**
     * Determines if the userName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUserNameModified() {
        return userName_is_modified; 
    }

    /**
     * Determines if the userName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUserNameInitialized() {
        return userName_is_initialized; 
    }

    /**
     * Getter method for password.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.password
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of password
     */
    public String getPassword() {
        return password; 
    }

    /**
     * Setter method for password.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to password
     */
    public void setPassword(String newVal) {
        if ((newVal != null && this.password != null && (newVal.compareTo(this.password) == 0)) || 
            (newVal == null && this.password == null && password_is_initialized)) {
            return; 
        } 
        this.password = newVal; 

        password_is_modified = true; 
        password_is_initialized = true; 
    }

    /**
     * Determines if the password has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPasswordModified() {
        return password_is_modified; 
    }

    /**
     * Determines if the password has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPasswordInitialized() {
        return password_is_initialized; 
    }

    /**
     * Getter method for fullName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.fullName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of fullName
     */
    public String getFullName() {
        return fullName; 
    }

    /**
     * Setter method for fullName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to fullName
     */
    public void setFullName(String newVal) {
        if ((newVal != null && this.fullName != null && (newVal.compareTo(this.fullName) == 0)) || 
            (newVal == null && this.fullName == null && fullName_is_initialized)) {
            return; 
        } 
        this.fullName = newVal; 

        fullName_is_modified = true; 
        fullName_is_initialized = true; 
    }

    /**
     * Determines if the fullName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFullNameModified() {
        return fullName_is_modified; 
    }

    /**
     * Determines if the fullName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFullNameInitialized() {
        return fullName_is_initialized; 
    }

    /**
     * Getter method for telephone.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.telephone
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of telephone
     */
    public String getTelephone() {
        return telephone; 
    }

    /**
     * Setter method for telephone.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to telephone
     */
    public void setTelephone(String newVal) {
        if ((newVal != null && this.telephone != null && (newVal.compareTo(this.telephone) == 0)) || 
            (newVal == null && this.telephone == null && telephone_is_initialized)) {
            return; 
        } 
        this.telephone = newVal; 

        telephone_is_modified = true; 
        telephone_is_initialized = true; 
    }

    /**
     * Determines if the telephone has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTelephoneModified() {
        return telephone_is_modified; 
    }

    /**
     * Determines if the telephone has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTelephoneInitialized() {
        return telephone_is_initialized; 
    }

    /**
     * Getter method for email.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.email
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of email
     */
    public String getEmail() {
        return email; 
    }

    /**
     * Setter method for email.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to email
     */
    public void setEmail(String newVal) {
        if ((newVal != null && this.email != null && (newVal.compareTo(this.email) == 0)) || 
            (newVal == null && this.email == null && email_is_initialized)) {
            return; 
        } 
        this.email = newVal; 

        email_is_modified = true; 
        email_is_initialized = true; 
    }

    /**
     * Determines if the email has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isEmailModified() {
        return email_is_modified; 
    }

    /**
     * Determines if the email has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isEmailInitialized() {
        return email_is_initialized; 
    }

    /**
     * Getter method for MTBSecurityLevelKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers._MTBSecurityLevel_key
     * <li> foreign key: MTBSecurityLevel._MTBSecurityLevel_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBSecurityLevelKey
     */
    public Long getMTBSecurityLevelKey() {
        return MTBSecurityLevelKey; 
    }

    /**
     * Setter method for MTBSecurityLevelKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBSecurityLevelKey
     */
    public void setMTBSecurityLevelKey(Long newVal) {
        if ((newVal != null && this.MTBSecurityLevelKey != null && (newVal.compareTo(this.MTBSecurityLevelKey) == 0)) || 
            (newVal == null && this.MTBSecurityLevelKey == null && MTBSecurityLevelKey_is_initialized)) {
            return; 
        } 
        this.MTBSecurityLevelKey = newVal; 

        MTBSecurityLevelKey_is_modified = true; 
        MTBSecurityLevelKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBSecurityLevelKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBSecurityLevelKey
     */
    public void setMTBSecurityLevelKey(long newVal) {
        setMTBSecurityLevelKey(new Long(newVal));
    }

    /**
     * Determines if the MTBSecurityLevelKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBSecurityLevelKeyModified() {
        return MTBSecurityLevelKey_is_modified; 
    }

    /**
     * Determines if the MTBSecurityLevelKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBSecurityLevelKeyInitialized() {
        return MTBSecurityLevelKey_is_initialized; 
    }

    /**
     * Getter method for activeInd.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.activeInd
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of activeInd
     */
    public Long getActiveInd() {
        return activeInd; 
    }

    /**
     * Setter method for activeInd.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to activeInd
     */
    public void setActiveInd(Long newVal) {
        if ((newVal != null && this.activeInd != null && (newVal.compareTo(this.activeInd) == 0)) || 
            (newVal == null && this.activeInd == null && activeInd_is_initialized)) {
            return; 
        } 
        this.activeInd = newVal; 

        activeInd_is_modified = true; 
        activeInd_is_initialized = true; 
    }

    /**
     * Setter method for activeInd.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to activeInd
     */
    public void setActiveInd(long newVal) {
        setActiveInd(new Long(newVal));
    }

    /**
     * Determines if the activeInd has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isActiveIndModified() {
        return activeInd_is_modified; 
    }

    /**
     * Determines if the activeInd has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isActiveIndInitialized() {
        return activeInd_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBUsers.create_user
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
     * <li>full name: MTBUsers.create_date
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
     * <li>full name: MTBUsers.update_user
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
     * <li>full name: MTBUsers.update_date
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
        return MTBUsersKey_is_modified || 
     userName_is_modified || 
     password_is_modified || 
     fullName_is_modified || 
     telephone_is_modified || 
     email_is_modified || 
     MTBSecurityLevelKey_is_modified || 
     activeInd_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        MTBUsersKey_is_modified = false;
        userName_is_modified = false;
        password_is_modified = false;
        fullName_is_modified = false;
        telephone_is_modified = false;
        email_is_modified = false;
        MTBSecurityLevelKey_is_modified = false;
        activeInd_is_modified = false;
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
    public void copy(MTBUsersDTO bean) {
        setMTBUsersKey(bean.getMTBUsersKey());
        setUserName(bean.getUserName());
        setPassword(bean.getPassword());
        setFullName(bean.getFullName());
        setTelephone(bean.getTelephone());
        setEmail(bean.getEmail());
        setMTBSecurityLevelKey(bean.getMTBSecurityLevelKey());
        setActiveInd(bean.getActiveInd());
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
            ret.append("\n[MTBUsers] ");
            ret.append("\n - MTBUsers._MTBUsers_key = ").append((MTBUsersKey_is_initialized ? ("[" + (MTBUsersKey == null ? null : MTBUsersKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.userName = ").append((userName_is_initialized ? ("[" + (userName == null ? null : userName) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.password = ").append((password_is_initialized ? ("[" + (password == null ? null : password) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.fullName = ").append((fullName_is_initialized ? ("[" + (fullName == null ? null : fullName) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.telephone = ").append((telephone_is_initialized ? ("[" + (telephone == null ? null : telephone) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.email = ").append((email_is_initialized ? ("[" + (email == null ? null : email) + "]") : "not initialized"));
            ret.append("\n - MTBUsers._MTBSecurityLevel_key = ").append((MTBSecurityLevelKey_is_initialized ? ("[" + (MTBSecurityLevelKey == null ? null : MTBSecurityLevelKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.activeInd = ").append((activeInd_is_initialized ? ("[" + (activeInd == null ? null : activeInd.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - MTBUsers.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"MTBUsers\">\n");
        ret.append("    <column name=\"_MTBUsers_key\"\n");
        ret.append("            value=\"").append((MTBUsersKey_is_initialized ? ((MTBUsersKey == null ? null : MTBUsersKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"userName\"\n");
        ret.append("            value=\"").append((userName_is_initialized ? ((userName == null ? null : userName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"password\"\n");
        ret.append("            value=\"").append((password_is_initialized ? ((password == null ? null : password)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"fullName\"\n");
        ret.append("            value=\"").append((fullName_is_initialized ? ((fullName == null ? null : fullName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"telephone\"\n");
        ret.append("            value=\"").append((telephone_is_initialized ? ((telephone == null ? null : telephone)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"email\"\n");
        ret.append("            value=\"").append((email_is_initialized ? ((email == null ? null : email)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBSecurityLevel_key\"\n");
        ret.append("            value=\"").append((MTBSecurityLevelKey_is_initialized ? ((MTBSecurityLevelKey == null ? null : MTBSecurityLevelKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"activeInd\"\n");
        ret.append("            value=\"").append((activeInd_is_initialized ? ((activeInd == null ? null : activeInd.toString())) : "[not initialized]")).append("\"/>\n");
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
