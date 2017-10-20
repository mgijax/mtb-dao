/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.utils.DAOUtils;

/**
 * Manages PDX data in MTB for models' additional content Also Expression and
 * CNV data imported via the web services for performance
 *
 * @author sbn
 */
public class PDXDAO {

    private static final Logger log
            = Logger.getLogger(PDXDAO.class.getName());
    private static PDXDAO singleton = null;
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    // these genes were identified by Anuj as having expression mildly affected by the way build 38 is handled
    // this needs to be indicated in the epxression chart
    private static final String[] BUILD_38_AFFECTED_GENES = {"AKT3", "APOBEC3A", "B2M", "DAXX", "EHMT2", "EPHB6", "HLA-A", "HRAS", "ID3", "KCNQ2", "MUC4", "NOTCH4", "PIWIL1", "PTEN", "PTPRD", "RASA3", "SMARCB1"};

    private static final HashMap<String, String> AFFECTED_GENES = new HashMap<>();

    private PDXDAO() {

        for (String g : BUILD_38_AFFECTED_GENES) {
            AFFECTED_GENES.put(g, g);
        }

    }

    public void setConnectionInfo(String driver, String url, String pwd, String user) {
        this.driver = driver;
        this.url = url;
        this.password = pwd;
        this.user = user;

    }

    private Connection getConnection() {

        Connection con = null;
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {

            log.error("Failed to connect to mtb db for pdx.", e);
        }

        return con;
    }

    public static PDXDAO getInstance() {
        if (singleton == null) {
            singleton = new PDXDAO();
        }
        return singleton;
    }

