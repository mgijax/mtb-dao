   /**
 * Header: /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsUtilDAO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 * Author: mjv
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jax.mgi.mtb.dao.DAOException;
import org.jax.mgi.mtb.dao.custom.SearchResults;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AlleleDTO;
import org.jax.mgi.mtb.dao.gen.mtb.AssayImagesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.AssayImagesDTO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDAO;
import org.jax.mgi.mtb.dao.gen.mtb.MarkerDTO;
import org.jax.mgi.mtb.dao.mtb.MTBUtilDAO;
import org.jax.mgi.mtb.dao.utils.DAOUtils;
import org.jax.mgi.mtb.utils.LabelValueBean;
import org.jax.mgi.mtb.utils.StringUtils;

/**
 * A <code>MTBUtilDAO</code> which performs operations on <code>Allele</code>,
 * <code>Marker</code>, <code>AllelePair</code> and other genetic related
 * data and information.
 *
 * @author mjv
 * @date 2007/04/30 15:47:17
 * @version 1.1
 * @cvsheader /mgi/cvsroot/mgi/mtb/mtbdao/src/org/jax/mgi/mtb/dao/custom/mtb/MTBGeneticsUtilDAO.java,v 1.1 2007/04/30 15:47:17 mjv Exp
 */
public class MTBGeneticsUtilDAO extends MTBUtilDAO {

  private final static String SQL_ALLELE_SEARCH =
          "select distinct " +
          "       ap._AllelePair_key, " +
          "       (select _AlleleType_key from Allele where _Allele_key = ap._Allele1_key) a1Type_key, " +
          "       (select _AlleleType_key from Allele where _Allele_key = ap._Allele2_key) a2Type_key, " +
          "       al1.name a1name, " +
          "       al2.name a2name, " +
          "       al1.symbol a1symbol, " +
          "       al2.symbol a2symbol, " +
          "       al1._Allele_key a1key, " +
          "       al2._Allele_key a2key, " +
          "       (select count(1) from Genotype where _AllelePair_key = ap._AllelePair_key) numStrains, " +
          "       (select count(1) from TumorGenetics where _AllelePair_key = ap._AllelePair_key) numTFs, " +
          "       (select at.type from AlleleType at, Allele a where at._AlleleType_key =  a._AlleleType_key and a._Allele_key = ap._Allele1_key) a1Type, " +
          "       (select at.type from AlleleType at, Allele a where at._AlleleType_key = a._AlleleType_key  and a._Allele_key = ap._Allele2_key) a2Type " +
          "  from AllelePair ap left join (Allele al2 join AlleleMarkerAssoc ama2 on (al2._Allele_key = ama2._Allele_key)) on (ap._Allele2_key = al2._Allele_key), " +
          "       Allele al1, " +
          "       AlleleMarkerAssoc ama1, temptab2 ttt2 " +
          " where ap._AllelePair_key = ttt2._allelepair_key " +
          "   and ap._Allele1_key = al1._Allele_key " +
          "   and al1._Allele_key = ama1._Allele_key ";
         
  public static final int ID_MARKERSYMBOL = 0;
  public static final int ID_CHROMOSOME = 1;
  public static final int ID_MUTATIONTYPE = 2;
  public static final int ID_GENOTYPE = 3;
  public static final String ALLELE_TYPE_NAME = "ALLELE_TYPE_NAME";
  public static final String MARKER_TYPE_NAME = "MARKER_TYPE_NAME";
  public static final String MARKER_KEY = "MARKER_KEY";
  public static final String MARKER_SYMBOL = "MARKER_SYMBOL";
  public static final String MARKER_ORG = "MARKER_ORG";
  public static final String MARKER_CHROM = "MARKER_CHROM";
  public static final String ACC_ID = "ACC_ID"; 
  
 
  private static MTBGeneticsUtilDAO singleton = new MTBGeneticsUtilDAO();
  private static final Logger log =
          Logger.getLogger(MTBGeneticsUtilDAO.class.getName());

  // ----------------------------------------------------------- Constructors
  /**
   * Creates a new instance of MTBGeneticsUtilDAO.
   */
  private MTBGeneticsUtilDAO() {
    super();
  }

  // --------------------------------------------------------- Public Methods
  /**
   * Get the MTBGeneticsUtilDAO singleton.
   *
   * @return MTBGeneticsUtilDAO
   */
  public static MTBGeneticsUtilDAO getInstance() {
    return singleton;
  }

