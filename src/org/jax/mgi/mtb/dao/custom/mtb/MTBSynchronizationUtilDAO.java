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
import java.util.Collections;
import java.util.HashMap;
import org.apache.logging.log4j.Logger;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDTO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDAO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDTO;
import org.jax.mgi.mtb.dao.gen.mtb.ReferenceDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.utils.DataBean;

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
            org.apache.logging.log4j.LogManager.getLogger(MTBSynchronizationUtilDAO.class.getName());

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
        String markerKey = "";

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

                markerKey = rs.getString(1);
                
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
        ArrayList<String> synonyms = new ArrayList<>();
        // get synonyms
        try {

            StringBuffer query = new StringBuffer();
            query.append("SELECT distinct ml.label ");
            query.append("FROM MRK_Label ml, MRK_Marker mm ");
            query.append("WHERE ml._orthologorganism_key is null ");
            query.append("AND ml._organism_key = 1 ");
            query.append("AND ml.labeltype = 'MY' ");
            query.append("AND ml._marker_key = mm._marker_key ");
            query.append("AND mm._marker_status_key != 2 ");
            query.append("AND ml._marker_key = ");
            query.append(markerKey);
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());

            
            while (rs.next()) {
                synonyms.add(rs.getString(1));
                
                
            }
            Collections.sort(synonyms);
        } catch (SQLException ex) {
            log.error(ex);

        } catch (Exception e) {

            log.error(e);

        } finally {
            close(stmt, rs);

        }
        if(dtoMarker != null){
            dtoMarker.getDataBean().put("synonyms",synonyms);
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

   
    
    // methods for allele and marker consistancy checks

    /**
     * For every allele in MTB with an MGI accession ID
     * retrieves the corresponding MGI allele and compares them
     * based on name, symbol and note. Any alleles that don't match 
     * are returned as pairs
     * @return ArrayList<ArrayList<AlleleDTO>> A list of pairs of non matching alleles
     */
    public ArrayList<ArrayList<AlleleDTO>> getAllelesToSync() {

        ArrayList<ArrayList<AlleleDTO>> dtos = new ArrayList<>();

        HashMap<Long,AlleleDTO> alleles = new HashMap<>();
        StringBuilder mgiIDs = new StringBuilder();
        try {
            Connection mtbConn = getConnection();
           
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

                alleles.put(mgiId,mtbDTO);
                if(mgiIDs.length() ==0){
                    mgiIDs.append("(").append(mgiId).append(")");
                }else{
                    mgiIDs.append(",(").append(mgiId).append(")");
                }
            }
            
            
            HashMap<Long,AlleleDTO> mgiAlleles = this.getMGIAlleles(mgiIDs.toString());
            
            for(Long mgiId : alleles.keySet()){
                AlleleDTO mtbDTO = alleles.get(mgiId);
                AlleleDTO mgiDTO = mgiAlleles.get(mgiId);
            
                if (mgiDTO == null && ( !mtbDTO.getName().toLowerCase().contains("trans"))
                        && !mtbDTO.getName().toLowerCase().contains("targeted mutation")) {
                    mgiDTO = aDAO.createAlleleDTO();
                    mgiDTO.setName("");
                    mgiDTO.setNote("!!!!\nMTB Allele key:" + mtbDTO.getAlleleKey()
                            + " has accId MGI:" + mgiId + " \nWhich does not exist in the public MGI.\n!!!!");
                    mgiDTO.setSymbol("");
                    DataBean dBean = mgiDTO.getDataBean();
                    dBean.put(MGI_ALLELE_STATUS_DELETED, false);
                    
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
          
        } catch (Exception e) {
            log.error(e);
        }
        return dtos;
    }

    /**
     * For every marker in MTB with an MGI accession ID
     * check the corresponding MGI marker, compare them
     * based on name and symbol and labels/synonyms. Any markers that don't match 
     * are returned as pairs
     * @return ArrayList<ArrayList<MarkerDTO>> A list of pairs of non matching Markers
     */
    public ArrayList<ArrayList<MarkerDTO>> getMarkersToSync() {

        ArrayList<ArrayList<MarkerDTO>> dtos = new ArrayList<ArrayList<MarkerDTO>>();
        HashMap<String,MarkerDTO> mgiMarkers = new HashMap<>();
        HashMap<String,MarkerDTO> mtbMarkers = new HashMap<>();
        MarkerDAO mDAO = null;
        try {

            Connection mtbConn = getConnection();
            Connection mgiConn = getMGIConnection();
            mDAO = MarkerDAO.getInstance();
            
           

            String sql = "Select a.numericPart mgiId, a._object_Key mtbKey,"
                    + " mk.name, mk.symbol,ml.label from Accession a, "
                    + " Marker mk left join  Markerlabel ml on ( "
                    + " ml._marker_key = mk._Marker_key"
                    + " and ml._labeltype_key = 'MY' )"
                    +"  where _mtbtypes_key = ? "
                    + " and a._object_key = mk._marker_key "
                    + " and a._siteinfo_key = 1" // only look for MGI ids
                   
                    + " order by mk._Marker_key";
            PreparedStatement ps = mtbConn.prepareStatement(sql);
            ps.setInt(1, MTB_MARKER_TYPE);
            ResultSet rs = ps.executeQuery();
            
            long mtbKey = 0;
            long mgiKey = 0;
            MarkerDTO aDTO = null;
            ArrayList<String> mgiKeys = new ArrayList<>();
            
           
            while (rs.next()) {
                
                if(mtbKey != rs.getLong(2)){
                    if(aDTO != null){
                        Collections.sort((ArrayList<String>)aDTO.getDataBean().get("synonyms"));
                        mtbMarkers.put("MGI:"+mgiKey, aDTO);
                    }
                    
                    // create a new marker object
                    aDTO = mDAO.createMarkerDTO();
                    mgiKey = rs.getLong(1);
                    mtbKey = rs.getLong(2);
                    aDTO.setMarkerKey(mtbKey);
                    aDTO.setName(rs.getString(3));
                    aDTO.setSymbol(rs.getString(4));
                    DataBean bean = new DataBean();
                    ArrayList<String> synonyms = new ArrayList<>();
               
                    if(rs.getString(5) != null){
                        synonyms.add(rs.getString(5));
                    }
                    bean.put("synonyms", synonyms);
                    bean.put(MGI_MARKER_ID, "MGI:"+mgiKey);
                    aDTO.setDataBean(bean);
                    
                }else{
                    // we are iterating over multiple synonyms for the same marker
                    ((ArrayList<String>)aDTO.getDataBean().get("synonyms")).add(rs.getString(5));
                }
                
            }
             mtbMarkers.put("MGI:"+mgiKey, aDTO);
           
            StringBuilder keyList = new StringBuilder();
            for(String key : mtbMarkers.keySet()){
                
                if(keyList.length()==0){
                    keyList.append("('").append(key).append("')");
                }else{
                    keyList.append(",('").append(key).append("')");
                }
                
                
            }
            mgiKeys.add(keyList.toString());
            
           mgiMarkers = getMGIMarkers(mgiKeys,mgiConn);
            
            

            rs.close();
            ps.close();

            freeConnection(mtbConn);
            closeConnection(mgiConn);
        } catch (Exception e) {
            log.error(e);
        }
        
        
        
        for(String mgiKey : mtbMarkers.keySet()){
            
            MarkerDTO aDTO = mtbMarkers.get(mgiKey);
                // we have all the data for the previous marker
                MarkerDTO bDTO = mgiMarkers.get(mgiKey);
                
                if (bDTO == null) {
                    bDTO = mDAO.createMarkerDTO();
                    bDTO.setName("Marker Key " + aDTO.getMarkerKey()
                            + " has accid " + mgiKey + " which is not in MGI");
                }


                if (bDTO != null) {
                    
                    if (compareMarkers(aDTO, bDTO) != 0) {
                        ArrayList<MarkerDTO> pair = new ArrayList<MarkerDTO>(2);
                        Collections.sort(((ArrayList<String>)aDTO.getDataBean().get("synonyms")));
                        pair.add(bDTO);
                        pair.add(aDTO);
                        dtos.add(pair);
                    }
                }
            
        
        }

        return dtos;

    }
    
    private HashMap<String,MarkerDTO> getMGIMarkers(ArrayList<String> markerKeys,Connection conn){
        HashMap<String,MarkerDTO> mgiMarkers = new HashMap<>();
        

        Statement stmt = null;
        ResultSet rs = null;
       

        try {
            
             stmt = conn.createStatement();
             stmt.addBatch("create temporary table marker_keys (key text)");
             for(String keyList: markerKeys){
             stmt.addBatch("insert into marker_keys values "+keyList+"");
             }
             stmt.executeBatch();
            

            StringBuffer query = new StringBuffer();
            query.append("select m._Marker_key, m.name, m.symbol, t.name, c.chromosome, o.commonName, ac.accID, ml.label ").append(EOL);
            query.append("  from MRK_Marker m left join MRK_Label ml on ").append(EOL);
            query.append(" ( ml._marker_key = m._marker_key").append(EOL);
            query.append("   and ml._orthologorganism_key is null").append(EOL);
            query.append("   and ml._organism_key = 1 ").append(EOL);
            query.append("   and ml.labeltype = 'MY'),  ").append(EOL);
            query.append("       MRK_Types t, ").append(EOL);
            query.append("       MRK_Chromosome c, ").append(EOL);
            query.append("       MGI_Organism o, ").append(EOL);
            query.append("       ACC_Accession ac, ").append(EOL);
            query.append("       marker_keys mk ").append(EOL);
            query.append(" where m._Marker_key = ac._Object_key ").append(EOL);
            query.append("   and m._Marker_Type_key = t._Marker_Type_key ").append(EOL);
            query.append("   and m.chromosome = c.chromosome ").append(EOL);
            query.append("   and c._Organism_key = m._Organism_key ").append(EOL);
            query.append("   and m._Organism_key = o._Organism_key ").append(EOL);
            query.append("   and ac._MGIType_key = 2 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and ac.accid like 'MGI:%' ").append(EOL);
            query.append("   and ac.accid = mk.key order by m._marker_key ").append(EOL);
           

            stmt = conn.createStatement();
            rs = stmt.executeQuery(query.toString());
            
            String markerKey = null;
            MarkerDTO dtoMarker = null;
           
            while (rs.next()) {
                
                if(!rs.getString(7).equals(markerKey)){
                   
                    if(dtoMarker != null){
                       Collections.sort((ArrayList<String>)dtoMarker.getDataBean().get("synonyms"));
                        mgiMarkers.put(markerKey, dtoMarker);
                    }
                    
                    
                    dtoMarker = MarkerDAO.getInstance().createMarkerDTO();
                    ArrayList<String> synonyms = new ArrayList<>();
                    
                    markerKey = rs.getString(7);

                    dtoMarker.setName(rs.getString(2));
                    dtoMarker.setSymbol(rs.getString(3));

                    DataBean dtoS = dtoMarker.getDataBean();
                    dtoS.put(MGI_MARKER_TYPE, rs.getString(4));
                    dtoS.put(MGI_CHROMOSOME_ORGANISM, rs.getString(5) + " - " + rs.getString(6));
                    dtoS.put(MGI_MARKER_ID, rs.getString(7));
                    dtoMarker.setDataBean(dtoS);
                    if(rs.getString(8) != null){
                        synonyms.add(rs.getString(8));
                    }
                    dtoMarker.getDataBean().put("synonyms", synonyms);
                    

                }else{
                    ((ArrayList<String>)dtoMarker.getDataBean().get("synonyms")).add(rs.getString(8));
                }
                
                
            }
            
             mgiMarkers.put(markerKey, dtoMarker);
            
        } catch (SQLException ex) {
            log.error(ex);

        } catch (Exception e) {

            log.error(e);

        } finally {
            close(stmt, rs);

        }
       
       
        
        
    
        return mgiMarkers;
    }
    
    // labels are updated when synching
    // update lables for name,symbol and synonyms
    public boolean updateMarkerLabels(MarkerDTO mDTO){
        //quick and easy remove all MS,MN, MY lables and replace with whats in DTO
        // this looses all create, update info, but who cares?
        Boolean success = false;
        
        Connection mtbConn = null;
        PreparedStatement ps = null;
        
        Long mKey = mDTO.getMarkerKey();
        String mName = mDTO.getName();
        String mSymbol = mDTO.getSymbol();
        String user = mDTO.getUpdateUser();
        
        ArrayList<String> synonyms = (ArrayList<String>)mDTO.getDataBean().get("synonyms");
        try{
            mtbConn = getConnection();
            
            mtbConn.setAutoCommit(false);

            String sql = "Delete from markerlabel where _labeltype_key in ('MS','MN','MY') and _marker_key = ?";
            ps = mtbConn.prepareStatement(sql);
            ps.setLong(1, mKey);
            ps.executeUpdate();
            
            sql = "select max(_markerlabel_key) from markerlabel";
            ps = mtbConn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Long markerLabelKey = -1L;
            int labelStatusKey = 1;
            while(rs.next()){
                markerLabelKey = rs.getLong(1)+1; 

            }
            rs.close();
            
            sql = "insert into markerlabel(_markerlabel_key,_marker_key,_labeltype_key, label,_labelstatus_key, create_user, create_date, update_user, update_date)"+
                  " values(?,?,?,?,?,?,now(),?,now())";
            ps = mtbConn.prepareStatement(sql);
            ps.setLong(1,markerLabelKey++);
            ps.setLong(2,mKey);
            ps.setString(3,"MN");
            ps.setString(4,mName);
            ps.setInt(5,labelStatusKey);
            ps.setString(6,user);
            ps.setString(7,user);
            ps.execute();
            
            ps.clearParameters();
            ps.setLong(1,markerLabelKey++);
            ps.setLong(2,mKey);
            ps.setString(3,"MS");
            ps.setString(4,mSymbol);
            ps.setInt(5,labelStatusKey);
            ps.setString(6,user);
            ps.setString(7,user);
            ps.execute();
            
            for(String synonym : synonyms){
            
                ps.clearParameters();
                ps.setLong(1,markerLabelKey++);
                ps.setLong(2,mKey);
                ps.setString(3,"MY");
                ps.setString(4,synonym);
                ps.setInt(5,labelStatusKey);
                ps.setString(6,user);
                ps.setString(7,user);
                ps.execute();
            
            }
            
            
            mtbConn.commit();
            ps.close();
            mtbConn.close();
            success = true;
        }catch(Exception e){
            
            log.error("Cant create labels for marker key "+mKey,e);
        
            try{
                mtbConn.rollback();
                ps.close();
                mtbConn.close();
            }catch(Exception f){
                log.error(f);
            }
        }
        return success;

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
            query.append("select n.note ").append(EOL);
            query.append("  from ALL_Allele al left join MGI_Note n  ");
            query.append(" on (al._Allele_key = n._Object_key), ").append(EOL);
            query.append("       ACC_Accession ac ").append(EOL);
            query.append(" where al._Allele_key = ac._Object_key ").append(EOL);
            query.append("   and n._NoteType_key = 1021 ").append(EOL);
            query.append("   and n._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and ac.accID = '").append(accID).append('\'').append(EOL);
          

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
    
     private HashMap<Long,AlleleDTO> getMGIAlleles(String ids) {
        
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        
        HashMap<Long,AlleleDTO> alleles = new HashMap<>();
        HashMap<Long,String> notes = new HashMap<>();
        try {
            conn = getMGIConnection();
            
            stmt = conn.createStatement();
            stmt.addBatch("create temporary table allele_ids (id integer)");
            stmt.addBatch("insert into allele_ids values "+ids);
            stmt.addBatch("create index on allele_ids (id)");
            
            stmt.executeBatch();
            
            StringBuilder query = new StringBuilder();
            query.append("select al._allele_key, n.note ").append(EOL);
            query.append("  from ALL_Allele al left join MGI_Note n  ");
            query.append(" on (al._Allele_key = n._Object_key), ").append(EOL);
            query.append("       ACC_Accession ac, allele_ids ").append(EOL);
            query.append(" where al._Allele_key = ac._Object_key ").append(EOL);
            query.append("   and n._NoteType_key = 1021 ").append(EOL);
            query.append("   and n._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and ac.numericpart = allele_ids.id ").append(EOL);
           

            rs = stmt.executeQuery(query.toString());

            
            while (rs.next()) {
                
                    long key = rs.getLong(1);
                    String note = rs.getString(2);
                    notes.put(key,note.toString());
            }
            
            
            
            query = new StringBuilder();
            
            query.append("select distinct al._Allele_key, al.name, al.symbol, v.term, ").append(EOL);
            query.append("        al._allele_status_key, ac.numericpart ").append(EOL);
            query.append("  from ALL_Allele al, ").append(EOL);
            query.append("       ACC_Accession ac, ").append(EOL);
            query.append("       VOC_Term v, allele_ids ").append(EOL);
            query.append(" where al._Allele_key = ac._Object_key ").append(EOL);
            query.append("   and al._Allele_Type_key = v._Term_key ").append(EOL);
            query.append("   and ac._MGIType_key = 11 ").append(EOL);
            query.append("   and ac._LogicalDB_key = 1 ").append(EOL);
            query.append("   and ac.private = 0 ").append(EOL);
            query.append("   and v._Vocab_key = 38 ").append(EOL);
            query.append("   and ac.numericpart = allele_ids.id" ).append(EOL);

            
            rs = stmt.executeQuery(query.toString());


            while (rs.next()) {
               
                AlleleDTO dtoAllele = AlleleDAO.getInstance().createAlleleDTO();
                long key = rs.getLong(1);

                dtoAllele.setName(rs.getString(2));
                dtoAllele.setSymbol(rs.getString(3));

                if(notes.get(key) != null){
                    dtoAllele.setNote(notes.get(key));
                }
                DataBean dtoS = dtoAllele.getDataBean();
                dtoS.put(MGI_ALLELE_TYPE, rs.getString(4));

                if (rs.getInt(5) == DELETED_ALLELE_STATUS_KEY) {
                    dtoS.put(MGI_ALLELE_STATUS_DELETED, true);
                } else {
                    dtoS.put(MGI_ALLELE_STATUS_DELETED, false);
                }
                dtoAllele.setDataBean(dtoS);
                
                alleles.put(rs.getLong(6),dtoAllele);
                
            }
            
         
            rs.close();
            stmt.clearBatch();
            conn.close();
        } catch (SQLException ex) {
            log.error(ex);
        } catch (Exception e) {
            log.error(e);
        } finally {
            close(stmt, rs);

        }
        return alleles;
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
     * for now this is only used once where dto2 is mgi
     */
    public static int compareMarkers(MarkerDTO dto1, MarkerDTO dto2) {
        try {

            if (!dto1.getName().equals(dto2.getName())) {
                return -1;
            }
            if (!dto1.getSymbol().equals(dto2.getSymbol())) {
                return -1;
            }
            ArrayList<String> synonyms1 = (ArrayList<String>)dto1.getDataBean().get("synonyms");
            
            ArrayList<String> synonyms2 = (ArrayList<String>)dto2.getDataBean().get("synonyms");
            
            // dto1 is mtb dto2 is mgi
            // don't worry about cases where mtb has all and more synonyms than mgi
            if(synonyms1.size() >= synonyms2.size()){
                for(int i = 0; i < synonyms2.size(); i++){
                    if(!synonyms1.contains(synonyms2.get(i))){
                        return -1;
                    }
                }
                return 0;
            }else{
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
