/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.Collection;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainKey = -1;
    private String strStrainName = null;
    private long nStrainFamilyKey = -1;
    private String strStrainFamilyName = null;
    private long nStrainHeredityKey = -1;
    private String strStrainHeredityName = null;
    private Collection colOrgans = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridStrainRowDTO() {
    }
    
    // --------------------------------------------------------- Public Methods
    
    public void setStrainKey(long key) {
        this.nStrainKey = key;
    }
    
    public long getStrainKey() {
        return this.nStrainKey;
    }
    
    public void setStrainName(String name) {
        this.strStrainName = name;
    }
    
    public String getStrainName() {
        return this.strStrainName;
    }
    
    public void setStrainFamilyKey(long key) {
        this.nStrainFamilyKey = key;
    }
    
    public long getStrainFamilyKey() {
        return this.nStrainFamilyKey;
    }
    
    public void setStrainFamilyName(String name) {
        this.strStrainFamilyName = name;
    }
    
    public String getStrainFamilyName() {
        return this.strStrainFamilyName;
    }
    
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
    
    public void setOrgans(Collection colOrgans) {
        this.colOrgans = colOrgans;
    }
    
    public Collection getOrgans() {
        return this.colOrgans;
    }
    
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("MTBTFGridStrainHeaderDTO[");
        sb.append(nStrainKey).append(',').append(strStrainName).append(',');
        sb.append(nStrainFamilyKey).append(',').append(strStrainFamilyName).append(',');
        sb.append(nStrainHeredityKey).append(',').append(strStrainHeredityName).append(',');
        sb.append(']');
        
        return sb.toString();
    }
    
    
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}