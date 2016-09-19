package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.List;
import org.jax.mgi.mtb.dao.gen.mtb.AssayImagesDTO;

/**
 * Extends a MTBTumorGeneticChangesDTO to include any associated assay images
 * @author sbn
 */
public class MTBCytoGeneticSummaryDTO extends MTBTumorGeneticChangesDTO {
  
  private ArrayList<AssayImagesDTO> images = new ArrayList<AssayImagesDTO>();
  
  public void setImage(AssayImagesDTO dto){
    this.images.add(dto);
  }
  
  public List<AssayImagesDTO> getImages(){
    return this.images;
  }

}
