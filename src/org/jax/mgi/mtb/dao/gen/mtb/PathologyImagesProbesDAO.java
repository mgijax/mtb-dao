
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the PathologyImagesProbes table.
 */
public class PathologyImagesProbesDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Pathology_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__PATHOLOGY_KEY = 0;
    public static final int TYPE__PATHOLOGY_KEY = Types.NUMERIC;
    public static final String NAME__PATHOLOGY_KEY = "_Pathology_key";

    /**
     * Column _Images_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__IMAGES_KEY = 1;
    public static final int TYPE__IMAGES_KEY = Types.NUMERIC;
    public static final String NAME__IMAGES_KEY = "_Images_key";

    /**
     * Column _Probe_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__PROBE_KEY = 2;
    public static final int TYPE__PROBE_KEY = Types.NUMERIC;
    public static final String NAME__PROBE_KEY = "_Probe_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 3;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 4;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 5;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 6;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "PathologyImagesProbes";

    /**
     * Create an array of type string containing all the fields of the PathologyImagesProbes table.
     */
    private static final String[] FIELD_NAMES = {
        "PathologyImagesProbes._Pathology_key"
        ,"PathologyImagesProbes._Images_key"
        ,"PathologyImagesProbes._Probe_key"
        ,"PathologyImagesProbes.create_user"
        ,"PathologyImagesProbes.create_date"
        ,"PathologyImagesProbes.update_user"
        ,"PathologyImagesProbes.update_date"
    };

    /**
     * Create an array of type containing all the fields of the PathologyImagesProbes table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the PathologyImagesProbes table.
     */
    private static final String ALL_FIELDS = "PathologyImagesProbes._Pathology_key"
                            + ",PathologyImagesProbes._Images_key"
                            + ",PathologyImagesProbes._Probe_key"
                            + ",PathologyImagesProbes.create_user"
                            + ",PathologyImagesProbes.create_date"
                            + ",PathologyImagesProbes.update_user"
                            + ",PathologyImagesProbes.update_date";


    // ----------------------------------------------------- Instance Variables

    private static PathologyImagesProbesDAO singleton = new PathologyImagesProbesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the PathologyImagesProbesDAO singleton.
     *
     * @return PathologyImagesProbesDAO 
     */
    synchronized public static PathologyImagesProbesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own PathologyImagesProbesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(PathologyImagesProbesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new PathologyImagesProbesDTO instance.
     *
     * @return the new PathologyImagesProbesDTO 
     */
    public PathologyImagesProbesDTO createPathologyImagesProbesDTO() {
        return new PathologyImagesProbesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a PathologyImagesProbesDTO from the PathologyImagesProbes using its key fields.
     *
     * @return a unique PathologyImagesProbesDTO 
     */
    public PathologyImagesProbesDTO loadByPrimaryKey(Long ImagesKey, Long PathologyKey, Long ProbeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImagesProbes WHERE PathologyImagesProbes._Images_key=? and PathologyImagesProbes._Pathology_key=? and PathologyImagesProbes._Probe_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
            DAOManagerMTB.setLong(ps, 2, PathologyKey);
            DAOManagerMTB.setLong(ps, 3, ProbeKey);
            List<PathologyImagesProbesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ImagesKey, Long PathologyKey, Long ProbeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from PathologyImagesProbes WHERE PathologyImagesProbes._Images_key=? and PathologyImagesProbes._Pathology_key=? and PathologyImagesProbes._Probe_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
            DAOManagerMTB.setLong(ps, 2, PathologyKey);
            DAOManagerMTB.setLong(ps, 3, ProbeKey);
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
     * Loads a List of PathologyImagesProbesDTO objects from the PathologyImagesProbes table using its _Probe_key field.
     *
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByProbeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImagesProbes WHERE _Probe_key=?",
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
     * Deletes from the PathologyImagesProbes table by _Probe_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByProbeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM PathologyImagesProbes WHERE _Probe_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of PathologyImagesProbesDTO objects from the PathologyImagesProbes table using its _Pathology_key field.
     *
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByPathologyKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImagesProbes WHERE _Pathology_key=?",
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
     * Deletes from the PathologyImagesProbes table by _Pathology_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByPathologyKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM PathologyImagesProbes WHERE _Pathology_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of PathologyImagesProbesDTO objects from the PathologyImagesProbes table using its _Images_key field.
     *
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByImagesKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImagesProbes WHERE _Images_key=?",
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
     * Deletes from the PathologyImagesProbes table by _Images_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByImagesKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM PathologyImagesProbes WHERE _Images_key=?");
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
     * Retrieves the ProbeDTO object from the PathologyImagesProbes._Probe_key field.
     *
     * @param pObject the PathologyImagesProbesDTO 
     * @return the associated ProbeDTO pObject
     */
    public ProbeDTO getProbeDTO(PathologyImagesProbesDTO pObject) 
    throws SQLException {
        ProbeDTO other = ProbeDAO.getInstance().createProbeDTO();
        other.setProbeKey(pObject.getProbeKey());
        return ProbeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyImagesProbesDTO object to the ProbeDTO object.
     *
     * @param pObject the PathologyImagesProbesDTO object to use
     * @param pObjectToBeSet the ProbeDTO object to associate to the PathologyImagesProbesDTO 
     * @return the associated ProbeDTO pObject
     */
    // SET IMPORTED
    public PathologyImagesProbesDTO setProbeDTO(PathologyImagesProbesDTO pObject,ProbeDTO pObjectToBeSet) {
        pObject.setProbeKey(pObjectToBeSet.getProbeKey());
        return pObject;
    }

    /**
     * Retrieves the PathologyImagesDTO object from the PathologyImagesProbes._Pathology_key field.
     *
     * @param pObject the PathologyImagesProbesDTO 
     * @return the associated PathologyImagesDTO pObject
     */
    public PathologyImagesDTO getPathologyImagesDTO(PathologyImagesProbesDTO pObject) 
    throws SQLException {
        PathologyImagesDTO other = PathologyImagesDAO.getInstance().createPathologyImagesDTO();
        other.setPathologyKey(pObject.getPathologyKey());
        return PathologyImagesDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyImagesProbesDTO object to the PathologyImagesDTO object.
     *
     * @param pObject the PathologyImagesProbesDTO object to use
     * @param pObjectToBeSet the PathologyImagesDTO object to associate to the PathologyImagesProbesDTO 
     * @return the associated PathologyImagesDTO pObject
     */
    // SET IMPORTED
    public PathologyImagesProbesDTO setPathologyImagesDTO(PathologyImagesProbesDTO pObject,PathologyImagesDTO pObjectToBeSet) {
        pObject.setPathologyKey(pObjectToBeSet.getPathologyKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from PathologyImagesProbes.
     *
     * @return a List of PathologyImagesProbesDAO objects
     */
    public List<PathologyImagesProbesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from PathologyImagesProbes, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyImagesProbesDAO objects
     */
    public List<PathologyImagesProbesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImagesProbes",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of PathologyImagesProbesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting PathologyImagesProbesDTO table 
     */
    public List<PathologyImagesProbesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of PathologyImagesProbesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyImagesProbesDTO table 
     */
    public List<PathologyImagesProbesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of PathologyImagesProbesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyImagesProbesDTO table 
     */
    public List<PathologyImagesProbesDTO> loadByWhere(String where, 
                                                     int[] fieldList, 
                                                     int startRow, 
                                                     int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from PathologyImagesProbes " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from PathologyImagesProbes ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<PathologyImagesProbesDTO> v = new ArrayList<PathologyImagesProbesDTO>();
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
     * Deletes all rows from PathologyImagesProbes table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the PathologyImagesProbes table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM PathologyImagesProbes " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the PathologyImagesProbesDTO pObject into the database.
     *
     * @param pObject the PathologyImagesProbesDTO pObject to be saved
     */
    public PathologyImagesProbesDTO save(PathologyImagesProbesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getImagesKey() == null) {
            Object obj = max(ID__IMAGES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setImagesKey(++key);
        }
    
        if (pObject.getPathologyKey() == null) {
            Object obj = max(ID__PATHOLOGY_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setPathologyKey(++key);
        }
    
        if (pObject.getProbeKey() == null) {
            Object obj = max(ID__PROBE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setProbeKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into PathologyImagesProbes (");
    
                if (pObject.isPathologyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Pathology_key");
                    _dirtyCount++;
                }

                if (pObject.isImagesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Images_key");
                    _dirtyCount++;
                }

                if (pObject.isProbeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Probe_key");
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

                if (pObject.isPathologyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
                }
    
                if (pObject.isImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }
    
                if (pObject.isProbeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
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
                _sql = new StringBuffer("UPDATE PathologyImagesProbes SET ");
                boolean useComma=false;

                if (pObject.isPathologyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Pathology_key").append("=?");
                }

                if (pObject.isImagesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Images_key").append("=?");
                }

                if (pObject.isProbeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Probe_key").append("=?");
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
                _sql.append("PathologyImagesProbes._Images_key=? AND PathologyImagesProbes._Pathology_key=? AND PathologyImagesProbes._Probe_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isPathologyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
                }

                if (pObject.isImagesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }

                if (pObject.isProbeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKeyOriginal());
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKeyOriginal());
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKeyOriginal());
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
     * Saves a List of PathologyImagesProbesDTO objects into the database.
     *
     * @param pObjects the PathologyImagesProbesDTO pObject table to be saved
     * @return the saved PathologyImagesProbesDTO List.
     */
    public List<PathologyImagesProbesDTO> save(List<PathologyImagesProbesDTO> pObjects) throws SQLException {
        for (PathologyImagesProbesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique PathologyImagesProbesDTO object from a template
     *
     * @param pObject the PathologyImagesProbesDTO object to look for
     * @return the pObject matching the template
     */
    public PathologyImagesProbesDTO loadUniqueUsingTemplate(PathologyImagesProbesDTO pObject) 
        throws SQLException {
         List<PathologyImagesProbesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of PathologyImagesProbesDTO objects from a template one.
     *
     * @param pObject the PathologyImagesProbesDTO template to look for
     * @return all the PathologyImagesProbesDTO objects matching the template
     */
    public List<PathologyImagesProbesDTO> loadUsingTemplate(PathologyImagesProbesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of PathologyImagesProbesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the PathologyImagesProbesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the PathologyImagesProbesDTO matching the template
     */
    public List<PathologyImagesProbesDTO> loadUsingTemplate(PathologyImagesProbesDTO pObject,
                                                           int startRow,
                                                           int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from PathologyImagesProbes WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isPathologyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathology_key= ?");
             }
    
             if (pObject.isImagesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Images_key= ?");
             }
    
             if (pObject.isProbeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Probe_key= ?");
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
    
             if (pObject.isPathologyKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
             }
    
             if (pObject.isImagesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
             }
    
             if (pObject.isProbeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
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
     * Deletes rows using a PathologyImagesProbesDTO template.
     *
     * @param pObject the PathologyImagesProbesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(PathologyImagesProbesDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM PathologyImagesProbes WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isPathologyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Pathology_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isImagesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Images_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isProbeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Probe_key").append("=?");
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
    
            if (pObject.isPathologyKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
            }
    
            if (pObject.isImagesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
            }
    
            if (pObject.isProbeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
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
     * Retrieves the max value for a specified column of the table PathologyImagesProbes.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from PathologyImagesProbes";
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
                    case ID__PATHOLOGY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__IMAGES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__PROBE_KEY:
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
     * Retrieves the min value for a specified column of the table PathologyImagesProbes.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from PathologyImagesProbes";
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
                    case ID__PATHOLOGY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__IMAGES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__PROBE_KEY:
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
     * Retrieves the number of rows of the table PathologyImagesProbes.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table PathologyImagesProbes with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from PathologyImagesProbes " + where;
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
     * Retrieves the number of rows of the table PathologyImagesProbes with a prepared statement.
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
     * Looks for the number of elements of a specific PathologyImagesProbesDTO pObject given a c
     *
     * @param pObject the PathologyImagesProbesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(PathologyImagesProbesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from PathologyImagesProbes WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isPathologyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathology_key= ?");
                }
    
                if (pObject.isImagesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Images_key= ?");
                }
    
                if (pObject.isProbeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Probe_key= ?");
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
    
                if (pObject.isPathologyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
                }
    
                if (pObject.isImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }
    
                if (pObject.isProbeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
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
     * Transforms a ResultSet iterating on the PathologyImagesProbes on a PathologyImagesProbesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting PathologyImagesProbesDTO pObject
     */
    public PathologyImagesProbesDTO decodeRow(ResultSet rs) throws SQLException {
        PathologyImagesProbesDTO pObject = createPathologyImagesProbesDTO();
        pObject.setPathologyKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setImagesKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setProbeKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setCreateUser(rs.getString(4));
        pObject.setCreateDate(rs.getTimestamp(5));
        pObject.setUpdateUser(rs.getString(6));
        pObject.setUpdateDate(rs.getTimestamp(7));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the PathologyImagesProbes table on a PathologyImagesProbesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting PathologyImagesProbesDTO pObject
     */
    public PathologyImagesProbesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        PathologyImagesProbesDTO pObject = createPathologyImagesProbesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__PATHOLOGY_KEY:
                    ++pos;
                    pObject.setPathologyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__IMAGES_KEY:
                    ++pos;
                    pObject.setImagesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__PROBE_KEY:
                    ++pos;
                    pObject.setProbeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of PathologyImagesProbesDTO objects
     */
    public List<PathologyImagesProbesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<PathologyImagesProbesDTO> v = new ArrayList<PathologyImagesProbesDTO>();
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
