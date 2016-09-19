
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AccessionMax table.
 */
public class AccessionMaxDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column prefixPart of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PREFIXPART = 0;
    public static final int TYPE_PREFIXPART = Types.VARCHAR;
    public static final String NAME_PREFIXPART = "prefixPart";

    /**
     * Column maxNumericPart of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_MAXNUMERICPART = 1;
    public static final int TYPE_MAXNUMERICPART = Types.NUMERIC;
    public static final String NAME_MAXNUMERICPART = "maxNumericPart";


    private static final String TABLE_NAME = "AccessionMax";

    /**
     * Create an array of type string containing all the fields of the AccessionMax table.
     */
    private static final String[] FIELD_NAMES = {
        "AccessionMax.prefixPart"
        ,"AccessionMax.maxNumericPart"
    };

    /**
     * Create an array of type containing all the fields of the AccessionMax table.
     */
    private static final Object[] FIELD_TYPES = {
        "String"
        ,"Long"
    };

    /**
     * Field that contains the comma separated fields of the AccessionMax table.
     */
    private static final String ALL_FIELDS = "AccessionMax.prefixPart"
                            + ",AccessionMax.maxNumericPart";


    // ----------------------------------------------------- Instance Variables

    private static AccessionMaxDAO singleton = new AccessionMaxDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AccessionMaxDAO singleton.
     *
     * @return AccessionMaxDAO 
     */
    synchronized public static AccessionMaxDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AccessionMaxDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AccessionMaxDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AccessionMaxDTO instance.
     *
     * @return the new AccessionMaxDTO 
     */
    public AccessionMaxDTO createAccessionMaxDTO() {
        return new AccessionMaxDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AccessionMaxDTO from the AccessionMax using its key fields.
     *
     * @return a unique AccessionMaxDTO 
     */
    public AccessionMaxDTO loadByPrimaryKey(String prefixPart) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AccessionMax WHERE AccessionMax.prefixPart=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, prefixPart);
            List<AccessionMaxDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(String prefixPart) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AccessionMax WHERE AccessionMax.prefixPart=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, prefixPart);
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
     * Loads all the rows from AccessionMax.
     *
     * @return a List of AccessionMaxDAO objects
     */
    public List<AccessionMaxDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AccessionMax, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AccessionMaxDAO objects
     */
    public List<AccessionMaxDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AccessionMax",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AccessionMaxDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AccessionMaxDTO table 
     */
    public List<AccessionMaxDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AccessionMaxDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AccessionMaxDTO table 
     */
    public List<AccessionMaxDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AccessionMaxDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AccessionMaxDTO table 
     */
    public List<AccessionMaxDTO> loadByWhere(String where, 
                                            int[] fieldList, 
                                            int startRow, 
                                            int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AccessionMax " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AccessionMax ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AccessionMaxDTO> v = new ArrayList<AccessionMaxDTO>();
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
     * Deletes all rows from AccessionMax table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AccessionMax table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AccessionMax " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AccessionMaxDTO pObject into the database.
     *
     * @param pObject the AccessionMaxDTO pObject to be saved
     */
    public AccessionMaxDTO save(AccessionMaxDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AccessionMax (");
    
                if (pObject.isPrefixPartModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("prefixPart");
                    _dirtyCount++;
                }

                if (pObject.isMaxNumericPartModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("maxNumericPart");
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

                if (pObject.isPrefixPartModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }
    
                if (pObject.isMaxNumericPartModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMaxNumericPart());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE AccessionMax SET ");
                boolean useComma=false;

                if (pObject.isPrefixPartModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("prefixPart").append("=?");
                }

                if (pObject.isMaxNumericPartModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("maxNumericPart").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("AccessionMax.prefixPart=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isPrefixPartModified()) {
                      ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }

                if (pObject.isMaxNumericPartModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMaxNumericPart());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                ps.setString(++_dirtyCount, pObject.getPrefixPartOriginal());
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
     * Saves a List of AccessionMaxDTO objects into the database.
     *
     * @param pObjects the AccessionMaxDTO pObject table to be saved
     * @return the saved AccessionMaxDTO List.
     */
    public List<AccessionMaxDTO> save(List<AccessionMaxDTO> pObjects) throws SQLException {
        for (AccessionMaxDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AccessionMaxDTO object from a template
     *
     * @param pObject the AccessionMaxDTO object to look for
     * @return the pObject matching the template
     */
    public AccessionMaxDTO loadUniqueUsingTemplate(AccessionMaxDTO pObject) 
        throws SQLException {
         List<AccessionMaxDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AccessionMaxDTO objects from a template one.
     *
     * @param pObject the AccessionMaxDTO template to look for
     * @return all the AccessionMaxDTO objects matching the template
     */
    public List<AccessionMaxDTO> loadUsingTemplate(AccessionMaxDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AccessionMaxDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AccessionMaxDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AccessionMaxDTO matching the template
     */
    public List<AccessionMaxDTO> loadUsingTemplate(AccessionMaxDTO pObject,
                                                  int startRow,
                                                  int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AccessionMax WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isPrefixPartModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("prefixPart= ?");
             }
    
             if (pObject.isMaxNumericPartModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("maxNumericPart= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isPrefixPartModified()) {
                 ps.setString(++_dirtyCount, pObject.getPrefixPart());
             }
    
             if (pObject.isMaxNumericPartModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMaxNumericPart());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a AccessionMaxDTO template.
     *
     * @param pObject the AccessionMaxDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AccessionMaxDTO pObject) throws SQLException {
        if (pObject.isPrefixPartInitialized()) {
            return deleteByPrimaryKey(pObject.getPrefixPart());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AccessionMax WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isPrefixPartInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("prefixPart").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMaxNumericPartInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("maxNumericPart").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isPrefixPartInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPrefixPart());
            }
    
            if (pObject.isMaxNumericPartInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMaxNumericPart());
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Retrieves the max value for a specified column of the table AccessionMax.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AccessionMax";
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
                    case ID_PREFIXPART:
                        iReturn = rs.getString(1);
                        break;
                    case ID_MAXNUMERICPART:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
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
     * Retrieves the min value for a specified column of the table AccessionMax.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AccessionMax";
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
                    case ID_PREFIXPART:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_MAXNUMERICPART:
                        iReturn = (Long)rs.getObject(1);
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
     * Retrieves the number of rows of the table AccessionMax.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AccessionMax with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AccessionMax " + where;
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
     * Retrieves the number of rows of the table AccessionMax with a prepared statement.
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
     * Looks for the number of elements of a specific AccessionMaxDTO pObject given a c
     *
     * @param pObject the AccessionMaxDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AccessionMaxDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AccessionMax WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isPrefixPartModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("prefixPart= ?");
                }
    
                if (pObject.isMaxNumericPartModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("maxNumericPart= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isPrefixPartModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }
    
                if (pObject.isMaxNumericPartModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMaxNumericPart());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the AccessionMax on a AccessionMaxDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AccessionMaxDTO pObject
     */
    public AccessionMaxDTO decodeRow(ResultSet rs) throws SQLException {
        AccessionMaxDTO pObject = createAccessionMaxDTO();
        pObject.setPrefixPart(rs.getString(1));
        pObject.setMaxNumericPart(DAOManagerMTB.getLong(rs, 2));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AccessionMax table on a AccessionMaxDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AccessionMaxDTO pObject
     */
    public AccessionMaxDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AccessionMaxDTO pObject = createAccessionMaxDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID_PREFIXPART:
                    ++pos;
                    pObject.setPrefixPart(rs.getString(pos));
                    break;
                case ID_MAXNUMERICPART:
                    ++pos;
                    pObject.setMaxNumericPart(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AccessionMaxDTO objects
     */
    public List<AccessionMaxDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AccessionMaxDTO objects
     */
    public List<AccessionMaxDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AccessionMaxDTO objects
     */
    public List<AccessionMaxDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AccessionMaxDTO> v = new ArrayList<AccessionMaxDTO>();
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
