/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorSummaryDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>DTO</code> for <code>Strain</code> tumor summary data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBStrainTumorSummaryDTO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBStrainTumorSummaryDTO {

    // -------------------------------------------------------------- Constants

    // ----------------------------------------------------- Instance Variables

    private String tumorName;
    private String tumorClassName;
    private String tumorOrganName;
    private int strainKey = -1;
    private String strainName = null;
    private int tumorClassificationKey = -1;
    private int organOfOriginKey = -1;
    private Collection agentKeys = null;
    private Collection agents;
    private boolean images = false;
    private boolean metastasis = false;
    private String treatmentType;
    private String organAffectedName;
    private List<String> allTFKeys;
    private List<String> tfKeysWithFrequency;
    private List<String> freqMale;
    private List<String> freqFemale;
    private List<String> freqMixed;
    private List<String> freqUnknown;
    private List<String> metastasizesTo;
    private Map<String, String> refAccIds;
    private int parentFrequencyKey = -1;
    private int frequencyKey = -1;
    private Collection<String> collectionAgents;
    private Collection<String> collectionStrainTypes;
    private Collection<String> collectionReferences;
    
    private static final Logger log =
            Logger.getLogger(MTBStrainTumorSummaryDTO.class.getName());
   
    // ----------------------------------------------------------- Constructors

    public MTBStrainTumorSummaryDTO(MTBStrainTumorDetailsDTO detail) {
        setTumorName(detail.getTumorName());
        setTumorClassName(detail.getTumorClassName());
        setTumorOrganName(detail.getOrganOfOriginName());
        setAgents(detail.getAgents());
        setTreatmentType(detail.getTreatmentType());
        setOrganAffectedName(detail.getOrganAffectedName());
        setParentFrequencyKey(detail.getParentFrequencyKey());
        allTFKeys = new ArrayList<String>();
        tfKeysWithFrequency = new ArrayList<String>();
        freqMale = new ArrayList<String>();
        freqFemale = new ArrayList<String>();
        freqMixed = new ArrayList<String>();
        freqUnknown = new ArrayList<String>();
        metastasizesTo = new ArrayList<String>();
        refAccIds = new HashMap<String, String>();
        setImages(detail.getImages());
        setMetastasis(detail.getMetastasis());
        setAgentKeys(detail.getAgentKeys());
        setStrainKey(detail.getStrainKey());
        setStrainName(detail.getStrainName());
        setTumorClassificationKey(detail.getTumorClassKey());
        setOrganOfOriginKey(detail.getOrganOfOriginKey());

        collectionAgents = detail.getAgentCollection();
        collectionStrainTypes = detail.getStrainTypeCollection();
        collectionReferences = detail.getReferenceCollection();

        add(detail);

        // override
        setFrequencyKey(detail.getTumorFrequencyKey());

        if (frequencyKey == parentFrequencyKey) {
            setOrganAffectedName(detail.getOrganAffectedName());
        }
    }

    // --------------------------------------------------------- Public Methods

    public final void setOrganOfOriginKey(int key) {
        this.organOfOriginKey = key;
    }

    public final int getOrganOfOriginKey() {
        return this.organOfOriginKey;
    }

    public final void setStrainKey(int key) {
        this.strainKey = key;
    }

    public final int getStrainKey() {
        return this.strainKey;
    }

    public final void setStrainName(String name) {
        this.strainName = name;
    }

    public final String getStrainName() {
        return this.strainName;
    }

    public final void setTumorClassificationKey(int key) {
        this.tumorClassificationKey = key;
    }

    public final int getTumorClassificationKey() {
        return this.tumorClassificationKey;
    }

    public final void setAgentKeys(Collection keys) {
        this.agentKeys = keys;
    }

    public final Collection getAgentKeys() {
        return this.agentKeys;
    }

    public String getAgentKeysAsParams() {
        return DAOUtils.collectionToString(this.agentKeys, ",", "");
    }

    public void add(MTBStrainTumorDetailsDTO detail) {
        String freq = detail.getFrequency();

        allTFKeys.add(detail.getTumorFrequencyKey() + "");

        if (!("0".equalsIgnoreCase(freq))) {
            tfKeysWithFrequency.add(detail.getTumorFrequencyKey() + "");
        }

        refAccIds.put(detail.getRefAccId(), detail.getRefAccId());

        if ("M".equalsIgnoreCase(detail.getSex())) {
            freqMale.add(freq);
        } else if ("F".equalsIgnoreCase(detail.getSex())) {
            freqFemale.add(freq);
        } else if ("X".equalsIgnoreCase(detail.getSex())) {
            freqMixed.add(freq);
        } else {
            freqUnknown.add(freq);
        }

        setImages(this.getImages() ? true : detail.getImages());
        setMetastasis(detail.getMetastasis());

        if (this.frequencyKey == -1) {
            setFrequencyKey(detail.getTumorFrequencyKey());
        } else {
            setFrequencyKey(-1);
        }
    }

    public final Collection<String> getAllTFKeys() {
        return this.allTFKeys;
    }

    public final int getNumberTFRecords() {
        return this.allTFKeys.size();
    }

    public final Collection<String> getTFKeysWithFrequency() {
        return this.tfKeysWithFrequency;
    }

    public final int getNumberTFRecordsWithFrequency() {
        return this.tfKeysWithFrequency.size();
    }

    public String getAllTFKeysAsParams() {
        return DAOUtils.collectionToString(this.allTFKeys, ",", "");
    }

    public void addTFKeyWithFrequency(int key) {
        tfKeysWithFrequency.add(key + "");
    }

    public void addTumorFrequencyKey(int key) {
        allTFKeys.add(key + "");
    }

    public void merge(MTBStrainTumorSummaryDTO sum) {
        allTFKeys.addAll(sum.getAllTFKeys());
        tfKeysWithFrequency.addAll(sum.getTFKeysWithFrequency());
        freqMale.addAll(sum.getFreqMale());
        freqFemale.addAll(sum.getFreqFemale());
        freqMixed.addAll(sum.getFreqMixed());
        freqUnknown.addAll(sum.getFreqUnknown());
        refAccIds.putAll(sum.getRefAccIds());
        metastasizesTo.addAll(sum.getMetastasizesTo());
        setImages(this.getImages() ? true : sum.getImages());
    }
    
   public Collection<String> getAgentsCollection() {
       return this.collectionAgents;
   }

    public Collection<String> getStrainTypesCollection() {
        return this.collectionStrainTypes;
    }

    public Collection<String> getReferencesCollection() {
        return this.collectionReferences;
    }
    
    public final String getFreqMaleString() {
        return getFrequencyString(freqMale);
    }

    public final String getFreqFemaleString() {
        return getFrequencyString(freqFemale);
    }

    public final String getFreqMixedString() {
        return getFrequencyString(freqMixed);
    }

    public final String getFreqUnknownString() {
        return getFrequencyString(freqUnknown);
    }
    
    
    
    public final Double getMaxFreqMale() {
        return getMax(getFrequencyString(freqMale));
    }

    public final Double getMaxFreqFemale() {
        return getMax(getFrequencyString(freqFemale));
    }

    public final Double getMaxFreqMixed() {
        return getMax(getFrequencyString(freqMixed));
    }

    public final Double getMaxFreqUnknown() {
        return getMax(getFrequencyString(freqUnknown));
    }
    
    private final Double getMax(String freq){
        if(freq == null) return null;
        String[] parts = freq.split("-");
        if(parts.length == 1){
            return freqToDouble(parts[0]);
        }else if(parts.length == 2){
            return freqToDouble(parts[1].trim());
        }
        log.error("unable to determine maximum frequency for "+freq);
        return -1d; // would null be preferable?
    }
    
    public final String getFreqAllString(){
      ArrayList<String> all = new ArrayList<String>();
      all.addAll(freqMale);
      all.addAll(freqFemale);
      all.addAll(freqMixed);
      all.addAll(freqUnknown);
      return getFrequencyString(all);
    }

    public final Collection<String> getFreqMale() {
        return this.freqMale;
    }

    public final Collection<String> getFreqFemale() {
        return this.freqFemale;
    }

    public final Collection<String> getFreqMixed() {
        return this.freqMixed;
    }

    public final Collection<String> getFreqUnknown() {
        return this.freqUnknown;
    }

    public final void setTumorName(String name) {
        this.tumorName = name;
    }

    public final String getTumorName() {
        return this.tumorName;
    }

    public final void setTumorClassName(String name) {
        this.tumorClassName = name;
    }

    public final String getTumorClassName() {
        return this.tumorClassName;
    }

    public final void setTumorOrganName(String organ) {
        this.tumorOrganName = organ;
    }

    public final String getTumorOrganName() {
        return this.tumorOrganName;
    }

    public final void setAgents(Collection a) {
        this.agents = a;
    }

    public final Collection getAgents() {
        return this.agents;
    }

    public final void setImages(boolean images) {
        // one detail rec having images is enough to set the images to true
        //if (this.images == false) {
        if (!this.images) {
            this.images = images;
        }
    }

    public boolean getMetastasis() {
        return this.metastasis;
    }

    public final void setMetastasis(boolean mets) {
        // one detail rec having a metastasis is enough to set the set to true
        //if (this.metastasis == false) {
        if (!this.metastasis) {
            this.metastasis = mets;
        }
    }

    public boolean getImages() {
        return this.images;
    }

    public final void setTreatmentType(String treatment) {
        this.treatmentType = treatment;
    }

    public final String getTreatmentType() {
        return this.treatmentType;
    }

    public final void setOrganAffectedName(String organ) {
        this.organAffectedName = organ;
    }

    public final String getOrganAffectedName() {
        return this.organAffectedName;
    }

    public final void setMetastasizesTo(List<String> metsTo) {
        this.metastasizesTo = metsTo;
    }
    
    public List<String> getMetastasizesToDisplay() {
       
        // in theory this is only called once when building the jsp
        // so doing the deduplication and sorting here is not crazy redundant?
        HashMap<String,String> metMap = new HashMap<String,String>();
        List<String> display = new ArrayList<String>();
        for(String met:this.metastasizesTo){
            metMap.put(met,met);
        }
        
        display.addAll(metMap.keySet());
        Collections.sort(display);
        return display;
        
    
    }

   protected List<String> getMetastasizesTo() {
        return this.metastasizesTo;
    }

    public void addMetastasizesTo(String organ) {
        this.metastasizesTo.add(organ);
    }

    public Collection<String> getSortedRefAccIds() {
        List<String> c = null;

        if ((refAccIds != null) && (refAccIds.size() > 0)) {
            c = new ArrayList<String>(refAccIds.values());
            Object nullObj = null;
            c.remove(nullObj);
            Collections.sort(c);
        }

        return c;
    }

    public Map<String, String> getRefAccIds() {
        return this.refAccIds;
    }

    public void setRefAccIds(Map<String, String> accIds) {
        this.refAccIds = accIds;
    }

    public final void setFrequencyKey(int key) {
        this.frequencyKey = key;
    }

    public final int getFrequencyKey() {
        return this.frequencyKey;
    }

    public final void setParentFrequencyKey(int pfKey) {
        this.parentFrequencyKey = pfKey;
    }

    public final int getParentFrequencyKey() {
        return this.parentFrequencyKey;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods

    /**
     *
     * @param freq
     * @return
     */
    private double freqToDouble(String freq) {
        double ret = -1.0;

        try {
            ret = Double.parseDouble(freq);
        } catch (NumberFormatException nfe) {
            // do nothing
        } catch (Exception e) {
            // do nothing
        }

        if (ret > 0) {
            return ret;
        }

        String comp = freq.toLowerCase();

        if ("very high".equals(comp)) {
            ret = 81.0;
        } else if ("high".equals(comp)) {
            ret = 51.0;
        } else if ("moderate".equals(comp)) {
            ret = 31.0;
        } else if ("low".equals(comp)) {
            ret = 19.0;
         } else if ("very low".equals(comp)) {
            ret = 9.0;
        } else if ("sporadic".equals(comp)) {
            ret = 0.9;
        } else if ("observed".equals(comp)) {
            ret = 0.1;
        } else {
            ret = 0.0;
        }

        return ret;
    }

    private String getFrequencyString(List<String> array) {
        try {
            double min = 1000.0;
            String minStr = null;
            double max = -1000.0;
            String maxStr = null;

            if (array.size() == 0) {
                return null;
            } else if (array.size() == 1) {
                return array.get(0);
            }

            int i = 0;
            for (String temp : array) {
                if (StringUtils.hasValue(temp)) {
                  
                    temp.replaceAll("%", "");
                    // we must handle the situation where the incidence is recorded as
                    // "5 to 10" differently from just a numeric entry
                    if (temp.indexOf(" to ") > 0) {
                        int pos = temp.indexOf(' ');
                        double val1 = freqToDouble(temp.substring(0, pos));
                        double val2 = freqToDouble(temp.substring(pos + 3));

                        if (val1 < min) {
                            min = val1;
                            minStr = val1 + "";
                        }

                        if (val2 > max) {
                            max = val2;
                            maxStr = val2 + "";
                        }
                    // we must handle the situation where the incidence is recorded as
                    // "~5" differently from just a numeric entry
                    } else if (temp.charAt(0) == '~') {
                        // strip off the '~'
                        String newTemp = temp.substring(1);

                        double val = freqToDouble(newTemp);

                        if (val < min) {
                            min = val;
                            minStr = newTemp;
                        } else if (val > max) {
                            max = val;
                            maxStr = newTemp;
                        }
                    // we must handle the situation where the incidence is recorded as
                    // "<5" differently from just a numeric entry
                    } else if (temp.charAt(0) == '<') {
                        // strip off the '<'
                        String newTemp = temp.substring(1);

                        // strip off the '='
                        if (newTemp.charAt(0) == '=') {
                            newTemp = newTemp.substring(1);
                        }

                        double val = freqToDouble(newTemp);

                        if (val > 1) {
                            val--;
                        } else if (val > 0) {
                            val = val - 0.1;
                        }

                        if (val < min) {
                            min = val;
                            minStr = newTemp;
                        } else if (val > max) {
                            max = val;
                            maxStr = newTemp;
                        }
                    } else if (temp.charAt(0) == '>') {
                        // strip off the '>'
                        String newTemp = temp.substring(1);

                        // strip off the '='
                        if (newTemp.charAt(0) == '=') {
                            newTemp = newTemp.substring(1);
                        }

                        double val = freqToDouble(newTemp);

                        if (val > 1) {
                            val++;
                        } else if (val > 0) {
                            val = val + 0.1;
                        }

                        if (val < min) {
                            min = val;
                            minStr = newTemp;
                        } else if (val > max) {
                            max = val;
                            maxStr = newTemp;
                        }
                    } else {
                        double val = freqToDouble(temp);

                        if (val < min) {
                            min = val;
                            minStr = temp;
                        } else if (val > max) {
                            max = val;
                            maxStr = temp;
                        }
                    }

                    if (i == 0) {
                       if (min == 1000.0) {
                           min = max;
                           minStr = maxStr;
                       } else if (max == -1000.0) {
                           max = min;
                           maxStr = minStr;
                       }
                    }
                    i++;
                }
            }

            if (min == max) {
                return minStr;
            }

            
            return minStr + " - " + maxStr;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    
   
}

