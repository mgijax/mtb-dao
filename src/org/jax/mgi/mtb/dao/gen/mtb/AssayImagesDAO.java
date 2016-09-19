
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AssayImages table.
 */
public class AssayImagesDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _AssayImages_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ASSAYIMAGES_KEY = 0;
    public static final int TYPE__ASSAYIMAGES_KEY = Types.NUMERIC;
    public static final String NAME__ASSAYIMAGES_KEY = "_AssayImages_key";

    /**
     * Column HighResName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_HIGHRESNAME = 1;
    public static final int TYPE_HIGHRESNAME = Types.VARCHAR;
    public static final String NAME_HIGHRESNAME = "HighResName";

    /**
     * Column LowResName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_LOWRESNAME = 2;
    public static final int TYPE_LOWRESNAME = Types.VARCHAR;
    public static final String NAME_LOWRESNAME = "LowResName";

    /**
     * Column Note of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_NOTE = 3;
    public static final int TYPE_NOTE = Types.LONGVARCHAR;
    public static final String NAME_NOTE = "Note";

    /**
     * Column Caption of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_CAPTION = 4;
    public static final int TYPE_CAPTION = Types.LONGVARCHAR;
    public static final String NAME_CAPTION = "Caption";

    /**
     * Column Copyright of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_COPYRIGHT = 5;
    public static final int TYPE_COPYRIGHT = Types.LONGVARCHAR;
    public static final String NAME_COPYRIGHT = "Copyright";

    /**
     * Column PrivateFlag of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_PRIVATEFLAG = 6;
    public static final int TYPE_PRIVATEFLAG = Types.NUMERIC;
    public static final String NAME_PRIVATEFLAG = "PrivateFlag";

    /**
     * Column _Reference_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 7;
    public static final int TYPE__REFERENCE_KEY = Types.NUMERIC;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

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


    private static final String TABLE_NAME = "AssayImages";

    /**
     * Create an array of type string containing all the fields of the AssayImages table.
     */
    private static final String[] FIELD_NAMES = {
        "AssayImages._AssayImages_key"
        ,"AssayImages.HighResName"
        ,"AssayImages.LowResName"
        ,"AssayImages.Note"
        ,"AssayImages.Caption"
        ,"AssayImages.Copyright"
        ,"AssayImages.PrivateFlag"
        ,"AssayImages._Reference_key"
        ,"AssayImages.create_user"
        ,"AssayImages.create_date"
        ,"AssayImages.update_user"
        ,"AssayImages.update_date"
    };

    /**
     * Create an array of type containing all the fields of the AssayImages table.
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
     * Field that contains the comma separated fields of the AssayImages table.
     */
    private static final String ALL_FIELDS = "AssayImages._AssayImages_key"
                            + ",AssayImages.HighResName"
                            + ",AssayImages.LowResName"
                            + ",AssayImages.Note"
                            + ",AssayImages.Caption"
                            + ",AssayImages.Copyright"
                            + ",AssayImages.PrivateFlag"
                            + ",AssayImages._Reference_key"
                            + ",AssayImages.create_user"
                            + ",AssayImages.create_date"
                            + ",AssayImages.update_user"
                            + ",AssayImages.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AssayImagesDAO singleton = new AssayImagesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AssayImagesDAO singleton.
     *
     * @return AssayImagesDAO 
     */
    synchronized public static AssayImagesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AssayImagesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AssayImagesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AssayImagesDTO instance.
     *
     * @return the new AssayImagesDTO 
     */
    public AssayImagesDTO createAssayImagesDTO() {
        return new AssayImagesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AssayImagesDTO from the AssayImages using its key fields.
     *
     * @return a unique AssayImagesDTO 
     */
    public AssayImagesDTO loadByPrimaryKey(Long AssayImagesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AssayImages WHERE AssayImages._AssayImages_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AssayImagesKey);
            List<AssayImagesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AssayImagesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AssayImages WHERE AssayImages._AssayImages_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AssayImagesKey);
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
     * Loads a List of AssayImagesDTO objects from the AssayImages table using its _Reference_key field.
     *
     * @return a List of AssayImagesDTO objects
     */
    public List<AssayImagesDTO> loadByReferenceKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AssayImages WHERE _Reference_key=?",
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
     * Deletes from the AssayImages table by _Reference_key field.
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
            ps = c.prepareStatement("DELETE FROM AssayImages WHERE _Reference_key=?");
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
     * Retrieves the ReferenceDTO object from the AssayImages._Reference_key field.
     *
     * @param pObject the AssayImagesDTO 
     * @return the associated ReferenceDTO pObject
     */
    public ReferenceDTO getReferenceDTO(AssayImagesDTO pObject) 
    throws SQLException {
        ReferenceDTO other = ReferenceDAO.getInstance().createReferenceDTO();
        other.setReferenceKey(pObject.getReferenceKey());
        return ReferenceDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AssayImagesDTO object to the ReferenceDTO object.
     *
     * @param pObject the AssayImagesDTO object to use
     * @param pObjectToBeSet the ReferenceDTO object to associate to the AssayImagesDTO 
     * @return the associated ReferenceDTO pObject
     */
    // SET IMPORTED
    public AssayImagesDTO setReferenceDTO(AssayImagesDTO pObject,ReferenceDTO pObjectToBeSet) {
        pObject.setReferenceKey(pObjectToBeSet.getReferenceKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from AssayImages.
     *
     * @return a List of AssayImagesDAO objects
     */
    public List<AssayImagesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AssayImages, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AssayImagesDAO objects
     */
    public List<AssayImagesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AssayImages",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AssayImagesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AssayImagesDTO table 
     */
    public List<AssayImagesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AssayImagesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AssayImagesDTO table 
     */
    public List<AssayImagesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AssayImagesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AssayImagesDTO table 
     */
    public List<AssayImagesDTO> loadByWhere(String where, 
                                           int[] fieldList, 
                                           int startRow, 
                                           int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AssayImages " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AssayImages ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AssayImagesDTO> v = new ArrayList<AssayImagesDTO>();
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
     * Deletes all rows from AssayImages table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AssayImages table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AssayImages " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AssayImagesDTO pObject into the database.
     *
     * @param pObject the AssayImagesDTO pObject to be saved
     */
    public AssayImagesDTO save(AssayImagesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAssayImagesKey() == null) {
            Object obj = max(ID__ASSAYIMAGES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAssayImagesKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AssayImages (");
    
                if (pObject.isAssayImagesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AssayImages_key");
                    _dirtyCount++;
                }

                if (pObject.isHighResNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("HighResName");
                    _dirtyCount++;
                }

                if (pObject.isLowResNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("LowResName");
                    _dirtyCount++;
                }

                if (pObject.isNoteModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("Note");
                    _dirtyCount++;
                }

                if (pObject.isCaptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("Caption");
                    _dirtyCount++;
                }

                if (pObject.isCopyrightModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("Copyright");
                    _dirtyCount++;
                }

                if (pObject.isPrivateFlagModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("PrivateFlag");
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

                if (pObject.isAssayImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKey());
                }
    
                if (pObject.isHighResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getHighResName());
                }
    
                if (pObject.isLowResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getLowResName());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isCaptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getCaption());
                }
    
                if (pObject.isCopyrightModified()) {
                    ps.setString(++_dirtyCount, pObject.getCopyright());
                }
    
                if (pObject.isPrivateFlagModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
                _sql = new StringBuffer("UPDATE AssayImages SET ");
                boolean useComma=false;

                if (pObject.isAssayImagesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AssayImages_key").append("=?");
                }

                if (pObject.isHighResNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("HighResName").append("=?");
                }

                if (pObject.isLowResNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("LowResName").append("=?");
                }

                if (pObject.isNoteModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("Note").append("=?");
                }

                if (pObject.isCaptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("Caption").append("=?");
                }

                if (pObject.isCopyrightModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("Copyright").append("=?");
                }

                if (pObject.isPrivateFlagModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("PrivateFlag").append("=?");
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
                _sql.append("AssayImages._AssayImages_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAssayImagesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKey());
                }

                if (pObject.isHighResNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getHighResName());
                }

                if (pObject.isLowResNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getLowResName());
                }

                if (pObject.isNoteModified()) {
                      ps.setString(++_dirtyCount, pObject.getNote());
                }

                if (pObject.isCaptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getCaption());
                }

                if (pObject.isCopyrightModified()) {
                      ps.setString(++_dirtyCount, pObject.getCopyright());
                }

                if (pObject.isPrivateFlagModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKeyOriginal());
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
     * Saves a List of AssayImagesDTO objects into the database.
     *
     * @param pObjects the AssayImagesDTO pObject table to be saved
     * @return the saved AssayImagesDTO List.
     */
    public List<AssayImagesDTO> save(List<AssayImagesDTO> pObjects) throws SQLException {
        for (AssayImagesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AssayImagesDTO object from a template
     *
     * @param pObject the AssayImagesDTO object to look for
     * @return the pObject matching the template
     */
    public AssayImagesDTO loadUniqueUsingTemplate(AssayImagesDTO pObject) 
        throws SQLException {
         List<AssayImagesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AssayImagesDTO objects from a template one.
     *
     * @param pObject the AssayImagesDTO template to look for
     * @return all the AssayImagesDTO objects matching the template
     */
    public List<AssayImagesDTO> loadUsingTemplate(AssayImagesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AssayImagesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AssayImagesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AssayImagesDTO matching the template
     */
    public List<AssayImagesDTO> loadUsingTemplate(AssayImagesDTO pObject,
                                                 int startRow,
                                                 int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AssayImages WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAssayImagesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AssayImages_key= ?");
             }
    
             if (pObject.isHighResNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("HighResName= ?");
             }
    
             if (pObject.isLowResNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("LowResName= ?");
             }
    
             if (pObject.isNoteModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Note= ?");
             }
    
             if (pObject.isCaptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Caption= ?");
             }
    
             if (pObject.isCopyrightModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Copyright= ?");
             }
    
             if (pObject.isPrivateFlagModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("PrivateFlag= ?");
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
    
             if (pObject.isAssayImagesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKey());
             }
    
             if (pObject.isHighResNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getHighResName());
             }
    
             if (pObject.isLowResNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getLowResName());
             }
    
             if (pObject.isNoteModified()) {
                 ps.setString(++_dirtyCount, pObject.getNote());
             }
    
             if (pObject.isCaptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getCaption());
             }
    
             if (pObject.isCopyrightModified()) {
                 ps.setString(++_dirtyCount, pObject.getCopyright());
             }
    
             if (pObject.isPrivateFlagModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
     * Deletes rows using a AssayImagesDTO template.
     *
     * @param pObject the AssayImagesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AssayImagesDTO pObject) throws SQLException {
        if (pObject.isAssayImagesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAssayImagesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AssayImages WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAssayImagesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AssayImages_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isHighResNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("HighResName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLowResNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("LowResName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNoteInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("Note").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCaptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("Caption").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCopyrightInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("Copyright").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPrivateFlagInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("PrivateFlag").append("=?");
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
    
            if (pObject.isAssayImagesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKey());
            }
    
            if (pObject.isHighResNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getHighResName());
            }
    
            if (pObject.isLowResNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getLowResName());
            }
    
            if (pObject.isNoteInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNote());
            }
    
            if (pObject.isCaptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCaption());
            }
    
            if (pObject.isCopyrightInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCopyright());
            }
    
            if (pObject.isPrivateFlagInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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

    
    
    //-------------------------------------------------------------------------
    // MANY TO MANY: LOAD OTHER BEAN VIA JUNCTION TABLE 
    //-------------------------------------------------------------------------
    /**
     * Retrieves a List of TumorGeneticChangesDTO objects using the relation table TmrGntcCngAssayImageAssoc given a AssayImagesDTO object.
     *
     * @param pObject the AssayImagesDTO pObject to be used
     * @return a List of TumorGeneticChangesDTO objects
     */
    // MANY TO MANY
    public List<TumorGeneticChangesDTO> loadTumorGeneticChangesViaTmrGntcCngAssayImageAssoc(AssayImagesDTO pObject) 
        throws SQLException {
        return loadTumorGeneticChangesViaTmrGntcCngAssayImageAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorGeneticChangesDTO objects using the relation table TmrGntcCngAssayImageAssoc given a AssayImagesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AssayImagesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorGeneticChangesDTO objects
     */
    // MANY TO MANY
    public List<TumorGeneticChangesDTO> loadTumorGeneticChangesViaTmrGntcCngAssayImageAssoc(AssayImagesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorGeneticChanges, ");
        strSQL.append("        TmrGntcCngAssayImageAssoc");
        strSQL.append("  where TmrGntcCngAssayImageAssoc._AssayImages_key = ?");
        strSQL.append("    and TmrGntcCngAssayImageAssoc._TumorGeneticChanges_key = TumorGeneticChanges._TumorGeneticChanges_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAssayImagesKey());
             return TumorGeneticChangesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table AssayImages.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AssayImages";
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
                    case ID__ASSAYIMAGES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_HIGHRESNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_LOWRESNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CAPTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COPYRIGHT:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PRIVATEFLAG:
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
     * Retrieves the min value for a specified column of the table AssayImages.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AssayImages";
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
                    case ID__ASSAYIMAGES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_HIGHRESNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_LOWRESNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CAPTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COPYRIGHT:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PRIVATEFLAG:
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
     * Retrieves the number of rows of the table AssayImages.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AssayImages with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AssayImages " + where;
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
     * Retrieves the number of rows of the table AssayImages with a prepared statement.
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
     * Looks for the number of elements of a specific AssayImagesDTO pObject given a c
     *
     * @param pObject the AssayImagesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AssayImagesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AssayImages WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAssayImagesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AssayImages_key= ?");
                }
    
                if (pObject.isHighResNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("HighResName= ?");
                }
    
                if (pObject.isLowResNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("LowResName= ?");
                }
    
                if (pObject.isNoteModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Note= ?");
                }
    
                if (pObject.isCaptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Caption= ?");
                }
    
                if (pObject.isCopyrightModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("Copyright= ?");
                }
    
                if (pObject.isPrivateFlagModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("PrivateFlag= ?");
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
    
                if (pObject.isAssayImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayImagesKey());
                }
    
                if (pObject.isHighResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getHighResName());
                }
    
                if (pObject.isLowResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getLowResName());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isCaptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getCaption());
                }
    
                if (pObject.isCopyrightModified()) {
                    ps.setString(++_dirtyCount, pObject.getCopyright());
                }
    
                if (pObject.isPrivateFlagModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
     * Transforms a ResultSet iterating on the AssayImages on a AssayImagesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AssayImagesDTO pObject
     */
    public AssayImagesDTO decodeRow(ResultSet rs) throws SQLException {
        AssayImagesDTO pObject = createAssayImagesDTO();
        pObject.setAssayImagesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setHighResName(rs.getString(2));
        pObject.setLowResName(rs.getString(3));
        pObject.setNote(rs.getString(4));
        pObject.setCaption(rs.getString(5));
        pObject.setCopyright(rs.getString(6));
        pObject.setPrivateFlag(DAOManagerMTB.getLong(rs, 7));
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 8));
        pObject.setCreateUser(rs.getString(9));
        pObject.setCreateDate(rs.getTimestamp(10));
        pObject.setUpdateUser(rs.getString(11));
        pObject.setUpdateDate(rs.getTimestamp(12));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AssayImages table on a AssayImagesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AssayImagesDTO pObject
     */
    public AssayImagesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AssayImagesDTO pObject = createAssayImagesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ASSAYIMAGES_KEY:
                    ++pos;
                    pObject.setAssayImagesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_HIGHRESNAME:
                    ++pos;
                    pObject.setHighResName(rs.getString(pos));
                    break;
                case ID_LOWRESNAME:
                    ++pos;
                    pObject.setLowResName(rs.getString(pos));
                    break;
                case ID_NOTE:
                    ++pos;
                    pObject.setNote(rs.getString(pos));
                    break;
                case ID_CAPTION:
                    ++pos;
                    pObject.setCaption(rs.getString(pos));
                    break;
                case ID_COPYRIGHT:
                    ++pos;
                    pObject.setCopyright(rs.getString(pos));
                    break;
                case ID_PRIVATEFLAG:
                    ++pos;
                    pObject.setPrivateFlag(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AssayImagesDTO objects
     */
    public List<AssayImagesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AssayImagesDTO objects
     */
    public List<AssayImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AssayImagesDTO objects
     */
    public List<AssayImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AssayImagesDTO> v = new ArrayList<AssayImagesDTO>();
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
