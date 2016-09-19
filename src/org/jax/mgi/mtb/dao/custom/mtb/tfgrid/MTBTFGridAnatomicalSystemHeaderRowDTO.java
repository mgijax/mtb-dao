/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridAnatomicalSystemHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridAnatomicalSystemHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridAnatomicalSystemHeaderRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long lAnatomicalSystemKey = -1;
    private String strAnatomicalSystemName = null;
    private List<MTBTFGridOrganParentHeaderRowDTO> listOrgans = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridAnatomicalSystemHeaderRowDTO() {
        listOrgans = new ArrayList<MTBTFGridOrganParentHeaderRowDTO>();
    }
    
    // --------------------------------------------------------- Public Methods
    
   
    public void setAnatomicalSystemKey(long key) {
        this.lAnatomicalSystemKey = key;
    }
    
    public long getAnatomicalSystemKey() {
        return this.lAnatomicalSystemKey;
    }
    
    public void setAnatomicalSystemName(String name) {
        this.strAnatomicalSystemName = name;
    }
    
    public String getAnatomicalSystemName() {
        return this.strAnatomicalSystemName;
    }
    
    public void setOrgans(List<MTBTFGridOrganParentHeaderRowDTO> listOrgans) {
        this.listOrgans = listOrgans;
    }
    
    public List<MTBTFGridOrganParentHeaderRowDTO> getOrgans() {
        return this.listOrgans;
    }
    
    public void addOrgan(MTBTFGridOrganParentHeaderRowDTO dto) {
        this.listOrgans.add(dto);
    }
    
    
    
    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none    
}