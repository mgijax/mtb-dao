/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridTumorFrequencyDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridTumorFrequencyDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridTumorFrequencyDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private long nTumorFrequencyKey = -1;
    private double dFrequency = 0.0;
    private String strIncidence = null;

    // ----------------------------------------------------------- Constructors

    public MTBTFGridTumorFrequencyDTO() {
    }

    // --------------------------------------------------------- Public Methods

    public void setTumorFrequency(long key) {
        this.nTumorFrequencyKey = key;
    }

    public long getTumorFrequencyKey() {
        return this.nTumorFrequencyKey;
    }

    public void setIncidence(String incidence) {
        this.strIncidence = incidence;
    }

    public String getIncidence() {
        return this.strIncidence;
    }

    public void setFrequency(double freq) {
        this.dFrequency = freq;
    }

    public double getFrequency() {
        return this.dFrequency;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("MTBTFGridTumorFrequencyDTO [").append(nTumorFrequencyKey);
        sb.append(',').append(dFrequency).append(',').append(strIncidence);
        sb.append(']');
        return sb.toString();
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
