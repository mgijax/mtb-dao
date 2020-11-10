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
      sbSelectTemp.append(" where 1 = 1 ").append(EOL);  // don't have to figure out if next cluase should start with 'where' or 'and' later on

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

        // SQL Injection
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