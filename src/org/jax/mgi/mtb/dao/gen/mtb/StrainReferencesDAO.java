
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the StrainReferences table.
 */
public class StrainReferencesDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _StrainReferences_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAINREFERENCES_KEY = 0;
    public static final int TYPE__STRAINREFERENCES_KEY = Types.NUMERIC;
    public static final String NAME__STRAINREFERENCES_KEY = "_StrainReferences_key";

    /**
     * Column _Strain_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAIN_KEY = 1;
    public static final int TYPE__STRAIN_KEY = Types.NUMERIC;
    public static final String NAME__STRAIN_KEY = "_Strain_key";

    /**
     * Column _Reference_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 2;
    public static final int TYPE__REFERENCE_KEY = Types.NUMERIC;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

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


    private static final String TABLE_NAME = "StrainReferences";

    /**
     * Create an array of type string containing all the fields of the StrainReferences table.
     */
    private static final String[] FIELD_NAMES = {
        "StrainReferences._StrainReferences_key"
        ,"StrainReferences._Strain_key"
        ,"StrainReferences._Reference_key"
        ,"StrainReferences.create_user"
        ,"StrainReferences.create_date"
        ,"StrainReferences.update_user"
        ,"StrainReferences.update_date"
    };

    /**
     * Create an array of type containing all the fields of the StrainReferences table.
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
     * Field that contains the comma separated fields of the StrainReferences table.
     */
    private static final String ALL_FIELDS = "StrainReferences._StrainReferences_key"
                            + ",StrainReferences._Strain_key"
                            + ",StrainReferences._Reference_key"
                            + ",StrainReferences.create_user"
                            + ",StrainReferences.create_date"
                            + ",StrainReferences.update_user"
                            + ",StrainReferences.update_date";


    // ----------------------------------------------------- Instance Variables

    private static StrainReferencesDAO singleton = new StrainReferencesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the StrainReferencesDAO singleton.
     *
     * @return StrainReferencesDAO 
     */
    synchronized public static StrainReferencesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own StrainReferencesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(StrainReferencesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new StrainReferencesDTO instance.
     *
     * @return the new StrainReferencesDTO 
     */
    public StrainReferencesDTO createStrainReferencesDTO() {
        return new StrainReferencesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a StrainReferencesDTO from the StrainReferences using its key fields.
     *
     * @return a unique StrainReferencesDTO 
     */
    public StrainReferencesDTO loadByPrimaryKey(Long StrainReferencesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainReferences WHERE StrainReferences._StrainReferences_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainReferencesKey);
            List<StrainReferencesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long StrainReferencesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from StrainReferences WHERE StrainReferences._StrainReferences_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, StrainReferencesKey);
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
     * Loads a List of StrainReferencesDTO objects from the StrainReferences table using its _Strain_key field.
     *
     * @return a List of StrainReferencesDTO objects
     */
    public List<StrainReferencesDTO> loadByStrainKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainReferences WHERE _Strain_key=?",
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
     * Deletes from the StrainReferences table by _Strain_key field.
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
            ps = c.prepareStatement("DELETE FROM StrainReferences WHERE _Strain_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of StrainReferencesDTO objects from the StrainReferences table using its _Reference_key field.
     *
     * @return a List of StrainReferencesDTO objects
     */
    public List<StrainReferencesDTO> loadByReferenceKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainReferences WHERE _Reference_key=?",
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
     * Deletes from the StrainReferences table by _Reference_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByReferenceKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM StrainReferences WHERE _Reference_key=?");
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
     * Retrieves the StrainDTO object from the StrainReferences._Strain_key field.
     *
     * @param pObject the StrainReferencesDTO 
     * @return the associated StrainDTO pObject
     */
    public StrainDTO getStrainDTO(StrainReferencesDTO pObject) 
    throws SQLException {
        StrainDTO other = StrainDAO.getInstance().createStrainDTO();
        other.setStrainKey(pObject.getStrainKey());
        return StrainDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the StrainReferencesDTO object to the StrainDTO object.
     *
     * @param pObject the StrainReferencesDTO object to use
     * @param pObjectToBeSet the StrainDTO object to associate to the StrainReferencesDTO 
     * @return the associated StrainDTO pObject
     */
    // SET IMPORTED
    public StrainReferencesDTO setStrainDTO(StrainReferencesDTO pObject,StrainDTO pObjectToBeSet) {
        pObject.setStrainKey(pObjectToBeSet.getStrainKey());
        return pObject;
    }

    /**
     * Retrieves the ReferenceDTO object from the StrainReferences._Reference_key field.
     *
     * @param pObject the StrainReferencesDTO 
     * @return the associated ReferenceDTO pObject
     */
    public ReferenceDTO getReferenceDTO(StrainReferencesDTO pObject) 
    throws SQLException {
        ReferenceDTO other = ReferenceDAO.getInstance().createReferenceDTO();
        other.setReferenceKey(pObject.getReferenceKey());
        return ReferenceDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the StrainReferencesDTO object to the ReferenceDTO object.
     *
     * @param pObject the StrainReferencesDTO object to use
     * @param pObjectToBeSet the ReferenceDTO object to associate to the StrainReferencesDTO 
     * @return the associated ReferenceDTO pObject
     */
    // SET IMPORTED
    public StrainReferencesDTO setReferenceDTO(StrainReferencesDTO pObject,ReferenceDTO pObjectToBeSet) {
        pObject.setReferenceKey(pObjectToBeSet.getReferenceKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from StrainReferences.
     *
     * @return a List of StrainReferencesDAO objects
     */
    public List<StrainReferencesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from StrainReferences, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainReferencesDAO objects
     */
    public List<StrainReferencesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM StrainReferences",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of StrainReferencesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting StrainReferencesDTO table 
     */
    public List<StrainReferencesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of StrainReferencesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainReferencesDTO table 
     */
    public List<StrainReferencesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of StrainReferencesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting StrainReferencesDTO table 
     */
    public List<StrainReferencesDTO> loadByWhere(String where, 
                                                int[] fieldList, 
                                                int startRow, 
                                                int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from StrainReferences " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from StrainReferences ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<StrainReferencesDTO> v = new ArrayList<StrainReferencesDTO>();
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
     * Deletes all rows from StrainReferences table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the StrainReferences table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM StrainReferences " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the StrainReferencesDTO pObject into the database.
     *
     * @param pObject the StrainReferencesDTO pObject to be saved
     */
    public StrainReferencesDTO save(StrainReferencesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getStrainReferencesKey() == null) {
            Object obj = max(ID__STRAINREFERENCES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setStrainReferencesKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into StrainReferences (");
    
                if (pObject.isStrainReferencesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_StrainReferences_key");
                    _dirtyCount++;
                }

                if (pObject.isStrainKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Strain_key");
                    _dirtyCount++;
                }

                if (pObject.isReferenceKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Reference_key");
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

                if (pObject.isStrainReferencesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKey());
                }
    
                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
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
                _sql = new StringBuffer("UPDATE StrainReferences SET ");
                boolean useComma=false;

                if (pObject.isStrainReferencesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_StrainReferences_key").append("=?");
                }

                if (pObject.isStrainKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Strain_key").append("=?");
                }

                if (pObject.isReferenceKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Reference_key").append("=?");
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
                _sql.append("StrainReferences._StrainReferences_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isStrainReferencesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKey());
                }

                if (pObject.isStrainKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }

                if (pObject.isReferenceKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKeyOriginal());
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
     * Saves a List of StrainReferencesDTO objects into the database.
     *
     * @param pObjects the StrainReferencesDTO pObject table to be saved
     * @return the saved StrainReferencesDTO List.
     */
    public List<StrainReferencesDTO> save(List<StrainReferencesDTO> pObjects) throws SQLException {
        for (StrainReferencesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique StrainReferencesDTO object from a template
     *
     * @param pObject the StrainReferencesDTO object to look for
     * @return the pObject matching the template
     */
    public StrainReferencesDTO loadUniqueUsingTemplate(StrainReferencesDTO pObject) 
        throws SQLException {
         List<StrainReferencesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of StrainReferencesDTO objects from a template one.
     *
     * @param pObject the StrainReferencesDTO template to look for
     * @return all the StrainReferencesDTO objects matching the template
     */
    public List<StrainReferencesDTO> loadUsingTemplate(StrainReferencesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of StrainReferencesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the StrainReferencesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the StrainReferencesDTO matching the template
     */
    public List<StrainReferencesDTO> loadUsingTemplate(StrainReferencesDTO pObject,
                                                      int startRow,
                                                      int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from StrainReferences WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isStrainReferencesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainReferences_key= ?");
             }
    
             if (pObject.isStrainKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
             }
    
             if (pObject.isReferenceKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
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
    
             if (pObject.isStrainReferencesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKey());
             }
    
             if (pObject.isStrainKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
             }
    
             if (pObject.isReferenceKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
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
     * Deletes rows using a StrainReferencesDTO template.
     *
     * @param pObject the StrainReferencesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(StrainReferencesDTO pObject) throws SQLException {
        if (pObject.isStrainReferencesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getStrainReferencesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM StrainReferences WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isStrainReferencesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_StrainReferences_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStrainKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Strain_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Reference_key").append("=?");
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
    
            if (pObject.isStrainReferencesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKey());
            }
    
            if (pObject.isStrainKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
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
     * Retrieves the max value for a specified column of the table StrainReferences.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from StrainReferences";
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
                    case ID__STRAINREFERENCES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__STRAIN_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__REFERENCE_KEY:
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
     * Retrieves the min value for a specified column of the table StrainReferences.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from StrainReferences";
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
                    case ID__STRAINREFERENCES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__STRAIN_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__REFERENCE_KEY:
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
     * Retrieves the number of rows of the table StrainReferences.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table StrainReferences with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from StrainReferences " + where;
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
     * Retrieves the number of rows of the table StrainReferences with a prepared statement.
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
     * Looks for the number of elements of a specific StrainReferencesDTO pObject given a c
     *
     * @param pObject the StrainReferencesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(StrainReferencesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from StrainReferences WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isStrainReferencesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_StrainReferences_key= ?");
                }
    
                if (pObject.isStrainKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
                }
    
                if (pObject.isReferenceKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
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
    
                if (pObject.isStrainReferencesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainReferencesKey());
                }
    
                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
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
     * Transforms a ResultSet iterating on the StrainReferences on a StrainReferencesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting StrainReferencesDTO pObject
     */
    public StrainReferencesDTO decodeRow(ResultSet rs) throws SQLException {
        StrainReferencesDTO pObject = createStrainReferencesDTO();
        pObject.setStrainReferencesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setStrainKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setCreateUser(rs.getString(4));
        pObject.setCreateDate(rs.getTimestamp(5));
        pObject.setUpdateUser(rs.getString(6));
        pObject.setUpdateDate(rs.getTimestamp(7));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the StrainReferences table on a StrainReferencesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting StrainReferencesDTO pObject
     */
    public StrainReferencesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        StrainReferencesDTO pObject = createStrainReferencesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__STRAINREFERENCES_KEY:
                    ++pos;
                    pObject.setStrainReferencesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__STRAIN_KEY:
                    ++pos;
                    pObject.setStrainKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__REFERENCE_KEY:
                    ++pos;
                    pObject.setReferenceKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of StrainReferencesDTO objects
     */
    public List<StrainReferencesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of StrainReferencesDTO objects
     */
    public List<StrainReferencesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of StrainReferencesDTO objects
     */
    public List<StrainReferencesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<StrainReferencesDTO> v = new ArrayList<StrainReferencesDTO>();
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
