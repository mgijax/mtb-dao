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
import java.util.ArrayList;
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

   
   

    private PDXDAO() {
       
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
                    + "(modelid, _pdxcharacterization_key, description, url, linktext, pubmedid, "
                    + "create_user, update_user, create_date, update_date) values (?,?,?,?,?,?,?,?, now(),now())");
            s.setString(1, link.getModelID());
            s.setInt(2, link.getCharacterization());
            s.setString(3, link.getDescription());
            s.setString(4, link.getUrl());
            s.setString(5, link.getLinkText());
            s.setString(6, link.getPubMedID());
            s.setString(7, link.getUser());
            s.setString(8, link.getUser());
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
                    + "set description =?, url =? , linktext =?, pubmedid = ?, "
                    + "update_user =?, update_date = now() where _pdxlink_key  =?");
            s.setString(1, link.getDescription());
            s.setString(2, link.getUrl());
            s.setString(3, link.getLinkText());
            s.setString(4, link.getPubMedID());
            s.setString(5, link.getUser());
            s.setInt(6, link.getContentKey());
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
            s = con.prepareStatement("Select _pdxlink_key, _pdxcharacterization_key, description, url, linktext, pubmedid from pdxlink where modelid = ?");
            s.setString(1, id);
            rs = s.executeQuery();
            while (rs.next()) {
                PDXLink link = new PDXLink();
                link.setContentKey(rs.getInt(1));
                link.setCharacterization(rs.getInt(2));
                link.setDescription(rs.getString(3));
                link.setUrl(rs.getString(4));
                link.setLinkText(rs.getString(5));
                link.setPubMedID(rs.getString(6));
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
            s = con.prepareStatement("Select _pdxlink_key, _pdxcharacterization_key, description, url, linktext, pubmedid, modelid from pdxlink where _pdxlink_key = ?");
            s.setInt(1, key);
            rs = s.executeQuery();
            while (rs.next()) {

                link.setContentKey(rs.getInt(1));
                link.setCharacterization(rs.getInt(2));
                link.setDescription(rs.getString(3));
                link.setUrl(rs.getString(4));
                link.setLinkText(rs.getString(5));
                link.setPubMedID(rs.getString(6));
                link.setModelID(rs.getString(7));

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
