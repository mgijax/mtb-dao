/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganTFDetail.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganTFDetail.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridOrganTFDetail {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long lOrganKey = -1;
    private String strOrganName = null;
    private int nCount = 0;
    private double dTotal = 0.0;
    private double dHighest = 0.0;
    private List<Long> listTFKeys = null;
    private String strIncidenceHighest;
    private boolean bIncidenceHighest = false;
    private double dIncidenceHighest = 0.0;


    // ----------------------------------------------------------- Constructors

    public MTBTFGridOrganTFDetail() {
        listTFKeys = new ArrayList<Long>();
    }

    // --------------------------------------------------------- Public Methods

    public void setOrganKey(long key) {
        this.lOrganKey = key;
    }

    public long getOrganKey() {
        return this.lOrganKey;
    }

    public String getOrganKeyStr() {
        return this.lOrganKey + "";
    }

    public void setOrganName(String name) {
        this.strOrganName = name;
    }

    public String getOrganName() {
        return this.strOrganName;
    }

    public void setCount(int n) {
        this.nCount = n;
    }

    public int getCount() {
        return this.nCount;
    }

    public void setTotal(double t) {
        this.dTotal = t;
    }

    public double getTotal() {
        return this.dTotal;
    }

    public void addFrequency(MTBTFGridTumorFrequencyDTO dto) {
        if (dto == null) {
            return;
        }

        // increment the count
        this.nCount++;

        // increment the total
        this.setTotal(this.getTotal() + dto.getFrequency());

        // add the frequency key, java autoboxing used
        this.listTFKeys.add(dto.getTumorFrequencyKey());

        // determine if the highest frequency was via the incidence
        // or the freqNum
        if (Character.isLetter(dto.getIncidence().charAt(0))) {
            if (dto.getFrequency() > dHighest) {
                dIncidenceHighest = dto.getFrequency();
                strIncidenceHighest = dto.getIncidence();
            }
        } else {
            // determine the highest
            if (dto.getFrequency() > dHighest) {
                dHighest = dto.getFrequency();
            }
        }
    }

    public boolean getNoTumors() {
        return ((this.nCount > 0) && (this.dTotal == 0.0));
    }

    public String getFrequencyAvg() {
        String strRet = "";

        if (nCount > 0) {
            if (dTotal == 0.0) {
                strRet = "0";
            } else {
                double freq = dTotal / nCount;
                NumberFormat numberFormatter = new DecimalFormat("0.0");
                strRet = numberFormatter.format(freq);
            }
        }

        return strRet;
    }

    public String getFrequencyHighest() {
        String strRet = "";

        if (nCount > 0) {
            if (dTotal == 0.0) {
                strRet = "0.00";
            } else {
                double freq = dHighest;
                NumberFormat numberFormatter = new DecimalFormat("0.0");
                strRet = numberFormatter.format(freq);
            }
        }

        return strRet;
    }

    public String getTFKeys() {
        String strRet = "";

        if (this.listTFKeys.size() > 0) {
            strRet = DAOUtils.collectionToString(this.listTFKeys, ",", "");
        }

        return strRet;
    }


/*
# "Very High" - includes frequencies reported in the literature as being between >80% and 100% as well as frequnecies reported to be "very high"
# "High" - includes frequencies reported in the literature as being between >50% and 80% as well as frequencies reported to be "high"
# "Moderate" - includes frequencies reported in the literature as being between >20% and 50% as well as frequencies reported to be "moderate"
# "Low" - includes frequencies reported in the literature as being between >10% and 20% as well as frequencies reported to be "low"
# "Very Low" - includes frequencies reported in the literature as being between >0% and 10% as well as frequencies reported to be "sporadic" and "very low"
# "Observed" - the literature reported that tumors were observed but the authors did not indicate frequency
# "Zero" - the literature reported that no tumors were observed
#  empty cell - no data in MTB at the time the grid was last updated
*/

    public String getDescriptionHighest() {
        String strRet = "";

        double freq = Math.max(dHighest, dIncidenceHighest);

        if (nCount > 0) {
            if (dTotal == 0.0) {
                strRet = "";
            } else {
                if (freq > 80.0) {
                    strRet = "veryhigh";
                } else if (freq > 50.0) {
                    strRet = "high";
                } else if (freq > 20.0) {
                    strRet = "moderate";
                } else if (freq > 10.0) {
                    strRet = "low";
                } else if (freq > 0.10) {
                    strRet = "verylow";
                } else if (freq >= 0.0) {
                    strRet = "observed";
                } else {
                    strRet = "";
                }
            }
        }

        return strRet;
    }

    public String getLongDescriptionHighest() {
        String strRet = "";

        if (StringUtils.hasValue(strIncidenceHighest)) {
            if (dIncidenceHighest > dHighest) {
                strRet = StringUtils.initCap(strIncidenceHighest);
            } else {
                NumberFormat numberFormatter = new DecimalFormat("0.0");
                strRet = numberFormatter.format(dHighest);
            }
        } else {
            if (nCount > 0) {
                if (dTotal == 0.0) {
                    strRet = "Zero";
                } else {
                    NumberFormat numberFormatter = new DecimalFormat("0.0");
                    strRet = numberFormatter.format(dHighest);
                }
            }
        }

        return strRet;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(" * TOTAL = ").append(getTotal()).append('\n');
        sb.append(" * COUNT = ").append(getCount()).append('\n');
        sb.append(" * FREQUENCY AVG = ").append(getFrequencyAvg()).append('\n');
        sb.append(" * FREQUENCY HIGH = ").append(getFrequencyHighest()).append('\n');
        return sb.toString();
    }


    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}