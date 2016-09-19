/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageHelperDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

/**
 * A <code>DTO</code> for holding ancillary pathology image detail.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyImageHelperDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBPathologyImageHelperDTO {
    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    // ----------------------------------------------------------- Constructors

    // --------------------------------------------------------- Public Methods

    private int imageId = -1;
    private String imageCaption = null;
    private String sourceOfImage = null;
    private String pathologist = null;
    private String institution = null;
    private String stainMethod = null;
    private String imageUrl = null;
    private String imageUrlPath = null;
    private String imageName = null;
    private String imageThumbName = null;
    private String imageNote = null;



    public final void setImageId(int id) {
        this.imageId = id;
    }

    public final int getImageId() {
        return this.imageId;
    }

    public final void setImageCaption(String caption) {
        this.imageCaption = caption;
    }

    public final String getImageCaption() {
        return this.imageCaption;
    }

    public final void setSourceOfImage(String source) {
        this.sourceOfImage = source;
    }

    public final String getSourceOfImage() {
        return this.sourceOfImage;
    }

    public final void setInstitution(String inst) {
        this.institution = inst;
    }

    public final String getInstitution() {
        return this.institution;
    }

    public final void setStainMethod(String stain) {
        this.stainMethod = stain;
    }

    public final String getStainMethod() {
        return this.stainMethod;
    }

    public final void setImageUrl(String url) {
        this.imageUrl = url;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrlPath(String path) {
        this.imageUrlPath = path;
    }

    public final String getImageUrlPath() {
        return this.imageUrlPath;
    }

    public final void setImageName(String name) {
        this.imageName = name;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final void setImageThumbName(String name) {
        this.imageThumbName = name;
    }

    public final String getImageThumbName() {
        return this.imageThumbName;
    }

    public String getImageNote() {
        return imageNote;
    }

    public void setImageNote(String imageNote) {
        this.imageNote = imageNote;
    }

  public String getPathologist() {
    return pathologist;
  }

  public void setPathologist(String pathologist) {
    this.pathologist = pathologist;
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}