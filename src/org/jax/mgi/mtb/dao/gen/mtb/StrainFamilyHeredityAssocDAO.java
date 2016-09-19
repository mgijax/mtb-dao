
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the StrainFamilyHeredityAssoc table.
 */
public class StrainFamilyHeredityAssocDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _StrainFamily_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAINFAMILY_KEY = 0;
    public static final int TYPE__STRAINFAMILY_KEY = Types.NUMERIC;
    public static final String NAME__STRAINFAMILY_KEY = "_StrainFamily_key";

    /**
     * Column _StrainHeredity_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAINHEREDITY_KEY = 1;
    public static final int TYPE__STRAINHEREDITY_KEY = Types.NUMERIC;
    public static final String NAME__STRAINHEREDITY_KEY = "_StrainHeredity_key";

    /**
     * Column description of type Types.VARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 2;
    public static final int TYPE_DESCRIPTION = Types.VARCHAR;
    public static final String NAME_DESCRIPTION = "description";

    /**
     * Column ordering of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_ORDERING = 3;
    public static final int TYPE_ORDERING = Types.NUMERIC;
    public static final String NAME_ORDERING = "ordering";

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


    private static final String TABLE_NAME = "StrainFamilyHeredityAssoc";

    /**
     * Create an array of type string containing all the fields of the StrainFamilyHeredityAssoc table.
     */
    private static final String[] FIELD_NAMES = {
        "StrainFamilyHeredityAssoc._StrainFamily_key"
        ,"StrainFamilyHeredityAssoc._StrainHeredity_key"
        ,"StrainFamilyHeredityAssoc.description"
        ,"StrainFamilyHeredityAssoc.ordering"
        ,"StrainFamilyHeredityAssoc.create_user"
        ,"StrainFamilyHeredityAssoc.create_date"
        ,"StrainFamilyHeredityAssoc.update_user"
        ,"StrainFamilyHeredityAssoc.update_date"
    };

    /**
     * Create an array of type containing all the fields of the StrainFamilyHeredityAssoc table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the StrainFamilyHeredityAssoc table.
     */
    private static final String ALL_FIELDS = "StrainFamilyHeredityAssoc._StrainFamily_key"
                            + ",StrainFamilyHeredityAssoc._StrainHeredity_key"
                            + ",StrainFamilyHeredityAssoc.description"
                            + ",StrainFamilyHeredityAssoc.ordering"
                            + ",StrainFamilyHeredityAssoc.create_user"
                            + ",StrainFamilyHeredityAssoc.create_date"
                            + ",StrainFamilyHeredityAssoc.update_user"
                            + ",StrainFamilyHeredityAssoc.update_date";


    // ----------------------------------------------------- Instance Variables

    private static StrainFamilyHeredityAssocDAO singleton = new StrainFamilyHeredityAssocDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the StrainFamilyHeredityAssocDAO singleton.
     *
     * @return StrainFamilyHeredityAssocDAO 
     */
    synchronized public static StrainFamilyHeredityAssocDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own StrainFamilyHeredityAssocDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(StrainFamilyHeredityAssocDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new StrainFamilyHeredityAssocDTO instance.
     *
     * @return the new StrainFamilyHeredityAssocDTO 
     */
    public StrainFamilyHeredityAssocDTO createStrainFamilyHeredityAssocDTO() {
        return new StrainFamilyHeredityAssocDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a StrainFamilyHeredityAssocDTO from the StrainFamilyHeredityAssoc using its key fields.
     *
     * @return a unique StrainFamilyHeredityAssocDTO 
     */
    public StrainFamilyHeredityAssocDTO loadByPrimaryKey(Long StrainFamilyKey, Long StrainHeredityKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainFamilyHeredityAssoc WHERE StrainFamilyHeredityAssoc._StrainFamily_key=? and StrainFamilyHeredityAssoc._StrainHeredity_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainFamilyKey);
            DAOManagerMTB.setLong(ps, 2, StrainHeredityKey);
            List<StrainFamilyHeredityAssocDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long StrainFamilyKey, Long StrainHeredityKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from StrainFamilyHeredityAssoc WHERE StrainFamilyHeredityAssoc._StrainFamily_key=? and StrainFamilyHeredityAssoc._StrainHeredity_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainFamilyKey);
            DAOManagerMTB.setLong(ps, 2, StrainHeredityKey);
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
     * Loads a List of StrainFamilyHeredityAssocDTO objects from the StrainFamilyHeredityAssoc table using its _StrainFamily_key field.
     *
     * @return a List of StrainFamilyHeredityAssocDTO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadByStrainFamilyKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainFamilyHeredityAssoc WHERE _StrainFamily_key=?",
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
     * Deletes from the StrainFamilyHeredityAssoc table by _StrainFamily_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByStrainFamilyKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM StrainFamilyHeredityAssoc WHERE _StrainFamily_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of StrainFamilyHeredityAssocDTO objects from the StrainFamilyHeredityAssoc table using its _StrainHeredity_key field.
     *
     * @return a List of StrainFamilyHeredityAssocDTO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadByStrainHeredityKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainFamilyHeredityAssoc WHERE _StrainHeredity_key=?",
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
     * Deletes from the StrainFamilyHeredityAssoc table by _StrainHeredity_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByStrainHeredityKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM StrainFamilyHeredityAssoc WHERE _StrainHeredity_key=?");
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
     * Retrieves the StrainFamilyDTO object from the StrainFamilyHeredityAssoc._StrainFamily_key field.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO 
     * @return the associated StrainFamilyDTO pObject
     */
    public StrainFamilyDTO getStrainFamilyDTO(StrainFamilyHeredityAssocDTO pObject) 
    throws SQLException {
        StrainFamilyDTO other = StrainFamilyDAO.getInstance().createStrainFamilyDTO();
        other.setStrainFamilyKey(pObject.getStrainFamilyKey());
        return StrainFamilyDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the StrainFamilyHeredityAssocDTO object to the StrainFamilyDTO object.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO object to use
     * @param pObjectToBeSet the StrainFamilyDTO object to associate to the StrainFamilyHeredityAssocDTO 
     * @return the associated StrainFamilyDTO pObject
     */
    // SET IMPORTED
    public StrainFamilyHeredityAssocDTO setStrainFamilyDTO(StrainFamilyHeredityAssocDTO pObject,StrainFamilyDTO pObjectToBeSet) {
        pObject.setStrainFamilyKey(pObjectToBeSet.getStrainFamilyKey());
        return pObject;
    }

    /**
     * Retrieves the StrainHeredityDTO object from the StrainFamilyHeredityAssoc._StrainHeredity_key field.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO 
     * @return the associated StrainHeredityDTO pObject
     */
    public StrainHeredityDTO getStrainHeredityDTO(StrainFamilyHeredityAssocDTO pObject) 
    throws SQLException {
        StrainHeredityDTO other = StrainHeredityDAO.getInstance().createStrainHeredityDTO();
        other.setStrainHeredityKey(pObject.getStrainHeredityKey());
        return StrainHeredityDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the StrainFamilyHeredityAssocDTO object to the StrainHeredityDTO object.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO object to use
     * @param pObjectToBeSet the StrainHeredityDTO object to associate to the StrainFamilyHeredityAssocDTO 
     * @return the associated StrainHeredityDTO pObject
     */
    // SET IMPORTED
    public StrainFamilyHeredityAssocDTO setStrainHeredityDTO(StrainFamilyHeredityAssocDTO pObject,StrainHeredityDTO pObjectToBeSet) {
        pObject.setStrainHeredityKey(pObjectToBeSet.getStrainHeredityKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from StrainFamilyHeredityAssoc.
     *
     * @return a List of StrainFamilyHeredityAssocDAO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from StrainFamilyHeredityAssoc, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainFamilyHeredityAssocDAO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainFamilyHeredityAssoc",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of StrainFamilyHeredityAssocDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting StrainFamilyHeredityAssocDTO table 
     */
    public List<StrainFamilyHeredityAssocDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of StrainFamilyHeredityAssocDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainFamilyHeredityAssocDTO table 
     */
    public List<StrainFamilyHeredityAssocDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of StrainFamilyHeredityAssocDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainFamilyHeredityAssocDTO table 
     */
    public List<StrainFamilyHeredityAssocDTO> loadByWhere(String where, 
                                                         int[] fieldList, 
                                                         int startRow, 
                                                         int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from StrainFamilyHeredityAssoc " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from StrainFamilyHeredityAssoc ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<StrainFamilyHeredityAssocDTO> v = new ArrayList<StrainFamilyHeredityAssocDTO>();
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
     * Deletes all rows from StrainFamilyHeredityAssoc table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the StrainFamilyHeredityAssoc table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM StrainFamilyHeredityAssoc " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the StrainFamilyHeredityAssocDTO pObject into the database.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO pObject to be saved
     */
    public StrainFamilyHeredityAssocDTO save(StrainFamilyHeredityAssocDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getStrainFamilyKey() == null) {
            Object obj = max(ID__STRAINFAMILY_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setStrainFamilyKey(++key);
        }
    
        if (pObject.getStrainHeredityKey() == null) {
            Object obj = max(ID__STRAINHEREDITY_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setStrainHeredityKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into StrainFamilyHeredityAssoc (");
    
                if (pObject.isStrainFamilyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_StrainFamily_key");
                    _dirtyCount++;
                }

                if (pObject.isStrainHeredityKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_StrainHeredity_key");
                    _dirtyCount++;
                }

                if (pObject.isDescriptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("description");
                    _dirtyCount++;
                }

                if (pObject.isOrderingModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("ordering");
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

                if (pObject.isStrainFamilyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKey());
                }
    
                if (pObject.isStrainHeredityKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKey());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isOrderingModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrdering());
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
                _sql = new StringBuffer("UPDATE StrainFamilyHeredityAssoc SET ");
                boolean useComma=false;

                if (pObject.isStrainFamilyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_StrainFamily_key").append("=?");
                }

                if (pObject.isStrainHeredityKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_StrainHeredity_key").append("=?");
                }

                if (pObject.isDescriptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("description").append("=?");
                }

                if (pObject.isOrderingModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("ordering").append("=?");
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
                _sql.append("StrainFamilyHeredityAssoc._StrainFamily_key=? AND StrainFamilyHeredityAssoc._StrainHeredity_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isStrainFamilyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKey());
                }

                if (pObject.isStrainHeredityKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKey());
                }

                if (pObject.isDescriptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getDescription());
                }

                if (pObject.isOrderingModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrdering());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKeyOriginal());
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKeyOriginal());
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
     * Saves a List of StrainFamilyHeredityAssocDTO objects into the database.
     *
     * @param pObjects the StrainFamilyHeredityAssocDTO pObject table to be saved
     * @return the saved StrainFamilyHeredityAssocDTO List.
     */
    public List<StrainFamilyHeredityAssocDTO> save(List<StrainFamilyHeredityAssocDTO> pObjects) throws SQLException {
        for (StrainFamilyHeredityAssocDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique StrainFamilyHeredityAssocDTO object from a template
     *
     * @param pObject the StrainFamilyHeredityAssocDTO object to look for
     * @return the pObject matching the template
     */
    public StrainFamilyHeredityAssocDTO loadUniqueUsingTemplate(StrainFamilyHeredityAssocDTO pObject) 
        throws SQLException {
         List<StrainFamilyHeredityAssocDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of StrainFamilyHeredityAssocDTO objects from a template one.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO template to look for
     * @return all the StrainFamilyHeredityAssocDTO objects matching the template
     */
    public List<StrainFamilyHeredityAssocDTO> loadUsingTemplate(StrainFamilyHeredityAssocDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of StrainFamilyHeredityAssocDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the StrainFamilyHeredityAssocDTO matching the template
     */
    public List<StrainFamilyHeredityAssocDTO> loadUsingTemplate(StrainFamilyHeredityAssocDTO pObject,
                                                               int startRow,
                                                               int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from StrainFamilyHeredityAssoc WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isStrainFamilyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainFamily_key= ?");
             }
    
             if (pObject.isStrainHeredityKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainHeredity_key= ?");
             }
    
             if (pObject.isDescriptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
             }
    
             if (pObject.isOrderingModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ordering= ?");
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
    
             if (pObject.isStrainFamilyKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKey());
             }
    
             if (pObject.isStrainHeredityKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKey());
             }
    
             if (pObject.isDescriptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getDescription());
             }
    
             if (pObject.isOrderingModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrdering());
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
     * Deletes rows using a StrainFamilyHeredityAssocDTO template.
     *
     * @param pObject the StrainFamilyHeredityAssocDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(StrainFamilyHeredityAssocDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM StrainFamilyHeredityAssoc WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isStrainFamilyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_StrainFamily_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStrainHeredityKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_StrainHeredity_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDescriptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("description").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isOrderingInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("ordering").append("=?");
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
    
            if (pObject.isStrainFamilyKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKey());
            }
    
            if (pObject.isStrainHeredityKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKey());
            }
    
            if (pObject.isDescriptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getDescription());
            }
    
            if (pObject.isOrderingInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrdering());
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
     * Retrieves the max value for a specified column of the table StrainFamilyHeredityAssoc.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from StrainFamilyHeredityAssoc";
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
                    case ID__STRAINFAMILY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__STRAINHEREDITY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ORDERING:
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
     * Retrieves the min value for a specified column of the table StrainFamilyHeredityAssoc.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from StrainFamilyHeredityAssoc";
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
                    case ID__STRAINFAMILY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__STRAINHEREDITY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ORDERING:
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
     * Retrieves the number of rows of the table StrainFamilyHeredityAssoc.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table StrainFamilyHeredityAssoc with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from StrainFamilyHeredityAssoc " + where;
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
     * Retrieves the number of rows of the table StrainFamilyHeredityAssoc with a prepared statement.
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
     * Looks for the number of elements of a specific StrainFamilyHeredityAssocDTO pObject given a c
     *
     * @param pObject the StrainFamilyHeredityAssocDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(StrainFamilyHeredityAssocDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from StrainFamilyHeredityAssoc WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isStrainFamilyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainFamily_key= ?");
                }
    
                if (pObject.isStrainHeredityKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainHeredity_key= ?");
                }
    
                if (pObject.isDescriptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
                }
    
                if (pObject.isOrderingModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ordering= ?");
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
    
                if (pObject.isStrainFamilyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainFamilyKey());
                }
    
                if (pObject.isStrainHeredityKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainHeredityKey());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isOrderingModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrdering());
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
     * Transforms a ResultSet iterating on the StrainFamilyHeredityAssoc on a StrainFamilyHeredityAssocDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting StrainFamilyHeredityAssocDTO pObject
     */
    public StrainFamilyHeredityAssocDTO decodeRow(ResultSet rs) throws SQLException {
        StrainFamilyHeredityAssocDTO pObject = createStrainFamilyHeredityAssocDTO();
        pObject.setStrainFamilyKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setStrainHeredityKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setDescription(rs.getString(3));
        pObject.setOrdering(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the StrainFamilyHeredityAssoc table on a StrainFamilyHeredityAssocDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting StrainFamilyHeredityAssocDTO pObject
     */
    public StrainFamilyHeredityAssocDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        StrainFamilyHeredityAssocDTO pObject = createStrainFamilyHeredityAssocDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__STRAINFAMILY_KEY:
                    ++pos;
                    pObject.setStrainFamilyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__STRAINHEREDITY_KEY:
                    ++pos;
                    pObject.setStrainHeredityKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_DESCRIPTION:
                    ++pos;
                    pObject.setDescription(rs.getString(pos));
                    break;
                case ID_ORDERING:
                    ++pos;
                    pObject.setOrdering(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of StrainFamilyHeredityAssocDTO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of StrainFamilyHeredityAssocDTO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of StrainFamilyHeredityAssocDTO objects
     */
    public List<StrainFamilyHeredityAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<StrainFamilyHeredityAssocDTO> v = new ArrayList<StrainFamilyHeredityAssocDTO>();
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
