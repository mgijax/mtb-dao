/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.HashMap;
import java.util.Iterator;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainHeredityKey = -1;
    private String strStrainHeredityName = null;
    private HashMap mapStrainFamilies = null;
    
    // ----------------------------------------------------------- Constructors



    public MTBTFGridDTO() {
    }
    
    // --------------------------------------------------------- Public Methods
    
    
    public void setStrainHeredityKey(long key) {
        this.nStrainHeredityKey = key;
    }

    public long getStrainHeredityKey() {
        return this.nStrainHeredityKey;
    }

    public void setStrainHeredityName(String name) {
        this.strStrainHeredityName = name;
    }

    public String getStrainHeredityName() {
        return this.strStrainHeredityName;
    }

    public HashMap getStrainFamilies() {
        return this.mapStrainFamilies;
    }

    public void setStrainFamilies(HashMap map) {
        this.mapStrainFamilies = map;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("MTBTFGridStrainHeredityDTO[").append(nStrainHeredityKey);
        sb.append(',').append(strStrainHeredityName).append(',');
        
        if ((mapStrainFamilies == null) || (mapStrainFamilies.size() == 0)) {
            sb.append('0');
        } else {
            for (Iterator it = mapStrainFamilies.keySet().iterator();
                 it.hasNext(); ) {
                sb.append(mapStrainFamilies.get(it.next()));
            }
        }
        
        sb.append(" families]");
        
        return sb.toString();
    }
    
    public String getFrequency(String strStrainFamilyKey, String strOrganKey) {
        String strRet = "";
        
        return strRet;
    
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    

}