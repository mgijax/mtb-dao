
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Organ table.
 */
public class OrganDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Organ_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ORGAN_KEY = 0;
    public static final int TYPE__ORGAN_KEY = Types.NUMERIC;
    public static final String NAME__ORGAN_KEY = "_Organ_key";

    /**
     * Column _AnatomicalSystem_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ANATOMICALSYSTEM_KEY = 1;
    public static final int TYPE__ANATOMICALSYSTEM_KEY = Types.NUMERIC;
    public static final String NAME__ANATOMICALSYSTEM_KEY = "_AnatomicalSystem_key";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 2;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";

    /**
     * Column description of type Types.VARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 3;
    public static final int TYPE_DESCRIPTION = Types.VARCHAR;
    public static final String NAME_DESCRIPTION = "description";

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

    /**
     * Column _OrganParent_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ORGANPARENT_KEY = 8;
    public static final int TYPE__ORGANPARENT_KEY = Types.NUMERIC;
    public static final String NAME__ORGANPARENT_KEY = "_OrganParent_key";


    private static final String TABLE_NAME = "Organ";

    /**
     * Create an array of type string containing all the fields of the Organ table.
     */
    private static final String[] FIELD_NAMES = {
        "Organ._Organ_key"
        ,"Organ._AnatomicalSystem_key"
        ,"Organ.name"
        ,"Organ.description"
        ,"Organ.create_user"
        ,"Organ.create_date"
        ,"Organ.update_user"
        ,"Organ.update_date"
        ,"Organ._OrganParent_key"
    };

    /**
     * Create an array of type containing all the fields of the Organ table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
        ,"Long"
    };

    /**
     * Field that contains the comma separated fields of the Organ table.
     */
    private static final String ALL_FIELDS = "Organ._Organ_key"
                            + ",Organ._AnatomicalSystem_key"
                            + ",Organ.name"
                            + ",Organ.description"
                            + ",Organ.create_user"
                            + ",Organ.create_date"
                            + ",Organ.update_user"
                            + ",Organ.update_date"
                            + ",Organ._OrganParent_key";


    // ----------------------------------------------------- Instance Variables

    private static OrganDAO singleton = new OrganDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the OrganDAO singleton.
     *
     * @return OrganDAO 
     */
    synchronized public static OrganDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own OrganDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(OrganDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new OrganDTO instance.
     *
     * @return the new OrganDTO 
     */
    public OrganDTO createOrganDTO() {
        return new OrganDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a OrganDTO from the Organ using its key fields.
     *
     * @return a unique OrganDTO 
     */
    public OrganDTO loadByPrimaryKey(Long OrganKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Organ WHERE Organ._Organ_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, OrganKey);
            List<OrganDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long OrganKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Organ WHERE Organ._Organ_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, OrganKey);
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
     * Loads a List of OrganDTO objects from the Organ table using its _OrganParent_key field.
     *
     * @return a List of OrganDTO objects
     */
    public List<OrganDTO> loadByOrganParentKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Organ WHERE _OrganParent_key=?",
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
     * Deletes from the Organ table by _OrganParent_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByOrganParentKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Organ WHERE _OrganParent_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of OrganDTO objects from the Organ table using its _AnatomicalSystem_key field.
     *
     * @return a List of OrganDTO objects
     */
    public List<OrganDTO> loadByAnatomicalSystemKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Organ WHERE _AnatomicalSystem_key=?",
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
     * Deletes from the Organ table by _AnatomicalSystem_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAnatomicalSystemKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Organ WHERE _AnatomicalSystem_key=?");
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
     * Retrieves the OrganDTO object from the Organ._Organ_key field.
     *
     * @param pObject the OrganDTO 
     * @return the associated OrganDTO pObject
     */
    public OrganDTO getOrganDTO(OrganDTO pObject) 
    throws SQLException {
        OrganDTO other = OrganDAO.getInstance().createOrganDTO();
        other.setOrganKey(pObject.getOrganParentKey());
        return OrganDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the OrganDTO object to the OrganDTO object.
     *
     * @param pObject the OrganDTO object to use
     * @param pObjectToBeSet the OrganDTO object to associate to the OrganDTO 
     * @return the associated OrganDTO pObject
     */
    // SET IMPORTED
    public OrganDTO setOrganDTO(OrganDTO pObject,OrganDTO pObjectToBeSet) {
        pObject.setOrganParentKey(pObjectToBeSet.getOrganKey());
        return pObject;
    }

    /**
     * Retrieves the AnatomicalSystemDTO object from the Organ._AnatomicalSystem_key field.
     *
     * @param pObject the OrganDTO 
     * @return the associated AnatomicalSystemDTO pObject
     */
    public AnatomicalSystemDTO getAnatomicalSystemDTO(OrganDTO pObject) 
    throws SQLException {
        AnatomicalSystemDTO other = AnatomicalSystemDAO.getInstance().createAnatomicalSystemDTO();
        other.setAnatomicalSystemKey(pObject.getAnatomicalSystemKey());
        return AnatomicalSystemDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the OrganDTO object to the AnatomicalSystemDTO object.
     *
     * @param pObject the OrganDTO object to use
     * @param pObjectToBeSet the AnatomicalSystemDTO object to associate to the OrganDTO 
     * @return the associated AnatomicalSystemDTO pObject
     */
    // SET IMPORTED
    public OrganDTO setAnatomicalSystemDTO(OrganDTO pObject,AnatomicalSystemDTO pObjectToBeSet) {
        pObject.setAnatomicalSystemKey(pObjectToBeSet.getAnatomicalSystemKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Organ.
     *
     * @return a List of OrganDAO objects
     */
    public List<OrganDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Organ, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of OrganDAO objects
     */
    public List<OrganDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Organ",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of OrganDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting OrganDTO table 
     */
    public List<OrganDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of OrganDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting OrganDTO table 
     */
    public List<OrganDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of OrganDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting OrganDTO table 
     */
    public List<OrganDTO> loadByWhere(String where, 
                                     int[] fieldList, 
                                     int startRow, 
                                     int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Organ " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Organ ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<OrganDTO> v = new ArrayList<OrganDTO>();
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
     * Deletes all rows from Organ table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Organ table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Organ " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the OrganDTO pObject into the database.
     *
     * @param pObject the OrganDTO pObject to be saved
     */
    public OrganDTO save(OrganDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getOrganKey() == null) {
            Object obj = max(ID__ORGAN_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setOrganKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Organ (");
    
                if (pObject.isOrganKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Organ_key");
                    _dirtyCount++;
                }

                if (pObject.isAnatomicalSystemKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AnatomicalSystem_key");
                    _dirtyCount++;
                }

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("name");
                    _dirtyCount++;
                }

                if (pObject.isDescriptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("description");
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

                if (pObject.isOrganParentKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_OrganParent_key");
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

                if (pObject.isOrganKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }
    
                if (pObject.isAnatomicalSystemKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAnatomicalSystemKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
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
    
                if (pObject.isOrganParentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganParentKey());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE Organ SET ");
                boolean useComma=false;

                if (pObject.isOrganKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Organ_key").append("=?");
                }

                if (pObject.isAnatomicalSystemKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AnatomicalSystem_key").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
                }

                if (pObject.isDescriptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("description").append("=?");
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

                if (pObject.isOrganParentKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_OrganParent_key").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("Organ._Organ_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isOrganKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }

                if (pObject.isAnatomicalSystemKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAnatomicalSystemKey());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
                }

                if (pObject.isDescriptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getDescription());
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

                if (pObject.isOrganParentKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganParentKey());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKeyOriginal());
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
     * Saves a List of OrganDTO objects into the database.
     *
     * @param pObjects the OrganDTO pObject table to be saved
     * @return the saved OrganDTO List.
     */
    public List<OrganDTO> save(List<OrganDTO> pObjects) throws SQLException {
        for (OrganDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique OrganDTO object from a template
     *
     * @param pObject the OrganDTO object to look for
     * @return the pObject matching the template
     */
    public OrganDTO loadUniqueUsingTemplate(OrganDTO pObject) 
        throws SQLException {
         List<OrganDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of OrganDTO objects from a template one.
     *
     * @param pObject the OrganDTO template to look for
     * @return all the OrganDTO objects matching the template
     */
    public List<OrganDTO> loadUsingTemplate(OrganDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of OrganDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the OrganDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the OrganDTO matching the template
     */
    public List<OrganDTO> loadUsingTemplate(OrganDTO pObject,
                                           int startRow,
                                           int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Organ WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isOrganKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organ_key= ?");
             }
    
             if (pObject.isAnatomicalSystemKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AnatomicalSystem_key= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
             }
    
             if (pObject.isDescriptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
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
    
             if (pObject.isOrganParentKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_OrganParent_key= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isOrganKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
             }
    
             if (pObject.isAnatomicalSystemKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAnatomicalSystemKey());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
             }
    
             if (pObject.isDescriptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getDescription());
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
    
             if (pObject.isOrganParentKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganParentKey());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a OrganDTO template.
     *
     * @param pObject the OrganDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(OrganDTO pObject) throws SQLException {
        if (pObject.isOrganKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getOrganKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Organ WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isOrganKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Organ_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAnatomicalSystemKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AnatomicalSystem_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("name").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDescriptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("description").append("=?");
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
    
            if (pObject.isOrganParentKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_OrganParent_key").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isOrganKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
            }
    
            if (pObject.isAnatomicalSystemKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAnatomicalSystemKey());
            }
    
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
            }
    
            if (pObject.isDescriptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getDescription());
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
    
            if (pObject.isOrganParentKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganParentKey());
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
     * Retrieves a List of SexDTO objects using the relation table TumorFrequency given a OrganDTO object.
     *
     * @param pObject the OrganDTO pObject to be used
     * @return a List of SexDTO objects
     */
    // MANY TO MANY
    public List<SexDTO> loadSexViaTumorFrequency(OrganDTO pObject) 
        throws SQLException {
        return loadSexViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of SexDTO objects using the relation table TumorFrequency given a OrganDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the OrganDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SexDTO objects
     */
    // MANY TO MANY
    public List<SexDTO> loadSexViaTumorFrequency(OrganDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Sex, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._OrganAffected_key = ?");
        strSQL.append("    and TumorFrequency._Sex_key = Sex._Sex_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getOrganKey());
             return SexDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of StrainDTO objects using the relation table TumorFrequency given a OrganDTO object.
     *
     * @param pObject the OrganDTO pObject to be used
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaTumorFrequency(OrganDTO pObject) 
        throws SQLException {
        return loadStrainViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of StrainDTO objects using the relation table TumorFrequency given a OrganDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the OrganDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaTumorFrequency(OrganDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Strain, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._OrganAffected_key = ?");
        strSQL.append("    and TumorFrequency._Strain_key = Strain._Strain_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getOrganKey());
             return StrainDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequency given a OrganDTO object.
     *
     * @param pObject the OrganDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequency(OrganDTO pObject) 
        throws SQLException {
        return loadReferenceViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequency given a OrganDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the OrganDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequency(OrganDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._OrganAffected_key = ?");
        strSQL.append("    and TumorFrequency._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getOrganKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of TumorTypeDTO objects using the relation table TumorFrequency given a OrganDTO object.
     *
     * @param pObject the OrganDTO pObject to be used
     * @return a List of TumorTypeDTO objects
     */
    // MANY TO MANY
    public List<TumorTypeDTO> loadTumorTypeViaTumorFrequency(OrganDTO pObject) 
        throws SQLException {
        return loadTumorTypeViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorTypeDTO objects using the relation table TumorFrequency given a OrganDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the OrganDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorTypeDTO objects
     */
    // MANY TO MANY
    public List<TumorTypeDTO> loadTumorTypeViaTumorFrequency(OrganDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorType, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._OrganAffected_key = ?");
        strSQL.append("    and TumorFrequency._TumorType_key = TumorType._TumorType_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getOrganKey());
             return TumorTypeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of TumorClassificationDTO objects using the relation table TumorType given a OrganDTO object.
     *
     * @param pObject the OrganDTO pObject to be used
     * @return a List of TumorClassificationDTO objects
     */
    // MANY TO MANY
    public List<TumorClassificationDTO> loadTumorClassificationViaTumorType(OrganDTO pObject) 
        throws SQLException {
        return loadTumorClassificationViaTumorType(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorClassificationDTO objects using the relation table TumorType given a OrganDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the OrganDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorClassificationDTO objects
     */
    // MANY TO MANY
    public List<TumorClassificationDTO> loadTumorClassificationViaTumorType(OrganDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorClassification, ");
        strSQL.append("        TumorType");
        strSQL.append("  where TumorType._Organ_key = ?");
        strSQL.append("    and TumorType._TumorClassification_key = TumorClassification._TumorClassification_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getOrganKey());
             return TumorClassificationDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Organ.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Organ";
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
                    case ID__ORGAN_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ANATOMICALSYSTEM_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_DESCRIPTION:
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
                    case ID__ORGANPARENT_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
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
     * Retrieves the min value for a specified column of the table Organ.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Organ";
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
                    case ID__ORGAN_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ANATOMICALSYSTEM_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_DESCRIPTION:
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
                    case ID__ORGANPARENT_KEY:
                        iReturn = (Long)rs.getObject(1);
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
     * Retrieves the number of rows of the table Organ.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Organ with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Organ " + where;
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
     * Retrieves the number of rows of the table Organ with a prepared statement.
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
     * Looks for the number of elements of a specific OrganDTO pObject given a c
     *
     * @param pObject the OrganDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(OrganDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Organ WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isOrganKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organ_key= ?");
                }
    
                if (pObject.isAnatomicalSystemKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AnatomicalSystem_key= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
                }
    
                if (pObject.isDescriptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
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
    
                if (pObject.isOrganParentKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_OrganParent_key= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isOrganKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }
    
                if (pObject.isAnatomicalSystemKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAnatomicalSystemKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
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
    
                if (pObject.isOrganParentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganParentKey());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the Organ on a OrganDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting OrganDTO pObject
     */
    public OrganDTO decodeRow(ResultSet rs) throws SQLException {
        OrganDTO pObject = createOrganDTO();
        pObject.setOrganKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAnatomicalSystemKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setName(rs.getString(3));
        pObject.setDescription(rs.getString(4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.setOrganParentKey(DAOManagerMTB.getLong(rs, 9));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Organ table on a OrganDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting OrganDTO pObject
     */
    public OrganDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        OrganDTO pObject = createOrganDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ORGAN_KEY:
                    ++pos;
                    pObject.setOrganKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ANATOMICALSYSTEM_KEY:
                    ++pos;
                    pObject.setAnatomicalSystemKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
                    break;
                case ID_DESCRIPTION:
                    ++pos;
                    pObject.setDescription(rs.getString(pos));
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
                case ID__ORGANPARENT_KEY:
                    ++pos;
                    pObject.setOrganParentKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of OrganDTO objects
     */
    public List<OrganDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of OrganDTO objects
     */
    public List<OrganDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of OrganDTO objects
     */
    public List<OrganDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<OrganDTO> v = new ArrayList<OrganDTO>();
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
