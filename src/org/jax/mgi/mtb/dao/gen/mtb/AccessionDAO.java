
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Accession table.
 */
public class AccessionDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Accession_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ACCESSION_KEY = 0;
    public static final int TYPE__ACCESSION_KEY = Types.NUMERIC;
    public static final String NAME__ACCESSION_KEY = "_Accession_key";

    /**
     * Column accID of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ACCID = 1;
    public static final int TYPE_ACCID = Types.VARCHAR;
    public static final String NAME_ACCID = "accID";

    /**
     * Column prefixPart of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PREFIXPART = 2;
    public static final int TYPE_PREFIXPART = Types.VARCHAR;
    public static final String NAME_PREFIXPART = "prefixPart";

    /**
     * Column numericPart of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_NUMERICPART = 3;
    public static final int TYPE_NUMERICPART = Types.NUMERIC;
    public static final String NAME_NUMERICPART = "numericPart";

    /**
     * Column _Object_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__OBJECT_KEY = 4;
    public static final int TYPE__OBJECT_KEY = Types.NUMERIC;
    public static final String NAME__OBJECT_KEY = "_Object_key";

    /**
     * Column _MTBTypes_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__MTBTYPES_KEY = 5;
    public static final int TYPE__MTBTYPES_KEY = Types.NUMERIC;
    public static final String NAME__MTBTYPES_KEY = "_MTBTypes_key";

    /**
     * Column _SiteInfo_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__SITEINFO_KEY = 6;
    public static final int TYPE__SITEINFO_KEY = Types.NUMERIC;
    public static final String NAME__SITEINFO_KEY = "_SiteInfo_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 7;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 8;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 9;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 10;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "Accession";

    /**
     * Create an array of type string containing all the fields of the Accession table.
     */
    private static final String[] FIELD_NAMES = {
        "Accession._Accession_key"
        ,"Accession.accID"
        ,"Accession.prefixPart"
        ,"Accession.numericPart"
        ,"Accession._Object_key"
        ,"Accession._MTBTypes_key"
        ,"Accession._SiteInfo_key"
        ,"Accession.create_user"
        ,"Accession.create_date"
        ,"Accession.update_user"
        ,"Accession.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Accession table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Accession table.
     */
    private static final String ALL_FIELDS = "Accession._Accession_key"
                            + ",Accession.accID"
                            + ",Accession.prefixPart"
                            + ",Accession.numericPart"
                            + ",Accession._Object_key"
                            + ",Accession._MTBTypes_key"
                            + ",Accession._SiteInfo_key"
                            + ",Accession.create_user"
                            + ",Accession.create_date"
                            + ",Accession.update_user"
                            + ",Accession.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AccessionDAO singleton = new AccessionDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AccessionDAO singleton.
     *
     * @return AccessionDAO 
     */
    synchronized public static AccessionDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AccessionDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AccessionDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AccessionDTO instance.
     *
     * @return the new AccessionDTO 
     */
    public AccessionDTO createAccessionDTO() {
        return new AccessionDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AccessionDTO from the Accession using its key fields.
     *
     * @return a unique AccessionDTO 
     */
    public AccessionDTO loadByPrimaryKey(Long AccessionKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Accession WHERE Accession._Accession_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AccessionKey);
            List<AccessionDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AccessionKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Accession WHERE Accession._Accession_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AccessionKey);
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
     * Loads a List of AccessionDTO objects from the Accession table using its _MTBTypes_key field.
     *
     * @return a List of AccessionDTO objects
     */
    public List<AccessionDTO> loadByMTBTypesKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Accession WHERE _MTBTypes_key=?",
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
     * Deletes from the Accession table by _MTBTypes_key field.
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
            ps = c.prepareStatement("DELETE FROM Accession WHERE _MTBTypes_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AccessionDTO objects from the Accession table using its _SiteInfo_key field.
     *
     * @return a List of AccessionDTO objects
     */
    public List<AccessionDTO> loadBySiteInfoKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Accession WHERE _SiteInfo_key=?",
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
     * Deletes from the Accession table by _SiteInfo_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteBySiteInfoKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Accession WHERE _SiteInfo_key=?");
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
     * Retrieves the MTBTypesDTO object from the Accession._MTBTypes_key field.
     *
     * @param pObject the AccessionDTO 
     * @return the associated MTBTypesDTO pObject
     */
    public MTBTypesDTO getMTBTypesDTO(AccessionDTO pObject) 
    throws SQLException {
        MTBTypesDTO other = MTBTypesDAO.getInstance().createMTBTypesDTO();
        other.setMTBTypesKey(pObject.getMTBTypesKey());
        return MTBTypesDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AccessionDTO object to the MTBTypesDTO object.
     *
     * @param pObject the AccessionDTO object to use
     * @param pObjectToBeSet the MTBTypesDTO object to associate to the AccessionDTO 
     * @return the associated MTBTypesDTO pObject
     */
    // SET IMPORTED
    public AccessionDTO setMTBTypesDTO(AccessionDTO pObject,MTBTypesDTO pObjectToBeSet) {
        pObject.setMTBTypesKey(pObjectToBeSet.getMTBTypesKey());
        return pObject;
    }

    /**
     * Retrieves the SiteInfoDTO object from the Accession._SiteInfo_key field.
     *
     * @param pObject the AccessionDTO 
     * @return the associated SiteInfoDTO pObject
     */
    public SiteInfoDTO getSiteInfoDTO(AccessionDTO pObject) 
    throws SQLException {
        SiteInfoDTO other = SiteInfoDAO.getInstance().createSiteInfoDTO();
        other.setSiteInfoKey(pObject.getSiteInfoKey());
        return SiteInfoDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AccessionDTO object to the SiteInfoDTO object.
     *
     * @param pObject the AccessionDTO object to use
     * @param pObjectToBeSet the SiteInfoDTO object to associate to the AccessionDTO 
     * @return the associated SiteInfoDTO pObject
     */
    // SET IMPORTED
    public AccessionDTO setSiteInfoDTO(AccessionDTO pObject,SiteInfoDTO pObjectToBeSet) {
        pObject.setSiteInfoKey(pObjectToBeSet.getSiteInfoKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Accession.
     *
     * @return a List of AccessionDAO objects
     */
    public List<AccessionDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Accession, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AccessionDAO objects
     */
    public List<AccessionDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Accession",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AccessionDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AccessionDTO table 
     */
    public List<AccessionDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AccessionDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AccessionDTO table 
     */
    public List<AccessionDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AccessionDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AccessionDTO table 
     */
    public List<AccessionDTO> loadByWhere(String where, 
                                         int[] fieldList, 
                                         int startRow, 
                                         int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Accession " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Accession ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AccessionDTO> v = new ArrayList<AccessionDTO>();
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
     * Deletes all rows from Accession table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Accession table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Accession " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AccessionDTO pObject into the database.
     *
     * @param pObject the AccessionDTO pObject to be saved
     */
    public AccessionDTO save(AccessionDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAccessionKey() == null) {
            Object obj = max(ID__ACCESSION_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAccessionKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Accession (");
    
                if (pObject.isAccessionKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Accession_key");
                    _dirtyCount++;
                }

                if (pObject.isAccIDModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("accID");
                    _dirtyCount++;
                }

                if (pObject.isPrefixPartModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("prefixPart");
                    _dirtyCount++;
                }

                if (pObject.isNumericPartModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("numericPart");
                    _dirtyCount++;
                }

                if (pObject.isObjectKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Object_key");
                    _dirtyCount++;
                }

                if (pObject.isMTBTypesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBTypes_key");
                    _dirtyCount++;
                }

                if (pObject.isSiteInfoKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_SiteInfo_key");
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

                if (pObject.isAccessionKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKey());
                }
    
                if (pObject.isAccIDModified()) {
                    ps.setString(++_dirtyCount, pObject.getAccID());
                }
    
                if (pObject.isPrefixPartModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }
    
                if (pObject.isNumericPartModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumericPart());
                }
    
                if (pObject.isObjectKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }
    
                if (pObject.isSiteInfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteInfoKey());
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
                _sql = new StringBuffer("UPDATE Accession SET ");
                boolean useComma=false;

                if (pObject.isAccessionKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Accession_key").append("=?");
                }

                if (pObject.isAccIDModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("accID").append("=?");
                }

                if (pObject.isPrefixPartModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("prefixPart").append("=?");
                }

                if (pObject.isNumericPartModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("numericPart").append("=?");
                }

                if (pObject.isObjectKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Object_key").append("=?");
                }

                if (pObject.isMTBTypesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBTypes_key").append("=?");
                }

                if (pObject.isSiteInfoKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_SiteInfo_key").append("=?");
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
                _sql.append("Accession._Accession_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAccessionKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKey());
                }

                if (pObject.isAccIDModified()) {
                      ps.setString(++_dirtyCount, pObject.getAccID());
                }

                if (pObject.isPrefixPartModified()) {
                      ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }

                if (pObject.isNumericPartModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumericPart());
                }

                if (pObject.isObjectKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }

                if (pObject.isMTBTypesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }

                if (pObject.isSiteInfoKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteInfoKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKeyOriginal());
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
     * Saves a List of AccessionDTO objects into the database.
     *
     * @param pObjects the AccessionDTO pObject table to be saved
     * @return the saved AccessionDTO List.
     */
    public List<AccessionDTO> save(List<AccessionDTO> pObjects) throws SQLException {
        for (AccessionDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AccessionDTO object from a template
     *
     * @param pObject the AccessionDTO object to look for
     * @return the pObject matching the template
     */
    public AccessionDTO loadUniqueUsingTemplate(AccessionDTO pObject) 
        throws SQLException {
         List<AccessionDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AccessionDTO objects from a template one.
     *
     * @param pObject the AccessionDTO template to look for
     * @return all the AccessionDTO objects matching the template
     */
    public List<AccessionDTO> loadUsingTemplate(AccessionDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AccessionDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AccessionDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AccessionDTO matching the template
     */
    public List<AccessionDTO> loadUsingTemplate(AccessionDTO pObject,
                                               int startRow,
                                               int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Accession WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAccessionKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Accession_key= ?");
             }
    
             if (pObject.isAccIDModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("accID= ?");
             }
    
             if (pObject.isPrefixPartModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("prefixPart= ?");
             }
    
             if (pObject.isNumericPartModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("numericPart= ?");
             }
    
             if (pObject.isObjectKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Object_key= ?");
             }
    
             if (pObject.isMTBTypesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
             }
    
             if (pObject.isSiteInfoKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_SiteInfo_key= ?");
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
    
             if (pObject.isAccessionKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKey());
             }
    
             if (pObject.isAccIDModified()) {
                 ps.setString(++_dirtyCount, pObject.getAccID());
             }
    
             if (pObject.isPrefixPartModified()) {
                 ps.setString(++_dirtyCount, pObject.getPrefixPart());
             }
    
             if (pObject.isNumericPartModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumericPart());
             }
    
             if (pObject.isObjectKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
             }
    
             if (pObject.isMTBTypesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
             }
    
             if (pObject.isSiteInfoKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteInfoKey());
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
     * Deletes rows using a AccessionDTO template.
     *
     * @param pObject the AccessionDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AccessionDTO pObject) throws SQLException {
        if (pObject.isAccessionKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAccessionKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Accession WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAccessionKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Accession_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAccIDInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("accID").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPrefixPartInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("prefixPart").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNumericPartInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("numericPart").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isObjectKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Object_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBTypesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBTypes_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSiteInfoKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_SiteInfo_key").append("=?");
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
    
            if (pObject.isAccessionKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKey());
            }
    
            if (pObject.isAccIDInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAccID());
            }
    
            if (pObject.isPrefixPartInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPrefixPart());
            }
    
            if (pObject.isNumericPartInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumericPart());
            }
    
            if (pObject.isObjectKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
            }
    
            if (pObject.isMTBTypesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
            }
    
            if (pObject.isSiteInfoKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteInfoKey());
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
     * Retrieves the max value for a specified column of the table Accession.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Accession";
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
                    case ID__ACCESSION_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_ACCID:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PREFIXPART:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NUMERICPART:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__OBJECT_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__MTBTYPES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__SITEINFO_KEY:
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
     * Retrieves the min value for a specified column of the table Accession.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Accession";
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
                    case ID__ACCESSION_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_ACCID:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PREFIXPART:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NUMERICPART:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__OBJECT_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__MTBTYPES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__SITEINFO_KEY:
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
     * Retrieves the number of rows of the table Accession.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Accession with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Accession " + where;
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
     * Retrieves the number of rows of the table Accession with a prepared statement.
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
     * Looks for the number of elements of a specific AccessionDTO pObject given a c
     *
     * @param pObject the AccessionDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AccessionDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Accession WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAccessionKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Accession_key= ?");
                }
    
                if (pObject.isAccIDModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("accID= ?");
                }
    
                if (pObject.isPrefixPartModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("prefixPart= ?");
                }
    
                if (pObject.isNumericPartModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("numericPart= ?");
                }
    
                if (pObject.isObjectKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Object_key= ?");
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBTypes_key= ?");
                }
    
                if (pObject.isSiteInfoKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_SiteInfo_key= ?");
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
    
                if (pObject.isAccessionKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAccessionKey());
                }
    
                if (pObject.isAccIDModified()) {
                    ps.setString(++_dirtyCount, pObject.getAccID());
                }
    
                if (pObject.isPrefixPartModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrefixPart());
                }
    
                if (pObject.isNumericPartModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumericPart());
                }
    
                if (pObject.isObjectKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getObjectKey());
                }
    
                if (pObject.isMTBTypesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBTypesKey());
                }
    
                if (pObject.isSiteInfoKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSiteInfoKey());
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
     * Transforms a ResultSet iterating on the Accession on a AccessionDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AccessionDTO pObject
     */
    public AccessionDTO decodeRow(ResultSet rs) throws SQLException {
        AccessionDTO pObject = createAccessionDTO();
        pObject.setAccessionKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAccID(rs.getString(2));
        pObject.setPrefixPart(rs.getString(3));
        pObject.setNumericPart(DAOManagerMTB.getLong(rs, 4));
        pObject.setObjectKey(DAOManagerMTB.getLong(rs, 5));
        pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, 6));
        pObject.setSiteInfoKey(DAOManagerMTB.getLong(rs, 7));
        pObject.setCreateUser(rs.getString(8));
        pObject.setCreateDate(rs.getTimestamp(9));
        pObject.setUpdateUser(rs.getString(10));
        pObject.setUpdateDate(rs.getTimestamp(11));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Accession table on a AccessionDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AccessionDTO pObject
     */
    public AccessionDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AccessionDTO pObject = createAccessionDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ACCESSION_KEY:
                    ++pos;
                    pObject.setAccessionKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_ACCID:
                    ++pos;
                    pObject.setAccID(rs.getString(pos));
                    break;
                case ID_PREFIXPART:
                    ++pos;
                    pObject.setPrefixPart(rs.getString(pos));
                    break;
                case ID_NUMERICPART:
                    ++pos;
                    pObject.setNumericPart(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__OBJECT_KEY:
                    ++pos;
                    pObject.setObjectKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__MTBTYPES_KEY:
                    ++pos;
                    pObject.setMTBTypesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__SITEINFO_KEY:
                    ++pos;
                    pObject.setSiteInfoKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AccessionDTO objects
     */
    public List<AccessionDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AccessionDTO objects
     */
    public List<AccessionDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AccessionDTO objects
     */
    public List<AccessionDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AccessionDTO> v = new ArrayList<AccessionDTO>();
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
