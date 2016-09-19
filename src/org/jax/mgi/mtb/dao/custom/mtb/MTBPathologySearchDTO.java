/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologySearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

/**
 * A <code>DTO</code> for pathology data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologySearchDTO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBPathologySearchDTO {
    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    // ----------------------------------------------------------- Constructors

    // --------------------------------------------------------- Public Methods

    private int pathologyKey = -1;
    private int pathologistKey = -1;
    private String pathologist = null;
    private int contributorKey = -1;
    private String contributor = null;
    private String description = null;
    private int strainKey = -1;
    private int tfKey = -1;
    private int numImages = -1;


    public int getPathologyKey() {
        return pathologyKey;
    }

    public void setPathologyKey(int pathologyKey) {
        this.pathologyKey = pathologyKey;
    }

    public int getPathologistKey() {
        return pathologistKey;
    }

    public void setPathologistKey(int pathologistKey) {
        this.pathologistKey = pathologistKey;
    }

    public String getPathologist() {
        return pathologist;
    }

    public void setPathologist(String pathologist) {
        this.pathologist = pathologist;
    }

    public int getContributorKey() {
        return contributorKey;
    }

    public void setContributorKey(int contributorKey) {
        this.contributorKey = contributorKey;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStrainKey() {
        return strainKey;
    }

    public void setStrainKey(int strainKey) {
        this.strainKey = strainKey;
    }

    public int getTfKey() {
        return tfKey;
    }

    public void setTfKey(int tfKey) {
        this.tfKey = tfKey;
    }

    public int getNumImages() {
        return numImages;
    }

    public void setNumImages(int numImages) {
        this.numImages = numImages;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}