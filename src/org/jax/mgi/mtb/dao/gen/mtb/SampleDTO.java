
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.mysql.jdbc.Driver
// Generation Time: : Tue May 17 09:15:27 EDT 2011

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class SampleDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long sampleKeyOriginal;
    
    private Long sampleKey;
    private boolean sampleKey_is_modified = false;
    private boolean sampleKey_is_initialized = false;
    
    private String id;
    private boolean id_is_modified = false;
    private boolean id_is_initialized = false;
    
    private Long siteinfoKey;
    private boolean siteinfoKey_is_modified = false;
    private boolean siteinfoKey_is_initialized = false;
    
    private String summary;
    private boolean summary_is_modified = false;
    private boolean summary_is_initialized = false;
    
    private String title;
    private boolean title_is_modified = false;
    private boolean title_is_initialized = false;
    
    private String platform;
    private boolean platform_is_modified = false;
    private boolean platform_is_initialized = false;
    
    private Boolean isControl;
    private boolean isControl_is_modified = false;
    private boolean isControl_is_initialized = false;
    
    private String url;
    private boolean url_is_modified = false;
    private boolean url_is_initialized = false;
    
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
    SampleDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for sampleKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample._sample_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of sampleKey
     */
    public Long getSampleKeyOriginal() {
        return sampleKeyOriginal; 
    }

    /**
     * Getter method for sampleKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample._sample_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of sampleKey
     */
    public Long getSampleKey() {
        return sampleKey; 
    }

    /**
     * Setter method for sampleKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to sampleKey
     */
    public void setSampleKey(Long newVal) {
        if ((newVal != null && this.sampleKey != null && (newVal.compareTo(this.sampleKey) == 0)) || 
            (newVal == null && this.sampleKey == null && sampleKey_is_initialized)) {
            return; 
        } 

        if(this.sampleKeyOriginal == null) {
            this.sampleKeyOriginal = newVal;
        }
        this.sampleKey = newVal; 

        sampleKey_is_modified = true; 
        sampleKey_is_initialized = true; 
    }

    /**
     * Setter method for sampleKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sampleKey
     */
    public void setSampleKey(long newVal) {
        setSampleKey(new Long(newVal));
    }

    /**
     * Determines if the sampleKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSampleKeyModified() {
        return sampleKey_is_modified; 
    }

    /**
     * Determines if the sampleKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSampleKeyInitialized() {
        return sampleKey_is_initialized; 
    }

    /**
     * Getter method for id.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.id
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of id
     */
    public String getId() {
        return id; 
    }

    /**
     * Setter method for id.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to id
     */
    public void setId(String newVal) {
        if ((newVal != null && this.id != null && (newVal.compareTo(this.id) == 0)) || 
            (newVal == null && this.id == null && id_is_initialized)) {
            return; 
        } 
        this.id = newVal; 

        id_is_modified = true; 
        id_is_initialized = true; 
    }

    /**
     * Determines if the id has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIdModified() {
        return id_is_modified; 
    }

    /**
     * Determines if the id has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIdInitialized() {
        return id_is_initialized; 
    }

    /**
     * Getter method for siteinfoKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample._siteinfo_key
     * <li> foreign key: SiteInfo._SiteInfo_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of siteinfoKey
     */
    public Long getSiteinfoKey() {
        return siteinfoKey; 
    }

    /**
     * Setter method for siteinfoKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to siteinfoKey
     */
    public void setSiteinfoKey(Long newVal) {
        if ((newVal != null && this.siteinfoKey != null && (newVal.compareTo(this.siteinfoKey) == 0)) || 
            (newVal == null && this.siteinfoKey == null && siteinfoKey_is_initialized)) {
            return; 
        } 
        this.siteinfoKey = newVal; 

        siteinfoKey_is_modified = true; 
        siteinfoKey_is_initialized = true; 
    }

    /**
     * Setter method for siteinfoKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to siteinfoKey
     */
    public void setSiteinfoKey(long newVal) {
        setSiteinfoKey(new Long(newVal));
    }

    /**
     * Determines if the siteinfoKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSiteinfoKeyModified() {
        return siteinfoKey_is_modified; 
    }

    /**
     * Determines if the siteinfoKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSiteinfoKeyInitialized() {
        return siteinfoKey_is_initialized; 
    }

    /**
     * Getter method for summary.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.summary
     * <li>column size: 1000
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of summary
     */
    public String getSummary() {
        return summary; 
    }

    /**
     * Setter method for summary.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to summary
     */
    public void setSummary(String newVal) {
        if ((newVal != null && this.summary != null && (newVal.compareTo(this.summary) == 0)) || 
            (newVal == null && this.summary == null && summary_is_initialized)) {
            return; 
        } 
        this.summary = newVal; 

        summary_is_modified = true; 
        summary_is_initialized = true; 
    }

    /**
     * Determines if the summary has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSummaryModified() {
        return summary_is_modified; 
    }

    /**
     * Determines if the summary has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSummaryInitialized() {
        return summary_is_initialized; 
    }

    /**
     * Getter method for title.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.title
     * <li>column size: 500
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of title
     */
    public String getTitle() {
        return title; 
    }

    /**
     * Setter method for title.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to title
     */
    public void setTitle(String newVal) {
        if ((newVal != null && this.title != null && (newVal.compareTo(this.title) == 0)) || 
            (newVal == null && this.title == null && title_is_initialized)) {
            return; 
        } 
        this.title = newVal; 

        title_is_modified = true; 
        title_is_initialized = true; 
    }

    /**
     * Determines if the title has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTitleModified() {
        return title_is_modified; 
    }

    /**
     * Determines if the title has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTitleInitialized() {
        return title_is_initialized; 
    }

    /**
     * Getter method for platform.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.platform
     * <li>column size: 500
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of platform
     */
    public String getPlatform() {
        return platform; 
    }

    /**
     * Setter method for platform.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to platform
     */
    public void setPlatform(String newVal) {
        if ((newVal != null && this.platform != null && (newVal.compareTo(this.platform) == 0)) || 
            (newVal == null && this.platform == null && platform_is_initialized)) {
            return; 
        } 
        this.platform = newVal; 

        platform_is_modified = true; 
        platform_is_initialized = true; 
    }

    /**
     * Determines if the platform has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPlatformModified() {
        return platform_is_modified; 
    }

    /**
     * Determines if the platform has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPlatformInitialized() {
        return platform_is_initialized; 
    }

    /**
     * Getter method for isControl.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.isControl
     * <li>column size: 0
     * <li>jdbc type returned by the driver: Types.BIT
     * </ul>
     *
     * @return the value of isControl
     */
    public Boolean getIsControl() {
        return isControl; 
    }

    /**
     * Setter method for isControl.
     * <br>
     * Attention, there will be no comparison with current value which
     * means calling this method will mark the field as 'modified' in all cases.
     *
     * @param newVal the new value to be assigned to isControl
     */
    public void setIsControl(Boolean newVal) {
        if ((newVal != null && this.isControl != null && newVal.equals(this.isControl)) || 
            (newVal == null && this.isControl == null && isControl_is_initialized)) {
            return; 
        } 
        this.isControl = newVal; 

        isControl_is_modified = true; 
        isControl_is_initialized = true; 
    }

    /**
     * Setter method for isControl.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isControl
     */
    public void setIsControl(boolean newVal) {
        setIsControl(new Boolean(newVal));
    }

    /**
     * Determines if the isControl has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIsControlModified() {
        return isControl_is_modified; 
    }

    /**
     * Determines if the isControl has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIsControlInitialized() {
        return isControl_is_initialized; 
    }

    /**
     * Getter method for url.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.url
     * <li>column size: 500
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of url
     */
    public String getUrl() {
        return url; 
    }

    /**
     * Setter method for url.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to url
     */
    public void setUrl(String newVal) {
        if ((newVal != null && this.url != null && (newVal.compareTo(this.url) == 0)) || 
            (newVal == null && this.url == null && url_is_initialized)) {
            return; 
        } 
        this.url = newVal; 

        url_is_modified = true; 
        url_is_initialized = true; 
    }

    /**
     * Determines if the url has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUrlModified() {
        return url_is_modified; 
    }

    /**
     * Determines if the url has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUrlInitialized() {
        return url_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Sample.create_user
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
     * <li>full name: Sample.create_date
     * <li>column size: 19
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
     * <li>full name: Sample.update_user
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
     * <li>full name: Sample.update_date
     * <li>column size: 19
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
        return sampleKey_is_modified || 
     id_is_modified || 
     siteinfoKey_is_modified || 
     summary_is_modified || 
     title_is_modified || 
     platform_is_modified || 
     isControl_is_modified || 
     url_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        sampleKey_is_modified = false;
        id_is_modified = false;
        siteinfoKey_is_modified = false;
        summary_is_modified = false;
        title_is_modified = false;
        platform_is_modified = false;
        isControl_is_modified = false;
        url_is_modified = false;
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
    public void copy(SampleDTO bean) {
        setSampleKey(bean.getSampleKey());
        setId(bean.getId());
        setSiteinfoKey(bean.getSiteinfoKey());
        setSummary(bean.getSummary());
        setTitle(bean.getTitle());
        setPlatform(bean.getPlatform());
        setIsControl(bean.getIsControl());
        setUrl(bean.getUrl());
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
            ret.append("\n[Sample] ");
            ret.append("\n - Sample._sample_key = ").append((sampleKey_is_initialized ? ("[" + (sampleKey == null ? null : sampleKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Sample.id = ").append((id_is_initialized ? ("[" + (id == null ? null : id) + "]") : "not initialized"));
            ret.append("\n - Sample._siteinfo_key = ").append((siteinfoKey_is_initialized ? ("[" + (siteinfoKey == null ? null : siteinfoKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Sample.summary = ").append((summary_is_initialized ? ("[" + (summary == null ? null : summary) + "]") : "not initialized"));
            ret.append("\n - Sample.title = ").append((title_is_initialized ? ("[" + (title == null ? null : title) + "]") : "not initialized"));
            ret.append("\n - Sample.platform = ").append((platform_is_initialized ? ("[" + (platform == null ? null : platform) + "]") : "not initialized"));
            ret.append("\n - Sample.isControl = ").append((isControl_is_initialized ? ("[" + (isControl == null ? null : isControl.toString()) + "]") : "not initialized"));
            ret.append("\n - Sample.url = ").append((url_is_initialized ? ("[" + (url == null ? null : url) + "]") : "not initialized"));
            ret.append("\n - Sample.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Sample.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Sample.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Sample.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Sample\">\n");
        ret.append("    <column name=\"_sample_key\"\n");
        ret.append("            value=\"").append((sampleKey_is_initialized ? ((sampleKey == null ? null : sampleKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"id\"\n");
        ret.append("            value=\"").append((id_is_initialized ? ((id == null ? null : id)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_siteinfo_key\"\n");
        ret.append("            value=\"").append((siteinfoKey_is_initialized ? ((siteinfoKey == null ? null : siteinfoKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"summary\"\n");
        ret.append("            value=\"").append((summary_is_initialized ? ((summary == null ? null : summary)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"title\"\n");
        ret.append("            value=\"").append((title_is_initialized ? ((title == null ? null : title)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"platform\"\n");
        ret.append("            value=\"").append((platform_is_initialized ? ((platform == null ? null : platform)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"isControl\"\n");
        ret.append("            value=\"").append((isControl_is_initialized ? ((isControl == null ? null : isControl.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"url\"\n");
        ret.append("            value=\"").append((url_is_initialized ? ((url == null ? null : url)) : "[not initialized]")).append("\"/>\n");
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
