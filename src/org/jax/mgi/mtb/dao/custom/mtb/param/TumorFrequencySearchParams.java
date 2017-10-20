/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/TumorFrequencySearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.param;

import java.util.Collection;

/**
 * Encapsulates <code>TumorFrequency</code> search parameters.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/TumorFrequencySearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class TumorFrequencySearchParams {

    // -------------------------------------------------------------- Constants

    public static int NUMERIC_COMPARE_EQUALS = 0;
    public static int NUMERIC_COMPARE_LESSTHAN = 1;
    public static int NUMERIC_COMPARE_GREATERTHAN = 2;
    public static int NUMERIC_COMPARE_NOTEQUALS = 3;
    public static int STRING_COMPARE_EQUALS = 0;
    public static int STRING_COMPARE_NOTEQUALS = 1;
    public static int STRING_COMPARE_CONTAINS = 2;
    public static int STRING_COMPARE_NOTCONTAINS = 3;
    public static int STRING_COMPARE_STARTSWITH = 4;

    // ----------------------------------------------------- Instance Variables

    private long lTumorFrequencyKey;
    private String tfKeyComparison;
    private String tumorName;
    private String tumorNameComparison;
    private long lReferenceKey;
    private Collection colOrgansAffected;
    private Collection colOrgansOrigin;
    private Collection colTumorClassifications;
    private String strAgent;
    private long lAgentTypeKey;
    private boolean bRestrictToMetastasis;
    private boolean bMustHaveImages;
    private boolean bExcludeMets;
    private boolean bExcludePlasias;
    private String strAnatomicalSystemOriginName;
    private String strOrganOriginName;
    private String strOrganAffectedName;
    private long lOrganOriginKey;
    private long lOrganOriginParentKey;
    private int nOrganOriginNameComparison = STRING_COMPARE_EQUALS;
    private int nOrganAffectedNameComparison = STRING_COMPARE_EQUALS;
    private long lOrganAffectedKey;
    private long lOrganAffectedParentKey;
    private String allelePairKeys;
    private long lColonySize = -1;
    private int nColonySizeComparison = NUMERIC_COMPARE_EQUALS;
    private double dFrequency = -1.0;
    private int nFrequencyComparison = NUMERIC_COMPARE_EQUALS;
    private String orderBy;
    private int maxItems = -1;
    private int sexKey = -1;

    // ----------------------------------------------------------- Constructors

    /** Creates a new instance of TumorFrequencySearchParams */
    public TumorFrequencySearchParams() {
    }

    // --------------------------------------------------------- Public Methods

    public long getTumorFrequencyKey() {
        return lTumorFrequencyKey;
    }

    public void setTumorFrequencyKey(long tumorFrequencyKey) {
        this.lTumorFrequencyKey = tumorFrequencyKey;
    }

    public String getTfKeyComparison() {
        return tfKeyComparison;
    }

    public void setTfKeyComparison(String tfKeyComparison) {
        this.tfKeyComparison = tfKeyComparison;
    }

    public String getTumorName() {
        return tumorName;
    }

    public void setTumorName(String tumorName) {
        this.tumorName = tumorName;
    }

    public String getTumorNameComparison() {
        return tumorNameComparison;
    }

    public void setTumorNameComparison(String tumorNameComparison) {
        this.tumorNameComparison = tumorNameComparison;
    }

    public long getReferenceKey() {
        return lReferenceKey;
    }

    public void setReferenceKey(long referenceKey) {
        this.lReferenceKey = referenceKey;
    }

    public Collection getOrgansAffected() {
        return colOrgansAffected;
    }

    public void setOrgansAffected(Collection organsAffected) {
        this.colOrgansAffected = organsAffected;
    }

    public Collection getOrgansOrigin() {
        return colOrgansOrigin;
    }

    public void setOrgansOrigin(Collection organsOrigin) {
        this.colOrgansOrigin = organsOrigin;
    }

    public Collection getTumorClassifications() {
        return colTumorClassifications;
    }

    public void setTumorClassifications(Collection tumorClassifications) {
        this.colTumorClassifications = tumorClassifications;
    }

    public String getAgent() {
        return strAgent;
    }

    public void setAgent(String agent) {
        this.strAgent = agent;
    }

    public long getAgentTypeKey() {
        return lAgentTypeKey;
    }

    public void setAgentTypeKey(long agentTypeKey) {
        this.lAgentTypeKey = agentTypeKey;
    }

    public boolean isRestrictToMetastasis() {
        return bRestrictToMetastasis;
    }

    public void setRestrictToMetastasis(boolean restrictToMetastasis) {
        this.bRestrictToMetastasis = restrictToMetastasis;
    }

    public boolean isMustHaveImages() {
        return bMustHaveImages;
    }

    public void setMustHaveImages(boolean mustHaveImages) {
        this.bMustHaveImages = mustHaveImages;
    }

    public boolean isExcludeMets() {
        return bExcludeMets;
    }

    public void setExcludeMets(boolean excludeMets) {
        this.bExcludeMets = excludeMets;
    }

    public boolean isExcludePlasias() {
        return bExcludePlasias;
    }

    public void setExcludePlasias(boolean excludePlasias) {
        this.bExcludePlasias = excludePlasias;
    }

    public String getAnatomicalSystemOriginName() {
        return strAnatomicalSystemOriginName;
    }

    public void setAnatomicalSystemOriginName(String anatomicalSystemName) {
        this.strAnatomicalSystemOriginName = anatomicalSystemName;
    }
    
    public String getOrganOriginName() {
        return strOrganOriginName;
    }

    public void setOrganOriginName(String organName) {
        this.strOrganOriginName = organName;
    }

    public int getOrganOriginNameComparison() {
        return nOrganOriginNameComparison;
    }

    public void setOrganOriginNameComparison(int comparison) {
        this.nOrganOriginNameComparison = comparison;
    }

    public String getOrganAffectedName() {
        return strOrganAffectedName;
    }

    public void setOrganAffectedName(String organName) {
        this.strOrganAffectedName = organName;
    }

    public int getOrganAffectedNameComparison() {
        return nOrganAffectedNameComparison;
    }

    public void setOrganAffectedNameComparison(int comparison) {
        this.nOrganAffectedNameComparison = comparison;
    }

    public long getOrganOriginKey() {
        return lOrganOriginKey;
    }

    public void setOrganOriginKey(long organKey) {
        this.lOrganOriginKey = organKey;
    }

    public long getOrganAffectedKey() {
        return lOrganAffectedKey;
    }

    public void setOrganAffectedKey(long organKey) {
        this.lOrganAffectedKey = organKey;
    }

    public long getOrganOriginParentKey() {
        return lOrganOriginParentKey;
    }

    public void setOrganOriginParentKey(long organParentKey) {
        this.lOrganOriginParentKey = organParentKey;
    }

    public long getOrganAffectedParentKey() {
        return lOrganAffectedParentKey;
    }

    public void setOrganAffectedParentKey(long organParentKey) {
        this.lOrganAffectedParentKey = organParentKey;
    }

 /*   public long getAllelePairKey() {
        return lAllelePairKey;
    }

    public void setAllelePairKey(long allelePairKey) {
        this.lAllelePairKey = allelePairKey;
    }
*/
    public long getColonySize() {
        return lColonySize;
    }

    public void setColonySize(long colonySize) {
        this.lColonySize = colonySize;
    }

    public int getColonySizeComparison() {
        return nColonySizeComparison;
    }

    public void setColonySizeComparison(int comparison) {
        this.nColonySizeComparison = comparison;
    }

    public double getFrequency() {
        return dFrequency;
    }

    public void setFrequency(double frequency) {
        this.dFrequency = frequency;
    }

    public int getFrequencyComparison() {
        return nFrequencyComparison;
    }

    public void setFrequencyComparison(int comparison) {
        this.nFrequencyComparison = comparison;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

  public String getAllelePairKeys() {
    return allelePairKeys;
  }

  public void setAllelePairKeys(String allelePairKeys) {
    this.allelePairKeys = allelePairKeys;
  }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none

    /**
     * @return the sexKey
     */
    public int getSexKey() {
        return sexKey;
    }

    /**
     * @param sexKey the sexKey to set
     */
    public void setSexKey(int sexKey) {
        this.sexKey = sexKey;
    }
}
