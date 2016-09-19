
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AllelePair table.
 */
public class AllelePairDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _AllelePair_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELEPAIR_KEY = 0;
    public static final int TYPE__ALLELEPAIR_KEY = Types.NUMERIC;
    public static final String NAME__ALLELEPAIR_KEY = "_AllelePair_key";

    /**
     * Column _Allele1_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELE1_KEY = 1;
    public static final int TYPE__ALLELE1_KEY = Types.NUMERIC;
    public static final String NAME__ALLELE1_KEY = "_Allele1_key";

    /**
     * Column _Allele2_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELE2_KEY = 2;
    public static final int TYPE__ALLELE2_KEY = Types.NUMERIC;
    public static final String NAME__ALLELE2_KEY = "_Allele2_key";

    /**
     * Column sequence of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_SEQUENCE = 3;
    public static final int TYPE_SEQUENCE = Types.NUMERIC;
    public static final String NAME_SEQUENCE = "sequence";

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


    private static final String TABLE_NAME = "AllelePair";

    /**
     * Create an array of type string containing all the fields of the AllelePair table.
     */
    private static final String[] FIELD_NAMES = {
        "AllelePair._AllelePair_key"
        ,"AllelePair._Allele1_key"
        ,"AllelePair._Allele2_key"
        ,"AllelePair.sequence"
        ,"AllelePair.create_user"
        ,"AllelePair.create_date"
        ,"AllelePair.update_user"
        ,"AllelePair.update_date"
    };

    /**
     * Create an array of type containing all the fields of the AllelePair table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the AllelePair table.
     */
    private static final String ALL_FIELDS = "AllelePair._AllelePair_key"
                            + ",AllelePair._Allele1_key"
                            + ",AllelePair._Allele2_key"
                            + ",AllelePair.sequence"
                            + ",AllelePair.create_user"
                            + ",AllelePair.create_date"
                            + ",AllelePair.update_user"
                            + ",AllelePair.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AllelePairDAO singleton = new AllelePairDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AllelePairDAO singleton.
     *
     * @return AllelePairDAO 
     */
    synchronized public static AllelePairDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AllelePairDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AllelePairDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AllelePairDTO instance.
     *
     * @return the new AllelePairDTO 
     */
    public AllelePairDTO createAllelePairDTO() {
        return new AllelePairDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AllelePairDTO from the AllelePair using its key fields.
     *
     * @return a unique AllelePairDTO 
     */
    public AllelePairDTO loadByPrimaryKey(Long AllelePairKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AllelePair WHERE AllelePair._AllelePair_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AllelePairKey);
            List<AllelePairDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AllelePairKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AllelePair WHERE AllelePair._AllelePair_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AllelePairKey);
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
     * Loads a List of AllelePairDTO objects from the AllelePair table using its _Allele1_key field.
     *
     * @return a List of AllelePairDTO objects
     */
    public List<AllelePairDTO> loadByAllele1Key(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AllelePair WHERE _Allele1_key=?",
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
     * Deletes from the AllelePair table by _Allele1_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAllele1Key(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM AllelePair WHERE _Allele1_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AllelePairDTO objects from the AllelePair table using its _Allele2_key field.
     *
     * @return a List of AllelePairDTO objects
     */
    public List<AllelePairDTO> loadByAllele2Key(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AllelePair WHERE _Allele2_key=?",
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
     * Deletes from the AllelePair table by _Allele2_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAllele2Key(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM AllelePair WHERE _Allele2_key=?");
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
     * Retrieves the AlleleDTO object from the AllelePair._Allele_key field.
     *
     * @param pObject the AllelePairDTO 
     * @return the associated AlleleDTO pObject
     */
    public AlleleDTO getAlleleDTO(AllelePairDTO pObject) 
    throws SQLException {
        AlleleDTO other = AlleleDAO.getInstance().createAlleleDTO();
        other.setAlleleKey(pObject.getAllele1Key());
        return AlleleDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AllelePairDTO object to the AlleleDTO object.
     *
     * @param pObject the AllelePairDTO object to use
     * @param pObjectToBeSet the AlleleDTO object to associate to the AllelePairDTO 
     * @return the associated AlleleDTO pObject
     */
    // SET IMPORTED
    public AllelePairDTO setAlleleDTO(AllelePairDTO pObject,AlleleDTO pObjectToBeSet) {
        pObject.setAllele1Key(pObjectToBeSet.getAlleleKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from AllelePair.
     *
     * @return a List of AllelePairDAO objects
     */
    public List<AllelePairDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AllelePair, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AllelePairDAO objects
     */
    public List<AllelePairDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AllelePair",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AllelePairDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AllelePairDTO table 
     */
    public List<AllelePairDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AllelePairDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AllelePairDTO table 
     */
    public List<AllelePairDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AllelePairDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AllelePairDTO table 
     */
    public List<AllelePairDTO> loadByWhere(String where, 
                                          int[] fieldList, 
                                          int startRow, 
                                          int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AllelePair " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AllelePair ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AllelePairDTO> v = new ArrayList<AllelePairDTO>();
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
     * Deletes all rows from AllelePair table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AllelePair table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AllelePair " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AllelePairDTO pObject into the database.
     *
     * @param pObject the AllelePairDTO pObject to be saved
     */
    public AllelePairDTO save(AllelePairDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAllelePairKey() == null) {
            Object obj = max(ID__ALLELEPAIR_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAllelePairKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AllelePair (");
    
                if (pObject.isAllelePairKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AllelePair_key");
                    _dirtyCount++;
                }

                if (pObject.isAllele1KeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Allele1_key");
                    _dirtyCount++;
                }

                if (pObject.isAllele2KeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Allele2_key");
                    _dirtyCount++;
                }

                if (pObject.isSequenceModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("sequence");
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

                if (pObject.isAllelePairKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKey());
                }
    
                if (pObject.isAllele1KeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele1Key());
                }
    
                if (pObject.isAllele2KeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele2Key());
                }
    
                if (pObject.isSequenceModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSequence());
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
                _sql = new StringBuffer("UPDATE AllelePair SET ");
                boolean useComma=false;

                if (pObject.isAllelePairKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AllelePair_key").append("=?");
                }

                if (pObject.isAllele1KeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Allele1_key").append("=?");
                }

                if (pObject.isAllele2KeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Allele2_key").append("=?");
                }

                if (pObject.isSequenceModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("sequence").append("=?");
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
                _sql.append("AllelePair._AllelePair_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAllelePairKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKey());
                }

                if (pObject.isAllele1KeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele1Key());
                }

                if (pObject.isAllele2KeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele2Key());
                }

                if (pObject.isSequenceModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSequence());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKeyOriginal());
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
     * Saves a List of AllelePairDTO objects into the database.
     *
     * @param pObjects the AllelePairDTO pObject table to be saved
     * @return the saved AllelePairDTO List.
     */
    public List<AllelePairDTO> save(List<AllelePairDTO> pObjects) throws SQLException {
        for (AllelePairDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AllelePairDTO object from a template
     *
     * @param pObject the AllelePairDTO object to look for
     * @return the pObject matching the template
     */
    public AllelePairDTO loadUniqueUsingTemplate(AllelePairDTO pObject) 
        throws SQLException {
         List<AllelePairDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AllelePairDTO objects from a template one.
     *
     * @param pObject the AllelePairDTO template to look for
     * @return all the AllelePairDTO objects matching the template
     */
    public List<AllelePairDTO> loadUsingTemplate(AllelePairDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AllelePairDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AllelePairDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AllelePairDTO matching the template
     */
    public List<AllelePairDTO> loadUsingTemplate(AllelePairDTO pObject,
                                                int startRow,
                                                int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AllelePair WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAllelePairKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AllelePair_key= ?");
             }
    
             if (pObject.isAllele1KeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele1_key= ?");
             }
    
             if (pObject.isAllele2KeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele2_key= ?");
             }
    
             if (pObject.isSequenceModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("sequence= ?");
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
    
             if (pObject.isAllelePairKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKey());
             }
    
             if (pObject.isAllele1KeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele1Key());
             }
    
             if (pObject.isAllele2KeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele2Key());
             }
    
             if (pObject.isSequenceModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSequence());
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
     * Deletes rows using a AllelePairDTO template.
     *
     * @param pObject the AllelePairDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AllelePairDTO pObject) throws SQLException {
        if (pObject.isAllelePairKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAllelePairKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AllelePair WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAllelePairKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AllelePair_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAllele1KeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Allele1_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAllele2KeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Allele2_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSequenceInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("sequence").append("=?");
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
    
            if (pObject.isAllelePairKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKey());
            }
    
            if (pObject.isAllele1KeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele1Key());
            }
    
            if (pObject.isAllele2KeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele2Key());
            }
    
            if (pObject.isSequenceInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSequence());
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
     * Retrieves a List of StrainDTO objects using the relation table Genotype given a AllelePairDTO object.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaGenotype(AllelePairDTO pObject) 
        throws SQLException {
        return loadStrainViaGenotype(pObject, 1, -1);
    }

    /**
     * Retrieves a List of StrainDTO objects using the relation table Genotype given a AllelePairDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of StrainDTO objects
     */
    // MANY TO MANY
    public List<StrainDTO> loadStrainViaGenotype(AllelePairDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Strain, ");
        strSQL.append("        Genotype");
        strSQL.append("  where Genotype._AllelePair_key = ?");
        strSQL.append("    and Genotype._Strain_key = Strain._Strain_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAllelePairKey());
             return StrainDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table Genotype given a AllelePairDTO object.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaGenotype(AllelePairDTO pObject) 
        throws SQLException {
        return loadReferenceViaGenotype(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table Genotype given a AllelePairDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaGenotype(AllelePairDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        Genotype");
        strSQL.append("  where Genotype._AllelePair_key = ?");
        strSQL.append("    and Genotype._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAllelePairKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects using the relation table TumorGenetics given a AllelePairDTO object.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @return a List of TumorFrequencyDTO objects
     */
    // MANY TO MANY
    public List<TumorFrequencyDTO> loadTumorFrequencyViaTumorGenetics(AllelePairDTO pObject) 
        throws SQLException {
        return loadTumorFrequencyViaTumorGenetics(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects using the relation table TumorGenetics given a AllelePairDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AllelePairDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorFrequencyDTO objects
     */
    // MANY TO MANY
    public List<TumorFrequencyDTO> loadTumorFrequencyViaTumorGenetics(AllelePairDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorFrequency, ");
        strSQL.append("        TumorGenetics");
        strSQL.append("  where TumorGenetics._AllelePair_key = ?");
        strSQL.append("    and TumorGenetics._TumorFrequency_key = TumorFrequency._TumorFrequency_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAllelePairKey());
             return TumorFrequencyDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table AllelePair.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AllelePair";
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
                    case ID__ALLELEPAIR_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ALLELE1_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ALLELE2_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_SEQUENCE:
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
     * Retrieves the min value for a specified column of the table AllelePair.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AllelePair";
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
                    case ID__ALLELEPAIR_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ALLELE1_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ALLELE2_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_SEQUENCE:
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
     * Retrieves the number of rows of the table AllelePair.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AllelePair with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AllelePair " + where;
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
     * Retrieves the number of rows of the table AllelePair with a prepared statement.
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
     * Looks for the number of elements of a specific AllelePairDTO pObject given a c
     *
     * @param pObject the AllelePairDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AllelePairDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AllelePair WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAllelePairKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AllelePair_key= ?");
                }
    
                if (pObject.isAllele1KeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele1_key= ?");
                }
    
                if (pObject.isAllele2KeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele2_key= ?");
                }
    
                if (pObject.isSequenceModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("sequence= ?");
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
    
                if (pObject.isAllelePairKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllelePairKey());
                }
    
                if (pObject.isAllele1KeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele1Key());
                }
    
                if (pObject.isAllele2KeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAllele2Key());
                }
    
                if (pObject.isSequenceModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getSequence());
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
     * Transforms a ResultSet iterating on the AllelePair on a AllelePairDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AllelePairDTO pObject
     */
    public AllelePairDTO decodeRow(ResultSet rs) throws SQLException {
        AllelePairDTO pObject = createAllelePairDTO();
        pObject.setAllelePairKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAllele1Key(DAOManagerMTB.getLong(rs, 2));
        pObject.setAllele2Key(DAOManagerMTB.getLong(rs, 3));
        pObject.setSequence(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AllelePair table on a AllelePairDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AllelePairDTO pObject
     */
    public AllelePairDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AllelePairDTO pObject = createAllelePairDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ALLELEPAIR_KEY:
                    ++pos;
                    pObject.setAllelePairKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ALLELE1_KEY:
                    ++pos;
                    pObject.setAllele1Key(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ALLELE2_KEY:
                    ++pos;
                    pObject.setAllele2Key(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_SEQUENCE:
                    ++pos;
                    pObject.setSequence(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AllelePairDTO objects
     */
    public List<AllelePairDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AllelePairDTO objects
     */
    public List<AllelePairDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AllelePairDTO objects
     */
    public List<AllelePairDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AllelePairDTO> v = new ArrayList<AllelePairDTO>();
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
