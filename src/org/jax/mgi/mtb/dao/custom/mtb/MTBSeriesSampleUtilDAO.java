/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.gen.mtb.SampleDAO;
import org.jax.mgi.mtb.dao.gen.mtb.SampleDTO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesSampleAssocDAO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesSampleAssocDTO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.DataBean;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.LabelValueBeanComparator;
import org.jax.mgi.mtb.utils.LabelValueDataBean;

/**
 * 
 * @author sbn
 */
public class MTBSeriesSampleUtilDAO extends MTBUtilDAO {

    private static ArrayList<LabelValueBean<String, Long>> typesList = new ArrayList<LabelValueBean<String, Long>>();
    private static ArrayList<LabelValueDataBean<String, String, Long>> sitesList = new ArrayList<LabelValueDataBean<String, String, Long>>();
    private static ArrayList<LabelValueBean<String, String>> platforms = new ArrayList<LabelValueBean<String, String>>();
    private static ArrayList<LabelValueBean<String, Long>> organs = new ArrayList<LabelValueBean<String, Long>>();
    private static ArrayList<LabelValueBean<String, Long>> tumorClassifications = new ArrayList<LabelValueBean<String, Long>>();
    private static final Logger log = Logger.getLogger(MTBSeriesSampleUtilDAO.class.getName());
    private static final String MTB_TYPE_KEYS = "1,2,3,5,6,7,8";
    private static final String SITE_INFO_KEYS = "106,107";
    private static final long SITE_GEO = 106;
    private static String geoURL = "";
    private static MTBSeriesSampleUtilDAO singleton = new MTBSeriesSampleUtilDAO();
    // ----------------------------------------------------------- Constructors

    private MTBSeriesSampleUtilDAO() {
        super();
        loadMTBTypes();
        loadSites();
        loadPlatforms();
        loadTCs();
        loadOrgans();

    }

    // --------------------------------------------------------- Public Methods
    public static MTBSeriesSampleUtilDAO getInstance() {
        return singleton;
    }

    public ArrayList<LabelValueBean<String, Long>> getOrgans() {
        return organs;
    }

    public ArrayList<LabelValueBean<String, Long>> getTumorClassifications() {
        return tumorClassifications;
    }

    public ArrayList<LabelValueBean<String, Long>> getMTBTypesList() {

        return typesList;

    }

    public ArrayList<LabelValueDataBean<String, String, Long>> getSitesList() {
        return sitesList;
    }

    public ArrayList<LabelValueBean<String, String>> getPlatforms() {
        return platforms;
    }

    public String getMTBType(Long type) {
        for (LabelValueBean<String, Long> typeLVB : typesList) {
            if (typeLVB.getValue().equals(type)) {
                return typeLVB.getLabel();
            }

        }
        return "";

    }

    public String getDetail(Long type, long key) {

        String detail = "";
        switch (type.intValue()) {

            case 1:
                detail = getStrainDetail(key);
                break;
            case 2:
                detail = getMarkerDetail(key);
                break;
            case 3:
                detail = getAlleleDetail(key);
                break;
            case 5:
                detail = getTFDetail(key);
                break;
            case 6:
                detail = getRefDetail(key);
                break;
            case 7:
                detail = getOrganDetail(key);
                break;
            case 8:
                detail = getTCDetail(key);
                break;

        }

        return detail;
    }
    // does not search using SampleAssoc to objects other than tumorfrequency
    // does not deal with samples w/o series

