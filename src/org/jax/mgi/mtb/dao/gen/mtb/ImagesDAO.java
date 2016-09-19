
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Images table.
 */
public class ImagesDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Images_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__IMAGES_KEY = 0;
    public static final int TYPE__IMAGES_KEY = Types.NUMERIC;
    public static final String NAME__IMAGES_KEY = "_Images_key";

    /**
     * Column highResName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_HIGHRESNAME = 1;
    public static final int TYPE_HIGHRESNAME = Types.VARCHAR;
    public static final String NAME_HIGHRESNAME = "highResName";

    /**
     * Column mediumResName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_MEDIUMRESNAME = 2;
    public static final int TYPE_MEDIUMRESNAME = Types.VARCHAR;
    public static final String NAME_MEDIUMRESNAME = "mediumResName";

    /**
     * Column lowResName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_LOWRESNAME = 3;
    public static final int TYPE_LOWRESNAME = Types.VARCHAR;
    public static final String NAME_LOWRESNAME = "lowResName";

    /**
     * Column server of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SERVER = 4;
    public static final int TYPE_SERVER = Types.VARCHAR;
    public static final String NAME_SERVER = "server";

    /**
     * Column serverPath of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SERVERPATH = 5;
    public static final int TYPE_SERVERPATH = Types.VARCHAR;
    public static final String NAME_SERVERPATH = "serverPath";

    /**
     * Column url of type Types.VARCHAR mapped to String.
     */
    public static final int ID_URL = 6;
    public static final int TYPE_URL = Types.VARCHAR;
    public static final String NAME_URL = "url";

    /**
     * Column urlPath of type Types.VARCHAR mapped to String.
     */
    public static final int ID_URLPATH = 7;
    public static final int TYPE_URLPATH = Types.VARCHAR;
    public static final String NAME_URLPATH = "urlPath";

    /**
     * Column zoomifyPath of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ZOOMIFYPATH = 8;
    public static final int TYPE_ZOOMIFYPATH = Types.VARCHAR;
    public static final String NAME_ZOOMIFYPATH = "zoomifyPath";

    /**
     * Column privateFlag of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_PRIVATEFLAG = 9;
    public static final int TYPE_PRIVATEFLAG = Types.NUMERIC;
    public static final String NAME_PRIVATEFLAG = "privateFlag";

    /**
     * Column description of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 10;
    public static final int TYPE_DESCRIPTION = Types.LONGVARCHAR;
    public static final String NAME_DESCRIPTION = "description";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 11;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 12;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 13;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 14;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "Images";

    /**
     * Create an array of type string containing all the fields of the Images table.
     */
    private static final String[] FIELD_NAMES = {
        "Images._Images_key"
        ,"Images.highResName"
        ,"Images.mediumResName"
        ,"Images.lowResName"
        ,"Images.server"
        ,"Images.serverPath"
        ,"Images.url"
        ,"Images.urlPath"
        ,"Images.zoomifyPath"
        ,"Images.privateFlag"
        ,"Images.description"
        ,"Images.create_user"
        ,"Images.create_date"
        ,"Images.update_user"
        ,"Images.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Images table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Images table.
     */
    private static final String ALL_FIELDS = "Images._Images_key"
                            + ",Images.highResName"
                            + ",Images.mediumResName"
                            + ",Images.lowResName"
                            + ",Images.server"
                            + ",Images.serverPath"
                            + ",Images.url"
                            + ",Images.urlPath"
                            + ",Images.zoomifyPath"
                            + ",Images.privateFlag"
                            + ",Images.description"
                            + ",Images.create_user"
                            + ",Images.create_date"
                            + ",Images.update_user"
                            + ",Images.update_date";


    // ----------------------------------------------------- Instance Variables

    private static ImagesDAO singleton = new ImagesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the ImagesDAO singleton.
     *
     * @return ImagesDAO 
     */
    synchronized public static ImagesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own ImagesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ImagesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new ImagesDTO instance.
     *
     * @return the new ImagesDTO 
     */
    public ImagesDTO createImagesDTO() {
        return new ImagesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a ImagesDTO from the Images using its key fields.
     *
     * @return a unique ImagesDTO 
     */
    public ImagesDTO loadByPrimaryKey(Long ImagesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Images WHERE Images._Images_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
            List<ImagesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ImagesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Images WHERE Images._Images_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ImagesKey);
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
     * Loads all the rows from Images.
     *
     * @return a List of ImagesDAO objects
     */
    public List<ImagesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Images, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ImagesDAO objects
     */
    public List<ImagesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Images",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of ImagesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ImagesDTO table 
     */
    public List<ImagesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of ImagesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ImagesDTO table 
     */
    public List<ImagesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of ImagesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting ImagesDTO table 
     */
    public List<ImagesDTO> loadByWhere(String where, 
                                      int[] fieldList, 
                                      int startRow, 
                                      int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Images " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Images ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<ImagesDTO> v = new ArrayList<ImagesDTO>();
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
     * Deletes all rows from Images table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Images table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Images " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the ImagesDTO pObject into the database.
     *
     * @param pObject the ImagesDTO pObject to be saved
     */
    public ImagesDTO save(ImagesDTO pObject) 
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
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Images (");
    
                if (pObject.isImagesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Images_key");
                    _dirtyCount++;
                }

                if (pObject.isHighResNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("highResName");
                    _dirtyCount++;
                }

                if (pObject.isMediumResNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("mediumResName");
                    _dirtyCount++;
                }

                if (pObject.isLowResNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("lowResName");
                    _dirtyCount++;
                }

                if (pObject.isServerModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("server");
                    _dirtyCount++;
                }

                if (pObject.isServerPathModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("serverPath");
                    _dirtyCount++;
                }

                if (pObject.isUrlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("url");
                    _dirtyCount++;
                }

                if (pObject.isUrlPathModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("urlPath");
                    _dirtyCount++;
                }

                if (pObject.isZoomifyPathModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("zoomifyPath");
                    _dirtyCount++;
                }

                if (pObject.isPrivateFlagModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("privateFlag");
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

                if (pObject.isImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }
    
                if (pObject.isHighResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getHighResName());
                }
    
                if (pObject.isMediumResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getMediumResName());
                }
    
                if (pObject.isLowResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getLowResName());
                }
    
                if (pObject.isServerModified()) {
                    ps.setString(++_dirtyCount, pObject.getServer());
                }
    
                if (pObject.isServerPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getServerPath());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isUrlPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrlPath());
                }
    
                if (pObject.isZoomifyPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getZoomifyPath());
                }
    
                if (pObject.isPrivateFlagModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE Images SET ");
                boolean useComma=false;

                if (pObject.isImagesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Images_key").append("=?");
                }

                if (pObject.isHighResNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("highResName").append("=?");
                }

                if (pObject.isMediumResNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("mediumResName").append("=?");
                }

                if (pObject.isLowResNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("lowResName").append("=?");
                }

                if (pObject.isServerModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("server").append("=?");
                }

                if (pObject.isServerPathModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("serverPath").append("=?");
                }

                if (pObject.isUrlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("url").append("=?");
                }

                if (pObject.isUrlPathModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("urlPath").append("=?");
                }

                if (pObject.isZoomifyPathModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("zoomifyPath").append("=?");
                }

                if (pObject.isPrivateFlagModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("privateFlag").append("=?");
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
                _sql.append(" WHERE ");
                _sql.append("Images._Images_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isImagesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }

                if (pObject.isHighResNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getHighResName());
                }

                if (pObject.isMediumResNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getMediumResName());
                }

                if (pObject.isLowResNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getLowResName());
                }

                if (pObject.isServerModified()) {
                      ps.setString(++_dirtyCount, pObject.getServer());
                }

                if (pObject.isServerPathModified()) {
                      ps.setString(++_dirtyCount, pObject.getServerPath());
                }

                if (pObject.isUrlModified()) {
                      ps.setString(++_dirtyCount, pObject.getUrl());
                }

                if (pObject.isUrlPathModified()) {
                      ps.setString(++_dirtyCount, pObject.getUrlPath());
                }

                if (pObject.isZoomifyPathModified()) {
                      ps.setString(++_dirtyCount, pObject.getZoomifyPath());
                }

                if (pObject.isPrivateFlagModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKeyOriginal());
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
     * Saves a List of ImagesDTO objects into the database.
     *
     * @param pObjects the ImagesDTO pObject table to be saved
     * @return the saved ImagesDTO List.
     */
    public List<ImagesDTO> save(List<ImagesDTO> pObjects) throws SQLException {
        for (ImagesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique ImagesDTO object from a template
     *
     * @param pObject the ImagesDTO object to look for
     * @return the pObject matching the template
     */
    public ImagesDTO loadUniqueUsingTemplate(ImagesDTO pObject) 
        throws SQLException {
         List<ImagesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of ImagesDTO objects from a template one.
     *
     * @param pObject the ImagesDTO template to look for
     * @return all the ImagesDTO objects matching the template
     */
    public List<ImagesDTO> loadUsingTemplate(ImagesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of ImagesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the ImagesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the ImagesDTO matching the template
     */
    public List<ImagesDTO> loadUsingTemplate(ImagesDTO pObject,
                                            int startRow,
                                            int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Images WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isImagesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Images_key= ?");
             }
    
             if (pObject.isHighResNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("highResName= ?");
             }
    
             if (pObject.isMediumResNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("mediumResName= ?");
             }
    
             if (pObject.isLowResNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("lowResName= ?");
             }
    
             if (pObject.isServerModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("server= ?");
             }
    
             if (pObject.isServerPathModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("serverPath= ?");
             }
    
             if (pObject.isUrlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
             }
    
             if (pObject.isUrlPathModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("urlPath= ?");
             }
    
             if (pObject.isZoomifyPathModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("zoomifyPath= ?");
             }
    
             if (pObject.isPrivateFlagModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("privateFlag= ?");
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
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isImagesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
             }
    
             if (pObject.isHighResNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getHighResName());
             }
    
             if (pObject.isMediumResNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getMediumResName());
             }
    
             if (pObject.isLowResNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getLowResName());
             }
    
             if (pObject.isServerModified()) {
                 ps.setString(++_dirtyCount, pObject.getServer());
             }
    
             if (pObject.isServerPathModified()) {
                 ps.setString(++_dirtyCount, pObject.getServerPath());
             }
    
             if (pObject.isUrlModified()) {
                 ps.setString(++_dirtyCount, pObject.getUrl());
             }
    
             if (pObject.isUrlPathModified()) {
                 ps.setString(++_dirtyCount, pObject.getUrlPath());
             }
    
             if (pObject.isZoomifyPathModified()) {
                 ps.setString(++_dirtyCount, pObject.getZoomifyPath());
             }
    
             if (pObject.isPrivateFlagModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a ImagesDTO template.
     *
     * @param pObject the ImagesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(ImagesDTO pObject) throws SQLException {
        if (pObject.isImagesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getImagesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Images WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isImagesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Images_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isHighResNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("highResName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMediumResNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("mediumResName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isLowResNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("lowResName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isServerInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("server").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isServerPathInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("serverPath").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUrlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("url").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUrlPathInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("urlPath").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isZoomifyPathInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("zoomifyPath").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPrivateFlagInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("privateFlag").append("=?");
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
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isImagesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
            }
    
            if (pObject.isHighResNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getHighResName());
            }
    
            if (pObject.isMediumResNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getMediumResName());
            }
    
            if (pObject.isLowResNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getLowResName());
            }
    
            if (pObject.isServerInitialized()) {
                ps.setString(++_dirtyCount, pObject.getServer());
            }
    
            if (pObject.isServerPathInitialized()) {
                ps.setString(++_dirtyCount, pObject.getServerPath());
            }
    
            if (pObject.isUrlInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUrl());
            }
    
            if (pObject.isUrlPathInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUrlPath());
            }
    
            if (pObject.isZoomifyPathInitialized()) {
                ps.setString(++_dirtyCount, pObject.getZoomifyPath());
            }
    
            if (pObject.isPrivateFlagInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
     * Retrieves a List of PathologyDTO objects using the relation table PathologyImages given a ImagesDTO object.
     *
     * @param pObject the ImagesDTO pObject to be used
     * @return a List of PathologyDTO objects
     */
    // MANY TO MANY
    public List<PathologyDTO> loadPathologyViaPathologyImages(ImagesDTO pObject) 
        throws SQLException {
        return loadPathologyViaPathologyImages(pObject, 1, -1);
    }

    /**
     * Retrieves a List of PathologyDTO objects using the relation table PathologyImages given a ImagesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the ImagesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyDTO objects
     */
    // MANY TO MANY
    public List<PathologyDTO> loadPathologyViaPathologyImages(ImagesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Pathology, ");
        strSQL.append("        PathologyImages");
        strSQL.append("  where PathologyImages._Images_key = ?");
        strSQL.append("    and PathologyImages._Pathology_key = Pathology._Pathology_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getImagesKey());
             return PathologyDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of FixativeDTO objects using the relation table PathologyImages given a ImagesDTO object.
     *
     * @param pObject the ImagesDTO pObject to be used
     * @return a List of FixativeDTO objects
     */
    // MANY TO MANY
    public List<FixativeDTO> loadFixativeViaPathologyImages(ImagesDTO pObject) 
        throws SQLException {
        return loadFixativeViaPathologyImages(pObject, 1, -1);
    }

    /**
     * Retrieves a List of FixativeDTO objects using the relation table PathologyImages given a ImagesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the ImagesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of FixativeDTO objects
     */
    // MANY TO MANY
    public List<FixativeDTO> loadFixativeViaPathologyImages(ImagesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Fixative, ");
        strSQL.append("        PathologyImages");
        strSQL.append("  where PathologyImages._Images_key = ?");
        strSQL.append("    and PathologyImages._Fixative_key = Fixative._Fixative_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getImagesKey());
             return FixativeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Images.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Images";
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
                    case ID__IMAGES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_HIGHRESNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_MEDIUMRESNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_LOWRESNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SERVER:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SERVERPATH:
                        iReturn = rs.getString(1);
                        break;
                    case ID_URL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_URLPATH:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ZOOMIFYPATH:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PRIVATEFLAG:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
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
     * Retrieves the min value for a specified column of the table Images.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Images";
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
                    case ID__IMAGES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_HIGHRESNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_MEDIUMRESNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_LOWRESNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SERVER:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SERVERPATH:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_URL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_URLPATH:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ZOOMIFYPATH:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PRIVATEFLAG:
                        iReturn = (Long)rs.getObject(1);
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
     * Retrieves the number of rows of the table Images.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Images with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Images " + where;
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
     * Retrieves the number of rows of the table Images with a prepared statement.
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
     * Looks for the number of elements of a specific ImagesDTO pObject given a c
     *
     * @param pObject the ImagesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(ImagesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Images WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isImagesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Images_key= ?");
                }
    
                if (pObject.isHighResNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("highResName= ?");
                }
    
                if (pObject.isMediumResNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("mediumResName= ?");
                }
    
                if (pObject.isLowResNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("lowResName= ?");
                }
    
                if (pObject.isServerModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("server= ?");
                }
    
                if (pObject.isServerPathModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("serverPath= ?");
                }
    
                if (pObject.isUrlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
                }
    
                if (pObject.isUrlPathModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("urlPath= ?");
                }
    
                if (pObject.isZoomifyPathModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("zoomifyPath= ?");
                }
    
                if (pObject.isPrivateFlagModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("privateFlag= ?");
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
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isImagesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getImagesKey());
                }
    
                if (pObject.isHighResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getHighResName());
                }
    
                if (pObject.isMediumResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getMediumResName());
                }
    
                if (pObject.isLowResNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getLowResName());
                }
    
                if (pObject.isServerModified()) {
                    ps.setString(++_dirtyCount, pObject.getServer());
                }
    
                if (pObject.isServerPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getServerPath());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isUrlPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrlPath());
                }
    
                if (pObject.isZoomifyPathModified()) {
                    ps.setString(++_dirtyCount, pObject.getZoomifyPath());
                }
    
                if (pObject.isPrivateFlagModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPrivateFlag());
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
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the Images on a ImagesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ImagesDTO pObject
     */
    public ImagesDTO decodeRow(ResultSet rs) throws SQLException {
        ImagesDTO pObject = createImagesDTO();
        pObject.setImagesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setHighResName(rs.getString(2));
        pObject.setMediumResName(rs.getString(3));
        pObject.setLowResName(rs.getString(4));
        pObject.setServer(rs.getString(5));
        pObject.setServerPath(rs.getString(6));
        pObject.setUrl(rs.getString(7));
        pObject.setUrlPath(rs.getString(8));
        pObject.setZoomifyPath(rs.getString(9));
        pObject.setPrivateFlag(DAOManagerMTB.getLong(rs, 10));
        pObject.setDescription(rs.getString(11));
        pObject.setCreateUser(rs.getString(12));
        pObject.setCreateDate(rs.getTimestamp(13));
        pObject.setUpdateUser(rs.getString(14));
        pObject.setUpdateDate(rs.getTimestamp(15));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Images table on a ImagesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ImagesDTO pObject
     */
    public ImagesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        ImagesDTO pObject = createImagesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__IMAGES_KEY:
                    ++pos;
                    pObject.setImagesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_HIGHRESNAME:
                    ++pos;
                    pObject.setHighResName(rs.getString(pos));
                    break;
                case ID_MEDIUMRESNAME:
                    ++pos;
                    pObject.setMediumResName(rs.getString(pos));
                    break;
                case ID_LOWRESNAME:
                    ++pos;
                    pObject.setLowResName(rs.getString(pos));
                    break;
                case ID_SERVER:
                    ++pos;
                    pObject.setServer(rs.getString(pos));
                    break;
                case ID_SERVERPATH:
                    ++pos;
                    pObject.setServerPath(rs.getString(pos));
                    break;
                case ID_URL:
                    ++pos;
                    pObject.setUrl(rs.getString(pos));
                    break;
                case ID_URLPATH:
                    ++pos;
                    pObject.setUrlPath(rs.getString(pos));
                    break;
                case ID_ZOOMIFYPATH:
                    ++pos;
                    pObject.setZoomifyPath(rs.getString(pos));
                    break;
                case ID_PRIVATEFLAG:
                    ++pos;
                    pObject.setPrivateFlag(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of ImagesDTO objects
     */
    public List<ImagesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of ImagesDTO objects
     */
    public List<ImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of ImagesDTO objects
     */
    public List<ImagesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<ImagesDTO> v = new ArrayList<ImagesDTO>();
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
