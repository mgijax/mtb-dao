/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBSynchronizationUtilDAO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDTO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDAO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.utils.DataBean;
import org.jax.mgi.mtb.utils.LabelValueBean;

/**
 * A <code>MTBUtilDAO</code> which performs operations for synchronizing the MTB data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:20
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBSynchronizationUtilDAO.java,v 1.1 2007/04/30 15:47:20 mjv Exp
 */
public class MTBSynchronizationUtilDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants
    public static final String MGI_ALLELE_TYPE = "MGI_ALLELE_TYPE";
    public static final String MGI_ALLELE_ID = "MGI_ALLELE_ID";
    public static final String MGI_MARKER_TYPE = "MGI_MARKER_TYPE";
    public static final String MGI_MARKER_ID = "MGI_MARKER_ID";
    public static final String MGI_CHROMOSOME_ORGANISM = "MGI_CHROM_ORG";
    public static final String MGI_ALLELE_STATUS_DELETED = "MGI_ALLELE_STATUS_DELETED";
    private static final int MTB_MARKER_TYPE = 2;
    private static final int MTB_ALLELE_TYPE = 3;
    private static final int DELETED_ALLELE_STATUS_KEY = 847112; // see mgi's voc_term table  
    // ----------------------------------------------------- Instance Variables
    private static MTBSynchronizationUtilDAO singleton = new MTBSynchronizationUtilDAO();
    private String mgi_driver;
    private String mgi_url;
    private String mgi_user;
    private String mgi_password;
 
    private static final Logger log =
            Logger.getLogger(MTBSynchronizationUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors
    /**
     * Creates a new instance of MTBSynchronizationUtilDAO
     */
    private MTBSynchronizationUtilDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods
    /**
     * Get the MTBSynchronizationUtilDAO singleton.
     *
     * @return MTBSynchronizationUtilDAO
     */
    public static MTBSynchronizationUtilDAO getInstance() {
        return singleton;
    }

    public void setMGIUser(String user) {
        this.mgi_user = user;
    }

    public void setMGIPassword(String password) {
        this.mgi_password = password;
    }

    public void setMGIDriver(String driver) {
        this.mgi_driver = driver;
    }

    public void setMGIUrl(String url) {
        this.mgi_url = url;
    }

    public void setMGIInfo(String user, String password,
            String driver, String url) {
        setMGIUser(user);
        setMGIPassword(password);
        setMGIDriver(driver);
        setMGIUrl(url);
    }

 

    /**
     * String of markers separated by the delimiter
     * @param humanMarkers String a list of markers
     * @param comparison String 'Contains','Equals' or 'Begins'
     * @param delimiter String if humanMarkers is a list the delimiter for it
     * @return Collection<MTBOrthologyDTO> matching human markers with their mouse orthologs
     */
    public Collection<MTBOrthologyDTO> getHMOrthologies(String humanMarkers, String comparison) {

        String wildcard = "";
        String wildcard2 = "";

        if (comparison.equals("Contains")) {
            wildcard = "%";
            wildcard2 = "%";

        }
        if (comparison.equals("Begins")) {
            wildcard2 = "%";

        }
        if (comparison.equals("Ends")) {
            wildcard = "%";

        }


        StringBuffer list = new StringBuffer();
        String[] mrks = humanMarkers.split("[\t\n .,|:;]+");


        // create a comma seperated list of quoted markers with any wildcards
        // use the list to query mgi in batches of 150 or less
        // add the results to the orthos arraylist

        Collection<MTBOrthologyDTO> orthos = new ArrayList<MTBOrthologyDTO>();
        for (int i = 0; i < mrks.length; i++) {
            list.append("'");
            list.append(wildcard + mrks[i].trim() + wildcard2);
            list.append("'");
            // query MGI in batches of 100
            if ((i > 0 && (i % 100 == 0))) {
                orthos.addAll(getHMOrthologies(list.toString()));
                list.delete(0, list.length());
            } else if ((i + 1) < mrks.length) {
                list.append(", ");
            }



        }

        orthos.addAll(getHMOrthologies(list.toString()));

        return orthos;

    }

    /** 
     * Queries MGI for mouse markers based on ortholog human markers that match the 
     * strings in the list using marker name, symbol and synonym
     * @param humanMarkers single or comma separated list of human markers
     * which can contain '%' as a wildcard
     * @return Collection<MTBOrthologyDTO> matching human markers and mouse orthologs
     */
    public Collection<MTBOrthologyDTO> getHMOrthologies(String humanMarkers) {


        HashMap<String, MTBOrthologyDTO> orths = new HashMap<String, MTBOrthologyDTO>();

      StringBuffer sql = new StringBuffer();
        sql.append("Select distinct ac.accid as MGIid, ");
        sql.append("       m2.symbol as human_symbol, ");
        sql.append("       m1.symbol as mouse_symbol, ");
        sql.append("       m1.name as name, ");
        sql.append("       m1.chromosome mouse_chromosome, ");
        sql.append("       m1._marker_key as mouse_marker ");
        sql.append("From   MRK_marker m1, ");
        sql.append("       MRK_marker m2, ");
        sql.append("       MRK_ClusterMember cm1,  ");
        sql.append("       MRK_ClusterMember cm2, ");
        sql.append("       ACC_Accession ac ");
        sql.append("Where  m1._organism_key = 1 ");
        sql.append("And    m2._organism_key = 2 ");
        sql.append("And    m1._marker_key  = cm1._marker_key ");
        sql.append("And    cm1._cluster_key = cm2._cluster_key  ");
        sql.append("And    cm2._marker_key = m2._marker_key ");
        sql.append("And    m1._marker_key = ac._object_key ");
        sql.append("And    ac._MGIType_key = 2 ");
        sql.append("And    ac.private = 0 ");
        sql.append("And    ac._LogicalDB_key = 1 ");
        sql.append("And    ac.preferred = 1 ");



        if (humanMarkers.indexOf("%") == -1) {
            humanMarkers = "(" + humanMarkers + ")";
            sql.append("And   ( m2.symbol in ");
            sql.append(humanMarkers);
            sql.append("       or m2.name in ");
            sql.append(humanMarkers);
            sql.append("       or m2._marker_key in ");
            sql.append("       (Select _object_key from ");
            sql.append("              mgi_synonym ");
            sql.append("              where _mgitype_key =2 ");
            sql.append("              and synonym in ");
            sql.append(humanMarkers).append(" )");
            sql.append("        or m2._marker_key in ");   // search Entrez Gene IDs
            sql.append("        (Select _object_key from ACC_Accession ");
            sql.append("         where _logicalDB_key = 55 and accID in ");
            sql.append(humanMarkers).append(")");
            sql.append(" )");
        } else {

            // using wildcards and not searching for Entrez Gene IDs
            // can use an 'in' list with wildcards so create an 'or' clause for each marker
            String symbolClause = humanMarkers.replaceAll(",", " or m2.symbol like ");
            String nameClause = humanMarkers.replaceAll(",", " or m2.name like ");
            String synonymClause = humanMarkers.replaceAll(",", " or synonym like ");


            sql.append("And (m2.symbol like ");
            sql.append(symbolClause);
            sql.append(" or m2.name like ");
            sql.append(nameClause);
            sql.append(" or m2._marker_key in (Select _object_key from mgi_synonym where _mgitype_key = 2");
            sql.append(" and (synonym like ");
            sql.append(synonymClause);
            sql.append(" ) ) )");
        }


        Connection conMGI = null;
        Statement stmtMGI = null;
        ResultSet rsMGI = null;
        log.debug(sql.toString());

        try {

            conMGI = getMGIConnection();
            stmtMGI = conMGI.createStatement();

            rsMGI = stmtMGI.executeQuery(sql.toString());

            while (rsMGI.next()) {
                MTBOrthologyDTO dto = new MTBOrthologyDTO();
                dto.setAccID(rsMGI.getString(1));
                dto.setHumanGS(rsMGI.getString(2));
                dto.setMouseGS(rsMGI.getString(3));
                dto.setSymbol(rsMGI.getString(4));
                dto.setMgiGSKey(rsMGI.getInt(6));

                orths.put(dto.getMouseGS(), dto);

            }


        } catch (SQLException e) {
            log.error(sql.toString());
            log.error(e);

        } catch (Exception e) {
            log.error(sql.toString());
            log.error(e);

        } finally {
            close(stmtMGI, rsMGI);
            freeConnection(conMGI);

        }

        return orths.values();
    }
    // get pubmedid from MGI based on J:number

    public String getPubmedIDFromJNum(String jnum) {

        String pubmedID = null;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = getMGIConnection();

            StringBuffer query = new StringBuffer();
            query.append("select accid from ACC_Accession ").append(EOL);
            query.append(" where _object_key = (select _object_key from ").append(EOL);
            query.append(" ACC_Accession where _MGIType_key = 1 and accID='");
            query.append(jnum).append("') and _logicaldb_key = 29 ");

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());

            while (rs.next()) {
                pubmedID = rs.getString(1);
            }
        } catch (SQLException ex) {
            log.error(ex);
        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return pubmedID;

    }

    public String getReferenceKeyFromMGI(String jnum) {
        ReferenceDTO dto = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String key ="";

        try {
            conn = getMGIConnection();

            StringBuffer query = new StringBuffer();
            query.append("select r._refs_key ").append(EOL);
            query.append(" from BIB_View r ").append(EOL);
            query.append("where r.jnumID = '").append(jnum).append('\'').append(EOL);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());

            while (rs.next()) {
                
                key = rs.getString(1);
                
            }
        } catch (SQLException ex) {
            log.error(ex);
        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return key;
    }

    public AlleleDTO getAlleleFromMGI(String accid) {
        AlleleDTO dto = null;
        try {
            Connection conn = getMGIConnection();
            Connection noteConn = getMGIConnection();
            dto = getAlleleFromMGI(accid, conn, noteConn);
            closeConnection(conn);
            closeConnection(noteConn);
        } catch (Exception e) {
        }

        return dto;
    }

    /**
     * Allow for the connection to MGI to be managed by another block of code.
     * @param accid The accession id of the allele to retrieve
     * @param conn an open connection to MGI
     * @return AlleleDTO
     */
    private AlleleDTO getAlleleFromMGI(String accid, Connection conn, Connection noteConn) {
        AlleleDTO dtoAllele = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {
           
            StringBuffer query = new StringBuffer();
            query.append("select distinct al._Allele_key, al.name, al.symbol, v.term, ").append(EOL);
            query.append("        al._allele_status_key ").append(EOL);
            query.append("  from ALL_Allele al, ").append(EOL);
            query.append("       ACC_Accession ac, ").append(EOL);
            query.append("       VOC_Term v ").append(EOL);
            query.append(" where al._Allele_key = ac._Object_key ").append(EOL);
            query.append("   and al._Allele_Type_key = v._Term_key ").append(EOL);
            query.append("   and ac._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and v._Vocab_key = 38 ").append(EOL);
            query.append("   and ac.accID = '").append(accid).append('\'').append(EOL);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());


            while (rs.next()) {
                if (dtoAllele == null) {
                    dtoAllele = AlleleDAO.getInstance().createAlleleDTO();
                }

                dtoAllele.setName(rs.getString(2));
                dtoAllele.setSymbol(rs.getString(3));

                dtoAllele.setNote(this.getMGIAlleleNote(accid, noteConn));

                DataBean dtoS = dtoAllele.getDataBean();
                dtoS.put(MGI_ALLELE_TYPE, rs.getString(4));

                if (rs.getInt(5) == DELETED_ALLELE_STATUS_KEY) {
                    dtoS.put(MGI_ALLELE_STATUS_DELETED, new Boolean(true));
                } else {
                    dtoS.put(MGI_ALLELE_STATUS_DELETED, new Boolean(false));
                }
                dtoAllele.setDataBean(dtoS);
            }
        } catch (SQLException ex) {
            log.error(ex);

        } catch (Exception e) {
            log.error(e);

        } finally {
            close(stmt, rs);

        }

        return dtoAllele;
    }

    public MarkerDTO getMarkerFromMGI(String accid) {
        MarkerDTO dto = null;
        try {
            Connection conn = getMGIConnection();
            dto = getMarkerFromMGI(accid, conn);
            closeConnection(conn);

        } catch (Exception e) {
        }

        return dto;
    }

    /**
     * Allow for the connection to MGI to be managed by another block of code.
     * @param accid The accession id of the marker to retrieve
     * @param conn an open connection to MGI
     * @return MarkerDTO
     */
    private MarkerDTO getMarkerFromMGI(String accid, Connection conn) {
        MarkerDTO dtoMarker = null;

        Statement stmt = null;
        ResultSet rs = null;

        try {

            StringBuffer query = new StringBuffer();
            query.append("select m._Marker_key, m.name, m.symbol, t.name, c.chromosome, o.commonName ").append(EOL);
            query.append("  from MRK_Marker m, ").append(EOL);
            query.append("       MRK_Types t, ").append(EOL);
            query.append("       MRK_Chromosome c, ").append(EOL);
            query.append("       MGI_Organism o, ").append(EOL);
            query.append("       ACC_Accession ac ").append(EOL);
            query.append(" where m._Marker_key = ac._Object_key ").append(EOL);
            query.append("   and m._Marker_Type_key = t._Marker_Type_key ").append(EOL);
            query.append("   and m.chromosome = c.chromosome ").append(EOL);
            query.append("   and c._Organism_key = m._Organism_key ").append(EOL);
            query.append("   and m._Organism_key = o._Organism_key ").append(EOL);
            query.append("   and ac._MGIType_key = 2 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and ac.accID = '").append(accid).append('\'').append(EOL);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());

            while (rs.next()) {
                dtoMarker = MarkerDAO.getInstance().createMarkerDTO();

                dtoMarker.setName(rs.getString(2));
                dtoMarker.setSymbol(rs.getString(3));

                DataBean dtoS = dtoMarker.getDataBean();
                dtoS.put(MGI_MARKER_TYPE, rs.getString(4));
                dtoS.put(MGI_CHROMOSOME_ORGANISM, rs.getString(5) + " - " + rs.getString(6));
                dtoS.put(MGI_MARKER_ID, accid);
                dtoMarker.setDataBean(dtoS);
            }
        } catch (SQLException ex) {
            log.error(ex);

        } catch (Exception e) {

            log.error(e);

        } finally {
            close(stmt, rs);

        }

        return dtoMarker;
    }

    /**
     * Connect to MGI
     * @return Connection
     * @throws java.lang.Exception
     */
    private Connection getMGIConnection() throws Exception {

        Class.forName(mgi_driver).newInstance();
        Connection con = null;
        try {
            con = DriverManager.getConnection(mgi_url, mgi_user, mgi_password);
        } catch (Exception e) {

            log.error("Failed to connect to mgi.", e);
        }


        return con;
    }

    private void closeConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            // can'd do much connection was previously closed or never opened
        }
    }

    /**
     * Get the object key for an MGI reference from the accession ID
     * @param accession String the accession id for a MGI reference
     * @return String id the id for the reference
     */
    public String getIDForRef(String accession) {
        String sql = "select _object_key from ACC_Accession where _MGIType_key = 1 and accID=?";
        Connection conMGI = null;
        PreparedStatement pstmtMGI = null;
        ResultSet rsMGI = null;
        String id = "";
        try {

            conMGI = getMGIConnection();
            pstmtMGI = conMGI.prepareStatement(sql);
            pstmtMGI.setString(1, accession);
            rsMGI = pstmtMGI.executeQuery();
            if (rsMGI.next()) {
                id = rsMGI.getString("_object_key");
            }
        } catch (SQLException e) {
            log.error(e);
        } catch (Exception e) {
            log.error(e);
        } finally {
            close(pstmtMGI, rsMGI);
            closeConnection(conMGI);

        }
        return id;
    }

    /**
     * Based on a QTLs MGI ID query MGI for any associated Strains
     * Get any available MTB links for those strains
     * @param mgiId
     * @return
     */
    public ArrayList<LabelValueBean<String, String>> getStrainsForQTL(String accId) {

        String sql = "select aa.symbol,  ps.strain "
                + " from ACC_Accession acc, ALL_Allele aa, PRB_Strain ps"
                + " where acc.accID='" + accId + "'"
                + " and acc._MGIType_key = 2"
                + " and acc._LogicalDB_key = 1"
                + " and acc._Object_key  = aa._Marker_key"
                + " and aa._Strain_key = ps._strain_key";

        String mtbSQL = "Select s._strain_key from Strain s where s.name =? "
                + "or ( s._strain_key in "
                + " ( select _strain_key from StrainSynonyms where name=?))";


        ArrayList<LabelValueBean<String, String>> strains = new ArrayList<LabelValueBean<String, String>>();

        Connection conMGI = null;
        Statement stmtMGI = null;
        ResultSet rsMGI = null;
        ResultSet strainRs = null;

        Connection conMTB = null;
        PreparedStatement pstmt = null;

        try {

            conMGI = getMGIConnection();
            stmtMGI = conMGI.createStatement();
            rsMGI = stmtMGI.executeQuery(sql);

            conMTB = getConnection();
            pstmt = conMTB.prepareStatement(mtbSQL);

            while (rsMGI.next()) {
                String strain = rsMGI.getString(2);
                // some results may be "Not Applicable" skip them
                if (strain.indexOf("Applicable") == -1) {

                    pstmt.setString(1, strain);
                    pstmt.setString(2, strain);
                    strainRs = pstmt.executeQuery();
                    String mtbID = null;
                    if (strainRs.next()) {
                        mtbID = strainRs.getString(1);
                    }
                    strainRs.close();
                    LabelValueBean<String, String> lvb = new LabelValueBean<String, String>();
                    lvb.setLabel(strain);
                    lvb.setValue(mtbID);
                    strains.add(lvb);
                }
            }


        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmtMGI, rsMGI);
            freeConnection(conMGI);
            close(pstmt, strainRs);
            freeConnection(conMTB);
        }

        return strains;
    }
    // methods for allele and marker consistancy checks

    /**
     * For every allele in MTB with an MGI accession ID
     * retrieves the corresponding MGI allele and compares them
     * based on name, symbol and note. Any alleles that don't match 
     * are returned as pairs
     * @return ArrayList<ArrayList<AlleleDTO>> A list of pairs of non matching alleles
     */
    public ArrayList<ArrayList<AlleleDTO>> getAllelesToSync() {

        ArrayList<ArrayList<AlleleDTO>> dtos = new ArrayList<ArrayList<AlleleDTO>>();


        try {

            Connection mtbConn = getConnection();
            Connection mgiConn = getMGIConnection();
            Connection noteConn = getMGIConnection();

            AlleleDAO aDAO = AlleleDAO.getInstance();


            String sql = "Select a.numericPart mgiId, a._object_Key mtbKey,"
                    + " al.name,al.note,al.symbol "
                    + " FROM Accession a, Allele al "
                    + " WHERE _mtbtypes_key = ? "
                    + " and a._object_key = al._allele_key";
            PreparedStatement ps = mtbConn.prepareStatement(sql);
            ps.setInt(1, MTB_ALLELE_TYPE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AlleleDTO mtbDTO = aDAO.createAlleleDTO();
                long mgiId = rs.getLong(1);
                long mtbKey = rs.getLong(2);
                mtbDTO.setAlleleKey(mtbKey);
                mtbDTO.setName(rs.getString(3));
                mtbDTO.setNote(rs.getString(4));
                mtbDTO.setSymbol(rs.getString(5));

                AlleleDTO mgiDTO = this.getAlleleFromMGI("MGI:" + mgiId, mgiConn, noteConn);
                if (mgiDTO == null && mgiId > 1) {
                    mgiDTO = aDAO.createAlleleDTO();
                    mgiDTO.setName("");
                    mgiDTO.setNote("!!!!\nMTB Allele key:" + mtbKey
                            + " has accId MGI:" + mgiId + " \nWhich does not exist in MGI.\n!!!!");
                    mgiDTO.setSymbol("");
                    DataBean dBean = mgiDTO.getDataBean();
                    dBean.put(MGI_ALLELE_STATUS_DELETED, new Boolean(false));
                }
                if (mgiDTO != null) {

                    mgiDTO.getDataBean().put(MGI_ALLELE_ID, "MGI:" + mgiId);

                    if (compareAlleles(mtbDTO, mgiDTO) != 0
                            || (((Boolean) mgiDTO.getDataBean().get(MGI_ALLELE_STATUS_DELETED)).booleanValue() == true)) {
                        ArrayList<AlleleDTO> pair = new ArrayList<AlleleDTO>(2);
                        pair.add(mgiDTO);
                        pair.add(mtbDTO);
                        dtos.add(pair);
                    }
                }


            }
            rs.close();
            ps.close();

            freeConnection(mtbConn);
            closeConnection(mgiConn);
            closeConnection(noteConn);
        } catch (Exception e) {
            log.error(e);
        }

        return dtos;

    }

    /**
     * For every marker in MTB with an MGI accession ID
     * retrieves the corresponding MGI marker and compares them
     * based on name and symbol. Any markers that don't match 
     * are returned as pairs
     * @return ArrayList<ArrayList<MarkerDTO>> A list of pairs of non matching Markers
     */
    public ArrayList<ArrayList<MarkerDTO>> getMarkersToSync() {

        ArrayList<ArrayList<MarkerDTO>> dtos = new ArrayList<ArrayList<MarkerDTO>>();

        try {

            Connection mtbConn = getConnection();
            Connection mgiConn = getMGIConnection();
            MarkerDAO mDAO = MarkerDAO.getInstance();



            String sql = "Select a.numericPart mgiId, a._object_Key mtbKey,"
                    + " mk.name, mk.symbol from Accession a, "
                    + " Marker mk where _mtbtypes_key = ? "
                    + " and a._object_key = mk._marker_key "
                    + " and a._siteinfo_key = 1"; // only look for MGI ids
            PreparedStatement ps = mtbConn.prepareStatement(sql);
            ps.setInt(1, MTB_MARKER_TYPE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MarkerDTO aDTO = mDAO.createMarkerDTO();
                long mgiId = rs.getLong(1);
                long mtbKey = rs.getLong(2);
                aDTO.setMarkerKey(mtbKey);
                aDTO.setName(rs.getString(3));
                aDTO.setSymbol(rs.getString(4));

                MarkerDTO bDTO = getMarkerFromMGI("MGI:" + mgiId, mgiConn);
                if (bDTO == null && mgiId > 0) {
                    bDTO = mDAO.createMarkerDTO();
                    bDTO.setName("Marker Key " + mtbKey
                            + " has accid MGI:" + mgiId + " which is not in MGI");
                }
                if (bDTO != null) {

                    if (compareMarkers(aDTO, bDTO) != 0) {
                        ArrayList<MarkerDTO> pair = new ArrayList<MarkerDTO>(2);
                        pair.add(bDTO);
                        pair.add(aDTO);
                        dtos.add(pair);
                    }

                }
            }

            rs.close();
            ps.close();

            freeConnection(mtbConn);
            closeConnection(mgiConn);
        } catch (Exception e) {
            log.error(e);
        }

        return dtos;

    }

    /**
     * Gets the entire note (N note chunks) for a given Allele
     * @param String accID the MGI accession id for the allele
     * @return String note the complete note for the allele
     */
    private String getMGIAlleleNote(String accID, Connection conn) {
        StringBuffer note = new StringBuffer();
        Statement stmt = null;
        ResultSet rs = null;

        try {

            StringBuffer query = new StringBuffer();
            query.append("select nc.note ").append(EOL);
            query.append("  from ALL_Allele al left join (MGI_Note n left join MGI_NoteChunk nc on (n._Note_key = nc._Note_key)) ");
            query.append(" on (al._Allele_key = n._Object_key), ").append(EOL);
            query.append("       ACC_Accession ac ").append(EOL);
            query.append(" where al._Allele_key = ac._Object_key ").append(EOL);
            query.append("   and n._NoteType_key = 1021 ").append(EOL);
            query.append("   and n._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and ac.accID = '").append(accID).append('\'').append(EOL);
            query.append("   order by nc.sequenceNum ").append(EOL);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());

            String chunk;
            while (rs.next()) {
                chunk = rs.getString(1);
                if (chunk.trim().length() < 255) {
                    // chunks that end w/ trailing spaces have them removed
                    // if a chunk is less than 255 chars it may have a missing space
                    note.append(chunk).append(" ");
                } else {
                    note.append(chunk);
                }
            }
        } catch (SQLException ex) {
            log.error(ex);
        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);

        }
        if (note.length() == 0) {
            return null;
        }
        return note.toString().trim();
    }
    private static final String FEATURE_DAG = "select distinct "
            + " 'head' as parent, 0 as _Parent_key, t.term as child, p._Label_key, "
            + " cc.markerCount, p._Object_key as _Term_key, 1 as sequenceNum "
            + "from DAG_Closure c, VOC_Term t, MRK_MCV_Count_Cache cc, DAG_Node p, DAG_Edge d "
            + "where c._DAG_key = 9 "
            + "and not exists (select 1 from DAG_Closure c2 "
            + " where c2._DAG_key = 9 "
            + " and c2._Descendent_key = c._Ancestor_key) "
            + "and c._AncestorObject_key = t._Term_key "
            + "and c._AncestorObject_key = cc._MCVTerm_key "
            + "and c._Ancestor_key = d._Parent_key "
            + "and c._Ancestor_key = p._Node_key "
            + "UNION "
            + "select distinct pt.term as parent, d._Parent_key, ct.term as child, "
            + " c._Label_key, cc.markerCount, ct._Term_key, d.sequenceNum "
            + "from DAG_Edge d, DAG_Node p, DAG_Node c, VOC_Term pt, VOC_Term ct, "
            + " MRK_MCV_Count_Cache pc, MRK_MCV_Count_Cache cc "
            + "where d._DAG_key = 9 "
            + "and d._Parent_key = p._Node_key "
            + "and p._Object_key = pt._Term_key "
            + "and p._Object_key = pc._MCVTerm_key "
            + "and d._Child_key = c._Node_key "
            + "and c._Object_key = ct._Term_key "
            + "and c._Object_key = cc._MCVTerm_key "
            + "order by _Parent_key, sequenceNum";

    /**
     * Queries MGD for FeatureType terms
     * Builds a JSON string to create a tree of EXT checkbox definitions
     * @return String JSON for Feature Types
     */
    public String getFeatureTypeJSON() {
        String json = "";

        StringBuffer note = new StringBuffer();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = getMGIConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(FEATURE_DAG);


            LinkedHashMap items = new LinkedHashMap();
            String parent = "";
            HashMap<String, String> children;

            String data;

            while (rs.next()) {


                parent = rs.getString(1);

                if (parent != null && !"".equals(parent)) {
                    if (items.containsKey(parent)) {
                        children = (HashMap<String, String>) items.get(parent);
                    } else {
                        children = new HashMap<String, String>();
                        items.put(parent, children);
                    }

                    data = "{text:'" + rs.getString(3) + "',checked:false, iconCls:'no-icon',id:'" + rs.getString(6) + "'";

                    children.put(rs.getString(7), data);
                }
            }
            close(stmt, rs);
            closeConnection(conn);

            children = (HashMap<String, String>) items.get("head");
            json = "[" + buildJson(json, children, items);

            // remove a trailing '}\n'
            json = json.substring(0, json.length() - 2);

        } catch (Exception e) {
            log.error(e);
        }


        return json;
    }

    private String buildJson(String json, HashMap<String, String> children, LinkedHashMap items) {

        for (int i = 1; i <= children.size(); i++) {
            String data = children.get(i + "");
            String term = data.substring(7, data.indexOf("'", 8));
            json = json + data;
            HashMap<String, String> gChildren = (HashMap<String, String>) items.get(term);
            if (gChildren != null) {
                json = json + ",leaf:false,children:[";
                json = buildJson(json, gChildren, items);
            } else {
                json = json + ",leaf:true}";
            }
            if (i < (children.size())) {
                json = json + ",\n";
            } else {
                json = json + "]}\n";
            }
        }

        return json;

    }

    /**
     * Converts mgi superscript notation to mtb (html)
     * superscript notation used by allele symbols
     **/
    public static String fixSymbol(String symbol) {

        if (symbol != null) {
            symbol = symbol.replace("<", "<sup");

            symbol = symbol.replace(">", "</sup>");

            symbol = symbol.replace("<sup", "<sup>");
        }

        return symbol;
    }

    /**
     * Compare two marker dtos by name and symbol
     * @param dto1
     * @param dto2
     * @return int 0 if they match -1 if they don't
     */
    public static int compareMarkers(MarkerDTO dto1, MarkerDTO dto2) {
        try {

            if (!dto1.getName().equals(dto2.getName())) {
                return -1;
            }
            if (!dto1.getSymbol().equals(dto2.getSymbol())) {
                return -1;
            }
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * Compare two allele dtos by name, symbol and note
     * Converts mgi superscript notation to mtb (html) superscript for symbols
     * @param dto1
     * @param dto2
     * @return int 0 if alleles match -1 if they don't
     */
    public static int compareAlleles(AlleleDTO dto1, AlleleDTO dto2) {
        try {
            String symbol = fixSymbol(dto2.getSymbol());

            if (!dto1.getName().equals(dto2.getName())) {
                return -1;
            }
            if (!dto1.getSymbol().equals(symbol)) {
                return -1;
            }
            if (dto2.getNote() == null || dto2.getNote().trim().length() == 0 || dto2.getNote().trim().equalsIgnoreCase("null")) {
                return 0;
            }
            if (!dto1.getNote().trim().equals(dto2.getNote().trim())) {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    
}
