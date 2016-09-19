/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorUtilDAO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
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
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.custom.mtb.param.StrainSearchParams;
import org.jax.mgi.mtb.dao.custom.mtb.param.TumorFrequencySearchParams;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridAnatomicalSystemHeaderRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridOrganDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridOrganHeaderRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridOrganParentDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridOrganParentHeaderRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainFamilyDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainFamilyRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainHeredityRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainRowDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridStrainHeredityDTO;
import org.jax.mgi.mtb.dao.custom.mtb.tfgrid.MTBTFGridTumorFrequencyDTO;
import org.jax.mgi.mtb.dao.gen.mtb.AssayImagesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AssayImagesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ImagesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ImagesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyDTO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyImagesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.PathologyImagesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDAO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainSynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.StrainTypeDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencyDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorFrequencySynonymsDTO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorTypeDAO;
import org.jax.mgi.mtb.dao.gen.mtb.TumorTypeDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.LabelValueBeanComparator;
import org.jax.mgi.mtb.utils.LabelValueDataBean;
import org.jax.mgi.mtb.utils.StringUtils;
import org.jax.mgi.mtb.utils.Timer;

/**
 * A <code>MTBUtilDAO</code> which performs operations on
 * <code>TumorFrequency</code> data and related information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBTumorUtilDAO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class MTBTumorUtilDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants
    public static final int ID_ORGAN = 0;
    public static final int ID_STRAIN = 1;
    private final String COLLECTION_PATHOLOGY = "pathology";
    private final String NUM_IMAGES = "numImages";
    private final String SQL_ASSOCIATED_FREQ =
            "select (select accId from Accession where _Object_key = tf._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfaccId, "
            + "tp._Parent_key, o.name, 0 isChild "
            + "  from TumorProgression tp, "
            + "       TumorFrequency tf, "
            + "       Organ o "
            + " where tf._TumorFrequency_key = tp._Parent_key "
            + "   and tf._OrganAffected_key = o._Organ_key "
            + "   and (tp._Parent_key = ?"
            + "        or "
            + "        tp._Child_key = ?"
            + "        or "
            + "        tp._Parent_key = (select itp._Parent_key from TumorProgression itp where itp._Child_key = ?))"
            + " union "
            + "select (select accId from Accession where _Object_key = tf._TumorFrequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfaccId, "
            + "tp._Child_key, o.name, 1 isChild "
            + "  from TumorProgression tp, "
            + "       TumorFrequency tf, "
            + "       Organ o "
            + " where tf._TumorFrequency_key = tp._Child_key "
            + "   and tf._OrganAffected_key = o._Organ_key "
            + "   and (tp._Parent_key = ?"
            + "        or "
            + "        tp._Child_key = ?"
            + "        or "
            + "        tp._Parent_key = (select itp._Parent_key from TumorProgression itp where itp._Child_key = ?))"
            + "   order by isChild, name";  // using 'union' rather than 'or' is vastly (ie. 144s vs .39s for tfKey 40935 )faster when there are lots of markers 
    private final String SQL_TUMOR_GENETICS =
            "select * from ("
            + " select ap._AllelePair_key, "
            + "       m._Marker_key, "
            + "       m.name mName, "
            + "       m.symbol mSymbol, "
            + "       c.chromosome, "
            + "       (select ia.name from Allele ia where ia._Allele_key = ap._Allele1_key) a1Name, "
            + "       (select ia.symbol from Allele ia where ia._Allele_key = ap._Allele1_key) a1Symbol, "
            + "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele1_key) a1Type,"
            + "       (select ia.name from Allele ia where ia._Allele_key = ap._Allele2_key) a2Name, "
            + "       (select ia.symbol from Allele ia where ia._Allele_key = ap._Allele2_key) a2Symbol, "
            + "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele2_key) a2Type"
            + "  from TumorGenetics tg, "
            + "       AllelePair ap, "
            + "       Allele a, "
            + "       Marker m, "
            + "       Chromosome c, "
            + "       AlleleMarkerAssoc ama "
            + " where tg._AllelePair_key = ap._AllelePair_key "
            + "   and ap._Allele1_key = a._Allele_key "
            + "   and a._Allele_key = ama._Allele_key "
            + "   and ama._Marker_key = m._Marker_key "
            + "   and m._Chromosome_key = c._Chromosome_key "
            + "   and a.somaticInd in (2,3) "
            + "   and ama._AlleleMarkerAssocType_key in (1,4) "
            + "   and tg._TumorFrequency_key = ?"
            + " union "
            + " select  ap._AllelePair_key, "
            + "       m._Marker_key, "
            + "       m.name mName, "
            + "       m.symbol mSymbol, "
            + "       c.chromosome, "
            + "       (select ia.name from Allele ia where ia._Allele_key = ap._Allele1_key) a1Name, "
            + "       (select ia.symbol from Allele ia where ia._Allele_key = ap._Allele1_key) a1Symbol, "
            + "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele1_key) a1Type,"
            + "       (select ia.name from Allele ia where ia._Allele_key = ap._Allele2_key) a2Name, "
            + "       (select ia.symbol from Allele ia where ia._Allele_key = ap._Allele2_key) a2Symbol, "
            + "       (select iay.type from Allele ia, AlleleType iay where ia._AlleleType_key = iay._AlleleType_key and ia._Allele_key = ap._Allele2_key) a2Type"
            + "  from TumorGenetics tg, "
            + "       AllelePair ap, "
            + "       Allele a, "
            + "       Marker m, "
            + "       Chromosome c, "
            + "       AlleleMarkerAssoc ama "
            + " where tg._AllelePair_key = ap._AllelePair_key "
            + "   and ap._Allele2_key = a._Allele_key "
            + "   and a._Allele_key = ama._Allele_key "
            + "   and ama._Marker_key = m._Marker_key "
            + "   and m._Chromosome_key = c._Chromosome_key "
            + "   and a.somaticInd in (2,3) "
            + "   and ama._AlleleMarkerAssocType_key in (1,4) "
            + "   and tg._TumorFrequency_key = ? ) as t"
            + " order by t.mName ";
    private final String SQL_TUMOR_NOTES =
            "select tfn.note, a.accId, r._Reference_key "
            + "  from TumorFrequencyNotes tfn, Reference r, Accession a "
            + " where a._Object_key = r._Reference_key "
            + "   and a._MTBTypes_key = 6 "
            + "   and a._SiteInfo_key = 1 "
            + "   and tfn._Reference_key = r._Reference_key "
            + "   and tfn._TumorFrequency_key = ?";
    private final String SQL_TUMOR_REFS =
            "select a.accId, r._Reference_key "
            + "  from Reference r, Accession a, temprefs tr "
            + " where a._Object_key = r._Reference_key "
            + "   and a._MTBTypes_key = 6 "
            + "   and a.prefixPart = 'J:' "
            + "   and r._Reference_key = tr._Reference_key "
            + " order by a.accid";
    private final String SQL_TUMOR_REFS_TEMP =
            " create temporary table temprefs as "
            + "select _Reference_key  "
            + "  from TumorFrequency "
            + " where _TumorFrequency_key = ?"
            + " union "
            + "select _Reference_key "
            + "  from TumorFrequencyNotes "
            + " where _TumorFrequency_key = ? "
            + " union "
            + "select _Reference_key "
            + "  from TumorFrequencySynonyms "
            + " where _TumorFrequency_key = ? ";
    private final String SQL_TUMOR_ORIGIN_WITH =
            "select distinct o._organ_key, o.name, a.name "
            + "  from Organ o, TumorFrequency tf, TumorType tt, AnatomicalSystem a "
            + " where tf._TumorType_key = tt._TumorType_key "
            + "   and o._Organ_key = tt._Organ_key "
            + "   and o._anatomicalsystem_key = a._anatomicalsystem_key "
            + " order by o.name";
    private final String SQL_TUMOR_ORGANS_METS =
            "select distinct o._organ_key, o.name, a.name "
            + "  from TumorFrequency tf, "
            + "       Organ o, AnatomicalSystem a "
            + " where tf._OrganAffected_key = o._Organ_key "
            + " and o._anatomicalsystem_key = a._anatomicalsystem_key "
            + "   and tf._TumorFrequency_key in (select distinct _Child_key "
            + "   from TumorProgression "
            + "   where _TumorProgressionType_key = 1) "
            + " order by o.name ";
    private final String SQL_TUMOR_DETAIL =
            "select tf._TumorFrequency_key, "
            + "      coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), -1) _Parent_key, "
            + "      tc.name tumorClassName, "
            + "      ot.name tumorOrganName, "
            + "      ot.name || ' ' || tc.name  tumorName, "
            + "      s._Strain_key, "
            + "      s.name strainName, "
            + "      s.description strainNote, "
            + "      sx.sex, "
            + "      tf.note tumorFreqNote, "
            + "      tf.breedingStatus, "
            + "      tf.infectionStatus, "
            + "      tf.incidence, "
            + "      tf.numMiceAffected, "
            + "      tf.colonySize, "
            + "      tf.ageOnset, "
            + "      tf.ageDetection, "
            + "      oa.name organAffected, "
            + "      aty.name treatmentType, "
            + "      a._Agent_key, "
            + "      a.name agentName, "
            + "      acc.accId, "
            + "      (select accId from Accession where _Object_key = tf._TumorFRequency_key and _MTBTypes_key = 5 and _SiteInfo_key = 0) tfAccId "
            + " from TumorFrequency tf left join "
            + "     (TumorFrequencyTreatments tft join Agent a on ( tft._Agent_key = a._Agent_key ) "
            + "       join AgentType aty on ( a._AgentType_key = aty._AgentType_key )) "
            + "      on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), "
            + "      TumorType tt, "
            + "      TumorClassification tc, "
            + "      Accession acc, "
            + "      Strain s, "
            + "      Sex sx, "
            + "      Organ oa, "
            + "      Organ ot "
            + "where tf._TumorType_key = tt._TumorType_key "
            + "  and tt._TumorClassification_key = tc._TumorClassification_key "
            + "  and tt._Organ_key = ot._Organ_key "
            + "  and tf._Strain_key = s._Strain_key "
            + "  and tf._Sex_key = sx._Sex_key "
            + "  and tf._OrganAffected_key = oa._Organ_key "
            + "  and tf._Reference_key = acc._Object_key "
            + "  and acc._MTBTypes_key = 6 "
            + "  and acc._SiteInfo_key = 1 "
            + "  and tf._TumorFrequency_key = ?";
    private final String SQL_TFGRID_TUMORCLASS_TEMP =
            " create temporary table temptcplasias as "
            + "select _TumorClassification_key "
            + "  from TumorClassification "
            + " where lower(name) not like '%dysplasia%' "
            + "   and lower(name) not like '%foci%' "
            + "   and lower(name) not like '%hyperplasia%' "
            + "   and lower(name) not like '%lesion%' "
            + "   and lower(name) not like '%metaplasia%' "
            + "   and lower(name) not like '%preneoplastic lesion%'";
    private final String SQL_TFGRID_STRAINS_TEMP =
            " create temporary table tempstrains as "
            + "select count(1) num, _Strain_key "
            + "  from StrainTypeAssoc"
            + " where _Strain_key in (select _Strain_key from StrainTypeAssoc where _StrainType_key in (8)) "
            + "   and _Strain_key in (select s._Strain_key "
            + " from StrainFamilyHeredityAssoc sfha, StrainFamily sf, StrainHeredity sh, Strain s "
            + " where s._StrainFamily_key = sf._StrainFamily_key "
            + "   and sfha._StrainFamily_key = sf._StrainFamily_key "
            + "   and sfha._StrainHeredity_key = sh._StrainHeredity_key)"
            + " group by _Strain_key having count(1) = 1";
    private final String SQL_TFGRID =
            "select sh._StrainHeredity_key, sh.name, sf._StrainFamily_key, sf.family, s._strain_key, s.name, o._Organ_key, o.name, a._AnatomicalSystem_key, a.name, tf._TumorFrequency_key, tf.freqNum, tf.incidence, o._OrganParent_key, o2.name oparent_name, tp._tumorprogression_key "
            + "  from TumorFrequency tf left join TumorProgression tp on (tf._tumorfrequency_key = tp._child_key), "
            + "       TumorType ty, "
            + "       Organ o, "
            + "       Organ o2, "
            + "       AnatomicalSystem a, "
            + "       Strain s, "
            + "       StrainFamilyHeredityAssoc sfha, "
            + "       StrainFamily sf, "
            + "       StrainHeredity sh, "
            +"        temptcplasias ttcp, "
            +"        tempstrains ts "
            + " where tf._Strain_key = s._Strain_key "
            + "   and sfha._StrainFamily_key = sf._StrainFamily_key "
            + "   and sfha._StrainHeredity_key = sh._StrainHeredity_key "
            + "   and s._StrainFamily_key = sf._StrainFamily_key "
            + "   and s._strain_key = ts._Strain_key "
            + "   and o._OrganParent_key = o2._Organ_key "
            + "   and o._AnatomicalSystem_key = a._AnatomicalSystem_key "
            + "   and lower(o.name) not like '%unspecified%' "
            + "   and lower(a.name) not like '%unspecified%' "
            + "   and tf._TumorType_key = ty._TumorType_key "
            + "   and ty._TumorClassification_key = ttcp._TumorClassification_key "
            + "   and ty._Organ_key = o._Organ_key "
            + "   and tf._TumorFrequency_key not in (select _TumorFrequency_key from TumorFrequencyTreatments) "
            + "   and tf.freqNum >= 0 ";  // TODO: CHECK ON THIS
    
    private final String SQL_TFGRID_ORGANS_TEMP =
            " create temporary table temp_organs as "
            + " select a._AnatomicalSystem_key, a.name a_name, o._Organ_key, o.name o_name, o._OrganParent_key "
            + "  from Organ o, AnatomicalSystem a "
            + " where o._AnatomicalSystem_key = a._AnatomicalSystem_key "
             + "   and lower(o.name) not like '%unspecified%' "
            + "   and lower(a.name) not like '%unspecified%' "
            + "   and o._Organ_key in (select distinct ty._Organ_key "
            + " from TumorFrequency tf, Strain s, TumorType ty, tempstrains ts, temptcplasias tp  "
            + " where tf._Strain_key = s._Strain_key "
            + "   and s._Strain_key = ts._Strain_key  " + // INBRED
            "   and tf._TumorType_key = ty._TumorType_key "
            + "   and s._StrainFamily_key is not null "
            + "   and ty._TumorClassification_key = tp._TumorClassification_key "
            + "   and tf.freqNum >= 0 "
            + "    and tf._TumorFrequency_key not in (select _TumorFrequency_key from TumorFrequencyTreatments))";
    
    private static final String SQL_TFGRID_ORGANS_TEMP2 =
            "create temporary table temp_organs2 as "
            + "select * from temp_organs ";
    private final String SQL_TFGRID_ORGANS =
            "select a._AnatomicalSystem_key as_key, a.name as aname, o._Organ_key o_key, o.name as organ, o._OrganParent_key parent "
            + "  from Organ o, AnatomicalSystem a, temp_organs2 tot "
            + " where o._AnatomicalSystem_key = a._AnatomicalSystem_key "
            + "   and lower(o.name) not like '%unspecified%' "
            + "   and lower(a.name) not like '%unspecified%' "
            + "   and o._Organ_key = tot._Organ_key  " + // can limit organs by name here
            " union "
            + "select a._AnatomicalSystem_key as_key, a.name as aname, o._Organ_key o_key, o.name as organ, o._OrganParent_key parent "
            + "  from Organ o, AnatomicalSystem a, temp_organs torg "
            + " where o._AnatomicalSystem_key = a._AnatomicalSystem_key "
            + "   and lower(o.name) not like '%unspecified%' "
            + "   and lower(a.name) not like '%unspecified%' "
            + "   and o._Organ_key = torg._OrganParent_key " + // and here
            " order by aname, organ";
    private final String SQL_TFGRID_STRAINS =
            "select sh._StrainHeredity_key, sh.name, sf._StrainFamily_key, sf.family, s._Strain_key, s.name strain_name "
            + "  from StrainFamilyHeredityAssoc sfha, StrainFamily sf, StrainHeredity sh, Strain s, tempstrains ts "
            + " where s._StrainFamily_key = sf._StrainFamily_key "
            + "   and s._Strain_key =ts._Strain_key " + // INBRED
            "   and sfha._StrainFamily_key = sf._StrainFamily_key "
            + "   and sfha._StrainHeredity_key = sh._StrainHeredity_key "
            + " order by sh._StrainHeredity_key, sfha.ordering, s.name";  // ----------------------------------------------------- Instance Variables
    private static MTBTumorUtilDAO singleton = new MTBTumorUtilDAO();
    private static final Logger log =
            Logger.getLogger(MTBTumorUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors
    /**
     * Creates a new instance of MTBTumorUtilDAO.  Insures <b>Singleton</b>
     * pattern.
     */
    private MTBTumorUtilDAO() {
        super();
    }
    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBTumorUtilDAO singleton.
     *
     * @return MTBTumorUtilDAO
     */
    public static MTBTumorUtilDAO getInstance() {
        return singleton;
    }

    /**
     * Generate the Tumor Frequency Grid.  This is a complex data structure:
     * <p>
     * <pre>
     *                       +---------+
     *                       | mapData |
     *                       +---------+
     *                            |
     *                    +----------------+
     *                    | StrainHeredity | - key, name
     *                    +----------------+
     *                            |
     *                     +--------------+
     *                     | StrainFamily | - key, name
     *                     +--------------+
     *                            |
     *             +--------------+----------------+
     *             |                               |
     *      +--------------+                +-------------+
     *      | StrainFamily | - key, name    | OrganParent | - key, name
     *      +--------------+                +-------------+
     *             |                               |
     *      +-------------+                    +-------+
     *      | OrganParent | - key, name        | Organ | - key, name
     *      +-------------+                    +-------+
     *             |                               |
     *         +-------+                   +----------------+
     *         | Organ | - key, name       | TumorFrequency | - key, frequency,
     *         +-------+                   +----------------+      incidence
     *             |
     *     +----------------+
     *     | TumorFrequency |- key, frequency,
     *     +----------------+   incidence
     *
     * </pre>
     *
     * @return the grid
     */
    public Map<String, MTBTFGridStrainHeredityDTO> getTFGrid() {
        Map<String, MTBTFGridStrainHeredityDTO> mapData =
                new HashMap<String, MTBTFGridStrainHeredityDTO>();
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Timer timerDAO = new Timer();
        Timer timerTempDAO = new Timer();
        timerDAO.start();

        try {
            // get a connection
            conn = getConnection();

            // create the batch statements
            stmt = conn.createStatement();
            stmt.addBatch(SQL_TFGRID_TUMORCLASS_TEMP);
            stmt.addBatch(SQL_TFGRID_STRAINS_TEMP);

            if (log.isDebugEnabled()) {
                log.debug(SQL_TFGRID_TUMORCLASS_TEMP);
                log.debug(SQL_TFGRID_STRAINS_TEMP);
            }

            // execute the batch
            timerTempDAO.start();
            stmt.executeBatch();
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Batch took: " + timerTempDAO.toString());
            }

            // create and execute the main tumor frequency grid query
            pstmt = conn.prepareStatement(SQL_TFGRID);

            timerTempDAO.restart();
            rs = pstmt.executeQuery();
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Getting ResultSet took: " + timerTempDAO.toString());
            }

            timerTempDAO.restart();

            // loop through the results
            while (rs.next()) {
                ///////////////////////////////////////////////////////////////
                // Checking heredity data
                ///////////////////////////////////////////////////////////////
                int nHeredityKey = rs.getInt(1);
                MTBTFGridStrainHeredityDTO dtoHeredity = null;

                if (mapData.containsKey(nHeredityKey + "")) {
                    dtoHeredity = mapData.get(nHeredityKey + "");
                } else {
                    dtoHeredity = new MTBTFGridStrainHeredityDTO();
                    dtoHeredity.setStrainHeredityKey(nHeredityKey);
                    dtoHeredity.setStrainHeredityName(rs.getString(2));
                }

                ///////////////////////////////////////////////////////////////
                // Checking family data
                ///////////////////////////////////////////////////////////////
                int nFamilyKey = rs.getInt(3);
                Map<String, MTBTFGridStrainFamilyDTO> mapStrainFamilies =
                        dtoHeredity.getStrainFamilies();

                if (mapStrainFamilies == null) {
                    mapStrainFamilies =
                            new HashMap<String, MTBTFGridStrainFamilyDTO>();
                }

                MTBTFGridStrainFamilyDTO dtoFamily = null;

                if (mapStrainFamilies.containsKey(nFamilyKey + "")) {
                    dtoFamily = mapStrainFamilies.get(nFamilyKey + "");
                } else {
                    dtoFamily = new MTBTFGridStrainFamilyDTO();
                    dtoFamily.setStrainFamilyKey(nFamilyKey);
                    dtoFamily.setStrainFamilyName(rs.getString(4));
                }

                ///////////////////////////////////////////////////////////////
                // Checking parent organ data for strain family
                ///////////////////////////////////////////////////////////////
                int nParentOrganKeyForFamily = rs.getInt(14);
                Map<String, MTBTFGridOrganParentDTO> mapParentOrgansForFamily = dtoFamily.getOrgans();

                if (mapParentOrgansForFamily == null) {
                    mapParentOrgansForFamily =
                            new HashMap<String, MTBTFGridOrganParentDTO>();
                }

                MTBTFGridOrganParentDTO dtoOrganP_Family = null;

                if (mapParentOrgansForFamily.containsKey(nParentOrganKeyForFamily + "")) {
                    dtoOrganP_Family =
                            mapParentOrgansForFamily.get(nParentOrganKeyForFamily + "");
                } else {
                    dtoOrganP_Family = new MTBTFGridOrganParentDTO();
                    dtoOrganP_Family.setOrganKey(nParentOrganKeyForFamily);
                    dtoOrganP_Family.setOrganName(rs.getString(15));
                    dtoOrganP_Family.setAnatomicalSystemKey(rs.getInt(9));
                    dtoOrganP_Family.setAnatomicalSystemName(rs.getString(10));
                }

                ///////////////////////////////////////////////////////////////
                // Checking strain data
                ///////////////////////////////////////////////////////////////
                int nStrainKey = rs.getInt(5);
                Map<String, MTBTFGridStrainDTO> mapStrains = dtoFamily.getStrains();

                if (mapStrains == null) {
                    mapStrains = new HashMap<String, MTBTFGridStrainDTO>();
                }

                MTBTFGridStrainDTO dtoStrain = null;

                if (mapStrains.containsKey(nStrainKey + "")) {
                    dtoStrain = mapStrains.get(nStrainKey + "");
                } else {
                    dtoStrain = new MTBTFGridStrainDTO();
                    dtoStrain.setStrainKey(nStrainKey);
                    dtoStrain.setStrainName(rs.getString(6));
                }

                ///////////////////////////////////////////////////////////////
                // Checking parent organ data
                ///////////////////////////////////////////////////////////////
                int nParentOrganKeyForStrain = rs.getInt(14);
                Map<String, MTBTFGridOrganParentDTO> mapParentOrgansForStrain = dtoStrain.getOrgans();

                if (mapParentOrgansForStrain == null) {
                    mapParentOrgansForStrain =
                            new HashMap<String, MTBTFGridOrganParentDTO>();
                }

                MTBTFGridOrganParentDTO dtoOrganParentForStrain = null;

                if (mapParentOrgansForStrain.containsKey(nParentOrganKeyForStrain + "")) {
                    dtoOrganParentForStrain =
                            mapParentOrgansForStrain.get(nParentOrganKeyForStrain + "");
                } else {
                    dtoOrganParentForStrain = new MTBTFGridOrganParentDTO();
                    dtoOrganParentForStrain.setOrganKey(nParentOrganKeyForStrain);
                    dtoOrganParentForStrain.setOrganName(rs.getString(15));
                    dtoOrganParentForStrain.setAnatomicalSystemKey(rs.getInt(9));
                    dtoOrganParentForStrain.setAnatomicalSystemName(rs.getString(10));
                }

                ///////////////////////////////////////////////////////////////
                // Checking organ data
                ///////////////////////////////////////////////////////////////
                int nOrganKey = rs.getInt(7);
                Map<String, MTBTFGridOrganDTO> mapOrgansForStrain =
                        dtoOrganParentForStrain.getOrgans();
                Map<String, MTBTFGridOrganDTO> mapOrgansForFamily =
                        dtoOrganP_Family.getOrgans();

                if (mapOrgansForStrain == null) {
                    mapOrgansForStrain = new HashMap<String, MTBTFGridOrganDTO>();
                }

                if (mapOrgansForFamily == null) {
                    mapOrgansForFamily = new HashMap<String, MTBTFGridOrganDTO>();
                }

                // for the strain
                MTBTFGridOrganDTO dtoOrganForStrain = null;

                if (mapOrgansForStrain.containsKey(nOrganKey + "")) {
                    dtoOrganForStrain = mapOrgansForStrain.get(nOrganKey + "");
                } else {
                    dtoOrganForStrain = new MTBTFGridOrganDTO();
                    dtoOrganForStrain.setOrganKey(nOrganKey);
                    dtoOrganForStrain.setOrganName(rs.getString(8));
                    dtoOrganForStrain.setAnatomicalSystemKey(rs.getInt(9));
                    dtoOrganForStrain.setAnatomicalSystemName(rs.getString(10));
                }

                // for the family
                MTBTFGridOrganDTO dtoOrganForFamily = null;

                if (mapOrgansForFamily.containsKey(nOrganKey + "")) {
                    dtoOrganForFamily = mapOrgansForFamily.get(nOrganKey + "");
                } else {
                    dtoOrganForFamily = new MTBTFGridOrganDTO();
                    dtoOrganForFamily.setOrganKey(nOrganKey);
                    dtoOrganForFamily.setOrganName(rs.getString(8));
                    dtoOrganForFamily.setAnatomicalSystemKey(rs.getInt(9));
                    dtoOrganForFamily.setAnatomicalSystemName(rs.getString(10));
                }

                ///////////////////////////////////////////////////////////////
                // Checking frequency data
                ///////////////////////////////////////////////////////////////
                int nTFKey = rs.getInt(11);
                Map<String, MTBTFGridTumorFrequencyDTO> mapTFRecordsStrain = dtoOrganForStrain.getTFRecords();
                Map<String, MTBTFGridTumorFrequencyDTO> mapTFRecordsFamily = dtoOrganForFamily.getTFRecords();

                if (mapTFRecordsStrain == null) {
                    mapTFRecordsStrain = new HashMap<String, MTBTFGridTumorFrequencyDTO>();
                }

                if (mapTFRecordsFamily == null) {
                    mapTFRecordsFamily = new HashMap<String, MTBTFGridTumorFrequencyDTO>();
                }

                MTBTFGridTumorFrequencyDTO dtoTF = null;
                dtoTF = new MTBTFGridTumorFrequencyDTO();
                dtoTF.setTumorFrequency(nTFKey);
                long mets = rs.getLong(16);
                if (mets != 0) {
                    // don't use metastisied tumors for frequency
                    dtoTF.setFrequency(0.00001d);
                    dtoTF.setIncidence(" ");
                } else {
                    dtoTF.setFrequency(rs.getDouble(12));
                    dtoTF.setIncidence(rs.getString(13));
                }
                // set it all
                mapTFRecordsStrain.put(nTFKey + "", dtoTF);
                mapTFRecordsFamily.put(nTFKey + "", dtoTF);

                dtoOrganForStrain.setTFRecords(mapTFRecordsStrain);
                dtoOrganForFamily.setTFRecords(mapTFRecordsFamily);

                mapOrgansForStrain.put(nOrganKey + "", dtoOrganForStrain);
                mapOrgansForFamily.put(nOrganKey + "", dtoOrganForFamily);

                dtoOrganParentForStrain.setOrgans(mapOrgansForStrain);
                dtoOrganP_Family.setOrgans(mapOrgansForFamily);
                mapParentOrgansForStrain.put(nParentOrganKeyForFamily + "", dtoOrganParentForStrain);
                mapParentOrgansForFamily.put(nParentOrganKeyForFamily + "", dtoOrganP_Family);

                dtoStrain.setOrgans(mapParentOrgansForStrain);
                mapStrains.put(nStrainKey + "", dtoStrain);

                dtoFamily.setStrains(mapStrains);
                dtoFamily.addOrgans(mapParentOrgansForFamily);

                mapStrainFamilies.put(nFamilyKey + "", dtoFamily);
                dtoHeredity.setStrainFamilies(mapStrainFamilies);

                mapData.put(nHeredityKey + "", dtoHeredity);
            }

            timerTempDAO.stop();
            if (log.isInfoEnabled()) {
                log.info("Looping through ResultSet took: " + timerTempDAO.toString());
            }
        } catch (SQLException sqle) {
            log.error("Error generating Tumor Frequency Grid.", sqle);
        } finally {
            close(stmt);
            close(pstmt, rs);
            freeConnection(conn);
        }

        timerDAO.stop();

        if (log.isInfoEnabled()) {
            log.info("Generating Tumor Frequency Grid took: " + timerDAO.toString());
        }

        return mapData;
    }

    /**
     * For backwards compatablilty
     **/
    public List<MTBTFGridAnatomicalSystemHeaderRowDTO> getTFGridOrgans() {
        return getTFGridOrgans(null);
    }

    public List<MTBTFGridAnatomicalSystemHeaderRowDTO> getTFGridOrgans(String organGrpKeys) {
        return getTFGridOrgans(organGrpKeys, null);
    }

    /**
     * Get a List of the Organs that are in the Tumor Frequency Grid.
     *
     * @return a <code>List</code> of Organ data
     */
    public List<MTBTFGridAnatomicalSystemHeaderRowDTO> getTFGridOrgans(String organGrpKeys, String organKeys) {
        List<MTBTFGridAnatomicalSystemHeaderRowDTO> ret = new ArrayList<MTBTFGridAnatomicalSystemHeaderRowDTO>();
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Timer timerDAO = new Timer();
        Timer timerTempDAO = new Timer();
        timerDAO.start();

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            stmt.addBatch(SQL_TFGRID_TUMORCLASS_TEMP);

            stmt.addBatch(SQL_TFGRID_STRAINS_TEMP);

            stmt.addBatch(SQL_TFGRID_ORGANS_TEMP);

            stmt.addBatch(SQL_TFGRID_ORGANS_TEMP2);

            log.debug(SQL_TFGRID_TUMORCLASS_TEMP);
            log.debug(SQL_TFGRID_STRAINS_TEMP);
            log.debug(SQL_TFGRID_ORGANS_TEMP);
            log.debug(SQL_TFGRID_ORGANS_TEMP2);


            timerTempDAO.start();
            stmt.executeBatch();
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Batch took: " + timerTempDAO.toString());
            }
            String sqlOrgans = SQL_TFGRID_ORGANS;

            if (organGrpKeys != null) {
                sqlOrgans = sqlOrgans.replaceAll("where", "where o._organparent_key in (" + organGrpKeys + " ) and ");
                log.debug(sqlOrgans);
            }

            if (organKeys != null) {
                sqlOrgans = sqlOrgans.replaceAll("where", "where o._organ_key in (" + organKeys + " ) and ");
                log.debug(sqlOrgans);
            }

            pstmt = conn.prepareStatement(sqlOrgans);
            timerTempDAO.restart();
            rs = pstmt.executeQuery();
            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Getting ResultSet took: " + timerTempDAO.toString());
            }

            MTBTFGridAnatomicalSystemHeaderRowDTO dto = null;
            long lAnatomicalSystemKey = -1l;
            long lTempAnatomicalSystemKey = -2l;
            long lOrganParentKey = -3l;
            long lTempOrganParentKey = -4l;

            timerTempDAO.restart();

            while (rs.next()) {
                lTempAnatomicalSystemKey = rs.getLong(1);
                lTempOrganParentKey = rs.getLong(5);

                if (lTempAnatomicalSystemKey == lAnatomicalSystemKey) {
                    if (lTempOrganParentKey == lOrganParentKey) {
                        lOrganParentKey = rs.getLong(5);

                        // same parent and same anatomical system
                        dto = ret.get(ret.size() - 1);
                        List<MTBTFGridOrganParentHeaderRowDTO> listParentOrgans = dto.getOrgans();
                        MTBTFGridOrganParentHeaderRowDTO dtoParent =
                                (MTBTFGridOrganParentHeaderRowDTO) listParentOrgans.get(listParentOrgans.size() - 1);

                        MTBTFGridOrganHeaderRowDTO dtoOrgan = new MTBTFGridOrganHeaderRowDTO();
                        dtoOrgan.setOrganKey(rs.getLong(3));
                        dtoOrgan.setOrganName(rs.getString(4));

                        dtoParent.addOrgan(dtoOrgan);

                        listParentOrgans.set(listParentOrgans.size() - 1, dtoParent);

                        dto.setOrgans(listParentOrgans);

                        ret.set(ret.size() - 1, dto);

                        lOrganParentKey = lTempOrganParentKey;
                    } else {
                        lOrganParentKey = rs.getLong(5);

                        // different parent and same anatomical system
                        dto = ret.get(ret.size() - 1);

                        MTBTFGridOrganParentHeaderRowDTO dtoParent = new MTBTFGridOrganParentHeaderRowDTO();
                        dtoParent.setOrganKey(rs.getLong(3));
                        dtoParent.setOrganName(rs.getString(4));

                        MTBTFGridOrganHeaderRowDTO dtoOrgan = new MTBTFGridOrganHeaderRowDTO();
                        dtoOrgan.setOrganKey(rs.getLong(3));
                        dtoOrgan.setOrganName(rs.getString(4));

                        dtoParent.addOrgan(dtoOrgan);
                        dto.addOrgan(dtoParent);

                        ret.set(ret.size() - 1, dto);

                        lOrganParentKey = lTempOrganParentKey;
                    }
                } else {
                    // new anatomical system
                    lAnatomicalSystemKey = lTempAnatomicalSystemKey;

                    dto = new MTBTFGridAnatomicalSystemHeaderRowDTO();
                    dto.setAnatomicalSystemKey(rs.getLong(1));
                    dto.setAnatomicalSystemName(rs.getString(2));

                    MTBTFGridOrganParentHeaderRowDTO dtoParent = new MTBTFGridOrganParentHeaderRowDTO();
                    dtoParent.setOrganKey(rs.getLong(3));
                    dtoParent.setOrganName(rs.getString(4));

                    MTBTFGridOrganHeaderRowDTO dtoOrgan = new MTBTFGridOrganHeaderRowDTO();
                    dtoOrgan.setOrganKey(rs.getLong(3));
                    dtoOrgan.setOrganName(rs.getString(4));

                    dtoParent.addOrgan(dtoOrgan);
                    dto.addOrgan(dtoParent);

                    ret.add(dto);

                    lOrganParentKey = dtoParent.getOrganKey();
                }
            }

            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Looping through ResultSet took: " + timerTempDAO.toString());
            }
        } catch (SQLException sqle) {
            log.error("Error getting Organs for Tumor Frequency Grid", sqle);
        } finally {
            close(stmt);
            close(pstmt, rs);
            freeConnection(conn);
        }

        timerDAO.stop();

        if (log.isInfoEnabled()) {
            log.info("Retrieving Organs for Tumor Frequency Grid took: " + timerDAO.toString());
        }

        return ret;
    }

    /**
     * for backwards compatibility
     */
    public List<MTBTFGridStrainHeredityRowDTO> getTFGridStrains() {
        return getTFGridStrains(null);
    }

    public List<MTBTFGridStrainHeredityRowDTO> getTFGridStrains(String strainFamilyKeys) {
        return getTFGridStrains(strainFamilyKeys, null);
    }

    /**
     * Get a List of the Organs that are in the Tumor Frequency Grid.
     *
     * @return a <code>List</code> of Organ data
     */
    public List<MTBTFGridStrainHeredityRowDTO> getTFGridStrains(String strainFamilyKeys, String strainKeys) {
        List<MTBTFGridStrainHeredityRowDTO> ret = new ArrayList<MTBTFGridStrainHeredityRowDTO>();
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Timer timerDAO = new Timer();
        Timer timerTempDAO = new Timer();
        timerDAO.start();

        try {
            conn = getConnection();

            stmt = conn.createStatement();
            stmt.addBatch(SQL_TFGRID_STRAINS_TEMP);

            if (log.isDebugEnabled()) {
                log.debug(SQL_TFGRID_STRAINS_TEMP);
            }

            timerTempDAO.start();
            stmt.executeBatch();
            timerTempDAO.start();

            if (log.isInfoEnabled()) {
                log.info("Batch took: " + timerTempDAO.toString());
            }
            String sqlStrains = SQL_TFGRID_STRAINS;

            if ((strainFamilyKeys != null) && (strainKeys != null)) {
                sqlStrains = sqlStrains.replace("where", "where (s._strainfamily_key in (" + strainFamilyKeys + ") or s._strain_key in (" + strainKeys + ") ) and ");

            } else {
                if (strainFamilyKeys != null) {
                    sqlStrains = sqlStrains.replace("where", "where s._strainfamily_key in (" + strainFamilyKeys + ") and ");

                }

                if (strainKeys != null) {
                    sqlStrains = sqlStrains.replace("where", "where s._strain_key in (" + strainKeys + ") and ");

                }
            }

            log.debug(sqlStrains);
            pstmt = conn.prepareStatement(sqlStrains);

            timerTempDAO.restart();
            rs = pstmt.executeQuery();
            timerTempDAO.start();

            if (log.isInfoEnabled()) {
                log.info("Getting ResultSet took: " + timerTempDAO.toString());
            }

            MTBTFGridStrainHeredityRowDTO dto = null;
            long lStrainHeredityKey = -1l;
            long lTempStrainHeredityKey = -2l;
            long lStrainFamilyKey = -3l;
            long lTempStrainFamilyKey = -4l;

            timerTempDAO.restart();

            while (rs.next()) {
                lTempStrainHeredityKey = rs.getLong(1);
                lTempStrainFamilyKey = rs.getLong(3);

                if (lTempStrainHeredityKey == lStrainHeredityKey) {
                    if (lTempStrainFamilyKey == lStrainFamilyKey) {
                        lStrainFamilyKey = rs.getLong(3);

                        // same parent and same anatomical system
                        dto = ret.get(ret.size() - 1);
                        List<MTBTFGridStrainFamilyRowDTO> listFamilies = dto.getFamilies();
                        MTBTFGridStrainFamilyRowDTO dtoFamily = (MTBTFGridStrainFamilyRowDTO) listFamilies.get(listFamilies.size() - 1);

                        MTBTFGridStrainRowDTO dtoStrain = new MTBTFGridStrainRowDTO();
                        dtoStrain.setStrainKey(rs.getLong(5));
                        dtoStrain.setStrainName(rs.getString(6));

                        dtoFamily.addStrain(dtoStrain);

                        listFamilies.set(listFamilies.size() - 1, dtoFamily);

                        dto.setFamilies(listFamilies);

                        ret.set(ret.size() - 1, dto);

                        lStrainFamilyKey = lTempStrainFamilyKey;
                    } else {
                        lStrainFamilyKey = rs.getLong(3);

                        // different parent and same anatomical system
                        dto = ret.get(ret.size() - 1);

                        MTBTFGridStrainFamilyRowDTO dtoFamily = new MTBTFGridStrainFamilyRowDTO();
                        dtoFamily.setStrainFamilyKey(rs.getLong(3));
                        dtoFamily.setStrainFamilyName(rs.getString(4));

                        MTBTFGridStrainRowDTO dtoStrain = new MTBTFGridStrainRowDTO();
                        dtoStrain.setStrainKey(rs.getLong(5));
                        dtoStrain.setStrainName(rs.getString(6));

                        dtoFamily.addStrain(dtoStrain);
                        dto.addFamily(dtoFamily);

                        ret.set(ret.size() - 1, dto);

                        lStrainFamilyKey = lTempStrainFamilyKey;
                    }
                } else {
                    // new anatomical system
                    lStrainHeredityKey = lTempStrainHeredityKey;

                    dto = new MTBTFGridStrainHeredityRowDTO();
                    dto.setStrainHeredityKey(rs.getLong(1));
                    dto.setStrainHeredityName(rs.getString(2));

                    MTBTFGridStrainFamilyRowDTO dtoFamily = new MTBTFGridStrainFamilyRowDTO();
                    dtoFamily.setStrainFamilyKey(rs.getLong(3));
                    dtoFamily.setStrainFamilyName(rs.getString(4));

                    MTBTFGridStrainRowDTO dtoStrain = new MTBTFGridStrainRowDTO();
                    dtoStrain.setStrainKey(rs.getLong(5));
                    dtoStrain.setStrainName(rs.getString(6));

                    dtoFamily.addStrain(dtoStrain);
                    dto.addFamily(dtoFamily);

                    ret.add(dto);

                    lStrainFamilyKey = dtoFamily.getStrainFamilyKey();
                }
            }


            timerTempDAO.stop();

            if (log.isInfoEnabled()) {
                log.info("Looping through ResultSet took: " + timerTempDAO.toString());
            }
        } catch (SQLException sqle) {
            log.error("Error getting Strains for Tumor Frequency Grid", sqle);
        } finally {
            close(stmt);
            close(pstmt, rs);
            freeConnection(conn);
        }

        timerDAO.stop();

        if (log.isInfoEnabled()) {
            log.info("Retrieving Strains for Tumor Frequency Grid took: " + timerDAO.toString());
        }

        return ret;
    }

    public List<MTBTFDetailMetsDTO> getAssociatedFrequencyInfoWS(long key) {
        List<MTBTFDetailMetsDTO> ret = new ArrayList<MTBTFDetailMetsDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSOCIATED_FREQ);
            pstmt.setLong(1, key);
            pstmt.setLong(2, key);
            pstmt.setLong(3, key);
            pstmt.setLong(4, key);
            pstmt.setLong(5, key);
            pstmt.setLong(6, key);
            rs = pstmt.executeQuery();

            MTBTFDetailMetsDTO bean = null;

            while (rs.next()) {
                bean = new MTBTFDetailMetsDTO();
                bean.setTumorFrequencyKey(rs.getLong(1));
                bean.setMtbId(rs.getString(2));
                bean.setOrgan(rs.getString(3));
                bean.setOrganKey(rs.getLong(4));
                bean.setChildRec(rs.getInt(5) == 1);

                ret.add(bean);
            }
        } catch (SQLException sqle) {
            log.error("Errorgetting associated frequency info for key " + key, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        return ret;
    }

    public List<LabelValueDataBean<Long, String, Long>> getAssociatedFrequencyInfo(long key) {
        List<LabelValueDataBean<Long, String, Long>> ret =
                new ArrayList<LabelValueDataBean<Long, String, Long>>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_ASSOCIATED_FREQ);
            pstmt.setLong(1, key);
            pstmt.setLong(2, key);
            pstmt.setLong(3, key);
            pstmt.setLong(4, key);
            pstmt.setLong(5, key);
            pstmt.setLong(6, key);
            rs = pstmt.executeQuery();

            LabelValueDataBean<Long, String, Long> bean = null;

            while (rs.next()) {
                bean = new LabelValueDataBean<Long, String, Long>();
                bean.setLabel(rs.getLong(2));
                bean.setValue(rs.getString(3));
                //           bean.setData(new Long(rs.getInt(3)));

                ret.add(bean);
            }
        } catch (SQLException sqle) {
            log.error("Error getting associated frequency info for key " + key, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        return ret;
    }

    public List<LabelValueBean<String, Long>> getOrgansOfOriginWithTFRecord() {
        return getOrgans(SQL_TUMOR_ORIGIN_WITH);
    }

    public List<LabelValueBean<String, Long>> getOrgansThatMetastasize() {
        return getOrgans(SQL_TUMOR_ORGANS_METS);
    }

    /**
     * For unspecified organs put the anatomical system first
     * sql needs to select organ key, organ name, anatomical name in that order
     * sorts organs using updated name which may include anatomical system
     */
    private List<LabelValueBean<String, Long>> getOrgans(String sql) {

        List<LabelValueBean<String, Long>> listOrgans = new ArrayList<LabelValueBean<String, Long>>();

        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            String name = "";
            while (rs.next()) {
                name = rs.getString(2);
                if (name.equals("(Unspecified organ)")) {
                    name = rs.getString(3) + " - " + rs.getString(2);
                }
                LabelValueBean<String, Long> bean = new LabelValueBean<String, Long>(name,
                        rs.getLong(1));
                listOrgans.add(bean);
            }

            Collections.sort(listOrgans, new LabelValueBeanComparator(LabelValueBeanComparator.TYPE_LABEL));

        } catch (SQLException sqle) {
            log.error("Error getting organs affected with images.", sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return listOrgans;
    }

    /**
     * Returns MTBTumorFrequencySummaryDTOs with the same
     * strain, tumorclassification and treatments as the given record
     * the first SummaryDTO in the collection is for the given record 
     * @param tumorFrequencyKey the key of the TF to use as search criteria
     * @return MTBTumorSummaryDTO a wrapper class for a group of similar TF records
     */
    public MTBTumorSummaryDTO getTumorSumaryByExample(String tumorFrequencyKey) {

        MTBTumorSummaryDTO tumor = new MTBTumorSummaryDTO();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            long tfKey = Long.parseLong(tumorFrequencyKey);
            ArrayList<String> tfKeyList = new ArrayList<String>();

            TumorFrequencyDTO tfDTO = TumorFrequencyDAO.getInstance().loadByPrimaryKey(tfKey);
            long strain = tfDTO.getStrainKey().longValue();
            TumorTypeDTO ttDTO = TumorTypeDAO.getInstance().loadByPrimaryKey(tfDTO.getTumorTypeKey());

            String sql =
                    "select distinct tf._tumorfrequency_key "
                    + "from TumorFrequency tf, TumorFrequency tf2, TumorFrequencyTreatments tft, TumorFrequencyTreatments tft2 "
                    + "where tf._strain_key = tf2._strain_key "
                    + "and tf._tumortype_key = tf2._tumortype_key "
                    + "and tf._tumorfrequency_key = tft._tumorfrequency_key "
                    + "and tft._agent_key = tft2._agent_key "
                    + "and tft2._tumorfrequency_key = tf2._tumorfrequency_key "
                    + "and tf2._tumorfrequency_key = " + tfKey;

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                tfKeyList.add(rs.getString(1));
            }

            // above query will have no results if there are no treatments
            // so use a different query
            if (tfKeyList.size() == 0) {
                sql = " select tab.tfKey from (select distinct tf._tumorfrequency_key tfKey, tft._tumorfrequency_key tftKey "
                        + " from TumorFrequency tf left join TumorFrequencyTreatments tft "
                        + " on (tf._tumorfrequency_key = tft._tumorfrequency_key), "
                        + " TumorFrequency tf2 "
                        + " where tf._strain_key = tf2._strain_key "
                        + " and tf._tumortype_key = tf2._tumortype_key "
                        + " and tf2._tumorfrequency_key = " + tfKey + ") tab "
                        + " where tab.tftKey is null";

                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    tfKeyList.add(rs.getString(1));
                }

            }

            long[] tfKeys = new long[tfKeyList.size()];
            for (int i = 0; i < tfKeyList.size(); i++) {
                tfKeys[i] = Long.parseLong(tfKeyList.get(i));
            }

            tumor = getTumorSummary(strain, ttDTO.getOrganKey().longValue(), tfKeys);

            // put the example dto at the start of the collection so it can be
            // displayed seperately
            ArrayList<MTBTumorFrequencySummaryDTO> recs = (ArrayList<MTBTumorFrequencySummaryDTO>) tumor.getFrequencyRecs();
            ArrayList<MTBTumorFrequencySummaryDTO> recs2 = new ArrayList<MTBTumorFrequencySummaryDTO>();
            loop:
            for (MTBTumorFrequencySummaryDTO tfsDTO : recs) {

                if (tfsDTO.getTumorFrequencyKey() == tfKey) {
                    recs2.add(tfsDTO);
                    break loop;
                }
            }
            recs.remove(recs2.get(0));
            recs2.addAll(recs);
            tumor.setFrequencyRecs(recs2);


        } catch (SQLException sqle) {
            log.error(sqle);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return tumor;
    }

    public MTBTumorSummaryDTO getTumorSumary(long[] tumorFrequencyKeys) {

        MTBTumorSummaryDTO tumor = new MTBTumorSummaryDTO();
        try {
            TumorFrequencyDTO tfDTO = TumorFrequencyDAO.getInstance().loadByPrimaryKey(tumorFrequencyKeys[0]);
            long strain = tfDTO.getStrainKey().longValue();
            TumorTypeDTO ttDTO = TumorTypeDAO.getInstance().loadByPrimaryKey(tfDTO.getTumorTypeKey());

            tumor = getTumorSummary(strain, ttDTO.getOrganKey().longValue(), tumorFrequencyKeys);

        } catch (SQLException sqle) {
            log.error(sqle);
        }

        return tumor;
    }

    public MTBTumorSummaryDTO getTumorSummary(long strainKey,
            long organOriginKey,
            long[] tumorFrequencyKeys) {
        // the tumor summary object to return
        MTBTumorSummaryDTO tumor = new MTBTumorSummaryDTO();

        try {
            // get the associated strain information
            // create a Strain DAO
            StrainDAO strainDAO = StrainDAO.getInstance();
            StrainDTO strainDTO = strainDAO.loadByPrimaryKey(new Long(strainKey));
            tumor.setStrainKey(strainDTO.getStrainKey().longValue());
            tumor.setStrainName(strainDTO.getName());
            tumor.setStrainNote(strainDTO.getDescription());

            // get the associated strain types
            List<StrainTypeDTO> listStrainTypes = strainDAO.loadStrainTypeViaStrainTypeAssoc(strainDTO);
            tumor.setStrainTypes(new ArrayList<StrainTypeDTO>(listStrainTypes));

            // get the associated strain synonyms
            // create a StrainSynonym DAO
            StrainSynonymsDAO strainSynonymsDAO = StrainSynonymsDAO.getInstance();
            List<StrainSynonymsDTO> listStrainSynonyms = strainSynonymsDAO.loadByStrainKey(strainDTO.getStrainKey());
            listStrainSynonyms = consolodateStrainSynonyms(listStrainSynonyms);
            tumor.setStrainSynonyms(new ArrayList<StrainSynonymsDTO>(listStrainSynonyms));
            //debug("Getting strain synonyms took: " + t2.toString());

            // get the tumor frequency recs
            // we do this by creating a temp table ( temp_recs) and filtering the results
            Connection conn = getConnection();

            Statement stmtSelect = conn.createStatement();


            StringBuffer sbSelect = new StringBuffer();

            sbSelect.append("select distinct tf._TumorFrequency_key, ").append(EOL);
            sbSelect.append("       coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), tf._TumorFrequency_key) _Parent_key, ").append(EOL);
            sbSelect.append("      (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1)as sort_order, ").append(EOL);
            sbSelect.append("      case when (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1) is null then 0 else 1 end metastasis, ").append(EOL);
            sbSelect.append("      tc.name tumorClassName, ").append(EOL);
            sbSelect.append("      ot.name tumorOrganName, ").append(EOL);
            sbSelect.append("      ot.name || ' ' || tc.name tumorName, ").append(EOL);
            sbSelect.append("      s._Strain_key, ").append(EOL);
            sbSelect.append("      s.name strainName, ").append(EOL);
            sbSelect.append("      sx.sex, ").append(EOL);
            sbSelect.append("      tf.note tumorFreqNote, ").append(EOL);
            sbSelect.append("      tf.breedingStatus, ").append(EOL);
            sbSelect.append("      tf.infectionStatus, ").append(EOL);
            sbSelect.append("      tf.incidence, ").append(EOL);
            sbSelect.append("      tf.numMiceAffected, ").append(EOL);
            sbSelect.append("      tf.colonySize, ").append(EOL);
            sbSelect.append("      tf.ageOnset, ").append(EOL);
            sbSelect.append("      tf.ageDetection, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorFrequencyNotes n where n._TumorFrequency_key = tf._TumorFrequency_key) numNotes, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorPathologyAssoc a where a._TumorFrequency_key = tf._TumorFrequency_key) pathEntries, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i ").append(EOL);
            sbSelect.append("           where a._Pathology_key = pi._Pathology_key and a._TumorFrequency_key = tf._TumorFrequency_key ").append(EOL);
            sbSelect.append("           and pi._images_key = i._images_key and i. privateFlag = 0 ) numImages, ").append(EOL);
            sbSelect.append("      (select oa.name from Organ oa where tf._OrganAffected_key = oa._Organ_key) organAffected, ").append(EOL);
            sbSelect.append("      aty.name treatmentType, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorFrequencyTreatments where _TumorFrequency_key = tft._TumorFrequency_key) numAgents, ").append(EOL);
            sbSelect.append("      a._Agent_key, ").append(EOL);
            sbSelect.append("      a.name agentName, ").append(EOL);
            sbSelect.append("      acc.accId, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorGenetics iaptf where iaptf._TumorFrequency_key = tf._TumorFrequency_key) numGenetics, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorGeneticChanges tgc where tgc._TumorFrequency_key = tf._TumorFrequency_key) numCytoGenetics, ").append(EOL);
            sbSelect.append("      (select count(1) from TumorGeneticChanges tgc, TmrGntcCngAssayImageAssoc aia, AssayImages ai ").append(EOL);
            sbSelect.append("         where tgc._TumorFrequency_key = tf._TumorFrequency_key and aia._tumorgeneticchanges_key = tgc._tumorgeneticchanges_key ").append(EOL);
            sbSelect.append("         and aia._assayImages_key = ai._assayImages_key and ai.privateFlag = 0) numAssayImages, ").append(EOL);
            sbSelect.append("      (select count(1) from SampleAssoc where _mtbtypes_key = 5 and _object_key = tf._tumorfrequency_key) numSamples ").append(EOL);
            sbSelect.append(" from TumorFrequency tf left join ").append(EOL);
            sbSelect.append("  (TumorFrequencyTreatments tft join Agent a on ( tft._Agent_key = a._Agent_key ) ").append(EOL);
            sbSelect.append("   join AgentType aty on ( a._AgentType_key = aty._AgentType_key )) ").append(EOL);
            sbSelect.append("   on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), ").append(EOL);
            sbSelect.append("      TumorType tt, ").append(EOL);
            sbSelect.append("      TumorClassification tc, ").append(EOL);
            sbSelect.append("      Accession acc, ").append(EOL);
            sbSelect.append("      Strain s, ").append(EOL);
            sbSelect.append("      Sex sx, ").append(EOL);
            sbSelect.append("      Organ oa, ").append(EOL);
            sbSelect.append("      Organ ot ").append(EOL);
            sbSelect.append("where tf._TumorType_key = tt._TumorType_key ").append(EOL);
            sbSelect.append("  and tt._TumorClassification_key = tc._TumorClassification_key ").append(EOL);
            sbSelect.append("  and tt._Organ_key = ot._Organ_key ").append(EOL);
            sbSelect.append("  and tf._Strain_key = s._Strain_key ").append(EOL);
            sbSelect.append("  and tf._Sex_key = sx._Sex_key ").append(EOL);
            sbSelect.append("  and tf._Reference_key = acc._Object_key ").append(EOL);
            sbSelect.append("  and acc._MTBTypes_key = 6 ").append(EOL);
            sbSelect.append("  and acc._SiteInfo_key = 1 ").append(EOL);

            StringBuffer tumorFrequencyClause = null;

            if ((tumorFrequencyKeys != null) && (tumorFrequencyKeys.length > 0)) {
                tumorFrequencyClause = new StringBuffer("");
                for (int i = tumorFrequencyKeys.length; --i >= 0;) {
                    tumorFrequencyClause.append(tumorFrequencyKeys[i]);

                    if (i != 0) {
                        tumorFrequencyClause.append(',');
                    }
                }
            }

            if (tumorFrequencyClause != null) {
                sbSelect.append("  and tf._TumorFrequency_key in (");
                sbSelect.append(tumorFrequencyClause);
                sbSelect.append(") ").append(EOL);
            }
// this might break things it was order by coalesce (sort_order, _Parent_key),...
            sbSelect.append(" order by 3,2, metastasis, organAffected ");

            log.debug(sbSelect.toString());


            ResultSet rs = null;
            List<MTBTumorFrequencySummaryDTO> tumorFreqRecs = new ArrayList<MTBTumorFrequencySummaryDTO>();
            Map<String, String> freqs = new HashMap<String, String>();

            rs = stmtSelect.executeQuery(sbSelect.toString());

            MTBTumorFrequencySummaryDTO prev = new MTBTumorFrequencySummaryDTO();
            Map<String, String> agents = null;
            Map<String, String> treatments = new HashMap<String, String>();


            while (rs.next()) {
                MTBTumorFrequencySummaryDTO current = new MTBTumorFrequencySummaryDTO();
                current.setTumorFrequencyKey(rs.getInt(1));
                current.setParentFrequencyKey(rs.getInt(2));
                current.setSortOrder(rs.getInt(3) <= 0 ? rs.getInt(2) : rs.getInt(3));
                current.setIsParent(rs.getInt(4) == 0);
                current.setStrainSex(rs.getString(10));
                current.setNote(rs.getString(11));
                current.setReproductiveStatus(rs.getString(12));
                current.setInfectionStatus(rs.getString(13));
                current.setFrequency(rs.getString(14));
                current.setNumMiceAffected(rs.getString(15));
                current.setColonySize(rs.getString(16));
                current.setAgeOnset(rs.getString(17));
                current.setAgeDetection(rs.getString(18));
                current.setNumNotes(rs.getInt(19));
                current.setNumPathEntries(rs.getInt(20));
                current.setNumImages(rs.getInt(21));
                current.setOrganAffected(rs.getString(22));
                tumor.setTreatmentType(DAOUtils.nvl(rs.getString(23), NONE));
                String agentKey = rs.getString(25);
                String agent = rs.getString(26);
                current.setReference(rs.getString(27));
                current.setNumGenetics(rs.getInt(28));
                // there may be only cytogenetic changes
                if (current.getNumGenetics() < 1) {
                    current.setNumGenetics(rs.getInt(29));
                }
                current.setNumAssayImages(rs.getInt(30));
                current.setNumSamples(rs.getInt(31));

                // redundant, set over and over again
                tumor.setTumorClassification(rs.getString(5));
                tumor.setOrganOfOrigin(rs.getString(6));
                tumor.setTumorName(rs.getString(7));

                treatments.put(tumor.getTreatmentType(), tumor.getTreatmentType());

                agents = new HashMap<String, String>();

                if (StringUtils.hasValue(agentKey)
                        && StringUtils.hasValue(agent)) {
                    agents.put(agentKey, agent);
                }

                current.setAgents(agents);

                if (prev.getTumorFrequencyKey() == current.getTumorFrequencyKey()) {
                    MTBTumorFrequencySummaryDTO tfs = tumorFreqRecs.get(tumorFreqRecs.size() - 1);

                    Map<String, String> h = tfs.getAgents();

                    if (h == null) {
                        h = new HashMap<String, String>();
                    }

                    if (StringUtils.hasValue(agentKey)
                            && StringUtils.hasValue(agent)) {
                        h.put(agentKey, agent);
                    }

                    tfs.setAgents(h);

                    tumorFreqRecs.set(tumorFreqRecs.size() - 1, tfs);
                } else {
                    prev = current;
                    tumorFreqRecs.add(current);
                    freqs.put(rs.getString(1), rs.getString(1));
                }
            }
            // put the distinct treatment types into a comma seperated list
            StringBuffer allTreatments = new StringBuffer();
            for (String treatment : treatments.keySet()) {
                allTreatments.append(treatment).append(", ");
            }
            // remove the last comma
            tumor.setTreatmentType(allTreatments.subSequence(0, allTreatments.length() - 2).toString());

            // sort the records in a custom sort
            //organ affected; sex; reproductive status; freq (highest on top)
            MTBTumorFrequencySummaryDTO arrTemp[] = (MTBTumorFrequencySummaryDTO[]) tumorFreqRecs.toArray(new MTBTumorFrequencySummaryDTO[tumorFreqRecs.size()]);

            Arrays.sort(arrTemp, new MTBTumorFrequencySummaryComparator(0));
            tumorFreqRecs = new ArrayList<MTBTumorFrequencySummaryDTO>(Arrays.asList(arrTemp));

            tumor.setFrequencyRecs(tumorFreqRecs);

            String freqsIn = DAOUtils.collectionToString(freqs.values(), ",", "");

            if (StringUtils.hasValue(freqsIn)) {
                try {
                    sbSelect = new StringBuffer();
                    sbSelect.append("select distinct name syn ").append(EOL);
                    sbSelect.append("  from TumorFrequencySynonyms ").append(EOL);
                    sbSelect.append(" where _TumorFrequency_key in (").append(freqsIn).append(") ").append(EOL);
                    sbSelect.append(" order by name ").append(EOL);

                    //debug(sbSelect.toString());
                    stmtSelect = conn.createStatement();
                    rs = stmtSelect.executeQuery(sbSelect.toString());

                    while (rs.next()) {
                        tumor.addSynonym(rs.getString(1));
                    }
                } catch (SQLException sqle) {
                    log.error("Error retrieving synonyms", sqle);
                } finally {
                    close(stmtSelect, rs);
                    freeConnection(conn);
                }
            }
        } catch (Exception e) {
            log.error("Error getting summary", e);
        }

        return tumor;
    }

    /**
     * Get a detailed tumor frequency object based upon the tumor frequency
     * key.
     *
     * @param lKey the tumor frequency key
     * @return a <code>MTBTumorFrequencyDetailDTO</code> representing the
     * tumor frequency object.
     */
    public MTBTumorFrequencyDetailDTO getTumorFrequencyDetail(long lKey) {
        MTBTumorFrequencyDetailDTO dtoTumorFrequency = new MTBTumorFrequencyDetailDTO();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, and execute the query
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_TUMOR_DETAIL);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();

            // loop through the results
            while (rs.next()) {
                dtoTumorFrequency.setTumorFrequencyKey(rs.getInt(1));
                dtoTumorFrequency.setParentFrequencyKey(rs.getInt(2));
                dtoTumorFrequency.setTumorClassification(rs.getString(3));
                dtoTumorFrequency.setOrganOfOrigin(rs.getString(4));
                dtoTumorFrequency.setTumorName(rs.getString(5));
                dtoTumorFrequency.setStrainKey(rs.getLong(6));
                dtoTumorFrequency.setStrainName(rs.getString(7));
                dtoTumorFrequency.setStrainNote(rs.getString(8));
                dtoTumorFrequency.setStrainSex(rs.getString(9));
                dtoTumorFrequency.setNote(rs.getString(10));
                dtoTumorFrequency.setReproductiveStatus(rs.getString(11));
                dtoTumorFrequency.setInfectionStatus(rs.getString(12));
                dtoTumorFrequency.setFrequency(rs.getString(13));
                dtoTumorFrequency.setNumMiceAffected(rs.getString(14));
                dtoTumorFrequency.setColonySize(rs.getString(15));
                dtoTumorFrequency.setAgeOnset(rs.getString(16));
                dtoTumorFrequency.setAgeDetection(rs.getString(17));
                dtoTumorFrequency.setOrganAffected(rs.getString(18));
                dtoTumorFrequency.setTreatmentType(DAOUtils.nvl(rs.getString(19), NONE));
                dtoTumorFrequency.addAgent(rs.getString(21));
                dtoTumorFrequency.setReference(rs.getString(22));
                dtoTumorFrequency.setMtbId(rs.getString(23));

            }
        } catch (SQLException sqle) {
            log.error("Error retrieveing detail information for tumor frequency key " + lKey, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        // get the associated tumor frequency information
        dtoTumorFrequency.setAssociatedFrequencyInfo(getAssociatedFrequencyInfo(lKey));

        // get the associated synonyms
        try {
            TumorFrequencySynonymsDAO daoSynonyms = TumorFrequencySynonymsDAO.getInstance();
            List<TumorFrequencySynonymsDTO> listTFSynonyms = daoSynonyms.loadByTumorFrequencyKey(new Long(lKey));
            for (TumorFrequencySynonymsDTO dto : listTFSynonyms) {
                dtoTumorFrequency.addSynonym(dto.getName());
            }
        } catch (SQLException sqle) {
            log.error("Error retrieveing tumor frequency synonyms for key " + lKey, sqle);
        }

        // get the associated pathology information
        Map hashMap = getAssociatedPathologyInfo(lKey);
        dtoTumorFrequency.setNumImages(((Integer) hashMap.get(NUM_IMAGES)).intValue());
        dtoTumorFrequency.setPathologyRecs((ArrayList) hashMap.get(COLLECTION_PATHOLOGY));

        // get the associated genetics
        dtoTumorFrequency.setTumorGenetics(getTumorGenetics(lKey));

        // get the associated cytogenetics
        dtoTumorFrequency.setTumorCytogenetics(getTumorCytogenetics(lKey));

        // get the associated tumor frequency notes
        dtoTumorFrequency.setAdditionalNotes(getTumorNotes(lKey));

        List<String> refs = new ArrayList<String>();
        for (LabelValueBean<String, Long> r : getTumorRefs(lKey)) {
            refs.add(r.getLabel());
        }

        dtoTumorFrequency.setReferences(refs);


        try {
            // get the associated strain information
            // create a Strain DAO
            StrainDAO strainDAO = StrainDAO.getInstance();
            StrainDTO strainDTO = strainDAO.createStrainDTO();
            strainDTO.setStrainKey(dtoTumorFrequency.getStrainKey());

            MTBStrainUtilDAO mtbStrainDAO = MTBStrainUtilDAO.getInstance();
            MTBStrainDetailDTO mtbStrainDTO = mtbStrainDAO.getStrain(dtoTumorFrequency.getStrainKey());
            dtoTumorFrequency.setStrain(mtbStrainDTO);

            // get the associated strain types
            List<StrainTypeDTO> strainTypesArr = strainDAO.loadStrainTypeViaStrainTypeAssoc(strainDTO);
            dtoTumorFrequency.setStrainTypes(new ArrayList<StrainTypeDTO>(strainTypesArr));

            // get the associated strain synonyms
            // create a StrainSynonym DAO
            StrainSynonymsDAO strainSynonymsDAO = StrainSynonymsDAO.getInstance();
            List<StrainSynonymsDTO> synonymArr = strainSynonymsDAO.loadByStrainKey(strainDTO.getStrainKey());
            synonymArr = consolodateStrainSynonyms(synonymArr);
            dtoTumorFrequency.setStrainSynonyms(new ArrayList<StrainSynonymsDTO>(synonymArr));
        } catch (SQLException sqle) {
            log.error("Error retrieving strain information for tumor frequency key " + lKey, sqle);
        }

        return dtoTumorFrequency;
    }

    // don't have to change existing search methods to allow for new date params
    public SearchResults<MTBStrainTumorSummaryDTO> searchNewSummary(TumorFrequencySearchParams tfParams,
            StrainSearchParams strainParams,
            String strOrderBy,
            long nMaxItems) {

        Date startDate = null;
        Date endDate = null;

        return searchNewSummary(tfParams, strainParams, strOrderBy, nMaxItems, startDate, endDate);

    }

    public SearchResults<MTBStrainTumorSummaryDTO> searchNewSummary(TumorFrequencySearchParams tfParams,
            StrainSearchParams strainParams,
            String strOrderBy,
            long nMaxItems, Date startDate, Date endDate) {

        boolean includePrivateImages = false;
        SearchResults<MTBStrainTumorSummaryDTO> resultWrapper = null;
        long tumorFrequencyCount = 0;

        try {

            SearchResults<MTBStrainTumorDetailsDTO> wrapper =
                    searchNewDetail(tfParams, strainParams, strOrderBy, nMaxItems, includePrivateImages, startDate, endDate);

            tumorFrequencyCount = wrapper.getAncillaryTotal();

            List<MTBStrainTumorDetailsDTO> tumors = wrapper.getList();

            Map<String, MTBStrainTumorSummaryDTO> consMetsTumors = consolidateMetastatsis(tumors);
            Map<String, MTBStrainTumorSummaryDTO> consTumors = consolidateTumors(consMetsTumors);
            Collection<MTBStrainTumorSummaryDTO> tums = consTumors.values();

            List<MTBStrainTumorSummaryDTO> rets = new ArrayList<MTBStrainTumorSummaryDTO>(tums);

            long totalItemsFound = tums.size();

            // here is where the magic of sorting and returning the corect number
            // of rows happens

            if ("strain".equalsIgnoreCase(strOrderBy)) {
                Collections.sort(rets, new MTBStrainTumorSummaryComparator(MTBTumorUtilDAO.ID_STRAIN));
            } else {
                Collections.sort(rets, new MTBStrainTumorSummaryComparator(MTBTumorUtilDAO.ID_ORGAN));
            }

            if (nMaxItems > 0) {
                rets = rets.subList(0, Math.min((int) nMaxItems, rets.size()));
            }
            resultWrapper = new SearchResults<MTBStrainTumorSummaryDTO>();
            resultWrapper.setList(rets);
            resultWrapper.setTotal(totalItemsFound);
            resultWrapper.setAncillaryTotal(tumorFrequencyCount);
        } catch (Exception e) {
            log.error("Error performing search", e);
        }

        return resultWrapper;
    }

    /**
     * @param tfParams
     * @param strainParams
     * @param strOrderBy
     * @param nMaxItems
     * @return SearchResults<MTBStrainTumorDetailsDTO>
     */
    public SearchResults<MTBStrainTumorDetailsDTO> searchNewDetail(TumorFrequencySearchParams tfParams,
            StrainSearchParams strainParams,
            String strOrderBy,
            long nMaxItems, boolean includePrivateImages, Date startDate, Date endDate) {
        SearchResults<MTBStrainTumorDetailsDTO> resultWrapper = null;
        Connection conn = null;
        Statement stmtSelect = null;
        Statement stmtBatch = null;
        ResultSet rs = null;
        List<MTBStrainTumorDetailsDTO> tumors = new ArrayList<MTBStrainTumorDetailsDTO>();
        long tumorFrequencyCount = 0;

        String flagCheck = " = 0 ";
        String tfnumCheck = "and tf.freqnum >=0 ";
        if (includePrivateImages) {
            flagCheck = " > -1 ";
            // don't check freqnum to allow any stray nulls
            tfnumCheck = "";
        }

        try {
            conn = getConnection();
            stmtSelect = conn.createStatement();
            stmtBatch = conn.createStatement();

            String join = " left join ";
            if (StringUtils.hasValue(tfParams.getAgent()) || (tfParams.getAgentTypeKey() > 0)) {
                join = " join ";
            }
            StringBuffer sbSelectMaster = new StringBuffer();
            StringBuffer sbSelect = new StringBuffer();
            sbSelectMaster.append("select distinct tf._TumorFrequency_key, ").append(EOL);
            sbSelectMaster.append("       coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), tf._TumorFrequency_key) _Parent_key, ").append(EOL);
            sbSelectMaster.append("       (select count(1) from TumorFrequencyTreatments where _TumorFrequency_key = tft._TumorFrequency_key) numAgents, ").append(EOL);
            sbSelectMaster.append("       (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1) is not null metastasis, ").append(EOL);
            sbSelectMaster.append("       (select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i").append(EOL);
            sbSelectMaster.append("           where a._Pathology_key = pi._Pathology_key and a._TumorFrequency_key = tf._TumorFrequency_key").append(EOL);
            sbSelectMaster.append("           and pi._images_key = i._images_key and i.privateFlag " + flagCheck + " ) numImages, ").append(EOL);
            sbSelectMaster.append("       oo._Organ_key, ").append(EOL);
            sbSelectMaster.append("       oo.name tumorOrganName, ").append(EOL);
            sbSelectMaster.append("       tc._TumorClassification_key, ").append(EOL);
            sbSelectMaster.append("       tc.name tumorClassName, ").append(EOL);
            sbSelectMaster.append("       oo.name || ' ' || tc.name  tumorName, ").append(EOL);
            sbSelectMaster.append("       s._Strain_key, ").append(EOL);
            sbSelectMaster.append("       s.name, ").append(EOL);
            sbSelectMaster.append("       tf._Sex_key, ").append(EOL);
            sbSelectMaster.append("       tf.incidence, ").append(EOL);
            sbSelectMaster.append("       oa.name organAffectedName, ").append(EOL);
            sbSelectMaster.append("       coalesce(aty._AgentType_key, 0) _AgentType_key, ").append(EOL);
            sbSelectMaster.append("       aty.name treatmentType, ").append(EOL);
            sbSelectMaster.append("       a._Agent_key, ").append(EOL);
            sbSelectMaster.append("       a.name agentName, ").append(EOL);
            sbSelectMaster.append("       st.type, ").append(EOL);
            sbSelectMaster.append("       (select count(1) from TumorGeneticChanges tgc, TmrGntcCngAssayImageAssoc aia, AssayImages ai ").append(EOL);
            sbSelectMaster.append("         where tgc._tumorfrequency_key = tf._tumorfrequency_key and tgc._tumorgeneticchanges_key = aia._tumorgeneticchanges_key").append(EOL);
            sbSelectMaster.append("         and aia._assayImages_key = ai._assayimages_key and ai.privateflag " + flagCheck + ") numImages2 ").append(EOL);
            sbSelectMaster.append("  from TumorFrequency tf ").append(join).append(EOL);
            sbSelectMaster.append(" (TumorFrequencyTreatments tft join Agent a on ( tft._Agent_key = a._Agent_key ) ").append(EOL);
            sbSelectMaster.append("   join AgentType aty on ( a._AgentType_key = aty._AgentType_key )) ").append(EOL);
            sbSelectMaster.append("   on ( tf._TumorFrequency_key = tft._TumorFrequency_key ), ").append(EOL);
            sbSelectMaster.append("       TumorType tt, ").append(EOL);
            sbSelectMaster.append("       TumorClassification tc, ").append(EOL);
            sbSelectMaster.append("       Strain s, ").append(EOL);
            sbSelectMaster.append("       StrainType st, ").append(EOL);
            sbSelectMaster.append("       StrainTypeAssoc sta, ").append(EOL);
            sbSelectMaster.append("       Organ oa, ").append(EOL);
            sbSelectMaster.append("       Organ oo, master tm ").append(EOL);
            sbSelectMaster.append(" where tf._TumorType_key = tt._TumorType_key ").append(EOL);
            sbSelectMaster.append("   and tt._TumorClassification_key = tc._TumorClassification_key ").append(EOL);
            sbSelectMaster.append("   and tt._Organ_key = oo._Organ_key ").append(EOL);
            sbSelectMaster.append("   and s._Strain_key = sta._Strain_key ").append(EOL);
            sbSelectMaster.append("   and sta._StrainType_key = st._StrainType_key ").append(EOL);

            // start and end dates to get retrospective count for MTB status report

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            if (startDate != null) {
                sbSelectMaster.append(" and tf.create_date > '" + sdf.format(startDate) + "'").append(EOL);
            }
            if (endDate != null) {
                sbSelectMaster.append("  and tf.create_date < '" + sdf.format(endDate) + "'").append(EOL);
            }
            // return all freqs for EI
            sbSelectMaster.append(tfnumCheck).append(EOL);

            sbSelect.append("create temporary table freqsfortemp as ");
            sbSelect.append("select tf._TumorFrequency_key tfkey ").append(EOL);
            sbSelect.append("  from TumorFrequency tf left join TumorFrequencySynonyms tfs on ( tf._tumorfrequency_key = tfs._tumorfrequency_key ) , ").append(EOL);
            sbSelect.append("       TumorType tt, ").append(EOL);
            sbSelect.append("       TumorClassification tc, ").append(EOL);
            sbSelect.append("       Strain s, ").append(EOL);
            sbSelect.append("       Organ oa, ").append(EOL);

            if ((StringUtils.hasValue(tfParams.getAgent())) || (tfParams.getAgentTypeKey() > 0)) {
                sbSelect.append("     temptft ttft,").append(EOL);
            }
            sbSelect.append("       Organ oo ").append(EOL);
            sbSelect.append(" where tf._TumorType_key = tt._TumorType_key ").append(EOL);
            sbSelect.append("   and tt._TumorClassification_key = tc._TumorClassification_key ").append(EOL);
            sbSelect.append("   and tt._Organ_key = oo._Organ_key ").append(EOL);
            sbSelect.append("   and tf._Strain_key = s._Strain_key ").append(EOL);
            sbSelect.append("   and tf._OrganAffected_key = oa._Organ_key ").append(EOL);


            if (tfParams.getTumorFrequencyKey() > 0) {
                sbSelectMaster.append("   and tf._TumorFrequency_key = ").append(tfParams.getTumorFrequencyKey()).append(EOL);
                sbSelect.append("   and tf._TumorFrequency_key = ").append(tfParams.getTumorFrequencyKey()).append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // accession id/reference key
            ///////////////////////////////////////////////////////////////////
            if (tfParams.getReferenceKey() != 0) {
                sbSelect.insert(sbSelect.indexOf("from") + 4, " temp_freq_ref ttfr, ");
                sbSelect.append("   and tf._TumorFrequency_key = ttfr.tfkey  ").append(EOL);

                StringBuffer sbRef = new StringBuffer();
                sbRef.append("create temporary table temp_freq_ref as ");
                sbRef.append("select distinct _TumorFrequency_key tfkey  from TumorFrequency where _Reference_key = ").append(tfParams.getReferenceKey());
                sbRef.append(EOL).append("union").append(EOL);
                sbRef.append("select distinct _TumorFrequency_key tfkey from TumorFrequencyNotes where _Reference_key = ").append(tfParams.getReferenceKey());
                sbRef.append(EOL).append("union").append(EOL);
                sbRef.append("select distinct _TumorFrequency_key tfkey from TumorFrequencySynonyms where _Reference_key = ").append(tfParams.getReferenceKey());

                log.debug("-- STEP Accession ID / Reference Key");
                log.debug(sbRef.toString());
                stmtBatch.addBatch(sbRef.toString());
            }

            ///////////////////////////////////////////////////////////////////
            // agent
            ///////////////////////////////////////////////////////////////////
            // it is important to check the agent here since if there is
            // not a value for agent we will need to outer join
            StringBuffer sbAgentType = new StringBuffer();
            if (StringUtils.hasValue(tfParams.getAgent())) {
                sbSelect.append("   and tf._TumorFrequency_key = ttft._TumorFrequency_key ").append(EOL);

                if (tfParams.getAgentTypeKey() == 0) {
                    // treatment type 'none' is selected as well as an agent so this query is a semantic non starter --> no results
                    //sbAgentType.append("create temporary table temptft as select _TumorFrequency_key  from TumorFrequency where _TumorFrequency_key not in (select _TumorFrequency_key from TumorFrequencyTreatments)").append(EOL);
                } else if (tfParams.getAgentTypeKey() > 0) {
                    sbAgentType.append("create temporary table temptft as select tft._TumorFrequency_key from TumorFrequencyTreatments tft ").append(EOL);
                    sbAgentType.append(" where tft._Agent_key in (select _Agent_key from Agent where _AgentType_key = ").append(tfParams.getAgentTypeKey()).append(" )").append(EOL);
                    sbAgentType.append("   and tft._Agent_key in (select _Agent_key from Agent where lower(name) like '%").append(tfParams.getAgent().toLowerCase()).append("%') ").append(EOL);
                } else {
                    sbAgentType.append("create temporary table  temptft as select tft._TumorFrequency_key from TumorFrequencyTreatments tft ").append(EOL);
                    sbAgentType.append(" where tft._Agent_key in (select _Agent_key from Agent where lower(name) like '%").append(tfParams.getAgent().toLowerCase()).append("%') ").append(EOL);
                }
            } else {
                if (tfParams.getAgentTypeKey() == 0) {
                    sbSelect.append("   and tf._TumorFrequency_key not in (select _TumorFrequency_key from  TumorFrequencyTreatments) ").append(EOL);
                } else if (tfParams.getAgentTypeKey() > 0) {
                    sbAgentType.append("create temporary table temptft as select distinct tft._TumorFrequency_key from TumorFrequencyTreatments tft, Agent a ").append(EOL);
                    sbAgentType.append(" where tft._Agent_key = a._Agent_key and a._AgentType_key = ").append(tfParams.getAgentTypeKey()).append(EOL);
                    sbSelect.append("   and tf._TumorFrequency_key = ttft._TumorFrequency_key ").append(EOL);
                }
            }

            if (sbAgentType.length() > 0) {
                log.debug("-- STEP Agent and Agent Types");
                log.debug(sbAgentType.toString());
                stmtBatch.addBatch(sbAgentType.toString());
            }

            sbSelectMaster.append("   and tf._Strain_key = s._Strain_key ").append(EOL);
            sbSelectMaster.append("   and tf._OrganAffected_key = oa._Organ_key ").append(EOL);
            sbSelectMaster.append("   and tf._TumorFrequency_key = tm.tfkey  ").append(EOL);


            // if there are allelepairs  an individual organ and tumor classificatin was selected
            boolean skipParents = false;

            if (tfParams.getAllelePairKeys() != null && tfParams.getAllelePairKeys().length() > 0) {
                skipParents = true;
                sbSelect.append("   and tf._TumorFrequency_key in (select _TumorFrequency_key from TumorGenetics where _AllelePair_key in (").append(tfParams.getAllelePairKeys()).append(") )").append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // organs affected
            ///////////////////////////////////////////////////////////////////
            Collection colOrgansAffected = tfParams.getOrgansAffected();
            if ((colOrgansAffected != null) && (colOrgansAffected.size() > 0)) {
                sbSelect.append("   and oa._Organ_key in (select _Organ_key from  temporgana) ").append(EOL);

                StringBuffer sbOrganSelect = new StringBuffer();
                sbOrganSelect.append("create temporary table temporgana as ");
                sbOrganSelect.append("select _Organ_key ").append(EOL);

                sbOrganSelect.append("  from Organ ").append(EOL);

                if (colOrgansAffected.size() == 1) {
                    sbOrganSelect.append("   where _OrganParent_key = ").append(colOrgansAffected.iterator().next()).append(EOL);
                } else if (colOrgansAffected.size() > 1) {
                    sbOrganSelect.append("   where _OrganParent_key in (").append(DAOUtils.collectionToString(colOrgansAffected, ",", "")).append(')').append(EOL);
                }

                sbOrganSelect.append(EOL).append(" union ").append(EOL);
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("  from Organ ").append(EOL);
                if (colOrgansAffected.size() == 1) {
                    sbOrganSelect.append("   where _Organ_key = ").append(colOrgansAffected.iterator().next()).append(EOL);
                } else if (colOrgansAffected.size() > 1) {
                    sbOrganSelect.append("   where _Organ_key in (").append(DAOUtils.collectionToString(colOrgansAffected, ",", "")).append(')').append(EOL);
                }

                log.debug("-- STEP Organs Affected");
                log.debug(sbOrganSelect.toString());
                stmtBatch.addBatch(sbOrganSelect.toString());
            }

            ///////////////////////////////////////////////////////////////////
            // organs of origin
            ///////////////////////////////////////////////////////////////////
            Collection colOrgansOrigin = tfParams.getOrgansOrigin();
            if ((colOrgansOrigin != null) && (colOrgansOrigin.size() > 0)) {
                sbSelect.append("   and oo._Organ_key in (select _Organ_key from  temporganb) ").append(EOL);

                StringBuffer sbOrganSelect = new StringBuffer();
                sbOrganSelect.append("create temporary table temporganb as ");
                sbOrganSelect.append("select _Organ_key ").append(EOL);
                sbOrganSelect.append("from Organ ").append(EOL);
                if (!skipParents) {
                    if (colOrgansOrigin.size() == 1) {
                        sbOrganSelect.append("   where _OrganParent_key = ").append(colOrgansOrigin.iterator().next()).append(EOL);
                    } else if (colOrgansOrigin.size() > 1) {
                        sbOrganSelect.append("   where _OrganParent_key in (").append(DAOUtils.collectionToString(colOrgansOrigin, ",", "")).append(')').append(EOL);
                    }

                    sbOrganSelect.append(EOL).append(" union ").append(EOL);
                    sbOrganSelect.append("select _Organ_key ").append(EOL);
                    sbOrganSelect.append("  from Organ ").append(EOL);

                }
                if (colOrgansOrigin.size() == 1) {
                    sbOrganSelect.append("   where _Organ_key = ").append(colOrgansOrigin.iterator().next()).append(EOL);
                } else if (colOrgansOrigin.size() > 1) {
                    sbOrganSelect.append("   where _Organ_key in (").append(DAOUtils.collectionToString(colOrgansOrigin, ",", "")).append(')').append(EOL);
                }

                log.debug("-- STEP Organs of Origin");
                log.debug(sbOrganSelect.toString());
                stmtBatch.addBatch(sbOrganSelect.toString());
            }

            ///////////////////////////////////////////////////////////////////
            // tumor classifications
            ///////////////////////////////////////////////////////////////////
            Collection colTumorClassifications = tfParams.getTumorClassifications();
            if ((colTumorClassifications != null) && (colTumorClassifications.size() > 0)) {
                sbSelect.append("   and tc._TumorClassification_key in (select _TumorClassification_key from  temptc) ").append(EOL);

                StringBuffer sbTCSelect = new StringBuffer();
                sbTCSelect.append("create temporary table  temptc as ");
                sbTCSelect.append("select _TumorClassification_key ").append(EOL);
                sbTCSelect.append("  from TumorClassification ").append(EOL);

                if (!skipParents) {

                    if (colTumorClassifications.size() == 1) {
                        sbTCSelect.append("   where _TCParent_key = ").append(colTumorClassifications.iterator().next()).append(EOL);
                    } else if (colTumorClassifications.size() > 1) {
                        sbTCSelect.append("   where _TCParent_key in (").append(DAOUtils.collectionToString(colTumorClassifications, ",", "")).append(')').append(EOL);
                    }

                    sbTCSelect.append(EOL).append(" union ").append(EOL);
                    sbTCSelect.append("select _TumorClassification_key ").append(EOL);
                    sbTCSelect.append("  from TumorClassification ").append(EOL);
                }

                if (colTumorClassifications.size() == 1) {
                    sbTCSelect.append("   where _TumorClassification_key = ").append(colTumorClassifications.iterator().next()).append(EOL);
                } else if (colTumorClassifications.size() > 1) {
                    sbTCSelect.append("   where _TumorClassification_key in (").append(DAOUtils.collectionToString(colTumorClassifications, ",", "")).append(')').append(EOL);
                }

                log.debug("-- STEP Tumor Classification");
                log.debug(sbTCSelect.toString());
                stmtBatch.addBatch(sbTCSelect.toString());
            }

            if (tfParams.isExcludePlasias()) {
                log.debug("-- STEP Exclude Plasias");
                sbSelect.append("   and tc._TumorClassification_key in (select _TumorClassification_key from  temptcplasias) ").append(EOL);
                stmtBatch.addBatch(SQL_TFGRID_TUMORCLASS_TEMP);
                log.debug(SQL_TFGRID_TUMORCLASS_TEMP);
            }
            String skComp = strainParams.getStrainKeyComparison();
            if (strainParams.getStrainKey() > 0) {
                sbSelect.append("   and s._Strain_key ").append(skComp).append(strainParams.getStrainKey()).append(EOL);
            }

            if (strainParams.getStrainFamilyKey() > 0) {
                sbSelect.append("   and s._StrainFamily_key = ").append(strainParams.getStrainFamilyKey()).append(EOL);
            }

            if (StringUtils.hasValue(tfParams.getAnatomicalSystemOriginName())) {
                sbSelect.append("   and oo._Organ_key in (select _Organ_key from  tempooa)").append(EOL);

                StringBuffer sbTempAnatomical = new StringBuffer();
                sbTempAnatomical.append(" create temporary table  tempooa as ");
                sbTempAnatomical.append("select o._Organ_key ").append(EOL);
                sbTempAnatomical.append("  from Organ o, AnatomicalSystem s ").append(EOL);
                sbTempAnatomical.append(" where o._AnatomicalSystem_key =a._AnatomicalSystem_key and lower(a.name) like '%").append(tfParams.getAnatomicalSystemOriginName().toLowerCase()).append("%'").append(EOL);

                log.debug("-- STEP Anatomical System");
                log.debug(sbTempAnatomical.toString());
                stmtBatch.addBatch(sbTempAnatomical.toString());
            }

            if (StringUtils.hasValue(tfParams.getOrganOriginName())) {
                if (tfParams.getOrganOriginNameComparison() == TumorFrequencySearchParams.STRING_COMPARE_CONTAINS) {
                    sbSelect.append("   and lower(oo.name) like '%").append(tfParams.getOrganOriginName().toLowerCase()).append("%' ").append(EOL);
                } else {
                    sbSelect.append("   and lower(oo.name) not like '%").append(tfParams.getOrganOriginName().toLowerCase()).append("%' ").append(EOL);
                }
            }

            if (tfParams.getOrganOriginKey() > 0) {
                sbSelect.append("   and oo._Organ_key = ").append(tfParams.getOrganOriginKey()).append(EOL);
            }

            if (tfParams.getOrganOriginParentKey() > 0) {
                sbSelect.append("   and oo._OrganParent_key = ").append(tfParams.getOrganOriginParentKey()).append(EOL);
            }

            if (StringUtils.hasValue(tfParams.getOrganAffectedName())) {
                if (tfParams.getOrganAffectedNameComparison() == TumorFrequencySearchParams.STRING_COMPARE_CONTAINS) {
                    sbSelect.append("   and lower(oa.name) like '%").append(tfParams.getOrganAffectedName().toLowerCase()).append("%' ").append(EOL);
                } else {
                    sbSelect.append("   and lower(oa.name) not like '%").append(tfParams.getOrganAffectedName().toLowerCase()).append("%' ").append(EOL);
                }
            }
           

            if (tfParams.getColonySize() > -1) {

                String strCompare = "=";
                if (tfParams.getColonySizeComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_EQUALS) {
                    strCompare = " = ";
                } else if (tfParams.getColonySizeComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_GREATERTHAN) {
                    strCompare = " > ";
                } else if (tfParams.getColonySizeComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_LESSTHAN) {
                    strCompare = " < ";
                } else if (tfParams.getColonySizeComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_NOTEQUALS) {
                    strCompare = " != ";
                }

                sbSelect.append("   and tf.colonySize ").append(strCompare).append(tfParams.getColonySize()).append(' ').append(EOL);
            }

            if (tfParams.getFrequency() > -1) {

                String strCompare = "=";
                if (tfParams.getFrequencyComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_EQUALS) {
                    strCompare = " = ";
                } else if (tfParams.getFrequencyComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_GREATERTHAN) {
                    strCompare = " > ";
                } else if (tfParams.getFrequencyComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_LESSTHAN) {
                    strCompare = " < ";
                } else if (tfParams.getFrequencyComparison() == TumorFrequencySearchParams.NUMERIC_COMPARE_NOTEQUALS) {
                    strCompare = " != ";
                }

                sbSelect.append("   and tf.freqNum").append(strCompare).append(tfParams.getFrequency()).append(' ').append(EOL);
            }

            // parent key = own frequency key
            if (tfParams.isExcludeMets()) {
                sbSelect.append("   and tf._TumorFrequency_key = coalesce((select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1), tf._TumorFrequency_key)").append(EOL);
            }

            // check both child and parent for images
            if (tfParams.isMustHaveImages()) {

                sbSelect.append("and ((select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i ");
                sbSelect.append("where a._Pathology_key = pi._Pathology_key and pi._images_key = i._images_key and  i.privateFlag  = 0 ");
                sbSelect.append("and  a._TumorFrequency_key = (select _Parent_key from TumorProgression where _Child_key = tf._TumorFrequency_key and _TumorProgressionType_key = 1)  ) > 0 ");
                sbSelect.append(" or ");
                sbSelect.append("(select count(1) from TumorPathologyAssoc a, PathologyImages pi, Images i ");
                sbSelect.append("where a._Pathology_key = pi._Pathology_key and pi._images_key = i._images_key and  i.privateFlag  = 0 ");
                sbSelect.append("and  a._TumorFrequency_key = tf._TumorFrequency_key ) > 0 ) ");
            }

            if (tfParams.isRestrictToMetastasis()) {
                sbSelect.insert(sbSelect.indexOf("from") + 4, " temp_mets ttmets, ");
                sbSelect.append("   and tf._TumorFrequency_key = ttmets.tfkey ").append(EOL);

                StringBuffer sbMets = new StringBuffer();

                sbMets.append("create temporary table  temp_mets as ");
                sbMets.append("select distinct tf._TumorFrequency_key tfkey ").append(EOL);
                sbMets.append("  from TumorFrequency tf, ").append(EOL);
                sbMets.append("       TumorProgression tp");

                if (colOrgansAffected != null) {
                    sbMets.append(", ").append(EOL);
                    sbMets.append("      Organ o ").append(EOL);

                    if (colOrgansAffected.size() == 1) {
                        sbMets.append("   where o._Organ_key = ").append(colOrgansAffected.iterator().next()).append(EOL);
                        sbMets.append("   and o._Organ_key = tf._OrganAffected_key ").append(EOL);
                        sbMets.append("   and tf._TumorFrequency_key = tp._Child_key ").append(EOL);
                        sbMets.append("   and tp._TumorProgressionType_key = 1 ");
                    } else if (colOrgansAffected.size() > 1) {
                        sbMets.append("   where o._Organ_key in (").append(DAOUtils.collectionToString(colOrgansAffected, ",", "")).append(") ").append(EOL);
                        sbMets.append("   and o._Organ_key = tf._OrganAffected_key ").append(EOL);
                        sbMets.append("   and tf._TumorFrequency_key = tp._Child_key ").append(EOL);
                        sbMets.append("   and tp._TumorProgressionType_key = 1 ");
                    } else if (colOrgansAffected.size() == 0) {
                        sbMets.append("   where o._Organ_key = tf._OrganAffected_key ").append(EOL);
                        sbMets.append("   and tf._TumorFrequency_key = tp._Child_key ").append(EOL);
                        sbMets.append("   and tp._TumorProgressionType_key = 1 ");
                    }
                } else {
                    sbMets.append(" where tf._TumorFrequency_key = tp._Child_key ").append(EOL);
                    sbMets.append("   and tp._TumorProgressionType_key = 1 ");
                }

                log.debug("-- STEP Restrict to Metastases");
                log.debug(sbMets.toString());
                stmtBatch.addBatch(sbMets.toString());
            }

            if (StringUtils.hasValue(tfParams.getTumorName())) {
                String tName = tfParams.getTumorName().toLowerCase();
                sbSelect.append("   and ( ( lower(oo.name) || ' ' || lower(tc.name) like '%").append(tName).append("%') ").append(EOL);
                sbSelect.append("         or ( lower(tfs.name) like '%").append(tName).append("%' ) ) ").append(EOL);
            }

            ///////////////////////////////////////////////////////////////////
            // strain types
            ///////////////////////////////////////////////////////////////////
            List<String> listStrainTypes = new ArrayList<String>(strainParams.getStrainTypes());
            if ((listStrainTypes != null) && (listStrainTypes.size() != 0)) {
                String types = DAOUtils.collectionToString(listStrainTypes, ", ", "");
                if (strainParams.isExactStrainTypes()) {
                    StringBuffer temp = new StringBuffer();
                    temp.append("create temporary table  tempstraintype as ");
                    temp.append("select count(1) num, _Strain_key ").append(EOL);

                    temp.append("  from StrainTypeAssoc ").append(EOL);
                    temp.append(" where _Strain_key in (select _Strain_key from StrainTypeAssoc where _StrainType_key in (").append(types).append("))").append(EOL);
                    temp.append(" group by _Strain_key").append(EOL);
                    temp.append("having count(1) = 1").append(EOL);

                    log.debug("-- STEP Strain Types");
                    log.debug(temp.toString());
                    stmtBatch.addBatch(temp.toString());

                    sbSelect.append(" and s._Strain_key in (select distinct _Strain_key from  tempstraintype)").append(EOL);
                } else {
                    sbSelect.append(" and s._Strain_key in (select distinct _Strain_key from StrainTypeAssoc where _StrainType_key in (").append(types).append(")) ").append(EOL);
                }
            }


            ///////////////////////////////////////////////////////////////////
            // strain names
            ///////////////////////////////////////////////////////////////////
            if ((strainParams.getStrainName() != null) && (strainParams.getStrainName().trim().length() > 0)) {
                String clause = "";
                if (strainParams.getStrainNameComparison().equalsIgnoreCase("equals")) {
                    clause = "where lower(name) = '" + strainParams.getStrainName().toLowerCase() + "'";
                }
                if (strainParams.getStrainNameComparison().equalsIgnoreCase("begins")) {
                    clause = "where lower(name) like '" + strainParams.getStrainName().toLowerCase() + "%'";
                }
                if (strainParams.getStrainNameComparison().equalsIgnoreCase("contains")) {
                    clause = "where lower(name) like '%" + strainParams.getStrainName().toLowerCase() + "%'";
                }
                StringBuffer temp = new StringBuffer();
                temp.append("create temporary table tempstrainname as select _Strain_key ").append(EOL);
                temp.append("  from Strain ").append(EOL);
                temp.append(clause).append(EOL);

                log.debug("-- STEP Strain Name");
                log.debug(temp.toString());
                stmtBatch.addBatch(temp.toString());

                sbSelect.append(" and s._Strain_key in (select distinct _Strain_key from  tempstrainname)").append(EOL);

            }



            sbSelectMaster.append(" order by metastasis, _Parent_key, oo.name, tc.name, oa.name, _tumorfrequency_key, treatmenttype");

            log.debug("-- STEP Preliminary Filter of TumorFrequency Records");
            log.debug(sbSelect.toString());
            stmtBatch.addBatch(sbSelect.toString());


            StringBuffer sbForMaster = new StringBuffer();
            sbForMaster.append(" create temporary table  master as ");
            sbForMaster.append("select tp._child_key as tfkey from TumorProgression tp, TumorProgression tp2, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Parent_key =tp2._Parent_key and tp2._TumorProgressionType_key = 1 and tp2._Child_key = tft.tfkey  ");

            stmtBatch.addBatch(sbForMaster.toString());

            stmtBatch.addBatch("insert into master select tp._child_key from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Parent_key = tft.tfkey ");

            stmtBatch.addBatch("insert into master select tp._parent_key from TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Child_key = tft.tfkey ");

            stmtBatch.addBatch("insert into master select tp._Parent_key from  TumorProgression tp, freqsfortemp tft where tp._TumorProgressionType_key = 1 and tp._Parent_key = tft.tfkey ");

            stmtBatch.addBatch("insert into master select distinct tfkey from freqsfortemp");

            log.debug("-- STEP Tertiary Filter of Tumor Frequency Records");

            stmtBatch.addBatch("create index tst_master_idx  on master (tfkey)");

            stmtBatch.executeBatch();
            stmtBatch.close();

            log.debug("-- STEP Primary Select of Tumor Frequency Records");
            log.debug(sbSelectMaster.toString());
            stmtSelect = conn.createStatement();
            rs = stmtSelect.executeQuery(sbSelectMaster.toString());

            MTBStrainTumorDetailsDTO prevTumor = new MTBStrainTumorDetailsDTO();

            while (rs.next()) {
                MTBStrainTumorDetailsDTO currentTumor = new MTBStrainTumorDetailsDTO();
                currentTumor.setTumorFrequencyKey(rs.getInt(1));
                currentTumor.setParentFrequencyKey(rs.getInt(2));
                //set images if there are pathology or assay images
                currentTumor.setImages((rs.getInt(5) > 0) || (rs.getInt(21) > 0));
                currentTumor.setOrganOfOriginKey(rs.getInt(6));
                currentTumor.setTumorClassKey(rs.getInt(8));
                currentTumor.setTumorName(rs.getString(10));
                currentTumor.setStrainKey(rs.getInt(11));
                currentTumor.setStrainName(rs.getString(12));
                currentTumor.setSex(rs.getString(13));
                currentTumor.setFrequency(rs.getString(14));
                currentTumor.setOrganAffectedName(rs.getString(15));
                currentTumor.setTreatmentType(DAOUtils.nvl(rs.getString(17), NONE));

                // if only showing metatising tumors don't show the child tumor frequency records
                // this defaults to true when query comes from WI  
                if (!tfParams.isRestrictToMetastasis()
                        || (currentTumor.getParentFrequencyKey() == currentTumor.getTumorFrequencyKey()
                        || !includePrivateImages)) {

                    if (prevTumor.getTumorFrequencyKey() == currentTumor.getTumorFrequencyKey()) {
                        MTBStrainTumorDetailsDTO ts = tumors.get(tumors.size() - 1);
                        ts.addAgentKey(rs.getString(18));
                        ts.addAgent(rs.getString(19));
                        ts.addStrainType(rs.getString(20));
                        if (rs.getString(17) != null && (rs.getString(17).trim().length() > 0)) {
                            if (ts.getTreatmentType().indexOf(rs.getString(17)) == -1) {
                                ts.setTreatmentType(ts.getTreatmentType() + ", " + rs.getString(17));
                            }
                        } else {
                            ts.setTreatmentType(DAOUtils.nvl(rs.getString(17), NONE));
                        }
                        tumors.set(tumors.size() - 1, ts);
                    } else {
                        prevTumor = currentTumor;
                        currentTumor.addAgentKey(rs.getString(18));
                        currentTumor.addAgent(rs.getString(19));
                        currentTumor.addStrainType(rs.getString(20));
                        tumors.add(currentTumor);
                        tumorFrequencyCount++;
                    }
                }
            }
        } catch (SQLException ex) {
            log.error("Error performing search", ex);
        } finally {
            close(stmtBatch);
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        try {
            resultWrapper = new SearchResults<MTBStrainTumorDetailsDTO>();
            resultWrapper.setList(tumors);
            resultWrapper.setTotal(tumors.size());
            resultWrapper.setAncillaryTotal(tumorFrequencyCount);
        } catch (Exception e) {
            log.error("Error performing search", e);
        }

        return resultWrapper;
    }

    public List<LabelValueBean<String, Long>> getTumorRefs(long lKey) {
        List<LabelValueBean<String, Long>> tumorRefs =
                new ArrayList<LabelValueBean<String, Long>>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // get a connection
            conn = getConnection();

            // create a prepared statement
            pstmt = conn.prepareStatement(SQL_TUMOR_REFS_TEMP);
            pstmt.setLong(1, lKey);
            pstmt.setLong(2, lKey);
            pstmt.setLong(3, lKey);

            // execute the prepared statement
            pstmt.execute();

            // create a statement
            stmt = conn.createStatement();

            // execute the statement
            rs = stmt.executeQuery(SQL_TUMOR_REFS);

            // loop through the results
            while (rs.next()) {
                LabelValueBean<String, Long> ref = new LabelValueBean<String, Long>();
                ref.setLabel(rs.getString(1));
                ref.setValue(rs.getLong(2));
                tumorRefs.add(ref);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving reference information for tumor frequency key " + lKey, sqle);
        } finally {
            close(pstmt);
            close(stmt, rs);
            freeConnection(conn);
        }

        return tumorRefs;
    }

    // ------------------------------------------------------ Protected Methods
    // none
    // -------------------------------------------------------- Private Methods
    /**
     * Fix the allele type name based upon the type names from the first
     * and second allele.
     *
     * @param type1 the type of the first allele
     * @param type2 the type of the second allele
     * @return the fixed type
     */
    private String fixAlleleType(String type1, String type2) {
        String strReturnType = "";

        if (!StringUtils.hasValue(type2)) {
            strReturnType = type1;
        }

        if (type1.equalsIgnoreCase(type2)) {
            strReturnType = type1;
        }

        if ("normal".equalsIgnoreCase(type2)) {
            strReturnType = type1;
        }
        if (StringUtils.hasValue(type2)) {
            strReturnType = type1 + " / " + type2;
        }

        return strReturnType;
    }

    private Map getAssociatedPathologyInfo(long lKey) {
        List<MTBTumorFrequencyPathologySummaryDTO> arrDTOPathology = new ArrayList<MTBTumorFrequencyPathologySummaryDTO>();
        Map hashMap = new HashMap();
        int nImages = 0;

        try {
            // create a frequency dto to acquire the pathology reports
            TumorFrequencyDAO daoTF = TumorFrequencyDAO.getInstance();
            PathologyImagesDAO daoPathImages = PathologyImagesDAO.getInstance();
            ImagesDAO daoImages = ImagesDAO.getInstance();
            ReferenceDAO daoRef = ReferenceDAO.getInstance();

            TumorFrequencyDTO dtoTF = daoTF.createTumorFrequencyDTO();
            dtoTF.setTumorFrequencyKey(lKey);

            // get the pathology reports
            List<PathologyDTO> listDTOPath = daoTF.loadPathologyViaTumorPathologyAssoc(dtoTF);

            // loop through each report
            for (PathologyDTO dto : listDTOPath) {
                MTBTumorFrequencyPathologySummaryDTO currentPathology = new MTBTumorFrequencyPathologySummaryDTO();
                currentPathology.setPathKey(dto.getPathologyKey().intValue());
                currentPathology.setAgeAtNecropsy(dto.getAgeAtNecropsy());
                currentPathology.setDescription(dto.getDescription());
                currentPathology.setNote(dto.getNote());

                if (dto.getPathologyKey() != null) {
                    currentPathology.setPathologistKey(dto.getPathologyKey().intValue());
                }

                if (dto.getContributorKey() != null) {
                    currentPathology.setContributorKey(dto.getContributorKey().intValue());
                }

                // get the pathology images for each report
                List<PathologyImagesDTO> listDTOPathImages = daoPathImages.loadByPathologyKey(dto.getPathologyKey());

                List<MTBPathologyImageHelperDTO> colImages = new ArrayList<MTBPathologyImageHelperDTO>();

                // loop through each image
                for (PathologyImagesDTO dtoPathImage : listDTOPathImages) {
                    ImagesDTO dtoImage = daoImages.loadByPrimaryKey(dtoPathImage.getImagesKey());
                    if (dtoImage.getPrivateFlag() == 0) {
                        ReferenceDTO dtoRef = daoRef.loadByPrimaryKey(dto.getContributorKey());

                        MTBPathologyImageHelperDTO dtoHelper = new MTBPathologyImageHelperDTO();
                        dtoHelper.setImageId(dtoImage.getImagesKey().intValue());
                        dtoHelper.setImageCaption(dtoPathImage.getCaption());
                        dtoHelper.setSourceOfImage(StringUtils.nvl(dtoRef.getPerson(), dtoRef.getPrimaryAuthor()));
                        dtoHelper.setInstitution(dtoRef.getInstitution());
                        dtoHelper.setStainMethod(dtoPathImage.getStain());
                        dtoHelper.setImageUrl(dtoImage.getUrl());
                        dtoHelper.setImageUrlPath(dtoImage.getUrlPath());
                        dtoHelper.setImageThumbName(dtoImage.getLowResName());
                        dtoHelper.setImageName(dtoImage.getMediumResName());
                        dtoHelper.setImageNote(dtoPathImage.getNotes());
                        nImages++;
                        colImages.add(dtoHelper);
                    }
                }
                currentPathology.setImages(colImages);
                arrDTOPathology.add(currentPathology);
            }
        } catch (Exception e) {
            log.error("Error retrieving associated pathology information for tumor frequency key " + lKey, e);
        }

        hashMap.put(COLLECTION_PATHOLOGY, arrDTOPathology);
        hashMap.put(NUM_IMAGES, Integer.valueOf(nImages));

        return hashMap;
    }

    private List<MTBGeneticsSearchDTO> getTumorGenetics(long lKey) {
        //Timer timer = new Timer();
        List<MTBGeneticsSearchDTO> tumorGenetics = new ArrayList<MTBGeneticsSearchDTO>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, prepare it, and execute it
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_TUMOR_GENETICS);
            pstmt.setLong(1, lKey);
            pstmt.setLong(2, lKey);
            rs = pstmt.executeQuery();

            // loop through the results
            while (rs.next()) {
                MTBGeneticsSearchDTO dtoCurrent = new MTBGeneticsSearchDTO();
                dtoCurrent.setMarkerKey(rs.getInt(2));
                dtoCurrent.setGeneName(rs.getString(3));
                dtoCurrent.setGeneSymbol(rs.getString(4));
                dtoCurrent.setChromosome(rs.getString(5));
                String tempAlleleType = fixAlleleType(rs.getString(8), rs.getString(11));
                dtoCurrent.setAlleleType(tempAlleleType);

                dtoCurrent.setAllele1Symbol(rs.getString(7));
                dtoCurrent.setAllele2Symbol(rs.getString(10));

                tumorGenetics.add(dtoCurrent);
            }
        } catch (SQLException sqle) {
            log.error("Error retriveing genetics information for tumor frequency key " + lKey, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        //debug("--> Querying tumor genetics took: " + timer.toString());
        return tumorGenetics;
    }

    private List<MTBTumorGeneticChangesDTO> getTumorCytogenetics(long lKey) {
        //Timer timer = new Timer();
        List<MTBTumorGeneticChangesDTO> tumorCytogenetics = new ArrayList<MTBTumorGeneticChangesDTO>();
        List<MTBTumorGeneticChangesDTO> tumorCytogenetics2 = new ArrayList<MTBTumorGeneticChangesDTO>();
        Connection conn = null;
        StringBuffer sb = new StringBuffer();
        ResultSet rs = null;
        Statement stmtSelect = null;

        try {
            Long mouseOrganismKey = new Long(1L);
            sb.append(" create temporary table  tempCyto as ");
            sb.append("Select distinct tgc.name as name,tgc.notes as notes, ");
            sb.append(" tgc._tumorfrequency_key as tf_key, ");
            sb.append(" tgc._tumorgeneticchanges_key as tgc_key, ay.type as type, ");
            sb.append(" ait.name as assayType ");
            sb.append(" from TumorGeneticChanges tgc left join AssayType ait ");
            sb.append("      on (tgc._assayType_key = ait._assayType_key ), ");
            sb.append(" AlleleType ay, AlleleGroupType agt");

            sb.append(" where tgc._alleletype_key = ay._alleletype_key ");
            sb.append(" and ay._allelegrouptype_key = agt._allelegrouptype_key ");
            sb.append(" and tgc._tumorFrequency_key = " + lKey);

            conn = getConnection();

            stmtSelect = conn.createStatement();
            stmtSelect.executeUpdate(sb.toString());
            rs = stmtSelect.executeQuery("select * from  tempCyto");


            while (rs.next()) {
                MTBTumorGeneticChangesDTO tgcDTO = MTBTumorGeneticChangesDAO.getInstance().createTumorGeneticChangesDTO();
                tgcDTO.setName(rs.getString(1));
                tgcDTO.setNotes(rs.getString(2));
                tgcDTO.setTumorFrequencyKey(rs.getLong(3));

                tgcDTO.setTumorGeneticChangesKey(rs.getLong(4));
                tgcDTO.setAlleleTypeName(rs.getString(5));
                tgcDTO.setAssayType(rs.getString(6));

                List<AssayImagesDTO> dtoAI = getAssayImages(tgcDTO.getTumorGeneticChangesKey());
                tgcDTO.setAssayImages(dtoAI);


                tumorCytogenetics.add(tgcDTO);
            }
            // generate a list of all the chromosomes associated with each genetic change
            sb.delete(0, sb.length());
            sb.append("Select distinct tgc._tumorgeneticchanges_key,c.chromosome from TumorGeneticChanges tgc, GeneticChangeChromosomeAssoc gcca, Chromosome c ");
            sb.append(" where tgc._tumorgeneticchanges_key = gcca._tumorgeneticchanges_key and gcca._chromosome_key = c._chromosome_key ");
            sb.append(" and c._organism_key=" + mouseOrganismKey);
            sb.append(" and tgc._tumorgeneticchanges_key in (select tgc_key from tempCyto)");

            HashMap<Long, String> chromsMap = new HashMap<Long, String>();
            rs = stmtSelect.executeQuery(sb.toString());

            while (rs.next()) {
                Long key = rs.getLong(1);
                String chrom = rs.getString(2);
                if (chromsMap.containsKey(key)) {
                    chromsMap.put(key, chromsMap.get(key) + "," + chrom);
                } else {
                    chromsMap.put(key, chrom);
                }

            }

            Iterator it = tumorCytogenetics.iterator();
            Long key = null;
            while (it.hasNext()) {
                MTBTumorGeneticChangesDTO tgcDTO = (MTBTumorGeneticChangesDTO) it.next();
                key = tgcDTO.getTumorGeneticChangesKey();
                tgcDTO.setDisplayChromosomes((String) chromsMap.get(key));
                tumorCytogenetics2.add(tgcDTO);
            }

        } catch (SQLException sqle) {
            log.error("Error retriveing cytogenetics information for tumor frequency key " + lKey, sqle);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        //debug("--> Querying tumor cyto genetics took: " + timer.toString());
        return tumorCytogenetics;
    }

    private List<AssayImagesDTO> getAssayImages(Long key) {

        Connection conn = null;
        StringBuffer sql = new StringBuffer();
        ResultSet rs = null;
        Statement stmtSelect = null;
        ArrayList<AssayImagesDTO> list = new ArrayList<AssayImagesDTO>();

        sql.append("Select ai._assayImages_key, ai.highresname, ai.lowresname, ");
        sql.append(" ai.caption,ai.copyright,r.person, r.primaryauthor ");
        sql.append(" From AssayImages ai, Reference r ");
        sql.append(" Where ai.privateflag = 0 and ");
        sql.append(" ai._reference_key = r._reference_key and ");
        sql.append(" ai._assayImages_key in (select _assayImages_key ");
        sql.append(" from TmrGntcCngAssayImageAssoc ");
        sql.append(" where _tumorgeneticchanges_key = ");
        sql.append(key.toString());
        sql.append(")");

        try {

            conn = getConnection();

            stmtSelect = conn.createStatement();

            rs = stmtSelect.executeQuery(sql.toString());

            AssayImagesDAO dao = AssayImagesDAO.getInstance();

            while (rs.next()) {
                AssayImagesDTO dto = dao.createAssayImagesDTO();
                dto.setAssayImagesKey(rs.getLong(1));
                dto.setHighResName(rs.getString(2));
                dto.setLowResName(rs.getString(3));
                dto.setCaption(rs.getString(4));
                dto.setCopyright(rs.getString(5));
              
                  // not quite right but almost
                if(rs.getString(6) != null && rs.getString(6).trim().length()>0){
                  dto.setCreateUser(rs.getString(6));
                }else{
                   dto.setCreateUser(rs.getString(7));
                 }
                list.add(dto);
            }

        } catch (SQLException sqle) {
            log.error("Error retriveing assay Image information for tgc key " + key, sqle);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        return list;
    }

    private List<LabelValueDataBean<String, String, Long>> getTumorNotes(long lKey) {
        List<LabelValueDataBean<String, String, Long>> tumorNotes = new ArrayList<LabelValueDataBean<String, String, Long>>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // get a connection, create a statement, prepare it, and execute it
            conn = getConnection();
            pstmt = conn.prepareStatement(SQL_TUMOR_NOTES);
            pstmt.setLong(1, lKey);
            rs = pstmt.executeQuery();

            // loop through the results
            while (rs.next()) {
                LabelValueDataBean<String, String, Long> note = new LabelValueDataBean<String, String, Long>();
                note.setLabel(rs.getString(1));
                note.setValue(rs.getString(2));
                note.setData(rs.getLong(3));
                tumorNotes.add(note);
            }
        } catch (SQLException sqle) {
            log.error("Error retrieving notes for tumor frequency key " + lKey, sqle);
        } finally {
            close(pstmt, rs);
            freeConnection(conn);
        }

        //debug("--> Querying tumor notes took: " + timer.toString());
        return tumorNotes;
    }

    /**
     * Remove synonyms with duplicate names
     * @param list<StrainSynonymsDTO> a list of possibly duplicated synonyms
     * @return list<StrainSynonymsDTO> a list of synonyms with no duplicate names
     */
    private List<StrainSynonymsDTO> consolodateStrainSynonyms(List<StrainSynonymsDTO> list) {
        HashMap<String, StrainSynonymsDTO> map = new HashMap<String, StrainSynonymsDTO>();

        for (StrainSynonymsDTO dto : list) {
            map.put(dto.getName(), dto);
        }
        list.clear();
        list.addAll(map.values());
        return list;

    }
}
