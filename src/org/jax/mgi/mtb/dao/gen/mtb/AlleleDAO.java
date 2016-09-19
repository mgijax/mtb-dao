
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Allele table.
 */
public class AlleleDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Allele_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELE_KEY = 0;
    public static final int TYPE__ALLELE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELE_KEY = "_Allele_key";

    /**
     * Column _AlleleType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELETYPE_KEY = 1;
    public static final int TYPE__ALLELETYPE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELETYPE_KEY = "_AlleleType_key";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 2;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";

    /**
     * Column symbol of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SYMBOL = 3;
    public static final int TYPE_SYMBOL = Types.VARCHAR;
    public static final String NAME_SYMBOL = "symbol";

    /**
     * Column somaticInd of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_SOMATICIND = 4;
    public static final int TYPE_SOMATICIND = Types.NUMERIC;
    public static final String NAME_SOMATICIND = "somaticInd";

    /**
     * Column _CellLine_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CELLLINE_KEY = 5;
    public static final int TYPE__CELLLINE_KEY = Types.NUMERIC;
    public static final String NAME__CELLLINE_KEY = "_CellLine_key";

    /**
     * Column note of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_NOTE = 6;
    public static final int TYPE_NOTE = Types.LONGVARCHAR;
    public static final String NAME_NOTE = "note";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 7;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 8;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 9;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 10;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "Allele";

    /**
     * Create an array of type string containing all the fields of the Allele table.
     */
    private static final String[] FIELD_NAMES = {
        "Allele._Allele_key"
        ,"Allele._AlleleType_key"
        ,"Allele.name"
        ,"Allele.symbol"
        ,"Allele.somaticInd"
        ,"Allele._CellLine_key"
        ,"Allele.note"
        ,"Allele.create_user"
        ,"Allele.create_date"
        ,"Allele.update_user"
        ,"Allele.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Allele table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Allele table.
     */
    private static final String ALL_FIELDS = "Allele._Allele_key"
                            + ",Allele._AlleleType_key"
                            + ",Allele.name"
                            + ",Allele.symbol"
                            + ",Allele.somaticInd"
                            + ",Allele._CellLine_key"
                            + ",Allele.note"
                            + ",Allele.create_user"
                            + ",Allele.create_date"
                            + ",Allele.update_user"
                            + ",Allele.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AlleleDAO singleton = new AlleleDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AlleleDAO singleton.
     *
     * @return AlleleDAO 
     */
    synchronized public static AlleleDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AlleleDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AlleleDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AlleleDTO instance.
     *
     * @return the new AlleleDTO 
     */
    public AlleleDTO createAlleleDTO() {
        return new AlleleDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AlleleDTO from the Allele using its key fields.
     *
     * @return a unique AlleleDTO 
     */
    public AlleleDTO loadByPrimaryKey(Long AlleleKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Allele WHERE Allele._Allele_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleKey);
            List<AlleleDTO> pReturn = loadByPreparedStatement(ps);
            if (pReturn.size() < 1) {
                return null;
            } else {
                return pReturn.get(0);
            }
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Deletes rows according to its keys.
     *
     * @return the number of deleted rows
     */
    public int deleteByPrimaryKey(Long AlleleKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Allele WHERE Allele._Allele_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleKey);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    
    
    //-------------------------------------------------------------------------
    // FOREIGN KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a List of AlleleDTO objects from the Allele table using its _CellLine_key field.
     *
     * @return a List of AlleleDTO objects
     */
    public List<AlleleDTO> loadByCellLineKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Allele WHERE _CellLine_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, value);
            return loadByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the Allele table by _CellLine_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByCellLineKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Allele WHERE _CellLine_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AlleleDTO objects from the Allele table using its _AlleleType_key field.
     *
     * @return a List of AlleleDTO objects
     */
    public List<AlleleDTO> loadByAlleleTypeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Allele WHERE _AlleleType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, value);
            return loadByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the Allele table by _AlleleType_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAlleleTypeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Allele WHERE _AlleleType_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------
    /**
     * Retrieves the CellLineDTO object from the Allele._CellLine_key field.
     *
     * @param pObject the AlleleDTO 
     * @return the associated CellLineDTO pObject
     */
    public CellLineDTO getCellLineDTO(AlleleDTO pObject) 
    throws SQLException {
        CellLineDTO other = CellLineDAO.getInstance().createCellLineDTO();
        other.setCellLineKey(pObject.getCellLineKey());
        return CellLineDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleDTO object to the CellLineDTO object.
     *
     * @param pObject the AlleleDTO object to use
     * @param pObjectToBeSet the CellLineDTO object to associate to the AlleleDTO 
     * @return the associated CellLineDTO pObject
     */
    // SET IMPORTED
    public AlleleDTO setCellLineDTO(AlleleDTO pObject,CellLineDTO pObjectToBeSet) {
        pObject.setCellLineKey(pObjectToBeSet.getCellLineKey());
        return pObject;
    }

    /**
     * Retrieves the AlleleTypeDTO object from the Allele._AlleleType_key field.
     *
     * @param pObject the AlleleDTO 
     * @return the associated AlleleTypeDTO pObject
     */
    public AlleleTypeDTO getAlleleTypeDTO(AlleleDTO pObject) 
    throws SQLException {
        AlleleTypeDTO other = AlleleTypeDAO.getInstance().createAlleleTypeDTO();
        other.setAlleleTypeKey(pObject.getAlleleTypeKey());
        return AlleleTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleDTO object to the AlleleTypeDTO object.
     *
     * @param pObject the AlleleDTO object to use
     * @param pObjectToBeSet the AlleleTypeDTO object to associate to the AlleleDTO 
     * @return the associated AlleleTypeDTO pObject
     */
    // SET IMPORTED
    public AlleleDTO setAlleleTypeDTO(AlleleDTO pObject,AlleleTypeDTO pObjectToBeSet) {
        pObject.setAlleleTypeKey(pObjectToBeSet.getAlleleTypeKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Allele.
     *
     * @return a List of AlleleDAO objects
     */
    public List<AlleleDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Allele, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleDAO objects
     */
    public List<AlleleDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Allele",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AlleleDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AlleleDTO table 
     */
    public List<AlleleDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AlleleDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleDTO table 
     */
    public List<AlleleDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AlleleDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleDTO table 
     */
    public List<AlleleDTO> loadByWhere(String where, 
                                      int[] fieldList, 
                                      int startRow, 
                                      int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Allele " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Allele ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AlleleDTO> v = new ArrayList<AlleleDTO>();
        try {
            c = getConnection();
            pStatement = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs =  pStatement.executeQuery(sql);
            int count = 0;
            if (rs.absolute(startRow) && numRows!=0) {
                do  {
                    if(fieldList == null) {
                        v.add(decodeRow(rs));
                    } else {
                        v.add(decodeRow(rs, fieldList));
                    }
                    count++;
                } while ( (count<numRows||numRows<0) && rs.next() );
            }

        } finally {
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
        return v;
    }


    /**
     * Deletes all rows from Allele table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Allele table using a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     * <br>Attention, if 'WHERE' is omitted it will delete all records. 
     *
     * @param where the sql 'where' clause
     * @return the number of deleted rows
     */
    public int deleteByWhere(String where) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = getConnection();
            String delByWhereSQL = "DELETE FROM Allele " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AlleleDTO pObject into the database.
     *
     * @param pObject the AlleleDTO pObject to be saved
     */
    public AlleleDTO save(AlleleDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAlleleKey() == null) {
            Object obj = max(ID__ALLELE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAlleleKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Allele (");
    
                if (pObject.isAlleleKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Allele_key");
                    _dirtyCount++;
                }

                if (pObject.isAlleleTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AlleleType_key");
                    _dirtyCount++;
                }

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("name");
                    _dirtyCount++;
                }

                if (pObject.isSymbolModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("symbol");
                    _dirtyCount++;
                }

                if (pObject.isSomaticIndModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("somaticInd");
                    _dirtyCount++;
                }

                if (pObject.isCellLineKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_CellLine_key");
                    _dirtyCount++;
                }

                if (pObject.isNoteModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("note");
                    _dirtyCount++;
                }

                if (pObject.isCreateUserModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("create_user");
                    _dirtyCount++;
                }

                if (pObject.isCreateDateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("create_date");
                    _dirtyCount++;
                }

                if (pObject.isUpdateUserModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("update_user");
                    _dirtyCount++;
                }

                if (pObject.isUpdateDateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("update_date");
                    _dirtyCount++;
                }

                _sql.append(") values (");
                if(_dirtyCount > 0) {
                    _sql.append('?');
                    for(int i = 1; i < _dirtyCount; i++) {
                        _sql.append(",?");
                    }
                }
                _sql.append(")");

                ps = c.prepareStatement(_sql.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                _dirtyCount = 0;

                if (pObject.isAlleleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }
    
                if (pObject.isAlleleTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isSymbolModified()) {
                    ps.setString(++_dirtyCount, pObject.getSymbol());
                }
    
                if (pObject.isSomaticIndModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSomaticInd());
                }
    
                if (pObject.isCellLineKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCellLineKey());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isCreateUserModified()) {
                    ps.setString(++_dirtyCount, pObject.getCreateUser());
                }
    
                if (pObject.isCreateDateModified()) {
                    if (pObject.getCreateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCreateDate().getTime())); }
                }
    
                if (pObject.isUpdateUserModified()) {
                    ps.setString(++_dirtyCount, pObject.getUpdateUser());
                }
    
                if (pObject.isUpdateDateModified()) {
                    if (pObject.getUpdateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getUpdateDate().getTime())); }
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE Allele SET ");
                boolean useComma=false;

                if (pObject.isAlleleKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Allele_key").append("=?");
                }

                if (pObject.isAlleleTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AlleleType_key").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
                }

                if (pObject.isSymbolModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("symbol").append("=?");
                }

                if (pObject.isSomaticIndModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("somaticInd").append("=?");
                }

                if (pObject.isCellLineKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_CellLine_key").append("=?");
                }

                if (pObject.isNoteModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("note").append("=?");
                }

                if (pObject.isCreateUserModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("create_user").append("=?");
                }

                if (pObject.isCreateDateModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("create_date").append("=?");
                }

                if (pObject.isUpdateUserModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("update_user").append("=?");
                }

                if (pObject.isUpdateDateModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("update_date").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("Allele._Allele_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAlleleKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }

                if (pObject.isAlleleTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
                }

                if (pObject.isSymbolModified()) {
                      ps.setString(++_dirtyCount, pObject.getSymbol());
                }

                if (pObject.isSomaticIndModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSomaticInd());
                }

                if (pObject.isCellLineKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCellLineKey());
                }

                if (pObject.isNoteModified()) {
                      ps.setString(++_dirtyCount, pObject.getNote());
                }

                if (pObject.isCreateUserModified()) {
                      ps.setString(++_dirtyCount, pObject.getCreateUser());
                }

                if (pObject.isCreateDateModified()) {
                      if (pObject.getCreateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCreateDate().getTime())); }
                }

                if (pObject.isUpdateUserModified()) {
                      ps.setString(++_dirtyCount, pObject.getUpdateUser());
                }

                if (pObject.isUpdateDateModified()) {
                      if (pObject.getUpdateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getUpdateDate().getTime())); }
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKeyOriginal());
                ps.executeUpdate();
                pObject.resetIsModified();
            }
        }
    
            return pObject;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }



    /**
     * Saves a List of AlleleDTO objects into the database.
     *
     * @param pObjects the AlleleDTO pObject table to be saved
     * @return the saved AlleleDTO List.
     */
    public List<AlleleDTO> save(List<AlleleDTO> pObjects) throws SQLException {
        for (AlleleDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AlleleDTO object from a template
     *
     * @param pObject the AlleleDTO object to look for
     * @return the pObject matching the template
     */
    public AlleleDTO loadUniqueUsingTemplate(AlleleDTO pObject) 
        throws SQLException {
         List<AlleleDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AlleleDTO objects from a template one.
     *
     * @param pObject the AlleleDTO template to look for
     * @return all the AlleleDTO objects matching the template
     */
    public List<AlleleDTO> loadUsingTemplate(AlleleDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AlleleDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AlleleDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AlleleDTO matching the template
     */
    public List<AlleleDTO> loadUsingTemplate(AlleleDTO pObject,
                                            int startRow,
                                            int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Allele WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAlleleKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
             }
    
             if (pObject.isAlleleTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleType_key= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
             }
    
             if (pObject.isSymbolModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("symbol= ?");
             }
    
             if (pObject.isSomaticIndModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("somaticInd= ?");
             }
    
             if (pObject.isCellLineKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_CellLine_key= ?");
             }
    
             if (pObject.isNoteModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
             }
    
             if (pObject.isCreateUserModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("create_user= ?");
             }
    
             if (pObject.isCreateDateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("create_date= ?");
             }
    
             if (pObject.isUpdateUserModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("update_user= ?");
             }
    
             if (pObject.isUpdateDateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("update_date= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isAlleleKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
             }
    
             if (pObject.isAlleleTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
             }
    
             if (pObject.isSymbolModified()) {
                 ps.setString(++_dirtyCount, pObject.getSymbol());
             }
    
             if (pObject.isSomaticIndModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSomaticInd());
             }
    
             if (pObject.isCellLineKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCellLineKey());
             }
    
             if (pObject.isNoteModified()) {
                 ps.setString(++_dirtyCount, pObject.getNote());
             }
    
             if (pObject.isCreateUserModified()) {
                 ps.setString(++_dirtyCount, pObject.getCreateUser());
             }
    
             if (pObject.isCreateDateModified()) {
                 if (pObject.getCreateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCreateDate().getTime())); }
             }
    
             if (pObject.isUpdateUserModified()) {
                 ps.setString(++_dirtyCount, pObject.getUpdateUser());
             }
    
             if (pObject.isUpdateDateModified()) {
                 if (pObject.getUpdateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getUpdateDate().getTime())); }
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a AlleleDTO template.
     *
     * @param pObject the AlleleDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AlleleDTO pObject) throws SQLException {
        if (pObject.isAlleleKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAlleleKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Allele WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAlleleKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Allele_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAlleleTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AlleleType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("name").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSymbolInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("symbol").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSomaticIndInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("somaticInd").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCellLineKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_CellLine_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNoteInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("note").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCreateUserInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("create_user").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCreateDateInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("create_date").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUpdateUserInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("update_user").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUpdateDateInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("update_date").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isAlleleKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
            }
    
            if (pObject.isAlleleTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
            }
    
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
            }
    
            if (pObject.isSymbolInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSymbol());
            }
    
            if (pObject.isSomaticIndInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSomaticInd());
            }
    
            if (pObject.isCellLineKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCellLineKey());
            }
    
            if (pObject.isNoteInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNote());
            }
    
            if (pObject.isCreateUserInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCreateUser());
            }
    
            if (pObject.isCreateDateInitialized()) {
                if (pObject.getCreateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCreateDate().getTime())); }
            }
    
            if (pObject.isUpdateUserInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUpdateUser());
            }
    
            if (pObject.isUpdateDateInitialized()) {
                if (pObject.getUpdateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getUpdateDate().getTime())); }
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    
    
    //-------------------------------------------------------------------------
    // MANY TO MANY: LOAD OTHER BEAN VIA JUNCTION TABLE 
    //-------------------------------------------------------------------------
    /**
     * Retrieves a List of MarkerDTO objects using the relation table AlleleMarkerAssoc given a AlleleDTO object.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @return a List of MarkerDTO objects
     */
    // MANY TO MANY
    public List<MarkerDTO> loadMarkerViaAlleleMarkerAssoc(AlleleDTO pObject) 
        throws SQLException {
        return loadMarkerViaAlleleMarkerAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of MarkerDTO objects using the relation table AlleleMarkerAssoc given a AlleleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MarkerDTO objects
     */
    // MANY TO MANY
    public List<MarkerDTO> loadMarkerViaAlleleMarkerAssoc(AlleleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Marker, ");
        strSQL.append("        AlleleMarkerAssoc");
        strSQL.append("  where AlleleMarkerAssoc._Allele_key = ?");
        strSQL.append("    and AlleleMarkerAssoc._Marker_key = Marker._Marker_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleKey());
             return MarkerDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of AlleleMarkerAssocTypeDTO objects using the relation table AlleleMarkerAssoc given a AlleleDTO object.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @return a List of AlleleMarkerAssocTypeDTO objects
     */
    // MANY TO MANY
    public List<AlleleMarkerAssocTypeDTO> loadAlleleMarkerAssocTypeViaAlleleMarkerAssoc(AlleleDTO pObject) 
        throws SQLException {
        return loadAlleleMarkerAssocTypeViaAlleleMarkerAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of AlleleMarkerAssocTypeDTO objects using the relation table AlleleMarkerAssoc given a AlleleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleMarkerAssocTypeDTO objects
     */
    // MANY TO MANY
    public List<AlleleMarkerAssocTypeDTO> loadAlleleMarkerAssocTypeViaAlleleMarkerAssoc(AlleleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from AlleleMarkerAssocType, ");
        strSQL.append("        AlleleMarkerAssoc");
        strSQL.append("  where AlleleMarkerAssoc._Allele_key = ?");
        strSQL.append("    and AlleleMarkerAssoc._AlleleMarkerAssocType_key = AlleleMarkerAssocType._AlleleMarkerAssocType_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleKey());
             return AlleleMarkerAssocTypeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table AlleleReferences given a AlleleDTO object.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaAlleleReferences(AlleleDTO pObject) 
        throws SQLException {
        return loadReferenceViaAlleleReferences(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table AlleleReferences given a AlleleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaAlleleReferences(AlleleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        AlleleReferences");
        strSQL.append("  where AlleleReferences._Allele_key = ?");
        strSQL.append("    and AlleleReferences._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table AlleleSynonyms given a AlleleDTO object.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaAlleleSynonyms(AlleleDTO pObject) 
        throws SQLException {
        return loadReferenceViaAlleleSynonyms(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table AlleleSynonyms given a AlleleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaAlleleSynonyms(AlleleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        AlleleSynonyms");
        strSQL.append("  where AlleleSynonyms._Allele_key = ?");
        strSQL.append("    and AlleleSynonyms._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Allele.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Allele";
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        try  {
            Object iReturn = null;    
            c = getConnection();
            pStatement = c.createStatement();
            rs =  pStatement.executeQuery(sql);
            if (rs.next()) {
                switch (column) {
                    case ID__ALLELE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ALLELETYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SYMBOL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SOMATICIND:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__CELLLINE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NOTE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CREATE_USER:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CREATE_DATE:
                        iReturn = rs.getTimestamp(1);
                        break;
                    case ID_UPDATE_USER:
                        iReturn = rs.getString(1);
                        break;
                    case ID_UPDATE_DATE:
                        iReturn = rs.getTimestamp(1);
                        break;
                    default:
                        iReturn = rs.getObject(1);
                        break;
                }
            }
            if (iReturn != null) {
                return iReturn;
            }
        } finally {
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
        return null;
    }


    /**
     * Retrieves the min value for a specified column of the table Allele.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Allele";
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        try  {
            Object iReturn = null;    
            c = getConnection();
            pStatement = c.createStatement();
            rs =  pStatement.executeQuery(sql);
            if (rs.next()) {
                switch (column) {
                    case ID__ALLELE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ALLELETYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SYMBOL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SOMATICIND:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__CELLLINE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NOTE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CREATE_USER:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CREATE_DATE:
                        iReturn = (java.util.Date)rs.getObject(1);
                        break;
                    case ID_UPDATE_USER:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_UPDATE_DATE:
                        iReturn = (java.util.Date)rs.getObject(1);
                        break;
                    default:
                        iReturn = rs.getObject(1);
                        break;
                }
            }
            if (iReturn != null) {
                return iReturn;
            }
        } finally {
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
        throw new SQLException("Error in min");
    }


    /**
     * Retrieves the number of rows of the table Allele.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Allele with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Allele " + where;
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        try  {
            int iReturn = -1;    
            c = getConnection();
            pStatement = c.createStatement();
            rs =  pStatement.executeQuery(sql);
            if (rs.next()) {
                iReturn = rs.getInt("MCOUNT");
            }
            if (iReturn != -1) {
                return iReturn;
            }
        } finally {
            getManager().close(pStatement, rs);
            freeConnection(c);
        }
        throw new SQLException("Error in countWhere");
    }

    /**
     * Retrieves the number of rows of the table Allele with a prepared statement.
     *
     * @param ps the PreparedStatement to be used
     * @return the number of rows returned
     */
    int countByPreparedStatement(PreparedStatement ps) throws SQLException {
        ResultSet rs =  null;
        try  {
            int iReturn = -1;
            rs = ps.executeQuery();
            if (rs.next()) {
                iReturn = rs.getInt("MCOUNT");
            }
            if (iReturn != -1) {
                return iReturn;
            }
        } finally {
            getManager().close(rs);
        }
       throw new SQLException("Error in countByPreparedStatement");
    }

    /**
     * Looks for the number of elements of a specific AlleleDTO pObject given a c
     *
     * @param pObject the AlleleDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AlleleDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Allele WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAlleleKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
                }
    
                if (pObject.isAlleleTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleType_key= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
                }
    
                if (pObject.isSymbolModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("symbol= ?");
                }
    
                if (pObject.isSomaticIndModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("somaticInd= ?");
                }
    
                if (pObject.isCellLineKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_CellLine_key= ?");
                }
    
                if (pObject.isNoteModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
                }
    
                if (pObject.isCreateUserModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("create_user= ?");
                }
    
                if (pObject.isCreateDateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("create_date= ?");
                }
    
                if (pObject.isUpdateUserModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("update_user= ?");
                }
    
                if (pObject.isUpdateDateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("update_date= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isAlleleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }
    
                if (pObject.isAlleleTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isSymbolModified()) {
                    ps.setString(++_dirtyCount, pObject.getSymbol());
                }
    
                if (pObject.isSomaticIndModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSomaticInd());
                }
    
                if (pObject.isCellLineKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCellLineKey());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isCreateUserModified()) {
                    ps.setString(++_dirtyCount, pObject.getCreateUser());
                }
    
                if (pObject.isCreateDateModified()) {
                    if (pObject.getCreateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCreateDate().getTime())); }
                }
    
                if (pObject.isUpdateUserModified()) {
                    ps.setString(++_dirtyCount, pObject.getUpdateUser());
                }
    
                if (pObject.isUpdateDateModified()) {
                    if (pObject.getUpdateDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getUpdateDate().getTime())); }
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the Allele on a AlleleDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AlleleDTO pObject
     */
    public AlleleDTO decodeRow(ResultSet rs) throws SQLException {
        AlleleDTO pObject = createAlleleDTO();
        pObject.setAlleleKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAlleleTypeKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setName(rs.getString(3));
        pObject.setSymbol(rs.getString(4));
        pObject.setSomaticInd(DAOManagerMTB.getLong(rs, 5));
        pObject.setCellLineKey(DAOManagerMTB.getLong(rs, 6));
        pObject.setNote(rs.getString(7));
        pObject.setCreateUser(rs.getString(8));
        pObject.setCreateDate(rs.getTimestamp(9));
        pObject.setUpdateUser(rs.getString(10));
        pObject.setUpdateDate(rs.getTimestamp(11));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Allele table on a AlleleDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AlleleDTO pObject
     */
    public AlleleDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AlleleDTO pObject = createAlleleDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ALLELE_KEY:
                    ++pos;
                    pObject.setAlleleKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ALLELETYPE_KEY:
                    ++pos;
                    pObject.setAlleleTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
                    break;
                case ID_SYMBOL:
                    ++pos;
                    pObject.setSymbol(rs.getString(pos));
                    break;
                case ID_SOMATICIND:
                    ++pos;
                    pObject.setSomaticInd(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__CELLLINE_KEY:
                    ++pos;
                    pObject.setCellLineKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NOTE:
                    ++pos;
                    pObject.setNote(rs.getString(pos));
                    break;
                case ID_CREATE_USER:
                    ++pos;
                    pObject.setCreateUser(rs.getString(pos));
                    break;
                case ID_CREATE_DATE:
                    ++pos;
                    pObject.setCreateDate(rs.getTimestamp(pos));
                    break;
                case ID_UPDATE_USER:
                    ++pos;
                    pObject.setUpdateUser(rs.getString(pos));
                    break;
                case ID_UPDATE_DATE:
                    ++pos;
                    pObject.setUpdateDate(rs.getTimestamp(pos));
                    break;
            }
        }
        pObject.isNew(false);
        pObject.resetIsModified();

        return pObject;
    }


    /**
     * Loads all the elements using a prepared statement.
     *
     * @param ps the PreparedStatement to be used
     * @return a List of AlleleDTO objects
     */
    public List<AlleleDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AlleleDTO objects
     */
    public List<AlleleDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
        return loadByPreparedStatement(ps, fieldList, 1, -1);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved,
     * and specifying the start row and the number of rows.
     *
     * @param ps the PreparedStatement to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return a List of AlleleDTO objects
     */
    public List<AlleleDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AlleleDTO> v = new ArrayList<AlleleDTO>();
        try {
            rs = ps.executeQuery();
            int count = 0;
            if (rs.absolute(startRow) && numRows!=0) {
                do {
                    if(fieldList == null) {
                        v.add(decodeRow(rs));
                    } else {
                        v.add(decodeRow(rs, fieldList));
                    }
                    count++;
                } while ( (count<numRows||numRows<0) && rs.next() );
            }
        } finally {
            getManager().close(rs);
        }
        return v;
    }

    //-------------------------------------------------------------------------
    // UTILS  
    //-------------------------------------------------------------------------

    /**
     * Retrieves the manager object used to get connections.
     *
     * @return the manager used
     */
    public DAOManagerMTB getManager() {
        return DAOManagerMTB .getInstance();
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


    // ------------------------------------------------------ Protected Methods
    // none

    // -------------------------------------------------------- Private Methods
    // none
// class+ 

// class- 

}
