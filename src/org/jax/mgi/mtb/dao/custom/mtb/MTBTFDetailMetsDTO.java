/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorFrequencyDetailDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jax.mgi.mtb.utils.LabelValueDataBean;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for <code>TumorFrequency</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader $Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTFDetailMetsDTO.java,v 1.1 2009/02/17 17:38:56 sbn Exp $
 */
public class MTBTFDetailMetsDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long tumorFrequencyKey = -1l;
    private String mtbId = null;
    private long organKey = -1l;
    private String organ = null;
    private boolean childRec = false;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public long getTumorFrequencyKey() {
        return tumorFrequencyKey;
    }

    public void setTumorFrequencyKey(long tumorFrequencyKey) {
        this.tumorFrequencyKey = tumorFrequencyKey;
    }

    public String getMtbId() {
        return mtbId;
    }

    public void setMtbId(String mtbId) {
        this.mtbId = mtbId;
    }

    public long getOrganKey() {
        return organKey;
    }

    public void setOrganKey(long organKey) {
        this.organKey = organKey;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public boolean isChildRec() {
        return childRec;
    }

    public void setChildRec(boolean childRec) {
        this.childRec = childRec;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}