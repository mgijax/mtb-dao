
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class ImagesDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long ImagesKeyOriginal;
    
    private Long ImagesKey;
    private boolean ImagesKey_is_modified = false;
    private boolean ImagesKey_is_initialized = false;
    
    private String highResName;
    private boolean highResName_is_modified = false;
    private boolean highResName_is_initialized = false;
    
    private String mediumResName;
    private boolean mediumResName_is_modified = false;
    private boolean mediumResName_is_initialized = false;
    
    private String lowResName;
    private boolean lowResName_is_modified = false;
    private boolean lowResName_is_initialized = false;
    
    private String server;
    private boolean server_is_modified = false;
    private boolean server_is_initialized = false;
    
    private String serverPath;
    private boolean serverPath_is_modified = false;
    private boolean serverPath_is_initialized = false;
    
    private String url;
    private boolean url_is_modified = false;
    private boolean url_is_initialized = false;
    
    private String urlPath;
    private boolean urlPath_is_modified = false;
    private boolean urlPath_is_initialized = false;
    
    private String zoomifyPath;
    private boolean zoomifyPath_is_modified = false;
    private boolean zoomifyPath_is_initialized = false;
    
    private Long privateFlag;
    private boolean privateFlag_is_modified = false;
    private boolean privateFlag_is_initialized = false;
    
    private String description;
    private boolean description_is_modified = false;
    private boolean description_is_initialized = false;
    
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
    ImagesDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for ImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images._Images_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ImagesKey
     */
    public Long getImagesKeyOriginal() {
        return ImagesKeyOriginal; 
    }

    /**
     * Getter method for ImagesKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images._Images_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ImagesKey
     */
    public Long getImagesKey() {
        return ImagesKey; 
    }

    /**
     * Setter method for ImagesKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ImagesKey
     */
    public void setImagesKey(Long newVal) {
        if ((newVal != null && this.ImagesKey != null && (newVal.compareTo(this.ImagesKey) == 0)) || 
            (newVal == null && this.ImagesKey == null && ImagesKey_is_initialized)) {
            return; 
        } 

        if(this.ImagesKeyOriginal == null) {
            this.ImagesKeyOriginal = newVal;
        }
        this.ImagesKey = newVal; 

        ImagesKey_is_modified = true; 
        ImagesKey_is_initialized = true; 
    }

    /**
     * Setter method for ImagesKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ImagesKey
     */
    public void setImagesKey(long newVal) {
        setImagesKey(new Long(newVal));
    }

    /**
     * Determines if the ImagesKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isImagesKeyModified() {
        return ImagesKey_is_modified; 
    }

    /**
     * Determines if the ImagesKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isImagesKeyInitialized() {
        return ImagesKey_is_initialized; 
    }

    /**
     * Getter method for highResName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.highResName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of highResName
     */
    public String getHighResName() {
        return highResName; 
    }

    /**
     * Setter method for highResName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to highResName
     */
    public void setHighResName(String newVal) {
        if ((newVal != null && this.highResName != null && (newVal.compareTo(this.highResName) == 0)) || 
            (newVal == null && this.highResName == null && highResName_is_initialized)) {
            return; 
        } 
        this.highResName = newVal; 

        highResName_is_modified = true; 
        highResName_is_initialized = true; 
    }

    /**
     * Determines if the highResName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isHighResNameModified() {
        return highResName_is_modified; 
    }

    /**
     * Determines if the highResName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isHighResNameInitialized() {
        return highResName_is_initialized; 
    }

    /**
     * Getter method for mediumResName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.mediumResName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of mediumResName
     */
    public String getMediumResName() {
        return mediumResName; 
    }

    /**
     * Setter method for mediumResName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to mediumResName
     */
    public void setMediumResName(String newVal) {
        if ((newVal != null && this.mediumResName != null && (newVal.compareTo(this.mediumResName) == 0)) || 
            (newVal == null && this.mediumResName == null && mediumResName_is_initialized)) {
            return; 
        } 
        this.mediumResName = newVal; 

        mediumResName_is_modified = true; 
        mediumResName_is_initialized = true; 
    }

    /**
     * Determines if the mediumResName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMediumResNameModified() {
        return mediumResName_is_modified; 
    }

    /**
     * Determines if the mediumResName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMediumResNameInitialized() {
        return mediumResName_is_initialized; 
    }

    /**
     * Getter method for lowResName.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.lowResName
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of lowResName
     */
    public String getLowResName() {
        return lowResName; 
    }

    /**
     * Setter method for lowResName.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to lowResName
     */
    public void setLowResName(String newVal) {
        if ((newVal != null && this.lowResName != null && (newVal.compareTo(this.lowResName) == 0)) || 
            (newVal == null && this.lowResName == null && lowResName_is_initialized)) {
            return; 
        } 
        this.lowResName = newVal; 

        lowResName_is_modified = true; 
        lowResName_is_initialized = true; 
    }

    /**
     * Determines if the lowResName has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isLowResNameModified() {
        return lowResName_is_modified; 
    }

    /**
     * Determines if the lowResName has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isLowResNameInitialized() {
        return lowResName_is_initialized; 
    }

    /**
     * Getter method for server.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.server
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of server
     */
    public String getServer() {
        return server; 
    }

    /**
     * Setter method for server.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to server
     */
    public void setServer(String newVal) {
        if ((newVal != null && this.server != null && (newVal.compareTo(this.server) == 0)) || 
            (newVal == null && this.server == null && server_is_initialized)) {
            return; 
        } 
        this.server = newVal; 

        server_is_modified = true; 
        server_is_initialized = true; 
    }

    /**
     * Determines if the server has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isServerModified() {
        return server_is_modified; 
    }

    /**
     * Determines if the server has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isServerInitialized() {
        return server_is_initialized; 
    }

    /**
     * Getter method for serverPath.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.serverPath
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of serverPath
     */
    public String getServerPath() {
        return serverPath; 
    }

    /**
     * Setter method for serverPath.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to serverPath
     */
    public void setServerPath(String newVal) {
        if ((newVal != null && this.serverPath != null && (newVal.compareTo(this.serverPath) == 0)) || 
            (newVal == null && this.serverPath == null && serverPath_is_initialized)) {
            return; 
        } 
        this.serverPath = newVal; 

        serverPath_is_modified = true; 
        serverPath_is_initialized = true; 
    }

    /**
     * Determines if the serverPath has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isServerPathModified() {
        return serverPath_is_modified; 
    }

    /**
     * Determines if the serverPath has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isServerPathInitialized() {
        return serverPath_is_initialized; 
    }

    /**
     * Getter method for url.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.url
     * <li>column size: 255
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
     * Getter method for urlPath.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.urlPath
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of urlPath
     */
    public String getUrlPath() {
        return urlPath; 
    }

    /**
     * Setter method for urlPath.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to urlPath
     */
    public void setUrlPath(String newVal) {
        if ((newVal != null && this.urlPath != null && (newVal.compareTo(this.urlPath) == 0)) || 
            (newVal == null && this.urlPath == null && urlPath_is_initialized)) {
            return; 
        } 
        this.urlPath = newVal; 

        urlPath_is_modified = true; 
        urlPath_is_initialized = true; 
    }

    /**
     * Determines if the urlPath has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUrlPathModified() {
        return urlPath_is_modified; 
    }

    /**
     * Determines if the urlPath has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUrlPathInitialized() {
        return urlPath_is_initialized; 
    }

    /**
     * Getter method for zoomifyPath.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.zoomifyPath
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of zoomifyPath
     */
    public String getZoomifyPath() {
        return zoomifyPath; 
    }

    /**
     * Setter method for zoomifyPath.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to zoomifyPath
     */
    public void setZoomifyPath(String newVal) {
        if ((newVal != null && this.zoomifyPath != null && (newVal.compareTo(this.zoomifyPath) == 0)) || 
            (newVal == null && this.zoomifyPath == null && zoomifyPath_is_initialized)) {
            return; 
        } 
        this.zoomifyPath = newVal; 

        zoomifyPath_is_modified = true; 
        zoomifyPath_is_initialized = true; 
    }

    /**
     * Determines if the zoomifyPath has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isZoomifyPathModified() {
        return zoomifyPath_is_modified; 
    }

    /**
     * Determines if the zoomifyPath has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isZoomifyPathInitialized() {
        return zoomifyPath_is_initialized; 
    }

    /**
     * Getter method for privateFlag.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.privateFlag
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of privateFlag
     */
    public Long getPrivateFlag() {
        return privateFlag; 
    }

    /**
     * Setter method for privateFlag.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to privateFlag
     */
    public void setPrivateFlag(Long newVal) {
        if ((newVal != null && this.privateFlag != null && (newVal.compareTo(this.privateFlag) == 0)) || 
            (newVal == null && this.privateFlag == null && privateFlag_is_initialized)) {
            return; 
        } 
        this.privateFlag = newVal; 

        privateFlag_is_modified = true; 
        privateFlag_is_initialized = true; 
    }

    /**
     * Setter method for privateFlag.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to privateFlag
     */
    public void setPrivateFlag(long newVal) {
        setPrivateFlag(new Long(newVal));
    }

    /**
     * Determines if the privateFlag has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPrivateFlagModified() {
        return privateFlag_is_modified; 
    }

    /**
     * Determines if the privateFlag has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPrivateFlagInitialized() {
        return privateFlag_is_initialized; 
    }

    /**
     * Getter method for description.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.description
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of description
     */
    public String getDescription() {
        return description; 
    }

    /**
     * Setter method for description.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to description
     */
    public void setDescription(String newVal) {
        if ((newVal != null && this.description != null && (newVal.compareTo(this.description) == 0)) || 
            (newVal == null && this.description == null && description_is_initialized)) {
            return; 
        } 
        this.description = newVal; 

        description_is_modified = true; 
        description_is_initialized = true; 
    }

    /**
     * Determines if the description has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDescriptionModified() {
        return description_is_modified; 
    }

    /**
     * Determines if the description has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDescriptionInitialized() {
        return description_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Images.create_user
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
     * <li>full name: Images.create_date
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
     * <li>full name: Images.update_user
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
     * <li>full name: Images.update_date
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
        return ImagesKey_is_modified || 
     highResName_is_modified || 
     mediumResName_is_modified || 
     lowResName_is_modified || 
     server_is_modified || 
     serverPath_is_modified || 
     url_is_modified || 
     urlPath_is_modified || 
     zoomifyPath_is_modified || 
     privateFlag_is_modified || 
     description_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        ImagesKey_is_modified = false;
        highResName_is_modified = false;
        mediumResName_is_modified = false;
        lowResName_is_modified = false;
        server_is_modified = false;
        serverPath_is_modified = false;
        url_is_modified = false;
        urlPath_is_modified = false;
        zoomifyPath_is_modified = false;
        privateFlag_is_modified = false;
        description_is_modified = false;
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
    public void copy(ImagesDTO bean) {
        setImagesKey(bean.getImagesKey());
        setHighResName(bean.getHighResName());
        setMediumResName(bean.getMediumResName());
        setLowResName(bean.getLowResName());
        setServer(bean.getServer());
        setServerPath(bean.getServerPath());
        setUrl(bean.getUrl());
        setUrlPath(bean.getUrlPath());
        setZoomifyPath(bean.getZoomifyPath());
        setPrivateFlag(bean.getPrivateFlag());
        setDescription(bean.getDescription());
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
            ret.append("\n[Images] ");
            ret.append("\n - Images._Images_key = ").append((ImagesKey_is_initialized ? ("[" + (ImagesKey == null ? null : ImagesKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Images.highResName = ").append((highResName_is_initialized ? ("[" + (highResName == null ? null : highResName) + "]") : "not initialized"));
            ret.append("\n - Images.mediumResName = ").append((mediumResName_is_initialized ? ("[" + (mediumResName == null ? null : mediumResName) + "]") : "not initialized"));
            ret.append("\n - Images.lowResName = ").append((lowResName_is_initialized ? ("[" + (lowResName == null ? null : lowResName) + "]") : "not initialized"));
            ret.append("\n - Images.server = ").append((server_is_initialized ? ("[" + (server == null ? null : server) + "]") : "not initialized"));
            ret.append("\n - Images.serverPath = ").append((serverPath_is_initialized ? ("[" + (serverPath == null ? null : serverPath) + "]") : "not initialized"));
            ret.append("\n - Images.url = ").append((url_is_initialized ? ("[" + (url == null ? null : url) + "]") : "not initialized"));
            ret.append("\n - Images.urlPath = ").append((urlPath_is_initialized ? ("[" + (urlPath == null ? null : urlPath) + "]") : "not initialized"));
            ret.append("\n - Images.zoomifyPath = ").append((zoomifyPath_is_initialized ? ("[" + (zoomifyPath == null ? null : zoomifyPath) + "]") : "not initialized"));
            ret.append("\n - Images.privateFlag = ").append((privateFlag_is_initialized ? ("[" + (privateFlag == null ? null : privateFlag.toString()) + "]") : "not initialized"));
            ret.append("\n - Images.description = ").append((description_is_initialized ? ("[" + (description == null ? null : description) + "]") : "not initialized"));
            ret.append("\n - Images.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Images.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Images.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Images.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Images\">\n");
        ret.append("    <column name=\"_Images_key\"\n");
        ret.append("            value=\"").append((ImagesKey_is_initialized ? ((ImagesKey == null ? null : ImagesKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"highResName\"\n");
        ret.append("            value=\"").append((highResName_is_initialized ? ((highResName == null ? null : highResName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"mediumResName\"\n");
        ret.append("            value=\"").append((mediumResName_is_initialized ? ((mediumResName == null ? null : mediumResName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"lowResName\"\n");
        ret.append("            value=\"").append((lowResName_is_initialized ? ((lowResName == null ? null : lowResName)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"server\"\n");
        ret.append("            value=\"").append((server_is_initialized ? ((server == null ? null : server)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"serverPath\"\n");
        ret.append("            value=\"").append((serverPath_is_initialized ? ((serverPath == null ? null : serverPath)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"url\"\n");
        ret.append("            value=\"").append((url_is_initialized ? ((url == null ? null : url)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"urlPath\"\n");
        ret.append("            value=\"").append((urlPath_is_initialized ? ((urlPath == null ? null : urlPath)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"zoomifyPath\"\n");
        ret.append("            value=\"").append((zoomifyPath_is_initialized ? ((zoomifyPath == null ? null : zoomifyPath)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"privateFlag\"\n");
        ret.append("            value=\"").append((privateFlag_is_initialized ? ((privateFlag == null ? null : privateFlag.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"description\"\n");
        ret.append("            value=\"").append((description_is_initialized ? ((description == null ? null : description)) : "[not initialized]")).append("\"/>\n");
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
