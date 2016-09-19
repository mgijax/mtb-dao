/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorSearchDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

import java.util.List;

/**
 * A DTO for searching <code>Strain</code> strain data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:24
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorSearchDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 */
public class WSTumorSearchDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String name = null;
    private String organOriginName = null;
    private String organAffectedName = null;
    private String frequency = null;
    private List<String> strainIds = null;
    private List<String> references = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganOriginName() {
        return organOriginName;
    }

    public void setOrganOriginName(String organOriginName) {
        this.organOriginName = organOriginName;
    }

    public String getOrganAffectedName() {
        return organAffectedName;
    }

    public void setOrganAffectedName(String organAffectedName) {
        this.organAffectedName = organAffectedName;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public List<String> getStrainIds() {
        return strainIds;
    }

    public void setStrainIds(List<String> strainIds) {
        this.strainIds = strainIds;
    }

    public void addStrainId(String strainId) {
        this.strainIds.add(strainId);
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public void addReference(String reference) {
        this.references.add(reference);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

}