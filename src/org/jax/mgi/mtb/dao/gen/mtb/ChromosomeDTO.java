
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class ChromosomeDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long ChromosomeKeyOriginal;
    
    private Long ChromosomeKey;
    private boolean ChromosomeKey_is_modified = false;
    private boolean ChromosomeKey_is_initialized = false;
    
    private Long OrganismKey;
    private boolean OrganismKey_is_modified = false;
    private boolean OrganismKey_is_initialized = false;
    
    private String chromosome;
    private boolean chromosome_is_modified = false;
    private boolean chromosome_is_initialized = false;
    
    private Long orderNum;
    private boolean orderNum_is_modified = false;
    private boolean orderNum_is_initialized = false;
    
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
    ChromosomeDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for ChromosomeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome._Chromosome_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ChromosomeKey
     */
    public Long getChromosomeKeyOriginal() {
        return ChromosomeKeyOriginal; 
    }

    /**
     * Getter method for ChromosomeKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome._Chromosome_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of ChromosomeKey
     */
    public Long getChromosomeKey() {
        return ChromosomeKey; 
    }

    /**
     * Setter method for ChromosomeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ChromosomeKey
     */
    public void setChromosomeKey(Long newVal) {
        if ((newVal != null && this.ChromosomeKey != null && (newVal.compareTo(this.ChromosomeKey) == 0)) || 
            (newVal == null && this.ChromosomeKey == null && ChromosomeKey_is_initialized)) {
            return; 
        } 

        if(this.ChromosomeKeyOriginal == null) {
            this.ChromosomeKeyOriginal = newVal;
        }
        this.ChromosomeKey = newVal; 

        ChromosomeKey_is_modified = true; 
        ChromosomeKey_is_initialized = true; 
    }

    /**
     * Setter method for ChromosomeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to ChromosomeKey
     */
    public void setChromosomeKey(long newVal) {
        setChromosomeKey(new Long(newVal));
    }

    /**
     * Determines if the ChromosomeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isChromosomeKeyModified() {
        return ChromosomeKey_is_modified; 
    }

    /**
     * Determines if the ChromosomeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isChromosomeKeyInitialized() {
        return ChromosomeKey_is_initialized; 
    }

    /**
     * Getter method for OrganismKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome._Organism_key
     * <li> foreign key: Organism._Organism_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of OrganismKey
     */
    public Long getOrganismKey() {
        return OrganismKey; 
    }

    /**
     * Setter method for OrganismKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to OrganismKey
     */
    public void setOrganismKey(Long newVal) {
        if ((newVal != null && this.OrganismKey != null && (newVal.compareTo(this.OrganismKey) == 0)) || 
            (newVal == null && this.OrganismKey == null && OrganismKey_is_initialized)) {
            return; 
        } 
        this.OrganismKey = newVal; 

        OrganismKey_is_modified = true; 
        OrganismKey_is_initialized = true; 
    }

    /**
     * Setter method for OrganismKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to OrganismKey
     */
    public void setOrganismKey(long newVal) {
        setOrganismKey(new Long(newVal));
    }

    /**
     * Determines if the OrganismKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOrganismKeyModified() {
        return OrganismKey_is_modified; 
    }

    /**
     * Determines if the OrganismKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOrganismKeyInitialized() {
        return OrganismKey_is_initialized; 
    }

    /**
     * Getter method for chromosome.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome.chromosome
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of chromosome
     */
    public String getChromosome() {
        return chromosome; 
    }

    /**
     * Setter method for chromosome.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to chromosome
     */
    public void setChromosome(String newVal) {
        if ((newVal != null && this.chromosome != null && (newVal.compareTo(this.chromosome) == 0)) || 
            (newVal == null && this.chromosome == null && chromosome_is_initialized)) {
            return; 
        } 
        this.chromosome = newVal; 

        chromosome_is_modified = true; 
        chromosome_is_initialized = true; 
    }

    /**
     * Determines if the chromosome has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isChromosomeModified() {
        return chromosome_is_modified; 
    }

    /**
     * Determines if the chromosome has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isChromosomeInitialized() {
        return chromosome_is_initialized; 
    }

    /**
     * Getter method for orderNum.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome.orderNum
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of orderNum
     */
    public Long getOrderNum() {
        return orderNum; 
    }

    /**
     * Setter method for orderNum.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to orderNum
     */
    public void setOrderNum(Long newVal) {
        if ((newVal != null && this.orderNum != null && (newVal.compareTo(this.orderNum) == 0)) || 
            (newVal == null && this.orderNum == null && orderNum_is_initialized)) {
            return; 
        } 
        this.orderNum = newVal; 

        orderNum_is_modified = true; 
        orderNum_is_initialized = true; 
    }

    /**
     * Setter method for orderNum.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to orderNum
     */
    public void setOrderNum(long newVal) {
        setOrderNum(new Long(newVal));
    }

    /**
     * Determines if the orderNum has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOrderNumModified() {
        return orderNum_is_modified; 
    }

    /**
     * Determines if the orderNum has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOrderNumInitialized() {
        return orderNum_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Chromosome.create_user
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
     * <li>full name: Chromosome.create_date
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
     * <li>full name: Chromosome.update_user
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
     * <li>full name: Chromosome.update_date
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
        return ChromosomeKey_is_modified || 
     OrganismKey_is_modified || 
     chromosome_is_modified || 
     orderNum_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        ChromosomeKey_is_modified = false;
        OrganismKey_is_modified = false;
        chromosome_is_modified = false;
        orderNum_is_modified = false;
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
    public void copy(ChromosomeDTO bean) {
        setChromosomeKey(bean.getChromosomeKey());
        setOrganismKey(bean.getOrganismKey());
        setChromosome(bean.getChromosome());
        setOrderNum(bean.getOrderNum());
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
            ret.append("\n[Chromosome] ");
            ret.append("\n - Chromosome._Chromosome_key = ").append((ChromosomeKey_is_initialized ? ("[" + (ChromosomeKey == null ? null : ChromosomeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Chromosome._Organism_key = ").append((OrganismKey_is_initialized ? ("[" + (OrganismKey == null ? null : OrganismKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Chromosome.chromosome = ").append((chromosome_is_initialized ? ("[" + (chromosome == null ? null : chromosome) + "]") : "not initialized"));
            ret.append("\n - Chromosome.orderNum = ").append((orderNum_is_initialized ? ("[" + (orderNum == null ? null : orderNum.toString()) + "]") : "not initialized"));
            ret.append("\n - Chromosome.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Chromosome.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Chromosome.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Chromosome.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Chromosome\">\n");
        ret.append("    <column name=\"_Chromosome_key\"\n");
        ret.append("            value=\"").append((ChromosomeKey_is_initialized ? ((ChromosomeKey == null ? null : ChromosomeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Organism_key\"\n");
        ret.append("            value=\"").append((OrganismKey_is_initialized ? ((OrganismKey == null ? null : OrganismKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"chromosome\"\n");
        ret.append("            value=\"").append((chromosome_is_initialized ? ((chromosome == null ? null : chromosome)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"orderNum\"\n");
        ret.append("            value=\"").append((orderNum_is_initialized ? ((orderNum == null ? null : orderNum.toString())) : "[not initialized]")).append("\"/>\n");
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
