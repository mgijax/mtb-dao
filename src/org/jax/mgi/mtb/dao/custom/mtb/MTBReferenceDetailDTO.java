/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceDetailDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.text.DateFormat;
import java.util.Collection;
import java.util.List;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.utils.LabelValueBean;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceDetailDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBReferenceDetailDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    public ReferenceDTO referenceDTO = null;
    private List<LabelValueBean<String,Long>> additionalInfo = null;
    private List otherAccessionIds = null;
    private Collection<MTBStrainTumorSummaryDTO> tumors = null;;

    // ----------------------------------------------------------- Constructors

    public MTBReferenceDetailDTO() {
        ReferenceDAO dao = ReferenceDAO.getInstance();
        referenceDTO = dao.createReferenceDTO();
    }

    public MTBReferenceDetailDTO(ReferenceDTO dto) {
        this.referenceDTO = dto;
    }

    // --------------------------------------------------------- Public Methods

    public void setReferenceKey(long referenceKey) {
        this.referenceDTO.setReferenceKey(referenceKey);
    }

    public void setKey(long key) {
        this.referenceDTO.setReferenceKey(key);
    }

    public long getKey() {
        return this.referenceDTO.getReferenceKey().longValue();
    }


    public void setTitle(String title) {
        this.referenceDTO.setTitle(title);
    }

    public String getTitle() {
        return this.referenceDTO.getTitle();
    }

    public void setTitle2(String title2) {
        this.referenceDTO.setTitle2(title2);
    }

    public String getTitle2() {
        return this.referenceDTO.getTitle2();
    }

    public void setAuthors(String authors) {
        this.referenceDTO.setAuthors(authors);
    }

    public String getAuthors() {
        return this.referenceDTO.getAuthors();
    }

    public void setAuthors2(String authors2) {
        this.referenceDTO.setAuthors2(authors2);
    }

    public String getAuthors2() {
        return this.referenceDTO.getAuthors2();
    }

    public void setJournal(String journal) {
        this.referenceDTO.setJournal(journal);
    }

    public String getJournal() {
        return this.referenceDTO.getJournal();
    }

    public void setVolume(String volume) {
        this.referenceDTO.setVolume(volume);
    }

    public String getVolume() {
        return this.referenceDTO.getVolume();
    }

    public void setIssue(String issue) {
        this.referenceDTO.setIssue(issue);
    }

    public String getIssue() {
        return this.referenceDTO.getIssue();
    }

    public void setPages(String pages) {
        this.referenceDTO.setPages(pages);
    }

    public String getPages() {
        return this.referenceDTO.getPages();
    }

    public void setYear(String year) {
        this.referenceDTO.setYear(year);
    }

    public String getYear() {
        return this.referenceDTO.getYear();
    }

    public void setReferenceDate(String referenceDate) {
        try {
            this.referenceDTO.setReferenceDate(DateFormat.getInstance().parse(referenceDate));
        } catch (Exception e) {}
    }

    public String getReferenceDate() {
        String ret;

        try {
            ret = this.referenceDTO.getReferenceDate().toString();
        } catch (Exception e) {
            ret = null;
        }

        return ret;
    }

    public final void setAdditionalInfo(List<LabelValueBean<String,Long>> addtnlInfo) {
        this.additionalInfo = addtnlInfo;
    }

    public final List getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final boolean getHasAdditionalInfo() {
        boolean ret = false;
        for (LabelValueBean<String,Long> bean : additionalInfo) {
            if (bean.getValue().longValue() > 0) {
                 ret = true;
            }
        }
        return ret;
    }

    public final void setOtherAccessionIds(List otherIds) {
        this.otherAccessionIds = otherIds;
    }

    public final List getOtherAccessionIds() {
        return this.otherAccessionIds;
    }

    public void setAbstractText(String abstractText) {
        this.referenceDTO.setAbstractText(abstractText);
    }

    public String getAbstractText() {
        return this.referenceDTO.getAbstractText();
    }
    
     public void setCodedByDate(String cBDate) {
        try {
            this.referenceDTO.setReferenceDate(DateFormat.getInstance().parse(cBDate));
        } catch (Exception e) {}
    }

    public String getCodecByDate() {
        String ret;

        try {
            ret = this.referenceDTO.getCodedByDate().toString();
        } catch (Exception e) {
            ret = null;
        }

        return ret;
    }
    
    
    

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

    /**
     * @return the tumors
     */
    public Collection<MTBStrainTumorSummaryDTO> getTumors() {
        return tumors;
    }

    /**
     * @param tumors the tumors to set
     */
    public void setTumors(Collection<MTBStrainTumorSummaryDTO> tumors) {
        this.tumors = tumors;
    }
}