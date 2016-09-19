/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainSearchDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;

/**
 * A DTO for managing <code>Strain</code> search results.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainSearchDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainSearchDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private long key = -1L;
    private String name = null;
    private String description = null;
    private Collection<String> types = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    /**
     *
     * @param k
     */
    public final void setKey(long k) {
        this.key = k;
    }

    /**
     *
     * @return
     */
    public final long getKey() {
        return this.key;
    }

    /**
     *
     * @param n
     */
    public final void setName(String n) {
        this.name = n;
    }

    /**
     *
     * @return
     */
    public final String getName() {
        return this.name;
    }

    /**
     *
     * @param desc
     */
    public final void setDescription(String desc) {
        this.description = desc;
    }

    /**
     *
     * @return
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     *
     * @param col
     */
    public final void setTypes(Collection<String> col) {
        this.types = col;
    }

    /**
     *
     * @return
     */
    public final Collection<String> getTypes() {
        return this.types;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}