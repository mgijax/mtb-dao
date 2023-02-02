/**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchComparator.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Comparator;
import org.apache.logging.log4j.Logger;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>Comparator</code> subclass for comparing
 * <code>MTBGeneticsSearchDTO</code> data.
 *
 * @author mjv
 * @date 2007/04/30 15:47:16
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsSearchComparator.java,v 1.1 2007/04/30 15:47:16 mjv Exp
 */
public class MTBGeneticsSearchComparator
        implements Comparator<MTBGeneticsSearchDTO> {

  // -------------------------------------------------------------- Constants
  // none

  // ----------------------------------------------------- Instance Variables
  private static final Logger log =
          org.apache.logging.log4j.LogManager.getLogger(MTBGeneticsSearchComparator.class.getName());
  /**
   * Holds the field on which the comparison is performed.
   */
  protected int nColumn;
  /**
   * Value that will contain the information about the order of the sort:
   * normal or reversal.
   */
  protected boolean bReverse = false;
  // ----------------------------------------------------------- Constructors
  /**
   * Constructor.
   *
   * @param nCol the column
   */
  public MTBGeneticsSearchComparator(int nCol) {
    this(nCol, false);
  }

  /**
   * Constructor.
   *
   * @param nCol the column
   * @param bReverse set this value to true, if you want to reverse the
   *        sorting results
   */
  public MTBGeneticsSearchComparator(int nCol, boolean bReverse) {
    this.nColumn = nCol;
    this.bReverse = bReverse;
  }

  public int compare(MTBGeneticsSearchDTO pObj1,
          MTBGeneticsSearchDTO pObj2) {
    int nReturn = 0;
    switch (nColumn) {
      case MTBGeneticsUtilDAO.ID_CHROMOSOME:
        
        int nChromosomeA = -1;
        int nChromosomeB = -1;

        try {
          nChromosomeA = Integer.parseInt(pObj1.getChromosome());
        } catch (NumberFormatException nfe) {
          if (pObj1.getChromosome() == null) {
            // transgenes come last
            nChromosomeA = 100;
          }

          log.debug("chromosome conversion error'" + pObj1.getChromosome() + "'", nfe);
        }

        try {
          nChromosomeB = Integer.parseInt(pObj2.getChromosome());
        } catch (NumberFormatException nfe) {
          if (pObj2.getChromosome() == null) {
            // transgenes come last
            nChromosomeB = 100;
          }
          log.debug("chromosome conversion error '" + pObj2.getChromosome() + "'", nfe);
        }

        if ((nChromosomeA == -1) || (nChromosomeB == -1)) {
          nReturn = StringUtils.compare(pObj1.getChromosome(),
                  pObj2.getChromosome());
        } else {
          if (nChromosomeA > nChromosomeB) {
            nReturn = 1;
          } else if (nChromosomeA == nChromosomeB) {
            nReturn = StringUtils.compare(pObj1.getGeneSymbol() + pObj1.getAlleleType(),
                    pObj2.getGeneSymbol() + pObj2.getAlleleType());
          } else if (nChromosomeA < nChromosomeB) {
            nReturn = -1;
          }
        }
        break;
      case MTBGeneticsUtilDAO.ID_MARKERSYMBOL:
        nReturn = StringUtils.compare((pObj1.getGeneSymbol() + "," + pObj1.getGeneName()),
                (pObj2.getGeneSymbol() + "," + pObj2.getGeneName()));
        break;
      case MTBGeneticsUtilDAO.ID_MUTATIONTYPE:

        nReturn = StringUtils.compare(pObj1.getAlleleType() + pObj1.getGeneSymbol(),
                pObj2.getAlleleType() + pObj2.getGeneSymbol());

        break;
      default:
        throw new IllegalArgumentException("Unsupported field");
    }

    return bReverse ? (-1 * nReturn) : nReturn;
  }  // ------------------------------------------------------ Protected Methods
  // none

  // -------------------------------------------------------- Private Methods
  // none
}