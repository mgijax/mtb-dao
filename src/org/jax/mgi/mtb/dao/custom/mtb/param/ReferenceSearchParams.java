/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/ReferenceSearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.param;

import java.util.Date;

/**
 * Encapsulates <code>Reference</code> search parameters.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/ReferenceSearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class ReferenceSearchParams {

    // -------------------------------------------------------------- Constants

    public static int NUMERIC_COMPARE_EQUALS = 0;
    public static int NUMERIC_COMPARE_LESSTHAN = 1;
    public static int NUMERIC_COMPARE_GREATERTHAN = 2;
    public static int NUMERIC_COMPARE_NOTEQUALS = 3;
    public static int STRING_COMPARE_EQUALS = 0;
    public static int STRING_COMPARE_NOTEQUALS = 1;
    public static int STRING_COMPARE_CONTAINS = 2;
    public static int STRING_COMPARE_NOTCONTAINS = 3;
    public static int STRING_COMPARE_STARTSWITH = 4;
    public static String ORDER_BY_JNUMBER="order by jnumber descending";

    // ----------------------------------------------------- Instance Variables

    private long referenceKey;
    private String referenceKeyComparison;
    private String referenceAccessionId;
    private String firstAuthor;
    private String firstAuthorComparison;
    private String authors;
    private String authorsComparison;
    private String journal;
    private String journalComparison;
    private String year;
    private String yearComparison;
    private String volume;
    private String volumeComparison;
    private String pages;
    private String pagesComparison;
    private String title;
    private String titleComparison;
    private boolean isReviewArticle = false;
    private String codedBy;
    private String createDateComparison;
    private Date createDate;
     private String codedByDateComparison;
    private Date codedByDate;
    private String pubYearComparison;
    private int pubYear;
    private int coded =-1;
    private long organ = -1;
    private long tumorClassification = -1;
    private long priority = -2;  // -1 is a vaild priority
    private String orderBy;
    private int maxItems = -1;
    private int indexed = -1;
    private boolean includeRejected = false;
    
    

    // ----------------------------------------------------------- Constructors

    /** Creates a new instance of StrainSearch */
    public ReferenceSearchParams() {
    }

    // --------------------------------------------------------- Public Methods
 
    public long getReferenceKey() {
        return referenceKey;
    }

    public void setReferenceKey(long referenceKey) {
        this.referenceKey = referenceKey;
    }

    public String getReferenceKeyComparison() {
        return referenceKeyComparison;
    }

    public void setReferenceKeyComparison(String referenceKeyComparison) {
        this.referenceKeyComparison = referenceKeyComparison;
    }

    public String getReferenceAccessionId() {
        return referenceAccessionId;
    }

    public void setReferenceAccessionId(String referenceAccessionId) {
        this.referenceAccessionId = referenceAccessionId;
    }

    public String getFirstAuthor() {
        return firstAuthor;
    }

    public void setFirstAuthor(String firstAuthor) {
        this.firstAuthor = firstAuthor;
    }

    public String getFirstAuthorComparison() {
        return firstAuthorComparison;
    }

    public void setFirstAuthorComparison(String firstAuthorComparison) {
        this.firstAuthorComparison = firstAuthorComparison;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getAuthorsComparison() {
        return authorsComparison;
    }

    public void setAuthorsComparison(String authorsComparison) {
        this.authorsComparison = authorsComparison;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getJournalComparison() {
        return journalComparison;
    }

    public void setJournalComparison(String journalComparison) {
        this.journalComparison = journalComparison;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYearComparison() {
        return yearComparison;
    }

    public void setYearComparison(String yearComparison) {
        this.yearComparison = yearComparison;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolumeComparison() {
        return volumeComparison;
    }

    public void setVolumeComparison(String volumeComparison) {
        this.volumeComparison = volumeComparison;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPagesComparison() {
        return pagesComparison;
    }

    public void setPagesComparison(String pagesComparison) {
        this.pagesComparison = pagesComparison;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleComparison() {
        return titleComparison;
    }

    public void setTitleComparison(String titleComparison) {
        this.titleComparison = titleComparison;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

 // it is a review article if the priority = 1
  public boolean getIsReviewArticle() {
    return isReviewArticle;
  }

  public void setIsReviewArticle(boolean isReviewArticle) {
    this.isReviewArticle = isReviewArticle;
  }

  public String getCodedBy() {
    return codedBy;
  }

  public void setCodedBy(String codedBy) {
    this.codedBy = codedBy;
  }

  

  public long getOrgan() {
    return organ;
  }

  public void setOrgan(long organ) {
    this.organ = organ;
  }

  public long getTumorClassification() {
    return tumorClassification;
  }

  public void setTumorClassification(long tumorClassification) {
    this.tumorClassification = tumorClassification;
  }

  public long getPriority() {
    return priority;
  }

  public void setPriority(long priority) {
    this.priority = priority;
  }

  public int getIndexed() {
    return indexed;
  }

  public void setIndexed(int indexed) {
    this.indexed = indexed;
  }

  public String getCreateDateComparison() {
    return createDateComparison;
  }

  public void setCreateDateComparison(String createDateComparison) {
    this.createDateComparison = createDateComparison;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public int getCoded() {
    return coded;
  }

  public void setCoded(int coded) {
    this.coded = coded;
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

    /**
     * @return the codedByDateComparison
     */
    public String getCodedByDateComparison() {
        return codedByDateComparison;
    }

    /**
     * @param codedByDateComparison the codedByDateComparison to set
     */
    public void setCodedByDateComparison(String codedByDateComparison) {
        this.codedByDateComparison = codedByDateComparison;
    }

    /**
     * @return the codedByDate
     */
    public Date getCodedByDate() {
        return codedByDate;
    }

    /**
     * @param codedByDate the codedByDate to set
     */
    public void setCodedByDate(Date codedByDate) {
        this.codedByDate = codedByDate;
    }

    /**
     * @return the pubYearComparison
     */
    public String getPubYearComparison() {
        return pubYearComparison;
    }

    /**
     * @param pubYearComparison the pubYearComparison to set
     */
    public void setPubYearComparison(String pubYearComparison) {
        this.pubYearComparison = pubYearComparison;
    }

    /**
     * @return the pubYear
     */
    public int getPubYear() {
        return pubYear;
    }

    /**
     * @param pubYear the pubYear to set
     */
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
    
    public void setIncludeRejected(boolean include){
        this.includeRejected = include;
    }
    
    public boolean getIncludeRejected(){
        return this.includeRejected;
    }

  
}
