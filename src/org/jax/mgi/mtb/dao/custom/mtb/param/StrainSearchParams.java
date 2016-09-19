/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/StrainSearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb.param;

import java.util.List;

/**
 * Encapsulates <code>Strain</code> search parameters.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/param/StrainSearchParams.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class StrainSearchParams {

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

    private long lStrainKey = -1l;
    private String strainKeyComparison;
    private String strainName;
    private String strainNameComparison;
    private long lStrainFamilyKey = -1l;
    private String strainFamilyKeyComparison;
    private String strainFamilyName;
    private String strainFamilyNameComparison;
    private List<String> listStrainTypes;
    private boolean bExactStrainTypes;
    private long lReferenceKey = -1l;
    private long lAllelePairKey = -1l;
    private String strJAXMiceStockNumber;
    private List<String> listSites;
    private String strGeneticName;
    private String orderBy;
    private int maxItems = -1;

    // ----------------------------------------------------------- Constructors

    /** Creates a new instance of StrainSearch */
    public StrainSearchParams() {
    }

    // --------------------------------------------------------- Public Methods

    public long getStrainKey() {
        return lStrainKey;
    }

    public void setStrainKey(long strainKey) {
        this.lStrainKey = strainKey;
    }

    public String getStrainKeyComparison() {
        return strainKeyComparison;
    }

    public void setStrainKeyComparison(String strainKeyComparison) {
        this.strainKeyComparison = strainKeyComparison;
    }

    public String getStrainName() {
        return strainName;
    }

    public void setStrainName(String strainName) {
        this.strainName = strainName;
    }

    public String getStrainNameComparison() {
        return strainNameComparison;
    }

    public void setStrainNameComparison(String strainNameComparison) {
        this.strainNameComparison = strainNameComparison;
    }

    public long getStrainFamilyKey() {
        return lStrainFamilyKey;
    }

    public void setStrainFamilyKey(long strainFamilyKey) {
        this.lStrainFamilyKey = strainFamilyKey;
    }

    public String getStrainFamilyKeyComparison() {
        return strainFamilyKeyComparison;
    }

    public void setStrainFamilyKeyComparison(String strainFamilyKeyComparison) {
        this.strainFamilyKeyComparison = strainFamilyKeyComparison;
    }

    public String getStrainFamilyName() {
        return strainFamilyName;
    }

    public void setStrainFamilyName(String strainFamilyName) {
        this.strainFamilyName = strainFamilyName;
    }

    public String getStrainFamilyNameComparison() {
        return strainFamilyNameComparison;
    }

    public void setStrainFamilyNameComparison(String strainFamilyNameComparison) {
        this.strainFamilyNameComparison = strainFamilyNameComparison;
    }

    public List<String> getStrainTypes() {
        return listStrainTypes;
    }

    public void setStrainTypes(List<String> listStrainTypes) {
        this.listStrainTypes = listStrainTypes;
    }

    public boolean isExactStrainTypes() {
        return bExactStrainTypes;
    }

    public void setExactStrainTypes(boolean exactStrainTypes) {
        this.bExactStrainTypes = exactStrainTypes;
    }

    public long getReferenceKey() {
        return lReferenceKey;
    }

    public void setReferenceKey(long referenceKey) {
        this.lReferenceKey = referenceKey;
    }

    public long getAllelePairKey() {
        return lAllelePairKey;
    }

    public void setAllelePairKey(long allelePairKey) {
        this.lAllelePairKey = allelePairKey;
    }

    public String getJAXMiceStockNumber() {
        return strJAXMiceStockNumber;
    }

    public void setJAXMiceStockNumber(String number) {
        this.strJAXMiceStockNumber = number;
    }

    public List<String> getSites() {
        return listSites;
    }

    public void setSites(List<String> listSites) {
        this.listSites = listSites;
    }

    public String getGeneticName() {
        return strGeneticName;
    }

    public void setGeneticName(String name) {
        this.strGeneticName = name;
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

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}
