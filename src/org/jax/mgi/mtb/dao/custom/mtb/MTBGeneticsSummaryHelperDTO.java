/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryHelperDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A <code>DTO</code> for genetic summary helper data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSummaryHelperDTO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBGeneticsSummaryHelperDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private final Map<String, MTBGeneticsSummaryRowDTO> recs =
            new LinkedHashMap<String,MTBGeneticsSummaryRowDTO>();

    // ----------------------------------------------------------- Constructors
    // none

    // --------------------------------------------------------- Public Methods

    public void addRow(MTBGeneticsSummaryRowDTO dto, Long tfKey) {
        StringBuffer key = new StringBuffer();
        key.append(dto.getTumorName());
        key.append("::");
        key.append(dto.getAgentType());

        if (recs.containsKey(key.toString())) {
            MTBGeneticsSummaryRowDTO r = recs.get(key.toString());
            r.increment(tfKey);
            r.addAllelePairKey(dto.getAllelePairKey());
            recs.put(key.toString(), r);
        } else {
            dto.increment(tfKey);
            recs.put(key.toString(), dto);
        }
    }

    public Collection<MTBGeneticsSummaryRowDTO> getRecsCollection() {
        return this.recs.values();
    }

    public final Map<String, MTBGeneticsSummaryRowDTO> getRecs() {
        return this.recs;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}