 /**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyUtilDAO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Pathology</code>
 * data and related information. Used by EI not WI
 *
 * @author mjv
 * @date 2007/04/30 15:47:18
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBPathologyUtilDAO.java,v 1.1 2007/04/30 15:47:18 mjv Exp
 */
public class MTBPathologyUtilDAO extends MTBUtilDAO {

    // -------------------------------------------------------------- Constants
    // none

    // ----------------------------------------------------- Instance Variables

    private static MTBPathologyUtilDAO singleton = new MTBPathologyUtilDAO();
    private final static Logger log =
            Logger.getLogger(MTBPathologyUtilDAO.class.getName());

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new instance of MTBStrainUtilDAO
     */
    private MTBPathologyUtilDAO() {
        super();
    }

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBPathologyUtilDAO singleton.
     *
     * @return MTBPathologyUtilDAO
     */
    public static MTBPathologyUtilDAO getInstance() {
        return singleton;
    }



    // called by ei
    public SearchResults searchPathology(int pathologyKey)
            throws NullPointerException, IllegalArgumentException, DAOException {
        return searchPathology(pathologyKey,
                               "=", // String pathologyKeyComparison,
                               -1,   // int strainKey,
                               null, // String strainKeyComparison,
                               -1,   // int tfKey,
                               null, // String tfKeyComparison,
                               0,   // int pathologistKey,
                               0,   // int contributorKey,
                               null, // String imageName,
                               null, // String imageNameComparison,
                               false,// boolean mustHaveImages,
                               null, // String orderBy,
                               -1);  // int maxItems)
    }

    // called by EI: this is important to note because this query does not
    // take into consideration the private flag on pathology images
    public SearchResults<MTBPathologySearchDTO> searchPathology(int pathologyKey,
                                           String pathologyKeyComparison,
                                           int strainKey,
                                           String strainKeyComparison,
                                           int tfKey,
                                           String tfKeyComparison,
                                           int pathologistKey,
                                           int contributorKey,
                                           String imageName,
                                           String imageNameComparison,
                                           boolean mustHaveImages,
                                           String orderBy,
                                           int maxItems)
            throws NullPointerException, IllegalArgumentException, DAOException {

        Connection conn = null;
        ResultSet rs = null;
        Statement stmtSelect = null;
        SearchResults<MTBPathologySearchDTO> resultWrapper = 
                new SearchResults<MTBPathologySearchDTO>();
        List<MTBPathologySearchDTO> pathReports = 
                new ArrayList<MTBPathologySearchDTO>();
        String joinType ="";
        
        //how to join pathology to tumorpathology association
        // currently assuming left join will work in both cases
        if (((StringUtils.hasValue(strainKeyComparison)) && (strainKey > 0)) ||
                ((StringUtils.hasValue(tfKeyComparison)) && (tfKey > 0))) {
           
               joinType = " join ";
            } else {
                
                joinType = " left join ";
            }

        try {
            conn = getConnection();

            // master query
            StringBuffer sbSelectMaster = new StringBuffer();
            sbSelectMaster.append("select distinct p._Pathology_key, ").append(EOL);
            sbSelectMaster.append("       p._Pathologist_key, ").append(EOL);
            sbSelectMaster.append("       r1.shortCitation, ").append(EOL);
            sbSelectMaster.append("       p._Contributor_key,  ").append(EOL);
            sbSelectMaster.append("       r2.shortCitation, ").append(EOL);
            sbSelectMaster.append("       p.description, ").append(EOL);
            sbSelectMaster.append("       tf._TumorFrequency_key,  ").append(EOL);
            sbSelectMaster.append("       s._Strain_key, ").append(EOL);
            sbSelectMaster.append("       (select count(1) from PathologyImages ipi where ipi._Pathology_key = p._Pathology_key) numImages ").append(EOL);
            sbSelectMaster.append("from Pathology p left join ").append(EOL);
            sbSelectMaster.append("       (PathologyImages pi join Images i on( pi._Images_key = i._Images_key) )on (p._Pathology_key = pi._Pathology_key) ").append(EOL);
            sbSelectMaster.append("       left join (TumorPathologyAssoc tpa join TumorFrequency tf on (tpa._TumorFrequency_key = tf._TumorFrequency_key) ").append(EOL);
            sbSelectMaster.append("       join Strain s on (tf._Strain_key = s._Strain_key))  on ( p._Pathology_key = tpa._Pathology_key), ").append(EOL);
            sbSelectMaster.append("       Reference r1, ").append(EOL);
            sbSelectMaster.append("       Reference r2 ").append(EOL);
            sbSelectMaster.append("where  p._Pathologist_key = r1._Reference_Key ").append(EOL);
            sbSelectMaster.append(" and p._Contributor_key = r2._Reference_key ").append(EOL);
           

            if ((StringUtils.hasValue(tfKeyComparison)) && (tfKey > 0)) {
                sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("tf._TumorFrequency_key", tfKeyComparison, Integer.valueOf(tfKey))).append(EOL);
            }

            if ((StringUtils.hasValue(strainKeyComparison)) && (strainKey > 0)) {
                sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("s._Strain_key", strainKeyComparison, Integer.valueOf(strainKey))).append(EOL);
            }

            if ((StringUtils.hasValue(pathologyKeyComparison)) && (pathologyKey > 0)) {
                sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("p._Pathology_key", pathologyKeyComparison, Integer.valueOf(pathologyKey))).append(EOL);
            }

            if (mustHaveImages) {
                sbSelectMaster.append("   and (select count(1) from PathologyImages ipi where ipi._Pathology_key = p._Pathology_key) > 0").append(EOL);
            }

            // a key of -1 indicates a bad J# so search should fail
            if (pathologistKey != 0) {
                sbSelectMaster.append("   and p._Pathologist_key = ").append(pathologistKey).append(EOL);
            }

            if (contributorKey != 0) {
                sbSelectMaster.append("   and p._Contributor_key = ").append(contributorKey).append(EOL);
            }

            sbSelectMaster.append(" order by p._Pathology_key ").append(EOL);

            stmtSelect = conn.createStatement();
            rs = stmtSelect.executeQuery(sbSelectMaster.toString());

            while (rs.next()) {
                MTBPathologySearchDTO dto = new MTBPathologySearchDTO();
                dto.setPathologyKey(rs.getInt(1));
                dto.setPathologistKey(rs.getInt(2));
                dto.setPathologist(rs.getString(3));
                dto.setContributorKey(rs.getInt(4));
                dto.setContributor(rs.getString(5));
                dto.setDescription(rs.getString(6));
                dto.setTfKey(rs.getInt(7));
                dto.setStrainKey(rs.getInt(8));
                dto.setNumImages(rs.getInt(9));
                pathReports.add(dto);
            }

        } catch (SQLException sqle) {
            log.error("Error searching pathology records", sqle);
            throw new DAOException(sqle);
        } finally {
            close(stmtSelect, rs);
            freeConnection(conn);
        }

        resultWrapper.setList(pathReports);
        resultWrapper.setTotal(pathReports.size());

        return resultWrapper;
    }

    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
}