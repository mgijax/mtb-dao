/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainFamilyRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
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
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainFamilyRowDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainFamilyRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainFamilyKey = -1;
    private String strStrainFamilyName = null;
    private List<MTBTFGridStrainRowDTO> listStrains = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridStrainFamilyRowDTO() {
        listStrains = new ArrayList<MTBTFGridStrainRowDTO>();
    }
    
    // --------------------------------------------------------- Public Methods
    
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
    
    public void setStrains(List<MTBTFGridStrainRowDTO> listStrains) {
        this.listStrains = listStrains;
    }
    
    public List<MTBTFGridStrainRowDTO> getStrains() {
        return this.listStrains;
    }
    
    public void addStrain(MTBTFGridStrainRowDTO dto) {
        this.listStrains.add(dto);
    }
    
    
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}