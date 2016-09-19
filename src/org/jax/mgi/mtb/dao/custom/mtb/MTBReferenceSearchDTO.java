/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceSearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Date;
import org.jax.mgi.mtb.dao.gen.TableDTO;

/**
 * A <code>DTO</code> for <code>Reference</code> search data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceSearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBReferenceSearchDTO extends TableDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int key = -1;
    private String accId = null;
    private String authors = null;
    private String title = null;
    private String citation = null;
    private String firstAuthor =  null;
    private String year = null;
    private Long priority = null;
    private String codedBy = null;
    private Date codedByDate = null;
    private String tumorTypes = null;
    private boolean isReviewArticle =false;
    private int tumorTypeAssocs = 0;
    private int tumorFreqAssocs = 0;
    private int strainAssocs = 0;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final void setKey(int k) {
        this.key = k;
    }

    public final int getKey() {
        return this.key;
    }

    public final void setAccId(String id) {
        this.accId = id;
    }

    public final String getAccId() {
        return this.accId;
    }

    public final void setAuthors(String auths) {
        this.authors = auths;
    }

    public final String getAuthors() {
        return this.authors;
    }

    public final void setTitle(String t) {
        this.title = t;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCitation(String cit) {
        this.citation = cit;
    }

    public final String getCitation() {
        return this.citation;
    }

    public final void setFirstAuthor(String fAuth) {
        this.firstAuthor = fAuth;
    }

    public final String getFirstAuthor() {
        return this.firstAuthor;
    }

    public final void setYear(String yr) {
        this.year = yr;
    }

    public final String getYear() {
        return this.year;
    }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public String getCodedBy() {
    return codedBy;
  }

  public void setCodedBy(String codedBy) {
    this.codedBy = codedBy;
  }

  public Date getCodedByDate() {
    return codedByDate;
  }

  public void setCodedByDate(Date codedByDate) {
    this.codedByDate = codedByDate;
  }

  public String getTumorTypes() {
    return tumorTypes;
  }

  public void setTumorTypes(String tumorTypes) {
    this.tumorTypes = tumorTypes;
  }

  public boolean getIsReviewArticle() {
    return isReviewArticle;
  }

  public void setIsReviewArticle(boolean isReviewArticle) {
    this.isReviewArticle = isReviewArticle;
  }


    /**
     * @return the tumorTypeAssocs
     */
    public int getTumorTypeAssocs() {
        return tumorTypeAssocs;
    }

    /**
     * @param tumorTypeAssocs the tumorTypeAssocs to set
     */
    public void setTumorTypeAssocs(int tumorTypeAssocs) {
        this.tumorTypeAssocs = tumorTypeAssocs;
    }

    /**
     * @return the tumorFreqAssocs
     */
    public int getTumorFreqAssocs() {
        return tumorFreqAssocs;
    }

    /**
     * @param tumorFreqAssocs the tumorFreqAssocs to set
     */
    public void setTumorFreqAssocs(int tumorFreqAssocs) {
        this.tumorFreqAssocs = tumorFreqAssocs;
    }

    /**
     * @return the strainAssocs
     */
    public int getStrainAssocs() {
        return strainAssocs;
    }

    /**
     * @param strainAssocs the strainAssocs to set
     */
    public void setStrainAssocs(int strainAssocs) {
        this.strainAssocs = strainAssocs;
    }
}