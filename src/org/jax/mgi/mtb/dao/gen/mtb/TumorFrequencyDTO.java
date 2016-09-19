
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.sybase.jdbc3.jdbc.SybDriver
// Generation Time: : Thu Feb 12 11:30:38 EST 2009

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class TumorFrequencyDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long TumorFrequencyKeyOriginal;
    
    private Long TumorFrequencyKey;
    private boolean TumorFrequencyKey_is_modified = false;
    private boolean TumorFrequencyKey_is_initialized = false;
    
    private Long TumorTypeKey;
    private boolean TumorTypeKey_is_modified = false;
    private boolean TumorTypeKey_is_initialized = false;
    
    private Long StrainKey;
    private boolean StrainKey_is_modified = false;
    private boolean StrainKey_is_initialized = false;
    
    private String SexKey;
    private boolean SexKey_is_modified = false;
    private boolean SexKey_is_initialized = false;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
    private Long OrganAffectedKey;
    private boolean OrganAffectedKey_is_modified = false;
    private boolean OrganAffectedKey_is_initialized = false;
    
    private String note;
    private boolean note_is_modified = false;
    private boolean note_is_initialized = false;
    
    private Long colonySize;
    private boolean colonySize_is_modified = false;
    private boolean colonySize_is_initialized = false;
    
    private String ageOnset;
    private boolean ageOnset_is_modified = false;
    private boolean ageOnset_is_initialized = false;
    
    private String ageDetection;
    private boolean ageDetection_is_modified = false;
    private boolean ageDetection_is_initialized = false;
    
    private Long numMiceAffected;
    private boolean numMiceAffected_is_modified = false;
    private boolean numMiceAffected_is_initialized = false;
    
    private String incidence;
    private boolean incidence_is_modified = false;
    private boolean incidence_is_initialized = false;
    
    private java.math.BigDecimal freqNum;
    private boolean freqNum_is_modified = false;
    private boolean freqNum_is_initialized = false;
    
    private String breedingStatus;
    private boolean breedingStatus_is_modified = false;
    private boolean breedingStatus_is_initialized = false;
    
    private String infectionStatus;
    private boolean infectionStatus_is_modified = false;
    private boolean infectionStatus_is_initialized = false;
    
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
    TumorFrequencyDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for TumorFrequencyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._TumorFrequency_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorFrequencyKey
     */
    public Long getTumorFrequencyKeyOriginal() {
        return TumorFrequencyKeyOriginal; 
    }

    /**
     * Getter method for TumorFrequencyKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._TumorFrequency_key
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

        if(this.TumorFrequencyKeyOriginal == null) {
            this.TumorFrequencyKeyOriginal = newVal;
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
     * Getter method for TumorTypeKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._TumorType_key
     * <li> foreign key: TumorType._TumorType_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of TumorTypeKey
     */
    public Long getTumorTypeKey() {
        return TumorTypeKey; 
    }

    /**
     * Setter method for TumorTypeKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to TumorTypeKey
     */
    public void setTumorTypeKey(Long newVal) {
        if ((newVal != null && this.TumorTypeKey != null && (newVal.compareTo(this.TumorTypeKey) == 0)) || 
            (newVal == null && this.TumorTypeKey == null && TumorTypeKey_is_initialized)) {
            return; 
        } 
        this.TumorTypeKey = newVal; 

        TumorTypeKey_is_modified = true; 
        TumorTypeKey_is_initialized = true; 
    }

    /**
     * Setter method for TumorTypeKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to TumorTypeKey
     */
    public void setTumorTypeKey(long newVal) {
        setTumorTypeKey(new Long(newVal));
    }

    /**
     * Determines if the TumorTypeKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTumorTypeKeyModified() {
        return TumorTypeKey_is_modified; 
    }

    /**
     * Determines if the TumorTypeKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTumorTypeKeyInitialized() {
        return TumorTypeKey_is_initialized; 
    }

    /**
     * Getter method for StrainKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._Strain_key
     * <li> foreign key: Strain._Strain_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of StrainKey
     */
    public Long getStrainKey() {
        return StrainKey; 
    }

    /**
     * Setter method for StrainKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to StrainKey
     */
    public void setStrainKey(Long newVal) {
        if ((newVal != null && this.StrainKey != null && (newVal.compareTo(this.StrainKey) == 0)) || 
            (newVal == null && this.StrainKey == null && StrainKey_is_initialized)) {
            return; 
        } 
        this.StrainKey = newVal; 

        StrainKey_is_modified = true; 
        StrainKey_is_initialized = true; 
    }

    /**
     * Setter method for StrainKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to StrainKey
     */
    public void setStrainKey(long newVal) {
        setStrainKey(new Long(newVal));
    }

    /**
     * Determines if the StrainKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStrainKeyModified() {
        return StrainKey_is_modified; 
    }

    /**
     * Determines if the StrainKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStrainKeyInitialized() {
        return StrainKey_is_initialized; 
    }

    /**
     * Getter method for SexKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._Sex_key
     * <li> foreign key: Sex._Sex_key
     * <li>column size: 1
     * <li>jdbc type returned by the driver: Types.CHAR
     * </ul>
     *
     * @return the value of SexKey
     */
    public String getSexKey() {
        return SexKey; 
    }

    /**
     * Setter method for SexKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to SexKey
     */
    public void setSexKey(String newVal) {
        if ((newVal != null && this.SexKey != null && (newVal.compareTo(this.SexKey) == 0)) || 
            (newVal == null && this.SexKey == null && SexKey_is_initialized)) {
            return; 
        } 
        this.SexKey = newVal; 

        SexKey_is_modified = true; 
        SexKey_is_initialized = true; 
    }

    /**
     * Determines if the SexKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSexKeyModified() {
        return SexKey_is_modified; 
    }

    /**
     * Determines if the SexKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSexKeyInitialized() {
        return SexKey_is_initialized; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._Reference_key
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
     * Getter method for OrganAffectedKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency._OrganAffected_key
     * <li> foreign key: Organ._Organ_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of OrganAffectedKey
     */
    public Long getOrganAffectedKey() {
        return OrganAffectedKey; 
    }

    /**
     * Setter method for OrganAffectedKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to OrganAffectedKey
     */
    public void setOrganAffectedKey(Long newVal) {
        if ((newVal != null && this.OrganAffectedKey != null && (newVal.compareTo(this.OrganAffectedKey) == 0)) || 
            (newVal == null && this.OrganAffectedKey == null && OrganAffectedKey_is_initialized)) {
            return; 
        } 
        this.OrganAffectedKey = newVal; 

        OrganAffectedKey_is_modified = true; 
        OrganAffectedKey_is_initialized = true; 
    }

    /**
     * Setter method for OrganAffectedKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to OrganAffectedKey
     */
    public void setOrganAffectedKey(long newVal) {
        setOrganAffectedKey(new Long(newVal));
    }

    /**
     * Determines if the OrganAffectedKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isOrganAffectedKeyModified() {
        return OrganAffectedKey_is_modified; 
    }

    /**
     * Determines if the OrganAffectedKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isOrganAffectedKeyInitialized() {
        return OrganAffectedKey_is_initialized; 
    }

    /**
     * Getter method for note.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.note
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of note
     */
    public String getNote() {
        return note; 
    }

    /**
     * Setter method for note.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to note
     */
    public void setNote(String newVal) {
        if ((newVal != null && this.note != null && (newVal.compareTo(this.note) == 0)) || 
            (newVal == null && this.note == null && note_is_initialized)) {
            return; 
        } 
        this.note = newVal; 

        note_is_modified = true; 
        note_is_initialized = true; 
    }

    /**
     * Determines if the note has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNoteModified() {
        return note_is_modified; 
    }

    /**
     * Determines if the note has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNoteInitialized() {
        return note_is_initialized; 
    }

    /**
     * Getter method for colonySize.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.colonySize
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of colonySize
     */
    public Long getColonySize() {
        return colonySize; 
    }

    /**
     * Setter method for colonySize.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to colonySize
     */
    public void setColonySize(Long newVal) {
        if ((newVal != null && this.colonySize != null && (newVal.compareTo(this.colonySize) == 0)) || 
            (newVal == null && this.colonySize == null && colonySize_is_initialized)) {
            return; 
        } 
        this.colonySize = newVal; 

        colonySize_is_modified = true; 
        colonySize_is_initialized = true; 
    }

    /**
     * Setter method for colonySize.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to colonySize
     */
    public void setColonySize(long newVal) {
        setColonySize(new Long(newVal));
    }

    /**
     * Determines if the colonySize has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isColonySizeModified() {
        return colonySize_is_modified; 
    }

    /**
     * Determines if the colonySize has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isColonySizeInitialized() {
        return colonySize_is_initialized; 
    }

    /**
     * Getter method for ageOnset.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.ageOnset
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of ageOnset
     */
    public String getAgeOnset() {
        return ageOnset; 
    }

    /**
     * Setter method for ageOnset.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ageOnset
     */
    public void setAgeOnset(String newVal) {
        if ((newVal != null && this.ageOnset != null && (newVal.compareTo(this.ageOnset) == 0)) || 
            (newVal == null && this.ageOnset == null && ageOnset_is_initialized)) {
            return; 
        } 
        this.ageOnset = newVal; 

        ageOnset_is_modified = true; 
        ageOnset_is_initialized = true; 
    }

    /**
     * Determines if the ageOnset has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAgeOnsetModified() {
        return ageOnset_is_modified; 
    }

    /**
     * Determines if the ageOnset has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAgeOnsetInitialized() {
        return ageOnset_is_initialized; 
    }

    /**
     * Getter method for ageDetection.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.ageDetection
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of ageDetection
     */
    public String getAgeDetection() {
        return ageDetection; 
    }

    /**
     * Setter method for ageDetection.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to ageDetection
     */
    public void setAgeDetection(String newVal) {
        if ((newVal != null && this.ageDetection != null && (newVal.compareTo(this.ageDetection) == 0)) || 
            (newVal == null && this.ageDetection == null && ageDetection_is_initialized)) {
            return; 
        } 
        this.ageDetection = newVal; 

        ageDetection_is_modified = true; 
        ageDetection_is_initialized = true; 
    }

    /**
     * Determines if the ageDetection has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAgeDetectionModified() {
        return ageDetection_is_modified; 
    }

    /**
     * Determines if the ageDetection has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAgeDetectionInitialized() {
        return ageDetection_is_initialized; 
    }

    /**
     * Getter method for numMiceAffected.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.numMiceAffected
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of numMiceAffected
     */
    public Long getNumMiceAffected() {
        return numMiceAffected; 
    }

    /**
     * Setter method for numMiceAffected.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to numMiceAffected
     */
    public void setNumMiceAffected(Long newVal) {
        if ((newVal != null && this.numMiceAffected != null && (newVal.compareTo(this.numMiceAffected) == 0)) || 
            (newVal == null && this.numMiceAffected == null && numMiceAffected_is_initialized)) {
            return; 
        } 
        this.numMiceAffected = newVal; 

        numMiceAffected_is_modified = true; 
        numMiceAffected_is_initialized = true; 
    }

    /**
     * Setter method for numMiceAffected.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to numMiceAffected
     */
    public void setNumMiceAffected(long newVal) {
        setNumMiceAffected(new Long(newVal));
    }

    /**
     * Determines if the numMiceAffected has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNumMiceAffectedModified() {
        return numMiceAffected_is_modified; 
    }

    /**
     * Determines if the numMiceAffected has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNumMiceAffectedInitialized() {
        return numMiceAffected_is_initialized; 
    }

    /**
     * Getter method for incidence.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.incidence
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of incidence
     */
    public String getIncidence() {
        return incidence; 
    }

    /**
     * Setter method for incidence.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to incidence
     */
    public void setIncidence(String newVal) {
        if ((newVal != null && this.incidence != null && (newVal.compareTo(this.incidence) == 0)) || 
            (newVal == null && this.incidence == null && incidence_is_initialized)) {
            return; 
        } 
        this.incidence = newVal; 

        incidence_is_modified = true; 
        incidence_is_initialized = true; 
    }

    /**
     * Determines if the incidence has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIncidenceModified() {
        return incidence_is_modified; 
    }

    /**
     * Determines if the incidence has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIncidenceInitialized() {
        return incidence_is_initialized; 
    }

    /**
     * Getter method for freqNum.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.freqNum
     * <li>column size: 5
     * <li>jdbc type returned by the driver: Types.NUMERIC
     * </ul>
     *
     * @return the value of freqNum
     */
    public java.math.BigDecimal getFreqNum() {
        return freqNum; 
    }

    /**
     * Setter method for freqNum.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to freqNum
     */
    public void setFreqNum(java.math.BigDecimal newVal) {
        if ((newVal != null && this.freqNum != null && (newVal.compareTo(this.freqNum) == 0)) || 
            (newVal == null && this.freqNum == null && freqNum_is_initialized)) {
            return; 
        } 
        this.freqNum = newVal; 

        freqNum_is_modified = true; 
        freqNum_is_initialized = true; 
    }

    /**
     * Determines if the freqNum has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFreqNumModified() {
        return freqNum_is_modified; 
    }

    /**
     * Determines if the freqNum has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFreqNumInitialized() {
        return freqNum_is_initialized; 
    }

    /**
     * Getter method for breedingStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.breedingStatus
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of breedingStatus
     */
    public String getBreedingStatus() {
        return breedingStatus; 
    }

    /**
     * Setter method for breedingStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to breedingStatus
     */
    public void setBreedingStatus(String newVal) {
        if ((newVal != null && this.breedingStatus != null && (newVal.compareTo(this.breedingStatus) == 0)) || 
            (newVal == null && this.breedingStatus == null && breedingStatus_is_initialized)) {
            return; 
        } 
        this.breedingStatus = newVal; 

        breedingStatus_is_modified = true; 
        breedingStatus_is_initialized = true; 
    }

    /**
     * Determines if the breedingStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isBreedingStatusModified() {
        return breedingStatus_is_modified; 
    }

    /**
     * Determines if the breedingStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isBreedingStatusInitialized() {
        return breedingStatus_is_initialized; 
    }

    /**
     * Getter method for infectionStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.infectionStatus
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of infectionStatus
     */
    public String getInfectionStatus() {
        return infectionStatus; 
    }

    /**
     * Setter method for infectionStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to infectionStatus
     */
    public void setInfectionStatus(String newVal) {
        if ((newVal != null && this.infectionStatus != null && (newVal.compareTo(this.infectionStatus) == 0)) || 
            (newVal == null && this.infectionStatus == null && infectionStatus_is_initialized)) {
            return; 
        } 
        this.infectionStatus = newVal; 

        infectionStatus_is_modified = true; 
        infectionStatus_is_initialized = true; 
    }

    /**
     * Determines if the infectionStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isInfectionStatusModified() {
        return infectionStatus_is_modified; 
    }

    /**
     * Determines if the infectionStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isInfectionStatusInitialized() {
        return infectionStatus_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: TumorFrequency.create_user
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
     * <li>full name: TumorFrequency.create_date
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
     * <li>full name: TumorFrequency.update_user
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
     * <li>full name: TumorFrequency.update_date
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
        return TumorFrequencyKey_is_modified || 
     TumorTypeKey_is_modified || 
     StrainKey_is_modified || 
     SexKey_is_modified || 
     ReferenceKey_is_modified || 
     OrganAffectedKey_is_modified || 
     note_is_modified || 
     colonySize_is_modified || 
     ageOnset_is_modified || 
     ageDetection_is_modified || 
     numMiceAffected_is_modified || 
     incidence_is_modified || 
     freqNum_is_modified || 
     breedingStatus_is_modified || 
     infectionStatus_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        TumorFrequencyKey_is_modified = false;
        TumorTypeKey_is_modified = false;
        StrainKey_is_modified = false;
        SexKey_is_modified = false;
        ReferenceKey_is_modified = false;
        OrganAffectedKey_is_modified = false;
        note_is_modified = false;
        colonySize_is_modified = false;
        ageOnset_is_modified = false;
        ageDetection_is_modified = false;
        numMiceAffected_is_modified = false;
        incidence_is_modified = false;
        freqNum_is_modified = false;
        breedingStatus_is_modified = false;
        infectionStatus_is_modified = false;
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
    public void copy(TumorFrequencyDTO bean) {
        setTumorFrequencyKey(bean.getTumorFrequencyKey());
        setTumorTypeKey(bean.getTumorTypeKey());
        setStrainKey(bean.getStrainKey());
        setSexKey(bean.getSexKey());
        setReferenceKey(bean.getReferenceKey());
        setOrganAffectedKey(bean.getOrganAffectedKey());
        setNote(bean.getNote());
        setColonySize(bean.getColonySize());
        setAgeOnset(bean.getAgeOnset());
        setAgeDetection(bean.getAgeDetection());
        setNumMiceAffected(bean.getNumMiceAffected());
        setIncidence(bean.getIncidence());
        setFreqNum(bean.getFreqNum());
        setBreedingStatus(bean.getBreedingStatus());
        setInfectionStatus(bean.getInfectionStatus());
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
            ret.append("\n[TumorFrequency] ");
            ret.append("\n - TumorFrequency._TumorFrequency_key = ").append((TumorFrequencyKey_is_initialized ? ("[" + (TumorFrequencyKey == null ? null : TumorFrequencyKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency._TumorType_key = ").append((TumorTypeKey_is_initialized ? ("[" + (TumorTypeKey == null ? null : TumorTypeKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency._Strain_key = ").append((StrainKey_is_initialized ? ("[" + (StrainKey == null ? null : StrainKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency._Sex_key = ").append((SexKey_is_initialized ? ("[" + (SexKey == null ? null : SexKey) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency._OrganAffected_key = ").append((OrganAffectedKey_is_initialized ? ("[" + (OrganAffectedKey == null ? null : OrganAffectedKey.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.note = ").append((note_is_initialized ? ("[" + (note == null ? null : note) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.colonySize = ").append((colonySize_is_initialized ? ("[" + (colonySize == null ? null : colonySize.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.ageOnset = ").append((ageOnset_is_initialized ? ("[" + (ageOnset == null ? null : ageOnset) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.ageDetection = ").append((ageDetection_is_initialized ? ("[" + (ageDetection == null ? null : ageDetection) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.numMiceAffected = ").append((numMiceAffected_is_initialized ? ("[" + (numMiceAffected == null ? null : numMiceAffected.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.incidence = ").append((incidence_is_initialized ? ("[" + (incidence == null ? null : incidence) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.freqNum = ").append((freqNum_is_initialized ? ("[" + (freqNum == null ? null : freqNum.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.breedingStatus = ").append((breedingStatus_is_initialized ? ("[" + (breedingStatus == null ? null : breedingStatus) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.infectionStatus = ").append((infectionStatus_is_initialized ? ("[" + (infectionStatus == null ? null : infectionStatus) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - TumorFrequency.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"TumorFrequency\">\n");
        ret.append("    <column name=\"_TumorFrequency_key\"\n");
        ret.append("            value=\"").append((TumorFrequencyKey_is_initialized ? ((TumorFrequencyKey == null ? null : TumorFrequencyKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_TumorType_key\"\n");
        ret.append("            value=\"").append((TumorTypeKey_is_initialized ? ((TumorTypeKey == null ? null : TumorTypeKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Strain_key\"\n");
        ret.append("            value=\"").append((StrainKey_is_initialized ? ((StrainKey == null ? null : StrainKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Sex_key\"\n");
        ret.append("            value=\"").append((SexKey_is_initialized ? ((SexKey == null ? null : SexKey)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_OrganAffected_key\"\n");
        ret.append("            value=\"").append((OrganAffectedKey_is_initialized ? ((OrganAffectedKey == null ? null : OrganAffectedKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"note\"\n");
        ret.append("            value=\"").append((note_is_initialized ? ((note == null ? null : note)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"colonySize\"\n");
        ret.append("            value=\"").append((colonySize_is_initialized ? ((colonySize == null ? null : colonySize.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"ageOnset\"\n");
        ret.append("            value=\"").append((ageOnset_is_initialized ? ((ageOnset == null ? null : ageOnset)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"ageDetection\"\n");
        ret.append("            value=\"").append((ageDetection_is_initialized ? ((ageDetection == null ? null : ageDetection)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"numMiceAffected\"\n");
        ret.append("            value=\"").append((numMiceAffected_is_initialized ? ((numMiceAffected == null ? null : numMiceAffected.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"incidence\"\n");
        ret.append("            value=\"").append((incidence_is_initialized ? ((incidence == null ? null : incidence)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"freqNum\"\n");
        ret.append("            value=\"").append((freqNum_is_initialized ? ((freqNum == null ? null : freqNum.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"breedingStatus\"\n");
        ret.append("            value=\"").append((breedingStatus_is_initialized ? ((breedingStatus == null ? null : breedingStatus)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"infectionStatus\"\n");
        ret.append("            value=\"").append((infectionStatus_is_initialized ? ((infectionStatus == null ? null : infectionStatus)) : "[not initialized]")).append("\"/>\n");
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
