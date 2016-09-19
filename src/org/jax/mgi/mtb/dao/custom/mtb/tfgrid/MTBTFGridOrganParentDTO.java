/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganParentDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jax.mgi.mtb.utils.FieldPrinter;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganParentDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridOrganParentDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nOrganKey = -1;
    private String strOrganName = null;
    private long nAnatomicalSystemKey = -1;
    private String strAnatomicalSystemName = null;
    private Map<String, MTBTFGridOrganDTO> mapOrgans = null;
    
    // ----------------------------------------------------------- Constructors



    public MTBTFGridOrganParentDTO() {
    }
    
    // --------------------------------------------------------- Public Methods
    
    public void setOrganKey(long key) {
        this.nOrganKey = key;
    }
    
    public long getOrganKey() {
        return this.nOrganKey;
    }
    
    public String getOrganKeyStr() {
        return this.nOrganKey + "";
    }
    
    public void setOrganName(String name) {
        this.strOrganName = name;
    }
    
    public String getOrganName() {
        return this.strOrganName;
    }
    
    public void setAnatomicalSystemKey(long key) {
        this.nAnatomicalSystemKey = key;
    }
    
    public long getAnatomicalSystemKey() {
        return this.nAnatomicalSystemKey;
    }
    
    public void setAnatomicalSystemName(String name) {
        this.strAnatomicalSystemName = name;
    }
    
    public String getAnatomicalSystemName() {
        return this.strAnatomicalSystemName;
    }
    
    public void setOrgans(Map<String, MTBTFGridOrganDTO> map) {
        this.mapOrgans = map;
    } 
    
    public Map<String, MTBTFGridOrganDTO> getOrgans() {
        return this.mapOrgans;
    }
    
   public List<MTBTFGridTumorFrequencyDTO> getFrequencies() {
        List<MTBTFGridTumorFrequencyDTO> list = new ArrayList<MTBTFGridTumorFrequencyDTO>();

        if (mapOrgans != null) {
            for (MTBTFGridOrganDTO dtoOrgan : mapOrgans.values()) {
                list.addAll(dtoOrgan.getFrequencies());
            }
        }

        return list;
    }

   public MTBTFGridOrganTFDetail getFrequencyDetail() {
        MTBTFGridOrganTFDetail dto = new MTBTFGridOrganTFDetail();

        List<MTBTFGridTumorFrequencyDTO> arr = new ArrayList<MTBTFGridTumorFrequencyDTO>(getFrequencies());

        for(MTBTFGridTumorFrequencyDTO dtoTF : arr) {
            dto.addFrequency(dtoTF);
        }

        return dto;
    }

    public void copy(MTBTFGridOrganParentDTO dto) {
        if (dto.getOrgans() != null) {
            if (mapOrgans == null) {
                mapOrgans = new HashMap<String, MTBTFGridOrganDTO>();
                mapOrgans.putAll(dto.getOrgans());
            } else {
                // combine the two, trickier than just an add
                Map<String, MTBTFGridOrganDTO> newMap = (HashMap<String, MTBTFGridOrganDTO>)((HashMap<String, MTBTFGridOrganDTO>)mapOrgans).clone();

                // copy from set 2 to set 1
                for (Iterator it = dto.getOrgans().keySet().iterator();
                     it.hasNext(); ) {

                    String strKey = (String)it.next();

                    if (newMap.containsKey(strKey)) {
                        // combine
                        MTBTFGridOrganDTO dto1 = mapOrgans.get(strKey);
                        MTBTFGridOrganDTO dto2 = dto.getOrgans().get(strKey);
                        dto1.copy(dto2);
                        newMap.put(strKey, dto1);
                    } else {
                        // add
                        newMap.put(strKey, dto.getOrgans().get(strKey));
                    }
                }

                mapOrgans = new HashMap<String, MTBTFGridOrganDTO>(newMap);
            }
        }

        for (Iterator it = mapOrgans.keySet().iterator(); it.hasNext(); ) {
            String strKey = (String)it.next();

            if (dto.getOrgans().containsKey(strKey)) {
                MTBTFGridOrganDTO dto1 = (MTBTFGridOrganDTO)mapOrgans.get(strKey);
                MTBTFGridOrganDTO dto2 = (MTBTFGridOrganDTO)dto.getOrgans().get(strKey);
                dto1.copy(dto2);
                mapOrgans.put(strKey, dto1);
            }
        }
    }

    /**
     * Return a String representation of this object.
     *
     * @return a String representation of this object
     */
    public String toString() {
        return FieldPrinter.getFieldsAsString(this);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
