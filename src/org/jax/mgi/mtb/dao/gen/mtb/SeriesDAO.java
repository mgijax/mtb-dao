
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 

/**
 * Handles database calls for the Series table.
 */
public class SeriesDAO
// extends+ 

// extends- 
{


    // -------------------------------------------------------------- Constants

    /**
     * Column _series_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__SERIES_KEY = 0;
    public static final int TYPE__SERIES_KEY = Types.DECIMAL;
    public static final String NAME__SERIES_KEY = "_series_key";

    /**
     * Column id of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ID = 1;
    public static final int TYPE_ID = Types.VARCHAR;
    public static final String NAME_ID = "id";

    /**
     * Column _siteinfo_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__SITEINFO_KEY = 2;
    public static final int TYPE__SITEINFO_KEY = Types.DECIMAL;
    public static final String NAME__SITEINFO_KEY = "_siteinfo_key";

    /**
     * Column summary of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SUMMARY = 3;
    public static final int TYPE_SUMMARY = Types.VARCHAR;
    public static final String NAME_SUMMARY = "summary";

    /**
     * Column title of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TITLE = 4;
    public static final int TYPE_TITLE = Types.VARCHAR;
    public static final String NAME_TITLE = "title";

    /**
     * Column reference of type Types.VARCHAR mapped to String.
     */
    public static final int ID_REFERENCE = 5;
    public static final int TYPE_REFERENCE = Types.VARCHAR;
    public static final String NAME_REFERENCE = "reference";

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


    private static final String TABLE_NAME = "Series";

    /**
     * Create an array of type string containing all the fields of the Series table.
     */
    private static final String[] FIELD_NAMES = {
        "Series._series_key"
        ,"Series.id"
        ,"Series._siteinfo_key"
        ,"Series.summary"
        ,"Series.title"
        ,"Series.reference"
        ,"Series.create_user"
        ,"Series.create_date"
        ,"Series.update_user"
        ,"Series.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Series table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Series table.
     */
    private static final String ALL_FIELDS = "Series._series_key"
                            + ",Series.id"
                            + ",Series._siteinfo_key"
                            + ",Series.summary"
                            + ",Series.title"
                            + ",Series.reference"
                            + ",Series.create_user"
                            + ",Series.create_date"
                            + ",Series.update_user"
                            + ",Series.update_date";


    // ----------------------------------------------------- Instance Variables

    private static SeriesDAO singleton = new SeriesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the SeriesDAO singleton.
     *
     * @return SeriesDAO 
     */
    synchronized public static SeriesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own SeriesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(SeriesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new SeriesDTO instance.
     *
     * @return the new SeriesDTO 
     */
    public SeriesDTO createSeriesDTO() {
        return new SeriesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a SeriesDTO from the Series using its key fields.
     *
     * @return a unique SeriesDTO 
     */
    public SeriesDTO loadByPrimaryKey(Long seriesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Series WHERE Series._series_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, seriesKey);
            List<SeriesDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long seriesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Series WHERE Series._series_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, seriesKey);
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
     * Loads a List of SeriesDTO objects from the Series table using its _siteinfo_key field.
     *
     * @return a List of SeriesDTO objects
     */
    public List<SeriesDTO> loadBySiteinfoKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Series WHERE _siteinfo_key=?",
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
     * Deletes from the Series table by _siteinfo_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteBySiteinfoKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Series WHERE _siteinfo_key=?");
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
     * Retrieves the SiteInfoDTO object from the Series._SiteInfo_key field.
     *
     * @param pObject the SeriesDTO 
     * @return the associated SiteInfoDTO pObject
     */
    public SiteInfoDTO getSiteInfoDTO(SeriesDTO pObject) 
    throws SQLException {
        SiteInfoDTO other = SiteInfoDAO.getInstance().createSiteInfoDTO();
        other.setSiteInfoKey(pObject.getSiteinfoKey());
        return SiteInfoDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the SeriesDTO object to the SiteInfoDTO object.
     *
     * @param pObject the SeriesDTO object to use
     * @param pObjectToBeSet the SiteInfoDTO object to associate to the SeriesDTO 
     * @return the associated SiteInfoDTO pObject
     */
    // SET IMPORTED
    public SeriesDTO setSiteInfoDTO(SeriesDTO pObject,SiteInfoDTO pObjectToBeSet) {
        pObject.setSiteinfoKey(pObjectToBeSet.getSiteInfoKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Series.
     *
     * @return a List of SeriesDAO objects
     */
    public List<SeriesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Series, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SeriesDAO objects
     */
    public List<SeriesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Series",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of SeriesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting SeriesDTO table 
     */
    public List<SeriesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of SeriesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting SeriesDTO table 
     */
    public List<SeriesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of SeriesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting SeriesDTO table 
     */
    public List<SeriesDTO> loadByWhere(String where, 
                                      int[] fieldList, 
                                      int startRow, 
                                      int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Series " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Series ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<SeriesDTO> v = new ArrayList<SeriesDTO>();
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
     * Deletes all rows from Series table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Series table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Series " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the SeriesDTO pObject into the database.
     *
     * @param pObject the SeriesDTO pObject to be saved
     */
    public SeriesDTO save(SeriesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getSeriesKey() == null) {
            Object obj = max(ID__SERIES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setSeriesKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Series (");
    
                if (pObject.isSeriesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_series_key");
                    _dirtyCount++;
                }

                if (pObject.isIdModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("id");
                    _dirtyCount++;
                }

                if (pObject.isSiteinfoKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_siteinfo_key");
                    _dirtyCount++;
                }

                if (pObject.isSummaryModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("summary");
                    _dirtyCount++;
                }

                if (pObject.isTitleModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("title");
                    _dirtyCount++;
                }

                if (pObject.isReferenceModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("reference");
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

                if (pObject.isSeriesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKey());
                }
    
                if (pObject.isIdModified()) {
                    ps.setString(++_dirtyCount, pObject.getId());
                }
    
                if (pObject.isSiteinfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteinfoKey());
                }
    
                if (pObject.isSummaryModified()) {
                    ps.setString(++_dirtyCount, pObject.getSummary());
                }
    
                if (pObject.isTitleModified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle());
                }
    
                if (pObject.isReferenceModified()) {
                    ps.setString(++_dirtyCount, pObject.getReference());
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
                _sql = new StringBuffer("UPDATE Series SET ");
                boolean useComma=false;

                if (pObject.isSeriesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_series_key").append("=?");
                }

                if (pObject.isIdModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("id").append("=?");
                }

                if (pObject.isSiteinfoKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_siteinfo_key").append("=?");
                }

                if (pObject.isSummaryModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("summary").append("=?");
                }

                if (pObject.isTitleModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("title").append("=?");
                }

                if (pObject.isReferenceModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("reference").append("=?");
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
                _sql.append("Series._series_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isSeriesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKey());
                }

                if (pObject.isIdModified()) {
                      ps.setString(++_dirtyCount, pObject.getId());
                }

                if (pObject.isSiteinfoKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteinfoKey());
                }

                if (pObject.isSummaryModified()) {
                      ps.setString(++_dirtyCount, pObject.getSummary());
                }

                if (pObject.isTitleModified()) {
                      ps.setString(++_dirtyCount, pObject.getTitle());
                }

                if (pObject.isReferenceModified()) {
                      ps.setString(++_dirtyCount, pObject.getReference());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKeyOriginal());
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
     * Saves a List of SeriesDTO objects into the database.
     *
     * @param pObjects the SeriesDTO pObject table to be saved
     * @return the saved SeriesDTO List.
     */
    public List<SeriesDTO> save(List<SeriesDTO> pObjects) throws SQLException {
        for (SeriesDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique SeriesDTO object from a template
     *
     * @param pObject the SeriesDTO object to look for
     * @return the pObject matching the template
     */
    public SeriesDTO loadUniqueUsingTemplate(SeriesDTO pObject) 
        throws SQLException {
         List<SeriesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of SeriesDTO objects from a template one.
     *
     * @param pObject the SeriesDTO template to look for
     * @return all the SeriesDTO objects matching the template
     */
    public List<SeriesDTO> loadUsingTemplate(SeriesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of SeriesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the SeriesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the SeriesDTO matching the template
     */
    public List<SeriesDTO> loadUsingTemplate(SeriesDTO pObject,
                                            int startRow,
                                            int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Series WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isSeriesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_series_key= ?");
             }
    
             if (pObject.isIdModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("id= ?");
             }
    
             if (pObject.isSiteinfoKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_siteinfo_key= ?");
             }
    
             if (pObject.isSummaryModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("summary= ?");
             }
    
             if (pObject.isTitleModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title= ?");
             }
    
             if (pObject.isReferenceModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reference= ?");
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
    
             if (pObject.isSeriesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKey());
             }
    
             if (pObject.isIdModified()) {
                 ps.setString(++_dirtyCount, pObject.getId());
             }
    
             if (pObject.isSiteinfoKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteinfoKey());
             }
    
             if (pObject.isSummaryModified()) {
                 ps.setString(++_dirtyCount, pObject.getSummary());
             }
    
             if (pObject.isTitleModified()) {
                 ps.setString(++_dirtyCount, pObject.getTitle());
             }
    
             if (pObject.isReferenceModified()) {
                 ps.setString(++_dirtyCount, pObject.getReference());
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
     * Deletes rows using a SeriesDTO template.
     *
     * @param pObject the SeriesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(SeriesDTO pObject) throws SQLException {
        if (pObject.isSeriesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getSeriesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Series WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isSeriesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_series_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isIdInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("id").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSiteinfoKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_siteinfo_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSummaryInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("summary").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTitleInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("title").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReferenceInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("reference").append("=?");
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
    
            if (pObject.isSeriesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKey());
            }
    
            if (pObject.isIdInitialized()) {
                ps.setString(++_dirtyCount, pObject.getId());
            }
    
            if (pObject.isSiteinfoKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteinfoKey());
            }
    
            if (pObject.isSummaryInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSummary());
            }
    
            if (pObject.isTitleInitialized()) {
                ps.setString(++_dirtyCount, pObject.getTitle());
            }
    
            if (pObject.isReferenceInitialized()) {
                ps.setString(++_dirtyCount, pObject.getReference());
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
     * Retrieves a List of SampleDTO objects using the relation table SeriesSampleAssoc given a SeriesDTO object.
     *
     * @param pObject the SeriesDTO pObject to be used
     * @return a List of SampleDTO objects
     */
    // MANY TO MANY
    public List<SampleDTO> loadSampleViaSeriesSampleAssoc(SeriesDTO pObject) 
        throws SQLException {
        return loadSampleViaSeriesSampleAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of SampleDTO objects using the relation table SeriesSampleAssoc given a SeriesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the SeriesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SampleDTO objects
     */
    // MANY TO MANY
    public List<SampleDTO> loadSampleViaSeriesSampleAssoc(SeriesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Sample, ");
        strSQL.append("        SeriesSampleAssoc");
        strSQL.append("  where SeriesSampleAssoc._series_key = ?");
        strSQL.append("    and SeriesSampleAssoc._sample_key = Sample._sample_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getSeriesKey());
             return SampleDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Series.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Series";
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
                    case ID__SERIES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_ID:
                        iReturn = rs.getString(1);
                        break;
                    case ID__SITEINFO_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_SUMMARY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TITLE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_REFERENCE:
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
     * Retrieves the min value for a specified column of the table Series.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Series";
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
                    case ID__SERIES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_ID:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__SITEINFO_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_SUMMARY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TITLE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_REFERENCE:
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
     * Retrieves the number of rows of the table Series.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Series with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Series " + where;
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
     * Retrieves the number of rows of the table Series with a prepared statement.
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
     * Looks for the number of elements of a specific SeriesDTO pObject given a c
     *
     * @param pObject the SeriesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(SeriesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Series WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isSeriesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_series_key= ?");
                }
    
                if (pObject.isIdModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("id= ?");
                }
    
                if (pObject.isSiteinfoKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_siteinfo_key= ?");
                }
    
                if (pObject.isSummaryModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("summary= ?");
                }
    
                if (pObject.isTitleModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title= ?");
                }
    
                if (pObject.isReferenceModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reference= ?");
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
    
                if (pObject.isSeriesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSeriesKey());
                }
    
                if (pObject.isIdModified()) {
                    ps.setString(++_dirtyCount, pObject.getId());
                }
    
                if (pObject.isSiteinfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteinfoKey());
                }
    
                if (pObject.isSummaryModified()) {
                    ps.setString(++_dirtyCount, pObject.getSummary());
                }
    
                if (pObject.isTitleModified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle());
                }
    
                if (pObject.isReferenceModified()) {
                    ps.setString(++_dirtyCount, pObject.getReference());
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
     * Transforms a ResultSet iterating on the Series on a SeriesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting SeriesDTO pObject
     */
    public SeriesDTO decodeRow(ResultSet rs) throws SQLException {
        SeriesDTO pObject = createSeriesDTO();
        pObject.setSeriesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setId(rs.getString(2));
        pObject.setSiteinfoKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setSummary(rs.getString(4));
        pObject.setTitle(rs.getString(5));
        pObject.setReference(rs.getString(6));
        pObject.setCreateUser(rs.getString(7));
        pObject.setCreateDate(rs.getTimestamp(8));
        pObject.setUpdateUser(rs.getString(9));
        pObject.setUpdateDate(rs.getTimestamp(10));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Series table on a SeriesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting SeriesDTO pObject
     */
    public SeriesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        SeriesDTO pObject = createSeriesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__SERIES_KEY:
                    ++pos;
                    pObject.setSeriesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_ID:
                    ++pos;
                    pObject.setId(rs.getString(pos));
                    break;
                case ID__SITEINFO_KEY:
                    ++pos;
                    pObject.setSiteinfoKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_SUMMARY:
                    ++pos;
                    pObject.setSummary(rs.getString(pos));
                    break;
                case ID_TITLE:
                    ++pos;
                    pObject.setTitle(rs.getString(pos));
                    break;
                case ID_REFERENCE:
                    ++pos;
                    pObject.setReference(rs.getString(pos));
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
     * @return a List of SeriesDTO objects
     */
    public List<SeriesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of SeriesDTO objects
     */
    public List<SeriesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of SeriesDTO objects
     */
    public List<SeriesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<SeriesDTO> v = new ArrayList<SeriesDTO>();
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
