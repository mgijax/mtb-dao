/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainSearchDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
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
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/ws/WSStrainSearchDTO.java,v 1.1 2007/04/30 15:47:24 mjv Exp
 */
public class WSStrainSearchDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String name = null;
    private String family = null;
    private List<String> types = null;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public void addType(String type) {
        types.add(type);
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public void addReference(String reference) {
        references.add(reference);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}