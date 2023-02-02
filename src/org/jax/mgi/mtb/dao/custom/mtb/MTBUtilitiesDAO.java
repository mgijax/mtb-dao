/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBUtilitiesDAO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.utils.LabelValueBean;

/**
 * A <code>MTBUtilDAO</code> which performs utility based operations.
 *
 * @author mjv
 * @date 2007/04/30 15:47:21
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBUtilitiesDAO.java,v 1.1 2007/04/30 15:47:21 mjv Exp
 */
public class MTBUtilitiesDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private static MTBUtilitiesDAO singleton = new MTBUtilitiesDAO();
    private static final Logger log =
            org.apache.logging.log4j.LogManager.getLogger(MTBUtilitiesDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBUtilitiesDAO
     */
    private MTBUtilitiesDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBUtilitiesDAO singleton.
     *
     * @return MTBUtilitiesDAO
     */
    public static MTBUtilitiesDAO getInstance() {
        return singleton;
    }


    /**
     * Get the max value of the column in the specified table.
     *
     * @param columnName the name of the column
     * @param tableName the name of the table
     * @return the max value
     */
    public long getMax(String columnName, String tableName) {
        Connection conn = null;
        long max = -1;
        ResultSet rs = null;
        Statement stmtSelect = null;

        try {
            conn = getConnection();
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select max(").append(columnName).append(") ");
            sbSelect.append("  from ").append(tableName);

            stmtSelect = conn.createStatement();
            rs = stmtSelect.executeQuery(sbSelect.toString());

            while (rs.next()) {
                max = rs.getLong(1);
            }
        } catch (SQLException ex) {
            max = -1;
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        return max;
    }

    /**
     * Get the organ name for the supplied organ key.
     *
     * @param lOrganKey the organ key
     * @return the name of the organ
     */
    public String getOrganName(long lOrganKey) {
        String strName = null;
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("select name ");
            sbSelect.append("  from Organ ");
            sbSelect.append(" where _Organ_key = ").append(lOrganKey);

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
                strName = rs.getString(1);
            }
        } catch (SQLException ex) {
            log.error("Unable to retrieve name for organ with key = " + lOrganKey, ex);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return strName;
    }
    
    
    public ArrayList<LabelValueBean> getOrgansForGrid() {
        Connection conn = null;
        ResultSet rs = null;
        Statement stmt = null;
        
        ArrayList<LabelValueBean> organs = new ArrayList<LabelValueBean>();

        try {
            StringBuffer sbSelect = new StringBuffer();
            sbSelect.append("Select name,_organ_key from Organ where _organ_key = _organparent_key ");
            sbSelect.append("and _organ_key in (select _organ_key from TumorType ) and name not like '(Un%' order by name");

            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sbSelect.toString());

            while (rs.next()) {
               LabelValueBean lbv = new LabelValueBean(rs.getString(1),rs.getLong(2));
               organs.add(lbv);        
            }
        } catch (SQLException ex) {
            log.error("Unable to retrieve organs for dynamic grid", ex);
        } finally {
            close(stmt, rs);
            freeConnection(conn);
        }

        return organs;
    }


    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}