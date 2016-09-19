
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the MTBUsers table.
 */
public class MTBUsersDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _MTBUsers_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MTBUSERS_KEY = 0;
    public static final int TYPE__MTBUSERS_KEY = Types.NUMERIC;
    public static final String NAME__MTBUSERS_KEY = "_MTBUsers_key";

    /**
     * Column userName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_USERNAME = 1;
    public static final int TYPE_USERNAME = Types.VARCHAR;
    public static final String NAME_USERNAME = "userName";

    /**
     * Column password of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PASSWORD = 2;
    public static final int TYPE_PASSWORD = Types.VARCHAR;
    public static final String NAME_PASSWORD = "password";

    /**
     * Column fullName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_FULLNAME = 3;
    public static final int TYPE_FULLNAME = Types.VARCHAR;
    public static final String NAME_FULLNAME = "fullName";

    /**
     * Column telephone of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TELEPHONE = 4;
    public static final int TYPE_TELEPHONE = Types.VARCHAR;
    public static final String NAME_TELEPHONE = "telephone";

    /**
     * Column email of type Types.VARCHAR mapped to String.
     */
    public static final int ID_EMAIL = 5;
    public static final int TYPE_EMAIL = Types.VARCHAR;
    public static final String NAME_EMAIL = "email";

    /**
     * Column _MTBSecurityLevel_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MTBSECURITYLEVEL_KEY = 6;
    public static final int TYPE__MTBSECURITYLEVEL_KEY = Types.NUMERIC;
    public static final String NAME__MTBSECURITYLEVEL_KEY = "_MTBSecurityLevel_key";

    /**
     * Column activeInd of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_ACTIVEIND = 7;
    public static final int TYPE_ACTIVEIND = Types.NUMERIC;
    public static final String NAME_ACTIVEIND = "activeInd";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 8;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 9;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 10;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 11;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "MTBUsers";

    /**
     * Create an array of type string containing all the fields of the MTBUsers table.
     */
    private static final String[] FIELD_NAMES = {
        "MTBUsers._MTBUsers_key"
        ,"MTBUsers.userName"
        ,"MTBUsers.password"
        ,"MTBUsers.fullName"
        ,"MTBUsers.telephone"
        ,"MTBUsers.email"
        ,"MTBUsers._MTBSecurityLevel_key"
        ,"MTBUsers.activeInd"
        ,"MTBUsers.create_user"
        ,"MTBUsers.create_date"
        ,"MTBUsers.update_user"
        ,"MTBUsers.update_date"
    };

    /**
     * Create an array of type containing all the fields of the MTBUsers table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the MTBUsers table.
     */
    private static final String ALL_FIELDS = "MTBUsers._MTBUsers_key"
                            + ",MTBUsers.userName"
                            + ",MTBUsers.password"
                            + ",MTBUsers.fullName"
                            + ",MTBUsers.telephone"
                            + ",MTBUsers.email"
                            + ",MTBUsers._MTBSecurityLevel_key"
                            + ",MTBUsers.activeInd"
                            + ",MTBUsers.create_user"
                            + ",MTBUsers.create_date"
                            + ",MTBUsers.update_user"
                            + ",MTBUsers.update_date";


    // ----------------------------------------------------- Instance Variables

    private static MTBUsersDAO singleton = new MTBUsersDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBUsersDAO singleton.
     *
     * @return MTBUsersDAO 
     */
    synchronized public static MTBUsersDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own MTBUsersDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(MTBUsersDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new MTBUsersDTO instance.
     *
     * @return the new MTBUsersDTO 
     */
    public MTBUsersDTO createMTBUsersDTO() {
        return new MTBUsersDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a MTBUsersDTO from the MTBUsers using its key fields.
     *
     * @return a unique MTBUsersDTO 
     */
    public MTBUsersDTO loadByPrimaryKey(Long MTBUsersKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBUsers WHERE MTBUsers._MTBUsers_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBUsersKey);
            List<MTBUsersDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long MTBUsersKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from MTBUsers WHERE MTBUsers._MTBUsers_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, MTBUsersKey);
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
     * Loads a List of MTBUsersDTO objects from the MTBUsers table using its _MTBSecurityLevel_key field.
     *
     * @return a List of MTBUsersDTO objects
     */
    public List<MTBUsersDTO> loadByMTBSecurityLevelKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBUsers WHERE _MTBSecurityLevel_key=?",
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
     * Deletes from the MTBUsers table by _MTBSecurityLevel_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByMTBSecurityLevelKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM MTBUsers WHERE _MTBSecurityLevel_key=?");
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
     * Retrieves the MTBSecurityLevelDTO object from the MTBUsers._MTBSecurityLevel_key field.
     *
     * @param pObject the MTBUsersDTO 
     * @return the associated MTBSecurityLevelDTO pObject
     */
    public MTBSecurityLevelDTO getMTBSecurityLevelDTO(MTBUsersDTO pObject) 
    throws SQLException {
        MTBSecurityLevelDTO other = MTBSecurityLevelDAO.getInstance().createMTBSecurityLevelDTO();
        other.setMTBSecurityLevelKey(pObject.getMTBSecurityLevelKey());
        return MTBSecurityLevelDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MTBUsersDTO object to the MTBSecurityLevelDTO object.
     *
     * @param pObject the MTBUsersDTO object to use
     * @param pObjectToBeSet the MTBSecurityLevelDTO object to associate to the MTBUsersDTO 
     * @return the associated MTBSecurityLevelDTO pObject
     */
    // SET IMPORTED
    public MTBUsersDTO setMTBSecurityLevelDTO(MTBUsersDTO pObject,MTBSecurityLevelDTO pObjectToBeSet) {
        pObject.setMTBSecurityLevelKey(pObjectToBeSet.getMTBSecurityLevelKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from MTBUsers.
     *
     * @return a List of MTBUsersDAO objects
     */
    public List<MTBUsersDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from MTBUsers, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MTBUsersDAO objects
     */
    public List<MTBUsersDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM MTBUsers",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of MTBUsersDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting MTBUsersDTO table 
     */
    public List<MTBUsersDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of MTBUsersDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBUsersDTO table 
     */
    public List<MTBUsersDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of MTBUsersDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBUsersDTO table 
     */
    public List<MTBUsersDTO> loadByWhere(String where, 
                                        int[] fieldList, 
                                        int startRow, 
                                        int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from MTBUsers " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from MTBUsers ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<MTBUsersDTO> v = new ArrayList<MTBUsersDTO>();
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
     * Deletes all rows from MTBUsers table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the MTBUsers table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM MTBUsers " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the MTBUsersDTO pObject into the database.
     *
     * @param pObject the MTBUsersDTO pObject to be saved
     */
    public MTBUsersDTO save(MTBUsersDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getMTBUsersKey() == null) {
            Object obj = max(ID__MTBUSERS_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setMTBUsersKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into MTBUsers (");
    
                if (pObject.isMTBUsersKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBUsers_key");
                    _dirtyCount++;
                }

                if (pObject.isUserNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("userName");
                    _dirtyCount++;
                }

                if (pObject.isPasswordModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("password");
                    _dirtyCount++;
                }

                if (pObject.isFullNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("fullName");
                    _dirtyCount++;
                }

                if (pObject.isTelephoneModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("telephone");
                    _dirtyCount++;
                }

                if (pObject.isEmailModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("email");
                    _dirtyCount++;
                }

                if (pObject.isMTBSecurityLevelKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBSecurityLevel_key");
                    _dirtyCount++;
                }

                if (pObject.isActiveIndModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("activeInd");
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

                if (pObject.isMTBUsersKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKey());
                }
    
                if (pObject.isUserNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getUserName());
                }
    
                if (pObject.isPasswordModified()) {
                    ps.setString(++_dirtyCount, pObject.getPassword());
                }
    
                if (pObject.isFullNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getFullName());
                }
    
                if (pObject.isTelephoneModified()) {
                    ps.setString(++_dirtyCount, pObject.getTelephone());
                }
    
                if (pObject.isEmailModified()) {
                    ps.setString(++_dirtyCount, pObject.getEmail());
                }
    
                if (pObject.isMTBSecurityLevelKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBSecurityLevelKey());
                }
    
                if (pObject.isActiveIndModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getActiveInd());
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
                _sql = new StringBuffer("UPDATE MTBUsers SET ");
                boolean useComma=false;

                if (pObject.isMTBUsersKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBUsers_key").append("=?");
                }

                if (pObject.isUserNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("userName").append("=?");
                }

                if (pObject.isPasswordModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("password").append("=?");
                }

                if (pObject.isFullNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("fullName").append("=?");
                }

                if (pObject.isTelephoneModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("telephone").append("=?");
                }

                if (pObject.isEmailModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("email").append("=?");
                }

                if (pObject.isMTBSecurityLevelKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBSecurityLevel_key").append("=?");
                }

                if (pObject.isActiveIndModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("activeInd").append("=?");
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
                _sql.append("MTBUsers._MTBUsers_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isMTBUsersKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKey());
                }

                if (pObject.isUserNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getUserName());
                }

                if (pObject.isPasswordModified()) {
                      ps.setString(++_dirtyCount, pObject.getPassword());
                }

                if (pObject.isFullNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getFullName());
                }

                if (pObject.isTelephoneModified()) {
                      ps.setString(++_dirtyCount, pObject.getTelephone());
                }

                if (pObject.isEmailModified()) {
                      ps.setString(++_dirtyCount, pObject.getEmail());
                }

                if (pObject.isMTBSecurityLevelKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBSecurityLevelKey());
                }

                if (pObject.isActiveIndModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getActiveInd());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKeyOriginal());
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
     * Saves a List of MTBUsersDTO objects into the database.
     *
     * @param pObjects the MTBUsersDTO pObject table to be saved
     * @return the saved MTBUsersDTO List.
     */
    public List<MTBUsersDTO> save(List<MTBUsersDTO> pObjects) throws SQLException {
        for (MTBUsersDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique MTBUsersDTO object from a template
     *
     * @param pObject the MTBUsersDTO object to look for
     * @return the pObject matching the template
     */
    public MTBUsersDTO loadUniqueUsingTemplate(MTBUsersDTO pObject) 
        throws SQLException {
         List<MTBUsersDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of MTBUsersDTO objects from a template one.
     *
     * @param pObject the MTBUsersDTO template to look for
     * @return all the MTBUsersDTO objects matching the template
     */
    public List<MTBUsersDTO> loadUsingTemplate(MTBUsersDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of MTBUsersDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the MTBUsersDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the MTBUsersDTO matching the template
     */
    public List<MTBUsersDTO> loadUsingTemplate(MTBUsersDTO pObject,
                                              int startRow,
                                              int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from MTBUsers WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isMTBUsersKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBUsers_key= ?");
             }
    
             if (pObject.isUserNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("userName= ?");
             }
    
             if (pObject.isPasswordModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("password= ?");
             }
    
             if (pObject.isFullNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("fullName= ?");
             }
    
             if (pObject.isTelephoneModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("telephone= ?");
             }
    
             if (pObject.isEmailModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("email= ?");
             }
    
             if (pObject.isMTBSecurityLevelKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBSecurityLevel_key= ?");
             }
    
             if (pObject.isActiveIndModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("activeInd= ?");
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
    
             if (pObject.isMTBUsersKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKey());
             }
    
             if (pObject.isUserNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getUserName());
             }
    
             if (pObject.isPasswordModified()) {
                 ps.setString(++_dirtyCount, pObject.getPassword());
             }
    
             if (pObject.isFullNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getFullName());
             }
    
             if (pObject.isTelephoneModified()) {
                 ps.setString(++_dirtyCount, pObject.getTelephone());
             }
    
             if (pObject.isEmailModified()) {
                 ps.setString(++_dirtyCount, pObject.getEmail());
             }
    
             if (pObject.isMTBSecurityLevelKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBSecurityLevelKey());
             }
    
             if (pObject.isActiveIndModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getActiveInd());
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
     * Deletes rows using a MTBUsersDTO template.
     *
     * @param pObject the MTBUsersDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(MTBUsersDTO pObject) throws SQLException {
        if (pObject.isMTBUsersKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getMTBUsersKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM MTBUsers WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isMTBUsersKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBUsers_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUserNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("userName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPasswordInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("password").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isFullNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("fullName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTelephoneInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("telephone").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isEmailInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("email").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBSecurityLevelKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBSecurityLevel_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isActiveIndInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("activeInd").append("=?");
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
    
            if (pObject.isMTBUsersKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKey());
            }
    
            if (pObject.isUserNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUserName());
            }
    
            if (pObject.isPasswordInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPassword());
            }
    
            if (pObject.isFullNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getFullName());
            }
    
            if (pObject.isTelephoneInitialized()) {
                ps.setString(++_dirtyCount, pObject.getTelephone());
            }
    
            if (pObject.isEmailInitialized()) {
                ps.setString(++_dirtyCount, pObject.getEmail());
            }
    
            if (pObject.isMTBSecurityLevelKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBSecurityLevelKey());
            }
    
            if (pObject.isActiveIndInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getActiveInd());
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
     * Retrieves the max value for a specified column of the table MTBUsers.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from MTBUsers";
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
                    case ID__MTBUSERS_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_USERNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PASSWORD:
                        iReturn = rs.getString(1);
                        break;
                    case ID_FULLNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TELEPHONE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_EMAIL:
                        iReturn = rs.getString(1);
                        break;
                    case ID__MTBSECURITYLEVEL_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_ACTIVEIND:
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
     * Retrieves the min value for a specified column of the table MTBUsers.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from MTBUsers";
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
                    case ID__MTBUSERS_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_USERNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PASSWORD:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_FULLNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TELEPHONE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_EMAIL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__MTBSECURITYLEVEL_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_ACTIVEIND:
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
     * Retrieves the number of rows of the table MTBUsers.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table MTBUsers with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from MTBUsers " + where;
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
     * Retrieves the number of rows of the table MTBUsers with a prepared statement.
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
     * Looks for the number of elements of a specific MTBUsersDTO pObject given a c
     *
     * @param pObject the MTBUsersDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(MTBUsersDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from MTBUsers WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isMTBUsersKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBUsers_key= ?");
                }
    
                if (pObject.isUserNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("userName= ?");
                }
    
                if (pObject.isPasswordModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("password= ?");
                }
    
                if (pObject.isFullNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("fullName= ?");
                }
    
                if (pObject.isTelephoneModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("telephone= ?");
                }
    
                if (pObject.isEmailModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("email= ?");
                }
    
                if (pObject.isMTBSecurityLevelKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBSecurityLevel_key= ?");
                }
    
                if (pObject.isActiveIndModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("activeInd= ?");
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
    
                if (pObject.isMTBUsersKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBUsersKey());
                }
    
                if (pObject.isUserNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getUserName());
                }
    
                if (pObject.isPasswordModified()) {
                    ps.setString(++_dirtyCount, pObject.getPassword());
                }
    
                if (pObject.isFullNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getFullName());
                }
    
                if (pObject.isTelephoneModified()) {
                    ps.setString(++_dirtyCount, pObject.getTelephone());
                }
    
                if (pObject.isEmailModified()) {
                    ps.setString(++_dirtyCount, pObject.getEmail());
                }
    
                if (pObject.isMTBSecurityLevelKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBSecurityLevelKey());
                }
    
                if (pObject.isActiveIndModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getActiveInd());
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
     * Transforms a ResultSet iterating on the MTBUsers on a MTBUsersDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting MTBUsersDTO pObject
     */
    public MTBUsersDTO decodeRow(ResultSet rs) throws SQLException {
        MTBUsersDTO pObject = createMTBUsersDTO();
        pObject.setMTBUsersKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setUserName(rs.getString(2));
        pObject.setPassword(rs.getString(3));
        pObject.setFullName(rs.getString(4));
        pObject.setTelephone(rs.getString(5));
        pObject.setEmail(rs.getString(6));
        pObject.setMTBSecurityLevelKey(DAOManagerMTB.getLong(rs, 7));
        pObject.setActiveInd(DAOManagerMTB.getLong(rs, 8));
        pObject.setCreateUser(rs.getString(9));
        pObject.setCreateDate(rs.getTimestamp(10));
        pObject.setUpdateUser(rs.getString(11));
        pObject.setUpdateDate(rs.getTimestamp(12));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the MTBUsers table on a MTBUsersDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting MTBUsersDTO pObject
     */
    public MTBUsersDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        MTBUsersDTO pObject = createMTBUsersDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__MTBUSERS_KEY:
                    ++pos;
                    pObject.setMTBUsersKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_USERNAME:
                    ++pos;
                    pObject.setUserName(rs.getString(pos));
                    break;
                case ID_PASSWORD:
                    ++pos;
                    pObject.setPassword(rs.getString(pos));
                    break;
                case ID_FULLNAME:
                    ++pos;
                    pObject.setFullName(rs.getString(pos));
                    break;
                case ID_TELEPHONE:
                    ++pos;
                    pObject.setTelephone(rs.getString(pos));
                    break;
                case ID_EMAIL:
                    ++pos;
                    pObject.setEmail(rs.getString(pos));
                    break;
                case ID__MTBSECURITYLEVEL_KEY:
                    ++pos;
                    pObject.setMTBSecurityLevelKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_ACTIVEIND:
                    ++pos;
                    pObject.setActiveInd(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of MTBUsersDTO objects
     */
    public List<MTBUsersDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of MTBUsersDTO objects
     */
    public List<MTBUsersDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of MTBUsersDTO objects
     */
    public List<MTBUsersDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<MTBUsersDTO> v = new ArrayList<MTBUsersDTO>();
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
