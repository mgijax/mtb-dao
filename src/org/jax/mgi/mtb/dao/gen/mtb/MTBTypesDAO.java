
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the MTBTypes table.
 */
public class MTBTypesDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _MTBTypes_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MTBTYPES_KEY = 0;
    public static final int TYPE__MTBTYPES_KEY = Types.NUMERIC;
    public static final String NAME__MTBTYPES_KEY = "_MTBTypes_key";

    /**
     * Column type of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TYPE = 1;
    public static final int TYPE_TYPE = Types.VARCHAR;
    public static final String NAME_TYPE = "type";

    /**
     * Column description of type Types.VARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 2;
    public static final int TYPE_DESCRIPTION = Types.VARCHAR;
    public static final String NAME_DESCRIPTION = "description";

    /**
     * Column tableName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TABLENAME = 3;
    public static final int TYPE_TABLENAME = Types.VARCHAR;
    public static final String NAME_TABLENAME = "tableName";

    /**
     * Column columnName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_COLUMNNAME = 4;
    public static final int TYPE_COLUMNNAME = Types.VARCHAR;
    public static final String NAME_COLUMNNAME = "columnName";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 5;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 6;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 7;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 8;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "MTBTypes";

    /**
     * Create an array of type string containing all the fields of the MTBTypes table.
     */
    private static final String[] FIELD_NAMES = {
        "MTBTypes._MTBTypes_key"
        ,"MTBTypes.type"
        ,"MTBTypes.description"
        ,"MTBTypes.tableName"
        ,"MTBTypes.columnName"
        ,"MTBTypes.create_user"
        ,"MTBTypes.create_date"
        ,"MTBTypes.update_user"
        ,"MTBTypes.update_date"
    };

    /**
     * Create an array of type containing all the fields of the MTBTypes table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the MTBTypes table.
     */
    private static final String ALL_FIELDS = "MTBTypes._MTBTypes_key"
                            + ",MTBTypes.type"
                            + ",MTBTypes.description"
                            + ",MTBTypes.tableName"
                            + ",MTBTypes.columnName"
                            + ",MTBTypes.create_user"
                            + ",MTBTypes.create_date"
                            + ",MTBTypes.update_user"
                            + ",MTBTypes.update_date";


    // ----------------------------------------------------- Instance Variables

    private static MTBTypesDAO singleton = new MTBTypesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBTypesDAO singleton.
     *
     * @return MTBTypesDAO 
     */
    synchronized public static MTBTypesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own MTBTypesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(MTBTypesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new MTBTypesDTO instance.
     *
     * @return the new MTBTypesDTO 
     */
    public MTBTypesDTO createMTBTypesDTO() {
        return new MTBTypesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a MTBTypesDTO from the MTBTypes using its key fields.
     *
     * @return a unique MTBTypesDTO 
     */
    public MTBTypesDTO loadByPrimaryKey(Long MTBTypesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBTypes WHERE MTBTypes._MTBTypes_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBTypesKey);
            List<MTBTypesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long MTBTypesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from MTBTypes WHERE MTBTypes._MTBTypes_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBTypesKey);
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
     * Loads all the rows from MTBTypes.
     *
     * @return a List of MTBTypesDAO objects
     */
    public List<MTBTypesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from MTBTypes, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MTBTypesDAO objects
     */
    public List<MTBTypesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBTypes",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of MTBTypesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting MTBTypesDTO table 
     */
    public List<MTBTypesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of MTBTypesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBTypesDTO table 
     */
    public List<MTBTypesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of MTBTypesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBTypesDTO table 
     */
    public List<MTBTypesDTO> loadByWhere(String where, 
                                        int[] fieldList, 
                                        int startRow, 
                                        int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from MTBTypes " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from MTBTypes ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<MTBTypesDTO> v = new ArrayList<MTBTypesDTO>();
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
     * Deletes all rows from MTBTypes table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the MTBTypes table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM MTBTypes " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the MTBTypesDTO pObject into the database.
     *
     * @param pObject the MTBTypesDTO pObject to be saved
     */
    public MTBTypesDTO save(MTBTypesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getMTBTypesKey() == null) {
            Object obj = max(ID__MTBTYPES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setMTBTypesKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into MTBTypes (");
    
                if (pObject.isMTBTypesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBTypes_key");
                    _dirtyCount++;
                }

                if (pObject.isTypeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("type");
                    _dirtyCount++;
                }

                if (pObject.isDescriptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("description");
                    _dirtyCount++;
                }

                if (pObject.isTableNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("tableName");
                    _dirtyCount++;
                }

                if (pObject.isColumnNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("columnName");
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

                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }
    
                if (pObject.isTypeModified()) {
                    ps.setString(++_dirtyCount, pObject.getType());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isTableNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getTableName());
                }
    
                if (pObject.isColumnNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getColumnName());
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
                _sql = new StringBuffer("UPDATE MTBTypes SET ");
                boolean useComma=false;

                if (pObject.isMTBTypesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBTypes_key").append("=?");
                }

                if (pObject.isTypeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("type").append("=?");
                }

                if (pObject.isDescriptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("description").append("=?");
                }

                if (pObject.isTableNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("tableName").append("=?");
                }

                if (pObject.isColumnNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("columnName").append("=?");
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
                _sql.append("MTBTypes._MTBTypes_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isMTBTypesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }

                if (pObject.isTypeModified()) {
                      ps.setString(++_dirtyCount, pObject.getType());
                }

                if (pObject.isDescriptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getDescription());
                }

                if (pObject.isTableNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getTableName());
                }

                if (pObject.isColumnNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getColumnName());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKeyOriginal());
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
     * Saves a List of MTBTypesDTO objects into the database.
     *
     * @param pObjects the MTBTypesDTO pObject table to be saved
     * @return the saved MTBTypesDTO List.
     */
    public List<MTBTypesDTO> save(List<MTBTypesDTO> pObjects) throws SQLException {
        for (MTBTypesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique MTBTypesDTO object from a template
     *
     * @param pObject the MTBTypesDTO object to look for
     * @return the pObject matching the template
     */
    public MTBTypesDTO loadUniqueUsingTemplate(MTBTypesDTO pObject) 
        throws SQLException {
         List<MTBTypesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of MTBTypesDTO objects from a template one.
     *
     * @param pObject the MTBTypesDTO template to look for
     * @return all the MTBTypesDTO objects matching the template
     */
    public List<MTBTypesDTO> loadUsingTemplate(MTBTypesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of MTBTypesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the MTBTypesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the MTBTypesDTO matching the template
     */
    public List<MTBTypesDTO> loadUsingTemplate(MTBTypesDTO pObject,
                                              int startRow,
                                              int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from MTBTypes WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isMTBTypesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
             }
    
             if (pObject.isTypeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("type= ?");
             }
    
             if (pObject.isDescriptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
             }
    
             if (pObject.isTableNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("tableName= ?");
             }
    
             if (pObject.isColumnNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("columnName= ?");
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
    
             if (pObject.isMTBTypesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
             }
    
             if (pObject.isTypeModified()) {
                 ps.setString(++_dirtyCount, pObject.getType());
             }
    
             if (pObject.isDescriptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getDescription());
             }
    
             if (pObject.isTableNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getTableName());
             }
    
             if (pObject.isColumnNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getColumnName());
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
     * Deletes rows using a MTBTypesDTO template.
     *
     * @param pObject the MTBTypesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(MTBTypesDTO pObject) throws SQLException {
        if (pObject.isMTBTypesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getMTBTypesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM MTBTypes WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isMTBTypesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBTypes_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTypeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("type").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDescriptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("description").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTableNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("tableName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isColumnNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("columnName").append("=?");
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
    
            if (pObject.isMTBTypesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
            }
    
            if (pObject.isTypeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getType());
            }
    
            if (pObject.isDescriptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getDescription());
            }
    
            if (pObject.isTableNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getTableName());
            }
    
            if (pObject.isColumnNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getColumnName());
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
     * Retrieves a List of SiteInfoDTO objects using the relation table Accession given a MTBTypesDTO object.
     *
     * @param pObject the MTBTypesDTO pObject to be used
     * @return a List of SiteInfoDTO objects
     */
    // MANY TO MANY
    public List<SiteInfoDTO> loadSiteInfoViaAccession(MTBTypesDTO pObject) 
        throws SQLException {
        return loadSiteInfoViaAccession(pObject, 1, -1);
    }

    /**
     * Retrieves a List of SiteInfoDTO objects using the relation table Accession given a MTBTypesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the MTBTypesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SiteInfoDTO objects
     */
    // MANY TO MANY
    public List<SiteInfoDTO> loadSiteInfoViaAccession(MTBTypesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from SiteInfo, ");
        strSQL.append("        Accession");
        strSQL.append("  where Accession._MTBTypes_key = ?");
        strSQL.append("    and Accession._SiteInfo_key = SiteInfo._SiteInfo_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getMTBTypesKey());
             return SiteInfoDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table MTBTypes.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from MTBTypes";
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
                    case ID__MTBTYPES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_TYPE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TABLENAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COLUMNNAME:
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
     * Retrieves the min value for a specified column of the table MTBTypes.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from MTBTypes";
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
                    case ID__MTBTYPES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_TYPE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TABLENAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COLUMNNAME:
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
     * Retrieves the number of rows of the table MTBTypes.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table MTBTypes with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from MTBTypes " + where;
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
     * Retrieves the number of rows of the table MTBTypes with a prepared statement.
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
     * Looks for the number of elements of a specific MTBTypesDTO pObject given a c
     *
     * @param pObject the MTBTypesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(MTBTypesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from MTBTypes WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isMTBTypesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
                }
    
                if (pObject.isTypeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("type= ?");
                }
    
                if (pObject.isDescriptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
                }
    
                if (pObject.isTableNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("tableName= ?");
                }
    
                if (pObject.isColumnNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("columnName= ?");
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
    
                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }
    
                if (pObject.isTypeModified()) {
                    ps.setString(++_dirtyCount, pObject.getType());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isTableNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getTableName());
                }
    
                if (pObject.isColumnNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getColumnName());
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
     * Transforms a ResultSet iterating on the MTBTypes on a MTBTypesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting MTBTypesDTO pObject
     */
    public MTBTypesDTO decodeRow(ResultSet rs) throws SQLException {
        MTBTypesDTO pObject = createMTBTypesDTO();
        pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setType(rs.getString(2));
        pObject.setDescription(rs.getString(3));
        pObject.setTableName(rs.getString(4));
        pObject.setColumnName(rs.getString(5));
        pObject.setCreateUser(rs.getString(6));
        pObject.setCreateDate(rs.getTimestamp(7));
        pObject.setUpdateUser(rs.getString(8));
        pObject.setUpdateDate(rs.getTimestamp(9));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the MTBTypes table on a MTBTypesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting MTBTypesDTO pObject
     */
    public MTBTypesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        MTBTypesDTO pObject = createMTBTypesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__MTBTYPES_KEY:
                    ++pos;
                    pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_TYPE:
                    ++pos;
                    pObject.setType(rs.getString(pos));
                    break;
                case ID_DESCRIPTION:
                    ++pos;
                    pObject.setDescription(rs.getString(pos));
                    break;
                case ID_TABLENAME:
                    ++pos;
                    pObject.setTableName(rs.getString(pos));
                    break;
                case ID_COLUMNNAME:
                    ++pos;
                    pObject.setColumnName(rs.getString(pos));
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
     * @return a List of MTBTypesDTO objects
     */
    public List<MTBTypesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of MTBTypesDTO objects
     */
    public List<MTBTypesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of MTBTypesDTO objects
     */
    public List<MTBTypesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<MTBTypesDTO> v = new ArrayList<MTBTypesDTO>();
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
