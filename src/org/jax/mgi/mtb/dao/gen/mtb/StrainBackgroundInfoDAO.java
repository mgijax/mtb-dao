
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the StrainBackgroundInfo table.
 */
public class StrainBackgroundInfoDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Strain_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAIN_KEY = 0;
    public static final int TYPE__STRAIN_KEY = Types.NUMERIC;
    public static final String NAME__STRAIN_KEY = "_Strain_key";

    /**
     * Column _StrainBackground_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAINBACKGROUND_KEY = 1;
    public static final int TYPE__STRAINBACKGROUND_KEY = Types.NUMERIC;
    public static final String NAME__STRAINBACKGROUND_KEY = "_StrainBackground_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 2;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 3;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 4;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 5;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "StrainBackgroundInfo";

    /**
     * Create an array of type string containing all the fields of the StrainBackgroundInfo table.
     */
    private static final String[] FIELD_NAMES = {
        "StrainBackgroundInfo._Strain_key"
        ,"StrainBackgroundInfo._StrainBackground_key"
        ,"StrainBackgroundInfo.create_user"
        ,"StrainBackgroundInfo.create_date"
        ,"StrainBackgroundInfo.update_user"
        ,"StrainBackgroundInfo.update_date"
    };

    /**
     * Create an array of type containing all the fields of the StrainBackgroundInfo table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the StrainBackgroundInfo table.
     */
    private static final String ALL_FIELDS = "StrainBackgroundInfo._Strain_key"
                            + ",StrainBackgroundInfo._StrainBackground_key"
                            + ",StrainBackgroundInfo.create_user"
                            + ",StrainBackgroundInfo.create_date"
                            + ",StrainBackgroundInfo.update_user"
                            + ",StrainBackgroundInfo.update_date";


    // ----------------------------------------------------- Instance Variables

    private static StrainBackgroundInfoDAO singleton = new StrainBackgroundInfoDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the StrainBackgroundInfoDAO singleton.
     *
     * @return StrainBackgroundInfoDAO 
     */
    synchronized public static StrainBackgroundInfoDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own StrainBackgroundInfoDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(StrainBackgroundInfoDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new StrainBackgroundInfoDTO instance.
     *
     * @return the new StrainBackgroundInfoDTO 
     */
    public StrainBackgroundInfoDTO createStrainBackgroundInfoDTO() {
        return new StrainBackgroundInfoDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a StrainBackgroundInfoDTO from the StrainBackgroundInfo using its key fields.
     *
     * @return a unique StrainBackgroundInfoDTO 
     */
    public StrainBackgroundInfoDTO loadByPrimaryKey(Long StrainKey, Long StrainBackgroundKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainBackgroundInfo WHERE StrainBackgroundInfo._Strain_key=? and StrainBackgroundInfo._StrainBackground_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainKey);
            DAOManagerMTB.setLong(ps, 2, StrainBackgroundKey);
            List<StrainBackgroundInfoDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long StrainKey, Long StrainBackgroundKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from StrainBackgroundInfo WHERE StrainBackgroundInfo._Strain_key=? and StrainBackgroundInfo._StrainBackground_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainKey);
            DAOManagerMTB.setLong(ps, 2, StrainBackgroundKey);
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
     * Loads a List of StrainBackgroundInfoDTO objects from the StrainBackgroundInfo table using its _Strain_key field.
     *
     * @return a List of StrainBackgroundInfoDTO objects
     */
    public List<StrainBackgroundInfoDTO> loadByStrainKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainBackgroundInfo WHERE _Strain_key=?",
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
     * Deletes from the StrainBackgroundInfo table by _Strain_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByStrainKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM StrainBackgroundInfo WHERE _Strain_key=?");
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
     * Retrieves the StrainDTO object from the StrainBackgroundInfo._Strain_key field.
     *
     * @param pObject the StrainBackgroundInfoDTO 
     * @return the associated StrainDTO pObject
     */
    public StrainDTO getStrainDTO(StrainBackgroundInfoDTO pObject) 
    throws SQLException {
        StrainDTO other = StrainDAO.getInstance().createStrainDTO();
        other.setStrainKey(pObject.getStrainKey());
        return StrainDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the StrainBackgroundInfoDTO object to the StrainDTO object.
     *
     * @param pObject the StrainBackgroundInfoDTO object to use
     * @param pObjectToBeSet the StrainDTO object to associate to the StrainBackgroundInfoDTO 
     * @return the associated StrainDTO pObject
     */
    // SET IMPORTED
    public StrainBackgroundInfoDTO setStrainDTO(StrainBackgroundInfoDTO pObject,StrainDTO pObjectToBeSet) {
        pObject.setStrainKey(pObjectToBeSet.getStrainKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from StrainBackgroundInfo.
     *
     * @return a List of StrainBackgroundInfoDAO objects
     */
    public List<StrainBackgroundInfoDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from StrainBackgroundInfo, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainBackgroundInfoDAO objects
     */
    public List<StrainBackgroundInfoDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainBackgroundInfo",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of StrainBackgroundInfoDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting StrainBackgroundInfoDTO table 
     */
    public List<StrainBackgroundInfoDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of StrainBackgroundInfoDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainBackgroundInfoDTO table 
     */
    public List<StrainBackgroundInfoDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of StrainBackgroundInfoDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainBackgroundInfoDTO table 
     */
    public List<StrainBackgroundInfoDTO> loadByWhere(String where, 
                                                    int[] fieldList, 
                                                    int startRow, 
                                                    int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from StrainBackgroundInfo " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from StrainBackgroundInfo ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<StrainBackgroundInfoDTO> v = new ArrayList<StrainBackgroundInfoDTO>();
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
     * Deletes all rows from StrainBackgroundInfo table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the StrainBackgroundInfo table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM StrainBackgroundInfo " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the StrainBackgroundInfoDTO pObject into the database.
     *
     * @param pObject the StrainBackgroundInfoDTO pObject to be saved
     */
    public StrainBackgroundInfoDTO save(StrainBackgroundInfoDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getStrainKey() == null) {
            Object obj = max(ID__STRAIN_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setStrainKey(++key);
        }
    
        if (pObject.getStrainBackgroundKey() == null) {
            Object obj = max(ID__STRAINBACKGROUND_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setStrainBackgroundKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into StrainBackgroundInfo (");
    
                if (pObject.isStrainKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Strain_key");
                    _dirtyCount++;
                }

                if (pObject.isStrainBackgroundKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_StrainBackground_key");
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

                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isStrainBackgroundKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKey());
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
                _sql = new StringBuffer("UPDATE StrainBackgroundInfo SET ");
                boolean useComma=false;

                if (pObject.isStrainKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Strain_key").append("=?");
                }

                if (pObject.isStrainBackgroundKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_StrainBackground_key").append("=?");
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
                _sql.append("StrainBackgroundInfo._Strain_key=? AND StrainBackgroundInfo._StrainBackground_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isStrainKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }

                if (pObject.isStrainBackgroundKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKeyOriginal());
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKeyOriginal());
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
     * Saves a List of StrainBackgroundInfoDTO objects into the database.
     *
     * @param pObjects the StrainBackgroundInfoDTO pObject table to be saved
     * @return the saved StrainBackgroundInfoDTO List.
     */
    public List<StrainBackgroundInfoDTO> save(List<StrainBackgroundInfoDTO> pObjects) throws SQLException {
        for (StrainBackgroundInfoDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique StrainBackgroundInfoDTO object from a template
     *
     * @param pObject the StrainBackgroundInfoDTO object to look for
     * @return the pObject matching the template
     */
    public StrainBackgroundInfoDTO loadUniqueUsingTemplate(StrainBackgroundInfoDTO pObject) 
        throws SQLException {
         List<StrainBackgroundInfoDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of StrainBackgroundInfoDTO objects from a template one.
     *
     * @param pObject the StrainBackgroundInfoDTO template to look for
     * @return all the StrainBackgroundInfoDTO objects matching the template
     */
    public List<StrainBackgroundInfoDTO> loadUsingTemplate(StrainBackgroundInfoDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of StrainBackgroundInfoDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the StrainBackgroundInfoDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the StrainBackgroundInfoDTO matching the template
     */
    public List<StrainBackgroundInfoDTO> loadUsingTemplate(StrainBackgroundInfoDTO pObject,
                                                          int startRow,
                                                          int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from StrainBackgroundInfo WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isStrainKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
             }
    
             if (pObject.isStrainBackgroundKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainBackground_key= ?");
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
    
             if (pObject.isStrainKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
             }
    
             if (pObject.isStrainBackgroundKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKey());
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
     * Deletes rows using a StrainBackgroundInfoDTO template.
     *
     * @param pObject the StrainBackgroundInfoDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(StrainBackgroundInfoDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM StrainBackgroundInfo WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isStrainKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Strain_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStrainBackgroundKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_StrainBackground_key").append("=?");
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
    
            if (pObject.isStrainKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
            }
    
            if (pObject.isStrainBackgroundKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKey());
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


    /**
     * Retrieves the max value for a specified column of the table StrainBackgroundInfo.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from StrainBackgroundInfo";
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
                    case ID__STRAIN_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__STRAINBACKGROUND_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
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
     * Retrieves the min value for a specified column of the table StrainBackgroundInfo.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from StrainBackgroundInfo";
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
                    case ID__STRAIN_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__STRAINBACKGROUND_KEY:
                        iReturn = (Long)rs.getObject(1);
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
     * Retrieves the number of rows of the table StrainBackgroundInfo.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table StrainBackgroundInfo with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from StrainBackgroundInfo " + where;
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
     * Retrieves the number of rows of the table StrainBackgroundInfo with a prepared statement.
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
     * Looks for the number of elements of a specific StrainBackgroundInfoDTO pObject given a c
     *
     * @param pObject the StrainBackgroundInfoDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(StrainBackgroundInfoDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from StrainBackgroundInfo WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isStrainKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
                }
    
                if (pObject.isStrainBackgroundKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainBackground_key= ?");
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
    
                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isStrainBackgroundKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainBackgroundKey());
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
     * Transforms a ResultSet iterating on the StrainBackgroundInfo on a StrainBackgroundInfoDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting StrainBackgroundInfoDTO pObject
     */
    public StrainBackgroundInfoDTO decodeRow(ResultSet rs) throws SQLException {
        StrainBackgroundInfoDTO pObject = createStrainBackgroundInfoDTO();
        pObject.setStrainKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setStrainBackgroundKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setCreateUser(rs.getString(3));
        pObject.setCreateDate(rs.getTimestamp(4));
        pObject.setUpdateUser(rs.getString(5));
        pObject.setUpdateDate(rs.getTimestamp(6));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the StrainBackgroundInfo table on a StrainBackgroundInfoDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting StrainBackgroundInfoDTO pObject
     */
    public StrainBackgroundInfoDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        StrainBackgroundInfoDTO pObject = createStrainBackgroundInfoDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__STRAIN_KEY:
                    ++pos;
                    pObject.setStrainKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__STRAINBACKGROUND_KEY:
                    ++pos;
                    pObject.setStrainBackgroundKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of StrainBackgroundInfoDTO objects
     */
    public List<StrainBackgroundInfoDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of StrainBackgroundInfoDTO objects
     */
    public List<StrainBackgroundInfoDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of StrainBackgroundInfoDTO objects
     */
    public List<StrainBackgroundInfoDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<StrainBackgroundInfoDTO> v = new ArrayList<StrainBackgroundInfoDTO>();
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
