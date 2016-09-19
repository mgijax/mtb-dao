
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 

/**
 * Handles database calls for the Sample table.
 */
public class SampleDAO
// extends+ 

// extends- 
{


    // -------------------------------------------------------------- Constants

    /**
     * Column _sample_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__SAMPLE_KEY = 0;
    public static final int TYPE__SAMPLE_KEY = Types.DECIMAL;
    public static final String NAME__SAMPLE_KEY = "_sample_key";

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
     * Column platform of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PLATFORM = 5;
    public static final int TYPE_PLATFORM = Types.VARCHAR;
    public static final String NAME_PLATFORM = "platform";

    /**
     * Column isControl of type Types.BIT mapped to Boolean.
     */
    public static final int ID_ISCONTROL = 6;
    public static final int TYPE_ISCONTROL = Types.BIT;
    public static final String NAME_ISCONTROL = "isControl";

    /**
     * Column url of type Types.VARCHAR mapped to String.
     */
    public static final int ID_URL = 7;
    public static final int TYPE_URL = Types.VARCHAR;
    public static final String NAME_URL = "url";

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


    private static final String TABLE_NAME = "Sample";

    /**
     * Create an array of type string containing all the fields of the Sample table.
     */
    private static final String[] FIELD_NAMES = {
        "Sample._sample_key"
        ,"Sample.id"
        ,"Sample._siteinfo_key"
        ,"Sample.summary"
        ,"Sample.title"
        ,"Sample.platform"
        ,"Sample.isControl"
        ,"Sample.url"
        ,"Sample.create_user"
        ,"Sample.create_date"
        ,"Sample.update_user"
        ,"Sample.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Sample table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"Boolean"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Sample table.
     */
    private static final String ALL_FIELDS = "Sample._sample_key"
                            + ",Sample.id"
                            + ",Sample._siteinfo_key"
                            + ",Sample.summary"
                            + ",Sample.title"
                            + ",Sample.platform"
                            + ",Sample.isControl"
                            + ",Sample.url"
                            + ",Sample.create_user"
                            + ",Sample.create_date"
                            + ",Sample.update_user"
                            + ",Sample.update_date";


    // ----------------------------------------------------- Instance Variables

    private static SampleDAO singleton = new SampleDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the SampleDAO singleton.
     *
     * @return SampleDAO 
     */
    synchronized public static SampleDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own SampleDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(SampleDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new SampleDTO instance.
     *
     * @return the new SampleDTO 
     */
    public SampleDTO createSampleDTO() {
        return new SampleDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a SampleDTO from the Sample using its key fields.
     *
     * @return a unique SampleDTO 
     */
    public SampleDTO loadByPrimaryKey(Long sampleKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Sample WHERE Sample._sample_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, sampleKey);
            List<SampleDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long sampleKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Sample WHERE Sample._sample_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, sampleKey);
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
     * Loads a List of SampleDTO objects from the Sample table using its _siteinfo_key field.
     *
     * @return a List of SampleDTO objects
     */
    public List<SampleDTO> loadBySiteinfoKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Sample WHERE _siteinfo_key=?",
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
     * Deletes from the Sample table by _siteinfo_key field.
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
            ps = c.prepareStatement("DELETE FROM Sample WHERE _siteinfo_key=?");
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
     * Retrieves the SiteInfoDTO object from the Sample._SiteInfo_key field.
     *
     * @param pObject the SampleDTO 
     * @return the associated SiteInfoDTO pObject
     */
    public SiteInfoDTO getSiteInfoDTO(SampleDTO pObject) 
    throws SQLException {
        SiteInfoDTO other = SiteInfoDAO.getInstance().createSiteInfoDTO();
        other.setSiteInfoKey(pObject.getSiteinfoKey());
        return SiteInfoDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the SampleDTO object to the SiteInfoDTO object.
     *
     * @param pObject the SampleDTO object to use
     * @param pObjectToBeSet the SiteInfoDTO object to associate to the SampleDTO 
     * @return the associated SiteInfoDTO pObject
     */
    // SET IMPORTED
    public SampleDTO setSiteInfoDTO(SampleDTO pObject,SiteInfoDTO pObjectToBeSet) {
        pObject.setSiteinfoKey(pObjectToBeSet.getSiteInfoKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Sample.
     *
     * @return a List of SampleDAO objects
     */
    public List<SampleDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Sample, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SampleDAO objects
     */
    public List<SampleDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Sample",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of SampleDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting SampleDTO table 
     */
    public List<SampleDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of SampleDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting SampleDTO table 
     */
    public List<SampleDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of SampleDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting SampleDTO table 
     */
    public List<SampleDTO> loadByWhere(String where, 
                                      int[] fieldList, 
                                      int startRow, 
                                      int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Sample " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Sample ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<SampleDTO> v = new ArrayList<SampleDTO>();
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
     * Deletes all rows from Sample table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Sample table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Sample " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the SampleDTO pObject into the database.
     *
     * @param pObject the SampleDTO pObject to be saved
     */
    public SampleDTO save(SampleDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getSampleKey() == null) {
            Object obj = max(ID__SAMPLE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setSampleKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Sample (");
    
                if (pObject.isSampleKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_sample_key");
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

                if (pObject.isPlatformModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("platform");
                    _dirtyCount++;
                }

                if (pObject.isIsControlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("isControl");
                    _dirtyCount++;
                }

                if (pObject.isUrlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("url");
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

                if (pObject.isSampleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
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
    
                if (pObject.isPlatformModified()) {
                    ps.setString(++_dirtyCount, pObject.getPlatform());
                }
    
                if (pObject.isIsControlModified()) {
                    DAOManagerMTB.setBoolean(ps, ++_dirtyCount, pObject.getIsControl());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
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
                _sql = new StringBuffer("UPDATE Sample SET ");
                boolean useComma=false;

                if (pObject.isSampleKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_sample_key").append("=?");
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

                if (pObject.isPlatformModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("platform").append("=?");
                }

                if (pObject.isIsControlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("isControl").append("=?");
                }

                if (pObject.isUrlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("url").append("=?");
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
                _sql.append("Sample._sample_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isSampleKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
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

                if (pObject.isPlatformModified()) {
                      ps.setString(++_dirtyCount, pObject.getPlatform());
                }

                if (pObject.isIsControlModified()) {
                      DAOManagerMTB.setBoolean(ps, ++_dirtyCount, pObject.getIsControl());
                }

                if (pObject.isUrlModified()) {
                      ps.setString(++_dirtyCount, pObject.getUrl());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKeyOriginal());
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
     * Saves a List of SampleDTO objects into the database.
     *
     * @param pObjects the SampleDTO pObject table to be saved
     * @return the saved SampleDTO List.
     */
    public List<SampleDTO> save(List<SampleDTO> pObjects) throws SQLException {
        for (SampleDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique SampleDTO object from a template
     *
     * @param pObject the SampleDTO object to look for
     * @return the pObject matching the template
     */
    public SampleDTO loadUniqueUsingTemplate(SampleDTO pObject) 
        throws SQLException {
         List<SampleDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of SampleDTO objects from a template one.
     *
     * @param pObject the SampleDTO template to look for
     * @return all the SampleDTO objects matching the template
     */
    public List<SampleDTO> loadUsingTemplate(SampleDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of SampleDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the SampleDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the SampleDTO matching the template
     */
    public List<SampleDTO> loadUsingTemplate(SampleDTO pObject,
                                            int startRow,
                                            int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Sample WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isSampleKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sample_key= ?");
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
    
             if (pObject.isPlatformModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("platform= ?");
             }
    
             if (pObject.isIsControlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("isControl= ?");
             }
    
             if (pObject.isUrlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
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
    
             if (pObject.isSampleKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
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
    
             if (pObject.isPlatformModified()) {
                 ps.setString(++_dirtyCount, pObject.getPlatform());
             }
    
             if (pObject.isIsControlModified()) {
                 DAOManagerMTB.setBoolean(ps, ++_dirtyCount, pObject.getIsControl());
             }
    
             if (pObject.isUrlModified()) {
                 ps.setString(++_dirtyCount, pObject.getUrl());
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
     * Deletes rows using a SampleDTO template.
     *
     * @param pObject the SampleDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(SampleDTO pObject) throws SQLException {
        if (pObject.isSampleKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getSampleKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Sample WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isSampleKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_sample_key").append("=?");
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
    
            if (pObject.isPlatformInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("platform").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isIsControlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("isControl").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUrlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("url").append("=?");
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
    
            if (pObject.isSampleKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
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
    
            if (pObject.isPlatformInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPlatform());
            }
    
            if (pObject.isIsControlInitialized()) {
                DAOManagerMTB.setBoolean(ps, ++_dirtyCount, pObject.getIsControl());
            }
    
            if (pObject.isUrlInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUrl());
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
     * Retrieves a List of MTBTypesDTO objects using the relation table SampleAssoc given a SampleDTO object.
     *
     * @param pObject the SampleDTO pObject to be used
     * @return a List of MTBTypesDTO objects
     */
    // MANY TO MANY
    public List<MTBTypesDTO> loadMTBTypesViaSampleAssoc(SampleDTO pObject) 
        throws SQLException {
        return loadMTBTypesViaSampleAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of MTBTypesDTO objects using the relation table SampleAssoc given a SampleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the SampleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MTBTypesDTO objects
     */
    // MANY TO MANY
    public List<MTBTypesDTO> loadMTBTypesViaSampleAssoc(SampleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from MTBTypes, ");
        strSQL.append("        SampleAssoc");
        strSQL.append("  where SampleAssoc._sample_key = ?");
        strSQL.append("    and SampleAssoc._MTBTypes_key = MTBTypes._MTBTypes_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getSampleKey());
             return MTBTypesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of SeriesDTO objects using the relation table SeriesSampleAssoc given a SampleDTO object.
     *
     * @param pObject the SampleDTO pObject to be used
     * @return a List of SeriesDTO objects
     */
    // MANY TO MANY
    public List<SeriesDTO> loadSeriesViaSeriesSampleAssoc(SampleDTO pObject) 
        throws SQLException {
        return loadSeriesViaSeriesSampleAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of SeriesDTO objects using the relation table SeriesSampleAssoc given a SampleDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the SampleDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SeriesDTO objects
     */
    // MANY TO MANY
    public List<SeriesDTO> loadSeriesViaSeriesSampleAssoc(SampleDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Series, ");
        strSQL.append("        SeriesSampleAssoc");
        strSQL.append("  where SeriesSampleAssoc._sample_key = ?");
        strSQL.append("    and SeriesSampleAssoc._series_key = Series._series_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getSampleKey());
             return SeriesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Sample.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Sample";
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
                    case ID__SAMPLE_KEY:
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
                    case ID_PLATFORM:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ISCONTROL:
                        iReturn = DAOManagerMTB.getBoolean(rs, 1);
                        break;
                    case ID_URL:
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
     * Retrieves the min value for a specified column of the table Sample.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Sample";
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
                    case ID__SAMPLE_KEY:
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
                    case ID_PLATFORM:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ISCONTROL:
                        iReturn = (Boolean)rs.getObject(1);
                        break;
                    case ID_URL:
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
     * Retrieves the number of rows of the table Sample.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Sample with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Sample " + where;
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
     * Retrieves the number of rows of the table Sample with a prepared statement.
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
     * Looks for the number of elements of a specific SampleDTO pObject given a c
     *
     * @param pObject the SampleDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(SampleDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Sample WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isSampleKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_sample_key= ?");
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
    
                if (pObject.isPlatformModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("platform= ?");
                }
    
                if (pObject.isIsControlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("isControl= ?");
                }
    
                if (pObject.isUrlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
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
    
                if (pObject.isSampleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSampleKey());
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
    
                if (pObject.isPlatformModified()) {
                    ps.setString(++_dirtyCount, pObject.getPlatform());
                }
    
                if (pObject.isIsControlModified()) {
                    DAOManagerMTB.setBoolean(ps, ++_dirtyCount, pObject.getIsControl());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
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
     * Transforms a ResultSet iterating on the Sample on a SampleDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting SampleDTO pObject
     */
    public SampleDTO decodeRow(ResultSet rs) throws SQLException {
        SampleDTO pObject = createSampleDTO();
        pObject.setSampleKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setId(rs.getString(2));
        pObject.setSiteinfoKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setSummary(rs.getString(4));
        pObject.setTitle(rs.getString(5));
        pObject.setPlatform(rs.getString(6));
        pObject.setIsControl(DAOManagerMTB.getBoolean(rs, 7));
        pObject.setUrl(rs.getString(8));
        pObject.setCreateUser(rs.getString(9));
        pObject.setCreateDate(rs.getTimestamp(10));
        pObject.setUpdateUser(rs.getString(11));
        pObject.setUpdateDate(rs.getTimestamp(12));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Sample table on a SampleDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting SampleDTO pObject
     */
    public SampleDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        SampleDTO pObject = createSampleDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__SAMPLE_KEY:
                    ++pos;
                    pObject.setSampleKey(DAOManagerMTB.getLong(rs, pos));
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
                case ID_PLATFORM:
                    ++pos;
                    pObject.setPlatform(rs.getString(pos));
                    break;
                case ID_ISCONTROL:
                    ++pos;
                    pObject.setIsControl(DAOManagerMTB.getBoolean(rs, pos));
                    break;
                case ID_URL:
                    ++pos;
                    pObject.setUrl(rs.getString(pos));
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
     * @return a List of SampleDTO objects
     */
    public List<SampleDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of SampleDTO objects
     */
    public List<SampleDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of SampleDTO objects
     */
    public List<SampleDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<SampleDTO> v = new ArrayList<SampleDTO>();
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
