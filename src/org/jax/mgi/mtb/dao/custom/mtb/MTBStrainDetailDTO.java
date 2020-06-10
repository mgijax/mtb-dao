/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainDetailDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Collection;
import java.util.Iterator;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainNotesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDTO;
import org.jax.mgi.mtb.utils.LabelValueBean;

/**
 * A <code>DTO</code> for detail <code>Strain</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainDetailDTO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBStrainDetailDTO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private String mtbId = null;
    private StrainDTO strainDTO = null;;
    private String strStrainFamilyName = null;
    private Collection<StrainTypeDTO> types = null;
    private Collection<StrainNotesDTO> notes = null;
    private Collection<StrainSynonymsDTO> synonyms = null;
    private Collection<ReferenceDTO> refs = null;
    private Collection<MTBStrainGeneticsDTO> genetics = null;
    private Collection<MTBStrainLinksDTO> links = null;
    private Collection<MTBStrainLinksDTO> linksGeneral = null;
    private Collection<MTBStrainTumorSummaryDTO> tumors = null;
    private Collection<String> tumorIds = null;

    // ----------------------------------------------------------- Constructors

    public MTBStrainDetailDTO() {
        strainDTO = StrainDAO.getInstance().createStrainDTO();
    }

    // --------------------------------------------------------- Public Methods

    public void setMtbId(String mtbId) {
        this.mtbId = mtbId;
    }
    
    public String getMtbId() {
        return this.mtbId;
    }
    public void setStrainKey(long key) {
        this.strainDTO.setStrainKey(key);
    }

    public long getStrainKey() {
        Long key = this.strainDTO.getStrainKey();
        long keyl = -1l;

        if (key != null) {
            keyl = key.longValue();
        }

        return keyl;
    }

    public final void setStrainFamilyName(String name) {
        this.strStrainFamilyName = name;
    }

    public final String getStrainFamilyName() {
        return this.strStrainFamilyName;
    }

    public final void setTypes(Collection<StrainTypeDTO> strainTypes) {
        this.types = strainTypes;
    }

    public final Collection<StrainTypeDTO> getTypes() {
        return this.types;
    }

    public void setName(String strainName) {
        this.strainDTO.setName(strainName);
    }

    public String getName() {
        return this.strainDTO.getName();
    }

    public void setDescription(String desc) {
        this.strainDTO.setDescription(desc);
    }

    public final String getDescription() {
        return this.strainDTO.getDescription();
    }

    public final void setNotes(Collection<StrainNotesDTO> strainNotes) {
        this.notes = strainNotes;
    }

    public final Collection<StrainNotesDTO> getNotes() {
        return this.notes;
    }

    public final void setReferences(Collection<ReferenceDTO> strainReferences) {
        this.refs = strainReferences;
    }

    public final Collection<ReferenceDTO> getReferences() {
        return this.refs;
    }

    public final void setSynonyms(Collection<StrainSynonymsDTO> strainSynonyms) {
        this.synonyms = strainSynonyms;
    }

    public final Collection<StrainSynonymsDTO> getSynonyms() {
        return this.synonyms;
    }

    public final void setGenetics(Collection<MTBStrainGeneticsDTO> strainGenetics) {
        this.genetics = strainGenetics;
    }

    public final Collection<MTBStrainGeneticsDTO> getGenetics() {
        return this.genetics;
    }

    public final void setLinks(Collection<MTBStrainLinksDTO> strainLinks) {
        this.links = strainLinks;
    }

    public final Collection<MTBStrainLinksDTO> getLinks() {
        return this.links;
    }

    public final void setLinksGeneral(Collection<MTBStrainLinksDTO> strainLinksGeneral) {
        this.linksGeneral = strainLinksGeneral;
    }

    public final Collection<MTBStrainLinksDTO> getLinksGeneral() {
        return this.linksGeneral;
    }

    public final Collection<MTBStrainTumorSummaryDTO> getTumors() {
        return this.tumors;
    }

    public final void setTumors(Collection<MTBStrainTumorSummaryDTO> t) {
        this.tumors = t;
    }

    public final LabelValueBean<String,String> getTumorStats() {
        LabelValueBean<String,String> bean = 
                new LabelValueBean<String,String>();
        int count = 0;
        int tfCount = 0;

        for (Iterator it = this.tumors.iterator(); it.hasNext(); ) {
            MTBStrainTumorSummaryDTO dto = (MTBStrainTumorSummaryDTO)it.next();
            count++;
            tfCount += dto.getNumberTFRecords();
        }

        bean.setLabel(count + "");
        bean.setValue(tfCount + "");

        return bean;
    }

   public final void setTumorFrequencyIds(Collection<String> ids) {
        this.tumorIds = ids;
    }

    public final Collection<String> getTumorFrequencyIds() {
        return this.tumorIds;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append(strainDTO.toString());


        return sb.toString();

    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}