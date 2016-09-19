
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class MTBInfoDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long MTBInfoKeyOriginal;
    
    private Long MTBInfoKey;
    private boolean MTBInfoKey_is_modified = false;
    private boolean MTBInfoKey_is_initialized = false;
    
    private String MTBProperty;
    private boolean MTBProperty_is_modified = false;
    private boolean MTBProperty_is_initialized = false;
    
    private String MTBValue;
    private boolean MTBValue_is_modified = false;
    private boolean MTBValue_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    MTBInfoDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for MTBInfoKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBInfo._MTBInfo_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBInfoKey
     */
    public Long getMTBInfoKeyOriginal() {
        return MTBInfoKeyOriginal; 
    }

    /**
     * Getter method for MTBInfoKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBInfo._MTBInfo_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of MTBInfoKey
     */
    public Long getMTBInfoKey() {
        return MTBInfoKey; 
    }

    /**
     * Setter method for MTBInfoKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBInfoKey
     */
    public void setMTBInfoKey(Long newVal) {
        if ((newVal != null && this.MTBInfoKey != null && (newVal.compareTo(this.MTBInfoKey) == 0)) || 
            (newVal == null && this.MTBInfoKey == null && MTBInfoKey_is_initialized)) {
            return; 
        } 

        if(this.MTBInfoKeyOriginal == null) {
            this.MTBInfoKeyOriginal = newVal;
        }
        this.MTBInfoKey = newVal; 

        MTBInfoKey_is_modified = true; 
        MTBInfoKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBInfoKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBInfoKey
     */
    public void setMTBInfoKey(long newVal) {
        setMTBInfoKey(new Long(newVal));
    }

    /**
     * Determines if the MTBInfoKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBInfoKeyModified() {
        return MTBInfoKey_is_modified; 
    }

    /**
     * Determines if the MTBInfoKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBInfoKeyInitialized() {
        return MTBInfoKey_is_initialized; 
    }

    /**
     * Getter method for MTBProperty.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBInfo.MTBProperty
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of MTBProperty
     */
    public String getMTBProperty() {
        return MTBProperty; 
    }

    /**
     * Setter method for MTBProperty.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBProperty
     */
    public void setMTBProperty(String newVal) {
        if ((newVal != null && this.MTBProperty != null && (newVal.compareTo(this.MTBProperty) == 0)) || 
            (newVal == null && this.MTBProperty == null && MTBProperty_is_initialized)) {
            return; 
        } 
        this.MTBProperty = newVal; 

        MTBProperty_is_modified = true; 
        MTBProperty_is_initialized = true; 
    }

    /**
     * Determines if the MTBProperty has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBPropertyModified() {
        return MTBProperty_is_modified; 
    }

    /**
     * Determines if the MTBProperty has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBPropertyInitialized() {
        return MTBProperty_is_initialized; 
    }

    /**
     * Getter method for MTBValue.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: MTBInfo.MTBValue
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of MTBValue
     */
    public String getMTBValue() {
        return MTBValue; 
    }

    /**
     * Setter method for MTBValue.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBValue
     */
    public void setMTBValue(String newVal) {
        if ((newVal != null && this.MTBValue != null && (newVal.compareTo(this.MTBValue) == 0)) || 
            (newVal == null && this.MTBValue == null && MTBValue_is_initialized)) {
            return; 
        } 
        this.MTBValue = newVal; 

        MTBValue_is_modified = true; 
        MTBValue_is_initialized = true; 
    }

    /**
     * Determines if the MTBValue has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBValueModified() {
        return MTBValue_is_modified; 
    }

    /**
     * Determines if the MTBValue has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBValueInitialized() {
        return MTBValue_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return MTBInfoKey_is_modified || 
     MTBProperty_is_modified || 
     MTBValue_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        MTBInfoKey_is_modified = false;
        MTBProperty_is_modified = false;
        MTBValue_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(MTBInfoDTO bean) {
        setMTBInfoKey(bean.getMTBInfoKey());
        setMTBProperty(bean.getMTBProperty());
        setMTBValue(bean.getMTBValue());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[MTBInfo] ");
            ret.append("\n - MTBInfo._MTBInfo_key = ").append((MTBInfoKey_is_initialized ? ("[" + (MTBInfoKey == null ? null : MTBInfoKey.toString()) + "]") : "not initialized"));
            ret.append("\n - MTBInfo.MTBProperty = ").append((MTBProperty_is_initialized ? ("[" + (MTBProperty == null ? null : MTBProperty) + "]") : "not initialized"));
            ret.append("\n - MTBInfo.MTBValue = ").append((MTBValue_is_initialized ? ("[" + (MTBValue == null ? null : MTBValue) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"MTBInfo\">\n");
        ret.append("    <column name=\"_MTBInfo_key\"\n");
        ret.append("            value=\"").append((MTBInfoKey_is_initialized ? ((MTBInfoKey == null ? null : MTBInfoKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"MTBProperty\"\n");
        ret.append("            value=\"").append((MTBProperty_is_initialized ? ((MTBProperty == null ? null : MTBProperty)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"MTBValue\"\n");
        ret.append("            value=\"").append((MTBValue_is_initialized ? ((MTBValue == null ? null : MTBValue)) : "[not initialized]")).append("\"/>\n");
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
