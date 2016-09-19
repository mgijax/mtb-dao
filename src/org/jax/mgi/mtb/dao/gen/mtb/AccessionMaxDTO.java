
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:37 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class AccessionMaxDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String prefixPartOriginal;
    
    private String prefixPart;
    private boolean prefixPart_is_modified = false;
    private boolean prefixPart_is_initialized = false;
    
    private Long maxNumericPart;
    private boolean maxNumericPart_is_modified = false;
    private boolean maxNumericPart_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    AccessionMaxDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for prefixPart.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AccessionMax.prefixPart
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of prefixPart
     */
    public String getPrefixPartOriginal() {
        return prefixPartOriginal; 
    }

    /**
     * Getter method for prefixPart.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AccessionMax.prefixPart
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of prefixPart
     */
    public String getPrefixPart() {
        return prefixPart; 
    }

    /**
     * Setter method for prefixPart.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to prefixPart
     */
    public void setPrefixPart(String newVal) {
        if ((newVal != null && this.prefixPart != null && (newVal.compareTo(this.prefixPart) == 0)) || 
            (newVal == null && this.prefixPart == null && prefixPart_is_initialized)) {
            return; 
        } 

        if(this.prefixPartOriginal == null) {
            this.prefixPartOriginal = newVal;
        }
        this.prefixPart = newVal; 

        prefixPart_is_modified = true; 
        prefixPart_is_initialized = true; 
    }

    /**
     * Determines if the prefixPart has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPrefixPartModified() {
        return prefixPart_is_modified; 
    }

    /**
     * Determines if the prefixPart has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPrefixPartInitialized() {
        return prefixPart_is_initialized; 
    }

    /**
     * Getter method for maxNumericPart.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: AccessionMax.maxNumericPart
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of maxNumericPart
     */
    public Long getMaxNumericPart() {
        return maxNumericPart; 
    }

    /**
     * Setter method for maxNumericPart.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to maxNumericPart
     */
    public void setMaxNumericPart(Long newVal) {
        if ((newVal != null && this.maxNumericPart != null && (newVal.compareTo(this.maxNumericPart) == 0)) || 
            (newVal == null && this.maxNumericPart == null && maxNumericPart_is_initialized)) {
            return; 
        } 
        this.maxNumericPart = newVal; 

        maxNumericPart_is_modified = true; 
        maxNumericPart_is_initialized = true; 
    }

    /**
     * Setter method for maxNumericPart.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to maxNumericPart
     */
    public void setMaxNumericPart(long newVal) {
        setMaxNumericPart(new Long(newVal));
    }

    /**
     * Determines if the maxNumericPart has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMaxNumericPartModified() {
        return maxNumericPart_is_modified; 
    }

    /**
     * Determines if the maxNumericPart has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMaxNumericPartInitialized() {
        return maxNumericPart_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return prefixPart_is_modified || 
     maxNumericPart_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        prefixPart_is_modified = false;
        maxNumericPart_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(AccessionMaxDTO bean) {
        setPrefixPart(bean.getPrefixPart());
        setMaxNumericPart(bean.getMaxNumericPart());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[AccessionMax] ");
            ret.append("\n - AccessionMax.prefixPart = ").append((prefixPart_is_initialized ? ("[" + (prefixPart == null ? null : prefixPart) + "]") : "not initialized"));
            ret.append("\n - AccessionMax.maxNumericPart = ").append((maxNumericPart_is_initialized ? ("[" + (maxNumericPart == null ? null : maxNumericPart.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"AccessionMax\">\n");
        ret.append("    <column name=\"prefixPart\"\n");
        ret.append("            value=\"").append((prefixPart_is_initialized ? ((prefixPart == null ? null : prefixPart)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"maxNumericPart\"\n");
        ret.append("            value=\"").append((maxNumericPart_is_initialized ? ((maxNumericPart == null ? null : maxNumericPart.toString())) : "[not initialized]")).append("\"/>\n");
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
