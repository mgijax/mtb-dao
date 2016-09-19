
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Pathology table.
 */
public class PathologyDAO
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
     * Column ageAtNecropsy of type Types.VARCHAR mapped to String.
     */
    public static final int ID_AGEATNECROPSY = 1;
    public static final int TYPE_AGEATNECROPSY = Types.VARCHAR;
    public static final String NAME_AGEATNECROPSY = "ageAtNecropsy";

    /**
     * Column _Pathologist_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__PATHOLOGIST_KEY = 2;
    public static final int TYPE__PATHOLOGIST_KEY = Types.NUMERIC;
    public static final String NAME__PATHOLOGIST_KEY = "_Pathologist_key";

    /**
     * Column _Contributor_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CONTRIBUTOR_KEY = 3;
    public static final int TYPE__CONTRIBUTOR_KEY = Types.NUMERIC;
    public static final String NAME__CONTRIBUTOR_KEY = "_Contributor_key";

    /**
     * Column description of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 4;
    public static final int TYPE_DESCRIPTION = Types.LONGVARCHAR;
    public static final String NAME_DESCRIPTION = "description";

    /**
     * Column note of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_NOTE = 5;
    public static final int TYPE_NOTE = Types.LONGVARCHAR;
    public static final String NAME_NOTE = "note";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 6;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 7;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 8;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 9;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "Pathology";

    /**
     * Create an array of type string containing all the fields of the Pathology table.
     */
    private static final String[] FIELD_NAMES = {
        "Pathology._Pathology_key"
        ,"Pathology.ageAtNecropsy"
        ,"Pathology._Pathologist_key"
        ,"Pathology._Contributor_key"
        ,"Pathology.description"
        ,"Pathology.note"
        ,"Pathology.create_user"
        ,"Pathology.create_date"
        ,"Pathology.update_user"
        ,"Pathology.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Pathology table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Pathology table.
     */
    private static final String ALL_FIELDS = "Pathology._Pathology_key"
                            + ",Pathology.ageAtNecropsy"
                            + ",Pathology._Pathologist_key"
                            + ",Pathology._Contributor_key"
                            + ",Pathology.description"
                            + ",Pathology.note"
                            + ",Pathology.create_user"
                            + ",Pathology.create_date"
                            + ",Pathology.update_user"
                            + ",Pathology.update_date";


    // ----------------------------------------------------- Instance Variables

    private static PathologyDAO singleton = new PathologyDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the PathologyDAO singleton.
     *
     * @return PathologyDAO 
     */
    synchronized public static PathologyDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own PathologyDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(PathologyDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new PathologyDTO instance.
     *
     * @return the new PathologyDTO 
     */
    public PathologyDTO createPathologyDTO() {
        return new PathologyDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a PathologyDTO from the Pathology using its key fields.
     *
     * @return a unique PathologyDTO 
     */
    public PathologyDTO loadByPrimaryKey(Long PathologyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Pathology WHERE Pathology._Pathology_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, PathologyKey);
            List<PathologyDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long PathologyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Pathology WHERE Pathology._Pathology_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, PathologyKey);
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
     * Loads a List of PathologyDTO objects from the Pathology table using its _Contributor_key field.
     *
     * @return a List of PathologyDTO objects
     */
    public List<PathologyDTO> loadByContributorKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Pathology WHERE _Contributor_key=?",
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
     * Deletes from the Pathology table by _Contributor_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByContributorKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Pathology WHERE _Contributor_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of PathologyDTO objects from the Pathology table using its _Pathologist_key field.
     *
     * @return a List of PathologyDTO objects
     */
    public List<PathologyDTO> loadByPathologistKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Pathology WHERE _Pathologist_key=?",
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
     * Deletes from the Pathology table by _Pathologist_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByPathologistKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Pathology WHERE _Pathologist_key=?");
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
     * Retrieves the ReferenceDTO object from the Pathology._Reference_key field.
     *
     * @param pObject the PathologyDTO 
     * @return the associated ReferenceDTO pObject
     */
    public ReferenceDTO getReferenceDTO(PathologyDTO pObject) 
    throws SQLException {
        ReferenceDTO other = ReferenceDAO.getInstance().createReferenceDTO();
        other.setReferenceKey(pObject.getContributorKey());
        return ReferenceDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyDTO object to the ReferenceDTO object.
     *
     * @param pObject the PathologyDTO object to use
     * @param pObjectToBeSet the ReferenceDTO object to associate to the PathologyDTO 
     * @return the associated ReferenceDTO pObject
     */
    // SET IMPORTED
    public PathologyDTO setReferenceDTO(PathologyDTO pObject,ReferenceDTO pObjectToBeSet) {
        pObject.setContributorKey(pObjectToBeSet.getReferenceKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Pathology.
     *
     * @return a List of PathologyDAO objects
     */
    public List<PathologyDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Pathology, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyDAO objects
     */
    public List<PathologyDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Pathology",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of PathologyDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting PathologyDTO table 
     */
    public List<PathologyDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of PathologyDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyDTO table 
     */
    public List<PathologyDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of PathologyDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyDTO table 
     */
    public List<PathologyDTO> loadByWhere(String where, 
                                         int[] fieldList, 
                                         int startRow, 
                                         int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Pathology " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Pathology ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<PathologyDTO> v = new ArrayList<PathologyDTO>();
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
     * Deletes all rows from Pathology table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Pathology table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Pathology " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the PathologyDTO pObject into the database.
     *
     * @param pObject the PathologyDTO pObject to be saved
     */
    public PathologyDTO save(PathologyDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getPathologyKey() == null) {
            Object obj = max(ID__PATHOLOGY_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setPathologyKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Pathology (");
    
                if (pObject.isPathologyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Pathology_key");
                    _dirtyCount++;
                }

                if (pObject.isAgeAtNecropsyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("ageAtNecropsy");
                    _dirtyCount++;
                }

                if (pObject.isPathologistKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Pathologist_key");
                    _dirtyCount++;
                }

                if (pObject.isContributorKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Contributor_key");
                    _dirtyCount++;
                }

                if (pObject.isDescriptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("description");
                    _dirtyCount++;
                }

                if (pObject.isNoteModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("note");
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
    
                if (pObject.isAgeAtNecropsyModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeAtNecropsy());
                }
    
                if (pObject.isPathologistKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologistKey());
                }
    
                if (pObject.isContributorKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getContributorKey());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
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
                _sql = new StringBuffer("UPDATE Pathology SET ");
                boolean useComma=false;

                if (pObject.isPathologyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Pathology_key").append("=?");
                }

                if (pObject.isAgeAtNecropsyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("ageAtNecropsy").append("=?");
                }

                if (pObject.isPathologistKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Pathologist_key").append("=?");
                }

                if (pObject.isContributorKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Contributor_key").append("=?");
                }

                if (pObject.isDescriptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("description").append("=?");
                }

                if (pObject.isNoteModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("note").append("=?");
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
                _sql.append("Pathology._Pathology_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isPathologyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
                }

                if (pObject.isAgeAtNecropsyModified()) {
                      ps.setString(++_dirtyCount, pObject.getAgeAtNecropsy());
                }

                if (pObject.isPathologistKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologistKey());
                }

                if (pObject.isContributorKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getContributorKey());
                }

                if (pObject.isDescriptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getDescription());
                }

                if (pObject.isNoteModified()) {
                      ps.setString(++_dirtyCount, pObject.getNote());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKeyOriginal());
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
     * Saves a List of PathologyDTO objects into the database.
     *
     * @param pObjects the PathologyDTO pObject table to be saved
     * @return the saved PathologyDTO List.
     */
    public List<PathologyDTO> save(List<PathologyDTO> pObjects) throws SQLException {
        for (PathologyDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique PathologyDTO object from a template
     *
     * @param pObject the PathologyDTO object to look for
     * @return the pObject matching the template
     */
    public PathologyDTO loadUniqueUsingTemplate(PathologyDTO pObject) 
        throws SQLException {
         List<PathologyDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of PathologyDTO objects from a template one.
     *
     * @param pObject the PathologyDTO template to look for
     * @return all the PathologyDTO objects matching the template
     */
    public List<PathologyDTO> loadUsingTemplate(PathologyDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of PathologyDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the PathologyDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the PathologyDTO matching the template
     */
    public List<PathologyDTO> loadUsingTemplate(PathologyDTO pObject,
                                               int startRow,
                                               int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Pathology WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isPathologyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathology_key= ?");
             }
    
             if (pObject.isAgeAtNecropsyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageAtNecropsy= ?");
             }
    
             if (pObject.isPathologistKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathologist_key= ?");
             }
    
             if (pObject.isContributorKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Contributor_key= ?");
             }
    
             if (pObject.isDescriptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
             }
    
             if (pObject.isNoteModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
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
    
             if (pObject.isAgeAtNecropsyModified()) {
                 ps.setString(++_dirtyCount, pObject.getAgeAtNecropsy());
             }
    
             if (pObject.isPathologistKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologistKey());
             }
    
             if (pObject.isContributorKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getContributorKey());
             }
    
             if (pObject.isDescriptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getDescription());
             }
    
             if (pObject.isNoteModified()) {
                 ps.setString(++_dirtyCount, pObject.getNote());
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
     * Deletes rows using a PathologyDTO template.
     *
     * @param pObject the PathologyDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(PathologyDTO pObject) throws SQLException {
        if (pObject.isPathologyKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getPathologyKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Pathology WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isPathologyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Pathology_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAgeAtNecropsyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("ageAtNecropsy").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPathologistKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Pathologist_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isContributorKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Contributor_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDescriptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("description").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNoteInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("note").append("=?");
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
    
            if (pObject.isAgeAtNecropsyInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAgeAtNecropsy());
            }
    
            if (pObject.isPathologistKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologistKey());
            }
    
            if (pObject.isContributorKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getContributorKey());
            }
    
            if (pObject.isDescriptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getDescription());
            }
    
            if (pObject.isNoteInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNote());
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

    
    
    //-------------------------------------------------------------------------
    // MANY TO MANY: LOAD OTHER BEAN VIA JUNCTION TABLE 
    //-------------------------------------------------------------------------
    /**
     * Retrieves a List of ImagesDTO objects using the relation table PathologyImages given a PathologyDTO object.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @return a List of ImagesDTO objects
     */
    // MANY TO MANY
    public List<ImagesDTO> loadImagesViaPathologyImages(PathologyDTO pObject) 
        throws SQLException {
        return loadImagesViaPathologyImages(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ImagesDTO objects using the relation table PathologyImages given a PathologyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ImagesDTO objects
     */
    // MANY TO MANY
    public List<ImagesDTO> loadImagesViaPathologyImages(PathologyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Images, ");
        strSQL.append("        PathologyImages");
        strSQL.append("  where PathologyImages._Pathology_key = ?");
        strSQL.append("    and PathologyImages._Images_key = Images._Images_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getPathologyKey());
             return ImagesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of FixativeDTO objects using the relation table PathologyImages given a PathologyDTO object.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @return a List of FixativeDTO objects
     */
    // MANY TO MANY
    public List<FixativeDTO> loadFixativeViaPathologyImages(PathologyDTO pObject) 
        throws SQLException {
        return loadFixativeViaPathologyImages(pObject, 1, -1);
    }

    /**
     * Retrieves a List of FixativeDTO objects using the relation table PathologyImages given a PathologyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of FixativeDTO objects
     */
    // MANY TO MANY
    public List<FixativeDTO> loadFixativeViaPathologyImages(PathologyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Fixative, ");
        strSQL.append("        PathologyImages");
        strSQL.append("  where PathologyImages._Pathology_key = ?");
        strSQL.append("    and PathologyImages._Fixative_key = Fixative._Fixative_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getPathologyKey());
             return FixativeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects using the relation table TumorPathologyAssoc given a PathologyDTO object.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @return a List of TumorFrequencyDTO objects
     */
    // MANY TO MANY
    public List<TumorFrequencyDTO> loadTumorFrequencyViaTumorPathologyAssoc(PathologyDTO pObject) 
        throws SQLException {
        return loadTumorFrequencyViaTumorPathologyAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects using the relation table TumorPathologyAssoc given a PathologyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the PathologyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorFrequencyDTO objects
     */
    // MANY TO MANY
    public List<TumorFrequencyDTO> loadTumorFrequencyViaTumorPathologyAssoc(PathologyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorFrequency, ");
        strSQL.append("        TumorPathologyAssoc");
        strSQL.append("  where TumorPathologyAssoc._Pathology_key = ?");
        strSQL.append("    and TumorPathologyAssoc._TumorFrequency_key = TumorFrequency._TumorFrequency_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getPathologyKey());
             return TumorFrequencyDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Pathology.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Pathology";
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
                    case ID_AGEATNECROPSY:
                        iReturn = rs.getString(1);
                        break;
                    case ID__PATHOLOGIST_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__CONTRIBUTOR_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTE:
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
     * Retrieves the min value for a specified column of the table Pathology.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Pathology";
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
                    case ID_AGEATNECROPSY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__PATHOLOGIST_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__CONTRIBUTOR_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_DESCRIPTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTE:
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
     * Retrieves the number of rows of the table Pathology.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Pathology with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Pathology " + where;
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
     * Retrieves the number of rows of the table Pathology with a prepared statement.
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
     * Looks for the number of elements of a specific PathologyDTO pObject given a c
     *
     * @param pObject the PathologyDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(PathologyDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Pathology WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isPathologyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathology_key= ?");
                }
    
                if (pObject.isAgeAtNecropsyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageAtNecropsy= ?");
                }
    
                if (pObject.isPathologistKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Pathologist_key= ?");
                }
    
                if (pObject.isContributorKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Contributor_key= ?");
                }
    
                if (pObject.isDescriptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("description= ?");
                }
    
                if (pObject.isNoteModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
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
    
                if (pObject.isAgeAtNecropsyModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeAtNecropsy());
                }
    
                if (pObject.isPathologistKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologistKey());
                }
    
                if (pObject.isContributorKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getContributorKey());
                }
    
                if (pObject.isDescriptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getDescription());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
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
     * Transforms a ResultSet iterating on the Pathology on a PathologyDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting PathologyDTO pObject
     */
    public PathologyDTO decodeRow(ResultSet rs) throws SQLException {
        PathologyDTO pObject = createPathologyDTO();
        pObject.setPathologyKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAgeAtNecropsy(rs.getString(2));
        pObject.setPathologistKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setContributorKey(DAOManagerMTB.getLong(rs, 4));
        pObject.setDescription(rs.getString(5));
        pObject.setNote(rs.getString(6));
        pObject.setCreateUser(rs.getString(7));
        pObject.setCreateDate(rs.getTimestamp(8));
        pObject.setUpdateUser(rs.getString(9));
        pObject.setUpdateDate(rs.getTimestamp(10));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Pathology table on a PathologyDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting PathologyDTO pObject
     */
    public PathologyDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        PathologyDTO pObject = createPathologyDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__PATHOLOGY_KEY:
                    ++pos;
                    pObject.setPathologyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_AGEATNECROPSY:
                    ++pos;
                    pObject.setAgeAtNecropsy(rs.getString(pos));
                    break;
                case ID__PATHOLOGIST_KEY:
                    ++pos;
                    pObject.setPathologistKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__CONTRIBUTOR_KEY:
                    ++pos;
                    pObject.setContributorKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_DESCRIPTION:
                    ++pos;
                    pObject.setDescription(rs.getString(pos));
                    break;
                case ID_NOTE:
                    ++pos;
                    pObject.setNote(rs.getString(pos));
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
     * @return a List of PathologyDTO objects
     */
    public List<PathologyDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of PathologyDTO objects
     */
    public List<PathologyDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of PathologyDTO objects
     */
    public List<PathologyDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<PathologyDTO> v = new ArrayList<PathologyDTO>();
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
