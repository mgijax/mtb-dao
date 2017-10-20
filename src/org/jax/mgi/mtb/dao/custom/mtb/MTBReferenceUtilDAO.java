/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceUtilDAO.java,v 1.1 2007/04/30 15:47:19 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.custom.mtb.param.ReferenceSearchParams;
import org.jax.mgi.mtb.dao.custom.mtb.param.StrainSearchParams;
import org.jax.mgi.mtb.dao.custom.mtb.param.TumorFrequencySearchParams;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDAO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.DataBean;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.LabelValueBeanComparator;
import org.jax.mgi.mtb.utils.LabelValueDataBean;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Reference</code>
 * data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:19
 * @version 1.1
 * @cvsheader
 * /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBReferenceUtilDAO.java,v
 * 1.1 2007/04/30 15:47:19 mjv Exp
 */
public class MTBReferenceUtilDAO extends MTBUtilDAO {

    private static final String SQL_UNIQUE_JOURNALS
            = "select unique journal journal "
            + "  from Reference "
            + " order by journal";
    private static final String SQL_REFERENCE_BY_ACCESSION
            = "select _Object_key "
            + "  from Accession "
            + " where accId = ?"
            + "   and _MTBTypes_key = 6";
    private static final String SQL_JNUM_BY_REFERENCE
            = "select accId "
            + "  from Accession "
            + " where _Object_key = ? "
            + "   and _MTBTypes_key = 6"
            + "   and _SiteInfo_key = 1";

    private static final String SQL_PUBMED_BY_REFERENCE
            = "select accId "
            + "  from Accession "
            + " where _Object_key = ? "
            + "   and _MTBTypes_key = 6"
            + "   and _SiteInfo_key = 29";

    private static final String SQL_ASSOCIATED_STRAINS_TEMP
            = "create temporary table temp_strains_count as "
            + "select _Strain_key from StrainReferences where _Reference_key = ? "
            + " union "
            + "select _Strain_key from StrainSynonyms where _Reference_key = ? "
            + " union "
            + "select _Strain_key from StrainNotes where _Reference_key = ?";
    private static final String SQL_ASSOCIATED_PATHOLOGY_TEMP
            = "create temporary table temp_pathology_count as "
            + "select pi._images_key images_key  from Pathology p, PathologyImages pi, Images i, TumorPathologyAssoc tpa "
            + " where p._Pathology_key = pi._Pathology_key "
            + " and pi._images_key = i._images_key and i.privateFlag = 0 "
            + " and p._pathology_key = tpa._pathology_key   and p._Pathologist_key = ? "
            + " union "
            + " select pi._images_key images_key from Pathology p, PathologyImages pi, Images i, TumorPathologyAssoc tpa "
            + " where p._Pathology_key = pi._Pathology_key "
            + " and pi._images_key = i._images_key and i.privateFlag = 0 "
            + " and p._pathology_key = tpa._pathology_key and p._Contributor_key = ?";

    private static final String SQL_ACCESSION_IDS
            = "select si.description, sl.url, a.accId "
            + "  from Accession a, "
            + "       SiteInfo si, "
            + "       SiteLinks sl "
            + " where a._SiteInfo_key = si._SiteInfo_key "
            + "   and si._SiteInfo_key = sl._SiteInfo_key"
            + "  and sl._SiteLinks_key != 106  "
            + // exclude the MGI marker link 
            "   and a._MTBTypes_key = 6  "
            + "   and a._Object_key = ?";

    private static final String SQL_SEARCH_REFERENCE_SELECT_FROM
            = "select r._Reference_key, r.authors, r.authors2, r.primaryAuthor, r.year, "
            + " r.title, r.title2, a.numericPart, a.accId, r.citation, r.priority,r.codedBy, r.codedBy_date, "
            + " (select count(_tumortype_key) from ReferenceTumorTypeAssoc rta where rta._reference_key = r._reference_key) as ttypes, "
            + " (select count(_strainreferences_key) from StrainReferences sr where sr._reference_key = r._reference_key) as strains, "
            + " (select count(_tumorfrequency_key) from TumorFrequency tfr where tfr._reference_key = r._reference_key) as tfs "
            + "  from Reference r, Accession a  ";

    private static final String SQL_SEARCH_REFERENCE_WHERE = "where  r._Reference_key = a._Object_key and a._mtbtypes_key = 6 and a._siteinfo_key = 1 ";

