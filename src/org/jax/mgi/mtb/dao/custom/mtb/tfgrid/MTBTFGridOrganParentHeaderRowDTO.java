/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganParentHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
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
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganParentHeaderRowDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridOrganParentHeaderRowDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long lOrganKey = -1;
    private String strOrganName = null;
    private List<MTBTFGridOrganHeaderRowDTO> listOrgans = null;

    // ----------------------------------------------------------- Constructors

    public MTBTFGridOrganParentHeaderRowDTO() {
        listOrgans = new ArrayList<MTBTFGridOrganHeaderRowDTO>();
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

    public void setOrgans(List<MTBTFGridOrganHeaderRowDTO> listOrgans) {
        this.listOrgans = listOrgans;
    }

    public List<MTBTFGridOrganHeaderRowDTO> getOrgans() {
        return this.listOrgans;
    }

    public void addOrgan(MTBTFGridOrganHeaderRowDTO dto) {
        this.listOrgans.add(dto);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}