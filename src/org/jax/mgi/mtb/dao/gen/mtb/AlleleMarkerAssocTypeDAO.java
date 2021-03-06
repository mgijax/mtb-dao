
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the AlleleMarkerAssocType table.
 */
public class AlleleMarkerAssocTypeDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _AlleleMarkerAssocType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELEMARKERASSOCTYPE_KEY = 0;
    public static final int TYPE__ALLELEMARKERASSOCTYPE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELEMARKERASSOCTYPE_KEY = "_AlleleMarkerAssocType_key";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 1;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";

    /**
     * Column description of type Types.VARCHAR mapped to String.
     */
    public static final int ID_DESCRIPTION = 2;
    public static final int TYPE_DESCRIPTION = Types.VARCHAR;
    public static final String NAME_DESCRIPTION = "description";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 3;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 4;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 5;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 6;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "AlleleMarkerAssocType";

    /**
     * Create an array of type string containing all the fields of the AlleleMarkerAssocType table.
     */
    private static final String[] FIELD_NAMES = {
        "AlleleMarkerAssocType._AlleleMarkerAssocType_key"
        ,"AlleleMarkerAssocType.name"
        ,"AlleleMarkerAssocType.description"
        ,"AlleleMarkerAssocType.create_user"
        ,"AlleleMarkerAssocType.create_date"
        ,"AlleleMarkerAssocType.update_user"
        ,"AlleleMarkerAssocType.update_date"
    };

    /**
     * Create an array of type containing all the fields of the AlleleMarkerAssocType table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the AlleleMarkerAssocType table.
     */
    private static final String ALL_FIELDS = "AlleleMarkerAssocType._AlleleMarkerAssocType_key"
                            + ",AlleleMarkerAssocType.name"
                            + ",AlleleMarkerAssocType.description"
                            + ",AlleleMarkerAssocType.create_user"
                            + ",AlleleMarkerAssocType.create_date"
                            + ",AlleleMarkerAssocType.update_user"
                            + ",AlleleMarkerAssocType.update_date";


    // ----------------------------------------------------- Instance Variables

    private static AlleleMarkerAssocTypeDAO singleton = new AlleleMarkerAssocTypeDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the AlleleMarkerAssocTypeDAO singleton.
     *
     * @return AlleleMarkerAssocTypeDAO 
     */
    synchronized public static AlleleMarkerAssocTypeDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own AlleleMarkerAssocTypeDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(AlleleMarkerAssocTypeDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new AlleleMarkerAssocTypeDTO instance.
     *
     * @return the new AlleleMarkerAssocTypeDTO 
     */
    public AlleleMarkerAssocTypeDTO createAlleleMarkerAssocTypeDTO() {
        return new AlleleMarkerAssocTypeDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a AlleleMarkerAssocTypeDTO from the AlleleMarkerAssocType using its key fields.
     *
     * @return a unique AlleleMarkerAssocTypeDTO 
     */
    public AlleleMarkerAssocTypeDTO loadByPrimaryKey(Long AlleleMarkerAssocTypeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssocType WHERE AlleleMarkerAssocType._AlleleMarkerAssocType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleMarkerAssocTypeKey);
            List<AlleleMarkerAssocTypeDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long AlleleMarkerAssocTypeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from AlleleMarkerAssocType WHERE AlleleMarkerAssocType._AlleleMarkerAssocType_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, AlleleMarkerAssocTypeKey);
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
     * Loads all the rows from AlleleMarkerAssocType.
     *
     * @return a List of AlleleMarkerAssocTypeDAO objects
     */
    public List<AlleleMarkerAssocTypeDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from AlleleMarkerAssocType, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleMarkerAssocTypeDAO objects
     */
    public List<AlleleMarkerAssocTypeDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM AlleleMarkerAssocType",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of AlleleMarkerAssocTypeDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting AlleleMarkerAssocTypeDTO table 
     */
    public List<AlleleMarkerAssocTypeDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of AlleleMarkerAssocTypeDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleMarkerAssocTypeDTO table 
     */
    public List<AlleleMarkerAssocTypeDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of AlleleMarkerAssocTypeDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting AlleleMarkerAssocTypeDTO table 
     */
    public List<AlleleMarkerAssocTypeDTO> loadByWhere(String where, 
                                                     int[] fieldList, 
                                                     int startRow, 
                                                     int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from AlleleMarkerAssocType " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from AlleleMarkerAssocType ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<AlleleMarkerAssocTypeDTO> v = new ArrayList<AlleleMarkerAssocTypeDTO>();
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
     * Deletes all rows from AlleleMarkerAssocType table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the AlleleMarkerAssocType table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM AlleleMarkerAssocType " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the AlleleMarkerAssocTypeDTO pObject into the database.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to be saved
     */
    public AlleleMarkerAssocTypeDTO save(AlleleMarkerAssocTypeDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getAlleleMarkerAssocTypeKey() == null) {
            Object obj = max(ID__ALLELEMARKERASSOCTYPE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setAlleleMarkerAssocTypeKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into AlleleMarkerAssocType (");
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AlleleMarkerAssocType_key");
                    _dirtyCount++;
                }

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("name");
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

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
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
                _sql = new StringBuffer("UPDATE AlleleMarkerAssocType SET ");
                boolean useComma=false;

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AlleleMarkerAssocType_key").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
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
                _sql.append("AlleleMarkerAssocType._AlleleMarkerAssocType_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKeyOriginal());
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
     * Saves a List of AlleleMarkerAssocTypeDTO objects into the database.
     *
     * @param pObjects the AlleleMarkerAssocTypeDTO pObject table to be saved
     * @return the saved AlleleMarkerAssocTypeDTO List.
     */
    public List<AlleleMarkerAssocTypeDTO> save(List<AlleleMarkerAssocTypeDTO> pObjects) throws SQLException {
        for (AlleleMarkerAssocTypeDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique AlleleMarkerAssocTypeDTO object from a template
     *
     * @param pObject the AlleleMarkerAssocTypeDTO object to look for
     * @return the pObject matching the template
     */
    public AlleleMarkerAssocTypeDTO loadUniqueUsingTemplate(AlleleMarkerAssocTypeDTO pObject) 
        throws SQLException {
         List<AlleleMarkerAssocTypeDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of AlleleMarkerAssocTypeDTO objects from a template one.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO template to look for
     * @return all the AlleleMarkerAssocTypeDTO objects matching the template
     */
    public List<AlleleMarkerAssocTypeDTO> loadUsingTemplate(AlleleMarkerAssocTypeDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of AlleleMarkerAssocTypeDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the AlleleMarkerAssocTypeDTO matching the template
     */
    public List<AlleleMarkerAssocTypeDTO> loadUsingTemplate(AlleleMarkerAssocTypeDTO pObject,
                                                           int startRow,
                                                           int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from AlleleMarkerAssocType WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleMarkerAssocType_key= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
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
    
             if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
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
     * Deletes rows using a AlleleMarkerAssocTypeDTO template.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(AlleleMarkerAssocTypeDTO pObject) throws SQLException {
        if (pObject.isAlleleMarkerAssocTypeKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getAlleleMarkerAssocTypeKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM AlleleMarkerAssocType WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isAlleleMarkerAssocTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AlleleMarkerAssocType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("name").append("=?");
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
    
            if (pObject.isAlleleMarkerAssocTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
            }
    
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
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
     * Retrieves a List of AlleleDTO objects using the relation table AlleleMarkerAssoc given a AlleleMarkerAssocTypeDTO object.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to be used
     * @return a List of AlleleDTO objects
     */
    // MANY TO MANY
    public List<AlleleDTO> loadAlleleViaAlleleMarkerAssoc(AlleleMarkerAssocTypeDTO pObject) 
        throws SQLException {
        return loadAlleleViaAlleleMarkerAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of AlleleDTO objects using the relation table AlleleMarkerAssoc given a AlleleMarkerAssocTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleDTO objects
     */
    // MANY TO MANY
    public List<AlleleDTO> loadAlleleViaAlleleMarkerAssoc(AlleleMarkerAssocTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Allele, ");
        strSQL.append("        AlleleMarkerAssoc");
        strSQL.append("  where AlleleMarkerAssoc._AlleleMarkerAssocType_key = ?");
        strSQL.append("    and AlleleMarkerAssoc._Allele_key = Allele._Allele_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleMarkerAssocTypeKey());
             return AlleleDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of MarkerDTO objects using the relation table AlleleMarkerAssoc given a AlleleMarkerAssocTypeDTO object.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to be used
     * @return a List of MarkerDTO objects
     */
    // MANY TO MANY
    public List<MarkerDTO> loadMarkerViaAlleleMarkerAssoc(AlleleMarkerAssocTypeDTO pObject) 
        throws SQLException {
        return loadMarkerViaAlleleMarkerAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of MarkerDTO objects using the relation table AlleleMarkerAssoc given a AlleleMarkerAssocTypeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MarkerDTO objects
     */
    // MANY TO MANY
    public List<MarkerDTO> loadMarkerViaAlleleMarkerAssoc(AlleleMarkerAssocTypeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Marker, ");
        strSQL.append("        AlleleMarkerAssoc");
        strSQL.append("  where AlleleMarkerAssoc._AlleleMarkerAssocType_key = ?");
        strSQL.append("    and AlleleMarkerAssoc._Marker_key = Marker._Marker_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getAlleleMarkerAssocTypeKey());
             return MarkerDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table AlleleMarkerAssocType.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from AlleleMarkerAssocType";
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
                    case ID__ALLELEMARKERASSOCTYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NAME:
                        iReturn = rs.getString(1);
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
     * Retrieves the min value for a specified column of the table AlleleMarkerAssocType.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from AlleleMarkerAssocType";
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
                    case ID__ALLELEMARKERASSOCTYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NAME:
                        iReturn = (String)rs.getObject(1);
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
     * Retrieves the number of rows of the table AlleleMarkerAssocType.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table AlleleMarkerAssocType with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from AlleleMarkerAssocType " + where;
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
     * Retrieves the number of rows of the table AlleleMarkerAssocType with a prepared statement.
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
     * Looks for the number of elements of a specific AlleleMarkerAssocTypeDTO pObject given a c
     *
     * @param pObject the AlleleMarkerAssocTypeDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(AlleleMarkerAssocTypeDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from AlleleMarkerAssocType WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleMarkerAssocType_key= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
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
    
                if (pObject.isAlleleMarkerAssocTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleMarkerAssocTypeKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
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
     * Transforms a ResultSet iterating on the AlleleMarkerAssocType on a AlleleMarkerAssocTypeDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting AlleleMarkerAssocTypeDTO pObject
     */
    public AlleleMarkerAssocTypeDTO decodeRow(ResultSet rs) throws SQLException {
        AlleleMarkerAssocTypeDTO pObject = createAlleleMarkerAssocTypeDTO();
        pObject.setAlleleMarkerAssocTypeKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setName(rs.getString(2));
        pObject.setDescription(rs.getString(3));
        pObject.setCreateUser(rs.getString(4));
        pObject.setCreateDate(rs.getTimestamp(5));
        pObject.setUpdateUser(rs.getString(6));
        pObject.setUpdateDate(rs.getTimestamp(7));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the AlleleMarkerAssocType table on a AlleleMarkerAssocTypeDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting AlleleMarkerAssocTypeDTO pObject
     */
    public AlleleMarkerAssocTypeDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        AlleleMarkerAssocTypeDTO pObject = createAlleleMarkerAssocTypeDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__ALLELEMARKERASSOCTYPE_KEY:
                    ++pos;
                    pObject.setAlleleMarkerAssocTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
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
     * @return a List of AlleleMarkerAssocTypeDTO objects
     */
    public List<AlleleMarkerAssocTypeDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of AlleleMarkerAssocTypeDTO objects
     */
    public List<AlleleMarkerAssocTypeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of AlleleMarkerAssocTypeDTO objects
     */
    public List<AlleleMarkerAssocTypeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<AlleleMarkerAssocTypeDTO> v = new ArrayList<AlleleMarkerAssocTypeDTO>();
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
