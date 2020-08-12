/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/mtb/MTBUtilDAO.java,v 1.1 2007/04/30 15:47:52 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.mtb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jax.mgi.mtb.dao.custom.mtb.MTBStrainTumorDetailsDTO;
import org.jax.mgi.mtb.dao.custom.mtb.MTBStrainTumorSummaryDTO;

/**
 *
 * @author mjv
 * @date 2007/04/30 15:47:52
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/mtb/MTBUtilDAO.java,v 1.1 2007/04/30 15:47:52 mjv Exp
 */
public class MTBUtilDAO {

  // -------------------------------------------------------------- Constants
  protected final char EOL = '\n';
  protected final boolean DEBUG = true;
  public final int DO_NOT_SEARCH = -1;
  public final int SEARCH = 0;
  public final static String NONE = "None (spontaneous)";

  // ----------------------------------------------------- Instance Variables
  // none

  // ----------------------------------------------------------- Constructors
  public MTBUtilDAO() {
  }

  // --------------------------------------------------------- Public Methods
  /**
   * Retrieves the manager object used to get connections.
   *
   * @return the manager used
   */
  public DAOManagerMTB getManager() {
    return DAOManagerMTB.getInstance();
  }

  /**
   * Frees the connection.
   *
   * @param c the connection to release
   */
  public void freeConnection(Connection c) {
    getManager().releaseConnection(c); // back to pool
  }

  /**
   * Gets the connection.
   */
  public Connection getConnection() throws SQLException {
    return getManager().getConnection();
  }

  public void close(Statement s) {
    getManager().close(s);
  }

  /**
   * Closes the passed ResultSet.
   */
  public void close(ResultSet rs) {
    getManager().close(rs);
  }

  /**
   * Closes the passed Statement and ResultSet.
   */
  public void close(Statement s, ResultSet rs) {
    getManager().close(s, rs);
  }
  
  protected Map<String, MTBStrainTumorSummaryDTO> consolidateTumors(Map<String, MTBStrainTumorSummaryDTO> t ){
    return consolidateTumors(t,false);
  }
          
  
  protected Map<String, MTBStrainTumorSummaryDTO> consolidateTumors(Map<String, MTBStrainTumorSummaryDTO> t, boolean simple) {
        Map<String, MTBStrainTumorSummaryDTO> tumors = new LinkedHashMap<String, MTBStrainTumorSummaryDTO>();
        final char delim = ':';

        for (MTBStrainTumorSummaryDTO sum : t.values()) {
            StringBuffer key = new StringBuffer();
            key.append(sum.getStrainKey());
            key.append(delim);
            key.append(sum.getTumorName());
            key.append(delim);
            key.append(sum.getOrganAffectedName());
            key.append(delim);
            key.append(sum.getTreatmentType());
                        
            if (!simple) {
                key.append(delim);
                if(sum.getAgentsCollection()!= null){
                key.append(sum.getAgentsCollection().toString());
                }
                if(sum.getAgentKeys() != null){
                  key.append(sum.getAgentKeys().toString());
                }
                key.append(delim);
            }

            MTBStrainTumorSummaryDTO summary = null;
            
         

            if (tumors.containsKey(key.toString())) {
                summary = tumors.get(key.toString());
                summary.merge(sum);
            } else {
                summary = sum;
            }

            tumors.put(key.toString(), summary);
        }

        return tumors;
    }
  
  protected Map<String, MTBStrainTumorSummaryDTO> consolidateMetastatsis(List<MTBStrainTumorDetailsDTO> t) {
        Map<String, MTBStrainTumorSummaryDTO> tempTumors  = new LinkedHashMap<String, MTBStrainTumorSummaryDTO>();

         final char delim = ':';
        for (MTBStrainTumorDetailsDTO detail : t) {
            MTBStrainTumorSummaryDTO sumTemp = null;

            StringBuffer key = new StringBuffer();
            key.append(detail.getStrainKey());
            key.append(delim);
            key.append(detail.getParentFrequencyKey());
            key.append(delim);
            key.append(detail.getOrganOfOriginKey());
            key.append(delim);
            key.append(detail.getTreatmentType());
            key.append(delim);

            if (detail.getAgentCollection() == null) {
                key.append("NULL");
            } else {
                key.append(detail.getAgentCollection().toString());
            }
            
           

            if (tempTumors.containsKey(key.toString())) {
                sumTemp = tempTumors.get(key.toString());
                sumTemp.addTumorFrequencyKey(detail.getTumorFrequencyKey());
                
                if ("0".equalsIgnoreCase(detail.getFrequency())) {
                    sumTemp.addMetastasizesTo("<i>not</i> " + detail.getOrganAffectedName());
                } else {
                    sumTemp.addTFKeyWithFrequency(detail.getTumorFrequencyKey());
                    sumTemp.addMetastasizesTo(detail.getOrganAffectedName());
                }
 
                sumTemp.setImages(detail.getImageCount());
                sumTemp.setMetastasis(detail.getMetastasis());
            } else {
                sumTemp = new MTBStrainTumorSummaryDTO(detail);
            }

            tempTumors.put(key.toString(), sumTemp);
        }

        return tempTumors;
    }
 
}

