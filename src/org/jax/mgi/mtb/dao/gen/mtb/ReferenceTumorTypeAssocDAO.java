
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the ReferenceTumorTypeAssoc table.
 */
public class ReferenceTumorTypeAssocDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _ReferenceTumorTypeAssoc_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__REFERENCETUMORTYPEASSOC_KEY = 0;
    public static final int TYPE__REFERENCETUMORTYPEASSOC_KEY = Types.DECIMAL;
    public static final String NAME__REFERENCETUMORTYPEASSOC_KEY = "_ReferenceTumorTypeAssoc_key";

    /**
     * Column _Reference_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 1;
    public static final int TYPE__REFERENCE_KEY = Types.DECIMAL;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

    /**
     * Column _TumorType_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__TUMORTYPE_KEY = 2;
    public static final int TYPE__TUMORTYPE_KEY = Types.DECIMAL;
    public static final String NAME__TUMORTYPE_KEY = "_TumorType_key";

    /**
     * Column _MTBDataStatus_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__MTBDATASTATUS_KEY = 3;
    public static final int TYPE__MTBDATASTATUS_KEY = Types.DECIMAL;
    public static final String NAME__MTBDATASTATUS_KEY = "_MTBDataStatus_key";

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


    private static final String TABLE_NAME = "ReferenceTumorTypeAssoc";

    /**
     * Create an array of type string containing all the fields of the ReferenceTumorTypeAssoc table.
     */
    private static final String[] FIELD_NAMES = {
        "ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key"
        ,"ReferenceTumorTypeAssoc._Reference_key"
        ,"ReferenceTumorTypeAssoc._TumorType_key"
        ,"ReferenceTumorTypeAssoc._MTBDataStatus_key"
        ,"ReferenceTumorTypeAssoc.create_user"
        ,"ReferenceTumorTypeAssoc.create_date"
        ,"ReferenceTumorTypeAssoc.update_user"
        ,"ReferenceTumorTypeAssoc.update_date"
    };

    /**
     * Create an array of type containing all the fields of the ReferenceTumorTypeAssoc table.
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
     * Field that contains the comma separated fields of the ReferenceTumorTypeAssoc table.
     */
    private static final String ALL_FIELDS = "ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key"
                            + ",ReferenceTumorTypeAssoc._Reference_key"
                            + ",ReferenceTumorTypeAssoc._TumorType_key"
                            + ",ReferenceTumorTypeAssoc._MTBDataStatus_key"
                            + ",ReferenceTumorTypeAssoc.create_user"
                            + ",ReferenceTumorTypeAssoc.create_date"
                            + ",ReferenceTumorTypeAssoc.update_user"
                            + ",ReferenceTumorTypeAssoc.update_date";


    // ----------------------------------------------------- Instance Variables

    private static ReferenceTumorTypeAssocDAO singleton = new ReferenceTumorTypeAssocDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the ReferenceTumorTypeAssocDAO singleton.
     *
     * @return ReferenceTumorTypeAssocDAO 
     */
    synchronized public static ReferenceTumorTypeAssocDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own ReferenceTumorTypeAssocDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ReferenceTumorTypeAssocDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new ReferenceTumorTypeAssocDTO instance.
     *
     * @return the new ReferenceTumorTypeAssocDTO 
     */
    public ReferenceTumorTypeAssocDTO createReferenceTumorTypeAssocDTO() {
        return new ReferenceTumorTypeAssocDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a ReferenceTumorTypeAssocDTO from the ReferenceTumorTypeAssoc using its key fields.
     *
     * @return a unique ReferenceTumorTypeAssocDTO 
     */
    public ReferenceTumorTypeAssocDTO loadByPrimaryKey(Long ReferenceTumorTypeAssocKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM ReferenceTumorTypeAssoc WHERE ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ReferenceTumorTypeAssocKey);
            List<ReferenceTumorTypeAssocDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ReferenceTumorTypeAssocKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from ReferenceTumorTypeAssoc WHERE ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ReferenceTumorTypeAssocKey);
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
     * Loads all the rows from ReferenceTumorTypeAssoc.
     *
     * @return a List of ReferenceTumorTypeAssocDAO objects
     */
    public List<ReferenceTumorTypeAssocDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from ReferenceTumorTypeAssoc, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceTumorTypeAssocDAO objects
     */
    public List<ReferenceTumorTypeAssocDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM ReferenceTumorTypeAssoc",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of ReferenceTumorTypeAssocDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ReferenceTumorTypeAssocDTO table 
     */
    public List<ReferenceTumorTypeAssocDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of ReferenceTumorTypeAssocDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ReferenceTumorTypeAssocDTO table 
     */
    public List<ReferenceTumorTypeAssocDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceTumorTypeAssocDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting ReferenceTumorTypeAssocDTO table 
     */
    public List<ReferenceTumorTypeAssocDTO> loadByWhere(String where, 
                                                       int[] fieldList, 
                                                       int startRow, 
                                                       int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from ReferenceTumorTypeAssoc " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from ReferenceTumorTypeAssoc ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<ReferenceTumorTypeAssocDTO> v = new ArrayList<ReferenceTumorTypeAssocDTO>();
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
     * Deletes all rows from ReferenceTumorTypeAssoc table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the ReferenceTumorTypeAssoc table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM ReferenceTumorTypeAssoc " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the ReferenceTumorTypeAssocDTO pObject into the database.
     *
     * @param pObject the ReferenceTumorTypeAssocDTO pObject to be saved
     */
    public ReferenceTumorTypeAssocDTO save(ReferenceTumorTypeAssocDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getReferenceTumorTypeAssocKey() == null) {
            Object obj = max(ID__REFERENCETUMORTYPEASSOC_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setReferenceTumorTypeAssocKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into ReferenceTumorTypeAssoc (");
    
                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_ReferenceTumorTypeAssoc_key");
                    _dirtyCount++;
                }

                if (pObject.isReferenceKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Reference_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorType_key");
                    _dirtyCount++;
                }

                if (pObject.isMTBDataStatusKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_MTBDataStatus_key");
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

                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isMTBDataStatusKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBDataStatusKey());
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
                _sql = new StringBuffer("UPDATE ReferenceTumorTypeAssoc SET ");
                boolean useComma=false;

                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_ReferenceTumorTypeAssoc_key").append("=?");
                }

                if (pObject.isReferenceKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Reference_key").append("=?");
                }

                if (pObject.isTumorTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorType_key").append("=?");
                }

                if (pObject.isMTBDataStatusKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_MTBDataStatus_key").append("=?");
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
                _sql.append("ReferenceTumorTypeAssoc._ReferenceTumorTypeAssoc_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKey());
                }

                if (pObject.isReferenceKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }

                if (pObject.isTumorTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }

                if (pObject.isMTBDataStatusKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBDataStatusKey());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKeyOriginal());
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
     * Saves a List of ReferenceTumorTypeAssocDTO objects into the database.
     *
     * @param pObjects the ReferenceTumorTypeAssocDTO pObject table to be saved
     * @return the saved ReferenceTumorTypeAssocDTO List.
     */
    public List<ReferenceTumorTypeAssocDTO> save(List<ReferenceTumorTypeAssocDTO> pObjects) throws SQLException {
        for (ReferenceTumorTypeAssocDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique ReferenceTumorTypeAssocDTO object from a template
     *
     * @param pObject the ReferenceTumorTypeAssocDTO object to look for
     * @return the pObject matching the template
     */
    public ReferenceTumorTypeAssocDTO loadUniqueUsingTemplate(ReferenceTumorTypeAssocDTO pObject) 
        throws SQLException {
         List<ReferenceTumorTypeAssocDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of ReferenceTumorTypeAssocDTO objects from a template one.
     *
     * @param pObject the ReferenceTumorTypeAssocDTO template to look for
     * @return all the ReferenceTumorTypeAssocDTO objects matching the template
     */
    public List<ReferenceTumorTypeAssocDTO> loadUsingTemplate(ReferenceTumorTypeAssocDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of ReferenceTumorTypeAssocDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the ReferenceTumorTypeAssocDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the ReferenceTumorTypeAssocDTO matching the template
     */
    public List<ReferenceTumorTypeAssocDTO> loadUsingTemplate(ReferenceTumorTypeAssocDTO pObject,
                                                             int startRow,
                                                             int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from ReferenceTumorTypeAssoc WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_ReferenceTumorTypeAssoc_key= ?");
             }
    
             if (pObject.isReferenceKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
             }
    
             if (pObject.isTumorTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
             }
    
             if (pObject.isMTBDataStatusKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBDataStatus_key= ?");
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
    
             if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKey());
             }
    
             if (pObject.isReferenceKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
             }
    
             if (pObject.isTumorTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
             }
    
             if (pObject.isMTBDataStatusKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBDataStatusKey());
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
     * Deletes rows using a ReferenceTumorTypeAssocDTO template.
     *
     * @param pObject the ReferenceTumorTypeAssocDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(ReferenceTumorTypeAssocDTO pObject) throws SQLException {
        if (pObject.isReferenceTumorTypeAssocKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getReferenceTumorTypeAssocKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM ReferenceTumorTypeAssoc WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isReferenceTumorTypeAssocKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_ReferenceTumorTypeAssoc_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Reference_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isMTBDataStatusKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_MTBDataStatus_key").append("=?");
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
    
            if (pObject.isReferenceTumorTypeAssocKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKey());
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
            }
    
            if (pObject.isTumorTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
            }
    
            if (pObject.isMTBDataStatusKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBDataStatusKey());
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
     * Retrieves the max value for a specified column of the table ReferenceTumorTypeAssoc.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from ReferenceTumorTypeAssoc";
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
                    case ID__REFERENCETUMORTYPEASSOC_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__TUMORTYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__MTBDATASTATUS_KEY:
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
     * Retrieves the min value for a specified column of the table ReferenceTumorTypeAssoc.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from ReferenceTumorTypeAssoc";
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
                    case ID__REFERENCETUMORTYPEASSOC_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__TUMORTYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__MTBDATASTATUS_KEY:
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
     * Retrieves the number of rows of the table ReferenceTumorTypeAssoc.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table ReferenceTumorTypeAssoc with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from ReferenceTumorTypeAssoc " + where;
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
     * Retrieves the number of rows of the table ReferenceTumorTypeAssoc with a prepared statement.
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
     * Looks for the number of elements of a specific ReferenceTumorTypeAssocDTO pObject given a c
     *
     * @param pObject the ReferenceTumorTypeAssocDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(ReferenceTumorTypeAssocDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from ReferenceTumorTypeAssoc WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_ReferenceTumorTypeAssoc_key= ?");
                }
    
                if (pObject.isReferenceKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
                }
    
                if (pObject.isMTBDataStatusKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_MTBDataStatus_key= ?");
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
    
                if (pObject.isReferenceTumorTypeAssocKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceTumorTypeAssocKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isMTBDataStatusKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getMTBDataStatusKey());
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
     * Transforms a ResultSet iterating on the ReferenceTumorTypeAssoc on a ReferenceTumorTypeAssocDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ReferenceTumorTypeAssocDTO pObject
     */
    public ReferenceTumorTypeAssocDTO decodeRow(ResultSet rs) throws SQLException {
        ReferenceTumorTypeAssocDTO pObject = createReferenceTumorTypeAssocDTO();
        pObject.setReferenceTumorTypeAssocKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setMTBDataStatusKey(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the ReferenceTumorTypeAssoc table on a ReferenceTumorTypeAssocDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ReferenceTumorTypeAssocDTO pObject
     */
    public ReferenceTumorTypeAssocDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        ReferenceTumorTypeAssocDTO pObject = createReferenceTumorTypeAssocDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__REFERENCETUMORTYPEASSOC_KEY:
                    ++pos;
                    pObject.setReferenceTumorTypeAssocKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__REFERENCE_KEY:
                    ++pos;
                    pObject.setReferenceKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORTYPE_KEY:
                    ++pos;
                    pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__MTBDATASTATUS_KEY:
                    ++pos;
                    pObject.setMTBDataStatusKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of ReferenceTumorTypeAssocDTO objects
     */
    public List<ReferenceTumorTypeAssocDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of ReferenceTumorTypeAssocDTO objects
     */
    public List<ReferenceTumorTypeAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of ReferenceTumorTypeAssocDTO objects
     */
    public List<ReferenceTumorTypeAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<ReferenceTumorTypeAssocDTO> v = new ArrayList<ReferenceTumorTypeAssocDTO>();
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
