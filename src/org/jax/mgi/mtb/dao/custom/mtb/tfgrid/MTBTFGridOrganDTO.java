/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jax.mgi.mtb.utils.FieldPrinter;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:22
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridOrganDTO.java,v 1.1 2007/04/30 15:47:22 mjv Exp
 */
public class MTBTFGridOrganDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nOrganKey = -1;
    private String strOrganName = null;
    private long nAnatomicalSystemKey = -1;
    private String strAnatomicalSystemName = null;
    private Map<String, MTBTFGridTumorFrequencyDTO> mapTFRecords = null;
    
    // ----------------------------------------------------------- Constructors

    public MTBTFGridOrganDTO() {
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
    
    public void setTFRecords(Map<String, MTBTFGridTumorFrequencyDTO> map) {
        this.mapTFRecords = map;
    } 
    
    public Map<String, MTBTFGridTumorFrequencyDTO> getTFRecords() {
        return this.mapTFRecords;
    }

    public List<MTBTFGridTumorFrequencyDTO> getFrequencies() {
        List<MTBTFGridTumorFrequencyDTO> list = new ArrayList<MTBTFGridTumorFrequencyDTO>();

        if (mapTFRecords != null) {
            for (MTBTFGridTumorFrequencyDTO dtoTF : mapTFRecords.values()) {
                list.add(dtoTF);
            }
        }

        return list;
    }

    public void copy(MTBTFGridOrganDTO dto) {
        if (this.mapTFRecords == null) {
            this.mapTFRecords = new HashMap<String, MTBTFGridTumorFrequencyDTO>();
        }

        this.mapTFRecords.putAll(dto.getTFRecords());
    }

    public MTBTFGridOrganTFDetail getFrequencyDetail() {
        MTBTFGridOrganTFDetail dto = new MTBTFGridOrganTFDetail();

        List<MTBTFGridTumorFrequencyDTO> arr = new ArrayList<MTBTFGridTumorFrequencyDTO>(getFrequencies());

        for (MTBTFGridTumorFrequencyDTO dtoTF : arr) {
            dto.addFrequency(dtoTF);
        }

        return dto;
    }

    public String toString() {
        return FieldPrinter.getFieldsAsString(this);
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}