  /**
   * Get a <code>Collection</code> of <b>unique</b> allele symbols.
   *
   * @return the unique allele symbols
   */
  public List<LabelValueBean<String, String>> getUniqueAlleleSymbols() {
    Connection conn = null;
    List<LabelValueBean<String, String>> alleleSymbols =
            new ArrayList<LabelValueBean<String, String>>();
    ResultSet rs = null;
    Statement stmtSelect = null;

    try {
      StringBuffer sbSelect = new StringBuffer();
      sbSelect.append("select unique symbol ");
      sbSelect.append("  from Allele ");
      sbSelect.append("  where somaticInd in (1,3) ");
      sbSelect.append(" order by symbol");

      conn = getConnection();
      stmtSelect = conn.createStatement();
      rs = stmtSelect.executeQuery(sbSelect.toString());

      while (rs.next()) {
        LabelValueBean<String, String> symbol =
                new LabelValueBean<String, String>();
        symbol.setLabel(rs.getString(1));
        symbol.setValue(rs.getString(1));
        alleleSymbols.add(symbol);
      }
    } catch (SQLException sqle) {
      log.error("Error getting unique allele symbols", sqle);
    } finally {
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    return alleleSymbols;
  }

  /**
   * Search for markers.
   */
  
   public SearchResults<MarkerDTO> searchMarker(String mgiID,
          int markerKey,
          String keyComparison,
          String nameSymbol,
          String nameComparison,
          Collection<String> markerTypes,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {
      
     Long anyOrganism = new Long(0);
      
     return searchMarker(mgiID,markerKey,keyComparison,nameSymbol,nameComparison, markerTypes,anyOrganism,null,orderBy,maxItems);
   
   }
  public SearchResults<MarkerDTO> searchMarker(String mgiID,
          int markerKey,
          String keyComparison,
          String nameSymbol,
          String nameComparison,
          Collection<String> markerTypes,
          Long organismKey,
          String chromosome,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {

    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtBatch = null;
    SearchResults<MarkerDTO> resultWrapper = new SearchResults<MarkerDTO>();
    List<MarkerDTO> markers = new ArrayList<MarkerDTO>();

    try {
      conn = getConnection();
      stmtBatch = conn.createStatement();
      

      // master query
      StringBuffer sbSelectMaster = new StringBuffer();
      sbSelectMaster.append("select m._Marker_key, m.name, m.symbol, mt.name, a.accId, o.commonName, c.chromosome ").append(EOL);
      sbSelectMaster.append("  from Marker m left join Accession a on (m._marker_key = a._object_key and a._siteinfo_key = 1 and a._mtbtypes_key = 2), ").append(EOL);
      sbSelectMaster.append("       MarkerType mt, Chromosome c, Organism o ").append(EOL);
      sbSelectMaster.append(" where m._MarkerType_key = mt._MarkerType_key ").append(EOL);
      sbSelectMaster.append("   and m._chromosome_key = c._chromosome_key and c._organism_key  = o._organism_key ").append(EOL);

      if ((StringUtils.hasValue(keyComparison)) && (markerKey > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("m._Marker_key", keyComparison, Integer.valueOf(markerKey))).append(EOL);
      }

      if (StringUtils.hasValue(mgiID)) {
        sbSelectMaster.append("   and a.accID = '").append(mgiID).append("' ").append(EOL);
      }
      
      if(StringUtils.hasValue(chromosome)){
        sbSelectMaster.append("   and c.chromosome ='").append(chromosome.toUpperCase()).append("' ").append(EOL);
      }
      
      if(organismKey.longValue()!= 0L){
         sbSelectMaster.append("   and o._organism_key =").append(organismKey).append(EOL);
      }

      // genetic name 
      if (StringUtils.hasValue(nameSymbol)) {
        sbSelectMaster.append("   and m._Marker_key in (select _Marker_key from markerkeys) ").append(EOL);

        StringBuffer sbGeneticName = new StringBuffer();
        sbGeneticName.append("create temporary table markerkeys as ");
        sbGeneticName.append("select _Marker_key ").append(EOL);
        sbGeneticName.append("  from Marker ").append(EOL);
        sbGeneticName.append(" where ").append(DAOUtils.formatCondition("name", nameComparison, nameSymbol, "'"));
        sbGeneticName.append("    or ").append(DAOUtils.formatCondition("symbol", nameComparison, nameSymbol, "'"));
        sbGeneticName.append(EOL).append(" union ").append(EOL);
        sbGeneticName.append("select ml._Marker_key ").append(EOL);
        sbGeneticName.append("  from MarkerLabel ml ").append(EOL);
        sbGeneticName.append(" where " + DAOUtils.formatCondition("ml.label", nameComparison, nameSymbol, "'") + "\n");

        stmtBatch.addBatch(sbGeneticName.toString());
      }

      // marker Types
      if ((markerTypes != null) && (markerTypes.size() > 0)) {
        sbSelectMaster.append(" and m._MarkerType_key in ( " + DAOUtils.collectionToString(markerTypes, ",", "") + ") ").append(EOL);
      }

      sbSelectMaster.append(" order by m._Marker_key ").append(EOL);

      stmtBatch.executeBatch();

      stmtSelect = conn.createStatement();
      rs = stmtSelect.executeQuery(sbSelectMaster.toString());

      while (rs.next()) {
        // m._Marker_key, m.name, m.symbol, mt.type, a.accId
        MarkerDTO dto = MarkerDAO.getInstance().createMarkerDTO();
        dto.setMarkerKey(rs.getInt(1));
        dto.setName(rs.getString(2));
        dto.setSymbol(rs.getString(3));
        dto.getDataBean().put(MARKER_TYPE_NAME, rs.getString(4));
        dto.getDataBean().put(ACC_ID, rs.getString(5));
        dto.getDataBean().put(MARKER_ORG,rs.getString(6));
        dto.getDataBean().put(MARKER_CHROM,rs.getString(7));
        
        markers.add(dto);
      }
    } catch (SQLException sqle) {
      throw new DAOException(sqle);
    } finally {
      close(stmtBatch);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    resultWrapper.setList(markers);
    resultWrapper.setTotal(markers.size());

    return resultWrapper;
  }

  /**
   * Search for alleles.
   */
  
   public SearchResults<AlleleDTO> searchAllele(String mgiID,
          int alleleKey,
          String keyComparison,
          String geneticName,
          Collection<String> alleleTypes,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {
    
     return searchAllele(mgiID,alleleKey,keyComparison,geneticName,alleleTypes,null,0,orderBy,maxItems);
     
   }
  
  public SearchResults<AlleleDTO> searchAllele(String mgiID,
          int alleleKey,
          String keyComparison,
          String geneticName,
          Collection<String> alleleTypes,
          String markerKeyComparison, int markerKey,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {
    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtBatch = null;
    SearchResults<AlleleDTO> resultWrapper = new SearchResults<AlleleDTO>();
    List<AlleleDTO> alleles = new ArrayList<AlleleDTO>();

    try {
      conn = getConnection();
      stmtBatch = conn.createStatement();

      // master query
      StringBuffer sbSelectMaster = new StringBuffer();
      sbSelectMaster.append("select a._Allele_key, ay.type, a.name, a.symbol, m._Marker_key, m.symbol markerSymbol, ").append(EOL);
      sbSelectMaster.append("       (select accID from Accession where a._Allele_key = _Object_key and _MTBTypes_key = 3 and _SiteInfo_key = 1) accID ").append(EOL);
      sbSelectMaster.append("  from Allele a left join (AlleleMarkerAssoc ama join Marker m on (ama._marker_key = m._marker_key)) on (a._allele_key = ama._allele_key), ").append(EOL);
      sbSelectMaster.append("       AlleleType ay ").append(EOL);
    
      sbSelectMaster.append(" where a._AlleleType_key = ay._AlleleType_key ").append(EOL);
     
      if ((StringUtils.hasValue(keyComparison)) && (alleleKey > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("a._Allele_key", keyComparison, Integer.valueOf(alleleKey))).append(EOL);
      }
      
      if ((StringUtils.hasValue(markerKeyComparison)) && (markerKey > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("m._marker_key", markerKeyComparison, Integer.valueOf(markerKey))).append(EOL);
      }

      // main temp table
      StringBuffer sbSelectTemp = new StringBuffer();
      sbSelectTemp.append("create temporary table temptab as ");
      sbSelectTemp.append("select a._Allele_key").append(EOL);
      sbSelectTemp.append("  from Allele a ").append(EOL);
      sbSelectTemp.append(" where 1 = 1 ").append(EOL);  // don't have to figure out if next cluase shoud start with 'where' or 'and' later on

      boolean useTempTab = false;

      if (StringUtils.hasValue(mgiID)) {
        sbSelectMaster.append("  and a._Allele_key in (select _Object_key from Accession where accID = '").append(mgiID).append("' and _MTBTypes_key = 3 and _SiteInfo_key = 1) ").append(EOL);
      }

      // genetic name
      if (StringUtils.hasValue(geneticName)) {
        sbSelectMaster.append("   and a._Allele_key in (select _Allele_key from temptab) ").append(EOL);
        sbSelectTemp.insert(sbSelectTemp.indexOf("from")+4, " allelekeys tak, ");
        sbSelectTemp.append("   and a._Allele_key = tak._Allele_key ").append(EOL);
        useTempTab = true;

        StringBuffer sbGeneticName = new StringBuffer();
        sbGeneticName.append("create temporary table allelekeys as ").append(EOL);
        sbGeneticName.append("select _Allele_key ").append(EOL);
        sbGeneticName.append("  from Allele ").append(EOL);
        sbGeneticName.append(" where ").append(DAOUtils.formatCondition("name", "contains", geneticName, "'"));
        sbGeneticName.append("    or ").append(DAOUtils.formatCondition("symbol", "contains", geneticName, "'"));
        sbGeneticName.append(EOL).append(" union ").append(EOL);
        sbGeneticName.append("select ama._Allele_key ").append(EOL);
        sbGeneticName.append("  from AlleleMarkerAssoc ama, ").append(EOL);
        sbGeneticName.append("       MarkerLabel m ").append(EOL);
        sbGeneticName.append(" where ama._Marker_key = m._Marker_key ").append(EOL);
        sbGeneticName.append("   and " + DAOUtils.formatCondition("label", "contains", geneticName, "'") + "\n");

        stmtBatch.addBatch(sbGeneticName.toString());
      }

      // allele Types
      if ((alleleTypes != null) && (alleleTypes.size() > 0)) {
        if (!useTempTab) {
          sbSelectMaster.append("   and a._Allele_key in (select _Allele_key from temptab) ").append(EOL);
          useTempTab = true;
        }
        sbSelectTemp.insert(sbSelectTemp.indexOf("from")+4, " allelekeystypes takt, ");
        sbSelectTemp.append("   and a._Allele_key = takt._Allele_key  ").append(EOL);

        StringBuffer sbAlleleTypes = new StringBuffer();
        sbAlleleTypes.append("create temporary table allelekeystypes as ").append(EOL);
        sbAlleleTypes.append("select _Allele_key ").append(EOL);
        sbAlleleTypes.append("  from Allele ").append(EOL);
        sbAlleleTypes.append(" where _AlleleType_key in ( " + DAOUtils.collectionToString(alleleTypes, ",", "") + ") ").append(EOL);

        stmtBatch.addBatch(sbAlleleTypes.toString());
      }

      stmtBatch.addBatch(sbSelectTemp.toString());

      sbSelectMaster.append(" order by a._Allele_key ").append(EOL);

      stmtBatch.executeBatch();

      stmtSelect = conn.createStatement();
      rs = stmtSelect.executeQuery(sbSelectMaster.toString());

      while (rs.next()) {
        // a._Allele_key, ay.type, a.name, a.symbol, m._Marker_key, m.symbol
        AlleleDTO dto = AlleleDAO.getInstance().createAlleleDTO();
        dto.setAlleleKey(rs.getInt(1));
        dto.setName(rs.getString(3));
        dto.setSymbol(rs.getString(4));
        dto.getDataBean().put(ALLELE_TYPE_NAME, rs.getString(2));
        dto.getDataBean().put(MARKER_KEY, Integer.valueOf(rs.getInt(5)));
        dto.getDataBean().put(MARKER_SYMBOL, rs.getString(6));
        dto.getDataBean().put(ACC_ID, rs.getString(7));
        alleles.add(dto);
      }
    } catch (SQLException sqle) {
      throw new DAOException(sqle);
    } finally {
      close(stmtBatch);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    resultWrapper.setList(alleles);
    resultWrapper.setTotal(alleles.size());

    return resultWrapper;
  }

  /**
   * Search for allele pairs.
   */
  public SearchResults<MTBGeneticsAllelePairSearchDTO> searchAllelePair(int allelePairKey,
          String keyComparison,
          int allele1Key,
          String allele1KeyComparison,
          int allele2Key,
          String allele2KeyComparison,
          String geneticName,
          Collection<String> alleleTypes,
          boolean mustHaveStrains,
          boolean mustHaveTF,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {

    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtBatch = null;  
    SearchResults<MTBGeneticsAllelePairSearchDTO> resultWrapper =
            new SearchResults<MTBGeneticsAllelePairSearchDTO>();
    List<MTBGeneticsAllelePairSearchDTO> genotypes =
            new ArrayList<MTBGeneticsAllelePairSearchDTO>();

    try {
      conn = getConnection();
      stmtBatch = conn.createStatement();

      // master query
      StringBuffer sbSelectMaster = new StringBuffer(SQL_ALLELE_SEARCH);

      if ((StringUtils.hasValue(keyComparison)) && (allelePairKey > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("ap._AllelePair_key", keyComparison, Integer.valueOf(allelePairKey))).append(EOL);
      }

      if ((StringUtils.hasValue(allele1KeyComparison)) && (allele1Key > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("al1._Allele_key", allele1KeyComparison, Integer.valueOf(allele1Key))).append(EOL);
      }

      if ((StringUtils.hasValue(allele2KeyComparison)) && (allele2Key > 0)) {
        sbSelectMaster.append("   and ").append(DAOUtils.formatNumericCondition("al2._Allele_key", allele2KeyComparison, Integer.valueOf(allele2Key))).append(EOL);
      }

      if (mustHaveStrains) {
        sbSelectMaster.insert(sbSelectMaster.lastIndexOf("from ")+5, " Genotype gt, ");
        sbSelectMaster.append("   and ap._AllelePair_key = gt._AllelePair_key ").append(EOL);
      }

      if (mustHaveTF) {
        sbSelectMaster.insert(sbSelectMaster.lastIndexOf("from ")+5, " TumorGenetics tg, ");
        sbSelectMaster.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      }

      // main temp table
      StringBuffer sbSelectTemp = new StringBuffer();
      sbSelectTemp.append("create temporary table temptab as ").append(EOL);
      sbSelectTemp.append("select a._Allele_key").append(EOL);
      sbSelectTemp.append("  from Allele a ").append(EOL);
      sbSelectTemp.append(" where 1 = 1 ").append(EOL);

      // genetic name
      if (StringUtils.hasValue(geneticName)) {
        sbSelectTemp.insert(sbSelectTemp.indexOf("from ")+5, " allelekeys tak, ");
        sbSelectTemp.append("   and a._Allele_key = tak._Allele_key ").append(EOL);

        StringBuffer sbGeneticName = new StringBuffer();
        sbGeneticName.append("create temporary table allelekeys as ").append(EOL);
        sbGeneticName.append("select _Allele_key ").append(EOL);
        sbGeneticName.append("  from Allele ").append(EOL);
        sbGeneticName.append(" where ").append(DAOUtils.formatCondition("name", "contains", geneticName, "'"));
        sbGeneticName.append("    or ").append(DAOUtils.formatCondition("symbol", "contains", geneticName, "'"));
        sbGeneticName.append(EOL).append(" union ").append(EOL);
        sbGeneticName.append("select ama._Allele_key ").append(EOL);
        sbGeneticName.append("  from AlleleMarkerAssoc ama, ").append(EOL);
        sbGeneticName.append("       MarkerLabel m ").append(EOL);
        sbGeneticName.append(" where ama._Marker_key = m._Marker_key ").append(EOL);
        sbGeneticName.append("   and " + DAOUtils.formatCondition("label", "contains", geneticName, "'") + "\n");

        stmtBatch.addBatch(sbGeneticName.toString());
      }

      // allele Types
      if ((alleleTypes != null) && (alleleTypes.size() > 0)) {
        sbSelectTemp.insert(sbSelectTemp.indexOf("from ")+5, " allelekeystypes takt, ");
        sbSelectTemp.append("   and a._Allele_key = takt._Allele_key  ").append(EOL);

        StringBuffer sbAlleleTypes = new StringBuffer();
        sbAlleleTypes.append("create temporary table allelekeystypes as ").append(EOL);
        sbAlleleTypes.append("select _Allele_key ").append(EOL);
        sbAlleleTypes.append("  from Allele ").append(EOL);
        sbAlleleTypes.append(" where _AlleleType_key in ( " + DAOUtils.collectionToString(alleleTypes, ",", "") + ") ").append(EOL);

        stmtBatch.addBatch(sbAlleleTypes.toString());
      }

      stmtBatch.addBatch(sbSelectTemp.toString());
      stmtBatch.addBatch("create temporary table temptab2 as select ap._AllelePair_key from AllelePair ap, temptab ttt where ap._allele1_key = ttt._allele_key ");
      stmtBatch.addBatch("insert into temptab2 select ap._AllelePair_key from AllelePair ap, temptab ttt where ap._allele2_key = ttt._allele_key ");
      stmtBatch.addBatch(" create index idx_tmptt2  on temptab2 ( _allelePair_key) ");
      
      
      sbSelectMaster.append(" order by _AllelePair_key ").append(EOL);
     
      stmtBatch.executeBatch();

      stmtSelect = conn.createStatement();

      rs = stmtSelect.executeQuery(sbSelectMaster.toString());

      while (rs.next()) {
        MTBGeneticsAllelePairSearchDTO dto = new MTBGeneticsAllelePairSearchDTO();
        dto.setAllelePairKey(rs.getInt(1));
        dto.setAllele1Key(rs.getInt(8));
        dto.setAllele1Name(rs.getString(4));
        dto.setAllele1Symbol(rs.getString(6));
        //dto.setAllele1TypeKey(rs.geInt(2));
        dto.setAllele2Key(rs.getInt(9));
        dto.setAllele2Name(rs.getString(5));
        dto.setAllele2Symbol(rs.getString(7));
        //dto.setAllele2TypeKey(rs.getInt(3));
        dto.setNumAssociatedStrains(rs.getInt(10));
        dto.setNumAssociatedTFs(rs.getInt(11));
        dto.setAllele1Type(rs.getString(12));
        dto.setAllele2Type(rs.getString(13));
        genotypes.add(dto);
      }

    } catch (SQLException sqle) {
      throw new DAOException(sqle);
    } finally {
      close(stmtBatch);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    // here is where the magic of sorting and returning the corect number
    // of rows happens
    MTBGeneticsAllelePairSearchDTO geneticsArrTemp[] = (MTBGeneticsAllelePairSearchDTO[]) genotypes.toArray(new MTBGeneticsAllelePairSearchDTO[genotypes.size()]);
    MTBGeneticsAllelePairSearchDTO geneticsArr[] = null;

    if ("mutation".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsAllelePairSearchComparator(MTBGeneticsUtilDAO.ID_MUTATIONTYPE));
    } else if ("gene".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsAllelePairSearchComparator(MTBGeneticsUtilDAO.ID_MARKERSYMBOL));
    } else if ("chromosome".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsAllelePairSearchComparator(MTBGeneticsUtilDAO.ID_CHROMOSOME));
    }

    if (maxItems > 0) {
      geneticsArr = new MTBGeneticsAllelePairSearchDTO[Math.min(maxItems, geneticsArrTemp.length)];
      System.arraycopy(geneticsArrTemp, 0, geneticsArr, 0, Math.min(maxItems, geneticsArrTemp.length));
      genotypes = new ArrayList<MTBGeneticsAllelePairSearchDTO>(Arrays.asList(geneticsArr));
    } else {
      genotypes = new ArrayList<MTBGeneticsAllelePairSearchDTO>(Arrays.asList(geneticsArrTemp));
    }

    resultWrapper.setList(genotypes);
    resultWrapper.setTotal(genotypes.size());

    return resultWrapper;
  }

  public SearchResults<MTBGeneticsSearchDTO> searchStrainGenetics(String allele,
          String alleleComparison,
          String marker,
          String markerComparison,
          Collection chromosomes,
          Collection mutations,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {

    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtBatch = null;
    SearchResults<MTBGeneticsSearchDTO> resultWrapper =
            new SearchResults<MTBGeneticsSearchDTO>();
//    Map<StringBuffer, MTBGeneticsSearchDTO> g =
//           new HashMap<StringBuffer, MTBGeneticsSearchDTO>();
   Map<Integer,MTBGeneticsSearchDTO> resMap =
            new HashMap<Integer,MTBGeneticsSearchDTO>();

    try {
      conn = getConnection();
      stmtBatch = conn.createStatement();

      // master query
      StringBuffer sbSelectMaster = new StringBuffer();
      sbSelectMaster.append("select distinct ").append(EOL);
      sbSelectMaster.append("       ay1.type ay1Type, ").append(EOL);
      sbSelectMaster.append("       ay2.type ay2Type, ").append(EOL);
      sbSelectMaster.append("       ay1.sortOrder ay1sortOrder, ").append(EOL);
      sbSelectMaster.append("       coalesce(ay2.sortOrder, 10000) ay2sortOrder, ").append(EOL);
      sbSelectMaster.append("       m.chromosome, ").append(EOL);
      sbSelectMaster.append("       m._AllelePair_key,  ").append(EOL);
      sbSelectMaster.append("       (select count(distinct _Strain_key) from Genotype g1 where g1._AllelePair_key = m._AllelePair_key) cnt, ").append(EOL);
      sbSelectMaster.append("       al1.name a1name, ").append(EOL);
      sbSelectMaster.append("       al1.symbol a1symbol, ").append(EOL);
      sbSelectMaster.append("       al1.somaticInd a1somaticInd, ").append(EOL);
      sbSelectMaster.append("       al2.name a2name, ").append(EOL);
      sbSelectMaster.append("       al2.symbol a2symbol, ").append(EOL);
      sbSelectMaster.append("       al2.somaticInd a2somaticInd, ").append(EOL);
      sbSelectMaster.append("       m.organism, ").append(EOL);
      sbSelectMaster.append("       m.markerSymbol, ").append(EOL);
      sbSelectMaster.append("       m.markerName, ").append(EOL);
      sbSelectMaster.append("       m.markerAssocTypeName ").append(EOL);
      sbSelectMaster.append("  from temptab m left join (Allele al2 join ").append(EOL);
      sbSelectMaster.append("             AlleleType ay2 on (al2._alleletype_key = ay2._alleletype_key)) ");
      sbSelectMaster.append("             on (m._allele2_key = al2._allele_key), ").append(EOL);
      sbSelectMaster.append("       Allele al1, ").append(EOL);
      sbSelectMaster.append("       AlleleType ay1 ").append(EOL);
      sbSelectMaster.append(" where m._Allele1_key = al1._Allele_key ").append(EOL);
      sbSelectMaster.append("   and al1._AlleleType_key = ay1._AlleleType_key ").append(EOL);

      // main temp table
      StringBuffer sbSelectTemp = new StringBuffer();
      sbSelectTemp.append("create temporary table temptab as ").append(EOL);
      sbSelectTemp.append("select c.chromosome, m._Marker_key, m.name markerName, amat.name markerAssocTypeName, ").append(EOL);
      sbSelectTemp.append("       m.symbol markerSymbol, o.commonName organism, ap._AllelePair_key, ap._Allele1_key, ap._Allele2_key, ").append(EOL);
      sbSelectTemp.append("       (select _AlleleType_key from Allele where _Allele_key = ap._Allele1_key) a1Type_key, ").append(EOL);
      sbSelectTemp.append("       (select _AlleleType_key from Allele where _Allele_key = ap._Allele2_key) a2Type_key ").append(EOL);
      sbSelectTemp.append("  from Chromosome c, ").append(EOL);
      sbSelectTemp.append("       Organism o, ").append(EOL);
      sbSelectTemp.append("       Marker m, ").append(EOL);
      sbSelectTemp.append("       AlleleMarkerAssoc ama, ").append(EOL);
      sbSelectTemp.append("       AlleleMarkerAssocType amat, ").append(EOL);
      sbSelectTemp.append("       Allele a, ").append(EOL);
      sbSelectTemp.append("       AllelePair ap, Genotype g ").append(EOL);
      sbSelectTemp.append(" where a._Allele_key = ap._Allele1_key ").append(EOL);
      sbSelectTemp.append("   and a._Allele_key = ama._Allele_key ").append(EOL);
      sbSelectTemp.append("   and m._Marker_key = ama._Marker_key ").append(EOL);
      sbSelectTemp.append("   and ap._allelepair_key = g._allelepair_key ").append(EOL);
      sbSelectTemp.append("   and ama._alleleMarkerAssocType_key = amat._allelemarkerassoctype_key ").append(EOL);
      sbSelectTemp.append("   and m._Chromosome_key = c._Chromosome_key ").append(EOL);
      sbSelectTemp.append("   and c._Organism_key = o._Organism_key ").append(EOL);
      sbSelectTemp.append("   and( ap._Allele1_key in ( Select _allele_key from allelekeys )  ").append(EOL);
      sbSelectTemp.append("   or ap._Allele2_key in ( Select _allele_key from allelekeys2 )) ").append(EOL);
   
      // allele temp table
      StringBuffer sbNameSelect = new StringBuffer();
      sbNameSelect.append("create temporary table allelekeys as ").append(EOL);
      sbNameSelect.append("select a._Allele_key ").append(EOL);
      sbNameSelect.append("  from Allele a, ").append(EOL);
      sbNameSelect.append("       AlleleMarkerAssoc ama, ");
      sbNameSelect.append("       Marker m ").append(EOL);
      sbNameSelect.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbNameSelect.append("   and ama._Marker_key = m._Marker_key ").append(EOL);
      sbNameSelect.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbNameSelect.append("   and a.somaticInd in (1,3) ").append(EOL);

      // marker temp table
      StringBuffer sbNameSelect2 = new StringBuffer();
      sbNameSelect2.append("create temporary table markerallelekeys as ").append(EOL);
      sbNameSelect2.append("select ama._Marker_key ").append(EOL);
      sbNameSelect2.append("  from Allele a, ").append(EOL);
      sbNameSelect2.append("       AlleleMarkerAssoc ama ");
      sbNameSelect2.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbNameSelect2.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbNameSelect2.append("   and a.somaticInd in (1,3) ").append(EOL);

      // allele
      if (StringUtils.hasValue(allele)) {
       
        sbNameSelect.append(" and ( ").append(DAOUtils.formatCondition("a.name", alleleComparison, allele, "'"));
        sbNameSelect.append("    or ").append(DAOUtils.formatCondition("a.symbol", alleleComparison, allele, "'")).append(") ");
        
        sbNameSelect2.append("   and (").append(DAOUtils.formatCondition("a.name", alleleComparison, allele, "'"));
        sbNameSelect2.append("        or ").append(DAOUtils.formatCondition("a.symbol", alleleComparison, allele, "'")).append(')');
        
        
        StringBuffer sbAlleleName = new StringBuffer();
        sbAlleleName.append("create temporary table tempalleles as ").append(EOL);
        sbAlleleName.append("select _Allele_key ").append(EOL);
        sbAlleleName.append("  from Allele ").append(EOL);
        sbAlleleName.append(" where ").append(DAOUtils.formatCondition("name", alleleComparison, allele, "'"));
        sbAlleleName.append("    or ").append(DAOUtils.formatCondition("symbol", alleleComparison, allele, "'"));
      
      
      
      }

      // marker
      if (StringUtils.hasValue(marker)) {
        sbNameSelect.insert(sbNameSelect.indexOf("Marker m")+9,", MarkerLabel ml ");
        sbNameSelect.append(" and m._Marker_key = ml._marker_key ");
        sbNameSelect.append(" and " + DAOUtils.formatCondition("ml.label", markerComparison, marker, "'") + "\n");
        
      }

      // chromosomes
      if ((chromosomes != null) && (chromosomes.size() > 0)) {
        sbSelectTemp.append("   and c._Chromosome_key in ( " + DAOUtils.collectionToString(chromosomes, ",", "") + ") ").append(EOL);
      }

      // mutations
      if ((mutations != null) && (mutations.size() != 0)) {
        sbSelectMaster.append("  and (ay1._AlleleGroupType_key in ( " + DAOUtils.collectionToString(mutations, ",", "") + ") ").append(EOL);
        sbSelectMaster.append("      or ay2._AlleleGroupType_key in ( " + DAOUtils.collectionToString(mutations, ",", "") + ")) ").append(EOL);
      }

      sbSelectTemp.append(" order by _AllelePair_key ").append(EOL);

      stmtBatch.addBatch(sbNameSelect.toString());
      
      log.debug(sbNameSelect.toString());
     
      stmtBatch.addBatch("create temporary table allelekeys2 as select * from allelekeys");
      
      log.debug("create temporary table allelekeys2 as select * from allelekeys");
      
      stmtBatch.addBatch("create index idx_tak  on allelekeys(_allele_key)" );
      stmtBatch.addBatch("create index idx_tak2  on allelekeys2(_allele_key)" );
      
      stmtBatch.addBatch(sbNameSelect2.toString());
      
      log.debug(sbNameSelect2.toString());
      
      stmtBatch.addBatch(sbSelectTemp.toString());
     
      log.debug(sbSelectTemp.toString());
      
      stmtBatch.executeBatch();
      
      sbSelectMaster.append(" order by ay1.type, ay2.type ").append(EOL);

      stmtSelect = conn.createStatement();
      
      log.debug(sbSelectMaster.toString());
      
      rs = stmtSelect.executeQuery(sbSelectMaster.toString());

      List<MTBGeneticsSearchGenotypeDTO> genotypes = null;
      String tempAlleleType = null;
      String a1Symbol = null;
      String a2Symbol = null;

      int count = 0;
      
      // results with matching allele pair keys are combined
      // adding the distinct gene symbol, name and maker type
      while (rs.next()) {
        Integer allelePairKey = new Integer(rs.getInt(6));
        String markerType = rs.getString(17);
        
        if(resMap.containsKey(allelePairKey)){
          MTBGeneticsSearchDTO currentGenetic = resMap.get(allelePairKey);
          if("Allele Of".equals(markerType)|| "Expressed Component".equals(markerType)){
            currentGenetic.setGeneSymbol(rs.getString(15));
            currentGenetic.setGeneName(rs.getString(16));
          }else{
            currentGenetic.addPromotersEnhancers(rs.getString(15)+", "+rs.getString(16)+" ("+markerType+")");
          }  
          
          
        }else{
        a1Symbol = DAOUtils.nvl(rs.getString(9), "");
        a2Symbol = DAOUtils.nvl(rs.getString(12), "");

        // don't include '+/+'  (homozygous wildtype)
        if ((a1Symbol.indexOf("+") < 0) || (a2Symbol.indexOf("+") < 0)) {
          MTBGeneticsSearchDTO currentGenetic = new MTBGeneticsSearchDTO();
          tempAlleleType = fixAlleleType(rs.getString(1), rs.getString(2));
          currentGenetic.setAlleleType(tempAlleleType);
         
          currentGenetic.setChromosome(rs.getString(5));
          currentGenetic.setOrganism(StringUtils.initCap(rs.getString(14)));
          
          if("Allele Of".equals(markerType) || "Expressed Component".equals(markerType)){
            currentGenetic.setGeneSymbol(rs.getString(15));
            currentGenetic.setGeneName(rs.getString(16));
          }else{
            currentGenetic.addPromotersEnhancers(rs.getString(15)+", "+rs.getString(16)+"("+markerType+")");
          }  
          
          

          if (tempAlleleType.toLowerCase().indexOf("transgene") >= 0) {
            currentGenetic.setChromosome(null);
            currentGenetic.setIsTransgene(true);
          }

  
        
          currentGenetic.setAllele1Symbol(a1Symbol);
          currentGenetic.setAllele2Symbol(a2Symbol);
          
          currentGenetic.setAllelePairKey(allelePairKey);
          currentGenetic.setAllelePairCount(rs.getInt(7));
       
          
   
          
            resMap.put(allelePairKey,currentGenetic);
        }
        }
       
      }
   
    } catch (SQLException sqle) {
     
      log.error("Error searching for strain genetics.", sqle);
      throw new DAOException(sqle);
    } finally {
      close(stmtBatch);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    
    List<MTBGeneticsSearchDTO> list = new ArrayList<MTBGeneticsSearchDTO>();
   
    // here is where the magic of sorting and returning the corect number
    // of rows happens
    MTBGeneticsSearchDTO geneticsArrTemp[] = (MTBGeneticsSearchDTO[]) resMap.values().toArray(new MTBGeneticsSearchDTO[list.size()]);
    MTBGeneticsSearchDTO geneticsArr[] = null;

    if ("mutation type".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_MUTATIONTYPE));
    } else if ("gene symbol".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_MARKERSYMBOL));
    } else if ("chromosome".equalsIgnoreCase(orderBy)) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_CHROMOSOME));
    }

    if (maxItems > 0) {
      geneticsArr = new MTBGeneticsSearchDTO[Math.min(maxItems, geneticsArrTemp.length)];
      System.arraycopy(geneticsArrTemp, 0, geneticsArr, 0, Math.min(maxItems, geneticsArrTemp.length));
      list = new ArrayList<MTBGeneticsSearchDTO>(Arrays.asList(geneticsArr));
    } else {
      list = new ArrayList<MTBGeneticsSearchDTO>(Arrays.asList(geneticsArrTemp));
    }

    resultWrapper.setList(list);
    resultWrapper.setTotal(geneticsArrTemp.length);
    

    return resultWrapper;
  }

  /**
   * Search for tumor genetics.
   */
  public SearchResults<MTBGeneticsSearchDTO> searchTumorGenetics(String allele,
          String alleleComparison,
          String marker,
          String markerComparison,
          Collection chromosomes,
          Collection mutations,
          String orderBy,
          int maxItems)
          throws NullPointerException, IllegalArgumentException, DAOException {
    
    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtBatch = null;
    SearchResults<MTBGeneticsSearchDTO> resultWrapper =
            new SearchResults<MTBGeneticsSearchDTO>();
    Map<String, MTBGeneticsSearchDTO> g = new HashMap<String, MTBGeneticsSearchDTO>();

    try {
      conn = getConnection();
      stmtBatch = conn.createStatement();

      // master query
      StringBuffer sbSelectMaster = new StringBuffer();
      sbSelectMaster.append("select distinct ").append(EOL);
      sbSelectMaster.append("       ay1.type ay1Type, ").append(EOL);
      sbSelectMaster.append("       ay1._AlleleType_key ay1TypeKey, ").append(EOL);
      sbSelectMaster.append("       ay1.sortOrder ay1sortOrder, ").append(EOL);
      sbSelectMaster.append("       m.chromosome, ").append(EOL);
      sbSelectMaster.append("       (select cnt from count tc where tc._alleletype_key = m._alleletype_key and tc._marker_key = m._marker_key) cnt, ").append(EOL);
      sbSelectMaster.append("       al1._Allele_key al1key, ").append(EOL);
      sbSelectMaster.append("       al1.name al1name, ").append(EOL);
      sbSelectMaster.append("       al1.symbol al1symbol, ").append(EOL);
      sbSelectMaster.append("       al1.somaticInd al1somaticInd, ").append(EOL);
      sbSelectMaster.append("       m.organism, ").append(EOL);
      sbSelectMaster.append("       m._Marker_key, ").append(EOL);
      sbSelectMaster.append("       m.markerSymbol, ").append(EOL);
      sbSelectMaster.append("       m.markerName ").append(EOL);
      sbSelectMaster.append("  from temptab m, ").append(EOL);
      sbSelectMaster.append("       Allele al1, ").append(EOL);
      sbSelectMaster.append("       AlleleType ay1 ").append(EOL);
      sbSelectMaster.append(" where al1._Allele_key = m._Allele_key ").append(EOL);
      sbSelectMaster.append("   and al1._AlleleType_key = ay1._AlleleType_key ").append(EOL);

      // main temp table
      StringBuffer sbSelectTemp = new StringBuffer();
      sbSelectTemp.append("create temporary table temptab as ").append(EOL);
      sbSelectTemp.append("select distinct c.chromosome, m._Marker_key, m.name markerName, m.symbol markerSymbol, o.commonName organism, ").append(EOL);
      sbSelectTemp.append("       a._Allele_key _Allele_key, a.somaticInd, a._AlleleType_key").append(EOL);
      sbSelectTemp.append("  from Chromosome c, ").append(EOL);
      sbSelectTemp.append("       Organism o, ").append(EOL);
      sbSelectTemp.append("       Marker m, ").append(EOL);
      sbSelectTemp.append("       AlleleMarkerAssoc ama, ").append(EOL);
      sbSelectTemp.append("       Allele a, ").append(EOL);
      sbSelectTemp.append("       allelekeys tak, ").append(EOL);
      sbSelectTemp.append("       markerallelekeys tmak ").append(EOL);
      sbSelectTemp.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbSelectTemp.append("   and m._Marker_key = ama._Marker_key ").append(EOL);
      sbSelectTemp.append("   and m._Chromosome_key = c._Chromosome_key ").append(EOL);
      sbSelectTemp.append("   and c._Organism_key = o._Organism_key ").append(EOL);
      sbSelectTemp.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbSelectTemp.append("   and a.somaticInd in (2,3) ").append(EOL);
      sbSelectTemp.append("   and a._Allele_key = tak._Allele_key ").append(EOL);
      sbSelectTemp.append("   and m._Marker_key = tmak._Marker_key ").append(EOL);
      
      StringBuffer sbTGATemp = new StringBuffer();
      
      sbTGATemp.append(" create temporary table tga as" ).append(EOL);
      sbTGATemp.append(" select distinct temp._tumorgenetics_key, temp._allele_key from (" ).append(EOL);
      sbTGATemp.append(" select tg._tumorgenetics_key _tumorgenetics_key, ap._allele1_key _allele_key" ).append(EOL);
      sbTGATemp.append(" from   AllelePair ap," ).append(EOL);
      sbTGATemp.append("   TumorGenetics tg" ).append(EOL);
      sbTGATemp.append(" where tg._allelepair_key = ap._allelepair_key" ).append(EOL);
      sbTGATemp.append(" union" ).append(EOL);
      sbTGATemp.append(" select tg._tumorgenetics_key _tumorgentics_key, ap._allele2_key _allele_key" ).append(EOL);
      sbTGATemp.append(" from   AllelePair ap," ).append(EOL);
      sbTGATemp.append("  TumorGenetics tg" ).append(EOL);
      sbTGATemp.append(" where tg._allelepair_key = ap._allelepair_key" ).append(EOL);
      sbTGATemp.append(" ) as temp" ).append(EOL);
      
      StringBuffer sbCountTemp = new StringBuffer();
      sbCountTemp.append("create temporary table count as ");
      sbCountTemp.append(" select count(distinct tga._tumorgenetics_key) cnt, t._marker_key, t._alleletype_key ");
	    sbCountTemp.append("       from temptab t, tga tga ");
      sbCountTemp.append(" where t._Allele_key = tga._Allele_key ");
      sbCountTemp.append("   group by t._marker_key, t._alleletype_key ");

      // allele temp table
      StringBuffer sbAllele1Select = new StringBuffer();
      // allele 1 key
      sbAllele1Select.append("create temporary table allelekeys as ").append(EOL);
      sbAllele1Select.append("select distinct a._Allele_key ").append(EOL);
      sbAllele1Select.append("  from Allele a, ").append(EOL);
      sbAllele1Select.append("       AlleleMarkerAssoc ama, ");
      sbAllele1Select.append("       AllelePair ap, ");
      sbAllele1Select.append("       TumorGenetics tg, ");
      sbAllele1Select.append("       Marker m ").append(EOL);
      sbAllele1Select.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbAllele1Select.append("   and a._Allele_key = ap._Allele1_key  ").append(EOL);
      sbAllele1Select.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      sbAllele1Select.append("   and ama._Marker_key = m._Marker_key ").append(EOL);
      sbAllele1Select.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbAllele1Select.append("   and a.somaticInd in (2,3) ");
      
      
      // using an insert is faster than having an "or" stmt in the first query

      StringBuffer sbAllele2Select = new StringBuffer();
      // allele 2 key
      sbAllele2Select.append("insert into allelekeys ").append(EOL);
      sbAllele2Select.append("select distinct a._Allele_key ").append(EOL);
      sbAllele2Select.append("  from Allele a, ").append(EOL);
      sbAllele2Select.append("       AlleleMarkerAssoc ama, ");
      sbAllele2Select.append("       AllelePair ap, ");
      sbAllele2Select.append("       TumorGenetics tg, ");
      sbAllele2Select.append("       Marker m ").append(EOL);
      sbAllele2Select.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbAllele2Select.append("   and a._Allele_key = ap._Allele2_key ").append(EOL);
      sbAllele2Select.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      sbAllele2Select.append("   and ama._Marker_key = m._Marker_key ").append(EOL);
      sbAllele2Select.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbAllele2Select.append("   and a.somaticInd in (2,3) ").append(EOL);
     

      // marker temp table
      // allele 1 key
      StringBuffer sbMarkerASelect = new StringBuffer();
      sbMarkerASelect.append("create temporary table markerallelekeys as ").append(EOL);
      sbMarkerASelect.append("select distinct ama._Marker_key ").append(EOL);
      sbMarkerASelect.append("  from Allele a, ").append(EOL);
      sbMarkerASelect.append("       AlleleMarkerAssoc ama, ");
      sbMarkerASelect.append("       AllelePair ap, ");
      sbMarkerASelect.append("       TumorGenetics tg, ");
      sbMarkerASelect.append("       Marker m ").append(EOL);
      sbMarkerASelect.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbMarkerASelect.append("   and a._Allele_key = ap._Allele1_key ").append(EOL);
      sbMarkerASelect.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      sbMarkerASelect.append("   and ama._Marker_key = m._Marker_key ").append(EOL);
      sbMarkerASelect.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbMarkerASelect.append("   and a.somaticInd in (2,3) ");
     

      StringBuffer sbMarkerBSelect = new StringBuffer();
      // allele 2 key
      sbMarkerBSelect.append("insert into markerallelekeys ");
      sbMarkerBSelect.append("select distinct ama._Marker_key ").append(EOL);
      sbMarkerBSelect.append("  from Allele a, ").append(EOL);
      sbMarkerBSelect.append("       AlleleMarkerAssoc ama, ");
      sbMarkerBSelect.append("       AllelePair ap, ");
      sbMarkerBSelect.append("       TumorGenetics tg, ");
      sbMarkerBSelect.append("       Marker m ").append(EOL);
      sbMarkerBSelect.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
      sbMarkerBSelect.append("   and a._Allele_key = ap._Allele2_key ").append(EOL);
      sbMarkerBSelect.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      sbMarkerBSelect.append("   and ama._Marker_key = m._Marker_key ").append(EOL);
      sbMarkerBSelect.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      sbMarkerBSelect.append("   and a.somaticInd in (2,3) ").append(EOL);
     

      // allele
      if (StringUtils.hasValue(allele)) {
        sbAllele1Select.insert(sbAllele1Select.indexOf("from ")+5, "tempalleles tta, ");
        sbAllele1Select.append(" and a._Allele_key = tta._Allele_key ").append(EOL);
        
        sbAllele2Select.insert(sbAllele2Select.indexOf("from ")+5, "tempalleles tta, ");
        sbAllele2Select.append(" and a._Allele_key = tta._Allele_key ").append(EOL);

        sbMarkerASelect.insert(sbMarkerASelect.indexOf("from ")+5, "tempallelesmarkers ttam, ");
        sbMarkerASelect.append(" and m._Marker_key = ttam._Marker_key  ").append(EOL);
        
        sbMarkerBSelect.insert(sbMarkerBSelect.indexOf("from ")+5, "tempallelesmarkers ttam, ");
        sbMarkerBSelect.append(" and m._Marker_key = ttam._Marker_key  ").append(EOL);

        StringBuffer sbAlleleName = new StringBuffer();
        sbAlleleName.append("create temporary table tempalleles as ").append(EOL);
        sbAlleleName.append("select distinct _Allele_key ").append(EOL);
        sbAlleleName.append("  from Allele ").append(EOL);
        sbAlleleName.append(" where ").append(DAOUtils.formatCondition("name", alleleComparison, allele, "'"));
        sbAlleleName.append("    or ").append(DAOUtils.formatCondition("symbol", alleleComparison, allele, "'"));
        
        stmtBatch.addBatch(sbAlleleName.toString());
        
        log.debug(sbAlleleName.toString());

        StringBuffer sbAlleleNameMarker = new StringBuffer();
        sbAlleleNameMarker.append("create temporary table tempallelesmarkers as ").append(EOL);
        sbAlleleNameMarker.append("select distinct ama._Marker_key ").append(EOL);
        sbAlleleNameMarker.append("  from Allele a, ").append(EOL);
        sbAlleleNameMarker.append("       AlleleMarkerAssoc ama ").append(EOL);
        sbAlleleNameMarker.append(" where a._Allele_key = ama._Allele_key ").append(EOL);
        sbAlleleNameMarker.append("   and (").append(DAOUtils.formatCondition("a.name", alleleComparison, allele, "'"));
        sbAlleleNameMarker.append("        or ").append(DAOUtils.formatCondition("a.symbol", alleleComparison, allele, "'")).append(')');
      
        stmtBatch.addBatch(sbAlleleNameMarker.toString());

        log.debug(sbAlleleNameMarker.toString());

      }
      
      // marker
      if (StringUtils.hasValue(marker)) {
        sbAllele1Select.insert(sbAllele1Select.indexOf("from ")+5, "tempmarkers ttm, ");
        sbAllele1Select.append(" and m._Marker_key = ttm._Marker_key ").append(EOL);
        
        sbAllele2Select.insert(sbAllele2Select.indexOf("from ")+5, "tempmarkers ttm, ");
        sbAllele2Select.append(" and m._Marker_key = ttm._Marker_key ").append(EOL);

        sbMarkerASelect.insert(sbMarkerASelect.indexOf("from ")+5, "tempmarkers ttm, ");
        sbMarkerASelect.append(" and m._Marker_key = ttm._Marker_key ").append(EOL);

        sbMarkerBSelect.insert(sbMarkerBSelect.indexOf("from ")+5, "tempmarkers ttm, ");
        sbMarkerBSelect.append(" and m._Marker_key = ttm._Marker_key ").append(EOL);

        StringBuffer sbMarkerName = new StringBuffer();
        sbMarkerName.append("create temporary table tempmarkers as").append(EOL);
        sbMarkerName.append("select _Marker_key ").append(EOL);
        sbMarkerName.append("  from MarkerLabel ").append(EOL);
        sbMarkerName.append(" where ").append(DAOUtils.formatCondition("label", markerComparison, marker, "'")).append(EOL);

        log.debug(sbMarkerName.toString());
        
        stmtBatch.addBatch(sbMarkerName.toString());

      }

      // chromosomes
      if ((chromosomes != null) && (chromosomes.size() > 0)) {
        sbSelectTemp.append("   and c._Chromosome_key in ( " + DAOUtils.collectionToString(chromosomes, ",", "") + ") ").append(EOL);
      }

      // mutations
      if ((mutations != null) && (mutations.size() != 0)) {
        sbSelectMaster.append("  and ay1._AlleleGroupType_key in ( ").append(DAOUtils.collectionToString(mutations, ",", "")).append(") ").append(EOL);
        
        sbAllele1Select.insert(sbAllele1Select.indexOf("from ")+5, " AlleleType ay, ");
        sbAllele1Select.append(" and a._AlleleType_key = ay._AlleleType_key  and ay._AlleleGroupType_key in ( ").append(DAOUtils.collectionToString(mutations, ",", "")).append(") ").append(EOL);
        
        sbAllele2Select.insert(sbAllele2Select.indexOf("from ")+5, " AlleleType ay, ");
        sbAllele2Select.append(" and a._AlleleType_key = ay._AlleleType_key  and ay._AlleleGroupType_key in ( ").append(DAOUtils.collectionToString(mutations, ",", "")).append(") ").append(EOL);
        
        sbMarkerASelect.insert(sbMarkerASelect.indexOf("from ")+5, " AlleleType ay, ");
        sbMarkerASelect.append(" and a._AlleleType_key = ay._AlleleType_key  and ay._AlleleGroupType_key in ( ").append(DAOUtils.collectionToString(mutations, ",", "")).append(") ").append(EOL);
        
        sbMarkerBSelect.insert(sbMarkerBSelect.indexOf("from ")+5, " AlleleType ay, ");
        sbMarkerBSelect.append(" and a._AlleleType_key = ay._AlleleType_key  and ay._AlleleGroupType_key in ( ").append(DAOUtils.collectionToString(mutations, ",", "")).append(") ").append(EOL);
        
      }

      stmtBatch.addBatch(sbAllele1Select.toString());
      log.debug(sbAllele1Select.toString());
    
      stmtBatch.addBatch(sbAllele2Select.toString());
      log.debug(sbAllele2Select.toString());
      
      stmtBatch.addBatch("create index _tak  on allelekeys(_allele_key) ");
          
      stmtBatch.addBatch(sbMarkerASelect.toString());
      log.debug(sbMarkerASelect.toString());
           
      stmtBatch.addBatch(sbMarkerBSelect.toString());
      log.debug(sbMarkerBSelect.toString());
      
      stmtBatch.addBatch("create index idx_mak  on markerallelekeys(_marker_key) ");
   
          
      stmtBatch.addBatch(sbSelectTemp.toString());
      log.debug(sbSelectTemp.toString());
      
      stmtBatch.addBatch("create index idx_ttm  on temptab(_marker_key) ");
      stmtBatch.addBatch("create index idx_tta   on temptab(_allele_key) ");
      
      stmtBatch.addBatch(sbTGATemp.toString());
      log.debug(sbTGATemp.toString());
      stmtBatch.addBatch("create index idx_tga  on tga(_allele_key)");
     
      stmtBatch.addBatch(sbCountTemp.toString());
      log.debug(sbCountTemp.toString());
      
      stmtBatch.addBatch("create index idx_tc2  on count(_alleletype_key)");
      stmtBatch.addBatch("create index idx_tc1  on count(_marker_key)");
     
      
      
      
      Long start = System.currentTimeMillis();
      
      stmtBatch.executeBatch();
      
      log.debug("set up batch took "+ (System.currentTimeMillis()- start) );
      
      sbSelectMaster.append(" order by ay1.type ").append(EOL);

      log.debug(sbSelectMaster.toString());

      stmtSelect = conn.createStatement();
      rs = stmtSelect.executeQuery(sbSelectMaster.toString());

      String tempAlleleType = null;
      
      while (rs.next()) {
        MTBGeneticsSearchDTO currentGenetic = new MTBGeneticsSearchDTO();
        tempAlleleType = rs.getString(1);
        currentGenetic.setAlleleType(tempAlleleType);
        currentGenetic.setAlleleTypeKey(rs.getInt(2));
        currentGenetic.setChromosome(rs.getString(4));
        currentGenetic.setCount(rs.getInt(5));
        currentGenetic.setOrganism(rs.getString(10));
        currentGenetic.setMarkerKey(rs.getInt(11));
        currentGenetic.setGeneSymbol(rs.getString(12));
        currentGenetic.setGeneName(rs.getString(13));

        // PRETTY BAD HACK!
        // per Debbie, if transgene, set the chromosome to null if it
        // is a transgene

        if (tempAlleleType.toLowerCase().indexOf("transgene") >= 0) {
          currentGenetic.setChromosome(null);
        }

        currentGenetic.setAlleleSymbol(rs.getString(8));

        StringBuffer key = new StringBuffer();
        key.append(currentGenetic.getAlleleType());
        key.append(currentGenetic.getChromosome());
        key.append(currentGenetic.getGeneName());
        key.append(currentGenetic.getGeneSymbol());
        key.append(currentGenetic.getOrganism());

        if (!g.containsKey(key.toString())) {
          g.put(key.toString(), currentGenetic);
        }
      }

    } catch (SQLException sqle) {
     
      log.error("Error searching for tumor genetics.", sqle);
      throw new DAOException(sqle);
    } finally {
      close(stmtBatch);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    List<MTBGeneticsSearchDTO> c = new ArrayList<MTBGeneticsSearchDTO>(g.values());

    // here is where the magic of sorting and returning the corect number
    // of rows happens
    MTBGeneticsSearchDTO geneticsArrTemp[] = (MTBGeneticsSearchDTO[]) c.toArray(new MTBGeneticsSearchDTO[c.size()]);
    MTBGeneticsSearchDTO geneticsArr[] = null;

    // order by search string hard coded in geneticsSearch.jsp 
    if ((!StringUtils.hasValue(orderBy)) || (orderBy.equalsIgnoreCase("Mutation Type"))) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_MUTATIONTYPE));
    } else if (orderBy.equalsIgnoreCase("Gene Symbol")) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_MARKERSYMBOL));
    } else if (orderBy.equalsIgnoreCase("Chromosome")) {
      Arrays.sort(geneticsArrTemp, new MTBGeneticsSearchComparator(MTBGeneticsUtilDAO.ID_CHROMOSOME));
    }

    if (maxItems > 0) {
      geneticsArr = new MTBGeneticsSearchDTO[Math.min(maxItems, geneticsArrTemp.length)];
      System.arraycopy(geneticsArrTemp, 0, geneticsArr, 0, Math.min(maxItems, geneticsArrTemp.length));
      c = new ArrayList<MTBGeneticsSearchDTO>(Arrays.asList(geneticsArr));
    } else {
      c = new ArrayList<MTBGeneticsSearchDTO>(Arrays.asList(geneticsArrTemp));
    }

    resultWrapper.setList(c);
    resultWrapper.setTotal(geneticsArrTemp.length);

    return resultWrapper;
  }

  public MTBGeneticsSummaryDTO getGeneticsSummary(long alleleTypeKey,
          long markerKey) {
    MTBGeneticsSummaryDTO ret = null;
    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtTemp = null;
    StringBuffer sb = new StringBuffer();

    try {
      conn = getConnection();
      StringBuffer temp = new StringBuffer();
      temp.append("create temporary table tempalleles as ").append(EOL);
      temp.append("select distinct ap._Allele1_key _Allele_key").append(EOL);
      temp.append("  from AllelePair ap, ").append(EOL);
      temp.append("       TumorGenetics tg, ").append(EOL);
      temp.append("       Allele a, ").append(EOL);
      temp.append("       AlleleMarkerAssoc ama ").append(EOL);
      temp.append(" where a._Allele_key = ap._Allele1_key ").append(EOL);
      temp.append("   and a._Allele_key = ama._Allele_key ").append(EOL);
      temp.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      temp.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      temp.append("   and a.somaticInd in (2,3) ").append(EOL);
      temp.append("   and a._AlleleType_key = ").append(alleleTypeKey).append(' ').append(EOL);
      temp.append("   and ama._Marker_key = ").append(markerKey).append(' ').append(EOL);
      temp.append(EOL).append(" union ").append(EOL);
      temp.append("select ap._Allele2_key ").append(EOL);
      temp.append("  from AllelePair ap, ").append(EOL);
      temp.append("       TumorGenetics tg, ").append(EOL);
      temp.append("       Allele a, ").append(EOL);
      temp.append("       AlleleMarkerAssoc ama ").append(EOL);
      temp.append(" where a._Allele_key = ap._Allele2_key ").append(EOL);
      temp.append("   and a._Allele_key = ama._Allele_key ").append(EOL);
      temp.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      temp.append("   and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
      temp.append("   and a.somaticInd in (2,3) ").append(EOL);
      temp.append("   and a._AlleleType_key = ").append(alleleTypeKey).append(' ').append(EOL);
      temp.append("   and ama._Marker_key = ").append(markerKey).append(' ').append(EOL);

      log.debug(temp.toString());

      stmtTemp = conn.createStatement();
      stmtTemp.executeUpdate(temp.toString());
      
 
      sb.append("select distinct c.chromosome, ").append(EOL);
      sb.append("       case when position('(' in og.name) = 1 ").append(EOL);
      sb.append("            then 1 ").append(EOL);
      sb.append("            else 0 ").append(EOL);
      sb.append("       end ogNameSort, ").append(EOL);
      sb.append("       m._Marker_key, ").append(EOL);
      sb.append("       m.name markerName, ").append(EOL);
      sb.append("       m.symbol markerSymbol, ").append(EOL);
      sb.append("       om.commonName organism, ").append(EOL);
      sb.append("       ap._AllelePair_key, ").append(EOL);
      sb.append("       a._Allele_key _Allele1_key, ").append(EOL);
      sb.append("       a._AlleleType_key a1Type_key, ").append(EOL);
      sb.append("       ay.type geneticChangeType, ").append(EOL);
      sb.append("       ay.sortOrder ay1sortOrder, ").append(EOL);
      sb.append("       a.name alname, ").append(EOL);
      sb.append("       a.symbol a1symbol, ").append(EOL);
      sb.append("       og.name ogName, ").append(EOL);
      sb.append("       tc.name tcName, ").append(EOL);
      sb.append("       og._Organ_key, ").append(EOL);
      sb.append("       tc._TumorClassification_key, ").append(EOL);
      sb.append("       coalesce(aty._AgentType_key, 0) _AgentType_key, ").append(EOL);
      sb.append("       coalesce(aty.name, 'None (spontaneous)') treatmentType, ").append(EOL);
      sb.append("       tf._TumorFrequency_key, ").append(EOL);
      sb.append("       og.name || ' ' || tc.name as nameStr ").append(EOL);
      sb.append("  from Allele a, ").append(EOL);
      sb.append("       AlleleMarkerAssoc ama, ").append(EOL);
      sb.append("       AlleleType ay, ").append(EOL);
      sb.append("       AllelePair ap, ").append(EOL);
      sb.append("       TumorGenetics tg, ").append(EOL);
      sb.append("       Chromosome c, ").append(EOL);
      sb.append("       Marker m, ").append(EOL);
      sb.append("       Organ og, ").append(EOL);
      sb.append("       Organism om, ").append(EOL);
      sb.append("       TumorClassification tc, ").append(EOL);
      sb.append("       TumorFrequency tf left join (TumorFrequencyTreatments tft join").append(EOL);
      sb.append("         (Agent ag join AgentType aty on (ag._AgentType_key = aty._AgentType_key))").append(EOL);
      sb.append("         on ( tft._Agent_key = ag._Agent_key)) on (tf._TumorFrequency_key = tft._TumorFrequency_key), ");
      sb.append("       TumorType ty, tempalleles tta ").append(EOL);
      sb.append(" where a._AlleleType_key = ay._AlleleType_key ").append(EOL);
      sb.append("   and a._Allele_key = ama._Allele_key ").append(EOL);
      sb.append("   and m._Marker_key = ama._Marker_key ").append(EOL);
      sb.append("   and m._Chromosome_key = c._Chromosome_key ").append(EOL);
      sb.append("   and c._Organism_key = om._Organism_key ").append(EOL);
      sb.append("   and ((a._Allele_key = ap._Allele1_key) or (a._Allele_key = ap._Allele2_key))").append(EOL);
      sb.append("   and ap._AllelePair_key = tg._AllelePair_key ").append(EOL);
      sb.append("   and tg._TumorFrequency_key = tf._TumorFrequency_key ").append(EOL);
      sb.append("   and tf._TumorType_key = ty._TumorType_key ").append(EOL);
      sb.append("   and ty._TumorClassification_key = tc._TumorClassification_key ").append(EOL);
      sb.append("   and ty._Organ_key = og._Organ_key ").append(EOL);
      sb.append("   and a._Allele_key= tta._Allele_key ").append(EOL);
      sb.append("   and m._Marker_key = ").append(markerKey).append(EOL);
      sb.append(" order by a1symbol, ogNameSort, nameStr ").append(EOL);
     

      stmtSelect = conn.createStatement();
      rs = stmtSelect.executeQuery(sb.toString());

      ret = new MTBGeneticsSummaryDTO();

      while (rs.next()) {
        ret.setMouseChromosome(rs.getString(1));
        ret.setGeneName(rs.getString(4));
        ret.setGeneSymbol(rs.getString(5));
        ret.setGeneticChangeTypeName(rs.getString(10));

        
        if (ret.getGeneticChangeTypeName().toLowerCase().indexOf("transgene") >= 0) {
          ret.setMouseChromosome(null);
        }

        MTBGeneticsSummaryRowDTO dto = new MTBGeneticsSummaryRowDTO();
        dto.setAllelePairKey(rs.getInt(7)+"");
        dto.setMutationSymbol(rs.getString(13));
        dto.setTumorName(rs.getString(14) + " " + rs.getString(15));
        dto.setOrganKey(rs.getInt(16));
        dto.setTumorClassificationKey(rs.getInt(17));
        dto.setAgentTypeKey(rs.getInt(18));
        dto.setAgentType(rs.getString(19));
        
        ret.addAlleleRec(rs.getString(7), rs.getString(13), rs.getString(12), rs.getLong(20), dto);
      }
    } catch (Exception e) {
     
      log.error("Error getting genetic summary.", e);
    } finally {
      close(stmtTemp);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    return ret;
  }
  
  /**
   * Gets a single MTBTumorGenticChangesDTO
   * @param tgcKey
   * @return MTBTumorGeneticChangesDTO
   */
  public MTBTumorGeneticChangesDTO getTumorGeneticChanges(long tgcKey){
    ArrayList list = new ArrayList();
    long[] key = {tgcKey};
    MTBTumorGeneticChangesDTO tgcDTO = null;
    try{
      tgcDTO = searchTumorCytoGenetics(list,list,key,1,"",false).getList().get(0);
    }catch(Exception e){
      log.error("Getting single tumorgeneticChanges with key "+tgcKey+ "failed",e);
    }
    return tgcDTO;
  }

  /**
   * Queries the database bases on search criteria for all corresponding
   * cytogentic records. 
   * @param chromosomes Collection of chomosomes to search with
   * @param mutations Collection of mutations to search with
   * @param tumorFrequencyKeys Long[] 
   * @param maxItems int maximum number of results to return
   * @param orderBy String column to sort on
   * @return SearchResults<MTBTumorGeneticChangesDTO>
   * @throws java.lang.NullPointerException
   * @throws java.lang.IllegalArgumentException
   * @throws org.jax.mgi.mtb.dao.DAOException
   */
  public SearchResults<MTBTumorGeneticChangesDTO> searchTumorCytoGenetics(
          Collection chromosomes,
          Collection mutations,
          long[] tumorChangeKeys,
          int maxItems, String orderBy,
          boolean assayImages)
          throws NullPointerException, IllegalArgumentException, DAOException {

    Connection conn = null;
    ResultSet rs = null;
    Statement stmtSelect = null;
    Statement stmtTemp = null;
    StringBuffer sb = new StringBuffer();
    SearchResults<MTBTumorGeneticChangesDTO> resultWrapper =
            new SearchResults<MTBTumorGeneticChangesDTO>();


    List<MTBTumorGeneticChangesDTO> tgcList = new ArrayList<MTBTumorGeneticChangesDTO>();
    // put dtos into a map with TGCkey as the key this will remove duplicates
    // which result from multiple assay images
    HashMap<Long,MTBTumorGeneticChangesDTO> tgcMap = new HashMap<Long,MTBTumorGeneticChangesDTO>();

    try {
       String joinType = " join ";
       
       if(!assayImages){
        joinType = " left join ";
        
       }

      Long mouseOrganismKey = new Long(1L);

      sb.append("create temporary table tempCyto as ").append(EOL);
      sb.append("Select distinct tgc.name as name,tgc.notes as notes,tgc._tumorfrequency_key as tf_key, ").append(EOL);
      sb.append(" tgc._tumorgeneticchanges_key as tgc_key, ay.type as atype, o.name ||' ' ||tc.name as tumorname,").append(EOL);
      sb.append(" coalesce(att.name, 'None (spontaneous)') as treatmentType, ").append(EOL);
      sb.append(" ast.name as assayType, ai.lowresname, ai._assayImages_key, ai.privateFlag ").append(EOL);
      sb.append(" From  TumorClassification tc, ").append(EOL);
      sb.append(" Organ o, AlleleGroupType agt, TumorGeneticChanges tgc left join AssayType ast on (tgc._assayType_key = ast._assayType_key) ").append(EOL);
      sb.append(joinType+" (TmrGntcCngAssayImageAssoc aia join AssayImages ai on ").append(EOL);
      sb.append(" (aia._assayImages_key = ai._assayImages_key)) on (tgc._tumorgeneticchanges_key = aia._tumorgeneticchanges_key),").append(EOL);
      sb.append(" TumorFrequency tf left join (TumorFrequencyTreatments tft join ").append(EOL);
      sb.append(" (Agent a join AgentType att on (a._agenttype_key = att._agentType_key)) ").append(EOL);
      sb.append(" on (tft._agent_key = a._agent_key)) on (tf._tumorfrequency_key = tft._tumorfrequency_key)").append(EOL);
      sb.append(" join TumorType tt on (tf._tumortype_key = tt._tumortype_key ),").append(EOL);
      sb.append(" AlleleType ay");
      
      
      if (chromosomes.size() > 0) {
        sb.append(" ,GeneticChangeChromosomeAssoc gcca, Chromosome c").append(EOL);
      }

      sb.append(" Where tgc._alleletype_key = ay._alleletype_key ").append(EOL);
      sb.append(" and ay._allelegrouptype_key = agt._allelegrouptype_key ").append(EOL);
      sb.append(" and tgc._tumorfrequency_key = tf._tumorfrequency_key").append(EOL);
      sb.append(" and tt._tumorclassification_key = tc._tumorclassification_key").append(EOL);
      sb.append(" and tt._organ_key = o._organ_key  ").append(EOL);
      
      if (chromosomes.size() > 0) {
        sb.append(" and tgc._tumorgeneticchanges_key = gcca._tumorgeneticchanges_key and gcca._chromosome_key = c._chromosome_key ").append(EOL);
        sb.append(" and c._organism_key = " + mouseOrganismKey).append(EOL);
        sb.append(" and c._chromosome_key in (" + DAOUtils.collectionToString(chromosomes, ",", "") + ")").append(EOL);
      }

      if (mutations.size() != 0) {
       
        sb.append(" and agt._allelegrouptype_key in (" + DAOUtils.collectionToString(mutations, ",", "") + ")").append(EOL);
      }

      if (tumorChangeKeys.length > 0) {
        sb.append(" and tgc._tumorgeneticchanges_key in (");
        for (int i = 0; i < tumorChangeKeys.length - 1; i++) {
          sb.append(tumorChangeKeys[i] + ",");
        }
        sb.append(tumorChangeKeys[tumorChangeKeys.length - 1] + ")");

      }
            
      conn = getConnection();

      stmtSelect = conn.createStatement();
      
      log.debug(sb.toString());
      
      stmtSelect.executeUpdate(sb.toString());
      rs = stmtSelect.executeQuery("Select distinct * from tempCyto");

      boolean hasImage;

      while (rs.next()) {
        hasImage = false;
        MTBTumorGeneticChangesDTO tgcDTO = MTBTumorGeneticChangesDAO.getInstance().createTumorGeneticChangesDTO();
        AssayImagesDTO aiDTO = AssayImagesDAO.getInstance().createAssayImagesDTO();
        tgcDTO.setName(rs.getString(1));
        tgcDTO.setNotes(rs.getString(2));
        tgcDTO.setTumorFrequencyKey(rs.getLong(3));
        tgcDTO.setTumorGeneticChangesKey(rs.getLong(4));
        tgcDTO.setAlleleTypeName(rs.getString(5));
        tgcDTO.setTumorName(rs.getString(6));
        tgcDTO.setTreatmentType(rs.getString(7));
        tgcDTO.setAssayType(rs.getString(8));
        aiDTO.setLowResName(rs.getString(9));
        aiDTO.setAssayImagesKey(rs.getLong(10));
        aiDTO.setPrivateFlag(rs.getLong(11));
        if((aiDTO.getAssayImagesKey()!= null) && 
                (aiDTO.getAssayImagesKey().longValue()>0)
                && (aiDTO.getPrivateFlag()!=null)
                && (aiDTO.getPrivateFlag() != 1)){
           tgcDTO.addAssayImage(aiDTO);
           hasImage = true;
        }
        if(!assayImages || hasImage){ 
        
          tgcList.add(tgcDTO);
        }
      }

      // get the list of chromosomes for each change
      sb.delete(0, sb.length());
      sb.append("Select distinct tgc._tumorgeneticchanges_key,c.chromosome, c.ordernum ").append(EOL);
      sb.append(" from TumorGeneticChanges tgc, GeneticChangeChromosomeAssoc gcca, Chromosome c, tempCyto tc ").append(EOL);
      sb.append(" where tgc._tumorgeneticchanges_key = gcca._tumorgeneticchanges_key and gcca._chromosome_key = c._chromosome_key ").append(EOL);
      sb.append(" and c._organism_key=" + mouseOrganismKey).append(EOL);
      sb.append(" and tgc._tumorgeneticchanges_key = tc.tgc_key ").append(EOL);

      sb.append(" order by c.ordernum");
      HashMap<Long, String> chromsMap = new HashMap<Long, String>();
      
      log.debug(sb.toString());
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

      // add the display chromosome string to each dto
      Iterator it = tgcList.iterator();
      Long key = null;
      while (it.hasNext()) {
        MTBTumorGeneticChangesDTO tgcDTO = (MTBTumorGeneticChangesDTO) it.next();
        key = tgcDTO.getTumorGeneticChangesKey();
        tgcDTO.setDisplayChromosomes((String) chromsMap.get(key));
        
        // while adding chomosomes consolodate the records by assay images
        if(tgcMap.containsKey(key)){
          MTBTumorGeneticChangesDTO oldDTO = (MTBTumorGeneticChangesDTO) tgcMap.get(key);
          
          // don't try to add the images if there are none
          if(tgcDTO.getAssayImages()!= null){
            oldDTO.addAssayImages(tgcDTO.getAssayImages());
          }
        }else{
          tgcMap.put(key,tgcDTO);
        }
      }

    } catch (Exception e) {

      log.error("Error getting genetic summary.", e);
    } finally {
      close(stmtTemp);
      close(stmtSelect, rs);
      freeConnection(conn);
    }

    Collection<MTBTumorGeneticChangesDTO> tgcDTOs = tgcMap.values();
    MTBTumorGeneticChangesDTO geneticsArrTemp[] = (MTBTumorGeneticChangesDTO[])
            tgcDTOs.toArray(new MTBTumorGeneticChangesDTO[tgcDTOs.size()]);

    // orderBy search string is hard coded in geneticsSearch.jsp 
    if (orderBy.equalsIgnoreCase("Mutation Type")) {
      Arrays.sort(geneticsArrTemp, new MTBTumorGeneticChangesComparator(MTBTumorGeneticChangesDAO.ID_ALLELE_TYPE_NAME));
    } else {
      Arrays.sort(geneticsArrTemp, new MTBTumorGeneticChangesComparator(MTBTumorGeneticChangesDAO.ID_DISPLAY_CHROMOSOMES));
    }

    tgcList.clear();

    tgcList.addAll(Arrays.asList(geneticsArrTemp));

    resultWrapper.setTotal(tgcList.size());
    if (maxItems > 0) {
      tgcList = tgcList.subList(0, Math.min(maxItems, tgcList.size()));
    }

    resultWrapper.setList(tgcList);
    return resultWrapper;

  }

  /**
   * Gets all cytogentic records based on query criteria then groups them
   * by chromosome and alleletype.
   * @param chromosomes collection of chromosomes to search for
   * @param mutations collection of mutations to search for
   * @param maxItems int maximum number of items returned
   * @param orderBy String for which coulmn to order results by
   * @return SearchResults<MTBCytoresults>
   * @throws java.lang.NullPointerException
   * @throws java.lang.IllegalArgumentException
   * @throws org.jax.mgi.mtb.dao.DAOException
   */
  public SearchResults<MTBCytoResults> searchTumorCytoGeneticsSummary(
          Collection chromosomes,
          Collection mutations,
          int maxItems, String orderBy,
          boolean assayImages)
          throws NullPointerException, IllegalArgumentException, DAOException {

    SearchResults<MTBCytoResults> resultWrapper = new SearchResults<MTBCytoResults>();

    List<MTBCytoResults> tgcList = new ArrayList<MTBCytoResults>();

    long[] keys = new long[0];

    SearchResults<MTBTumorGeneticChangesDTO> results =
            searchTumorCytoGenetics(chromosomes, mutations, keys,
            0, orderBy, assayImages);

    // Use a linked map to keep the sort order
    LinkedHashMap<String, MTBCytoResults> map =
            new LinkedHashMap<String, MTBCytoResults>();

    // group the results by chromosomes and change type
    for (MTBTumorGeneticChangesDTO dto : results.getList()) {
      String key = dto.getDisplayChromosomes() + ":" + dto.getAlleleTypeName();
      if (map.containsKey(key)) {
        MTBCytoResults res = (MTBCytoResults) map.get(key);
        res.addDTO(dto);
        map.put(key, res);
      } else {
        MTBCytoResults res = new MTBCytoResults();
        res.addDTO(dto);
        map.put(key, res);

      }
    }

    tgcList.addAll(map.values());

    resultWrapper.setTotal(tgcList.size());

    if (maxItems > 0) {
      tgcList = tgcList.subList(0, Math.min(maxItems, tgcList.size()));
    }
    resultWrapper.setList(tgcList);

    return resultWrapper;

  }
  /**
   * Populates the MTBOrthologyDTOs with counts for strains and tumors
   * These counts should match the results from the genetics search for the same
   * marker
   * @param orthos Collection<MTBOrthologyDTO> with values for mouseMarker
   * @return orthos Collection<MTBorthologyDTO> with values for strain and tumor
   */
  
  public Collection<MTBOrthologyDTO> getOrthologGenetics(Collection<MTBOrthologyDTO> orthos){
    
     
    StringBuffer sqlTumor = new StringBuffer();
    sqlTumor.append("Select count(distinct a._alleletype_key ||'-'|| m._marker_key) ").append(EOL);
    sqlTumor.append("from Allele a, ").append(EOL);
    sqlTumor.append("AlleleMarkerAssoc ama, ").append(EOL);
    sqlTumor.append("AllelePair ap, ").append(EOL);
    sqlTumor.append("Marker m, ").append(EOL);
    sqlTumor.append("MarkerLabel ml ").append(EOL);
    sqlTumor.append("where ml.label = ? ").append(EOL);
    sqlTumor.append("and m._Marker_key = ml._marker_key ").append(EOL);
    sqlTumor.append("and ama._Marker_key = m._Marker_key ").append(EOL);
    sqlTumor.append("and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
    sqlTumor.append("and ( a._Allele_key = ap._Allele2_key or a._Allele_key = ap._Allele1_key ) ").append(EOL);
    sqlTumor.append("and a._Allele_key = ama._Allele_key ").append(EOL);
    sqlTumor.append("and a.somaticInd in (2,3) ").append(EOL);
    sqlTumor.append("and ap._AllelePair_key in (select _allelepair_key from TumorGenetics) ").append(EOL);
    
    StringBuffer sqlStrains = new StringBuffer();
    StringBuffer sqlTempAlleles = new StringBuffer();
    StringBuffer sqlTempIndex = new StringBuffer();
    
    // temp table improves performance when multiple markers are queried
    // slows down queries when there are only a few markers
    
    sqlTempAlleles.append("create temporary table tempAlleles as Select _allelepair_key ").append(EOL);
    sqlTempAlleles.append("from AllelePair ap left join Allele a2 on (ap._allele2_key = a2._allele_key), ").append(EOL);
    sqlTempAlleles.append("Allele a3 ").append(EOL);
    sqlTempAlleles.append("where ap._allele1_key = a3._allele_key ").append(EOL);
    sqlTempAlleles.append("and ((a2.symbol is null or a2.symbol not like '%+%') ").append(EOL);
    sqlTempAlleles.append("      or a3.symbol not like '%+%') ").append(EOL);
    sqlTempAlleles.append("and (a2.symbol is null  or a2.somaticInd in (1,3)) ").append(EOL);
    sqlTempAlleles.append("and a3.somaticInd in (1,3) ").append(EOL);
    sqlTempAlleles.append("and ap._allelepair_key in (Select _allelepair_key from Genotype) ").append(EOL);
    
    sqlTempIndex.append("create index tempAllelesIDX  on tempAlleles (_allelepair_key)");
    
    
    sqlStrains.append("select count(distinct ap._Allelepair_key) ").append(EOL);
    sqlStrains.append("from AllelePair ap left join Allele a2 on (ap._allele2_key = a2._allele_key), ").append(EOL);
    sqlStrains.append("Allele a3, ").append(EOL);
    sqlStrains.append("AlleleMarkerAssoc ama, Marker m , MarkerLabel ml, tempAlleles tta ").append(EOL);
    sqlStrains.append("where  ama._Marker_key = m._Marker_key ").append(EOL);
    sqlStrains.append("and ama._AlleleMarkerAssocType_key in (1,4) ").append(EOL);
    sqlStrains.append("and m._Marker_key = ml._marker_key  and ml.label = ? ").append(EOL);
    sqlStrains.append("and ap._allele1_key = a3._allele_key ").append(EOL);
    sqlStrains.append("and (a2._allele_key = ama._allele_key or a3._allele_key = ama._allele_key) ").append(EOL);
    sqlStrains.append("and ap._allelepair_key = tta._allelepair_key ").append(EOL);
    
    
    Connection conn = null;
    PreparedStatement stmtTumor = null;
    PreparedStatement stmtStrain = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
      
      Long time = System.currentTimeMillis();
      conn = getConnection();
      
      stmt = conn.createStatement();
      
      stmt.executeUpdate(sqlTempAlleles.toString());
      stmt.executeUpdate(sqlTempIndex.toString());

      stmtTumor = conn.prepareStatement(sqlTumor.toString());
      
      stmtStrain = conn.prepareStatement(sqlStrains.toString());
      
      log.debug("setup for ortho query took "+ (System.currentTimeMillis() - time) + "millisecs");
      
      time = 0L; 
      
      // for each orthology get the number of tumor and strain references
      for(MTBOrthologyDTO ortho : orthos){
        time =  System.currentTimeMillis();
        stmtTumor.setString(1, ortho.getMouseGS());
        
        rs = stmtTumor.executeQuery();
        rs.next();
        ortho.setTumors(rs.getInt(1));
        rs = null;
        stmtTumor.clearParameters();
        
        stmtStrain.setString(1, ortho.getMouseGS());
        
        rs = stmtStrain.executeQuery();
        rs.next();
        ortho.setStrains(rs.getInt(1));
        rs = null;
        stmtStrain.clearParameters();
        //log.debug("query pair for "+ortho.getMouseGS()+" took "+ (System.currentTimeMillis() - time) + "millisecs");
        
      }
      stmtStrain.close();
     } catch (Exception e) {

      log.error("Error getting Orthology Genetics for Markers.", e);
      
    } finally {
      
      close(stmtTumor, rs);
      freeConnection(conn);
    }
      
    return orthos;
  }
    
    
  // ------------------------------------------------------ Protected Methods
  // none

  // -------------------------------------------------------- Private Methods
  private String fixAlleleType(String type1, String type2) {
    String ret = "";

    if (!StringUtils.hasValue(type2)) {
      ret = type1;
    } else if (type1.equalsIgnoreCase(type2)) {
      ret = type1;
    } else if ("normal".equalsIgnoreCase(type2)) {
      ret = type1;
    } else {
      ret = type1 + " / " + type2;
    }

    return ret;
  }
}