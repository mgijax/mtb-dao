/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainFamilyDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.tfgrid;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jax.mgi.mtb.utils.FieldPrinter;

/**
 * A <code>DTO</code> for <code>Reference</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:23
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/tfgrid/MTBTFGridStrainFamilyDTO.java,v 1.1 2007/04/30 15:47:23 mjv Exp
 */
public class MTBTFGridStrainFamilyDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private long nStrainFamilyKey = -1;
    private String strStrainFamilyName = null;
    private Map<String, MTBTFGridStrainDTO> mapStrains = null;
    private Map<String, MTBTFGridOrganParentDTO> mapOrgans = null;

    // ----------------------------------------------------------- Constructors



    public MTBTFGridStrainFamilyDTO() {
    }

    // --------------------------------------------------------- Public Methods


    public void setStrainFamilyKey(long key) {
        this.nStrainFamilyKey = key;
    }

    public long getStrainFamilyKey() {
        return this.nStrainFamilyKey;
    }

    public void setStrainFamilyName(String name) {
        this.strStrainFamilyName = name;
    }

    public String getStrainFamilyName() {
        return this.strStrainFamilyName;
    }

    public Map<String, MTBTFGridStrainDTO> getStrains() {
        return this.mapStrains;
    }

    public void setStrains(Map<String, MTBTFGridStrainDTO> map) {
        this.mapStrains = map;
    }

    public String getFrequencyForOrgan(String strOrganKey) {
        String strRet = "";
        double freq = 0.0;
        int nCount = 0;

        Collection c = mapStrains.values();

        for (Iterator it = c.iterator(); it.hasNext(); ) {
            MTBTFGridStrainDTO dto = (MTBTFGridStrainDTO)it.next();

            Map mapOrgans = dto.getOrgans();

            MTBTFGridOrganDTO dtoOrgan = (MTBTFGridOrganDTO)mapOrgans.get(strOrganKey);

            if (dtoOrgan != null) {
                Map mapTF = dtoOrgan.getTFRecords();

                if (mapTF != null) {
                    Collection col = mapTF.values();

                    for (Iterator iter = col.iterator(); iter.hasNext(); ) {
                        MTBTFGridTumorFrequencyDTO dtoTF = (MTBTFGridTumorFrequencyDTO)iter.next();

                        freq += dtoTF.getFrequency();
                        nCount++;
                    }
                }
            }
        }

        if (nCount > 0) {
            freq = freq / nCount;
            NumberFormat numberFormatter = new DecimalFormat("0.0");
            strRet = numberFormatter.format(freq);
        }

        return strRet;
    }

    public void setOrgans(Map<String, MTBTFGridOrganParentDTO> organs) {
        this.mapOrgans = organs;
    }

    public void addTF(long lOrganKey, double dFreq) {
        /*
        if (mapOrgans == null) {
            mapOrgans = new HashMap();
        }

        MTBTFGridOrganTFDetail dto = (MTBTFGridOrganTFDetail)mapOrgans.get(lOrganKey + "");

        if (dto == null) {
            dto = new MTBTFGridOrganTFDetail();
        }

        double d = dto.getTotal();
        int c = dto.getCount();

        d += dFreq;
        c++;

        dto.setOrganKey(lOrganKey);
        dto.setTotal(d);
        dto.setCount(c);

        mapOrgans.put(lOrganKey + "", dto);
         */
    }

    public Map<String, MTBTFGridOrganParentDTO> getOrgans() {
        return this.mapOrgans;
    }

    public void addOrgans(Map<String, MTBTFGridOrganParentDTO> organs) {
        if (organs != null) {
            if (mapOrgans == null) {
                mapOrgans = new HashMap<String, MTBTFGridOrganParentDTO>();
                mapOrgans.putAll(organs);
            } else {
                // combine the two, trickier than just an add
                //HashMap newMap = new HashMap(mapOrgans);
                Map<String, MTBTFGridOrganParentDTO> newMap = (HashMap<String, MTBTFGridOrganParentDTO>)((HashMap<String, MTBTFGridOrganParentDTO>)mapOrgans).clone();

                // copy from set 2 to set 1
                for (Iterator it = organs.keySet().iterator();
                     it.hasNext(); ) {

                    String strKey = (String)it.next();

                    if (newMap.containsKey(strKey)) {
                        // combine
                        MTBTFGridOrganParentDTO dto1 = mapOrgans.get(strKey);
                        MTBTFGridOrganParentDTO dto2 = organs.get(strKey);
                        dto1.copy(dto2);
                        newMap.put(strKey, dto1);
                    } else {
                        // add
                        newMap.put(strKey, organs.get(strKey));
                    }
                }

                mapOrgans = new HashMap<String, MTBTFGridOrganParentDTO>(newMap);
            }
        }
    }

    public String toString() {
        return FieldPrinter.getFieldsAsString(this);
   }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

}