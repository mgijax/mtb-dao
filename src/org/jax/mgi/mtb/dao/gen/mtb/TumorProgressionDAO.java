
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the TumorProgression table.
 */
public class TumorProgressionDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _TumorProgression_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORPROGRESSION_KEY = 0;
    public static final int TYPE__TUMORPROGRESSION_KEY = Types.NUMERIC;
    public static final String NAME__TUMORPROGRESSION_KEY = "_TumorProgression_key";

    /**
     * Column _Parent_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__PARENT_KEY = 1;
    public static final int TYPE__PARENT_KEY = Types.NUMERIC;
    public static final String NAME__PARENT_KEY = "_Parent_key";

    /**
     * Column _Child_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CHILD_KEY = 2;
    public static final int TYPE__CHILD_KEY = Types.NUMERIC;
    public static final String NAME__CHILD_KEY = "_Child_key";

    /**
     * Column _TumorProgressionType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORPROGRESSIONTYPE_KEY = 3;
    public static final int TYPE__TUMORPROGRESSIONTYPE_KEY = Types.NUMERIC;
    public static final String NAME__TUMORPROGRESSIONTYPE_KEY = "_TumorProgressionType_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 4;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 5;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 6;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 7;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "TumorProgression";

    /**
     * Create an array of type string containing all the fields of the TumorProgression table.
     */
    private static final String[] FIELD_NAMES = {
        "TumorProgression._TumorProgression_key"
        ,"TumorProgression._Parent_key"
        ,"TumorProgression._Child_key"
        ,"TumorProgression._TumorProgressionType_key"
        ,"TumorProgression.create_user"
        ,"TumorProgression.create_date"
        ,"TumorProgression.update_user"
        ,"TumorProgression.update_date"
    };

    /**
     * Create an array of type containing all the fields of the TumorProgression table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the TumorProgression table.
     */
    private static final String ALL_FIELDS = "TumorProgression._TumorProgression_key"
                            + ",TumorProgression._Parent_key"
                            + ",TumorProgression._Child_key"
                            + ",TumorProgression._TumorProgressionType_key"
                            + ",TumorProgression.create_user"
                            + ",TumorProgression.create_date"
                            + ",TumorProgression.update_user"
                            + ",TumorProgression.update_date";


    // ----------------------------------------------------- Instance Variables

    private static TumorProgressionDAO singleton = new TumorProgressionDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the TumorProgressionDAO singleton.
     *
     * @return TumorProgressionDAO 
     */
    synchronized public static TumorProgressionDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own TumorProgressionDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(TumorProgressionDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new TumorProgressionDTO instance.
     *
     * @return the new TumorProgressionDTO 
     */
    public TumorProgressionDTO createTumorProgressionDTO() {
        return new TumorProgressionDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a TumorProgressionDTO from the TumorProgression using its key fields.
     *
     * @return a unique TumorProgressionDTO 
     */
    public TumorProgressionDTO loadByPrimaryKey(Long TumorProgressionKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorProgression WHERE TumorProgression._TumorProgression_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorProgressionKey);
            List<TumorProgressionDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long TumorProgressionKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from TumorProgression WHERE TumorProgression._TumorProgression_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorProgressionKey);
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
     * Loads a List of TumorProgressionDTO objects from the TumorProgression table using its _Child_key field.
     *
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByChildKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorProgression WHERE _Child_key=?",
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
     * Deletes from the TumorProgression table by _Child_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByChildKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorProgression WHERE _Child_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorProgressionDTO objects from the TumorProgression table using its _Parent_key field.
     *
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByParentKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorProgression WHERE _Parent_key=?",
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
     * Deletes from the TumorProgression table by _Parent_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByParentKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorProgression WHERE _Parent_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorProgressionDTO objects from the TumorProgression table using its _TumorProgressionType_key field.
     *
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByTumorProgressionTypeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorProgression WHERE _TumorProgressionType_key=?",
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
     * Deletes from the TumorProgression table by _TumorProgressionType_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByTumorProgressionTypeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorProgression WHERE _TumorProgressionType_key=?");
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
     * Retrieves the TumorFrequencyDTO object from the TumorProgression._TumorFrequency_key field.
     *
     * @param pObject the TumorProgressionDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    public TumorFrequencyDTO getTumorFrequencyDTO(TumorProgressionDTO pObject) 
    throws SQLException {
        TumorFrequencyDTO other = TumorFrequencyDAO.getInstance().createTumorFrequencyDTO();
        other.setTumorFrequencyKey(pObject.getChildKey());
        return TumorFrequencyDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorProgressionDTO object to the TumorFrequencyDTO object.
     *
     * @param pObject the TumorProgressionDTO object to use
     * @param pObjectToBeSet the TumorFrequencyDTO object to associate to the TumorProgressionDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    // SET IMPORTED
    public TumorProgressionDTO setTumorFrequencyDTO(TumorProgressionDTO pObject,TumorFrequencyDTO pObjectToBeSet) {
        pObject.setChildKey(pObjectToBeSet.getTumorFrequencyKey());
        return pObject;
    }

    /**
     * Retrieves the TumorProgressionTypeDTO object from the TumorProgression._TumorProgressionType_key field.
     *
     * @param pObject the TumorProgressionDTO 
     * @return the associated TumorProgressionTypeDTO pObject
     */
    public TumorProgressionTypeDTO getTumorProgressionTypeDTO(TumorProgressionDTO pObject) 
    throws SQLException {
        TumorProgressionTypeDTO other = TumorProgressionTypeDAO.getInstance().createTumorProgressionTypeDTO();
        other.setTumorProgressionTypeKey(pObject.getTumorProgressionTypeKey());
        return TumorProgressionTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorProgressionDTO object to the TumorProgressionTypeDTO object.
     *
     * @param pObject the TumorProgressionDTO object to use
     * @param pObjectToBeSet the TumorProgressionTypeDTO object to associate to the TumorProgressionDTO 
     * @return the associated TumorProgressionTypeDTO pObject
     */
    // SET IMPORTED
    public TumorProgressionDTO setTumorProgressionTypeDTO(TumorProgressionDTO pObject,TumorProgressionTypeDTO pObjectToBeSet) {
        pObject.setTumorProgressionTypeKey(pObjectToBeSet.getTumorProgressionTypeKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from TumorProgression.
     *
     * @return a List of TumorProgressionDAO objects
     */
    public List<TumorProgressionDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from TumorProgression, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorProgressionDAO objects
     */
    public List<TumorProgressionDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorProgression",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of TumorProgressionDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting TumorProgressionDTO table 
     */
    public List<TumorProgressionDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of TumorProgressionDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorProgressionDTO table 
     */
    public List<TumorProgressionDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of TumorProgressionDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorProgressionDTO table 
     */
    public List<TumorProgressionDTO> loadByWhere(String where, 
                                                int[] fieldList, 
                                                int startRow, 
                                                int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from TumorProgression " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from TumorProgression ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<TumorProgressionDTO> v = new ArrayList<TumorProgressionDTO>();
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
     * Deletes all rows from TumorProgression table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the TumorProgression table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM TumorProgression " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the TumorProgressionDTO pObject into the database.
     *
     * @param pObject the TumorProgressionDTO pObject to be saved
     */
    public TumorProgressionDTO save(TumorProgressionDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getTumorProgressionKey() == null) {
            Object obj = max(ID__TUMORPROGRESSION_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setTumorProgressionKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into TumorProgression (");
    
                if (pObject.isTumorProgressionKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorProgression_key");
                    _dirtyCount++;
                }

                if (pObject.isParentKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Parent_key");
                    _dirtyCount++;
                }

                if (pObject.isChildKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Child_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorProgressionTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorProgressionType_key");
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

                if (pObject.isTumorProgressionKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKey());
                }
    
                if (pObject.isParentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getParentKey());
                }
    
                if (pObject.isChildKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChildKey());
                }
    
                if (pObject.isTumorProgressionTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionTypeKey());
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
                _sql = new StringBuffer("UPDATE TumorProgression SET ");
                boolean useComma=false;

                if (pObject.isTumorProgressionKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorProgression_key").append("=?");
                }

                if (pObject.isParentKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Parent_key").append("=?");
                }

                if (pObject.isChildKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Child_key").append("=?");
                }

                if (pObject.isTumorProgressionTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorProgressionType_key").append("=?");
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
                _sql.append("TumorProgression._TumorProgression_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorProgressionKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKey());
                }

                if (pObject.isParentKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getParentKey());
                }

                if (pObject.isChildKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChildKey());
                }

                if (pObject.isTumorProgressionTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionTypeKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKeyOriginal());
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
     * Saves a List of TumorProgressionDTO objects into the database.
     *
     * @param pObjects the TumorProgressionDTO pObject table to be saved
     * @return the saved TumorProgressionDTO List.
     */
    public List<TumorProgressionDTO> save(List<TumorProgressionDTO> pObjects) throws SQLException {
        for (TumorProgressionDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique TumorProgressionDTO object from a template
     *
     * @param pObject the TumorProgressionDTO object to look for
     * @return the pObject matching the template
     */
    public TumorProgressionDTO loadUniqueUsingTemplate(TumorProgressionDTO pObject) 
        throws SQLException {
         List<TumorProgressionDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of TumorProgressionDTO objects from a template one.
     *
     * @param pObject the TumorProgressionDTO template to look for
     * @return all the TumorProgressionDTO objects matching the template
     */
    public List<TumorProgressionDTO> loadUsingTemplate(TumorProgressionDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of TumorProgressionDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the TumorProgressionDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the TumorProgressionDTO matching the template
     */
    public List<TumorProgressionDTO> loadUsingTemplate(TumorProgressionDTO pObject,
                                                      int startRow,
                                                      int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from TumorProgression WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorProgressionKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorProgression_key= ?");
             }
    
             if (pObject.isParentKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Parent_key= ?");
             }
    
             if (pObject.isChildKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Child_key= ?");
             }
    
             if (pObject.isTumorProgressionTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorProgressionType_key= ?");
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
    
             if (pObject.isTumorProgressionKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKey());
             }
    
             if (pObject.isParentKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getParentKey());
             }
    
             if (pObject.isChildKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChildKey());
             }
    
             if (pObject.isTumorProgressionTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionTypeKey());
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
     * Deletes rows using a TumorProgressionDTO template.
     *
     * @param pObject the TumorProgressionDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(TumorProgressionDTO pObject) throws SQLException {
        if (pObject.isTumorProgressionKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getTumorProgressionKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM TumorProgression WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorProgressionKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorProgression_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isParentKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Parent_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isChildKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Child_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorProgressionTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorProgressionType_key").append("=?");
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
    
            if (pObject.isTumorProgressionKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKey());
            }
    
            if (pObject.isParentKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getParentKey());
            }
    
            if (pObject.isChildKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChildKey());
            }
    
            if (pObject.isTumorProgressionTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionTypeKey());
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
     * Retrieves the max value for a specified column of the table TumorProgression.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from TumorProgression";
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
                    case ID__TUMORPROGRESSION_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__PARENT_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__CHILD_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__TUMORPROGRESSIONTYPE_KEY:
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
     * Retrieves the min value for a specified column of the table TumorProgression.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from TumorProgression";
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
                    case ID__TUMORPROGRESSION_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__PARENT_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__CHILD_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__TUMORPROGRESSIONTYPE_KEY:
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
     * Retrieves the number of rows of the table TumorProgression.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table TumorProgression with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from TumorProgression " + where;
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
     * Retrieves the number of rows of the table TumorProgression with a prepared statement.
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
     * Looks for the number of elements of a specific TumorProgressionDTO pObject given a c
     *
     * @param pObject the TumorProgressionDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(TumorProgressionDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from TumorProgression WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorProgressionKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorProgression_key= ?");
                }
    
                if (pObject.isParentKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Parent_key= ?");
                }
    
                if (pObject.isChildKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Child_key= ?");
                }
    
                if (pObject.isTumorProgressionTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorProgressionType_key= ?");
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
    
                if (pObject.isTumorProgressionKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionKey());
                }
    
                if (pObject.isParentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getParentKey());
                }
    
                if (pObject.isChildKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChildKey());
                }
    
                if (pObject.isTumorProgressionTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorProgressionTypeKey());
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
     * Transforms a ResultSet iterating on the TumorProgression on a TumorProgressionDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting TumorProgressionDTO pObject
     */
    public TumorProgressionDTO decodeRow(ResultSet rs) throws SQLException {
        TumorProgressionDTO pObject = createTumorProgressionDTO();
        pObject.setTumorProgressionKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setParentKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setChildKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setTumorProgressionTypeKey(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the TumorProgression table on a TumorProgressionDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting TumorProgressionDTO pObject
     */
    public TumorProgressionDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        TumorProgressionDTO pObject = createTumorProgressionDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORPROGRESSION_KEY:
                    ++pos;
                    pObject.setTumorProgressionKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__PARENT_KEY:
                    ++pos;
                    pObject.setParentKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__CHILD_KEY:
                    ++pos;
                    pObject.setChildKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORPROGRESSIONTYPE_KEY:
                    ++pos;
                    pObject.setTumorProgressionTypeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of TumorProgressionDTO objects
     */
    public List<TumorProgressionDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<TumorProgressionDTO> v = new ArrayList<TumorProgressionDTO>();
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
