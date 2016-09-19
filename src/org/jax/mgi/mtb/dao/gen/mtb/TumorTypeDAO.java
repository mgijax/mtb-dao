
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the TumorType table.
 */
public class TumorTypeDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _TumorType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORTYPE_KEY = 0;
    public static final int TYPE__TUMORTYPE_KEY = Types.NUMERIC;
    public static final String NAME__TUMORTYPE_KEY = "_TumorType_key";

    /**
     * Column _TumorClassification_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORCLASSIFICATION_KEY = 1;
    public static final int TYPE__TUMORCLASSIFICATION_KEY = Types.NUMERIC;
    public static final String NAME__TUMORCLASSIFICATION_KEY = "_TumorClassification_key";

    /**
     * Column _Organ_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ORGAN_KEY = 2;
    public static final int TYPE__ORGAN_KEY = Types.NUMERIC;
    public static final String NAME__ORGAN_KEY = "_Organ_key";

    /**
     * Column commonName of type Types.VARCHAR mapped to String.
     */
    public static final int ID_COMMONNAME = 3;
    public static final int TYPE_COMMONNAME = Types.VARCHAR;
    public static final String NAME_COMMONNAME = "commonName";

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
     * Column _cons_tt_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CONS_TT_KEY = 8;
    public static final int TYPE__CONS_TT_KEY = Types.NUMERIC;
    public static final String NAME__CONS_TT_KEY = "_cons_tt_key";


    private static final String TABLE_NAME = "TumorType";

    /**
     * Create an array of type string containing all the fields of the TumorType table.
     */
    private static final String[] FIELD_NAMES = {
        "TumorType._TumorType_key"
        ,"TumorType._TumorClassification_key"
        ,"TumorType._Organ_key"
        ,"TumorType.commonName"
        ,"TumorType.create_user"
        ,"TumorType.create_date"
        ,"TumorType.update_user"
        ,"TumorType.update_date"
        ,"TumorType._cons_tt_key"
    };

    /**
     * Create an array of type containing all the fields of the TumorType table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
        ,"Long"
    };

    /**
     * Field that contains the comma separated fields of the TumorType table.
     */
    private static final String ALL_FIELDS = "TumorType._TumorType_key"
                            + ",TumorType._TumorClassification_key"
                            + ",TumorType._Organ_key"
                            + ",TumorType.commonName"
                            + ",TumorType.create_user"
                            + ",TumorType.create_date"
                            + ",TumorType.update_user"
                            + ",TumorType.update_date"
                            + ",TumorType._cons_tt_key";


    // ----------------------------------------------------- Instance Variables

    private static TumorTypeDAO singleton = new TumorTypeDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the TumorTypeDAO singleton.
     *
     * @return TumorTypeDAO 
     */
    synchronized public static TumorTypeDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own TumorTypeDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(TumorTypeDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new TumorTypeDTO instance.
     *
     * @return the new TumorTypeDTO 
     */
    public TumorTypeDTO createTumorTypeDTO() {
        return new TumorTypeDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a TumorTypeDTO from the TumorType using its key fields.
     *
     * @return a unique TumorTypeDTO 
     */
    public TumorTypeDTO loadByPrimaryKey(Long TumorTypeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorType WHERE TumorType._TumorType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorTypeKey);
            List<TumorTypeDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long TumorTypeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from TumorType WHERE TumorType._TumorType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorTypeKey);
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
     * Loads a List of TumorTypeDTO objects from the TumorType table using its _Organ_key field.
     *
     * @return a List of TumorTypeDTO objects
     */
    public List<TumorTypeDTO> loadByOrganKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorType WHERE _Organ_key=?",
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
     * Deletes from the TumorType table by _Organ_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByOrganKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorType WHERE _Organ_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorTypeDTO objects from the TumorType table using its _TumorClassification_key field.
     *
     * @return a List of TumorTypeDTO objects
     */
    public List<TumorTypeDTO> loadByTumorClassificationKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorType WHERE _TumorClassification_key=?",
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
     * Deletes from the TumorType table by _TumorClassification_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByTumorClassificationKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorType WHERE _TumorClassification_key=?");
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
     * Retrieves the OrganDTO object from the TumorType._Organ_key field.
     *
     * @param pObject the TumorTypeDTO 
     * @return the associated OrganDTO pObject
     */
    public OrganDTO getOrganDTO(TumorTypeDTO pObject) 
    throws SQLException {
        OrganDTO other = OrganDAO.getInstance().createOrganDTO();
        other.setOrganKey(pObject.getOrganKey());
        return OrganDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorTypeDTO object to the OrganDTO object.
     *
     * @param pObject the TumorTypeDTO object to use
     * @param pObjectToBeSet the OrganDTO object to associate to the TumorTypeDTO 
     * @return the associated OrganDTO pObject
     */
    // SET IMPORTED
    public TumorTypeDTO setOrganDTO(TumorTypeDTO pObject,OrganDTO pObjectToBeSet) {
        pObject.setOrganKey(pObjectToBeSet.getOrganKey());
        return pObject;
    }

    /**
     * Retrieves the TumorClassificationDTO object from the TumorType._TumorClassification_key field.
     *
     * @param pObject the TumorTypeDTO 
     * @return the associated TumorClassificationDTO pObject
     */
    public TumorClassificationDTO getTumorClassificationDTO(TumorTypeDTO pObject) 
    throws SQLException {
        TumorClassificationDTO other = TumorClassificationDAO.getInstance().createTumorClassificationDTO();
        other.setTumorClassificationKey(pObject.getTumorClassificationKey());
        return TumorClassificationDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorTypeDTO object to the TumorClassificationDTO object.
     *
     * @param pObject the TumorTypeDTO object to use
     * @param pObjectToBeSet the TumorClassificationDTO object to associate to the TumorTypeDTO 
     * @return the associated TumorClassificationDTO pObject
     */
    // SET IMPORTED
    public TumorTypeDTO setTumorClassificationDTO(TumorTypeDTO pObject,TumorClassificationDTO pObjectToBeSet) {
        pObject.setTumorClassificationKey(pObjectToBeSet.getTumorClassificationKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from TumorType.
     *
     * @return a List of TumorTypeDAO objects
     */
    public List<TumorTypeDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from TumorType, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorTypeDAO objects
     */
    public List<TumorTypeDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorType",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of TumorTypeDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting TumorTypeDTO table 
     */
    public List<TumorTypeDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of TumorTypeDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorTypeDTO table 
     */
    public List<TumorTypeDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of TumorTypeDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorTypeDTO table 
     */
    public List<TumorTypeDTO> loadByWhere(String where, 
                                         int[] fieldList, 
                                         int startRow, 
                                         int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from TumorType " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from TumorType ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<TumorTypeDTO> v = new ArrayList<TumorTypeDTO>();
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
     * Deletes all rows from TumorType table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the TumorType table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM TumorType " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the TumorTypeDTO pObject into the database.
     *
     * @param pObject the TumorTypeDTO pObject to be saved
     */
    public TumorTypeDTO save(TumorTypeDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getTumorTypeKey() == null) {
            Object obj = max(ID__TUMORTYPE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setTumorTypeKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into TumorType (");
    
                if (pObject.isTumorTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorType_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorClassificationKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorClassification_key");
                    _dirtyCount++;
                }

                if (pObject.isOrganKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Organ_key");
                    _dirtyCount++;
                }

                if (pObject.isCommonNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("commonName");
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

                if (pObject.isConsTtKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_cons_tt_key");
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

                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isTumorClassificationKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorClassificationKey());
                }
    
                if (pObject.isOrganKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }
    
                if (pObject.isCommonNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getCommonName());
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
    
                if (pObject.isConsTtKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getConsTtKey());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE TumorType SET ");
                boolean useComma=false;

                if (pObject.isTumorTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorType_key").append("=?");
                }

                if (pObject.isTumorClassificationKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorClassification_key").append("=?");
                }

                if (pObject.isOrganKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Organ_key").append("=?");
                }

                if (pObject.isCommonNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("commonName").append("=?");
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

                if (pObject.isConsTtKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_cons_tt_key").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("TumorType._TumorType_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }

                if (pObject.isTumorClassificationKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorClassificationKey());
                }

                if (pObject.isOrganKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }

                if (pObject.isCommonNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getCommonName());
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

                if (pObject.isConsTtKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getConsTtKey());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKeyOriginal());
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
     * Saves a List of TumorTypeDTO objects into the database.
     *
     * @param pObjects the TumorTypeDTO pObject table to be saved
     * @return the saved TumorTypeDTO List.
     */
    public List<TumorTypeDTO> save(List<TumorTypeDTO> pObjects) throws SQLException {
        for (TumorTypeDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique TumorTypeDTO object from a template
     *
     * @param pObject the TumorTypeDTO object to look for
     * @return the pObject matching the template
     */
    public TumorTypeDTO loadUniqueUsingTemplate(TumorTypeDTO pObject) 
        throws SQLException {
         List<TumorTypeDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of TumorTypeDTO objects from a template one.
     *
     * @param pObject the TumorTypeDTO template to look for
     * @return all the TumorTypeDTO objects matching the template
     */
    public List<TumorTypeDTO> loadUsingTemplate(TumorTypeDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of TumorTypeDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the TumorTypeDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the TumorTypeDTO matching the template
     */
    public List<TumorTypeDTO> loadUsingTemplate(TumorTypeDTO pObject,
                                               int startRow,
                                               int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from TumorType WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
             }
    
             if (pObject.isTumorClassificationKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorClassification_key= ?");
             }
    
             if (pObject.isOrganKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organ_key= ?");
             }
    
             if (pObject.isCommonNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("commonName= ?");
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
    
             if (pObject.isConsTtKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_cons_tt_key= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isTumorTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
             }
    
             if (pObject.isTumorClassificationKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorClassificationKey());
             }
    
             if (pObject.isOrganKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
             }
    
             if (pObject.isCommonNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getCommonName());
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
    
             if (pObject.isConsTtKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getConsTtKey());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a TumorTypeDTO template.
     *
     * @param pObject the TumorTypeDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(TumorTypeDTO pObject) throws SQLException {
        if (pObject.isTumorTypeKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getTumorTypeKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM TumorType WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorClassificationKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorClassification_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isOrganKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Organ_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCommonNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("commonName").append("=?");
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
    
            if (pObject.isConsTtKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_cons_tt_key").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isTumorTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
            }
    
            if (pObject.isTumorClassificationKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorClassificationKey());
            }
    
            if (pObject.isOrganKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
            }
    
            if (pObject.isCommonNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCommonName());
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
    
            if (pObject.isConsTtKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getConsTtKey());
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
     * Retrieves a List of SexDTO objects using the relation table TumorFrequency given a TumorTypeDTO object.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @return a List of SexDTO objects
     */
    // MANY TO MANY
    public List<SexDTO> loadSexViaTumorFrequency(TumorTypeDTO pObject) 
        throws SQLException {
        return loadSexViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of SexDTO objects using the relation table TumorFrequency given a TumorTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of SexDTO objects
     */
    // MANY TO MANY
    public List<SexDTO> loadSexViaTumorFrequency(TumorTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Sex, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._TumorType_key = ?");
        strSQL.append("    and TumorFrequency._Sex_key = Sex._Sex_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorTypeKey());
             return SexDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of StrainDTO objects using the relation table TumorFrequency given a TumorTypeDTO object.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaTumorFrequency(TumorTypeDTO pObject) 
        throws SQLException {
        return loadStrainViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of StrainDTO objects using the relation table TumorFrequency given a TumorTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaTumorFrequency(TumorTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Strain, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._TumorType_key = ?");
        strSQL.append("    and TumorFrequency._Strain_key = Strain._Strain_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorTypeKey());
             return StrainDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of OrganDTO objects using the relation table TumorFrequency given a TumorTypeDTO object.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @return a List of OrganDTO objects
     */
    // MANY TO MANY
    public List<OrganDTO> loadOrganViaTumorFrequency(TumorTypeDTO pObject) 
        throws SQLException {
        return loadOrganViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of OrganDTO objects using the relation table TumorFrequency given a TumorTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of OrganDTO objects
     */
    // MANY TO MANY
    public List<OrganDTO> loadOrganViaTumorFrequency(TumorTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Organ, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._TumorType_key = ?");
        strSQL.append("    and TumorFrequency._OrganAffected_key = Organ._Organ_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorTypeKey());
             return OrganDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequency given a TumorTypeDTO object.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequency(TumorTypeDTO pObject) 
        throws SQLException {
        return loadReferenceViaTumorFrequency(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequency given a TumorTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequency(TumorTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        TumorFrequency");
        strSQL.append("  where TumorFrequency._TumorType_key = ?");
        strSQL.append("    and TumorFrequency._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorTypeKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table TumorType.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from TumorType";
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
                    case ID__TUMORTYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__TUMORCLASSIFICATION_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ORGAN_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_COMMONNAME:
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
                    case ID__CONS_TT_KEY:
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
     * Retrieves the min value for a specified column of the table TumorType.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from TumorType";
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
                    case ID__TUMORTYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__TUMORCLASSIFICATION_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ORGAN_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_COMMONNAME:
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
                    case ID__CONS_TT_KEY:
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
     * Retrieves the number of rows of the table TumorType.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table TumorType with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from TumorType " + where;
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
     * Retrieves the number of rows of the table TumorType with a prepared statement.
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
     * Looks for the number of elements of a specific TumorTypeDTO pObject given a c
     *
     * @param pObject the TumorTypeDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(TumorTypeDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from TumorType WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
                }
    
                if (pObject.isTumorClassificationKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorClassification_key= ?");
                }
    
                if (pObject.isOrganKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organ_key= ?");
                }
    
                if (pObject.isCommonNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("commonName= ?");
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
    
                if (pObject.isConsTtKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_cons_tt_key= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isTumorClassificationKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorClassificationKey());
                }
    
                if (pObject.isOrganKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganKey());
                }
    
                if (pObject.isCommonNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getCommonName());
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
    
                if (pObject.isConsTtKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getConsTtKey());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the TumorType on a TumorTypeDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting TumorTypeDTO pObject
     */
    public TumorTypeDTO decodeRow(ResultSet rs) throws SQLException {
        TumorTypeDTO pObject = createTumorTypeDTO();
        pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setTumorClassificationKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setOrganKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setCommonName(rs.getString(4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.setConsTtKey(DAOManagerMTB.getLong(rs, 9));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the TumorType table on a TumorTypeDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting TumorTypeDTO pObject
     */
    public TumorTypeDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        TumorTypeDTO pObject = createTumorTypeDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORTYPE_KEY:
                    ++pos;
                    pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORCLASSIFICATION_KEY:
                    ++pos;
                    pObject.setTumorClassificationKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ORGAN_KEY:
                    ++pos;
                    pObject.setOrganKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_COMMONNAME:
                    ++pos;
                    pObject.setCommonName(rs.getString(pos));
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
                case ID__CONS_TT_KEY:
                    ++pos;
                    pObject.setConsTtKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of TumorTypeDTO objects
     */
    public List<TumorTypeDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of TumorTypeDTO objects
     */
    public List<TumorTypeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of TumorTypeDTO objects
     */
    public List<TumorTypeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<TumorTypeDTO> v = new ArrayList<TumorTypeDTO>();
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