    public ArrayList<MTBSeriesSampleSearchDTO> searchSeries(List<String> tumorClassifications,
            List<String> organs, List<String> platforms,
            String strain, String strainComp, String tfKey, String seriesId) {

        ArrayList<MTBSeriesSampleSearchDTO> results = new ArrayList<MTBSeriesSampleSearchDTO>();

        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        String organKeys = DAOUtils.collectionToString(organs, ", ", "");
        String tcKeys = DAOUtils.collectionToString(tumorClassifications, ", ", "");
        String platformList = DAOUtils.collectionToString(platforms, ", ", "'");

        StringBuffer sbStrainNameSelect = new StringBuffer();
        StringBuffer select = new StringBuffer();
        StringBuffer from = new StringBuffer();
        StringBuffer where = new StringBuffer();

        select.append("select distinct se.id,si.url, se.title, se.summary, ").append(EOL);
        select.append(" (Select count(*) from SeriesSampleAssoc ssax where ssax._series_key = se._series_key) as totalSamples, ").append(EOL);
        select.append(" sp.id, sp.title, sp.summary, sp.platform, sp.isControl, sp.url, ").append(EOL);
        select.append(" o.name || ' ' || tc.name || ', ' || s.name, tf._tumorfrequency_key ").append(EOL);

        from.append(" from Sample sp left join (Series se left join SeriesSampleAssoc ssa ").append(EOL);
        from.append(" on (se._series_key = ssa._series_key )) on (ssa._sample_key = sp._sample_key), ").append(EOL);
        from.append(" SampleAssoc sa, SiteInfo si, TumorFrequency tf, TumorType tt, ").append(EOL);
        from.append(" TumorClassification tc, Organ o, Strain s ").append(EOL);

        where.append(" where  sp._siteinfo_key = si._siteinfo_key ").append(EOL);
        where.append(" and sp._sample_key = sa._sample_key ").append(EOL);
        where.append(" and tf._tumortype_key = tt._tumortype_key ").append(EOL);
        where.append(" and tf._tumorfrequency_key = sa._object_key ").append(EOL);
        where.append(" and sa._mtbtypes_key = 5 ").append(EOL);
        where.append(" and tt._tumorclassification_key = tc._tumorclassification_key ").append(EOL);
        where.append(" and tt._organ_key = o._organ_key ").append(EOL);
        where.append(" and tf._tumortype_key  = tt._tumortype_key ").append(EOL);
        where.append(" and tf._strain_key = s._strain_key ").append(EOL);


        if (organKeys.length() >= 1) {
            String organQuery = "select _organ_key from Organ where _OrganParent_key in (" + organKeys + ") or _organ_key in  (" + organKeys + ")";
            where.append(" and(tt._organ_key in (" + organQuery + ") ").append(EOL);
            where.append("     or tf._organaffected_key in (" + organQuery + "))").append(EOL);
        }

        if (tcKeys.length() >= 1) {
            where.append("and tc._tumorclassification_key in ( select _tumorclassification_key from TumorClassification where _tcparent_key in (" + tcKeys + ") ");
            where.append("    or _tumorclassification_key in (" + tcKeys + ") )").append(EOL);
        }

        if (platformList.length() > 2) {
            where.append("  and sp.platform in (" + platformList + ") ").append(EOL);
          
        }

        

         if (tfKey != null && tfKey.length()>0 && (!"0".equals(tfKey))) {
            where.append(" and sa._object_key in (").append(tfKey).append(")").append(EOL);
        }

        try { 
            
            conn = getConnection();
            PreparedStatement ps;
            
           
        
            
            
            if (strain != null && strain.length() > 0) {
                
                String param = strain;
                if("Begins".equals(strainComp)){
                    param = "%" + strain;
                }else if("Contains".equals(strainComp)){
                    param = "%"+strain+"%";
                }

                sbStrainNameSelect.append("create temporary table tempStrain as ");
                sbStrainNameSelect.append("select _Strain_key ").append(EOL);
                sbStrainNameSelect.append("  from StrainSynonyms ").append(EOL);
                sbStrainNameSelect.append(" where name ilike ?");
                sbStrainNameSelect.append(EOL).append(" union ").append(EOL);
                sbStrainNameSelect.append("select _Strain_key ").append(EOL);
                sbStrainNameSelect.append("  from Strain ").append(EOL);
                sbStrainNameSelect.append(" where name ilike ?");

                from.append(", tempStrain tts ").append(EOL);
                where.append(" and  tf._strain_key = tts._strain_key ").append(EOL);
                PreparedStatement ps2 = conn.prepareStatement(sbStrainNameSelect.toString());
                ps2.setString(1, param);
                ps2.setString(2, param);
                ps2.execute();
            }
            
            
             if (seriesId != null) {
               where.append(" and se.id = ?").append(EOL);
               ps = conn.prepareStatement(select.toString() + from.toString() + where.toString() + " order by se.id, sp.id");
               ps.setString(1, seriesId);
               
            }else{
                 ps = conn.prepareStatement(select.toString() + from.toString() + where.toString() + " order by se.id, sp.id");
            }

           
            rs = ps.executeQuery();

            MTBSeriesSampleSearchDTO sssDTO = new MTBSeriesSampleSearchDTO();
            MTBSeriesSampleSearchDTO sampleWOSeriesDTO = new MTBSeriesSampleSearchDTO();
            while (rs.next()) {
                if (rs.getString(1) != null && !rs.getString(1).equals(sssDTO.getSeries().getId())) {
                    if (sssDTO.getTotalSamples() > 0) {
                        results.add(sssDTO);
                    }
                    sssDTO = new MTBSeriesSampleSearchDTO();
                    sssDTO.getSeries().setId(rs.getString(1));
                    sssDTO.setSiteURL(rs.getString(2));
                    sssDTO.getSeries().setTitle(rs.getString(3));
                    sssDTO.getSeries().setSummary(rs.getString(4));
                    sssDTO.setTotalSamples(rs.getInt(5));

                }
                SampleDTO sample = SampleDAO.getInstance().createSampleDTO();
                sample.setId(rs.getString(6));
                sample.setTitle(rs.getString(7));
                sample.setSummary(rs.getString(8));
                sample.setPlatform(rs.getString(9));
                sample.setIsControl(rs.getBoolean(10));
                sample.setUrl(rs.getString(11));
                DataBean bean = new DataBean();
                bean.put("tfDetail", rs.getString(12));
                bean.put("tfKey", rs.getLong(13) + "");
                sample.setDataBean(bean);

                if (rs.getString(1) == null) {
                    sampleWOSeriesDTO.addSample(sample);
                } else {
                    sssDTO.addSample(sample);
                }

            }
            if (sssDTO.getSampleCount() > 0) {
                results.add(sssDTO);
            }
            if (sampleWOSeriesDTO.getSampleCount() > 0) {
                results.add(sampleWOSeriesDTO);
            }

        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return results;
    }
    // private methods

    private String getMarkerDetail(long key) {
        return getDetail("Select symbol from Marker where _marker_key = " + key);
    }

    private String getAlleleDetail(long key) {
        return getDetail("Select symbol from Allele where _allele_key = " + key);
    }

    private String getOrganDetail(long key) {
        return getDetail("Select name from Organ where _organ_key = " + key);
    }

    private String getStrainDetail(long key) {
        return getDetail("Select name from Strain where _strain_key = " + key);
    }

    private String getTFDetail(long key) {
        return getDetail("SELECT o.name || ' ' || tc.name ||', ' || s.name "
                + " FROM TumorType tt, TumorClassification tc, Organ o, Strain s, TumorFrequency tf "
                + " WHERE tt._tumorclassification_key = tc._tumorclassification_key "
                + " and tt._organ_key = o._organ_key "
                + " and tf._tumortype_key  = tt._tumortype_key "
                + " and tf._strain_key = s._strain_key "
                + " and tf._tumorfrequency_key =" + key);
    }

    private String getTCDetail(long key) {
        return getDetail("select name from TumorClassification where _tumorclassification_key = " + key);
    }

    private String getRefDetail(long key) {
        return getDetail("select shortcitation from Reference where _reference_key = " + key);
    }

    private String getDetail(String sql) {

        String detail = "";
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                detail = rs.getString(1);
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }


        return detail;

    }

