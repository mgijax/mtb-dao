/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.Iterator;
import java.util.Map;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainKey = -1;
    private String strStrainName = null;
    private Map<String, MTBTFGridOrganParentDTO> mapOrgans = null;
    
    // ----------------------------------------------------------- Constructors



    public MTBTFGridStrainDTO() {
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
    
    public void setOrgans(Map<String, MTBTFGridOrganParentDTO> map) {
        this.mapOrgans = map;
    } 
    
    public Map<String, MTBTFGridOrganParentDTO> getOrgans() {
        return this.mapOrgans;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("      MTBTFGridStrainDTO ").append('\n');
        sb.append("          STRAIN KEY: ").append(nStrainKey).append('\n');
        sb.append("          STRAIN NAME: ").append(strStrainName).append('\n');
        sb.append("          ORGANS: ");
        
        if ((mapOrgans == null) || (mapOrgans.size() == 0)) {
            sb.append("NONE").append('\n');
        } else {
            sb.append("\n          SIZE: ").append(mapOrgans.keySet().size()).append('\n');
            for (Iterator it = mapOrgans.keySet().iterator();
                 it.hasNext(); ) {
                sb.append(mapOrgans.get(it.next()));
            }
        }
        
        sb.append('\n');
        
        return sb.toString();
    }
    
    
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}