
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AlleleMarkerAssoc table.
 */
public class AlleleMarkerAssocDAO
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
     * Column _Marker_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MARKER_KEY = 1;
    public static final int TYPE__MARKER_KEY = Types.NUMERIC;
    public static final String NAME__MARKER_KEY = "_Marker_key";

    /**
     * Column _AlleleMarkerAssocType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELEMARKERASSOCTYPE_KEY = 2;
    public static final int TYPE__ALLELEMARKERASSOCTYPE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELEMARKERASSOCTYPE_KEY = "_AlleleMarkerAssocType_key";

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


    private static final String TABLE_NAME = "AlleleMarkerAssoc";

    /**
     * Create an array of type string containing all the fields of the AlleleMarkerAssoc table.
     */
    private static final String[] FIELD_NAMES = {
        "AlleleMarkerAssoc._Allele_key"
        ,"AlleleMarkerAssoc._Marker_key"
        ,"AlleleMarkerAssoc._AlleleMarkerAssocType_key"
        ,"AlleleMarkerAssoc.create_user"
        ,"AlleleMarkerAssoc.create_date"
        ,"AlleleMarkerAssoc.update_user"
        ,"AlleleMarkerAssoc.update_date"
    };

    /**
     * Create an array of type containing all the fields of the AlleleMarkerAssoc table.
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
     * Field that contains the comma separated fields of the AlleleMarkerAssoc table.
     */
    private static final String ALL_FIELDS = "AlleleMarkerAssoc._Allele_key"
                            + ",AlleleMarkerAssoc._Marker_key"
                            + ",AlleleMarkerAssoc._AlleleMarkerAssocType_key"
                            + ",AlleleMarkerAssoc.create_user"
                            + ",AlleleMarkerAssoc.create_date"
                            + ",AlleleMarkerAssoc.update_user"
                            + ",AlleleMarkerAssoc.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AlleleMarkerAssocDAO singleton = new AlleleMarkerAssocDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AlleleMarkerAssocDAO singleton.
     *
     * @return AlleleMarkerAssocDAO 
     */
    synchronized public static AlleleMarkerAssocDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AlleleMarkerAssocDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AlleleMarkerAssocDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AlleleMarkerAssocDTO instance.
     *
     * @return the new AlleleMarkerAssocDTO 
     */
    public AlleleMarkerAssocDTO createAlleleMarkerAssocDTO() {
        return new AlleleMarkerAssocDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AlleleMarkerAssocDTO from the AlleleMarkerAssoc using its key fields.
     *
     * @return a unique AlleleMarkerAssocDTO 
     */
    public AlleleMarkerAssocDTO loadByPrimaryKey(Long AlleleKey, Long AlleleMarkerAssocTypeKey, Long MarkerKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssoc WHERE AlleleMarkerAssoc._Allele_key=? and AlleleMarkerAssoc._AlleleMarkerAssocType_key=? and AlleleMarkerAssoc._Marker_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleKey);
            DAOManagerMTB.setLong(ps, 2, AlleleMarkerAssocTypeKey);
            DAOManagerMTB.setLong(ps, 3, MarkerKey);
            List<AlleleMarkerAssocDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AlleleKey, Long AlleleMarkerAssocTypeKey, Long MarkerKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AlleleMarkerAssoc WHERE AlleleMarkerAssoc._Allele_key=? and AlleleMarkerAssoc._AlleleMarkerAssocType_key=? and AlleleMarkerAssoc._Marker_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleKey);
            DAOManagerMTB.setLong(ps, 2, AlleleMarkerAssocTypeKey);
            DAOManagerMTB.setLong(ps, 3, MarkerKey);
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
     * Loads a List of AlleleMarkerAssocDTO objects from the AlleleMarkerAssoc table using its _Allele_key field.
     *
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByAlleleKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssoc WHERE _Allele_key=?",
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
     * Deletes from the AlleleMarkerAssoc table by _Allele_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAlleleKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM AlleleMarkerAssoc WHERE _Allele_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AlleleMarkerAssocDTO objects from the AlleleMarkerAssoc table using its _Marker_key field.
     *
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByMarkerKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssoc WHERE _Marker_key=?",
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
     * Deletes from the AlleleMarkerAssoc table by _Marker_key field.
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
            ps = c.prepareStatement("DELETE FROM AlleleMarkerAssoc WHERE _Marker_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AlleleMarkerAssocDTO objects from the AlleleMarkerAssoc table using its _AlleleMarkerAssocType_key field.
     *
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByAlleleMarkerAssocTypeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssoc WHERE _AlleleMarkerAssocType_key=?",
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
     * Deletes from the AlleleMarkerAssoc table by _AlleleMarkerAssocType_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAlleleMarkerAssocTypeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM AlleleMarkerAssoc WHERE _AlleleMarkerAssocType_key=?");
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
     * Retrieves the AlleleDTO object from the AlleleMarkerAssoc._Allele_key field.
     *
     * @param pObject the AlleleMarkerAssocDTO 
     * @return the associated AlleleDTO pObject
     */
    public AlleleDTO getAlleleDTO(AlleleMarkerAssocDTO pObject) 
    throws SQLException {
        AlleleDTO other = AlleleDAO.getInstance().createAlleleDTO();
        other.setAlleleKey(pObject.getAlleleKey());
        return AlleleDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleMarkerAssocDTO object to the AlleleDTO object.
     *
     * @param pObject the AlleleMarkerAssocDTO object to use
     * @param pObjectToBeSet the AlleleDTO object to associate to the AlleleMarkerAssocDTO 
     * @return the associated AlleleDTO pObject
     */
    // SET IMPORTED
    public AlleleMarkerAssocDTO setAlleleDTO(AlleleMarkerAssocDTO pObject,AlleleDTO pObjectToBeSet) {
        pObject.setAlleleKey(pObjectToBeSet.getAlleleKey());
        return pObject;
    }

    /**
     * Retrieves the MarkerDTO object from the AlleleMarkerAssoc._Marker_key field.
     *
     * @param pObject the AlleleMarkerAssocDTO 
     * @return the associated MarkerDTO pObject
     */
    public MarkerDTO getMarkerDTO(AlleleMarkerAssocDTO pObject) 
    throws SQLException {
        MarkerDTO other = MarkerDAO.getInstance().createMarkerDTO();
        other.setMarkerKey(pObject.getMarkerKey());
        return MarkerDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleMarkerAssocDTO object to the MarkerDTO object.
     *
     * @param pObject the AlleleMarkerAssocDTO object to use
     * @param pObjectToBeSet the MarkerDTO object to associate to the AlleleMarkerAssocDTO 
     * @return the associated MarkerDTO pObject
     */
    // SET IMPORTED
    public AlleleMarkerAssocDTO setMarkerDTO(AlleleMarkerAssocDTO pObject,MarkerDTO pObjectToBeSet) {
        pObject.setMarkerKey(pObjectToBeSet.getMarkerKey());
        return pObject;
    }

    /**
     * Retrieves the AlleleMarkerAssocTypeDTO object from the AlleleMarkerAssoc._AlleleMarkerAssocType_key field.
     *
     * @param pObject the AlleleMarkerAssocDTO 
     * @return the associated AlleleMarkerAssocTypeDTO pObject
     */
    public AlleleMarkerAssocTypeDTO getAlleleMarkerAssocTypeDTO(AlleleMarkerAssocDTO pObject) 
    throws SQLException {
        AlleleMarkerAssocTypeDTO other = AlleleMarkerAssocTypeDAO.getInstance().createAlleleMarkerAssocTypeDTO();
        other.setAlleleMarkerAssocTypeKey(pObject.getAlleleMarkerAssocTypeKey());
        return AlleleMarkerAssocTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleMarkerAssocDTO object to the AlleleMarkerAssocTypeDTO object.
     *
     * @param pObject the AlleleMarkerAssocDTO object to use
     * @param pObjectToBeSet the AlleleMarkerAssocTypeDTO object to associate to the AlleleMarkerAssocDTO 
     * @return the associated AlleleMarkerAssocTypeDTO pObject
     */
    // SET IMPORTED
    public AlleleMarkerAssocDTO setAlleleMarkerAssocTypeDTO(AlleleMarkerAssocDTO pObject,AlleleMarkerAssocTypeDTO pObjectToBeSet) {
        pObject.setAlleleMarkerAssocTypeKey(pObjectToBeSet.getAlleleMarkerAssocTypeKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from AlleleMarkerAssoc.
     *
     * @return a List of AlleleMarkerAssocDAO objects
     */
    public List<AlleleMarkerAssocDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AlleleMarkerAssoc, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleMarkerAssocDAO objects
     */
    public List<AlleleMarkerAssocDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssoc",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AlleleMarkerAssocDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AlleleMarkerAssocDTO table 
     */
    public List<AlleleMarkerAssocDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AlleleMarkerAssocDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleMarkerAssocDTO table 
     */
    public List<AlleleMarkerAssocDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AlleleMarkerAssocDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleMarkerAssocDTO table 
     */
    public List<AlleleMarkerAssocDTO> loadByWhere(String where, 
                                                 int[] fieldList, 
                                                 int startRow, 
                                                 int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AlleleMarkerAssoc " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AlleleMarkerAssoc ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AlleleMarkerAssocDTO> v = new ArrayList<AlleleMarkerAssocDTO>();
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
     * Deletes all rows from AlleleMarkerAssoc table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AlleleMarkerAssoc table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AlleleMarkerAssoc " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AlleleMarkerAssocDTO pObject into the database.
     *
     * @param pObject the AlleleMarkerAssocDTO pObject to be saved
     */
    public AlleleMarkerAssocDTO save(AlleleMarkerAssocDTO pObject) 
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
    
        if (pObject.getAlleleMarkerAssocTypeKey() == null) {
            Object obj = max(ID__ALLELEMARKERASSOCTYPE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAlleleMarkerAssocTypeKey(++key);
        }
    
        if (pObject.getMarkerKey() == null) {
            Object obj = max(ID__MARKER_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setMarkerKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AlleleMarkerAssoc (");
    
                if (pObject.isAlleleKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Allele_key");
                    _dirtyCount++;
                }

                if (pObject.isMarkerKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Marker_key");
                    _dirtyCount++;
                }

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AlleleMarkerAssocType_key");
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
    
                if (pObject.isMarkerKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
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
                _sql = new StringBuffer("UPDATE AlleleMarkerAssoc SET ");
                boolean useComma=false;

                if (pObject.isAlleleKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Allele_key").append("=?");
                }

                if (pObject.isMarkerKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Marker_key").append("=?");
                }

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AlleleMarkerAssocType_key").append("=?");
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
                _sql.append("AlleleMarkerAssoc._Allele_key=? AND AlleleMarkerAssoc._AlleleMarkerAssocType_key=? AND AlleleMarkerAssoc._Marker_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAlleleKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }

                if (pObject.isMarkerKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
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
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKeyOriginal());
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKeyOriginal());
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
     * Saves a List of AlleleMarkerAssocDTO objects into the database.
     *
     * @param pObjects the AlleleMarkerAssocDTO pObject table to be saved
     * @return the saved AlleleMarkerAssocDTO List.
     */
    public List<AlleleMarkerAssocDTO> save(List<AlleleMarkerAssocDTO> pObjects) throws SQLException {
        for (AlleleMarkerAssocDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AlleleMarkerAssocDTO object from a template
     *
     * @param pObject the AlleleMarkerAssocDTO object to look for
     * @return the pObject matching the template
     */
    public AlleleMarkerAssocDTO loadUniqueUsingTemplate(AlleleMarkerAssocDTO pObject) 
        throws SQLException {
         List<AlleleMarkerAssocDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AlleleMarkerAssocDTO objects from a template one.
     *
     * @param pObject the AlleleMarkerAssocDTO template to look for
     * @return all the AlleleMarkerAssocDTO objects matching the template
     */
    public List<AlleleMarkerAssocDTO> loadUsingTemplate(AlleleMarkerAssocDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AlleleMarkerAssocDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AlleleMarkerAssocDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AlleleMarkerAssocDTO matching the template
     */
    public List<AlleleMarkerAssocDTO> loadUsingTemplate(AlleleMarkerAssocDTO pObject,
                                                       int startRow,
                                                       int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AlleleMarkerAssoc WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAlleleKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
             }
    
             if (pObject.isMarkerKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Marker_key= ?");
             }
    
             if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleMarkerAssocType_key= ?");
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
    
             if (pObject.isMarkerKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
             }
    
             if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
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
     * Deletes rows using a AlleleMarkerAssocDTO template.
     *
     * @param pObject the AlleleMarkerAssocDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AlleleMarkerAssocDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AlleleMarkerAssoc WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAlleleKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Allele_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMarkerKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Marker_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAlleleMarkerAssocTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AlleleMarkerAssocType_key").append("=?");
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
    
            if (pObject.isMarkerKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
            }
    
            if (pObject.isAlleleMarkerAssocTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
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
     * Retrieves the max value for a specified column of the table AlleleMarkerAssoc.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AlleleMarkerAssoc";
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
                    case ID__MARKER_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ALLELEMARKERASSOCTYPE_KEY:
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
     * Retrieves the min value for a specified column of the table AlleleMarkerAssoc.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AlleleMarkerAssoc";
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
                    case ID__MARKER_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ALLELEMARKERASSOCTYPE_KEY:
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
     * Retrieves the number of rows of the table AlleleMarkerAssoc.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AlleleMarkerAssoc with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AlleleMarkerAssoc " + where;
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
     * Retrieves the number of rows of the table AlleleMarkerAssoc with a prepared statement.
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
     * Looks for the number of elements of a specific AlleleMarkerAssocDTO pObject given a c
     *
     * @param pObject the AlleleMarkerAssocDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AlleleMarkerAssocDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AlleleMarkerAssoc WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAlleleKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
                }
    
                if (pObject.isMarkerKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Marker_key= ?");
                }
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleMarkerAssocType_key= ?");
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
    
                if (pObject.isMarkerKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMarkerKey());
                }
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
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
     * Transforms a ResultSet iterating on the AlleleMarkerAssoc on a AlleleMarkerAssocDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AlleleMarkerAssocDTO pObject
     */
    public AlleleMarkerAssocDTO decodeRow(ResultSet rs) throws SQLException {
        AlleleMarkerAssocDTO pObject = createAlleleMarkerAssocDTO();
        pObject.setAlleleKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setMarkerKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setAlleleMarkerAssocTypeKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setCreateUser(rs.getString(4));
        pObject.setCreateDate(rs.getTimestamp(5));
        pObject.setUpdateUser(rs.getString(6));
        pObject.setUpdateDate(rs.getTimestamp(7));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AlleleMarkerAssoc table on a AlleleMarkerAssocDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AlleleMarkerAssocDTO pObject
     */
    public AlleleMarkerAssocDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AlleleMarkerAssocDTO pObject = createAlleleMarkerAssocDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ALLELE_KEY:
                    ++pos;
                    pObject.setAlleleKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__MARKER_KEY:
                    ++pos;
                    pObject.setMarkerKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ALLELEMARKERASSOCTYPE_KEY:
                    ++pos;
                    pObject.setAlleleMarkerAssocTypeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AlleleMarkerAssocDTO objects
     */
    public List<AlleleMarkerAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AlleleMarkerAssocDTO> v = new ArrayList<AlleleMarkerAssocDTO>();
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
