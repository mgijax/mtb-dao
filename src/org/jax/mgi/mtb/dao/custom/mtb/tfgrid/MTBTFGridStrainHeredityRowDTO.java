/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainHeredityRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainHeredityRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainHeredityRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainHeredityKey = -1;
    private String strStrainHeredityName = null;
    private List<MTBTFGridStrainFamilyRowDTO> listFamilies = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridStrainHeredityRowDTO() {
        listFamilies = new ArrayList<MTBTFGridStrainFamilyRowDTO>();
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
    
    public void setFamilies(List<MTBTFGridStrainFamilyRowDTO> listFamilies) {
        this.listFamilies = listFamilies;
    }
    
    public List<MTBTFGridStrainFamilyRowDTO> getFamilies() {
        return this.listFamilies;
    }
    
    public void addFamily(MTBTFGridStrainFamilyRowDTO dto) {
        this.listFamilies.add(dto);
    }
    
    
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}