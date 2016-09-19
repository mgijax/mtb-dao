/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencyPathologySummaryDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A <code>DTO</code> for associated pathology data for
 * <code>TumorFrequency</code> records.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencyPathologySummaryDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBTumorFrequencyPathologySummaryDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private int pathKey = -1;
    private int pathologistKey = -1;
    private int contributorKey = -1;
    private String ageAtNecropsy = null;
    private String description = null;
    private String note = null;
    private Collection<MTBPathologyImageHelperDTO> images = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public void setPathKey(int key) {
        this.pathKey = key;
    }

    public int getPathKey() {
        return this.pathKey;
    }

    public void setAgeAtNecropsy(String age) {
        this.ageAtNecropsy = age;
    }

    public String getAgeAtNecropsy() {
        return this.ageAtNecropsy;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }

    public void setNote(String n) {
        this.note = n;
    }

    public String getNote() {
        return this.note;
    }

    public void setImages(Collection<MTBPathologyImageHelperDTO> images) {
        this.images = images;
    }

    public Collection<MTBPathologyImageHelperDTO> getImages() {
        return this.images;
    }

    public void addImage(MTBPathologyImageHelperDTO image) {
        if (this.images == null) {
            images = new ArrayList<MTBPathologyImageHelperDTO>();
        }

        images.add(image);
    }

    public int getPathologistKey() {
        return pathologistKey;
    }

    public void setPathologistKey(int pathologistKey) {
        this.pathologistKey = pathologistKey;
    }

    public int getContributorKey() {
        return contributorKey;
    }

    public void setContributorKey(int contributorKey) {
        this.contributorKey = contributorKey;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}