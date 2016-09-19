/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainHeredityDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.Map;
import org.jax.mgi.mtb.utils.FieldPrinter;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainHeredityDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainHeredityDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainHeredityKey = -1;
    private String strStrainHeredityName = null;
    private Map<String, MTBTFGridStrainFamilyDTO> mapStrainFamilies = null;
    
    // ----------------------------------------------------------- Constructors



    public MTBTFGridStrainHeredityDTO() {
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

    public Map<String, MTBTFGridStrainFamilyDTO> getStrainFamilies() {
        return this.mapStrainFamilies;
    }

    public void setStrainFamilies(Map<String, MTBTFGridStrainFamilyDTO> map) {
        this.mapStrainFamilies = map;
    }

    public String toString() {
        return FieldPrinter.getFieldsAsString(this);
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