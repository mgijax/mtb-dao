
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Probe table.
 */
public class ProbeDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Probe_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__PROBE_KEY = 0;
    public static final int TYPE__PROBE_KEY = Types.NUMERIC;
    public static final String NAME__PROBE_KEY = "_Probe_key";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 1;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";

    /**
     * Column target of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TARGET = 2;
    public static final int TYPE_TARGET = Types.VARCHAR;
    public static final String NAME_TARGET = "target";

    /**
     * Column counterstain of type Types.VARCHAR mapped to String.
     */
    public static final int ID_COUNTERSTAIN = 3;
    public static final int TYPE_COUNTERSTAIN = Types.VARCHAR;
    public static final String NAME_COUNTERSTAIN = "counterstain";

    /**
     * Column url of type Types.VARCHAR mapped to String.
     */
    public static final int ID_URL = 4;
    public static final int TYPE_URL = Types.VARCHAR;
    public static final String NAME_URL = "url";

    /**
     * Column type of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TYPE = 5;
    public static final int TYPE_TYPE = Types.VARCHAR;
    public static final String NAME_TYPE = "type";

    /**
     * Column notes of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NOTES = 6;
    public static final int TYPE_NOTES = Types.VARCHAR;
    public static final String NAME_NOTES = "notes";

    /**
     * Column supplierName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SUPPLIERNAME = 7;
    public static final int TYPE_SUPPLIERNAME = Types.VARCHAR;
    public static final String NAME_SUPPLIERNAME = "supplierName";

    /**
     * Column supplierAddress of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SUPPLIERADDRESS = 8;
    public static final int TYPE_SUPPLIERADDRESS = Types.VARCHAR;
    public static final String NAME_SUPPLIERADDRESS = "supplierAddress";

    /**
     * Column supplierUrl of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SUPPLIERURL = 9;
    public static final int TYPE_SUPPLIERURL = Types.VARCHAR;
    public static final String NAME_SUPPLIERURL = "supplierUrl";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 10;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 11;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 12;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 13;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "Probe";

    /**
     * Create an array of type string containing all the fields of the Probe table.
     */
    private static final String[] FIELD_NAMES = {
        "Probe._Probe_key"
        ,"Probe.name"
        ,"Probe.target"
        ,"Probe.counterstain"
        ,"Probe.url"
        ,"Probe.type"
        ,"Probe.notes"
        ,"Probe.supplierName"
        ,"Probe.supplierAddress"
        ,"Probe.supplierUrl"
        ,"Probe.create_user"
        ,"Probe.create_date"
        ,"Probe.update_user"
        ,"Probe.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Probe table.
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
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Probe table.
     */
    private static final String ALL_FIELDS = "Probe._Probe_key"
                            + ",Probe.name"
                            + ",Probe.target"
                            + ",Probe.counterstain"
                            + ",Probe.url"
                            + ",Probe.type"
                            + ",Probe.notes"
                            + ",Probe.supplierName"
                            + ",Probe.supplierAddress"
                            + ",Probe.supplierUrl"
                            + ",Probe.create_user"
                            + ",Probe.create_date"
                            + ",Probe.update_user"
                            + ",Probe.update_date";


    // ----------------------------------------------------- Instance Variables

    private static ProbeDAO singleton = new ProbeDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the ProbeDAO singleton.
     *
     * @return ProbeDAO 
     */
    synchronized public static ProbeDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own ProbeDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ProbeDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new ProbeDTO instance.
     *
     * @return the new ProbeDTO 
     */
    public ProbeDTO createProbeDTO() {
        return new ProbeDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a ProbeDTO from the Probe using its key fields.
     *
     * @return a unique ProbeDTO 
     */
    public ProbeDTO loadByPrimaryKey(Long ProbeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Probe WHERE Probe._Probe_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ProbeKey);
            List<ProbeDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ProbeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Probe WHERE Probe._Probe_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ProbeKey);
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
     * Loads all the rows from Probe.
     *
     * @return a List of ProbeDAO objects
     */
    public List<ProbeDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Probe, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ProbeDAO objects
     */
    public List<ProbeDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Probe",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of ProbeDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ProbeDTO table 
     */
    public List<ProbeDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of ProbeDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ProbeDTO table 
     */
    public List<ProbeDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of ProbeDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting ProbeDTO table 
     */
    public List<ProbeDTO> loadByWhere(String where, 
                                     int[] fieldList, 
                                     int startRow, 
                                     int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Probe " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Probe ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<ProbeDTO> v = new ArrayList<ProbeDTO>();
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
     * Deletes all rows from Probe table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Probe table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Probe " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the ProbeDTO pObject into the database.
     *
     * @param pObject the ProbeDTO pObject to be saved
     */
    public ProbeDTO save(ProbeDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getProbeKey() == null) {
            Object obj = max(ID__PROBE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setProbeKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Probe (");
    
                if (pObject.isProbeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Probe_key");
                    _dirtyCount++;
                }

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("name");
                    _dirtyCount++;
                }

                if (pObject.isTargetModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("target");
                    _dirtyCount++;
                }

                if (pObject.isCounterstainModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("counterstain");
                    _dirtyCount++;
                }

                if (pObject.isUrlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("url");
                    _dirtyCount++;
                }

                if (pObject.isTypeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("type");
                    _dirtyCount++;
                }

                if (pObject.isNotesModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("notes");
                    _dirtyCount++;
                }

                if (pObject.isSupplierNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("supplierName");
                    _dirtyCount++;
                }

                if (pObject.isSupplierAddressModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("supplierAddress");
                    _dirtyCount++;
                }

                if (pObject.isSupplierUrlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("supplierUrl");
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

                if (pObject.isProbeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isTargetModified()) {
                    ps.setString(++_dirtyCount, pObject.getTarget());
                }
    
                if (pObject.isCounterstainModified()) {
                    ps.setString(++_dirtyCount, pObject.getCounterstain());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isTypeModified()) {
                    ps.setString(++_dirtyCount, pObject.getType());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
                }
    
                if (pObject.isSupplierNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierName());
                }
    
                if (pObject.isSupplierAddressModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierAddress());
                }
    
                if (pObject.isSupplierUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierUrl());
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
                _sql = new StringBuffer("UPDATE Probe SET ");
                boolean useComma=false;

                if (pObject.isProbeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Probe_key").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
                }

                if (pObject.isTargetModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("target").append("=?");
                }

                if (pObject.isCounterstainModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("counterstain").append("=?");
                }

                if (pObject.isUrlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("url").append("=?");
                }

                if (pObject.isTypeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("type").append("=?");
                }

                if (pObject.isNotesModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("notes").append("=?");
                }

                if (pObject.isSupplierNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("supplierName").append("=?");
                }

                if (pObject.isSupplierAddressModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("supplierAddress").append("=?");
                }

                if (pObject.isSupplierUrlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("supplierUrl").append("=?");
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
                _sql.append("Probe._Probe_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isProbeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
                }

                if (pObject.isTargetModified()) {
                      ps.setString(++_dirtyCount, pObject.getTarget());
                }

                if (pObject.isCounterstainModified()) {
                      ps.setString(++_dirtyCount, pObject.getCounterstain());
                }

                if (pObject.isUrlModified()) {
                      ps.setString(++_dirtyCount, pObject.getUrl());
                }

                if (pObject.isTypeModified()) {
                      ps.setString(++_dirtyCount, pObject.getType());
                }

                if (pObject.isNotesModified()) {
                      ps.setString(++_dirtyCount, pObject.getNotes());
                }

                if (pObject.isSupplierNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getSupplierName());
                }

                if (pObject.isSupplierAddressModified()) {
                      ps.setString(++_dirtyCount, pObject.getSupplierAddress());
                }

                if (pObject.isSupplierUrlModified()) {
                      ps.setString(++_dirtyCount, pObject.getSupplierUrl());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKeyOriginal());
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
     * Saves a List of ProbeDTO objects into the database.
     *
     * @param pObjects the ProbeDTO pObject table to be saved
     * @return the saved ProbeDTO List.
     */
    public List<ProbeDTO> save(List<ProbeDTO> pObjects) throws SQLException {
        for (ProbeDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique ProbeDTO object from a template
     *
     * @param pObject the ProbeDTO object to look for
     * @return the pObject matching the template
     */
    public ProbeDTO loadUniqueUsingTemplate(ProbeDTO pObject) 
        throws SQLException {
         List<ProbeDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of ProbeDTO objects from a template one.
     *
     * @param pObject the ProbeDTO template to look for
     * @return all the ProbeDTO objects matching the template
     */
    public List<ProbeDTO> loadUsingTemplate(ProbeDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of ProbeDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the ProbeDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the ProbeDTO matching the template
     */
    public List<ProbeDTO> loadUsingTemplate(ProbeDTO pObject,
                                           int startRow,
                                           int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Probe WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isProbeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Probe_key= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
             }
    
             if (pObject.isTargetModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("target= ?");
             }
    
             if (pObject.isCounterstainModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("counterstain= ?");
             }
    
             if (pObject.isUrlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
             }
    
             if (pObject.isTypeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("type= ?");
             }
    
             if (pObject.isNotesModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
             }
    
             if (pObject.isSupplierNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierName= ?");
             }
    
             if (pObject.isSupplierAddressModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierAddress= ?");
             }
    
             if (pObject.isSupplierUrlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierUrl= ?");
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
    
             if (pObject.isProbeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
             }
    
             if (pObject.isTargetModified()) {
                 ps.setString(++_dirtyCount, pObject.getTarget());
             }
    
             if (pObject.isCounterstainModified()) {
                 ps.setString(++_dirtyCount, pObject.getCounterstain());
             }
    
             if (pObject.isUrlModified()) {
                 ps.setString(++_dirtyCount, pObject.getUrl());
             }
    
             if (pObject.isTypeModified()) {
                 ps.setString(++_dirtyCount, pObject.getType());
             }
    
             if (pObject.isNotesModified()) {
                 ps.setString(++_dirtyCount, pObject.getNotes());
             }
    
             if (pObject.isSupplierNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getSupplierName());
             }
    
             if (pObject.isSupplierAddressModified()) {
                 ps.setString(++_dirtyCount, pObject.getSupplierAddress());
             }
    
             if (pObject.isSupplierUrlModified()) {
                 ps.setString(++_dirtyCount, pObject.getSupplierUrl());
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
     * Deletes rows using a ProbeDTO template.
     *
     * @param pObject the ProbeDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(ProbeDTO pObject) throws SQLException {
        if (pObject.isProbeKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getProbeKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Probe WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isProbeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Probe_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("name").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTargetInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("target").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCounterstainInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("counterstain").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUrlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("url").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTypeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("type").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNotesInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("notes").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSupplierNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("supplierName").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSupplierAddressInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("supplierAddress").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSupplierUrlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("supplierUrl").append("=?");
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
    
            if (pObject.isProbeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
            }
    
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
            }
    
            if (pObject.isTargetInitialized()) {
                ps.setString(++_dirtyCount, pObject.getTarget());
            }
    
            if (pObject.isCounterstainInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCounterstain());
            }
    
            if (pObject.isUrlInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUrl());
            }
    
            if (pObject.isTypeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getType());
            }
    
            if (pObject.isNotesInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNotes());
            }
    
            if (pObject.isSupplierNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSupplierName());
            }
    
            if (pObject.isSupplierAddressInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSupplierAddress());
            }
    
            if (pObject.isSupplierUrlInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSupplierUrl());
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
     * Retrieves a List of PathologyImagesDTO objects using the relation table PathologyImagesProbes given a ProbeDTO object.
     *
     * @param pObject the ProbeDTO pObject to be used
     * @return a List of PathologyImagesDTO objects
     */
    // MANY TO MANY
    public List<PathologyImagesDTO> loadPathologyImagesViaPathologyImagesProbes(ProbeDTO pObject) 
        throws SQLException {
        return loadPathologyImagesViaPathologyImagesProbes(pObject, 1, -1);
    }

    /**
     * Retrieves a List of PathologyImagesDTO objects using the relation table PathologyImagesProbes given a ProbeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the ProbeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyImagesDTO objects
     */
    // MANY TO MANY
    public List<PathologyImagesDTO> loadPathologyImagesViaPathologyImagesProbes(ProbeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from PathologyImages, ");
        strSQL.append("        PathologyImagesProbes");
        strSQL.append("  where PathologyImagesProbes._Probe_key = ?");
        strSQL.append("    and PathologyImagesProbes._Pathology_key = PathologyImages._Pathology_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getProbeKey());
             return PathologyImagesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Probe.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Probe";
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
                    case ID__PROBE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TARGET:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COUNTERSTAIN:
                        iReturn = rs.getString(1);
                        break;
                    case ID_URL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TYPE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTES:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SUPPLIERNAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SUPPLIERADDRESS:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SUPPLIERURL:
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
     * Retrieves the min value for a specified column of the table Probe.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Probe";
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
                    case ID__PROBE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TARGET:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COUNTERSTAIN:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_URL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TYPE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTES:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SUPPLIERNAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SUPPLIERADDRESS:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SUPPLIERURL:
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
     * Retrieves the number of rows of the table Probe.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Probe with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Probe " + where;
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
     * Retrieves the number of rows of the table Probe with a prepared statement.
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
     * Looks for the number of elements of a specific ProbeDTO pObject given a c
     *
     * @param pObject the ProbeDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(ProbeDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Probe WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isProbeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Probe_key= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
                }
    
                if (pObject.isTargetModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("target= ?");
                }
    
                if (pObject.isCounterstainModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("counterstain= ?");
                }
    
                if (pObject.isUrlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
                }
    
                if (pObject.isTypeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("type= ?");
                }
    
                if (pObject.isNotesModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
                }
    
                if (pObject.isSupplierNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierName= ?");
                }
    
                if (pObject.isSupplierAddressModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierAddress= ?");
                }
    
                if (pObject.isSupplierUrlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("supplierUrl= ?");
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
    
                if (pObject.isProbeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getProbeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isTargetModified()) {
                    ps.setString(++_dirtyCount, pObject.getTarget());
                }
    
                if (pObject.isCounterstainModified()) {
                    ps.setString(++_dirtyCount, pObject.getCounterstain());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isTypeModified()) {
                    ps.setString(++_dirtyCount, pObject.getType());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
                }
    
                if (pObject.isSupplierNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierName());
                }
    
                if (pObject.isSupplierAddressModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierAddress());
                }
    
                if (pObject.isSupplierUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getSupplierUrl());
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
     * Transforms a ResultSet iterating on the Probe on a ProbeDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ProbeDTO pObject
     */
    public ProbeDTO decodeRow(ResultSet rs) throws SQLException {
        ProbeDTO pObject = createProbeDTO();
        pObject.setProbeKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setName(rs.getString(2));
        pObject.setTarget(rs.getString(3));
        pObject.setCounterstain(rs.getString(4));
        pObject.setUrl(rs.getString(5));
        pObject.setType(rs.getString(6));
        pObject.setNotes(rs.getString(7));
        pObject.setSupplierName(rs.getString(8));
        pObject.setSupplierAddress(rs.getString(9));
        pObject.setSupplierUrl(rs.getString(10));
        pObject.setCreateUser(rs.getString(11));
        pObject.setCreateDate(rs.getTimestamp(12));
        pObject.setUpdateUser(rs.getString(13));
        pObject.setUpdateDate(rs.getTimestamp(14));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Probe table on a ProbeDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ProbeDTO pObject
     */
    public ProbeDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        ProbeDTO pObject = createProbeDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__PROBE_KEY:
                    ++pos;
                    pObject.setProbeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
                    break;
                case ID_TARGET:
                    ++pos;
                    pObject.setTarget(rs.getString(pos));
                    break;
                case ID_COUNTERSTAIN:
                    ++pos;
                    pObject.setCounterstain(rs.getString(pos));
                    break;
                case ID_URL:
                    ++pos;
                    pObject.setUrl(rs.getString(pos));
                    break;
                case ID_TYPE:
                    ++pos;
                    pObject.setType(rs.getString(pos));
                    break;
                case ID_NOTES:
                    ++pos;
                    pObject.setNotes(rs.getString(pos));
                    break;
                case ID_SUPPLIERNAME:
                    ++pos;
                    pObject.setSupplierName(rs.getString(pos));
                    break;
                case ID_SUPPLIERADDRESS:
                    ++pos;
                    pObject.setSupplierAddress(rs.getString(pos));
                    break;
                case ID_SUPPLIERURL:
                    ++pos;
                    pObject.setSupplierUrl(rs.getString(pos));
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
     * @return a List of ProbeDTO objects
     */
    public List<ProbeDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of ProbeDTO objects
     */
    public List<ProbeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of ProbeDTO objects
     */
    public List<ProbeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<ProbeDTO> v = new ArrayList<ProbeDTO>();
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
