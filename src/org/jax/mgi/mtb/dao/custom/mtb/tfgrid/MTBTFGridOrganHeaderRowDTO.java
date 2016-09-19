/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridOrganHeaderRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long lOrganKey = -1;
    private String strOrganName = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridOrganHeaderRowDTO() {
    }
    
    // --------------------------------------------------------- Public Methods
    
   
    public void setOrganKey(long key) {
        this.lOrganKey = key;
    }
    
    public long getOrganKey() {
        return this.lOrganKey;
    }
    
    public void setOrganName(String name) {
        this.strOrganName = name;
    }
    
    public String getOrganName() {
        return this.strOrganName;
    }
   
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}