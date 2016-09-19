/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainLinksDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

/**
 * A <code>DTO</code> for ancillary strain links data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainLinksDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainLinksDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String siteName;
    private String siteUrl;
    private String accessionUrl;

    // ----------------------------------------------------------- Constructors


    /** Creates a new instance of MTBStrainLinksDTO */
    public MTBStrainLinksDTO() {
        this(null, null, null);
    }

    public MTBStrainLinksDTO(String siteName,
                             String siteUrl,
                             String accessionUrl) {
        super();
        setSiteName(siteName);
        setSiteUrl(siteUrl);
        setAccessionUrl(accessionUrl);
    }

    // --------------------------------------------------------- Public Methods

    public final void setSiteName(String name) {
        this.siteName = name;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public final void setSiteUrl(String url) {
        this.siteUrl = url;
    }

    public final String getSiteUrl() {
        return this.siteUrl;
    }

    public final void setAccessionUrl(String url) {
        this.accessionUrl = url;
    }

    public final String getAccessionUrl() {
        return this.accessionUrl;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}