/**
 * Header: $Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorAgentsDTO.java,v 1.1 2009/02/17 17:38:57 sbn Exp $
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.ws;

/**
 * A DTO for managing <code>Tumor</code> search results.
 *
 * @author mjv
 * @date 2007/04/30 15:47:24
 * @version 1.1
 * @cvsheader $Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSTumorAgentsDTO.java,v 1.1 2009/02/17 17:38:57 sbn Exp $
 */
public class WSTumorAgentsDTO  {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String type = null;
    private String treatment = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}