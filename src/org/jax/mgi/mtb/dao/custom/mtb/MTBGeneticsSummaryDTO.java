/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for genetic summary data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBGeneticsSummaryDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    // tumor related information
    private String geneSymbol = null;
    private String geneName = null;
    private String mouseChromosome = null;
    private String geneticChangeTypeName = null;
    private Map<String, MTBGeneticsSummaryHelperDTO> alleleRecs = null;
    private Map<String, String> alleleRecsNames = null;
    private Map<String, String> alleleRecsMutationSymbols = null;
    private int count = 0;

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public final String getGeneSymbol() {
        return this.geneSymbol;
    }

    public final void setGeneSymbol(String symbol) {
        this.geneSymbol = symbol;
    }

    public final String getGeneName() {
        return this.geneName;
    }

    public final void setGeneName(String name) {
        this.geneName = name;
    }

    public final String getMouseChromosome() {
        return this.mouseChromosome;
    }

    public final void setMouseChromosome(String chromosome) {
        this.mouseChromosome = chromosome;
    }

    public final String getGeneticChangeTypeName() {
        return this.geneticChangeTypeName;
    }

    public final void setGeneticChangeTypeName(String typeName) {
        this.geneticChangeTypeName = typeName;
    }

    public void addAlleleRec(String allelePairKey, String mutationSymbol, String name, Long tfKey, MTBGeneticsSummaryRowDTO row) {
    
        String key = mutationSymbol+":"+name;
      
        if (this.alleleRecs == null) {
            this.alleleRecs = new LinkedHashMap<String, MTBGeneticsSummaryHelperDTO>();
        }

        if (this.alleleRecsNames == null) {
            this.alleleRecsNames = new LinkedHashMap<String, String>();
        }

        if (this.alleleRecsMutationSymbols == null) {
            this.alleleRecsMutationSymbols = new LinkedHashMap<String, String>();
        }

        if (StringUtils.hasValue(name)) {
            alleleRecsNames.put(key, name);
        }

        alleleRecsMutationSymbols.put(key, mutationSymbol);

        if (alleleRecs.containsKey(key)) {
            MTBGeneticsSummaryHelperDTO dto = alleleRecs.get(key);
            dto.addRow(row, tfKey);
            alleleRecs.put(key, dto);
        } else {
            MTBGeneticsSummaryHelperDTO dto = new MTBGeneticsSummaryHelperDTO();
            dto.addRow(row, tfKey);
            alleleRecs.put(key, dto);
            count++;
        }
    }

    public String getMutationSymbol(String key) {
        return this.alleleRecsMutationSymbols.get(key);
    }

    public String getName(String key) {
        return this.alleleRecsNames.get(key);
    }

    public Map<String, String> getMutationSymbols() {
        return this.alleleRecsMutationSymbols;
    }

    public Map<String, String> getNames() {
        return this.alleleRecsNames;
    }

    public Map<String,MTBGeneticsSummaryHelperDTO> getAlleleRecs() {
        return this.alleleRecs;
    }

    public final void setAlleleRecs(Map<String, MTBGeneticsSummaryHelperDTO> recs) {
        this.alleleRecs = recs;
    }

    public final int getCount() {
        return count;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}