    private static final String SQL_HUMAN_MARKERS
            = "SELECT a.accID entrezGeneId, m._marker_key mKey, m.symbol symbol, m.name as mname, c.chromosome chromosome, o.commonName organism"
            + " FROM Marker m left join Accession a on ( m._marker_key = a._object_key and a._mtbtypes_key = 2 and a._siteinfo_key = 48), "
            + " Chromosome c, Organism o, HumanMarkerReference hmr "
            + " WHERE m._chromosome_key = c._chromosome_key "
            + " AND c._organism_key = o._organism_key "
            + " AND hmr._marker_key = m._marker_key "
            + " AND hmr._reference_key = ? order by symbol";
    // -------------------------------------------------------------- Constants
    public static final int ID_YEAR = 0;
    public static final int ID_FIRST_AUTHOR = 1;
    public static final int ID_JNUMBER = 2;
    public static final String CHROM = "CHROM";
    public static final String EGID = "EGID";
    public static final String ORG = "ORG";  // ----------------------------------------------------- Instance Variables
    private static MTBReferenceUtilDAO singleton = new MTBReferenceUtilDAO();
    private static final Logger log
            = Logger.getLogger(MTBReferenceUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors
    /**
     * Creates a new instance of MTBStrainUtilDAO
     */
    private MTBReferenceUtilDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods
    /**
     * Get the MTBReferenceUtilDAO singleton.
     *
     * @return MTBReferenceUtilDAO
     */
    public static MTBReferenceUtilDAO getInstance() {
        return singleton;
    }

    /**
     * Get all of the journals that are used in the Reference table.
     *
     * @return a List of LabelValueBeans.
     */
    public List<LabelValueBean> getUniqueJournals() {
        List<LabelValueBean> journals = new ArrayList<LabelValueBean>();
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL_UNIQUE_JOURNALS);

            while (rs.next()) {
                LabelValueBean<String, String> journal
                        = new LabelValueBean<String, String>();
                journal.setLabel(rs.getString(1));
                journal.setValue(rs.getString(1));
                journals.add(journal);
            }
        } catch (SQLException sqle) {
            log.error("Error retreiving unique journals.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return journals;
    }

    /**
     * Get a MTBReferenceDetailDTO object by accession id.
     *
     * @param accId the accession id
     * @return a MTBReferenceDetailDTO object
     */
    public MTBReferenceDetailDTO getReferenceByAccession(String accId) {
        return getReference(getReferenceKeyByAccession(accId));
    }

    /**
     * Get a reference key by the accession id.
     *
     * @param accId the accession id
     * @return the reference key
     */
    public long getReferenceKeyByAccession(String accId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        long lKey = -1;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_REFERENCE_BY_ACCESSION);
            stmt.setString(1, accId);
            rs = stmt.executeQuery();

            while (rs.next()) {
                lKey = rs.getLong(1);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            log.error("Error retreiving reference for accession id = "
                    + accId, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return lKey;
    }

    /**
     * Get the accession id for a reference key.
     *
     * @param key the reference key
     * @return the accession id
     */
    public String getJNumByReference(long key) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String accId = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_JNUM_BY_REFERENCE);
            stmt.setLong(1, key);
            rs = stmt.executeQuery();

            while (rs.next()) {
                accId = rs.getString(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retreiving reference for accession id = " + accId, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return accId;
    }

    public String getPubMedByReference(long key) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String pmId = null;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_PUBMED_BY_REFERENCE);
            stmt.setLong(1, key);
            rs = stmt.executeQuery();

            while (rs.next()) {
                pmId = rs.getString(1);
            }
        } catch (SQLException sqle) {
            log.error("No pubmed id for reference key = " + key, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return pmId;
    }

    /**
     * Return all the markers associated with the reference via the
     * HumanMarkerReference table
     *
     * @param lKey the key for a reference
     * @return ArrayList<MarkerDTO>
     */
    public ArrayList<MarkerDTO> getHumanMarkers(long lKey) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<MarkerDTO> markers = new ArrayList<MarkerDTO>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_HUMAN_MARKERS);
            stmt.setLong(1, lKey);
            rs = stmt.executeQuery();