    public void addComment(PDXComment comment) throws SQLException {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("insert into pdxcomment "
                    + "(modelid,_pdxcharacterization_key, comment, create_user, update_user, "
                    + "create_date, update_date) values (?,?,?,?,?, now(),now())");
            s.setString(1, comment.getModelID());
            s.setInt(2, comment.getCharacterization());
            s.setString(3, comment.getComment());
            s.setString(4, comment.getUser());
            s.setString(5, comment.getUser());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void updateComment(PDXComment comment) throws SQLException {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("update pdxcomment "
                    + "set comment = ?, update_user = ?, update_date = now() where _pdxcomment_key =?");

            s.setString(1, comment.getComment());
            s.setString(2, comment.getUser());
            s.setInt(3, comment.getContentKey());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void addDocument(PDXDocument document) throws SQLException {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("insert into pdxdocument "
                    + "(modelid, _pdxcharacterization_key, description, linktext, filename, "
                    + "create_user, update_user, create_date, update_date) values (?,?,?,?,?,?,?, now(),now())");
            s.setString(1, document.getModelID());
            s.setInt(2, document.getCharacterization());
            s.setString(3, document.getDescription());
            s.setString(4, document.getLinkText());
            s.setString(5, document.getFileName());
            s.setString(6, document.getUser());
            s.setString(7, document.getUser());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void updateDocument(PDXDocument document) throws SQLException {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("update pdxdocument "
                    + "set description = ?, linktext= ? "
                    + " update_user =?, update_date = now()) where _pdxdocument_key =?");
            s.setString(1, document.getDescription());
            s.setString(2, document.getLinkText());
            s.setString(3, document.getUser());
            s.setInt(4, document.getContentKey());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void addGraphic(PDXGraphic graphic) throws SQLException {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("insert into pdxgraphic "
                    + "(modelid, _pdxcharacterization_key, description, sortorder, filename, "
                    + "create_user, update_user, create_date, update_date) values (?,?,?,?,?,?,?, now(),now())");
            s.setString(1, graphic.getModelID());
            s.setInt(2, graphic.getCharacterization());
            s.setString(3, graphic.getDescription());
            s.setDouble(4, graphic.getSortOrder());
            s.setString(5, graphic.getFileName());
            s.setString(6, graphic.getUser());
            s.setString(7, graphic.getUser());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void updateGraphic(PDXGraphic graphic) throws SQLException {

        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("update pdxgraphic "
                    + "set description =?, sortorder=?, update_user =?, update_date = now()  "
                    + " where _pdxgraphic_key = ?");
            s.setString(1, graphic.getDescription());
            s.setDouble(2, graphic.getSortOrder());
            s.setString(3, graphic.getUser());
            s.setInt(4, graphic.getContentKey());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void addLink(PDXLink link) throws SQLException {

        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("insert into pdxlink "
                    + "(modelid, _pdxcharacterization_key, description, url, linktext, "
                    + "create_user, update_user, create_date, update_date) values (?,?,?,?,?,?,?, now(),now())");
            s.setString(1, link.getModelID());
            s.setInt(2, link.getCharacterization());
            s.setString(3, link.getDescription());
            s.setString(4, link.getUrl());
            s.setString(5, link.getLinkText());
            s.setString(6, link.getUser());
            s.setString(7, link.getUser());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void updateLink(PDXLink link) throws SQLException {

        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("update pdxlink "
                    + "set description =?, url =? , linktext =?, "
                    + "update_user =?, update_date = now() where _pdxlink_key  =?");
            s.setString(1, link.getDescription());
            s.setString(2, link.getUrl());
            s.setString(3, link.getLinkText());
            s.setString(4, link.getUser());
            s.setInt(5, link.getContentKey());
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
            throw e;
        }
    }

    public void deleteComment(int key) {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("delete from pdxcomment where _pdxcomment_key = ?");
            s.setInt(1, key);
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
        }
    }

    public void deleteDocument(int key) {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("delete from pdxDocument where _pdxdocument_key = ?");
            s.setInt(1, key);
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
        }
    }

    public void deleteGraphic(int key) {
        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("delete from pdxgraphic where _pdxgraphic_key = ?");
            s.setInt(1, key);
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
        }

    }

    public void deleteLink(int key) {

        try {
            Connection con = getConnection();
            PreparedStatement s = con.prepareStatement("delete from pdxlink where _pdxlink_key = ?");
            s.setInt(1, key);
            s.executeUpdate();
            s.close();
            con.close();
        } catch (SQLException e) {
            log.error(e);
        }
    }

    public ArrayList<PDXComment> getComments(String id) {
        ArrayList<PDXComment> comments = new ArrayList<PDXComment>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxcomment_key, _pdxcharacterization_key, comment from pdxcomment where modelid = ?");
            s.setString(1, id);
            rs = s.executeQuery();
            while (rs.next()) {
                PDXComment comment = new PDXComment();
                comment.setContentKey(rs.getInt(1));
                comment.setCharacterization(rs.getInt(2));
                comment.setComment(rs.getString(3));
                comment.setModelID(id);
                comments.add(comment);
            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return comments;
    }

    public ArrayList<PDXDocument> getDocuments(String id) {
        ArrayList<PDXDocument> documents = new ArrayList<PDXDocument>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxdocument_key, _pdxcharacterization_key, description, linktext, filename from pdxdocument where modelid = ?");
            s.setString(1, id);
            rs = s.executeQuery();
            while (rs.next()) {
                PDXDocument doc = new PDXDocument();
                doc.setContentKey(rs.getInt(1));
                doc.setCharacterization(rs.getInt(2));
                doc.setDescription(rs.getString(3));
                doc.setLinkText(rs.getString(4));
                doc.setFileName(rs.getString(5));
                doc.setModelID(id);
                documents.add(doc);
            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return documents;
    }

    public ArrayList<PDXGraphic> getGraphics(String id) {
        ArrayList<PDXGraphic> graphics = new ArrayList<PDXGraphic>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxgraphic_key, _pdxcharacterization_key, description, filename, sortorder from pdxgraphic where modelid = ? order by sortorder ");
            s.setString(1, id);
            rs = s.executeQuery();
            while (rs.next()) {
                PDXGraphic graphic = new PDXGraphic();
                graphic.setContentKey(rs.getInt(1));
                graphic.setCharacterization(rs.getInt(2));
                graphic.setDescription(rs.getString(3));
                graphic.setFileName(rs.getString(4));
                graphic.setSortOrder(rs.getDouble(5));
                graphic.setModelID(id);
                graphics.add(graphic);
            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return graphics;

    }

    public ArrayList<PDXLink> getLinks(String id) {
        ArrayList<PDXLink> links = new ArrayList<PDXLink>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxlink_key, _pdxcharacterization_key, description, url, linktext from pdxlink where modelid = ?");
            s.setString(1, id);
            rs = s.executeQuery();
            while (rs.next()) {
                PDXLink link = new PDXLink();
                link.setContentKey(rs.getInt(1));
                link.setCharacterization(rs.getInt(2));
                link.setDescription(rs.getString(3));
                link.setUrl(rs.getString(4));
                link.setLinkText(rs.getString(5));
                link.setModelID(id);
                links.add(link);
            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return links;

    }

    // get Content by id for editing
    public PDXComment getComment(int key) {
        PDXComment comment = new PDXComment();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxcomment_key, _pdxcharacterization_key, comment, modelid from pdxcomment where _pdxcomment_key = ?");
            s.setInt(1, key);
            rs = s.executeQuery();
            while (rs.next()) {

                comment.setContentKey(rs.getInt(1));
                comment.setCharacterization(rs.getInt(2));
                comment.setComment(rs.getString(3));
                comment.setModelID(rs.getString(4));
            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return comment;
    }

    public PDXDocument getDocument(int key) {
        PDXDocument doc = new PDXDocument();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxdocument_key, _pdxcharacterization_key, description, linktext, filename, modelid from pdxdocument where _pdxdocument_key = ?");
            s.setInt(1, key);
            rs = s.executeQuery();
            while (rs.next()) {

                doc.setContentKey(rs.getInt(1));
                doc.setCharacterization(rs.getInt(2));
                doc.setDescription(rs.getString(3));
                doc.setLinkText(rs.getString(4));
                doc.setFileName(rs.getString(5));
                doc.setModelID(rs.getString(6));

            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return doc;
    }

    public PDXGraphic getGraphic(int key) {
        PDXGraphic graphic = new PDXGraphic();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxgraphic_key, _pdxcharacterization_key, description, filename, modelid, sortorder from pdxgraphic where _pdxgraphic_key = ?");
            s.setInt(1, key);
            rs = s.executeQuery();
            while (rs.next()) {

                graphic.setContentKey(rs.getInt(1));
                graphic.setCharacterization(rs.getInt(2));
                graphic.setDescription(rs.getString(3));
                graphic.setFileName(rs.getString(4));
                graphic.setModelID(rs.getString(5));
                graphic.setSortOrder(rs.getDouble(6));

            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return graphic;

    }

    public PDXLink getLink(int key) {
        PDXLink link = new PDXLink();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            s = con.prepareStatement("Select _pdxlink_key, _pdxcharacterization_key, description, url, linktext, modelid from pdxlink where _pdxlink_key = ?");
            s.setInt(1, key);
            rs = s.executeQuery();
            while (rs.next()) {

                link.setContentKey(rs.getInt(1));
                link.setCharacterization(rs.getInt(2));
                link.setDescription(rs.getString(3));
                link.setUrl(rs.getString(4));
                link.setLinkText(rs.getString(5));
                link.setModelID(rs.getString(6));

            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return link;

    }

    /**
     * For each model generate a list of which types of additional content it
     * has
     *
     * @return HashMap<String,<ArrayList<String>> List of additional content by
     * model
     */
    public HashMap<String, ArrayList<String>> getPDXAdditionalContent() {
        HashMap<String, ArrayList<String>> contents = new HashMap<String, ArrayList<String>>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        StringBuffer query = new StringBuffer();
        query.append(" SELECT distinct tmp.modelID, tmp._pdxcharacterization_key from ( ");
        query.append(" SELECT modelID, _pdxcharacterization_key from pdxcomment ");
        query.append(" union ");
        query.append(" SELECT modelID, _pdxcharacterization_key from pdxdocument ");
        query.append(" union ");
        query.append(" SELECT modelID, _pdxcharacterization_key from pdxgraphic ");
        query.append(" union ");
        query.append(" SELECT modelID, _pdxcharacterization_key from pdxlink ) as tmp ");
        query.append(" order by tmp._pdxcharacterization_key");
        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            rs = s.executeQuery();
            while (rs.next()) {
                String key = rs.getString(1);
                String val = rs.getString(2);
                if (contents.get(key) == null) {
                    ArrayList<String> list = new ArrayList<String>();
                    list.add(val);
                    contents.put(key, list);
                } else {
                    contents.get(key).add(val);
                }

            }

        } catch (SQLException e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return contents;

    }

    /**
     * Expression graph for all genes (exome panel) for a specific model
     *
     * @param modelID String TM#####
     * @return JSON string
     */
    public String getModelExpression(String modelID) {

        DecimalFormat df = new DecimalFormat("#.##");

        StringBuffer result = new StringBuffer();
        HashMap<String, String> sampleMap = new HashMap<String, String>();
        HashMap<String, HashMap<String, Double>> genes = new HashMap<String, HashMap<String, Double>>();
        HashMap<String, String> platformMap = new HashMap<String, String>();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        StringBuffer query = new StringBuffer("Select modelID,sampleName,gene,platform,rankZ from pdxexpression where modelID = ?");
        query.append(" and platform != '' and rankz !=0 order by gene,sampleName");
        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            s.setString(1, modelID);
            rs = s.executeQuery();
            String model, sample, gene, platform;
            Double rankZ, value;
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<String>();
                model = rs.getString(1);
                sample = rs.getString(2);
                gene = rs.getString(3);
                platform = rs.getString(4);
                rankZ = rs.getDouble(5);  // this is probably the only one that matters

                value = rankZ;
                platformMap.put(platform, platform);
                sampleMap.put(sample, sample);
                if (genes.containsKey(gene)) {
                    genes.get(gene).put(sample, value);
                } else {
                    HashMap<String, Double> map = new HashMap<String, Double>();
                    map.put(sample, value);
                    genes.put(gene, map);
                }

            }
            ArrayList<String> samples = new ArrayList<String>();
            samples.addAll(sampleMap.keySet());

            Collections.sort(samples);

            ArrayList<String> platforms = new ArrayList<String>();
            platforms.addAll(platformMap.keySet());

            Collections.sort(platforms);
            for (String pform : platforms) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(pform);
            }
            // build the column definitions gene then one or more samples
            result.append("['Gene'");
            for (String sam : samples) {
                result.append(",'").append(sam).append("',{role:'certainty'}");
            }
            result.append("]");

            // group the expression values by gene across one or more samples
            ArrayList<String> geneList = new ArrayList<String>();
            geneList.addAll(genes.keySet());
            Collections.sort(geneList);
            for (String g : geneList) {
                result.append(",['").append(g).append("'");
                HashMap<String, Double> map = genes.get(g);
                for (String sam : samples) {
                    if (map.get(sam) != null) {
                        if (AFFECTED_GENES.containsKey(g)) {
                            result.append(",").append(df.format(map.get(sam))).append(",false");
                        } else {
                            result.append(",").append(df.format(map.get(sam))).append(",true");
                        }
                    } else {
                        result.append(",null,true");
                    }

                }

                result.append("]");

            }

            if (genes.size() == 0) {
                result.delete(0, result.length());
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }

    /**
     *
     * @param gene String gene name
     * @param mice ArrayList<PDXMouse> all mice from query results
     * @return JSON to graph expression of gene across all mice
     */
    public String getExpression(String gene, ArrayList<PDXMouse> mice) {

        DecimalFormat df = new DecimalFormat("#.##");

        StringBuffer result = new StringBuffer();

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        StringBuffer mouseIDs = new StringBuffer();
        for (PDXMouse mouse : mice) {
            mouseIDs.append("'").append(mouse.getModelID()).append("',");
        }
        mouseIDs.deleteCharAt(mouseIDs.length() - 1);

        StringBuffer query = new StringBuffer("Select modelID,sampleName,gene,platform,expression,expressionZ,rank,rankZ from pdxexpression where modelID in (");
        query.append(mouseIDs).append(")");
        query.append(" and gene=? and platform != '' ");
        query.append("order by modelID,sampleName");
        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            s.setString(1, gene);
            rs = s.executeQuery();
            String model, sample, platform;
            Double expression, expressionZ, rank, rankZ, value;
            while (rs.next()) {
                model = rs.getString(1);
                sample = rs.getString(2);
                gene = rs.getString(3);
                platform = rs.getString(4);
                expression = rs.getDouble(5);
                expressionZ = rs.getDouble(6);
                rank = rs.getDouble(7);
                rankZ = rs.getDouble(8);  // this is probably the only one that matters

                value = rankZ;

                result.append("['" + model + " : " + sample + "'," + df.format(value) + ",'" + model + "'],");

            }

            if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }

    /**
     * Returns a string to graph the CNV data for the gene for all mice in the
     * list
     *
     * @param gene
     * @param mice ArrayList of PDXMice
     * @return JSON
     */
    public String getCNVExpression(String gene, ArrayList<PDXMouse> mice) {

        DecimalFormat df = new DecimalFormat("##.###");

        StringBuffer result = new StringBuffer();
        StringBuffer models = new StringBuffer();
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        for (PDXMouse mouse : mice) {

            models.append("'").append(mouse.getModelID()).append("',");
        }

        models.deleteCharAt(models.length() - 1);

        StringBuffer query = new StringBuffer("Select modelID,sampleName,gene,rankZ,ampDel,cn,ploidy from pdxexpression where modelID in (");
        query.append(models).append(")");
        query.append(" and gene=? ");
        query.append(" and ampDel !='noValue' and platform != '' ");
        query.append(" order by modelID,sampleName ");
        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            s.setString(1, gene);
            rs = s.executeQuery();
            String model, sample, ampDel;
            Double rankZ, cn, ploidy;
            while (rs.next()) {
                model = rs.getString(1);
                sample = rs.getString(2);
                gene = rs.getString(3);
                rankZ = rs.getDouble(4);
                ampDel = rs.getString(5);
                cn = rs.getDouble(6);
                ploidy = rs.getDouble(7);

                

                result.append("['" + model + " : " + sample + "'," + df.format(rankZ) + ",'" + model + "','" + ampDel + "'],");

            }

            if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }

    /*
     * Produce a google vis compliant String to graph all the cnv value for a specfic model
     * Model may have more than one sample per gene in that case append sample name to gene 
     * Return an empty string if there are no results
     * modelID should be TM#####
     * 
     * @param modelID
     * @return JSON
     */
    public String getModelCNV(String modelID) {

        DecimalFormat df = new DecimalFormat("##.####");

        StringBuffer result = new StringBuffer();

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        StringBuffer query = new StringBuffer("Select gene,sampleName,cn, ploidy from pdxexpression where ampDel !='noValue' and  modelID = ?");
        query.append("order by gene,sampleName");

        HashMap<String, String> ploidyMap = new HashMap<String, String>();
        HashMap<String, HashMap<String, Double>> genes = new HashMap<String, HashMap<String, Double>>();
        try {
            con = getConnection();

            s = con.prepareStatement(query.toString());
            s.setString(1, modelID);
            rs = s.executeQuery();
            String sample = null, gene;
            Double cn, ploidy;
            while (rs.next()) {
                gene = rs.getString(1);
                sample = rs.getString(2);
                cn = rs.getDouble(3);
                ploidy = rs.getDouble(4);

             //   Double val = Math.log(cn / ploidy) / Math.log(2);

                if (genes.containsKey(gene)) {
                    genes.get(gene).put(sample, cn);
                } else {
                    HashMap<String, Double> map = new HashMap<String, Double>();
                    map.put(sample, cn);
                    genes.put(gene, map);
                }

                ploidyMap.put(sample, ploidy + "");

            }

            ArrayList<String> samples = new ArrayList<String>();
            samples.addAll(ploidyMap.keySet());

            Collections.sort(samples);

            for (String key : ploidyMap.keySet()) {
                result.append(key + ":" + ploidyMap.get(key) + ",");
            }

            result.append("|");

            // build the column definitions gene then one or more samples
            result.append("['Gene'");
            for (String sam : samples) {
                result.append(",'").append(sam).append(" Sample Ploidy:").append(ploidyMap.get(sam)).append("'");
            }
            result.append("]");

            // group the expression values by gene across one or more samples
            ArrayList<String> geneList = new ArrayList<String>();
            geneList.addAll(genes.keySet());
            Collections.sort(geneList);
            for (String g : geneList) {
                result.append(",['").append(g).append("'");
                HashMap<String, Double> map = genes.get(g);
                for (String sam : samples) {
                    if (map.get(sam) != null) {
                        result.append(",").append(df.format(map.get(sam)));
                    } else {
                        result.append(",null");
                    }
                }
                result.append("]");
            }

            if (genes.size() == 0) {
                result.delete(0, result.length());
            }

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }
    
     public String getModelCNVJSON(String modelID) {

        DecimalFormat df = new DecimalFormat("##.####");

        StringBuffer result = new StringBuffer();

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        StringBuffer query = new StringBuffer("Select gene,sampleName,cn, ploidy from pdxexpression where ampDel !='noValue' and  modelID = ?");
        query.append("order by gene,sampleName");

        HashMap<String, String> ploidyMap = new HashMap<String, String>();
        HashMap<String, HashMap<String, Double>> genes = new HashMap<String, HashMap<String, Double>>();
        try {
            con = getConnection();

            s = con.prepareStatement(query.toString());
            s.setString(1, modelID);
            rs = s.executeQuery();
            String sample = null, gene;
            Double cn, ploidy;
            while (rs.next()) {
                gene = rs.getString(1);
                sample = rs.getString(2);
                cn = rs.getDouble(3);
                ploidy = rs.getDouble(4);

                

                if (genes.containsKey(sample)) {
                    genes.get(sample).put(gene, cn);
                } else {
                    HashMap<String, Double> map = new HashMap<String, Double>();
                    map.put(gene, cn);
                    genes.put(sample, map);
                }

                ploidyMap.put(sample, ploidy + "");

            }

            ArrayList<String> samples = new ArrayList<String>();
            samples.addAll(ploidyMap.keySet());

            Collections.sort(samples);
            
            result.append("{\"pdxCNV\":{\"modelID\":\""+modelID+"\",\"samples\":[");
            int startLength = result.length();
            
            for (String sampleKey : ploidyMap.keySet()) {
                result.append("{\"sample\":\""+sampleKey+"\",\"ploidy\":\"" + ploidyMap.get(sampleKey) + "\",\"CNV\":[");
                
                HashMap<String,Double> geneMap = genes.get(sampleKey);
                
                for(String geneKey:geneMap.keySet()){
                    result.append("{\"gene\":\"").append(geneKey).append("\",\"value\":\"");
                    result.append(df.format(geneMap.get(geneKey))).append("\"},");
                }
                result.replace(result.length()-1,result.length(),"]},");
            }
            if(result.length() == startLength){
                result.append("]");
            }
            
            result.replace(result.length()-1,result.length(),"]}}");

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }
     
     
     
      public String getModelExpressionJSON(String modelID) {

        DecimalFormat df = new DecimalFormat("##.####");

        StringBuffer result = new StringBuffer();

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        StringBuffer query = new StringBuffer("Select gene,sampleName,rankz, platform from pdxexpression where rankz !=0 and  modelID = ?");
        query.append("order by gene,sampleName");

        HashMap<String, String> platformMap = new HashMap<String, String>();
        HashMap<String, HashMap<String, Double>> genes = new HashMap<String, HashMap<String, Double>>();
        try {
            con = getConnection();

            s = con.prepareStatement(query.toString());
            s.setString(1, modelID);
            rs = s.executeQuery();
            String sample, gene, platform;
            Double rankz;
            while (rs.next()) {
                gene = rs.getString(1);
                sample = rs.getString(2);
                rankz = rs.getDouble(3);
                platform = rs.getString(4);

                

                if (genes.containsKey(sample)) {
                    genes.get(sample).put(gene, rankz);
                } else {
                    HashMap<String, Double> map = new HashMap<String, Double>();
                    map.put(gene, rankz);
                    genes.put(sample, map);
                }

                platformMap.put(sample, platform);

            }

            
            result.append("{\"pdxExpression\":{\"modelID\":\""+modelID+"\",\"samples\":[");
            int startLength = result.length();
            for (String sampleKey : platformMap.keySet()) {
                result.append("{\"sample\":\""+sampleKey+"\",\"platform\":\"" + platformMap.get(sampleKey) + "\",\"Expression\":[");
                
                HashMap<String,Double> geneMap = genes.get(sampleKey);
                
                for(String geneKey:geneMap.keySet()){
                    result.append("{\"gene\":\"").append(geneKey).append("\",\"value\":\"");
                    result.append(df.format(geneMap.get(geneKey))).append("\"},");
                }
                result.replace(result.length()-1,result.length(),"]},");
            }
            
            if(result.length() == startLength){
                result.append("]");
            }
            
            result.replace(result.length()-1,result.length(),"]}}");

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return result.toString();

    }
     

    public HashMap<String, HashMap<String, ArrayList<String>>> getComparisonData(ArrayList<String> models, ArrayList<String> genes) {

        HashMap<String, HashMap<String, ArrayList<String>>> results = new HashMap<String, HashMap<String, ArrayList<String>>>();

        StringBuffer query = new StringBuffer("select modelID, sampleName, gene, rankZ as expression, ampDel as cnv, mutation ");
        query.append(" from pdxexpression where modelID in (");

        query.append(DAOUtils.collectionToString(models, ",", "'"));

        query.append(" ) and gene in ( ");

        query.append(DAOUtils.collectionToString(genes, ",", "'"));

        query.append(" ) order by modelID, sampleName, gene");

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            rs = s.executeQuery();
            while (rs.next()) {
                if (results.containsKey(rs.getString(3))) {
                    HashMap samples = results.get(rs.getString(3));
                    ArrayList<String> list = new ArrayList<String>();
                    list.add((rs.getDouble(4)) + "");
                    list.add(rs.getString(5));
                    list.add(rs.getString(6));
                    samples.put(rs.getString(1) + "-" + rs.getString(2), list);
                } else {
                    HashMap samples = new HashMap<String, ArrayList<String>>();
                    ArrayList<String> list = new ArrayList<String>();
                    list.add((rs.getDouble(4)) + "");
                    list.add(rs.getString(5));
                    list.add(rs.getString(6));
                    samples.put(rs.getString(1) + "-" + rs.getString(2), list);
                    results.put(rs.getString(3), samples);
                }

            }
        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return results;

    }

    public ArrayList<String> getModelsByAdditionalInfo(String key) {

        StringBuffer query = new StringBuffer("select distinct pdx.modelId from ( ");
        query.append(" select modelId from pdxcomment where _pdxcharacterization_key = ").append(key);
        query.append(" union");
        query.append(" select modelId from pdxdocument where _pdxcharacterization_key = ").append(key);
        query.append(" union");
        query.append(" select modelId from pdxdocument where _pdxcharacterization_key = ").append(key);
        query.append(" union");
        query.append(" select modelId from pdxgraphic where _pdxcharacterization_key = ").append(key);
        query.append(" union");
        query.append(" select modelId from pdxlink where _pdxcharacterization_key = ").append(key);
        query.append(" as pdx");

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        ArrayList<String> results = new ArrayList<String>();
        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            rs = s.executeQuery();
            while (rs.next()) {
                results.add(rs.getString(1));
            }
        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return results;

    }

    /**
     * Duplicates web service call but will be much faster if run against MTB DB
     * Assumes upto date copy of table pdx_variation_mv from CGA database is in
     * MTB DB
     *
     * @param modelID String TM#####
     * @param gene String
     * @param variant String
     * @return String comma separated list of unique consequences for variant
     */
    public String getConsequence(String modelID, String gene, String variant) {

        Integer intID = new Integer(0);
        try {
            modelID = modelID.substring(2);
            intID = new Integer(modelID);
        } catch (NumberFormatException nfe) {
            // don't care can't do much, result will be empty
        }

        String query = "select distinct consequence,gene_symbol, amino_acid_change from pdx_variation_mv where model_id = ? and gene_symbol = ?";

        String variantClause = " and amino_acid_change = ?";

        boolean hasVariant = false;

        if (variant != null && variant.trim().length() > 0) {
            hasVariant = true;
            query = query + variantClause;

        }
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        StringBuffer results = new StringBuffer();

        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            s.setInt(1, intID);
            s.setString(2, gene);
            if (hasVariant) {
                s.setString(3, variant);
            }
            rs = s.executeQuery();
            while (rs.next()) {
                if (rs.isLast()) {
                    results.append(rs.getString(1));
                } else {
                    results.append(rs.getString(1)).append(",");
                }
            }
        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return results.toString();
    }

    /**
     * Returns a JSON string formatted for paginated display of variation data
     * including the total rows available Assumes upto date copy of table
     * pdx_variation_mv from CGA database is in MTB DB
     *
     * @param modelID String
     * @param limit String the number of rows to return
     * @param start String start index for results
     * @param sort String the sort column by name
     * @param dir String the sort direction
     * @return JSON String
     */
    public String getVariationData(String modelID, String limit, String start, String sort, String dir) {

        String totalQuery = "select count(*) from pdx_variation_mv where model_id = ?";
        String variationQuery = "select * from pdx_variation_mv where model_id = ? order by " + sort + " " + dir + " limit ? offset ? ";
        StringBuffer result = new StringBuffer("{'total':");
        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            s = con.prepareStatement(totalQuery.toString());
            s.setInt(1, new Integer(modelID));
            rs = s.executeQuery();
            rs.next();
            result.append(rs.getString(1));
            result.append(",'variation':[");
            rs.close();
            s.close();

            s = con.prepareStatement(variationQuery);
            s.setInt(1, new Integer(modelID));

            s.setInt(2, new Integer(limit));
            s.setInt(3, new Integer(start));

            rs = s.executeQuery();
            while (rs.next()) {
                result.append("['").append(rs.getString("model_id")).append("',");
                result.append("'").append(rs.getString("sample_name")).append("',");
                result.append("'").append(rs.getString("gene_symbol")).append("',");
                result.append("'").append(rs.getString("platform")).append("',");
                result.append("'").append(rs.getString("analysis_id")).append("',");
                result.append("'").append(rs.getString("chromosome")).append("',");
                result.append("'").append(rs.getString("seq_position")).append("',");
                result.append("'").append(rs.getString("ref_allele")).append("',");
                result.append("'").append(rs.getString("alt_allele")).append("',");
                result.append("'").append(rs.getString("consequence")).append("',");
                result.append("'").append(rs.getString("amino_acid_change")).append("',");
                result.append("'").append(rs.getString("rs_variants")).append("',");
                result.append("'").append(rs.getString("cosmic_variants")).append("',");
                result.append("'").append(rs.getString("other_variants")).append("',");
                result.append("'").append(rs.getString("polyphen_prediction")).append("',");
                result.append("'").append(rs.getString("polyphen_score")).append("',");
                result.append("'").append(rs.getString("sift_prediction")).append("',");
                result.append("'").append(rs.getString("sift_score")).append("',");
                result.append("'").append(rs.getString("read_depth")).append("',");
                if (!rs.isLast()) {
                    result.append("'").append(rs.getString("variant_frequency")).append("'],");
                } else {
                    result.append("'").append(rs.getString("variant_frequency")).append("']");
                }

            }

            result.append("]}");

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }
        String resultStr = result.toString().replaceAll("null", " ");

        return resultStr;
    }

    public ArrayList<String> getVariants(String gene, String model) {

        ArrayList<String> variants = new ArrayList<String>();
        boolean hasModel = false;
        int modelInt = 0;
        String query = "select distinct amino_acid_change from pdxgenevariants where gene = ? ";

        if (model != null && model.trim().length() > 0) {
            query = query + " and modelID = ?";
            hasModel = true;
            model = model.substring(2);
            try {
                modelInt = new Integer(model).intValue();
            } catch (NumberFormatException e) {
                hasModel = false;
            }
        }

        query = query + " order by amino_acid_change";

        Connection con = null;
        PreparedStatement s = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            s = con.prepareStatement(query.toString());
            s.setString(1, gene);
            if (hasModel) {
                s.setInt(2, modelInt);
            }
            rs = s.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).trim().length() > 0) {
                    variants.add(rs.getString(1));
                }
            }
        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return variants;

    }

    public String getHumanGenes(String query, String page, String limit) {

        query = query.replaceAll("'", "''");
        query = query.toLowerCase();

        int offset = 0;
        try {
            int pg = new Integer(page);
            int lmt = new Integer(limit);
            offset = pg * lmt;
        } catch (NumberFormatException nfe) {
            log.error("Cant compute offset from page:" + page + " and limit:" + limit);
        }

        String count = "select count(*) from humangenes where available and lower(display) like ? ";

        String sql = "select symbol,display from humangenes where available and lower(display) like ? order by display limit " + limit + " offset " + offset;

        Connection con = null;
        PreparedStatement s = null;
        PreparedStatement s2 = null;
        ResultSet rs = null;

        StringBuilder sb = new StringBuilder();
        try {
            con = getConnection();

            s = con.prepareStatement(sql);
            s.setString(1, query + "%");

            s2 = con.prepareStatement(count);
            s2.setString(1, query + "%");

            rs = s2.executeQuery();
            rs.next();
            int total = rs.getInt(1);
            sb.append("{\"total\":").append(total).append(",\"data\":[");

            rs = s.executeQuery();

            while (rs.next()) {

                //           sb.append("{\"value\":\"").append(rs.getString(1)).append("\",\"display\":\"").append(rs.getString(2)).append("\"},");
                sb.append("[\"").append(rs.getString(1)).append("\",\"").append(rs.getString(2)).append("\"],");

            }

            sb.replace(sb.length() - 1, sb.length(), "]");
            sb.append("}");

        } catch (Exception e) {
            log.error(e);
        } finally {
            try {
                rs.close();
                s.close();
                con.close();

            } catch (Exception e) {
                log.error(e);
            }
        }

        return sb.toString();

    }

}
