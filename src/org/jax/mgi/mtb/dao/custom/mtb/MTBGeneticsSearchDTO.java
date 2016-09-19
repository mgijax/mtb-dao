/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>DTO</code> for genetic search data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchDTO.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBGeneticsSearchDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String alleleType = null;
    private int alleleTypeKey = -1;
    private String chromosome = null;
    private String geneSymbol = null;
    private String geneName = null;
    private int markerKey = -1;
    private String organism = null;
    private String alleleSymbol = null;
    private int count = 0;
    private boolean isTransgene = false;
    
    private String allele1Symbol = null;
    private String allele2Symbol = null;
    private int allelePairKey = -1;
    private int allelePairCount = 0;
    
    
    private List<String> promotersEnhancers = null;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public void setAlleleType(String type) {
        this.alleleType = type;
    }

    public String getAlleleType() {
        return this.alleleType;
    }

    public void setAlleleTypeKey(int key) {
        this.alleleTypeKey = key;
    }

    public int getAlleleTypeKey() {
        return this.alleleTypeKey;
    }

    public void setMarkerKey(int key) {
        this.markerKey = key;
    }

    public int getMarkerKey() {
        return this.markerKey;
    }

    public void setChromosome(String c) {
        this.chromosome = c;
    }

    public String getChromosome() {
        return this.chromosome;
    }

    public void setAlleleSymbol(String symbol) {
        this.alleleSymbol = symbol;
    }

    public String getAlleleSymbol() {
        return this.alleleSymbol;
    }

    public void setGeneSymbol(String symbol) {
        this.geneSymbol = symbol;
    }

    public String getGeneSymbol() {
        return this.geneSymbol;
    }

    public void setGeneName(String name) {
        this.geneName = name;
    }

    public String getGeneName() {
        return this.geneName;
    }

    public void setOrganism(String name) {
        this.organism = name;
    }

    public String getOrganism() {
        return this.organism;
    }
    
    public void setCount(int num) {
        this.count = num;
    }

    public int getCount() {
        return this.count;
    }

    public void setIsTransgene(boolean transgene) {
        this.isTransgene = transgene;
    }

    public boolean getIsTransgene() {
        return this.isTransgene;
    }

  public String getAllele1Symbol() {
    return allele1Symbol;
  }

  public void setAllele1Symbol(String allele1Symbol) {
    this.allele1Symbol = allele1Symbol;
  }

  public String getAllele2Symbol() {
    return allele2Symbol;
  }

  public void setAllele2Symbol(String allele2Symbol) {
    this.allele2Symbol = allele2Symbol;
  }

  public int getAllelePairKey() {
    return allelePairKey;
  }

  public void setAllelePairKey(int allelePairKey) {
    this.allelePairKey = allelePairKey;
  }

  public int getAllelePairCount() {
    return allelePairCount;
  }

  public void setAllelePairCount(int allelePairCount) {
    this.allelePairCount = allelePairCount;
  }

  public List<String> getPromotersEnhancers() {
    return promotersEnhancers;
  }

  public void setPromotersEnhancers(List<String> promotersEnhancers) {
    this.promotersEnhancers = promotersEnhancers;
  }
  
  public void addPromotersEnhancers(String pe){
    if(this.promotersEnhancers == null){
      this.promotersEnhancers = new ArrayList<String>();
    }
    this.promotersEnhancers.add(pe);
    
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none


}