            MarkerDTO dto = null;
            while (rs.next()) {
                dto = MarkerDAO.getInstance().createMarkerDTO();
                DataBean bean = new DataBean();
                bean.put(EGID, rs.getString("entrezGeneId"));
                bean.put(ORG, rs.getString("organism"));
                bean.put(CHROM, rs.getString("chromosome"));
                dto.setDataBean(bean);
                dto.setName(rs.getString("mname"));
                dto.setSymbol(rs.getString("symbol"));
                dto.setMarkerKey(rs.getLong("mKey"));
                markers.add(dto);
            }

        } catch (SQLException sqle) {
            log.error("Error retreiving markers for reference =" + lKey, sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return markers;

    }

    public ArrayList<ReferenceDTO> getHumanMarkerReferences() {

        ArrayList<ReferenceDTO> dtos = new ArrayList<ReferenceDTO>();

        try {

            ReferenceDAO referenceDAO = ReferenceDAO.getInstance();
            dtos = (ArrayList<ReferenceDTO>) referenceDAO.loadByWhere(" where _reference_key in (select distinct _reference_key from HumanMarkerReference) order by year desc, primaryAuthor asc ");

        } catch (Exception e) {
            log.error(e);
        }

        return dtos;
    }

    /**
     * Get a MTBReferenceDetailDTO object from the reference lKey.
     *
     * @param lKey the reference lKey
     * @return a MTBReferenceDetailDTO object
     */
    public MTBReferenceDetailDTO getReference(long lKey) {
        // the reference detail object to return
        MTBReferenceDetailDTO reference = null;

        try {
            // create a Reference DAO
            ReferenceDAO referenceDAO = ReferenceDAO.getInstance();
            ReferenceDTO referenceDTO = referenceDAO.loadByPrimaryKey(new Long(lKey));
            reference = new MTBReferenceDetailDTO(referenceDTO);

            // retrieve the additional information in MTB
            reference.setAdditionalInfo(getAdditionalInfo(lKey));
            reference.setOtherAccessionIds(getAccessionIds(lKey));
        } catch (Exception e) {
            log.error("Unable to retrive reference information", e);
        }

        return reference;
    }

    /**
     * Search for references.
     *
     * @param params the search parameters
     * @return the results
     */
    public SearchResults<MTBReferenceSearchDTO> searchReference(ReferenceSearchParams params)
            throws NullPointerException, IllegalArgumentException, DAOException {

        Connection conn = null;
        ResultSet rs = null;
        Statement stmtSelect = null;
        List<MTBReferenceSearchDTO> references = new ArrayList<MTBReferenceSearchDTO>();
        SearchResults<MTBReferenceSearchDTO> resCollection = null;

        try {
            conn = getConnection();

            StringBuffer sbTemp = new StringBuffer();
            StringBuffer sbSelect = new StringBuffer(SQL_SEARCH_REFERENCE_SELECT_FROM);

            if ((params.getOrgan() > 0) || (params.getTumorClassification() > 0)) {

                sbSelect.append(", RefTumorTypeTemp rttt ");
            }

            sbSelect.append(SQL_SEARCH_REFERENCE_WHERE);

            if ((params.getOrgan() > 0) || (params.getTumorClassification() > 0)) {
                String tumorTypeClause;
                if ((params.getOrgan() > 0) && (params.getTumorClassification() > 0)) {
                    tumorTypeClause = " tt._organ_key = " + params.getOrgan()
                            + " and  tt._tumorclassification_key = " + params.getTumorClassification() + "  ";
                } else if (params.getOrgan() < 0) {
                    tumorTypeClause = " tt._tumorclassification_key = " + params.getTumorClassification() + " ";
                } else {
                    tumorTypeClause = " tt._organ_key = " + params.getOrgan() + "  ";
                }
                sbTemp.append("Create temporary table RefTumorTypeTemp as ");
                sbTemp.append("select rtta._reference_key _reference_key from ReferenceTumorTypeAssoc rtta, TumorType tt where rtta._tumortype_key = tt._tumortype_key and ");
                sbTemp.append(tumorTypeClause);
                sbTemp.append(" union ");
                sbTemp.append(" select tf._reference_key _reference_key from TumorFrequency tf, TumorType tt where tf._tumortype_key = tt._tumortype_key and ");
                sbTemp.append(tumorTypeClause);

                sbSelect.append(" and r._reference_key = rttt._reference_key ");
            }

            if (params.getReferenceKey() > 0) {
                sbSelect.append(" and ").append(DAOUtils.formatNumericCondition(" r._Reference_key", params.getReferenceKeyComparison(), params.getReferenceKey()));
            }

            if(StringUtils.hasValue(params.getReferenceAccessionId())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("a.accID", "=", params.getReferenceAccessionId(), "'"));
            }
            
            if(StringUtils.hasValue(params.getFirstAuthor())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.primaryAuthor", params.getFirstAuthorComparison(), params.getFirstAuthor(), "'"));
            }
            
            if (StringUtils.hasValue(params.getAuthors())) {
                sbSelect.append(" and ( ").append(DAOUtils.formatCondition("r.authors", params.getAuthorsComparison(), params.getAuthors(), "'"));
                sbSelect.append(" or ").append(DAOUtils.formatCondition("r.authors2", params.getAuthorsComparison(), params.getAuthors(), "'"));
                sbSelect.append(" ) ");
            }
            
            if(StringUtils.hasValue(params.getJournal())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.journal", params.getJournalComparison(), params.getJournal(), "'"));
            }
            
            
            if(StringUtils.hasValue(params.getVolume())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.volume", params.getVolumeComparison(), params.getVolume(), "'"));
            }
            
            if(StringUtils.hasValue(params.getPages())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.pages", params.getPagesComparison(), params.getPages(), "'"));
            }
            
            if(StringUtils.hasValue(params.getTitle())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.title", params.getTitleComparison(), params.getTitle(), "'"));
            }
            
            if(StringUtils.hasValue(params.getCodedBy())){
                sbSelect.append(" and ").append(DAOUtils.formatCondition("r.codedBy", "=", params.getCodedBy(), "'"));
            }
            
            if (params.getIsReviewArticle()) {
                sbSelect.append(" and r.priority = 1 ");
            }

            if (params.getCoded() == 0) {
                sbSelect.append(" and r.codedBy_date is null ");
            }
            if (params.getCoded() == 1) {
                sbSelect.append(" and r.codedBy_date is not null");
            }
            if (params.getPriority() > -2) {
                sbSelect.append(" and r.priority =" + params.getPriority() + " ");

            }
            if (!params.getIncludeRejected()) {
                sbSelect.append(" and r.priority != -1 ");

            }

            if (params.getIndexed() == 0) {
                sbSelect.append(" and r._reference_key not in (select distinct _reference_key from ReferenceTumorTypeAssoc where create_user != 'FMPro' ) ");
                sbSelect.append(" and r.priority != -1 ");
                sbSelect.append(" and r._reference_key not in (select distinct _reference_key from TumorFrequency ) ");
            }
            if (params.getIndexed() == 1) {
                sbSelect.append(" and r._reference_key in (select distinct _reference_key from ReferenceTumorTypeAssoc where create_user != 'FMPro'  ) ");
            }

            if (params.getCreateDate() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                sbSelect.append(" and date(r.create_date) " + params.getCreateDateComparison() + " '" + sdf.format(params.getCreateDate()) + "' ");
            }

            if (params.getCodedByDate() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                sbSelect.append(" and date(r.codedBy_date) " + params.getCodedByDateComparison() + " '" + sdf.format(params.getCodedByDate()) + "' ");
            }

            if (ReferenceSearchParams.ORDER_BY_JNUMBER.equalsIgnoreCase(params.getOrderBy())) {
                params.setOrderBy(" a.numericPart desc ");
            }

            if (params.getPubYear() > 0) {
                sbSelect.append(" and cast(r.year as integer) " + params.getPubYearComparison() + " " + params.getPubYear());
            }

            String orderBy = params.getOrderBy();
            if (orderBy != null && orderBy.trim().length() > 0) {
                sbSelect.append(" order by ").append(params.getOrderBy());
            }

            stmtSelect = conn.createStatement();

            if (sbTemp.length() > 0) {
                stmtSelect.execute(sbTemp.toString());
            }

            log.debug(sbTemp.toString());
            log.debug(sbSelect.toString());

            rs = stmtSelect.executeQuery(sbSelect.toString());

            while (rs.next()) {
                MTBReferenceSearchDTO ref = new MTBReferenceSearchDTO();

                ref.setKey(rs.getInt(1));
                ref.setAuthors(DAOUtils.nvl(rs.getString(2), "") + DAOUtils.nvl(rs.getString(3), ""));
                ref.setFirstAuthor(rs.getString(4));
                ref.setYear(rs.getString(5));
                ref.setTitle(DAOUtils.nvl(rs.getString(6), "") + DAOUtils.nvl(rs.getString(7), ""));
                ref.setAccId(rs.getString(9));
                ref.setCitation(DAOUtils.nvl(rs.getString(10), ""));
                ref.setPriority(new Long(rs.getInt(11)));

                if (ref.getPriority().longValue() == 1) {
                    ref.setIsReviewArticle(true);  // N.B. The column isReviewArticle is vestigial
                }
                if (rs.wasNull()) {
                    ref.setPriority(null);
                }
                ref.setCodedBy(rs.getString(12));
                ref.setCodedByDate(rs.getDate(13));

                ref.setTumorTypeAssocs(rs.getInt(14));
                ref.setStrainAssocs(rs.getInt(15));
                ref.setTumorFreqAssocs(rs.getInt(16));

                references.add(ref);
            }

        } catch (SQLException ex) {
            throw new DAOException(ex);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        int totalItemsFound = references.size();

        // sort and return the corect number of rows
        MTBReferenceSearchDTO refArrTemp[] = (MTBReferenceSearchDTO[]) references.toArray(new MTBReferenceSearchDTO[references.size()]);
        MTBReferenceSearchDTO refArr[] = null;

        if (params.getMaxItems() > 0) {
            refArr = new MTBReferenceSearchDTO[Math.min(params.getMaxItems(), refArrTemp.length)];
            System.arraycopy(refArrTemp, 0, refArr, 0, Math.min(params.getMaxItems(), refArrTemp.length));
            references = new ArrayList<MTBReferenceSearchDTO>(Arrays.asList(refArr));
        } else {
            references = new ArrayList<MTBReferenceSearchDTO>(Arrays.asList(refArrTemp));
        }

        resCollection = new SearchResults<MTBReferenceSearchDTO>(references, totalItemsFound);
        return resCollection;
    }

    // ------------------------------------------------------ Protected Methods
    // none
    // -------------------------------------------------------- Private Methods
    /**
     * Get the additional information associated with the reference. This
     * additional information is the number of associated tumor frquencies,
     * strains, and pathology reports.
     *
     * @param lKey the reference key
     * @return a List of LabelValueBeans containing the associated information
     */
    private List<LabelValueBean<String, Long>> getAdditionalInfo(long lKey) {
        List<LabelValueBean<String, Long>> additionalInfo
                = new ArrayList<LabelValueBean<String, Long>>();

        LabelValueBean<String, Long> datatype = null;

        // get additional tumor information
        datatype = new LabelValueBean<String, Long>();
        datatype.setLabel("Tumor Records");
        datatype.setValue(getNumberOfAssociatedTumors(lKey));
        additionalInfo.add(datatype);

        // get additional strain information
        datatype = new LabelValueBean<String, Long>();
        datatype.setLabel("Strains");
        datatype.setValue(getNumberOfAssociatedStrains(lKey));
        additionalInfo.add(datatype);

        // get additional pathology information
        datatype = new LabelValueBean<String, Long>();
        datatype.setLabel("Pathology Images");
        datatype.setValue(getNumberOfAssociatedPathologyImages(lKey));
        additionalInfo.add(datatype);

        return additionalInfo;
    }

    /**
     * Get the number of associated tumor frequencies for the given reference
     * key.
     *
     * @param lKey the reference key
     * @return the number of associated tumor frequencies
     */
    private long getNumberOfAssociatedTumors(long lKey) {

        StringBuilder sbRef = new StringBuilder();
        // Want to use this query since it is what is returned by clicking on the link based on this count

        sbRef.append(" select count(distinct tot.tfKey) from( ");
        sbRef.append(" select  _TumorFrequency_key tfkey  from TumorFrequency where _Reference_key = ? ");
        sbRef.append(" union");
        sbRef.append(" select  _TumorFrequency_key tfkey from TumorFrequencyNotes where _Reference_key = ? ");
        sbRef.append(" union");
        sbRef.append(" select _TumorFrequency_key tfkey from TumorFrequencySynonyms where _Reference_key = ? ");
        sbRef.append(" union");
        sbRef.append(" select  tp._child_key tfkey  from TumorProgression tp, TumorFrequency tf where tf._tumorfrequency_key =  tp._parent_key and tf._Reference_key = ? ");
        sbRef.append(" union");
        sbRef.append(" select tp._child_key tfkey  from TumorProgression tp, TumorFrequencyNotes tfn where tfn._tumorfrequency_key =  tp._parent_key and tfn._Reference_key = ? ");
        sbRef.append(" union");
        sbRef.append(" select tp._child_key tfkey  from TumorProgression tp, TumorFrequencySynonyms tfs where tfs._tumorfrequency_key = tp._parent_key and tfs._Reference_key = ? ");
        sbRef.append(" ) as tot");

        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        int nCount = 0;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sbRef.toString());
            pstmt.setLong(1, lKey);
            pstmt.setLong(2, lKey);
            pstmt.setLong(3, lKey);
            pstmt.setLong(4, lKey);
            pstmt.setLong(5, lKey);
            pstmt.setLong(6, lKey);
            

            
            rs = pstmt.executeQuery();

            while (rs.next()) {
                nCount = rs.getInt(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving total tumor frequency records for reference key = " + lKey,
                    sqle);
        } finally {
            close(pstmt);
            close(stmt, rs);
            freeConnection(conn);
        }

        return nCount;
    }

   

    /**
     * Get the number of associated strains for the given reference key.
     *
     * @param lKey the reference key
     * @return the number of associated strains
     */
    private long getNumberOfAssociatedStrains(long lKey) {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        int nCount = 0;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSOCIATED_STRAINS_TEMP);
            pstmt.setLong(1, lKey);
            pstmt.setLong(2, lKey);
            pstmt.setLong(3, lKey);
            pstmt.execute();

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(distinct _Strain_key) total from temp_strains_count");

            while (rs.next()) {
                nCount = rs.getInt(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving strains for reference key = " + lKey,
                    sqle);
        } finally {
            close(pstmt);
            close(stmt, rs);
            freeConnection(conn);
        }

        return nCount;
    }

    /**
     * Get the number of associated pathology images for the given reference
     * key.
     *
     * @param lKey the reference key
     * @return the number of associated pathology reports
     */
    private long getNumberOfAssociatedPathologyImages(long lKey) {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        int nCount = 0;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSOCIATED_PATHOLOGY_TEMP);
            pstmt.setLong(1, lKey);
            pstmt.setLong(2, lKey);
            pstmt.execute();

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(distinct images_key) total from temp_pathology_count");

            while (rs.next()) {
                nCount = rs.getInt(1);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving pathology for reference key = " + lKey,
                    sqle);
        } finally {
            close(pstmt);
            close(stmt, rs);
            freeConnection(conn);
        }

        return nCount;
    }

    /**
     * Get a list of accession ids for the given reference key.
     *
     * @param lKey the reference key
     * @return a List of LabelValueDataBeans with the label being the
     * description, the value being the urlm and the data being the accession id
     */
    private List<LabelValueDataBean<String, String, String>> getAccessionIds(long lKey) {
        List<LabelValueDataBean<String, String, String>> otherAccessionIds
                = new ArrayList<LabelValueDataBean<String, String, String>>();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(SQL_ACCESSION_IDS);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                LabelValueDataBean<String, String, String> accessionInfo
                        = new LabelValueDataBean<String, String, String>();
                accessionInfo.setLabel(rs.getString(1));

                String url = rs.getString(2);
                String accId = rs.getString(3);
                url = url.replaceAll("@@@@", accId);

                accessionInfo.setValue(url);
                accessionInfo.setData(accId);
                otherAccessionIds.add(accessionInfo);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving accession info for reference = " + lKey, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        return otherAccessionIds;
    }

    public ArrayList<LabelValueDataBean<String, String, Long>> getReferenceTumorTypes(Long refKey) {

        ArrayList<LabelValueDataBean<String, String, Long>> referenceTumorTypes = new ArrayList<LabelValueDataBean<String, String, Long>>();

        String sql = "select distinct  o.name oname, a.name aname, tc.name tcname, rtta.create_user, rtta._referencetumortypeassoc_key, rtta.create_date "
                + " from TumorClassification tc, TumorType tt, Organ o, ReferenceTumorTypeAssoc rtta, AnatomicalSystem a"
                + " where o._organ_key = tt._organ_key "
                + " and tc._tumorclassification_key = tt._tumorclassification_key "
                + " and a._anatomicalsystem_key = o._anatomicalsystem_key "
                + " and tt._tumortype_key = rtta._tumortype_key "
                + " and rtta._reference_key = " + refKey
                + " order by rtta.create_date";

        String sql2 = "select distinct o.name oname, a.name aname, tc.name tcname, 'Curated', 0 "
                + " from TumorClassification tc, TumorType tt, Organ o, TumorFrequency tf, AnatomicalSystem a"
                + " where o._organ_key = tt._organ_key "
                + " and tc._tumorclassification_key = tt._tumorclassification_key "
                + " and a._anatomicalsystem_key = o._anatomicalsystem_key "
                + " and tt._tumortype_key = tf._tumortype_key "
                + " and tf._reference_key = " + refKey
                + " order by oname,aname,tcname";

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(sql2);

            rs = pstmt.executeQuery();
            String name;
            // only include anatomical system name if organ is unspecified
            while (rs.next()) {
                if (rs.getString(1).toLowerCase().contains("unspecified")) {
                    name = rs.getString(1) + "-" + rs.getString(2) + " " + rs.getString(3);
                } else {
                    name = rs.getString(1) + " " + rs.getString(3);
                }
                LabelValueDataBean<String, String, Long> rtt
                        = new LabelValueDataBean<String, String, Long>();
                rtt.setLabel(name);
                rtt.setValue(rs.getString(4));

                Long key = rs.getLong(5);

                rtt.setData(key);
                referenceTumorTypes.add(rtt);

            }

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            // only include anatomical system name if organ is unspecified
            while (rs.next()) {
                if (rs.getString(1).toLowerCase().contains("unspecified")) {
                    name = rs.getString(1) + "-" + rs.getString(2) + " " + rs.getString(3);
                } else {
                    name = rs.getString(1) + " " + rs.getString(3);
                }
                LabelValueDataBean<String, String, Long> rtt
                        = new LabelValueDataBean<String, String, Long>();
                rtt.setLabel(name);
                rtt.setValue(rs.getString(4));

                Long key = rs.getLong(5);

                rtt.setData(key);
                referenceTumorTypes.add(rtt);

            }

        } catch (SQLException sqle) {
            log.error("Error loading Reference TumorTypes", sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        return referenceTumorTypes;
    }

    /**
     * Get tumor recs
     *
     * @deprecated
     */
    public SearchResults<MTBStrainTumorSummaryDTO> getTumorRecs(int referenceKey) {

        MTBTumorUtilDAO dao = MTBTumorUtilDAO.getInstance();

        TumorFrequencySearchParams tfParams = new TumorFrequencySearchParams();
        tfParams.setReferenceKey(referenceKey);
        StrainSearchParams sParams = new StrainSearchParams();

        // create the collection of matching tumor to return
        SearchResults<MTBStrainTumorSummaryDTO> res = null;

        try {
            res = dao.searchNewSummary(tfParams, sParams, "", -1);
        } catch (Exception daoe) {
            log.error("Error retreiving tumor records for reference = " + referenceKey, daoe);
        }

        return res;
    }

    /**
     * List of organs associated with references either by way of tumor
     * frequencies or ReferenceTumorTypeAssoc
     */
    public ArrayList<LabelValueBean<String, Long>> getReferenceOrgans() {

        ArrayList<LabelValueBean<String, Long>> results = new ArrayList<LabelValueBean<String, Long>>();

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;

        try {
            conn = getConnection();

            String sql = "Select distinct o.name, a.name, o._organ_key from Organ o, AnatomicalSystem a, TumorType t "
                    + " where o._organ_key = t._organ_key "
                    + " and o._anatomicalsystem_key = a._anatomicalsystem_key and t._tumortype_key in "
                    + "(select _tumortype_key from ReferenceTumorTypeAssoc "
                    + "union "
                    + "select _tumortype_key from TumorFrequency) order by o.name, a.name";

            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            String name;
            // only include anatomical system name if organ is unspecified
            while (rs.next()) {
                name = rs.getString(1);
                if (name.toLowerCase().contains("unspecified")) {
                    name = rs.getString(2) + " - " + rs.getString(1);
                }

                LabelValueBean<String, Long> lvb
                        = new LabelValueBean<String, Long>(name, rs.getLong(3));

                results.add(lvb);
            }

            Collections.sort(results, new LabelValueBeanComparator(LabelValueBeanComparator.TYPE_LABEL));

        } catch (Exception e) {
        }

        return results;
    }
}
