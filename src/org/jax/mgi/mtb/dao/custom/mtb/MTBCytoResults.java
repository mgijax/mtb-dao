/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;

/**
 * A collection of cytogenetic records grouped by chromosome and change type
 * (allele type name). 
 * @author sbn
 */
public class MTBCytoResults {
    
    private ArrayList<MTBTumorGeneticChangesDTO> dtos = new ArrayList<MTBTumorGeneticChangesDTO>();
    private boolean hasImages = false;
    
    public String getDisplayChromosomes(){
        return dtos.get(0).getDisplayChromosomes();
    }
    
    public String getAlleleTypeName(){
        return dtos.get(0).getAlleleTypeName();
    }
    
    public int getSize(){
        return dtos.size();
    }
    
    public ArrayList getDTOs(){
        return this.dtos;
    }
     
    public void addDTO(MTBTumorGeneticChangesDTO dto){
        dtos.add(dto);
        if((dto.getAssayImagesKey()!=null)
                && (dto.getAssayImagesKey().longValue() > 0)){
          this.hasImages = true;
        }
    }
    
    public String getKeys(){
        StringBuffer keys = new StringBuffer();
        for(MTBTumorGeneticChangesDTO dto : dtos){
            keys.append(dto.getTumorGeneticChangesKey()).append(",");
        }
        //  remove the last comma
        keys.deleteCharAt(keys.length()-1);
        return keys.toString();
    }
    
    public boolean getHasImages(){
      return this.hasImages;
    }

}
