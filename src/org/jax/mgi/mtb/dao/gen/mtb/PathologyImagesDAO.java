
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the PathologyImages table.
 */
public class PathologyImagesDAO
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
     * Column magnification of type Types.VARCHAR mapped to String.
     */
    public static final int ID_MAGNIFICATION = 2;
    public static final int TYPE_MAGNIFICATION = Types.VARCHAR;
    public static final String NAME_MAGNIFICATION = "magnification";

    /**
     * Column stain of type Types.VARCHAR mapped to String.
     */
    public static final int ID_STAIN = 3;
    public static final int TYPE_STAIN = Types.VARCHAR;
    public static final String NAME_STAIN = "stain";

    /**
     * Column caption of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_CAPTION = 4;
    public static final int TYPE_CAPTION = Types.LONGVARCHAR;
    public static final String NAME_CAPTION = "caption";

    /**
     * Column copyright of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_COPYRIGHT = 5;
    public static final int TYPE_COPYRIGHT = Types.LONGVARCHAR;
    public static final String NAME_COPYRIGHT = "copyright";

    /**
     * Column notes of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_NOTES = 6;
    public static final int TYPE_NOTES = Types.LONGVARCHAR;
    public static final String NAME_NOTES = "notes";

    /**
     * Column _Fixative_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__FIXATIVE_KEY = 7;
    public static final int TYPE__FIXATIVE_KEY = Types.NUMERIC;
    public static final String NAME__FIXATIVE_KEY = "_Fixative_key";

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


    private static final String TABLE_NAME = "PathologyImages";

    /**
     * Create an array of type string containing all the fields of the PathologyImages table.
     */
    private static final String[] FIELD_NAMES = {
        "PathologyImages._Pathology_key"
        ,"PathologyImages._Images_key"
        ,"PathologyImages.magnification"
        ,"PathologyImages.stain"
        ,"PathologyImages.caption"
        ,"PathologyImages.copyright"
        ,"PathologyImages.notes"
        ,"PathologyImages._Fixative_key"
        ,"PathologyImages.create_user"
        ,"PathologyImages.create_date"
        ,"PathologyImages.update_user"
        ,"PathologyImages.update_date"
    };

    /**
     * Create an array of type containing all the fields of the PathologyImages table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the PathologyImages table.
     */
    private static final String ALL_FIELDS = "PathologyImages._Pathology_key"
                            + ",PathologyImages._Images_key"
                            + ",PathologyImages.magnification"
                            + ",PathologyImages.stain"
                            + ",PathologyImages.caption"
                            + ",PathologyImages.copyright"
                            + ",PathologyImages.notes"
                            + ",PathologyImages._Fixative_key"
                            + ",PathologyImages.create_user"
                            + ",PathologyImages.create_date"
                            + ",PathologyImages.update_user"
                            + ",PathologyImages.update_date";


    // ----------------------------------------------------- Instance Variables

    private static PathologyImagesDAO singleton = new PathologyImagesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the PathologyImagesDAO singleton.
     *
     * @return PathologyImagesDAO 
     */
    synchronized public static PathologyImagesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own PathologyImagesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(PathologyImagesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new PathologyImagesDTO instance.
     *
     * @return the new PathologyImagesDTO 
     */
    public PathologyImagesDTO createPathologyImagesDTO() {
        return new PathologyImagesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a PathologyImagesDTO from the PathologyImages using its key fields.
     *
     * @return a unique PathologyImagesDTO 
     */
    public PathologyImagesDTO loadByPrimaryKey(Long ImagesKey, Long PathologyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImages WHERE PathologyImages._Images_key=? and PathologyImages._Pathology_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
            DAOManagerMTB.setLong(ps, 2, PathologyKey);
            List<PathologyImagesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ImagesKey, Long PathologyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from PathologyImages WHERE PathologyImages._Images_key=? and PathologyImages._Pathology_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
            DAOManagerMTB.setLong(ps, 2, PathologyKey);
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
     * Loads a List of PathologyImagesDTO objects from the PathologyImages table using its _Images_key field.
     *
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByImagesKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImages WHERE _Images_key=?",
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
     * Deletes from the PathologyImages table by _Images_key field.
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
            ps = c.prepareStatement("DELETE FROM PathologyImages WHERE _Images_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of PathologyImagesDTO objects from the PathologyImages table using its _Pathology_key field.
     *
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByPathologyKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImages WHERE _Pathology_key=?",
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
     * Deletes from the PathologyImages table by _Pathology_key field.
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
            ps = c.prepareStatement("DELETE FROM PathologyImages WHERE _Pathology_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of PathologyImagesDTO objects from the PathologyImages table using its _Fixative_key field.
     *
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByFixativeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImages WHERE _Fixative_key=?",
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
     * Deletes from the PathologyImages table by _Fixative_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByFixativeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM PathologyImages WHERE _Fixative_key=?");
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
     * Retrieves the ImagesDTO object from the PathologyImages._Images_key field.
     *
     * @param pObject the PathologyImagesDTO 
     * @return the associated ImagesDTO pObject
     */
    public ImagesDTO getImagesDTO(PathologyImagesDTO pObject) 
    throws SQLException {
        ImagesDTO other = ImagesDAO.getInstance().createImagesDTO();
        other.setImagesKey(pObject.getImagesKey());
        return ImagesDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyImagesDTO object to the ImagesDTO object.
     *
     * @param pObject the PathologyImagesDTO object to use
     * @param pObjectToBeSet the ImagesDTO object to associate to the PathologyImagesDTO 
     * @return the associated ImagesDTO pObject
     */
    // SET IMPORTED
    public PathologyImagesDTO setImagesDTO(PathologyImagesDTO pObject,ImagesDTO pObjectToBeSet) {
        pObject.setImagesKey(pObjectToBeSet.getImagesKey());
        return pObject;
    }

    /**
     * Retrieves the PathologyDTO object from the PathologyImages._Pathology_key field.
     *
     * @param pObject the PathologyImagesDTO 
     * @return the associated PathologyDTO pObject
     */
    public PathologyDTO getPathologyDTO(PathologyImagesDTO pObject) 
    throws SQLException {
        PathologyDTO other = PathologyDAO.getInstance().createPathologyDTO();
        other.setPathologyKey(pObject.getPathologyKey());
        return PathologyDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyImagesDTO object to the PathologyDTO object.
     *
     * @param pObject the PathologyImagesDTO object to use
     * @param pObjectToBeSet the PathologyDTO object to associate to the PathologyImagesDTO 
     * @return the associated PathologyDTO pObject
     */
    // SET IMPORTED
    public PathologyImagesDTO setPathologyDTO(PathologyImagesDTO pObject,PathologyDTO pObjectToBeSet) {
        pObject.setPathologyKey(pObjectToBeSet.getPathologyKey());
        return pObject;
    }

    /**
     * Retrieves the FixativeDTO object from the PathologyImages._Fixative_key field.
     *
     * @param pObject the PathologyImagesDTO 
     * @return the associated FixativeDTO pObject
     */
    public FixativeDTO getFixativeDTO(PathologyImagesDTO pObject) 
    throws SQLException {
        FixativeDTO other = FixativeDAO.getInstance().createFixativeDTO();
        other.setFixativeKey(pObject.getFixativeKey());
        return FixativeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the PathologyImagesDTO object to the FixativeDTO object.
     *
     * @param pObject the PathologyImagesDTO object to use
     * @param pObjectToBeSet the FixativeDTO object to associate to the PathologyImagesDTO 
     * @return the associated FixativeDTO pObject
     */
    // SET IMPORTED
    public PathologyImagesDTO setFixativeDTO(PathologyImagesDTO pObject,FixativeDTO pObjectToBeSet) {
        pObject.setFixativeKey(pObjectToBeSet.getFixativeKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from PathologyImages.
     *
     * @return a List of PathologyImagesDAO objects
     */
    public List<PathologyImagesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from PathologyImages, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyImagesDAO objects
     */
    public List<PathologyImagesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM PathologyImages",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of PathologyImagesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting PathologyImagesDTO table 
     */
    public List<PathologyImagesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of PathologyImagesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyImagesDTO table 
     */
    public List<PathologyImagesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of PathologyImagesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting PathologyImagesDTO table 
     */
    public List<PathologyImagesDTO> loadByWhere(String where, 
                                               int[] fieldList, 
                                               int startRow, 
                                               int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from PathologyImages " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from PathologyImages ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<PathologyImagesDTO> v = new ArrayList<PathologyImagesDTO>();
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
     * Deletes all rows from PathologyImages table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the PathologyImages table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM PathologyImages " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the PathologyImagesDTO pObject into the database.
     *
     * @param pObject the PathologyImagesDTO pObject to be saved
     */
    public PathologyImagesDTO save(PathologyImagesDTO pObject) 
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
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into PathologyImages (");
    
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

                if (pObject.isMagnificationModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("magnification");
                    _dirtyCount++;
                }

                if (pObject.isStainModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("stain");
                    _dirtyCount++;
                }

                if (pObject.isCaptionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("caption");
                    _dirtyCount++;
                }

                if (pObject.isCopyrightModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("copyright");
                    _dirtyCount++;
                }

                if (pObject.isNotesModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("notes");
                    _dirtyCount++;
                }

                if (pObject.isFixativeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Fixative_key");
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
    
                if (pObject.isMagnificationModified()) {
                    ps.setString(++_dirtyCount, pObject.getMagnification());
                }
    
                if (pObject.isStainModified()) {
                    ps.setString(++_dirtyCount, pObject.getStain());
                }
    
                if (pObject.isCaptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getCaption());
                }
    
                if (pObject.isCopyrightModified()) {
                    ps.setString(++_dirtyCount, pObject.getCopyright());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
                }
    
                if (pObject.isFixativeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getFixativeKey());
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
                _sql = new StringBuffer("UPDATE PathologyImages SET ");
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

                if (pObject.isMagnificationModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("magnification").append("=?");
                }

                if (pObject.isStainModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("stain").append("=?");
                }

                if (pObject.isCaptionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("caption").append("=?");
                }

                if (pObject.isCopyrightModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("copyright").append("=?");
                }

                if (pObject.isNotesModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("notes").append("=?");
                }

                if (pObject.isFixativeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Fixative_key").append("=?");
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
                _sql.append("PathologyImages._Images_key=? AND PathologyImages._Pathology_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isPathologyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPathologyKey());
                }

                if (pObject.isImagesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }

                if (pObject.isMagnificationModified()) {
                      ps.setString(++_dirtyCount, pObject.getMagnification());
                }

                if (pObject.isStainModified()) {
                      ps.setString(++_dirtyCount, pObject.getStain());
                }

                if (pObject.isCaptionModified()) {
                      ps.setString(++_dirtyCount, pObject.getCaption());
                }

                if (pObject.isCopyrightModified()) {
                      ps.setString(++_dirtyCount, pObject.getCopyright());
                }

                if (pObject.isNotesModified()) {
                      ps.setString(++_dirtyCount, pObject.getNotes());
                }

                if (pObject.isFixativeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getFixativeKey());
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
     * Saves a List of PathologyImagesDTO objects into the database.
     *
     * @param pObjects the PathologyImagesDTO pObject table to be saved
     * @return the saved PathologyImagesDTO List.
     */
    public List<PathologyImagesDTO> save(List<PathologyImagesDTO> pObjects) throws SQLException {
        for (PathologyImagesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique PathologyImagesDTO object from a template
     *
     * @param pObject the PathologyImagesDTO object to look for
     * @return the pObject matching the template
     */
    public PathologyImagesDTO loadUniqueUsingTemplate(PathologyImagesDTO pObject) 
        throws SQLException {
         List<PathologyImagesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of PathologyImagesDTO objects from a template one.
     *
     * @param pObject the PathologyImagesDTO template to look for
     * @return all the PathologyImagesDTO objects matching the template
     */
    public List<PathologyImagesDTO> loadUsingTemplate(PathologyImagesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of PathologyImagesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the PathologyImagesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the PathologyImagesDTO matching the template
     */
    public List<PathologyImagesDTO> loadUsingTemplate(PathologyImagesDTO pObject,
                                                     int startRow,
                                                     int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from PathologyImages WHERE ");
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
    
             if (pObject.isMagnificationModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("magnification= ?");
             }
    
             if (pObject.isStainModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("stain= ?");
             }
    
             if (pObject.isCaptionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("caption= ?");
             }
    
             if (pObject.isCopyrightModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("copyright= ?");
             }
    
             if (pObject.isNotesModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
             }
    
             if (pObject.isFixativeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Fixative_key= ?");
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
    
             if (pObject.isMagnificationModified()) {
                 ps.setString(++_dirtyCount, pObject.getMagnification());
             }
    
             if (pObject.isStainModified()) {
                 ps.setString(++_dirtyCount, pObject.getStain());
             }
    
             if (pObject.isCaptionModified()) {
                 ps.setString(++_dirtyCount, pObject.getCaption());
             }
    
             if (pObject.isCopyrightModified()) {
                 ps.setString(++_dirtyCount, pObject.getCopyright());
             }
    
             if (pObject.isNotesModified()) {
                 ps.setString(++_dirtyCount, pObject.getNotes());
             }
    
             if (pObject.isFixativeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getFixativeKey());
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
     * Deletes rows using a PathologyImagesDTO template.
     *
     * @param pObject the PathologyImagesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(PathologyImagesDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM PathologyImages WHERE ");
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
    
            if (pObject.isMagnificationInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("magnification").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStainInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("stain").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCaptionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("caption").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCopyrightInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("copyright").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNotesInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("notes").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isFixativeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Fixative_key").append("=?");
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
    
            if (pObject.isMagnificationInitialized()) {
                ps.setString(++_dirtyCount, pObject.getMagnification());
            }
    
            if (pObject.isStainInitialized()) {
                ps.setString(++_dirtyCount, pObject.getStain());
            }
    
            if (pObject.isCaptionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCaption());
            }
    
            if (pObject.isCopyrightInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCopyright());
            }
    
            if (pObject.isNotesInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNotes());
            }
    
            if (pObject.isFixativeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getFixativeKey());
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
     * Retrieves a List of ProbeDTO objects using the relation table PathologyImagesProbes given a PathologyImagesDTO object.
     *
     * @param pObject the PathologyImagesDTO pObject to be used
     * @return a List of ProbeDTO objects
     */
    // MANY TO MANY
    public List<ProbeDTO> loadProbeViaPathologyImagesProbes(PathologyImagesDTO pObject) 
        throws SQLException {
        return loadProbeViaPathologyImagesProbes(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ProbeDTO objects using the relation table PathologyImagesProbes given a PathologyImagesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the PathologyImagesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ProbeDTO objects
     */
    // MANY TO MANY
    public List<ProbeDTO> loadProbeViaPathologyImagesProbes(PathologyImagesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Probe, ");
        strSQL.append("        PathologyImagesProbes");
        strSQL.append("  where PathologyImagesProbes._Pathology_key = ?");
        strSQL.append("    and PathologyImagesProbes._Probe_key = Probe._Probe_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getPathologyKey());
             return ProbeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table PathologyImages.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from PathologyImages";
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
                    case ID_MAGNIFICATION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_STAIN:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CAPTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COPYRIGHT:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTES:
                        iReturn = rs.getString(1);
                        break;
                    case ID__FIXATIVE_KEY:
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
     * Retrieves the min value for a specified column of the table PathologyImages.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from PathologyImages";
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
                    case ID_MAGNIFICATION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_STAIN:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CAPTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COPYRIGHT:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTES:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__FIXATIVE_KEY:
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
     * Retrieves the number of rows of the table PathologyImages.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table PathologyImages with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from PathologyImages " + where;
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
     * Retrieves the number of rows of the table PathologyImages with a prepared statement.
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
     * Looks for the number of elements of a specific PathologyImagesDTO pObject given a c
     *
     * @param pObject the PathologyImagesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(PathologyImagesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from PathologyImages WHERE ");
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
    
                if (pObject.isMagnificationModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("magnification= ?");
                }
    
                if (pObject.isStainModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("stain= ?");
                }
    
                if (pObject.isCaptionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("caption= ?");
                }
    
                if (pObject.isCopyrightModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("copyright= ?");
                }
    
                if (pObject.isNotesModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
                }
    
                if (pObject.isFixativeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Fixative_key= ?");
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
    
                if (pObject.isMagnificationModified()) {
                    ps.setString(++_dirtyCount, pObject.getMagnification());
                }
    
                if (pObject.isStainModified()) {
                    ps.setString(++_dirtyCount, pObject.getStain());
                }
    
                if (pObject.isCaptionModified()) {
                    ps.setString(++_dirtyCount, pObject.getCaption());
                }
    
                if (pObject.isCopyrightModified()) {
                    ps.setString(++_dirtyCount, pObject.getCopyright());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
                }
    
                if (pObject.isFixativeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getFixativeKey());
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
     * Transforms a ResultSet iterating on the PathologyImages on a PathologyImagesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting PathologyImagesDTO pObject
     */
    public PathologyImagesDTO decodeRow(ResultSet rs) throws SQLException {
        PathologyImagesDTO pObject = createPathologyImagesDTO();
        pObject.setPathologyKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setImagesKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setMagnification(rs.getString(3));
        pObject.setStain(rs.getString(4));
        pObject.setCaption(rs.getString(5));
        pObject.setCopyright(rs.getString(6));
        pObject.setNotes(rs.getString(7));
        pObject.setFixativeKey(DAOManagerMTB.getLong(rs, 8));
        pObject.setCreateUser(rs.getString(9));
        pObject.setCreateDate(rs.getTimestamp(10));
        pObject.setUpdateUser(rs.getString(11));
        pObject.setUpdateDate(rs.getTimestamp(12));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the PathologyImages table on a PathologyImagesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting PathologyImagesDTO pObject
     */
    public PathologyImagesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        PathologyImagesDTO pObject = createPathologyImagesDTO();
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
                case ID_MAGNIFICATION:
                    ++pos;
                    pObject.setMagnification(rs.getString(pos));
                    break;
                case ID_STAIN:
                    ++pos;
                    pObject.setStain(rs.getString(pos));
                    break;
                case ID_CAPTION:
                    ++pos;
                    pObject.setCaption(rs.getString(pos));
                    break;
                case ID_COPYRIGHT:
                    ++pos;
                    pObject.setCopyright(rs.getString(pos));
                    break;
                case ID_NOTES:
                    ++pos;
                    pObject.setNotes(rs.getString(pos));
                    break;
                case ID__FIXATIVE_KEY:
                    ++pos;
                    pObject.setFixativeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of PathologyImagesDTO objects
     */
    public List<PathologyImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<PathologyImagesDTO> v = new ArrayList<PathologyImagesDTO>();
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