    private void loadPlatforms() {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select distinct platform from Sample order by platform");
            while (rs.next()) {
                getPlatforms().add(new LabelValueBean<String, String>(rs.getString(1), rs.getString(1)));
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }

    }

    private void loadTCs() {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select tc.name, tc._tumorclassification_key "
                    + "from TumorClassification tc, SampleAssoc sa, "
                    + "TumorFrequency tf, TumorType tt "
                    + "where sa._mtbtypes_key = 5 and sa._object_key = tf._tumorfrequency_key "
                    + "and tf._tumortype_key = tt._tumortype_key "
                    + "and tt._tumorclassification_key =  tc._tumorclassification_key "
                    + "union "
                    + "select tc.name, tc._tumorclassification_key "
                    + "from TumorClassification tc, SampleAssoc sa "
                    + "where sa._mtbtypes_key = 8 "
                    + "and sa._object_key =  tc._tumorclassification_key order by name");
            while (rs.next()) {
                getTumorClassifications().add(new LabelValueBean<String, Long>(rs.getString(1), rs.getLong(2)));
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }

    }

    private void loadOrgans() {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select o.name, a.name, o._organ_key "
                    + "from Organ o, SampleAssoc sa, TumorFrequency tf, TumorType tt, AnatomicalSystem a "
                    + "where sa._mtbtypes_key = 5 and sa._object_key = tf._tumorfrequency_key "
                    + "and tf._tumortype_key = tt._tumortype_key "
                    + "and tt._organ_key =  o._organ_key "
                    + "and o._anatomicalsystem_key = a._anatomicalsystem_key "
                    + " union "
                    + "select o.name, a.name, o._organ_key "
                    + "from Organ o, SampleAssoc sa, TumorFrequency tf, AnatomicalSystem a "
                    + "where sa._mtbtypes_key = 5 and sa._object_key = tf._tumorfrequency_key "
                    + "and tf._organaffected_key = o._organ_key "
                    + "and o._anatomicalsystem_key = a._anatomicalsystem_key "
                    + " union "
                    + "select o.name, a.name, o._organ_key from Organ o, SampleAssoc sa, AnatomicalSystem a "
                    + "where sa._mtbtypes_key = 7 and sa._object_key =  o._organ_key "
                    + "and o._anatomicalsystem_key = a._anatomicalsystem_key");

            String name = "";
            while (rs.next()) {
                name = rs.getString(1);
                if (name.equals("(Unspecified organ)")) {
                    name = rs.getString(2) + " - " + rs.getString(1);
                }
                this.organs.add(new LabelValueBean<String, Long>(name, rs.getLong(3)));
            }

            Collections.sort(this.organs, new LabelValueBeanComparator(LabelValueBeanComparator.TYPE_LABEL));


        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }

    }

    private void loadMTBTypes() {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            String sql = "Select _mtbtypes_key, type from MTBTypes where _mtbtypes_key in (" + MTB_TYPE_KEYS + ")";
            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                typesList.add(new LabelValueBean<String, Long>(rs.getString(2), rs.getLong(1)));
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }
    }

    private void loadSites() {

        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {

            String sql = "Select  name, url, _siteinfo_key from SiteInfo where _siteInfo_key in (" + SITE_INFO_KEYS + ")";
            con = getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                LabelValueDataBean<String, String, Long> lvdb = new LabelValueDataBean<String, String, Long>(rs.getString(1), rs.getString(2), rs.getLong(3));
                sitesList.add(lvdb);
                if (lvdb.getData().longValue() == SITE_GEO) {
                    geoURL = lvdb.getValue();
                }
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(con);
        }

    }

    public void loadSeriesFromGEO(String path, String id) throws Exception {

        Connection liteCon = null;
        long now = System.currentTimeMillis();
        SampleDAO sampleDAO = SampleDAO.getInstance();

        SeriesSampleAssocDAO ssaDAO = SeriesSampleAssocDAO.getInstance();

        SeriesDAO seriesDAO = SeriesDAO.getInstance();
        SeriesDTO seriesDTO = seriesDAO.createSeriesDTO();

        Class.forName("org.sqlite.JDBC");
        liteCon = DriverManager.getConnection("jdbc:sqlite:/" + path);

        Statement stmt = liteCon.createStatement();
        ResultSet rs = stmt.executeQuery("select title, summary, pubmed_id from gse where gse='" + id + "'");
        if (rs.next()) {
            seriesDTO.setTitle(rs.getString(1));
            String summary = rs.getString(2);
            if (summary.length() > 500) {
                summary = summary.substring(0, 500);
            }
            seriesDTO.setSummary(summary);
            seriesDTO.setId(id);
            seriesDTO.setReference(rs.getString(3));
            seriesDTO.setCreateDate(now);
            seriesDTO.setUpdateDate(now);
            seriesDTO.setCreateUser("GEO");
            seriesDTO.setUpdateUser("GEO");
            seriesDTO.setSiteinfoKey(106);
        } else {
            rs.close();
            stmt.close();
            liteCon.close();

            throw new Exception("No matching series for id=" + id);
        }

        ArrayList<SampleDTO> dtoList = new ArrayList<SampleDTO>();

        rs = stmt.executeQuery("select gsm.title, gsm.description, gsm.gsm, gpl.title "
                + "from gsm, gpl where gpl.gpl = gsm.gpl "
                + "and gsm.gsm in (select gsm from gse_gsm where gse ='" + id + "')");
        while (rs.next()) {
            SampleDTO sampleDTO = sampleDAO.createSampleDTO();
            sampleDTO.setCreateDate(now);
            sampleDTO.setUpdateDate(now);
            sampleDTO.setCreateUser("GEO");
            sampleDTO.setUpdateUser("GEO");
            sampleDTO.setTitle(rs.getString(1));

            String summary = rs.getString(2);
            if (summary.length() > 500) {
                summary = summary.substring(0, 499);
            }
            sampleDTO.setSummary(summary);
            sampleDTO.setId(rs.getString(3));
            sampleDTO.setPlatform(rs.getString(4));
            sampleDTO.setSiteinfoKey(106);
            sampleDTO.setIsControl(false);
            sampleDTO.setUrl(geoURL + sampleDTO.getId());
            dtoList.add(sampleDTO);
        }

        stmt.close();
        rs.close();
        liteCon.close();

        seriesDAO.getManager().beginTransaction();

        seriesDTO = seriesDAO.save(seriesDTO);

        for (SampleDTO sampleDTO : dtoList) {

            SampleDTO sampleDTO2 = sampleDAO.createSampleDTO();
            sampleDTO2.setId(sampleDTO.getId());
            sampleDTO2 = sampleDAO.loadUniqueUsingTemplate(sampleDTO2);
            if (sampleDTO2 != null && sampleDTO2.getSampleKey() != null) {
                sampleDTO.setSampleKey(sampleDTO2.getSampleKey());
            } else {
                sampleDTO = sampleDAO.save(sampleDTO);
            }
            SeriesSampleAssocDTO ssaDTO = ssaDAO.createSeriesSampleAssocDTO();
            ssaDTO.setSampleKey(sampleDTO.getSampleKey());
            ssaDTO.setSeriesKey(seriesDTO.getSeriesKey());
            ssaDTO.setCreateDate(now);
            ssaDTO.setUpdateDate(now);
            ssaDTO.setCreateUser("GEO");
            ssaDTO.setUpdateUser("GEO");

            ssaDAO.save(ssaDTO);

        }

        seriesDAO.getManager().endTransaction(true);

    }

    public void loadSampleFromGEO(String path, String id) throws Exception {

        Connection liteCon = null;
        long now = System.currentTimeMillis();
        SampleDAO sampleDAO = SampleDAO.getInstance();

        Class.forName("org.sqlite.JDBC");
        liteCon = DriverManager.getConnection("jdbc:sqlite:/" + path);

        Statement stmt = liteCon.createStatement();

        ResultSet rs = stmt.executeQuery("select gsm.title, gsm.description, gsm.gsm, "
                + "gpl.title from gsm, gpl where gpl.gpl = gsm.gpl "
                + "and gsm.gsm = '" + id + "'");

        if (rs.next()) {

            SampleDTO sampleDTO = sampleDAO.createSampleDTO();
            sampleDTO.setCreateDate(now);
            sampleDTO.setUpdateDate(now);
            sampleDTO.setCreateUser("GEO");
            sampleDTO.setUpdateUser("GEO");
            sampleDTO.setTitle(rs.getString(1));

            String summary = rs.getString(2);
            if (summary.length() > 500) {
                summary = summary.substring(0, 499);
            }
            sampleDTO.setSummary(summary);
            sampleDTO.setId(rs.getString(3));
            sampleDTO.setPlatform(rs.getString(4));
            sampleDTO.setSiteinfoKey(106);
            sampleDTO.setIsControl(false);
            sampleDTO.setUrl(geoURL + sampleDTO.getId());

            sampleDTO = sampleDAO.save(sampleDTO);


        } else {
            stmt.close();
            rs.close();
            liteCon.close();
            throw new Exception("No matching assay for id=" + id);
        }

        stmt.close();
        rs.close();
        liteCon.close();



    }
    // after deleting a series remove any samples that
    // 1. are not associated with a series
    // 2. are not associated with an MTB record

    public void cleanUpSamples(long[] sampleKeys) {

        StringBuffer keys = new StringBuffer();
        for (int i = 0; i < sampleKeys.length; i++) {
            if (i > 0) {
                keys.append(",");
            }
            keys.append(sampleKeys[i]);

        }
        Connection con = null;

        Statement stmt = null;
        try {

            String sql = "Delete from Sample where "
                    + " _sample_key in (" + keys.toString() + ") and "
                    + "_sample_key not in "
                    + " ( select _sample_key from SeriesSampleAssoc) "
                    + " and _sample_key not in (select _sample_key from SampleAssoc)";
            con = getConnection();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);


        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt);
            freeConnection(con);
        }

    }

    // data for webservice to provide TF info associated with GEO records
    public ArrayList<ArrayList<String>> getGEOTFData(String gse, String gpl) {

        // the first List should be column names to build the JSON
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        Connection con = null;

        PreparedStatement stmt = null;
        try {

             StringBuffer sql = new StringBuffer();
           
             
             sql.append(" Select ss.id as Series,  s.id as Sample,  s.platform as Platform,  o.name as Organ, ");
            sql.append(" tc.name as TumorClassification,  sx.sex as Sex,  str.name as Strain, a.name as TreatmentAgent, ");
            sql.append(" tf.colonySize as ColonySize, tf.numMiceAffected as NumberAffected, ");
            sql.append(" tf.incidence as Incidence, tf.ageOnset as AgeOnset, tf.ageDetection as AgeDetection, ");
            sql.append(" tf.breedingStatus as BreedingStatus, tf.note as Note ");
            sql.append(" from Series ss, SeriesSampleAssoc ssa, Sample s, SampleAssoc sa, ");
             sql.append(" TumorType tt, Organ o, TumorClassification tc, Strain str, Sex sx, ");
            sql.append(" TumorFrequency tf left join (TumorFrequencyTreatments tft join Agent a on ( tft._agent_key = a._agent_key)) on (tft._tumorfrequency_key  = tf._tumorfrequency_key) ");
            sql.append(" where tt._organ_key = o._organ_key ");
            sql.append(" and tt._tumorclassification_key = tc._tumorclassification_key ");
            sql.append(" and tf._tumortype_key = tt._tumortype_key ");
            sql.append(" and tf._strain_key = str._strain_key ");
            sql.append(" and tf._sex_key = sx._sex_key ");
            sql.append(" and sa._object_key = tf._tumorfrequency_key ");
            sql.append(" and s._sample_key = sa._sample_key ");
            sql.append(" and s._sample_key = ssa._sample_key ");
            sql.append(" and ss._series_key = ssa._series_key ");
            sql.append(" and ss._siteinfo_key = 106 ");
            
          
            boolean setGSE = false;
            boolean setGPL = false;
            
            if(gse != null && gse.length() > 0){
                sql.append(" and ss.id = ?");
                setGSE = true;
            }
            
            if(gpl != null &&  gpl.length() > 0){
                sql.append("and s.platform =?");
                setGPL = true;
            }
            
            con = getConnection();
            stmt  = con.prepareStatement(sql.toString());
            if(setGSE){
               stmt.setString(1, gse);
               if(setGPL){
                   stmt.setString(2,gpl);
               }
            }else if (setGPL){
                stmt.setString(1,gpl);
            }
            
            ResultSet rs = stmt.executeQuery();
            int columns = rs.getMetaData().getColumnCount();
            ArrayList<String> colNames = new ArrayList<String>(columns);
            for (int i = 1; i <= columns; i++) {
               colNames.add(rs.getMetaData().getColumnLabel(i)); 
               System.out.println(rs.getMetaData().getColumnLabel(i));
            }
            data.add(colNames);
            while(rs.next()){
                  ArrayList<String> row = new ArrayList<String>(columns);
                  for (int i = 1; i <= columns; i++) {
                      row.add(rs.getString(i));
                  }
                  data.add(row);
            }
            
        } catch (SQLException e) {
            log.error(e);
        } finally {
            close(stmt);
            freeConnection(con);
        }

        return data;
    }
}
