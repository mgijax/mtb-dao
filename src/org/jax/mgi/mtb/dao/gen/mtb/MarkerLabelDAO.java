
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the MarkerLabel table.
 */
public class MarkerLabelDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _MarkerLabel_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MARKERLABEL_KEY = 0;
    public static final int TYPE__MARKERLABEL_KEY = Types.NUMERIC;
    public static final String NAME__MARKERLABEL_KEY = "_MarkerLabel_key";

    /**
     * Column _Marker_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MARKER_KEY = 1;
    public static final int TYPE__MARKER_KEY = Types.NUMERIC;
    public static final String NAME__MARKER_KEY = "_Marker_key";

    /**
     * Column _LabelType_key of type Types.CHAR mapped to String.
     */
    public static final int ID__LABELTYPE_KEY = 2;
    public static final int TYPE__LABELTYPE_KEY = Types.CHAR;
    public static final String NAME__LABELTYPE_KEY = "_LabelType_key";

    /**
     * Column label of type Types.VARCHAR mapped to String.
     */
    public static final int ID_LABEL = 3;
    public static final int TYPE_LABEL = Types.VARCHAR;
    public static final String NAME_LABEL = "label";

    /**
     * Column _LabelStatus_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__LABELSTATUS_KEY = 4;
    public static final int TYPE__LABELSTATUS_KEY = Types.NUMERIC;
    public static final String NAME__LABELSTATUS_KEY = "_LabelStatus_key";

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


    private static final String TABLE_NAME = "MarkerLabel";

    /**
     * Create an array of type string containing all the fields of the MarkerLabel table.
     */
    private static final String[] FIELD_NAMES = {
        "MarkerLabel._MarkerLabel_key"
        ,"MarkerLabel._Marker_key"
        ,"MarkerLabel._LabelType_key"
        ,"MarkerLabel.label"
        ,"MarkerLabel._LabelStatus_key"
        ,"MarkerLabel.create_user"
        ,"MarkerLabel.create_date"
        ,"MarkerLabel.update_user"
        ,"MarkerLabel.update_date"
    };

    /**
     * Create an array of type containing all the fields of the MarkerLabel table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the MarkerLabel table.
     */
    private static final String ALL_FIELDS = "MarkerLabel._MarkerLabel_key"
                            + ",MarkerLabel._Marker_key"
                            + ",MarkerLabel._LabelType_key"
                            + ",MarkerLabel.label"
                            + ",MarkerLabel._LabelStatus_key"
                            + ",MarkerLabel.create_user"
                            + ",MarkerLabel.create_date"
                            + ",MarkerLabel.update_user"
                            + ",MarkerLabel.update_date";


    // ----------------------------------------------------- Instance Variables

    private static MarkerLabelDAO singleton = new MarkerLabelDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MarkerLabelDAO singleton.
     *
     * @return MarkerLabelDAO 
     */
    synchronized public static MarkerLabelDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own MarkerLabelDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(MarkerLabelDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new MarkerLabelDTO instance.
     *
     * @return the new MarkerLabelDTO 
     */
    public MarkerLabelDTO createMarkerLabelDTO() {
        return new MarkerLabelDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a MarkerLabelDTO from the MarkerLabel using its key fields.
     *
     * @return a unique MarkerLabelDTO 
     */
    public MarkerLabelDTO loadByPrimaryKey(Long MarkerLabelKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MarkerLabel WHERE MarkerLabel._MarkerLabel_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MarkerLabelKey);
            List<MarkerLabelDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long MarkerLabelKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from MarkerLabel WHERE MarkerLabel._MarkerLabel_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MarkerLabelKey);
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
     * Loads a List of MarkerLabelDTO objects from the MarkerLabel table using its _Marker_key field.
     *
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByMarkerKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MarkerLabel WHERE _Marker_key=?",
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
     * Deletes from the MarkerLabel table by _Marker_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByMarkerKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM MarkerLabel WHERE _Marker_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of MarkerLabelDTO objects from the MarkerLabel table using its _LabelType_key field.
     *
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByLabelTypeKey(String value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MarkerLabel WHERE _LabelType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, value);
            return loadByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the MarkerLabel table by _LabelType_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByLabelTypeKey(String value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM MarkerLabel WHERE _LabelType_key=?");
            ps.setString(1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of MarkerLabelDTO objects from the MarkerLabel table using its _LabelStatus_key field.
     *
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByLabelStatusKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MarkerLabel WHERE _LabelStatus_key=?",
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
     * Deletes from the MarkerLabel table by _LabelStatus_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByLabelStatusKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM MarkerLabel WHERE _LabelStatus_key=?");
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
     * Retrieves the MarkerDTO object from the MarkerLabel._Marker_key field.
     *
     * @param pObject the MarkerLabelDTO 
     * @return the associated MarkerDTO pObject
     */
    public MarkerDTO getMarkerDTO(MarkerLabelDTO pObject) 
    throws SQLException {
        MarkerDTO other = MarkerDAO.getInstance().createMarkerDTO();
        other.setMarkerKey(pObject.getMarkerKey());
        return MarkerDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MarkerLabelDTO object to the MarkerDTO object.
     *
     * @param pObject the MarkerLabelDTO object to use
     * @param pObjectToBeSet the MarkerDTO object to associate to the MarkerLabelDTO 
     * @return the associated MarkerDTO pObject
     */
    // SET IMPORTED
    public MarkerLabelDTO setMarkerDTO(MarkerLabelDTO pObject,MarkerDTO pObjectToBeSet) {
        pObject.setMarkerKey(pObjectToBeSet.getMarkerKey());
        return pObject;
    }

    /**
     * Retrieves the LabelTypeDTO object from the MarkerLabel._LabelType_key field.
     *
     * @param pObject the MarkerLabelDTO 
     * @return the associated LabelTypeDTO pObject
     */
    public LabelTypeDTO getLabelTypeDTO(MarkerLabelDTO pObject) 
    throws SQLException {
        LabelTypeDTO other = LabelTypeDAO.getInstance().createLabelTypeDTO();
        other.setLabelTypeKey(pObject.getLabelTypeKey());
        return LabelTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MarkerLabelDTO object to the LabelTypeDTO object.
     *
     * @param pObject the MarkerLabelDTO object to use
     * @param pObjectToBeSet the LabelTypeDTO object to associate to the MarkerLabelDTO 
     * @return the associated LabelTypeDTO pObject
     */
    // SET IMPORTED
    public MarkerLabelDTO setLabelTypeDTO(MarkerLabelDTO pObject,LabelTypeDTO pObjectToBeSet) {
        pObject.setLabelTypeKey(pObjectToBeSet.getLabelTypeKey());
        return pObject;
    }

    /**
     * Retrieves the LabelStatusDTO object from the MarkerLabel._LabelStatus_key field.
     *
     * @param pObject the MarkerLabelDTO 
     * @return the associated LabelStatusDTO pObject
     */
    public LabelStatusDTO getLabelStatusDTO(MarkerLabelDTO pObject) 
    throws SQLException {
        LabelStatusDTO other = LabelStatusDAO.getInstance().createLabelStatusDTO();
        other.setLabelStatusKey(pObject.getLabelStatusKey());
        return LabelStatusDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MarkerLabelDTO object to the LabelStatusDTO object.
     *
     * @param pObject the MarkerLabelDTO object to use
     * @param pObjectToBeSet the LabelStatusDTO object to associate to the MarkerLabelDTO 
     * @return the associated LabelStatusDTO pObject
     */
    // SET IMPORTED
    public MarkerLabelDTO setLabelStatusDTO(MarkerLabelDTO pObject,LabelStatusDTO pObjectToBeSet) {
        pObject.setLabelStatusKey(pObjectToBeSet.getLabelStatusKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from MarkerLabel.
     *
     * @return a List of MarkerLabelDAO objects
     */
    public List<MarkerLabelDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from MarkerLabel, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MarkerLabelDAO objects
     */
    public List<MarkerLabelDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MarkerLabel",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of MarkerLabelDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting MarkerLabelDTO table 
     */
    public List<MarkerLabelDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of MarkerLabelDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting MarkerLabelDTO table 
     */
    public List<MarkerLabelDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of MarkerLabelDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting MarkerLabelDTO table 
     */
    public List<MarkerLabelDTO> loadByWhere(String where, 
                                           int[] fieldList, 
                                           int startRow, 
                                           int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from MarkerLabel " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from MarkerLabel ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<MarkerLabelDTO> v = new ArrayList<MarkerLabelDTO>();
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
     * Deletes all rows from MarkerLabel table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the MarkerLabel table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM MarkerLabel " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the MarkerLabelDTO pObject into the database.
     *
     * @param pObject the MarkerLabelDTO pObject to be saved
     */
    public MarkerLabelDTO save(MarkerLabelDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getMarkerLabelKey() == null) {
            Object obj = max(ID__MARKERLABEL_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setMarkerLabelKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into MarkerLabel (");
    
                if (pObject.isMarkerLabelKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MarkerLabel_key");
                    _dirtyCount++;
                }

                if (pObject.isMarkerKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Marker_key");
                    _dirtyCount++;
                }

                if (pObject.isLabelTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_LabelType_key");
                    _dirtyCount++;
                }

                if (pObject.isLabelModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("label");
                    _dirtyCount++;
                }

                if (pObject.isLabelStatusKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_LabelStatus_key");
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

                if (pObject.isMarkerLabelKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKey());
                }
    
                if (pObject.isMarkerKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }
    
                if (pObject.isLabelTypeKeyModified()) {
                    ps.setString(++_dirtyCount, pObject.getLabelTypeKey());
                }
    
                if (pObject.isLabelModified()) {
                    ps.setString(++_dirtyCount, pObject.getLabel());
                }
    
                if (pObject.isLabelStatusKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getLabelStatusKey());
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
                _sql = new StringBuffer("UPDATE MarkerLabel SET ");
                boolean useComma=false;

                if (pObject.isMarkerLabelKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MarkerLabel_key").append("=?");
                }

                if (pObject.isMarkerKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Marker_key").append("=?");
                }

                if (pObject.isLabelTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_LabelType_key").append("=?");
                }

                if (pObject.isLabelModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("label").append("=?");
                }

                if (pObject.isLabelStatusKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_LabelStatus_key").append("=?");
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
                _sql.append("MarkerLabel._MarkerLabel_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isMarkerLabelKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKey());
                }

                if (pObject.isMarkerKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }

                if (pObject.isLabelTypeKeyModified()) {
                      ps.setString(++_dirtyCount, pObject.getLabelTypeKey());
                }

                if (pObject.isLabelModified()) {
                      ps.setString(++_dirtyCount, pObject.getLabel());
                }

                if (pObject.isLabelStatusKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getLabelStatusKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKeyOriginal());
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
     * Saves a List of MarkerLabelDTO objects into the database.
     *
     * @param pObjects the MarkerLabelDTO pObject table to be saved
     * @return the saved MarkerLabelDTO List.
     */
    public List<MarkerLabelDTO> save(List<MarkerLabelDTO> pObjects) throws SQLException {
        for (MarkerLabelDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique MarkerLabelDTO object from a template
     *
     * @param pObject the MarkerLabelDTO object to look for
     * @return the pObject matching the template
     */
    public MarkerLabelDTO loadUniqueUsingTemplate(MarkerLabelDTO pObject) 
        throws SQLException {
         List<MarkerLabelDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of MarkerLabelDTO objects from a template one.
     *
     * @param pObject the MarkerLabelDTO template to look for
     * @return all the MarkerLabelDTO objects matching the template
     */
    public List<MarkerLabelDTO> loadUsingTemplate(MarkerLabelDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of MarkerLabelDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the MarkerLabelDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the MarkerLabelDTO matching the template
     */
    public List<MarkerLabelDTO> loadUsingTemplate(MarkerLabelDTO pObject,
                                                 int startRow,
                                                 int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from MarkerLabel WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isMarkerLabelKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MarkerLabel_key= ?");
             }
    
             if (pObject.isMarkerKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Marker_key= ?");
             }
    
             if (pObject.isLabelTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_LabelType_key= ?");
             }
    
             if (pObject.isLabelModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("label= ?");
             }
    
             if (pObject.isLabelStatusKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_LabelStatus_key= ?");
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
    
             if (pObject.isMarkerLabelKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKey());
             }
    
             if (pObject.isMarkerKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
             }
    
             if (pObject.isLabelTypeKeyModified()) {
                 ps.setString(++_dirtyCount, pObject.getLabelTypeKey());
             }
    
             if (pObject.isLabelModified()) {
                 ps.setString(++_dirtyCount, pObject.getLabel());
             }
    
             if (pObject.isLabelStatusKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getLabelStatusKey());
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
     * Deletes rows using a MarkerLabelDTO template.
     *
     * @param pObject the MarkerLabelDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(MarkerLabelDTO pObject) throws SQLException {
        if (pObject.isMarkerLabelKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getMarkerLabelKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM MarkerLabel WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isMarkerLabelKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MarkerLabel_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMarkerKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Marker_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLabelTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_LabelType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLabelInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("label").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLabelStatusKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_LabelStatus_key").append("=?");
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
    
            if (pObject.isMarkerLabelKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKey());
            }
    
            if (pObject.isMarkerKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
            }
    
            if (pObject.isLabelTypeKeyInitialized()) {
                ps.setString(++_dirtyCount, pObject.getLabelTypeKey());
            }
    
            if (pObject.isLabelInitialized()) {
                ps.setString(++_dirtyCount, pObject.getLabel());
            }
    
            if (pObject.isLabelStatusKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getLabelStatusKey());
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
     * Retrieves the max value for a specified column of the table MarkerLabel.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from MarkerLabel";
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
                    case ID__MARKERLABEL_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__MARKER_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__LABELTYPE_KEY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_LABEL:
                        iReturn = rs.getString(1);
                        break;
                    case ID__LABELSTATUS_KEY:
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
     * Retrieves the min value for a specified column of the table MarkerLabel.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from MarkerLabel";
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
                    case ID__MARKERLABEL_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__MARKER_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__LABELTYPE_KEY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_LABEL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__LABELSTATUS_KEY:
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
     * Retrieves the number of rows of the table MarkerLabel.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table MarkerLabel with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from MarkerLabel " + where;
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
     * Retrieves the number of rows of the table MarkerLabel with a prepared statement.
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
     * Looks for the number of elements of a specific MarkerLabelDTO pObject given a c
     *
     * @param pObject the MarkerLabelDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(MarkerLabelDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from MarkerLabel WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isMarkerLabelKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MarkerLabel_key= ?");
                }
    
                if (pObject.isMarkerKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Marker_key= ?");
                }
    
                if (pObject.isLabelTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_LabelType_key= ?");
                }
    
                if (pObject.isLabelModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("label= ?");
                }
    
                if (pObject.isLabelStatusKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_LabelStatus_key= ?");
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
    
                if (pObject.isMarkerLabelKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerLabelKey());
                }
    
                if (pObject.isMarkerKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }
    
                if (pObject.isLabelTypeKeyModified()) {
                    ps.setString(++_dirtyCount, pObject.getLabelTypeKey());
                }
    
                if (pObject.isLabelModified()) {
                    ps.setString(++_dirtyCount, pObject.getLabel());
                }
    
                if (pObject.isLabelStatusKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getLabelStatusKey());
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
     * Transforms a ResultSet iterating on the MarkerLabel on a MarkerLabelDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting MarkerLabelDTO pObject
     */
    public MarkerLabelDTO decodeRow(ResultSet rs) throws SQLException {
        MarkerLabelDTO pObject = createMarkerLabelDTO();
        pObject.setMarkerLabelKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setMarkerKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setLabelTypeKey(rs.getString(3));
        pObject.setLabel(rs.getString(4));
        pObject.setLabelStatusKey(DAOManagerMTB.getLong(rs, 5));
        pObject.setCreateUser(rs.getString(6));
        pObject.setCreateDate(rs.getTimestamp(7));
        pObject.setUpdateUser(rs.getString(8));
        pObject.setUpdateDate(rs.getTimestamp(9));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the MarkerLabel table on a MarkerLabelDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting MarkerLabelDTO pObject
     */
    public MarkerLabelDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        MarkerLabelDTO pObject = createMarkerLabelDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__MARKERLABEL_KEY:
                    ++pos;
                    pObject.setMarkerLabelKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__MARKER_KEY:
                    ++pos;
                    pObject.setMarkerKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__LABELTYPE_KEY:
                    ++pos;
                    pObject.setLabelTypeKey(rs.getString(pos));
                    break;
                case ID_LABEL:
                    ++pos;
                    pObject.setLabel(rs.getString(pos));
                    break;
                case ID__LABELSTATUS_KEY:
                    ++pos;
                    pObject.setLabelStatusKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of MarkerLabelDTO objects
     */
    public List<MarkerLabelDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<MarkerLabelDTO> v = new ArrayList<MarkerLabelDTO>();
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
