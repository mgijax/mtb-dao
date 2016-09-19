
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 

/**
 * Handles database calls for the SampleAssoc table.
 */
public class SampleAssocDAO
// extends+ 

// extends- 
{


    // -------------------------------------------------------------- Constants

    /**
     * Column _sampleassoc_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__SAMPLEASSOC_KEY = 0;
    public static final int TYPE__SAMPLEASSOC_KEY = Types.DECIMAL;
    public static final String NAME__SAMPLEASSOC_KEY = "_sampleassoc_key";

    /**
     * Column _sample_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__SAMPLE_KEY = 1;
    public static final int TYPE__SAMPLE_KEY = Types.DECIMAL;
    public static final String NAME__SAMPLE_KEY = "_sample_key";

    /**
     * Column _object_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__OBJECT_KEY = 2;
    public static final int TYPE__OBJECT_KEY = Types.DECIMAL;
    public static final String NAME__OBJECT_KEY = "_object_key";

    /**
     * Column _MTBTypes_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__MTBTYPES_KEY = 3;
    public static final int TYPE__MTBTYPES_KEY = Types.DECIMAL;
    public static final String NAME__MTBTYPES_KEY = "_MTBTypes_key";

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


    private static final String TABLE_NAME = "SampleAssoc";

    /**
     * Create an array of type string containing all the fields of the SampleAssoc table.
     */
    private static final String[] FIELD_NAMES = {
        "SampleAssoc._sampleassoc_key"
        ,"SampleAssoc._sample_key"
        ,"SampleAssoc._object_key"
        ,"SampleAssoc._MTBTypes_key"
        ,"SampleAssoc.create_user"
        ,"SampleAssoc.create_date"
        ,"SampleAssoc.update_user"
        ,"SampleAssoc.update_date"
    };

    /**
     * Create an array of type containing all the fields of the SampleAssoc table.
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
     * Field that contains the comma separated fields of the SampleAssoc table.
     */
    private static final String ALL_FIELDS = "SampleAssoc._sampleassoc_key"
                            + ",SampleAssoc._sample_key"
                            + ",SampleAssoc._object_key"
                            + ",SampleAssoc._MTBTypes_key"
                            + ",SampleAssoc.create_user"
                            + ",SampleAssoc.create_date"
                            + ",SampleAssoc.update_user"
                            + ",SampleAssoc.update_date";


    // ----------------------------------------------------- Instance Variables

    private static SampleAssocDAO singleton = new SampleAssocDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the SampleAssocDAO singleton.
     *
     * @return SampleAssocDAO 
     */
    synchronized public static SampleAssocDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own SampleAssocDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(SampleAssocDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new SampleAssocDTO instance.
     *
     * @return the new SampleAssocDTO 
     */
    public SampleAssocDTO createSampleAssocDTO() {
        return new SampleAssocDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a SampleAssocDTO from the SampleAssoc using its key fields.
     *
     * @return a unique SampleAssocDTO 
     */
    public SampleAssocDTO loadByPrimaryKey(Long sampleassocKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM SampleAssoc WHERE SampleAssoc._sampleassoc_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, sampleassocKey);
            List<SampleAssocDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long sampleassocKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from SampleAssoc WHERE SampleAssoc._sampleassoc_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, sampleassocKey);
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
     * Loads a List of SampleAssocDTO objects from the SampleAssoc table using its _MTBTypes_key field.
     *
     * @return a List of SampleAssocDTO objects
     */
    public List<SampleAssocDTO> loadByMTBTypesKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM SampleAssoc WHERE _MTBTypes_key=?",
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
     * Deletes from the SampleAssoc table by _MTBTypes_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByMTBTypesKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM SampleAssoc WHERE _MTBTypes_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of SampleAssocDTO objects from the SampleAssoc table using its _sample_key field.
     *
     * @return a List of SampleAssocDTO objects
     */
    public List<SampleAssocDTO> loadBySampleKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM SampleAssoc WHERE _sample_key=?",
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
     * Deletes from the SampleAssoc table by _sample_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteBySampleKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM SampleAssoc WHERE _sample_key=?");
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
     * Retrieves the MTBTypesDTO object from the SampleAssoc._MTBTypes_key field.
     *
     * @param pObject the SampleAssocDTO 
     * @return the associated MTBTypesDTO pObject
     */
    public MTBTypesDTO getMTBTypesDTO(SampleAssocDTO pObject) 
    throws SQLException {
        MTBTypesDTO other = MTBTypesDAO.getInstance().createMTBTypesDTO();
        other.setMTBTypesKey(pObject.getMTBTypesKey());
        return MTBTypesDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the SampleAssocDTO object to the MTBTypesDTO object.
     *
     * @param pObject the SampleAssocDTO object to use
     * @param pObjectToBeSet the MTBTypesDTO object to associate to the SampleAssocDTO 
     * @return the associated MTBTypesDTO pObject
     */
    // SET IMPORTED
    public SampleAssocDTO setMTBTypesDTO(SampleAssocDTO pObject,MTBTypesDTO pObjectToBeSet) {
        pObject.setMTBTypesKey(pObjectToBeSet.getMTBTypesKey());
        return pObject;
    }

    /**
     * Retrieves the SampleDTO object from the SampleAssoc._sample_key field.
     *
     * @param pObject the SampleAssocDTO 
     * @return the associated SampleDTO pObject
     */
    public SampleDTO getSampleDTO(SampleAssocDTO pObject) 
    throws SQLException {
        SampleDTO other = SampleDAO.getInstance().createSampleDTO();
        other.setSampleKey(pObject.getSampleKey());
        return SampleDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the SampleAssocDTO object to the SampleDTO object.
     *
     * @param pObject the SampleAssocDTO object to use
     * @param pObjectToBeSet the SampleDTO object to associate to the SampleAssocDTO 
     * @return the associated SampleDTO pObject
     */
    // SET IMPORTED
    public SampleAssocDTO setSampleDTO(SampleAssocDTO pObject,SampleDTO pObjectToBeSet) {
        pObject.setSampleKey(pObjectToBeSet.getSampleKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from SampleAssoc.
     *
     * @return a List of SampleAssocDAO objects
     */
    public List<SampleAssocDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from SampleAssoc, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SampleAssocDAO objects
     */
    public List<SampleAssocDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM SampleAssoc",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of SampleAssocDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting SampleAssocDTO table 
     */
    public List<SampleAssocDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of SampleAssocDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting SampleAssocDTO table 
     */
    public List<SampleAssocDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of SampleAssocDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting SampleAssocDTO table 
     */
    public List<SampleAssocDTO> loadByWhere(String where, 
                                           int[] fieldList, 
                                           int startRow, 
                                           int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from SampleAssoc " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from SampleAssoc ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<SampleAssocDTO> v = new ArrayList<SampleAssocDTO>();
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
     * Deletes all rows from SampleAssoc table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the SampleAssoc table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM SampleAssoc " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the SampleAssocDTO pObject into the database.
     *
     * @param pObject the SampleAssocDTO pObject to be saved
     */
    public SampleAssocDTO save(SampleAssocDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getSampleassocKey() == null) {
            Object obj = max(ID__SAMPLEASSOC_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setSampleassocKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into SampleAssoc (");
    
                if (pObject.isSampleassocKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_sampleassoc_key");
                    _dirtyCount++;
                }

                if (pObject.isSampleKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_sample_key");
                    _dirtyCount++;
                }

                if (pObject.isObjectKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_object_key");
                    _dirtyCount++;
                }

                if (pObject.isMTBTypesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBTypes_key");
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

                if (pObject.isSampleassocKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKey());
                }
    
                if (pObject.isSampleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
                }
    
                if (pObject.isObjectKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
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
                _sql = new StringBuffer("UPDATE SampleAssoc SET ");
                boolean useComma=false;

                if (pObject.isSampleassocKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_sampleassoc_key").append("=?");
                }

                if (pObject.isSampleKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_sample_key").append("=?");
                }

                if (pObject.isObjectKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_object_key").append("=?");
                }

                if (pObject.isMTBTypesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBTypes_key").append("=?");
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
                _sql.append("SampleAssoc._sampleassoc_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isSampleassocKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKey());
                }

                if (pObject.isSampleKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
                }

                if (pObject.isObjectKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }

                if (pObject.isMTBTypesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKeyOriginal());
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
     * Saves a List of SampleAssocDTO objects into the database.
     *
     * @param pObjects the SampleAssocDTO pObject table to be saved
     * @return the saved SampleAssocDTO List.
     */
    public List<SampleAssocDTO> save(List<SampleAssocDTO> pObjects) throws SQLException {
        for (SampleAssocDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique SampleAssocDTO object from a template
     *
     * @param pObject the SampleAssocDTO object to look for
     * @return the pObject matching the template
     */
    public SampleAssocDTO loadUniqueUsingTemplate(SampleAssocDTO pObject) 
        throws SQLException {
         List<SampleAssocDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of SampleAssocDTO objects from a template one.
     *
     * @param pObject the SampleAssocDTO template to look for
     * @return all the SampleAssocDTO objects matching the template
     */
    public List<SampleAssocDTO> loadUsingTemplate(SampleAssocDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of SampleAssocDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the SampleAssocDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the SampleAssocDTO matching the template
     */
    public List<SampleAssocDTO> loadUsingTemplate(SampleAssocDTO pObject,
                                                 int startRow,
                                                 int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from SampleAssoc WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isSampleassocKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sampleassoc_key= ?");
             }
    
             if (pObject.isSampleKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sample_key= ?");
             }
    
             if (pObject.isObjectKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_object_key= ?");
             }
    
             if (pObject.isMTBTypesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
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
    
             if (pObject.isSampleassocKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKey());
             }
    
             if (pObject.isSampleKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
             }
    
             if (pObject.isObjectKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
             }
    
             if (pObject.isMTBTypesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
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
     * Deletes rows using a SampleAssocDTO template.
     *
     * @param pObject the SampleAssocDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(SampleAssocDTO pObject) throws SQLException {
        if (pObject.isSampleassocKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getSampleassocKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM SampleAssoc WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isSampleassocKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_sampleassoc_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSampleKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_sample_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isObjectKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_object_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBTypesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBTypes_key").append("=?");
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
    
            if (pObject.isSampleassocKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKey());
            }
    
            if (pObject.isSampleKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
            }
    
            if (pObject.isObjectKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
            }
    
            if (pObject.isMTBTypesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
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
     * Retrieves the max value for a specified column of the table SampleAssoc.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from SampleAssoc";
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
                    case ID__SAMPLEASSOC_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__SAMPLE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__OBJECT_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__MTBTYPES_KEY:
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
     * Retrieves the min value for a specified column of the table SampleAssoc.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from SampleAssoc";
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
                    case ID__SAMPLEASSOC_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__SAMPLE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__OBJECT_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__MTBTYPES_KEY:
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
     * Retrieves the number of rows of the table SampleAssoc.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table SampleAssoc with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from SampleAssoc " + where;
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
     * Retrieves the number of rows of the table SampleAssoc with a prepared statement.
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
     * Looks for the number of elements of a specific SampleAssocDTO pObject given a c
     *
     * @param pObject the SampleAssocDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(SampleAssocDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from SampleAssoc WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isSampleassocKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sampleassoc_key= ?");
                }
    
                if (pObject.isSampleKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sample_key= ?");
                }
    
                if (pObject.isObjectKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_object_key= ?");
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
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
    
                if (pObject.isSampleassocKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleassocKey());
                }
    
                if (pObject.isSampleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
                }
    
                if (pObject.isObjectKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
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
     * Transforms a ResultSet iterating on the SampleAssoc on a SampleAssocDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting SampleAssocDTO pObject
     */
    public SampleAssocDTO decodeRow(ResultSet rs) throws SQLException {
        SampleAssocDTO pObject = createSampleAssocDTO();
        pObject.setSampleassocKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setSampleKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setObjectKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the SampleAssoc table on a SampleAssocDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting SampleAssocDTO pObject
     */
    public SampleAssocDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        SampleAssocDTO pObject = createSampleAssocDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__SAMPLEASSOC_KEY:
                    ++pos;
                    pObject.setSampleassocKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__SAMPLE_KEY:
                    ++pos;
                    pObject.setSampleKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__OBJECT_KEY:
                    ++pos;
                    pObject.setObjectKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__MTBTYPES_KEY:
                    ++pos;
                    pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of SampleAssocDTO objects
     */
    public List<SampleAssocDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of SampleAssocDTO objects
     */
    public List<SampleAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of SampleAssocDTO objects
     */
    public List<SampleAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<SampleAssocDTO> v = new ArrayList<SampleAssocDTO>();
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
