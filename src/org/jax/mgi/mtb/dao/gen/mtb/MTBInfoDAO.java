
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the MTBInfo table.
 */
public class MTBInfoDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _MTBInfo_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MTBINFO_KEY = 0;
    public static final int TYPE__MTBINFO_KEY = Types.NUMERIC;
    public static final String NAME__MTBINFO_KEY = "_MTBInfo_key";

    /**
     * Column MTBProperty of type Types.VARCHAR mapped to String.
     */
    public static final int ID_MTBPROPERTY = 1;
    public static final int TYPE_MTBPROPERTY = Types.VARCHAR;
    public static final String NAME_MTBPROPERTY = "MTBProperty";

    /**
     * Column MTBValue of type Types.VARCHAR mapped to String.
     */
    public static final int ID_MTBVALUE = 2;
    public static final int TYPE_MTBVALUE = Types.VARCHAR;
    public static final String NAME_MTBVALUE = "MTBValue";


    private static final String TABLE_NAME = "MTBInfo";

    /**
     * Create an array of type string containing all the fields of the MTBInfo table.
     */
    private static final String[] FIELD_NAMES = {
        "MTBInfo._MTBInfo_key"
        ,"MTBInfo.MTBProperty"
        ,"MTBInfo.MTBValue"
    };

    /**
     * Create an array of type containing all the fields of the MTBInfo table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
    };

    /**
     * Field that contains the comma separated fields of the MTBInfo table.
     */
    private static final String ALL_FIELDS = "MTBInfo._MTBInfo_key"
                            + ",MTBInfo.MTBProperty"
                            + ",MTBInfo.MTBValue";


    // ----------------------------------------------------- Instance Variables

    private static MTBInfoDAO singleton = new MTBInfoDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBInfoDAO singleton.
     *
     * @return MTBInfoDAO 
     */
    synchronized public static MTBInfoDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own MTBInfoDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(MTBInfoDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new MTBInfoDTO instance.
     *
     * @return the new MTBInfoDTO 
     */
    public MTBInfoDTO createMTBInfoDTO() {
        return new MTBInfoDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a MTBInfoDTO from the MTBInfo using its key fields.
     *
     * @return a unique MTBInfoDTO 
     */
    public MTBInfoDTO loadByPrimaryKey(Long MTBInfoKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBInfo WHERE MTBInfo._MTBInfo_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBInfoKey);
            List<MTBInfoDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long MTBInfoKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from MTBInfo WHERE MTBInfo._MTBInfo_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBInfoKey);
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
     * Loads all the rows from MTBInfo.
     *
     * @return a List of MTBInfoDAO objects
     */
    public List<MTBInfoDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from MTBInfo, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MTBInfoDAO objects
     */
    public List<MTBInfoDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBInfo",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of MTBInfoDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting MTBInfoDTO table 
     */
    public List<MTBInfoDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of MTBInfoDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBInfoDTO table 
     */
    public List<MTBInfoDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of MTBInfoDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBInfoDTO table 
     */
    public List<MTBInfoDTO> loadByWhere(String where, 
                                       int[] fieldList, 
                                       int startRow, 
                                       int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from MTBInfo " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from MTBInfo ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<MTBInfoDTO> v = new ArrayList<MTBInfoDTO>();
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
     * Deletes all rows from MTBInfo table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the MTBInfo table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM MTBInfo " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the MTBInfoDTO pObject into the database.
     *
     * @param pObject the MTBInfoDTO pObject to be saved
     */
    public MTBInfoDTO save(MTBInfoDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getMTBInfoKey() == null) {
            Object obj = max(ID__MTBINFO_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setMTBInfoKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into MTBInfo (");
    
                if (pObject.isMTBInfoKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBInfo_key");
                    _dirtyCount++;
                }

                if (pObject.isMTBPropertyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("MTBProperty");
                    _dirtyCount++;
                }

                if (pObject.isMTBValueModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("MTBValue");
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

                if (pObject.isMTBInfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKey());
                }
    
                if (pObject.isMTBPropertyModified()) {
                    ps.setString(++_dirtyCount, pObject.getMTBProperty());
                }
    
                if (pObject.isMTBValueModified()) {
                    ps.setString(++_dirtyCount, pObject.getMTBValue());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE MTBInfo SET ");
                boolean useComma=false;

                if (pObject.isMTBInfoKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBInfo_key").append("=?");
                }

                if (pObject.isMTBPropertyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("MTBProperty").append("=?");
                }

                if (pObject.isMTBValueModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("MTBValue").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("MTBInfo._MTBInfo_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isMTBInfoKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKey());
                }

                if (pObject.isMTBPropertyModified()) {
                      ps.setString(++_dirtyCount, pObject.getMTBProperty());
                }

                if (pObject.isMTBValueModified()) {
                      ps.setString(++_dirtyCount, pObject.getMTBValue());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKeyOriginal());
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
     * Saves a List of MTBInfoDTO objects into the database.
     *
     * @param pObjects the MTBInfoDTO pObject table to be saved
     * @return the saved MTBInfoDTO List.
     */
    public List<MTBInfoDTO> save(List<MTBInfoDTO> pObjects) throws SQLException {
        for (MTBInfoDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique MTBInfoDTO object from a template
     *
     * @param pObject the MTBInfoDTO object to look for
     * @return the pObject matching the template
     */
    public MTBInfoDTO loadUniqueUsingTemplate(MTBInfoDTO pObject) 
        throws SQLException {
         List<MTBInfoDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of MTBInfoDTO objects from a template one.
     *
     * @param pObject the MTBInfoDTO template to look for
     * @return all the MTBInfoDTO objects matching the template
     */
    public List<MTBInfoDTO> loadUsingTemplate(MTBInfoDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of MTBInfoDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the MTBInfoDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the MTBInfoDTO matching the template
     */
    public List<MTBInfoDTO> loadUsingTemplate(MTBInfoDTO pObject,
                                             int startRow,
                                             int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from MTBInfo WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isMTBInfoKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBInfo_key= ?");
             }
    
             if (pObject.isMTBPropertyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("MTBProperty= ?");
             }
    
             if (pObject.isMTBValueModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("MTBValue= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isMTBInfoKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKey());
             }
    
             if (pObject.isMTBPropertyModified()) {
                 ps.setString(++_dirtyCount, pObject.getMTBProperty());
             }
    
             if (pObject.isMTBValueModified()) {
                 ps.setString(++_dirtyCount, pObject.getMTBValue());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a MTBInfoDTO template.
     *
     * @param pObject the MTBInfoDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(MTBInfoDTO pObject) throws SQLException {
        if (pObject.isMTBInfoKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getMTBInfoKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM MTBInfo WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isMTBInfoKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBInfo_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBPropertyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("MTBProperty").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBValueInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("MTBValue").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isMTBInfoKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKey());
            }
    
            if (pObject.isMTBPropertyInitialized()) {
                ps.setString(++_dirtyCount, pObject.getMTBProperty());
            }
    
            if (pObject.isMTBValueInitialized()) {
                ps.setString(++_dirtyCount, pObject.getMTBValue());
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Retrieves the max value for a specified column of the table MTBInfo.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from MTBInfo";
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
                    case ID__MTBINFO_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_MTBPROPERTY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_MTBVALUE:
                        iReturn = rs.getString(1);
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
     * Retrieves the min value for a specified column of the table MTBInfo.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from MTBInfo";
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
                    case ID__MTBINFO_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_MTBPROPERTY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_MTBVALUE:
                        iReturn = (String)rs.getObject(1);
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
     * Retrieves the number of rows of the table MTBInfo.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table MTBInfo with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from MTBInfo " + where;
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
     * Retrieves the number of rows of the table MTBInfo with a prepared statement.
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
     * Looks for the number of elements of a specific MTBInfoDTO pObject given a c
     *
     * @param pObject the MTBInfoDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(MTBInfoDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from MTBInfo WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isMTBInfoKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBInfo_key= ?");
                }
    
                if (pObject.isMTBPropertyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("MTBProperty= ?");
                }
    
                if (pObject.isMTBValueModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("MTBValue= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isMTBInfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBInfoKey());
                }
    
                if (pObject.isMTBPropertyModified()) {
                    ps.setString(++_dirtyCount, pObject.getMTBProperty());
                }
    
                if (pObject.isMTBValueModified()) {
                    ps.setString(++_dirtyCount, pObject.getMTBValue());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the MTBInfo on a MTBInfoDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting MTBInfoDTO pObject
     */
    public MTBInfoDTO decodeRow(ResultSet rs) throws SQLException {
        MTBInfoDTO pObject = createMTBInfoDTO();
        pObject.setMTBInfoKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setMTBProperty(rs.getString(2));
        pObject.setMTBValue(rs.getString(3));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the MTBInfo table on a MTBInfoDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting MTBInfoDTO pObject
     */
    public MTBInfoDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        MTBInfoDTO pObject = createMTBInfoDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__MTBINFO_KEY:
                    ++pos;
                    pObject.setMTBInfoKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_MTBPROPERTY:
                    ++pos;
                    pObject.setMTBProperty(rs.getString(pos));
                    break;
                case ID_MTBVALUE:
                    ++pos;
                    pObject.setMTBValue(rs.getString(pos));
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
     * @return a List of MTBInfoDTO objects
     */
    public List<MTBInfoDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of MTBInfoDTO objects
     */
    public List<MTBInfoDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of MTBInfoDTO objects
     */
    public List<MTBInfoDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<MTBInfoDTO> v = new ArrayList<MTBInfoDTO>();
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
