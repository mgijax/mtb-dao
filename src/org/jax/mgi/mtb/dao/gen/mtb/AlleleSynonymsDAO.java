
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AlleleSynonyms table.
 */
public class AlleleSynonymsDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _AlelleSynonyms_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALELLESYNONYMS_KEY = 0;
    public static final int TYPE__ALELLESYNONYMS_KEY = Types.NUMERIC;
    public static final String NAME__ALELLESYNONYMS_KEY = "_AlelleSynonyms_key";

    /**
     * Column _Allele_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELE_KEY = 1;
    public static final int TYPE__ALLELE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELE_KEY = "_Allele_key";

    /**
     * Column synonym of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SYNONYM = 2;
    public static final int TYPE_SYNONYM = Types.VARCHAR;
    public static final String NAME_SYNONYM = "synonym";

    /**
     * Column _Reference_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 3;
    public static final int TYPE__REFERENCE_KEY = Types.NUMERIC;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

    /**
     * Column create_user of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_CREATE_USER = 4;
    public static final int TYPE_CREATE_USER = Types.NUMERIC;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_CREATE_DATE = 5;
    public static final int TYPE_CREATE_DATE = Types.NUMERIC;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_UPDATE_USER = 6;
    public static final int TYPE_UPDATE_USER = Types.NUMERIC;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_UPDATE_DATE = 7;
    public static final int TYPE_UPDATE_DATE = Types.NUMERIC;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "AlleleSynonyms";

    /**
     * Create an array of type string containing all the fields of the AlleleSynonyms table.
     */
    private static final String[] FIELD_NAMES = {
        "AlleleSynonyms._AlelleSynonyms_key"
        ,"AlleleSynonyms._Allele_key"
        ,"AlleleSynonyms.synonym"
        ,"AlleleSynonyms._Reference_key"
        ,"AlleleSynonyms.create_user"
        ,"AlleleSynonyms.create_date"
        ,"AlleleSynonyms.update_user"
        ,"AlleleSynonyms.update_date"
    };

    /**
     * Create an array of type containing all the fields of the AlleleSynonyms table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"Long"
        ,"Long"
    };

    /**
     * Field that contains the comma separated fields of the AlleleSynonyms table.
     */
    private static final String ALL_FIELDS = "AlleleSynonyms._AlelleSynonyms_key"
                            + ",AlleleSynonyms._Allele_key"
                            + ",AlleleSynonyms.synonym"
                            + ",AlleleSynonyms._Reference_key"
                            + ",AlleleSynonyms.create_user"
                            + ",AlleleSynonyms.create_date"
                            + ",AlleleSynonyms.update_user"
                            + ",AlleleSynonyms.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AlleleSynonymsDAO singleton = new AlleleSynonymsDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AlleleSynonymsDAO singleton.
     *
     * @return AlleleSynonymsDAO 
     */
    synchronized public static AlleleSynonymsDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AlleleSynonymsDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AlleleSynonymsDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AlleleSynonymsDTO instance.
     *
     * @return the new AlleleSynonymsDTO 
     */
    public AlleleSynonymsDTO createAlleleSynonymsDTO() {
        return new AlleleSynonymsDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AlleleSynonymsDTO from the AlleleSynonyms using its key fields.
     *
     * @return a unique AlleleSynonymsDTO 
     */
    public AlleleSynonymsDTO loadByPrimaryKey(Long AlelleSynonymsKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleSynonyms WHERE AlleleSynonyms._AlelleSynonyms_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlelleSynonymsKey);
            List<AlleleSynonymsDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AlelleSynonymsKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AlleleSynonyms WHERE AlleleSynonyms._AlelleSynonyms_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlelleSynonymsKey);
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
     * Loads a List of AlleleSynonymsDTO objects from the AlleleSynonyms table using its _Allele_key field.
     *
     * @return a List of AlleleSynonymsDTO objects
     */
    public List<AlleleSynonymsDTO> loadByAlleleKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleSynonyms WHERE _Allele_key=?",
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
     * Deletes from the AlleleSynonyms table by _Allele_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAlleleKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM AlleleSynonyms WHERE _Allele_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of AlleleSynonymsDTO objects from the AlleleSynonyms table using its _Reference_key field.
     *
     * @return a List of AlleleSynonymsDTO objects
     */
    public List<AlleleSynonymsDTO> loadByReferenceKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleSynonyms WHERE _Reference_key=?",
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
     * Deletes from the AlleleSynonyms table by _Reference_key field.
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
            ps = c.prepareStatement("DELETE FROM AlleleSynonyms WHERE _Reference_key=?");
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
     * Retrieves the AlleleDTO object from the AlleleSynonyms._Allele_key field.
     *
     * @param pObject the AlleleSynonymsDTO 
     * @return the associated AlleleDTO pObject
     */
    public AlleleDTO getAlleleDTO(AlleleSynonymsDTO pObject) 
    throws SQLException {
        AlleleDTO other = AlleleDAO.getInstance().createAlleleDTO();
        other.setAlleleKey(pObject.getAlleleKey());
        return AlleleDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleSynonymsDTO object to the AlleleDTO object.
     *
     * @param pObject the AlleleSynonymsDTO object to use
     * @param pObjectToBeSet the AlleleDTO object to associate to the AlleleSynonymsDTO 
     * @return the associated AlleleDTO pObject
     */
    // SET IMPORTED
    public AlleleSynonymsDTO setAlleleDTO(AlleleSynonymsDTO pObject,AlleleDTO pObjectToBeSet) {
        pObject.setAlleleKey(pObjectToBeSet.getAlleleKey());
        return pObject;
    }

    /**
     * Retrieves the ReferenceDTO object from the AlleleSynonyms._Reference_key field.
     *
     * @param pObject the AlleleSynonymsDTO 
     * @return the associated ReferenceDTO pObject
     */
    public ReferenceDTO getReferenceDTO(AlleleSynonymsDTO pObject) 
    throws SQLException {
        ReferenceDTO other = ReferenceDAO.getInstance().createReferenceDTO();
        other.setReferenceKey(pObject.getReferenceKey());
        return ReferenceDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the AlleleSynonymsDTO object to the ReferenceDTO object.
     *
     * @param pObject the AlleleSynonymsDTO object to use
     * @param pObjectToBeSet the ReferenceDTO object to associate to the AlleleSynonymsDTO 
     * @return the associated ReferenceDTO pObject
     */
    // SET IMPORTED
    public AlleleSynonymsDTO setReferenceDTO(AlleleSynonymsDTO pObject,ReferenceDTO pObjectToBeSet) {
        pObject.setReferenceKey(pObjectToBeSet.getReferenceKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from AlleleSynonyms.
     *
     * @return a List of AlleleSynonymsDAO objects
     */
    public List<AlleleSynonymsDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AlleleSynonyms, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleSynonymsDAO objects
     */
    public List<AlleleSynonymsDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleSynonyms",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AlleleSynonymsDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AlleleSynonymsDTO table 
     */
    public List<AlleleSynonymsDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AlleleSynonymsDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleSynonymsDTO table 
     */
    public List<AlleleSynonymsDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AlleleSynonymsDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleSynonymsDTO table 
     */
    public List<AlleleSynonymsDTO> loadByWhere(String where, 
                                              int[] fieldList, 
                                              int startRow, 
                                              int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AlleleSynonyms " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AlleleSynonyms ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AlleleSynonymsDTO> v = new ArrayList<AlleleSynonymsDTO>();
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
     * Deletes all rows from AlleleSynonyms table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AlleleSynonyms table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AlleleSynonyms " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AlleleSynonymsDTO pObject into the database.
     *
     * @param pObject the AlleleSynonymsDTO pObject to be saved
     */
    public AlleleSynonymsDTO save(AlleleSynonymsDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAlelleSynonymsKey() == null) {
            Object obj = max(ID__ALELLESYNONYMS_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAlelleSynonymsKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AlleleSynonyms (");
    
                if (pObject.isAlelleSynonymsKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AlelleSynonyms_key");
                    _dirtyCount++;
                }

                if (pObject.isAlleleKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Allele_key");
                    _dirtyCount++;
                }

                if (pObject.isSynonymModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("synonym");
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

                if (pObject.isAlelleSynonymsKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKey());
                }
    
                if (pObject.isAlleleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }
    
                if (pObject.isSynonymModified()) {
                    ps.setString(++_dirtyCount, pObject.getSynonym());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isCreateUserModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateUser());
                }
    
                if (pObject.isCreateDateModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateDate());
                }
    
                if (pObject.isUpdateUserModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateUser());
                }
    
                if (pObject.isUpdateDateModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateDate());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE AlleleSynonyms SET ");
                boolean useComma=false;

                if (pObject.isAlelleSynonymsKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AlelleSynonyms_key").append("=?");
                }

                if (pObject.isAlleleKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Allele_key").append("=?");
                }

                if (pObject.isSynonymModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("synonym").append("=?");
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
                _sql.append("AlleleSynonyms._AlelleSynonyms_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAlelleSynonymsKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKey());
                }

                if (pObject.isAlleleKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }

                if (pObject.isSynonymModified()) {
                      ps.setString(++_dirtyCount, pObject.getSynonym());
                }

                if (pObject.isReferenceKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }

                if (pObject.isCreateUserModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateUser());
                }

                if (pObject.isCreateDateModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateDate());
                }

                if (pObject.isUpdateUserModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateUser());
                }

                if (pObject.isUpdateDateModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateDate());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKeyOriginal());
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
     * Saves a List of AlleleSynonymsDTO objects into the database.
     *
     * @param pObjects the AlleleSynonymsDTO pObject table to be saved
     * @return the saved AlleleSynonymsDTO List.
     */
    public List<AlleleSynonymsDTO> save(List<AlleleSynonymsDTO> pObjects) throws SQLException {
        for (AlleleSynonymsDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AlleleSynonymsDTO object from a template
     *
     * @param pObject the AlleleSynonymsDTO object to look for
     * @return the pObject matching the template
     */
    public AlleleSynonymsDTO loadUniqueUsingTemplate(AlleleSynonymsDTO pObject) 
        throws SQLException {
         List<AlleleSynonymsDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AlleleSynonymsDTO objects from a template one.
     *
     * @param pObject the AlleleSynonymsDTO template to look for
     * @return all the AlleleSynonymsDTO objects matching the template
     */
    public List<AlleleSynonymsDTO> loadUsingTemplate(AlleleSynonymsDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AlleleSynonymsDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AlleleSynonymsDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AlleleSynonymsDTO matching the template
     */
    public List<AlleleSynonymsDTO> loadUsingTemplate(AlleleSynonymsDTO pObject,
                                                    int startRow,
                                                    int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AlleleSynonyms WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAlelleSynonymsKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlelleSynonyms_key= ?");
             }
    
             if (pObject.isAlleleKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
             }
    
             if (pObject.isSynonymModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("synonym= ?");
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
    
             if (pObject.isAlelleSynonymsKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKey());
             }
    
             if (pObject.isAlleleKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
             }
    
             if (pObject.isSynonymModified()) {
                 ps.setString(++_dirtyCount, pObject.getSynonym());
             }
    
             if (pObject.isReferenceKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
             }
    
             if (pObject.isCreateUserModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateUser());
             }
    
             if (pObject.isCreateDateModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateDate());
             }
    
             if (pObject.isUpdateUserModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateUser());
             }
    
             if (pObject.isUpdateDateModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateDate());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a AlleleSynonymsDTO template.
     *
     * @param pObject the AlleleSynonymsDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AlleleSynonymsDTO pObject) throws SQLException {
        if (pObject.isAlelleSynonymsKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAlelleSynonymsKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AlleleSynonyms WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAlelleSynonymsKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AlelleSynonyms_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAlleleKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Allele_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSynonymInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("synonym").append("=?");
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
    
            if (pObject.isAlelleSynonymsKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKey());
            }
    
            if (pObject.isAlleleKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
            }
    
            if (pObject.isSynonymInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSynonym());
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
            }
    
            if (pObject.isCreateUserInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateUser());
            }
    
            if (pObject.isCreateDateInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateDate());
            }
    
            if (pObject.isUpdateUserInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateUser());
            }
    
            if (pObject.isUpdateDateInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateDate());
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Retrieves the max value for a specified column of the table AlleleSynonyms.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AlleleSynonyms";
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
                    case ID__ALELLESYNONYMS_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ALLELE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_SYNONYM:
                        iReturn = rs.getString(1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_CREATE_USER:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_CREATE_DATE:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_UPDATE_USER:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_UPDATE_DATE:
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
     * Retrieves the min value for a specified column of the table AlleleSynonyms.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AlleleSynonyms";
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
                    case ID__ALELLESYNONYMS_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ALLELE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_SYNONYM:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_CREATE_USER:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_CREATE_DATE:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_UPDATE_USER:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_UPDATE_DATE:
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
     * Retrieves the number of rows of the table AlleleSynonyms.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AlleleSynonyms with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AlleleSynonyms " + where;
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
     * Retrieves the number of rows of the table AlleleSynonyms with a prepared statement.
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
     * Looks for the number of elements of a specific AlleleSynonymsDTO pObject given a c
     *
     * @param pObject the AlleleSynonymsDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AlleleSynonymsDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AlleleSynonyms WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAlelleSynonymsKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlelleSynonyms_key= ?");
                }
    
                if (pObject.isAlleleKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Allele_key= ?");
                }
    
                if (pObject.isSynonymModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("synonym= ?");
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
    
                if (pObject.isAlelleSynonymsKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlelleSynonymsKey());
                }
    
                if (pObject.isAlleleKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleKey());
                }
    
                if (pObject.isSynonymModified()) {
                    ps.setString(++_dirtyCount, pObject.getSynonym());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isCreateUserModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateUser());
                }
    
                if (pObject.isCreateDateModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getCreateDate());
                }
    
                if (pObject.isUpdateUserModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateUser());
                }
    
                if (pObject.isUpdateDateModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getUpdateDate());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the AlleleSynonyms on a AlleleSynonymsDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AlleleSynonymsDTO pObject
     */
    public AlleleSynonymsDTO decodeRow(ResultSet rs) throws SQLException {
        AlleleSynonymsDTO pObject = createAlleleSynonymsDTO();
        pObject.setAlelleSynonymsKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setAlleleKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setSynonym(rs.getString(3));
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(DAOManagerMTB.getLong(rs, 5));
        pObject.setCreateDate(DAOManagerMTB.getLong(rs, 6));
        pObject.setUpdateUser(DAOManagerMTB.getLong(rs, 7));
        pObject.setUpdateDate(DAOManagerMTB.getLong(rs, 8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AlleleSynonyms table on a AlleleSynonymsDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AlleleSynonymsDTO pObject
     */
    public AlleleSynonymsDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AlleleSynonymsDTO pObject = createAlleleSynonymsDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ALELLESYNONYMS_KEY:
                    ++pos;
                    pObject.setAlelleSynonymsKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ALLELE_KEY:
                    ++pos;
                    pObject.setAlleleKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_SYNONYM:
                    ++pos;
                    pObject.setSynonym(rs.getString(pos));
                    break;
                case ID__REFERENCE_KEY:
                    ++pos;
                    pObject.setReferenceKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_CREATE_USER:
                    ++pos;
                    pObject.setCreateUser(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_CREATE_DATE:
                    ++pos;
                    pObject.setCreateDate(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_UPDATE_USER:
                    ++pos;
                    pObject.setUpdateUser(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_UPDATE_DATE:
                    ++pos;
                    pObject.setUpdateDate(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of AlleleSynonymsDTO objects
     */
    public List<AlleleSynonymsDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AlleleSynonymsDTO objects
     */
    public List<AlleleSynonymsDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AlleleSynonymsDTO objects
     */
    public List<AlleleSynonymsDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AlleleSynonymsDTO> v = new ArrayList<AlleleSynonymsDTO>();
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
