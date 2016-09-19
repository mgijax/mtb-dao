/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryRowDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.HashMap;

/**
 * A <code>DTO</code> for genetic summary row data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryRowDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBGeneticsSummaryRowDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String allelePairKeys;
    private int agentTypeKey = 0;  // defaulting to None (spontaneous)
    private int organKey = -1;
    private int tumorClassificationKey = -1;
    private int count = 0;
    private String tumorName;
    private String agentType;
    private String mutationSymbol;
    private HashMap<Long,Long> tfKeys = new HashMap<Long,Long>();

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final String getAllelePairKey() {
        return this.allelePairKeys;
    }

    public final void setAllelePairKey(String key) {
        this.allelePairKeys = key;
    }

    public final int getAgentTypeKey() {
        return this.agentTypeKey;
    }

    public final void setAgentTypeKey(int key) {
        this.agentTypeKey = key;
    }

    public final int getOrganKey() {
        return this.organKey;
    }

    public final void setOrganKey(int key) {
        this.organKey = key;
    }

    public final int getTumorClassificationKey() {
        return this.tumorClassificationKey;
    }

    public final void setTumorClassificationKey(int key) {
        this.tumorClassificationKey = key;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int c) {
        this.count = c;
    }

    public final void increment(Long tfKey) {
       if(!tfKeys.containsKey(tfKey)){
         tfKeys.put(tfKey,tfKey);
         this.count++;
       }
    }

    public final String getTumorName() {
        return this.tumorName;
    }

    public final void setTumorName(String name) {
        this.tumorName = name;
    }

    public final String getAgentType() {
        return this.agentType;
    }

    public final void setAgentType(String agent) {
        this.agentType = agent;
    }

    public final String getMutationSymbol() {
        return this.mutationSymbol;
    }

    public final void setMutationSymbol(String symbol) {
        this.mutationSymbol = symbol;
    }
    
    public final void addAllelePairKey(String allelePairKey){
      if(this.allelePairKeys == null){
        this.allelePairKeys = allelePairKey;
      }else if(this.allelePairKeys.indexOf(allelePairKey) == -1){
          this.allelePairKeys += ","+allelePairKey;
        }
    }
    
    public final String getTumorFrequencies(){
      StringBuffer tf = new StringBuffer();
      for(Long key : tfKeys.keySet()){
        tf.append(key+",");
      }
      return tf.toString();
    }
    

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}