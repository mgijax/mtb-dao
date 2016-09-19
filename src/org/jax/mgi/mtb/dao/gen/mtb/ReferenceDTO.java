
package org.jax.mgi.mtb.dao.gen.mtb;
// JDBC Driver used at code generation time: com.mysql.jdbc.Driver
// Generation Time: : Fri Jul 08 13:46:52 EDT 2011

import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


public class ReferenceDTO extends TableDTO
// extends+ 

// extends- 

{

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private Long ReferenceKeyOriginal;
    
    private Long ReferenceKey;
    private boolean ReferenceKey_is_modified = false;
    private boolean ReferenceKey_is_initialized = false;
    
    private String title;
    private boolean title_is_modified = false;
    private boolean title_is_initialized = false;
    
    private String title2;
    private boolean title2_is_modified = false;
    private boolean title2_is_initialized = false;
    
    private String authors;
    private boolean authors_is_modified = false;
    private boolean authors_is_initialized = false;
    
    private String authors2;
    private boolean authors2_is_modified = false;
    private boolean authors2_is_initialized = false;
    
    private String primaryAuthor;
    private boolean primaryAuthor_is_modified = false;
    private boolean primaryAuthor_is_initialized = false;
    
    private String citation;
    private boolean citation_is_modified = false;
    private boolean citation_is_initialized = false;
    
    private String shortCitation;
    private boolean shortCitation_is_modified = false;
    private boolean shortCitation_is_initialized = false;
    
    private String journal;
    private boolean journal_is_modified = false;
    private boolean journal_is_initialized = false;
    
    private String volume;
    private boolean volume_is_modified = false;
    private boolean volume_is_initialized = false;
    
    private String issue;
    private boolean issue_is_modified = false;
    private boolean issue_is_initialized = false;
    
    private String pages;
    private boolean pages_is_modified = false;
    private boolean pages_is_initialized = false;
    
    private String year;
    private boolean year_is_modified = false;
    private boolean year_is_initialized = false;
    
    private Long isReviewArticle;
    private boolean isReviewArticle_is_modified = false;
    private boolean isReviewArticle_is_initialized = false;
    
    private String reviewStatus;
    private boolean reviewStatus_is_modified = false;
    private boolean reviewStatus_is_initialized = false;
    
    private String person;
    private boolean person_is_modified = false;
    private boolean person_is_initialized = false;
    
    private String institution;
    private boolean institution_is_modified = false;
    private boolean institution_is_initialized = false;
    
    private String department;
    private boolean department_is_modified = false;
    private boolean department_is_initialized = false;
    
    private String address1;
    private boolean address1_is_modified = false;
    private boolean address1_is_initialized = false;
    
    private String address2;
    private boolean address2_is_modified = false;
    private boolean address2_is_initialized = false;
    
    private String city;
    private boolean city_is_modified = false;
    private boolean city_is_initialized = false;
    
    private String stateProv;
    private boolean stateProv_is_modified = false;
    private boolean stateProv_is_initialized = false;
    
    private String postalCode;
    private boolean postalCode_is_modified = false;
    private boolean postalCode_is_initialized = false;
    
    private String country;
    private boolean country_is_modified = false;
    private boolean country_is_initialized = false;
    
    private String url;
    private boolean url_is_modified = false;
    private boolean url_is_initialized = false;
    
    private String email;
    private boolean email_is_modified = false;
    private boolean email_is_initialized = false;
    
    private String codedBy;
    private boolean codedBy_is_modified = false;
    private boolean codedBy_is_initialized = false;
    
    private java.util.Date codedByDate;
    private boolean codedByDate_is_modified = false;
    private boolean codedByDate_is_initialized = false;
    
    private String checkedBy;
    private boolean checkedBy_is_modified = false;
    private boolean checkedBy_is_initialized = false;
    
    private String checkedByDate;
    private boolean checkedByDate_is_modified = false;
    private boolean checkedByDate_is_initialized = false;
    
    private Long priority;
    private boolean priority_is_modified = false;
    private boolean priority_is_initialized = false;
    
    private String personalCommunication;
    private boolean personalCommunication_is_modified = false;
    private boolean personalCommunication_is_initialized = false;
    
    private String note;
    private boolean note_is_modified = false;
    private boolean note_is_initialized = false;
    
    private Long MTBDataStatusKey;
    private boolean MTBDataStatusKey_is_modified = false;
    private boolean MTBDataStatusKey_is_initialized = false;
    
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
    
    private java.util.Date referenceDate;
    private boolean referenceDate_is_modified = false;
    private boolean referenceDate_is_initialized = false;
    
    private String abstractText;
    private boolean abstractText_is_modified = false;
    private boolean abstractText_is_initialized = false;
    


    // ----------------------------------------------------------- Constructors

    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    ReferenceDTO() {
        // EMPTY CONSTRUCTOR
    }
    

    // --------------------------------------------------------- Public Methods

    /**
     * Getter method for ReferenceKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of ReferenceKey
     */
    public Long getReferenceKeyOriginal() {
        return ReferenceKeyOriginal; 
    }

    /**
     * Getter method for ReferenceKey.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference._Reference_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
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

        if(this.ReferenceKeyOriginal == null) {
            this.ReferenceKeyOriginal = newVal;
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
     * Getter method for title.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.title
     * <li>column size: 255
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
     * Getter method for title2.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.title2
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of title2
     */
    public String getTitle2() {
        return title2; 
    }

    /**
     * Setter method for title2.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to title2
     */
    public void setTitle2(String newVal) {
        if ((newVal != null && this.title2 != null && (newVal.compareTo(this.title2) == 0)) || 
            (newVal == null && this.title2 == null && title2_is_initialized)) {
            return; 
        } 
        this.title2 = newVal; 

        title2_is_modified = true; 
        title2_is_initialized = true; 
    }

    /**
     * Determines if the title2 has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTitle2Modified() {
        return title2_is_modified; 
    }

    /**
     * Determines if the title2 has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTitle2Initialized() {
        return title2_is_initialized; 
    }

    /**
     * Getter method for authors.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.authors
     * <li>column size: 500
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of authors
     */
    public String getAuthors() {
        return authors; 
    }

    /**
     * Setter method for authors.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to authors
     */
    public void setAuthors(String newVal) {
        if ((newVal != null && this.authors != null && (newVal.compareTo(this.authors) == 0)) || 
            (newVal == null && this.authors == null && authors_is_initialized)) {
            return; 
        } 
        this.authors = newVal; 

        authors_is_modified = true; 
        authors_is_initialized = true; 
    }

    /**
     * Determines if the authors has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAuthorsModified() {
        return authors_is_modified; 
    }

    /**
     * Determines if the authors has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAuthorsInitialized() {
        return authors_is_initialized; 
    }

    /**
     * Getter method for authors2.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.authors2
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of authors2
     */
    public String getAuthors2() {
        return authors2; 
    }

    /**
     * Setter method for authors2.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to authors2
     */
    public void setAuthors2(String newVal) {
        if ((newVal != null && this.authors2 != null && (newVal.compareTo(this.authors2) == 0)) || 
            (newVal == null && this.authors2 == null && authors2_is_initialized)) {
            return; 
        } 
        this.authors2 = newVal; 

        authors2_is_modified = true; 
        authors2_is_initialized = true; 
    }

    /**
     * Determines if the authors2 has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAuthors2Modified() {
        return authors2_is_modified; 
    }

    /**
     * Determines if the authors2 has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAuthors2Initialized() {
        return authors2_is_initialized; 
    }

    /**
     * Getter method for primaryAuthor.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.primaryAuthor
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of primaryAuthor
     */
    public String getPrimaryAuthor() {
        return primaryAuthor; 
    }

    /**
     * Setter method for primaryAuthor.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to primaryAuthor
     */
    public void setPrimaryAuthor(String newVal) {
        if ((newVal != null && this.primaryAuthor != null && (newVal.compareTo(this.primaryAuthor) == 0)) || 
            (newVal == null && this.primaryAuthor == null && primaryAuthor_is_initialized)) {
            return; 
        } 
        this.primaryAuthor = newVal; 

        primaryAuthor_is_modified = true; 
        primaryAuthor_is_initialized = true; 
    }

    /**
     * Determines if the primaryAuthor has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPrimaryAuthorModified() {
        return primaryAuthor_is_modified; 
    }

    /**
     * Determines if the primaryAuthor has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPrimaryAuthorInitialized() {
        return primaryAuthor_is_initialized; 
    }

    /**
     * Getter method for citation.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.citation
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of citation
     */
    public String getCitation() {
        return citation; 
    }

    /**
     * Setter method for citation.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to citation
     */
    public void setCitation(String newVal) {
        if ((newVal != null && this.citation != null && (newVal.compareTo(this.citation) == 0)) || 
            (newVal == null && this.citation == null && citation_is_initialized)) {
            return; 
        } 
        this.citation = newVal; 

        citation_is_modified = true; 
        citation_is_initialized = true; 
    }

    /**
     * Determines if the citation has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCitationModified() {
        return citation_is_modified; 
    }

    /**
     * Determines if the citation has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCitationInitialized() {
        return citation_is_initialized; 
    }

    /**
     * Getter method for shortCitation.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.shortCitation
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of shortCitation
     */
    public String getShortCitation() {
        return shortCitation; 
    }

    /**
     * Setter method for shortCitation.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to shortCitation
     */
    public void setShortCitation(String newVal) {
        if ((newVal != null && this.shortCitation != null && (newVal.compareTo(this.shortCitation) == 0)) || 
            (newVal == null && this.shortCitation == null && shortCitation_is_initialized)) {
            return; 
        } 
        this.shortCitation = newVal; 

        shortCitation_is_modified = true; 
        shortCitation_is_initialized = true; 
    }

    /**
     * Determines if the shortCitation has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isShortCitationModified() {
        return shortCitation_is_modified; 
    }

    /**
     * Determines if the shortCitation has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isShortCitationInitialized() {
        return shortCitation_is_initialized; 
    }

    /**
     * Getter method for journal.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.journal
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of journal
     */
    public String getJournal() {
        return journal; 
    }

    /**
     * Setter method for journal.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to journal
     */
    public void setJournal(String newVal) {
        if ((newVal != null && this.journal != null && (newVal.compareTo(this.journal) == 0)) || 
            (newVal == null && this.journal == null && journal_is_initialized)) {
            return; 
        } 
        this.journal = newVal; 

        journal_is_modified = true; 
        journal_is_initialized = true; 
    }

    /**
     * Determines if the journal has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isJournalModified() {
        return journal_is_modified; 
    }

    /**
     * Determines if the journal has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isJournalInitialized() {
        return journal_is_initialized; 
    }

    /**
     * Getter method for volume.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.volume
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of volume
     */
    public String getVolume() {
        return volume; 
    }

    /**
     * Setter method for volume.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to volume
     */
    public void setVolume(String newVal) {
        if ((newVal != null && this.volume != null && (newVal.compareTo(this.volume) == 0)) || 
            (newVal == null && this.volume == null && volume_is_initialized)) {
            return; 
        } 
        this.volume = newVal; 

        volume_is_modified = true; 
        volume_is_initialized = true; 
    }

    /**
     * Determines if the volume has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isVolumeModified() {
        return volume_is_modified; 
    }

    /**
     * Determines if the volume has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isVolumeInitialized() {
        return volume_is_initialized; 
    }

    /**
     * Getter method for issue.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.issue
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of issue
     */
    public String getIssue() {
        return issue; 
    }

    /**
     * Setter method for issue.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to issue
     */
    public void setIssue(String newVal) {
        if ((newVal != null && this.issue != null && (newVal.compareTo(this.issue) == 0)) || 
            (newVal == null && this.issue == null && issue_is_initialized)) {
            return; 
        } 
        this.issue = newVal; 

        issue_is_modified = true; 
        issue_is_initialized = true; 
    }

    /**
     * Determines if the issue has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIssueModified() {
        return issue_is_modified; 
    }

    /**
     * Determines if the issue has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIssueInitialized() {
        return issue_is_initialized; 
    }

    /**
     * Getter method for pages.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.pages
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of pages
     */
    public String getPages() {
        return pages; 
    }

    /**
     * Setter method for pages.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to pages
     */
    public void setPages(String newVal) {
        if ((newVal != null && this.pages != null && (newVal.compareTo(this.pages) == 0)) || 
            (newVal == null && this.pages == null && pages_is_initialized)) {
            return; 
        } 
        this.pages = newVal; 

        pages_is_modified = true; 
        pages_is_initialized = true; 
    }

    /**
     * Determines if the pages has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPagesModified() {
        return pages_is_modified; 
    }

    /**
     * Determines if the pages has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPagesInitialized() {
        return pages_is_initialized; 
    }

    /**
     * Getter method for year.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.year
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of year
     */
    public String getYear() {
        return year; 
    }

    /**
     * Setter method for year.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to year
     */
    public void setYear(String newVal) {
        if ((newVal != null && this.year != null && (newVal.compareTo(this.year) == 0)) || 
            (newVal == null && this.year == null && year_is_initialized)) {
            return; 
        } 
        this.year = newVal; 

        year_is_modified = true; 
        year_is_initialized = true; 
    }

    /**
     * Determines if the year has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isYearModified() {
        return year_is_modified; 
    }

    /**
     * Determines if the year has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isYearInitialized() {
        return year_is_initialized; 
    }

    /**
     * Getter method for isReviewArticle.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.isReviewArticle
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of isReviewArticle
     */
    public Long getIsReviewArticle() {
        return isReviewArticle; 
    }

    /**
     * Setter method for isReviewArticle.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to isReviewArticle
     */
    public void setIsReviewArticle(Long newVal) {
        if ((newVal != null && this.isReviewArticle != null && (newVal.compareTo(this.isReviewArticle) == 0)) || 
            (newVal == null && this.isReviewArticle == null && isReviewArticle_is_initialized)) {
            return; 
        } 
        this.isReviewArticle = newVal; 

        isReviewArticle_is_modified = true; 
        isReviewArticle_is_initialized = true; 
    }

    /**
     * Setter method for isReviewArticle.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isReviewArticle
     */
    public void setIsReviewArticle(long newVal) {
        setIsReviewArticle(new Long(newVal));
    }

    /**
     * Determines if the isReviewArticle has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isIsReviewArticleModified() {
        return isReviewArticle_is_modified; 
    }

    /**
     * Determines if the isReviewArticle has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isIsReviewArticleInitialized() {
        return isReviewArticle_is_initialized; 
    }

    /**
     * Getter method for reviewStatus.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.reviewStatus
     * <li>column size: 50
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of reviewStatus
     */
    public String getReviewStatus() {
        return reviewStatus; 
    }

    /**
     * Setter method for reviewStatus.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to reviewStatus
     */
    public void setReviewStatus(String newVal) {
        if ((newVal != null && this.reviewStatus != null && (newVal.compareTo(this.reviewStatus) == 0)) || 
            (newVal == null && this.reviewStatus == null && reviewStatus_is_initialized)) {
            return; 
        } 
        this.reviewStatus = newVal; 

        reviewStatus_is_modified = true; 
        reviewStatus_is_initialized = true; 
    }

    /**
     * Determines if the reviewStatus has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isReviewStatusModified() {
        return reviewStatus_is_modified; 
    }

    /**
     * Determines if the reviewStatus has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isReviewStatusInitialized() {
        return reviewStatus_is_initialized; 
    }

    /**
     * Getter method for person.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.person
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of person
     */
    public String getPerson() {
        return person; 
    }

    /**
     * Setter method for person.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to person
     */
    public void setPerson(String newVal) {
        if ((newVal != null && this.person != null && (newVal.compareTo(this.person) == 0)) || 
            (newVal == null && this.person == null && person_is_initialized)) {
            return; 
        } 
        this.person = newVal; 

        person_is_modified = true; 
        person_is_initialized = true; 
    }

    /**
     * Determines if the person has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPersonModified() {
        return person_is_modified; 
    }

    /**
     * Determines if the person has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPersonInitialized() {
        return person_is_initialized; 
    }

    /**
     * Getter method for institution.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.institution
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of institution
     */
    public String getInstitution() {
        return institution; 
    }

    /**
     * Setter method for institution.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to institution
     */
    public void setInstitution(String newVal) {
        if ((newVal != null && this.institution != null && (newVal.compareTo(this.institution) == 0)) || 
            (newVal == null && this.institution == null && institution_is_initialized)) {
            return; 
        } 
        this.institution = newVal; 

        institution_is_modified = true; 
        institution_is_initialized = true; 
    }

    /**
     * Determines if the institution has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isInstitutionModified() {
        return institution_is_modified; 
    }

    /**
     * Determines if the institution has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isInstitutionInitialized() {
        return institution_is_initialized; 
    }

    /**
     * Getter method for department.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.department
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department; 
    }

    /**
     * Setter method for department.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to department
     */
    public void setDepartment(String newVal) {
        if ((newVal != null && this.department != null && (newVal.compareTo(this.department) == 0)) || 
            (newVal == null && this.department == null && department_is_initialized)) {
            return; 
        } 
        this.department = newVal; 

        department_is_modified = true; 
        department_is_initialized = true; 
    }

    /**
     * Determines if the department has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDepartmentModified() {
        return department_is_modified; 
    }

    /**
     * Determines if the department has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDepartmentInitialized() {
        return department_is_initialized; 
    }

    /**
     * Getter method for address1.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.address1
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of address1
     */
    public String getAddress1() {
        return address1; 
    }

    /**
     * Setter method for address1.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to address1
     */
    public void setAddress1(String newVal) {
        if ((newVal != null && this.address1 != null && (newVal.compareTo(this.address1) == 0)) || 
            (newVal == null && this.address1 == null && address1_is_initialized)) {
            return; 
        } 
        this.address1 = newVal; 

        address1_is_modified = true; 
        address1_is_initialized = true; 
    }

    /**
     * Determines if the address1 has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAddress1Modified() {
        return address1_is_modified; 
    }

    /**
     * Determines if the address1 has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAddress1Initialized() {
        return address1_is_initialized; 
    }

    /**
     * Getter method for address2.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.address2
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of address2
     */
    public String getAddress2() {
        return address2; 
    }

    /**
     * Setter method for address2.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to address2
     */
    public void setAddress2(String newVal) {
        if ((newVal != null && this.address2 != null && (newVal.compareTo(this.address2) == 0)) || 
            (newVal == null && this.address2 == null && address2_is_initialized)) {
            return; 
        } 
        this.address2 = newVal; 

        address2_is_modified = true; 
        address2_is_initialized = true; 
    }

    /**
     * Determines if the address2 has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAddress2Modified() {
        return address2_is_modified; 
    }

    /**
     * Determines if the address2 has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAddress2Initialized() {
        return address2_is_initialized; 
    }

    /**
     * Getter method for city.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.city
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of city
     */
    public String getCity() {
        return city; 
    }

    /**
     * Setter method for city.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to city
     */
    public void setCity(String newVal) {
        if ((newVal != null && this.city != null && (newVal.compareTo(this.city) == 0)) || 
            (newVal == null && this.city == null && city_is_initialized)) {
            return; 
        } 
        this.city = newVal; 

        city_is_modified = true; 
        city_is_initialized = true; 
    }

    /**
     * Determines if the city has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCityModified() {
        return city_is_modified; 
    }

    /**
     * Determines if the city has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCityInitialized() {
        return city_is_initialized; 
    }

    /**
     * Getter method for stateProv.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.stateProv
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of stateProv
     */
    public String getStateProv() {
        return stateProv; 
    }

    /**
     * Setter method for stateProv.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to stateProv
     */
    public void setStateProv(String newVal) {
        if ((newVal != null && this.stateProv != null && (newVal.compareTo(this.stateProv) == 0)) || 
            (newVal == null && this.stateProv == null && stateProv_is_initialized)) {
            return; 
        } 
        this.stateProv = newVal; 

        stateProv_is_modified = true; 
        stateProv_is_initialized = true; 
    }

    /**
     * Determines if the stateProv has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isStateProvModified() {
        return stateProv_is_modified; 
    }

    /**
     * Determines if the stateProv has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isStateProvInitialized() {
        return stateProv_is_initialized; 
    }

    /**
     * Getter method for postalCode.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.postalCode
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of postalCode
     */
    public String getPostalCode() {
        return postalCode; 
    }

    /**
     * Setter method for postalCode.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to postalCode
     */
    public void setPostalCode(String newVal) {
        if ((newVal != null && this.postalCode != null && (newVal.compareTo(this.postalCode) == 0)) || 
            (newVal == null && this.postalCode == null && postalCode_is_initialized)) {
            return; 
        } 
        this.postalCode = newVal; 

        postalCode_is_modified = true; 
        postalCode_is_initialized = true; 
    }

    /**
     * Determines if the postalCode has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPostalCodeModified() {
        return postalCode_is_modified; 
    }

    /**
     * Determines if the postalCode has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPostalCodeInitialized() {
        return postalCode_is_initialized; 
    }

    /**
     * Getter method for country.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.country
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of country
     */
    public String getCountry() {
        return country; 
    }

    /**
     * Setter method for country.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to country
     */
    public void setCountry(String newVal) {
        if ((newVal != null && this.country != null && (newVal.compareTo(this.country) == 0)) || 
            (newVal == null && this.country == null && country_is_initialized)) {
            return; 
        } 
        this.country = newVal; 

        country_is_modified = true; 
        country_is_initialized = true; 
    }

    /**
     * Determines if the country has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCountryModified() {
        return country_is_modified; 
    }

    /**
     * Determines if the country has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCountryInitialized() {
        return country_is_initialized; 
    }

    /**
     * Getter method for url.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.url
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
     * Getter method for email.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.email
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
     * Getter method for codedBy.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.codedBy
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of codedBy
     */
    public String getCodedBy() {
        return codedBy; 
    }

    /**
     * Setter method for codedBy.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to codedBy
     */
    public void setCodedBy(String newVal) {
        if ((newVal != null && this.codedBy != null && (newVal.compareTo(this.codedBy) == 0)) || 
            (newVal == null && this.codedBy == null && codedBy_is_initialized)) {
            return; 
        } 
        this.codedBy = newVal; 

        codedBy_is_modified = true; 
        codedBy_is_initialized = true; 
    }

    /**
     * Determines if the codedBy has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCodedByModified() {
        return codedBy_is_modified; 
    }

    /**
     * Determines if the codedBy has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCodedByInitialized() {
        return codedBy_is_initialized; 
    }

    /**
     * Getter method for codedByDate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.codedBy_date
     * <li>column size: 19
     * <li>jdbc type returned by the driver: Types.TIMESTAMP
     * </ul>
     *
     * @return the value of codedByDate
     */
    public java.util.Date getCodedByDate() {
        if (codedByDate == null) {
            return null;
        }
        return (java.util.Date)codedByDate.clone();
    }

    /**
     * Setter method for codedByDate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to codedByDate
     */
    public void setCodedByDate(java.util.Date newVal) {
        if ((newVal != null && this.codedByDate != null && (newVal.compareTo(this.codedByDate) == 0)) || 
            (newVal == null && this.codedByDate == null && codedByDate_is_initialized)) {
            return; 
        } 
        try {
            this.codedByDate = (java.util.Date)newVal.clone();
        } catch (Exception e) {
            // do nothing
        }

        codedByDate_is_modified = true; 
        codedByDate_is_initialized = true; 
    }

    /**
     * Setter method for codedByDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to codedByDate
     */
    public void setCodedByDate(long newVal) {
        setCodedByDate(new java.util.Date(newVal));
    }

    /**
     * Determines if the codedByDate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCodedByDateModified() {
        return codedByDate_is_modified; 
    }

    /**
     * Determines if the codedByDate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCodedByDateInitialized() {
        return codedByDate_is_initialized; 
    }

    /**
     * Getter method for checkedBy.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.checkedBy
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of checkedBy
     */
    public String getCheckedBy() {
        return checkedBy; 
    }

    /**
     * Setter method for checkedBy.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to checkedBy
     */
    public void setCheckedBy(String newVal) {
        if ((newVal != null && this.checkedBy != null && (newVal.compareTo(this.checkedBy) == 0)) || 
            (newVal == null && this.checkedBy == null && checkedBy_is_initialized)) {
            return; 
        } 
        this.checkedBy = newVal; 

        checkedBy_is_modified = true; 
        checkedBy_is_initialized = true; 
    }

    /**
     * Determines if the checkedBy has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCheckedByModified() {
        return checkedBy_is_modified; 
    }

    /**
     * Determines if the checkedBy has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCheckedByInitialized() {
        return checkedBy_is_initialized; 
    }

    /**
     * Getter method for checkedByDate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.checkedBy_date
     * <li>column size: 255
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of checkedByDate
     */
    public String getCheckedByDate() {
        return checkedByDate; 
    }

    /**
     * Setter method for checkedByDate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to checkedByDate
     */
    public void setCheckedByDate(String newVal) {
        if ((newVal != null && this.checkedByDate != null && (newVal.compareTo(this.checkedByDate) == 0)) || 
            (newVal == null && this.checkedByDate == null && checkedByDate_is_initialized)) {
            return; 
        } 
        this.checkedByDate = newVal; 

        checkedByDate_is_modified = true; 
        checkedByDate_is_initialized = true; 
    }

    /**
     * Determines if the checkedByDate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isCheckedByDateModified() {
        return checkedByDate_is_modified; 
    }

    /**
     * Determines if the checkedByDate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isCheckedByDateInitialized() {
        return checkedByDate_is_initialized; 
    }

    /**
     * Getter method for priority.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.priority
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of priority
     */
    public Long getPriority() {
        return priority; 
    }

    /**
     * Setter method for priority.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to priority
     */
    public void setPriority(Long newVal) {
        if ((newVal != null && this.priority != null && (newVal.compareTo(this.priority) == 0)) || 
            (newVal == null && this.priority == null && priority_is_initialized)) {
            return; 
        } 
        this.priority = newVal; 

        priority_is_modified = true; 
        priority_is_initialized = true; 
    }

    /**
     * Setter method for priority.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to priority
     */
    public void setPriority(long newVal) {
        setPriority(new Long(newVal));
    }

    /**
     * Determines if the priority has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPriorityModified() {
        return priority_is_modified; 
    }

    /**
     * Determines if the priority has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPriorityInitialized() {
        return priority_is_initialized; 
    }

    /**
     * Getter method for personalCommunication.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.personalCommunication
     * <li>column size: 10
     * <li>jdbc type returned by the driver: Types.CHAR
     * </ul>
     *
     * @return the value of personalCommunication
     */
    public String getPersonalCommunication() {
        return personalCommunication; 
    }

    /**
     * Setter method for personalCommunication.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to personalCommunication
     */
    public void setPersonalCommunication(String newVal) {
        if ((newVal != null && this.personalCommunication != null && (newVal.compareTo(this.personalCommunication) == 0)) || 
            (newVal == null && this.personalCommunication == null && personalCommunication_is_initialized)) {
            return; 
        } 
        this.personalCommunication = newVal; 

        personalCommunication_is_modified = true; 
        personalCommunication_is_initialized = true; 
    }

    /**
     * Determines if the personalCommunication has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPersonalCommunicationModified() {
        return personalCommunication_is_modified; 
    }

    /**
     * Determines if the personalCommunication has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPersonalCommunicationInitialized() {
        return personalCommunication_is_initialized; 
    }

    /**
     * Getter method for note.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.note
     * <li>column size: 500
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
     * Getter method for MTBDataStatusKey.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference._MTBDataStatus_key
     * <li>column size: 18
     * <li>jdbc type returned by the driver: Types.DECIMAL
     * </ul>
     *
     * @return the value of MTBDataStatusKey
     */
    public Long getMTBDataStatusKey() {
        return MTBDataStatusKey; 
    }

    /**
     * Setter method for MTBDataStatusKey.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to MTBDataStatusKey
     */
    public void setMTBDataStatusKey(Long newVal) {
        if ((newVal != null && this.MTBDataStatusKey != null && (newVal.compareTo(this.MTBDataStatusKey) == 0)) || 
            (newVal == null && this.MTBDataStatusKey == null && MTBDataStatusKey_is_initialized)) {
            return; 
        } 
        this.MTBDataStatusKey = newVal; 

        MTBDataStatusKey_is_modified = true; 
        MTBDataStatusKey_is_initialized = true; 
    }

    /**
     * Setter method for MTBDataStatusKey.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to MTBDataStatusKey
     */
    public void setMTBDataStatusKey(long newVal) {
        setMTBDataStatusKey(new Long(newVal));
    }

    /**
     * Determines if the MTBDataStatusKey has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isMTBDataStatusKeyModified() {
        return MTBDataStatusKey_is_modified; 
    }

    /**
     * Determines if the MTBDataStatusKey has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isMTBDataStatusKeyInitialized() {
        return MTBDataStatusKey_is_initialized; 
    }

    /**
     * Getter method for createUser.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.create_user
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
     * <li>full name: Reference.create_date
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
     * <li>full name: Reference.update_user
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
     * <li>full name: Reference.update_date
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
     * Getter method for referenceDate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.reference_date
     * <li>column size: 19
     * <li>jdbc type returned by the driver: Types.TIMESTAMP
     * </ul>
     *
     * @return the value of referenceDate
     */
    public java.util.Date getReferenceDate() {
        if (referenceDate == null) {
            return null;
        }
        return (java.util.Date)referenceDate.clone();
    }

    /**
     * Setter method for referenceDate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to referenceDate
     */
    public void setReferenceDate(java.util.Date newVal) {
        if ((newVal != null && this.referenceDate != null && (newVal.compareTo(this.referenceDate) == 0)) || 
            (newVal == null && this.referenceDate == null && referenceDate_is_initialized)) {
            return; 
        } 
        try {
            this.referenceDate = (java.util.Date)newVal.clone();
        } catch (Exception e) {
            // do nothing
        }

        referenceDate_is_modified = true; 
        referenceDate_is_initialized = true; 
    }

    /**
     * Setter method for referenceDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to referenceDate
     */
    public void setReferenceDate(long newVal) {
        setReferenceDate(new java.util.Date(newVal));
    }

    /**
     * Determines if the referenceDate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isReferenceDateModified() {
        return referenceDate_is_modified; 
    }

    /**
     * Determines if the referenceDate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isReferenceDateInitialized() {
        return referenceDate_is_initialized; 
    }

    /**
     * Getter method for abstractText.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: Reference.abstractText
     * <li>column size: 2147483647
     * <li>jdbc type returned by the driver: Types.LONGVARCHAR
     * </ul>
     *
     * @return the value of abstractText
     */
    public String getAbstractText() {
        return abstractText; 
    }

    /**
     * Setter method for abstractText.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to abstractText
     */
    public void setAbstractText(String newVal) {
        if ((newVal != null && this.abstractText != null && (newVal.compareTo(this.abstractText) == 0)) || 
            (newVal == null && this.abstractText == null && abstractText_is_initialized)) {
            return; 
        } 
        this.abstractText = newVal; 

        abstractText_is_modified = true; 
        abstractText_is_initialized = true; 
    }

    /**
     * Determines if the abstractText has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isAbstractTextModified() {
        return abstractText_is_modified; 
    }

    /**
     * Determines if the abstractText has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isAbstractTextInitialized() {
        return abstractText_is_initialized; 
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return ReferenceKey_is_modified || 
     title_is_modified || 
     title2_is_modified || 
     authors_is_modified || 
     authors2_is_modified || 
     primaryAuthor_is_modified || 
     citation_is_modified || 
     shortCitation_is_modified || 
     journal_is_modified || 
     volume_is_modified || 
     issue_is_modified || 
     pages_is_modified || 
     year_is_modified || 
     isReviewArticle_is_modified || 
     reviewStatus_is_modified || 
     person_is_modified || 
     institution_is_modified || 
     department_is_modified || 
     address1_is_modified || 
     address2_is_modified || 
     city_is_modified || 
     stateProv_is_modified || 
     postalCode_is_modified || 
     country_is_modified || 
     url_is_modified || 
     email_is_modified || 
     codedBy_is_modified || 
     codedByDate_is_modified || 
     checkedBy_is_modified || 
     checkedByDate_is_modified || 
     priority_is_modified || 
     personalCommunication_is_modified || 
     note_is_modified || 
     MTBDataStatusKey_is_modified || 
     createUser_is_modified || 
     createDate_is_modified || 
     updateUser_is_modified || 
     updateDate_is_modified || 
     referenceDate_is_modified || 
     abstractText_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        ReferenceKey_is_modified = false;
        title_is_modified = false;
        title2_is_modified = false;
        authors_is_modified = false;
        authors2_is_modified = false;
        primaryAuthor_is_modified = false;
        citation_is_modified = false;
        shortCitation_is_modified = false;
        journal_is_modified = false;
        volume_is_modified = false;
        issue_is_modified = false;
        pages_is_modified = false;
        year_is_modified = false;
        isReviewArticle_is_modified = false;
        reviewStatus_is_modified = false;
        person_is_modified = false;
        institution_is_modified = false;
        department_is_modified = false;
        address1_is_modified = false;
        address2_is_modified = false;
        city_is_modified = false;
        stateProv_is_modified = false;
        postalCode_is_modified = false;
        country_is_modified = false;
        url_is_modified = false;
        email_is_modified = false;
        codedBy_is_modified = false;
        codedByDate_is_modified = false;
        checkedBy_is_modified = false;
        checkedByDate_is_modified = false;
        priority_is_modified = false;
        personalCommunication_is_modified = false;
        note_is_modified = false;
        MTBDataStatusKey_is_modified = false;
        createUser_is_modified = false;
        createDate_is_modified = false;
        updateUser_is_modified = false;
        updateDate_is_modified = false;
        referenceDate_is_modified = false;
        abstractText_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(ReferenceDTO bean) {
        setReferenceKey(bean.getReferenceKey());
        setTitle(bean.getTitle());
        setTitle2(bean.getTitle2());
        setAuthors(bean.getAuthors());
        setAuthors2(bean.getAuthors2());
        setPrimaryAuthor(bean.getPrimaryAuthor());
        setCitation(bean.getCitation());
        setShortCitation(bean.getShortCitation());
        setJournal(bean.getJournal());
        setVolume(bean.getVolume());
        setIssue(bean.getIssue());
        setPages(bean.getPages());
        setYear(bean.getYear());
        setIsReviewArticle(bean.getIsReviewArticle());
        setReviewStatus(bean.getReviewStatus());
        setPerson(bean.getPerson());
        setInstitution(bean.getInstitution());
        setDepartment(bean.getDepartment());
        setAddress1(bean.getAddress1());
        setAddress2(bean.getAddress2());
        setCity(bean.getCity());
        setStateProv(bean.getStateProv());
        setPostalCode(bean.getPostalCode());
        setCountry(bean.getCountry());
        setUrl(bean.getUrl());
        setEmail(bean.getEmail());
        setCodedBy(bean.getCodedBy());
        setCodedByDate(bean.getCodedByDate());
        setCheckedBy(bean.getCheckedBy());
        setCheckedByDate(bean.getCheckedByDate());
        setPriority(bean.getPriority());
        setPersonalCommunication(bean.getPersonalCommunication());
        setNote(bean.getNote());
        setMTBDataStatusKey(bean.getMTBDataStatusKey());
        setCreateUser(bean.getCreateUser());
        setCreateDate(bean.getCreateDate());
        setUpdateUser(bean.getUpdateUser());
        setUpdateDate(bean.getUpdateDate());
        setReferenceDate(bean.getReferenceDate());
        setAbstractText(bean.getAbstractText());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
            ret.append("\n[Reference] ");
            ret.append("\n - Reference._Reference_key = ").append((ReferenceKey_is_initialized ? ("[" + (ReferenceKey == null ? null : ReferenceKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.title = ").append((title_is_initialized ? ("[" + (title == null ? null : title) + "]") : "not initialized"));
            ret.append("\n - Reference.title2 = ").append((title2_is_initialized ? ("[" + (title2 == null ? null : title2) + "]") : "not initialized"));
            ret.append("\n - Reference.authors = ").append((authors_is_initialized ? ("[" + (authors == null ? null : authors) + "]") : "not initialized"));
            ret.append("\n - Reference.authors2 = ").append((authors2_is_initialized ? ("[" + (authors2 == null ? null : authors2) + "]") : "not initialized"));
            ret.append("\n - Reference.primaryAuthor = ").append((primaryAuthor_is_initialized ? ("[" + (primaryAuthor == null ? null : primaryAuthor) + "]") : "not initialized"));
            ret.append("\n - Reference.citation = ").append((citation_is_initialized ? ("[" + (citation == null ? null : citation) + "]") : "not initialized"));
            ret.append("\n - Reference.shortCitation = ").append((shortCitation_is_initialized ? ("[" + (shortCitation == null ? null : shortCitation) + "]") : "not initialized"));
            ret.append("\n - Reference.journal = ").append((journal_is_initialized ? ("[" + (journal == null ? null : journal) + "]") : "not initialized"));
            ret.append("\n - Reference.volume = ").append((volume_is_initialized ? ("[" + (volume == null ? null : volume) + "]") : "not initialized"));
            ret.append("\n - Reference.issue = ").append((issue_is_initialized ? ("[" + (issue == null ? null : issue) + "]") : "not initialized"));
            ret.append("\n - Reference.pages = ").append((pages_is_initialized ? ("[" + (pages == null ? null : pages) + "]") : "not initialized"));
            ret.append("\n - Reference.year = ").append((year_is_initialized ? ("[" + (year == null ? null : year) + "]") : "not initialized"));
            ret.append("\n - Reference.isReviewArticle = ").append((isReviewArticle_is_initialized ? ("[" + (isReviewArticle == null ? null : isReviewArticle.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.reviewStatus = ").append((reviewStatus_is_initialized ? ("[" + (reviewStatus == null ? null : reviewStatus) + "]") : "not initialized"));
            ret.append("\n - Reference.person = ").append((person_is_initialized ? ("[" + (person == null ? null : person) + "]") : "not initialized"));
            ret.append("\n - Reference.institution = ").append((institution_is_initialized ? ("[" + (institution == null ? null : institution) + "]") : "not initialized"));
            ret.append("\n - Reference.department = ").append((department_is_initialized ? ("[" + (department == null ? null : department) + "]") : "not initialized"));
            ret.append("\n - Reference.address1 = ").append((address1_is_initialized ? ("[" + (address1 == null ? null : address1) + "]") : "not initialized"));
            ret.append("\n - Reference.address2 = ").append((address2_is_initialized ? ("[" + (address2 == null ? null : address2) + "]") : "not initialized"));
            ret.append("\n - Reference.city = ").append((city_is_initialized ? ("[" + (city == null ? null : city) + "]") : "not initialized"));
            ret.append("\n - Reference.stateProv = ").append((stateProv_is_initialized ? ("[" + (stateProv == null ? null : stateProv) + "]") : "not initialized"));
            ret.append("\n - Reference.postalCode = ").append((postalCode_is_initialized ? ("[" + (postalCode == null ? null : postalCode) + "]") : "not initialized"));
            ret.append("\n - Reference.country = ").append((country_is_initialized ? ("[" + (country == null ? null : country) + "]") : "not initialized"));
            ret.append("\n - Reference.url = ").append((url_is_initialized ? ("[" + (url == null ? null : url) + "]") : "not initialized"));
            ret.append("\n - Reference.email = ").append((email_is_initialized ? ("[" + (email == null ? null : email) + "]") : "not initialized"));
            ret.append("\n - Reference.codedBy = ").append((codedBy_is_initialized ? ("[" + (codedBy == null ? null : codedBy) + "]") : "not initialized"));
            ret.append("\n - Reference.codedBy_date = ").append((codedByDate_is_initialized ? ("[" + (codedByDate == null ? null : codedByDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.checkedBy = ").append((checkedBy_is_initialized ? ("[" + (checkedBy == null ? null : checkedBy) + "]") : "not initialized"));
            ret.append("\n - Reference.checkedBy_date = ").append((checkedByDate_is_initialized ? ("[" + (checkedByDate == null ? null : checkedByDate) + "]") : "not initialized"));
            ret.append("\n - Reference.priority = ").append((priority_is_initialized ? ("[" + (priority == null ? null : priority.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.personalCommunication = ").append((personalCommunication_is_initialized ? ("[" + (personalCommunication == null ? null : personalCommunication) + "]") : "not initialized"));
            ret.append("\n - Reference.note = ").append((note_is_initialized ? ("[" + (note == null ? null : note) + "]") : "not initialized"));
            ret.append("\n - Reference._MTBDataStatus_key = ").append((MTBDataStatusKey_is_initialized ? ("[" + (MTBDataStatusKey == null ? null : MTBDataStatusKey.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.create_user = ").append((createUser_is_initialized ? ("[" + (createUser == null ? null : createUser) + "]") : "not initialized"));
            ret.append("\n - Reference.create_date = ").append((createDate_is_initialized ? ("[" + (createDate == null ? null : createDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.update_user = ").append((updateUser_is_initialized ? ("[" + (updateUser == null ? null : updateUser) + "]") : "not initialized"));
            ret.append("\n - Reference.update_date = ").append((updateDate_is_initialized ? ("[" + (updateDate == null ? null : updateDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.reference_date = ").append((referenceDate_is_initialized ? ("[" + (referenceDate == null ? null : referenceDate.toString()) + "]") : "not initialized"));
            ret.append("\n - Reference.abstractText = ").append((abstractText_is_initialized ? ("[" + (abstractText == null ? null : abstractText) + "]") : "not initialized"));
        return ret.toString();
    }

    /**
     * Returns the object string representation as XML.
     *
     * @return the object as an XML string
     */
    public String toXML() {
        StringBuffer ret = new StringBuffer();
        ret.append("<table name=\"Reference\">\n");
        ret.append("    <column name=\"_Reference_key\"\n");
        ret.append("            value=\"").append((ReferenceKey_is_initialized ? ((ReferenceKey == null ? null : ReferenceKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"title\"\n");
        ret.append("            value=\"").append((title_is_initialized ? ((title == null ? null : title)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"title2\"\n");
        ret.append("            value=\"").append((title2_is_initialized ? ((title2 == null ? null : title2)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"authors\"\n");
        ret.append("            value=\"").append((authors_is_initialized ? ((authors == null ? null : authors)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"authors2\"\n");
        ret.append("            value=\"").append((authors2_is_initialized ? ((authors2 == null ? null : authors2)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"primaryAuthor\"\n");
        ret.append("            value=\"").append((primaryAuthor_is_initialized ? ((primaryAuthor == null ? null : primaryAuthor)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"citation\"\n");
        ret.append("            value=\"").append((citation_is_initialized ? ((citation == null ? null : citation)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"shortCitation\"\n");
        ret.append("            value=\"").append((shortCitation_is_initialized ? ((shortCitation == null ? null : shortCitation)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"journal\"\n");
        ret.append("            value=\"").append((journal_is_initialized ? ((journal == null ? null : journal)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"volume\"\n");
        ret.append("            value=\"").append((volume_is_initialized ? ((volume == null ? null : volume)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"issue\"\n");
        ret.append("            value=\"").append((issue_is_initialized ? ((issue == null ? null : issue)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"pages\"\n");
        ret.append("            value=\"").append((pages_is_initialized ? ((pages == null ? null : pages)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"year\"\n");
        ret.append("            value=\"").append((year_is_initialized ? ((year == null ? null : year)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"isReviewArticle\"\n");
        ret.append("            value=\"").append((isReviewArticle_is_initialized ? ((isReviewArticle == null ? null : isReviewArticle.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"reviewStatus\"\n");
        ret.append("            value=\"").append((reviewStatus_is_initialized ? ((reviewStatus == null ? null : reviewStatus)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"person\"\n");
        ret.append("            value=\"").append((person_is_initialized ? ((person == null ? null : person)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"institution\"\n");
        ret.append("            value=\"").append((institution_is_initialized ? ((institution == null ? null : institution)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"department\"\n");
        ret.append("            value=\"").append((department_is_initialized ? ((department == null ? null : department)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"address1\"\n");
        ret.append("            value=\"").append((address1_is_initialized ? ((address1 == null ? null : address1)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"address2\"\n");
        ret.append("            value=\"").append((address2_is_initialized ? ((address2 == null ? null : address2)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"city\"\n");
        ret.append("            value=\"").append((city_is_initialized ? ((city == null ? null : city)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"stateProv\"\n");
        ret.append("            value=\"").append((stateProv_is_initialized ? ((stateProv == null ? null : stateProv)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"postalCode\"\n");
        ret.append("            value=\"").append((postalCode_is_initialized ? ((postalCode == null ? null : postalCode)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"country\"\n");
        ret.append("            value=\"").append((country_is_initialized ? ((country == null ? null : country)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"url\"\n");
        ret.append("            value=\"").append((url_is_initialized ? ((url == null ? null : url)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"email\"\n");
        ret.append("            value=\"").append((email_is_initialized ? ((email == null ? null : email)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"codedBy\"\n");
        ret.append("            value=\"").append((codedBy_is_initialized ? ((codedBy == null ? null : codedBy)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"codedBy_date\"\n");
        ret.append("            value=\"").append((codedByDate_is_initialized ? ((codedByDate == null ? null : codedByDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"checkedBy\"\n");
        ret.append("            value=\"").append((checkedBy_is_initialized ? ((checkedBy == null ? null : checkedBy)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"checkedBy_date\"\n");
        ret.append("            value=\"").append((checkedByDate_is_initialized ? ((checkedByDate == null ? null : checkedByDate)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"priority\"\n");
        ret.append("            value=\"").append((priority_is_initialized ? ((priority == null ? null : priority.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"personalCommunication\"\n");
        ret.append("            value=\"").append((personalCommunication_is_initialized ? ((personalCommunication == null ? null : personalCommunication)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"note\"\n");
        ret.append("            value=\"").append((note_is_initialized ? ((note == null ? null : note)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"_MTBDataStatus_key\"\n");
        ret.append("            value=\"").append((MTBDataStatusKey_is_initialized ? ((MTBDataStatusKey == null ? null : MTBDataStatusKey.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_user\"\n");
        ret.append("            value=\"").append((createUser_is_initialized ? ((createUser == null ? null : createUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"create_date\"\n");
        ret.append("            value=\"").append((createDate_is_initialized ? ((createDate == null ? null : createDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_user\"\n");
        ret.append("            value=\"").append((updateUser_is_initialized ? ((updateUser == null ? null : updateUser)) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"update_date\"\n");
        ret.append("            value=\"").append((updateDate_is_initialized ? ((updateDate == null ? null : updateDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"reference_date\"\n");
        ret.append("            value=\"").append((referenceDate_is_initialized ? ((referenceDate == null ? null : referenceDate.toString())) : "[not initialized]")).append("\"/>\n");
        ret.append("    <column name=\"abstractText\"\n");
        ret.append("            value=\"").append((abstractText_is_initialized ? ((abstractText == null ? null : abstractText)) : "[not initialized]")).append("\"/>\n");
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
