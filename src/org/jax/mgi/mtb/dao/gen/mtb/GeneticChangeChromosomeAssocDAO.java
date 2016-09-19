
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the GeneticChangeChromosomeAssoc table.
 */
public class GeneticChangeChromosomeAssocDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _TumorGeneticChanges_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORGENETICCHANGES_KEY = 0;
    public static final int TYPE__TUMORGENETICCHANGES_KEY = Types.NUMERIC;
    public static final String NAME__TUMORGENETICCHANGES_KEY = "_TumorGeneticChanges_key";

    /**
     * Column _Chromosome_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CHROMOSOME_KEY = 1;
    public static final int TYPE__CHROMOSOME_KEY = Types.NUMERIC;
    public static final String NAME__CHROMOSOME_KEY = "_Chromosome_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 2;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 3;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 4;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 5;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "GeneticChangeChromosomeAssoc";

    /**
     * Create an array of type string containing all the fields of the GeneticChangeChromosomeAssoc table.
     */
    private static final String[] FIELD_NAMES = {
        "GeneticChangeChromosomeAssoc._TumorGeneticChanges_key"
        ,"GeneticChangeChromosomeAssoc._Chromosome_key"
        ,"GeneticChangeChromosomeAssoc.create_user"
        ,"GeneticChangeChromosomeAssoc.create_date"
        ,"GeneticChangeChromosomeAssoc.update_user"
        ,"GeneticChangeChromosomeAssoc.update_date"
    };

    /**
     * Create an array of type containing all the fields of the GeneticChangeChromosomeAssoc table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the GeneticChangeChromosomeAssoc table.
     */
    private static final String ALL_FIELDS = "GeneticChangeChromosomeAssoc._TumorGeneticChanges_key"
                            + ",GeneticChangeChromosomeAssoc._Chromosome_key"
                            + ",GeneticChangeChromosomeAssoc.create_user"
                            + ",GeneticChangeChromosomeAssoc.create_date"
                            + ",GeneticChangeChromosomeAssoc.update_user"
                            + ",GeneticChangeChromosomeAssoc.update_date";


    // ----------------------------------------------------- Instance Variables

    private static GeneticChangeChromosomeAssocDAO singleton = new GeneticChangeChromosomeAssocDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the GeneticChangeChromosomeAssocDAO singleton.
     *
     * @return GeneticChangeChromosomeAssocDAO 
     */
    synchronized public static GeneticChangeChromosomeAssocDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own GeneticChangeChromosomeAssocDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(GeneticChangeChromosomeAssocDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new GeneticChangeChromosomeAssocDTO instance.
     *
     * @return the new GeneticChangeChromosomeAssocDTO 
     */
    public GeneticChangeChromosomeAssocDTO createGeneticChangeChromosomeAssocDTO() {
        return new GeneticChangeChromosomeAssocDTO();
    }

    
    
    //-------------------------------------------------------------------------
    // FOREIGN KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a List of GeneticChangeChromosomeAssocDTO objects from the GeneticChangeChromosomeAssoc table using its _Chromosome_key field.
     *
     * @return a List of GeneticChangeChromosomeAssocDTO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByChromosomeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM GeneticChangeChromosomeAssoc WHERE _Chromosome_key=?",
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
     * Deletes from the GeneticChangeChromosomeAssoc table by _Chromosome_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByChromosomeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM GeneticChangeChromosomeAssoc WHERE _Chromosome_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of GeneticChangeChromosomeAssocDTO objects from the GeneticChangeChromosomeAssoc table using its _TumorGeneticChanges_key field.
     *
     * @return a List of GeneticChangeChromosomeAssocDTO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByTumorGeneticChangesKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM GeneticChangeChromosomeAssoc WHERE _TumorGeneticChanges_key=?",
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
     * Deletes from the GeneticChangeChromosomeAssoc table by _TumorGeneticChanges_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByTumorGeneticChangesKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM GeneticChangeChromosomeAssoc WHERE _TumorGeneticChanges_key=?");
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
     * Retrieves the ChromosomeDTO object from the GeneticChangeChromosomeAssoc._Chromosome_key field.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO 
     * @return the associated ChromosomeDTO pObject
     */
    public ChromosomeDTO getChromosomeDTO(GeneticChangeChromosomeAssocDTO pObject) 
    throws SQLException {
        ChromosomeDTO other = ChromosomeDAO.getInstance().createChromosomeDTO();
        other.setChromosomeKey(pObject.getChromosomeKey());
        return ChromosomeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the GeneticChangeChromosomeAssocDTO object to the ChromosomeDTO object.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO object to use
     * @param pObjectToBeSet the ChromosomeDTO object to associate to the GeneticChangeChromosomeAssocDTO 
     * @return the associated ChromosomeDTO pObject
     */
    // SET IMPORTED
    public GeneticChangeChromosomeAssocDTO setChromosomeDTO(GeneticChangeChromosomeAssocDTO pObject,ChromosomeDTO pObjectToBeSet) {
        pObject.setChromosomeKey(pObjectToBeSet.getChromosomeKey());
        return pObject;
    }

    /**
     * Retrieves the TumorGeneticChangesDTO object from the GeneticChangeChromosomeAssoc._TumorGeneticChanges_key field.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO 
     * @return the associated TumorGeneticChangesDTO pObject
     */
    public TumorGeneticChangesDTO getTumorGeneticChangesDTO(GeneticChangeChromosomeAssocDTO pObject) 
    throws SQLException {
        TumorGeneticChangesDTO other = TumorGeneticChangesDAO.getInstance().createTumorGeneticChangesDTO();
        other.setTumorGeneticChangesKey(pObject.getTumorGeneticChangesKey());
        return TumorGeneticChangesDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the GeneticChangeChromosomeAssocDTO object to the TumorGeneticChangesDTO object.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO object to use
     * @param pObjectToBeSet the TumorGeneticChangesDTO object to associate to the GeneticChangeChromosomeAssocDTO 
     * @return the associated TumorGeneticChangesDTO pObject
     */
    // SET IMPORTED
    public GeneticChangeChromosomeAssocDTO setTumorGeneticChangesDTO(GeneticChangeChromosomeAssocDTO pObject,TumorGeneticChangesDTO pObjectToBeSet) {
        pObject.setTumorGeneticChangesKey(pObjectToBeSet.getTumorGeneticChangesKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from GeneticChangeChromosomeAssoc.
     *
     * @return a List of GeneticChangeChromosomeAssocDAO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from GeneticChangeChromosomeAssoc, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of GeneticChangeChromosomeAssocDAO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM GeneticChangeChromosomeAssoc",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of GeneticChangeChromosomeAssocDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting GeneticChangeChromosomeAssocDTO table 
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of GeneticChangeChromosomeAssocDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting GeneticChangeChromosomeAssocDTO table 
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of GeneticChangeChromosomeAssocDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting GeneticChangeChromosomeAssocDTO table 
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByWhere(String where, 
                                                            int[] fieldList, 
                                                            int startRow, 
                                                            int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from GeneticChangeChromosomeAssoc " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from GeneticChangeChromosomeAssoc ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<GeneticChangeChromosomeAssocDTO> v = new ArrayList<GeneticChangeChromosomeAssocDTO>();
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
     * Deletes all rows from GeneticChangeChromosomeAssoc table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the GeneticChangeChromosomeAssoc table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM GeneticChangeChromosomeAssoc " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the GeneticChangeChromosomeAssocDTO pObject into the database.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO pObject to be saved
     */
    public GeneticChangeChromosomeAssocDTO save(GeneticChangeChromosomeAssocDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into GeneticChangeChromosomeAssoc (");
    
                if (pObject.isTumorGeneticChangesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorGeneticChanges_key");
                    _dirtyCount++;
                }

                if (pObject.isChromosomeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Chromosome_key");
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

                if (pObject.isTumorGeneticChangesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
                }
    
                if (pObject.isChromosomeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
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
                _sql = new StringBuffer("UPDATE GeneticChangeChromosomeAssoc SET ");
                boolean useComma=false;

                if (pObject.isTumorGeneticChangesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorGeneticChanges_key").append("=?");
                }

                if (pObject.isChromosomeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Chromosome_key").append("=?");
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
                _sql.append("");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorGeneticChangesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
                }

                if (pObject.isChromosomeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
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
     * Saves a List of GeneticChangeChromosomeAssocDTO objects into the database.
     *
     * @param pObjects the GeneticChangeChromosomeAssocDTO pObject table to be saved
     * @return the saved GeneticChangeChromosomeAssocDTO List.
     */
    public List<GeneticChangeChromosomeAssocDTO> save(List<GeneticChangeChromosomeAssocDTO> pObjects) throws SQLException {
        for (GeneticChangeChromosomeAssocDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique GeneticChangeChromosomeAssocDTO object from a template
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO object to look for
     * @return the pObject matching the template
     */
    public GeneticChangeChromosomeAssocDTO loadUniqueUsingTemplate(GeneticChangeChromosomeAssocDTO pObject) 
        throws SQLException {
         List<GeneticChangeChromosomeAssocDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of GeneticChangeChromosomeAssocDTO objects from a template one.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO template to look for
     * @return all the GeneticChangeChromosomeAssocDTO objects matching the template
     */
    public List<GeneticChangeChromosomeAssocDTO> loadUsingTemplate(GeneticChangeChromosomeAssocDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of GeneticChangeChromosomeAssocDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the GeneticChangeChromosomeAssocDTO matching the template
     */
    public List<GeneticChangeChromosomeAssocDTO> loadUsingTemplate(GeneticChangeChromosomeAssocDTO pObject,
                                                                  int startRow,
                                                                  int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from GeneticChangeChromosomeAssoc WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorGeneticChangesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorGeneticChanges_key= ?");
             }
    
             if (pObject.isChromosomeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Chromosome_key= ?");
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
    
             if (pObject.isTumorGeneticChangesKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
             }
    
             if (pObject.isChromosomeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
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
     * Deletes rows using a GeneticChangeChromosomeAssocDTO template.
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(GeneticChangeChromosomeAssocDTO pObject) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM GeneticChangeChromosomeAssoc WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorGeneticChangesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorGeneticChanges_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isChromosomeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Chromosome_key").append("=?");
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
    
            if (pObject.isTumorGeneticChangesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
            }
    
            if (pObject.isChromosomeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
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
     * Retrieves the max value for a specified column of the table GeneticChangeChromosomeAssoc.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from GeneticChangeChromosomeAssoc";
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
                    case ID__TUMORGENETICCHANGES_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__CHROMOSOME_KEY:
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
     * Retrieves the min value for a specified column of the table GeneticChangeChromosomeAssoc.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from GeneticChangeChromosomeAssoc";
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
                    case ID__TUMORGENETICCHANGES_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__CHROMOSOME_KEY:
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
     * Retrieves the number of rows of the table GeneticChangeChromosomeAssoc.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table GeneticChangeChromosomeAssoc with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from GeneticChangeChromosomeAssoc " + where;
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
     * Retrieves the number of rows of the table GeneticChangeChromosomeAssoc with a prepared statement.
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
     * Looks for the number of elements of a specific GeneticChangeChromosomeAssocDTO pObject given a c
     *
     * @param pObject the GeneticChangeChromosomeAssocDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(GeneticChangeChromosomeAssocDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from GeneticChangeChromosomeAssoc WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorGeneticChangesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorGeneticChanges_key= ?");
                }
    
                if (pObject.isChromosomeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Chromosome_key= ?");
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
    
                if (pObject.isTumorGeneticChangesKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
                }
    
                if (pObject.isChromosomeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
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
     * Transforms a ResultSet iterating on the GeneticChangeChromosomeAssoc on a GeneticChangeChromosomeAssocDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting GeneticChangeChromosomeAssocDTO pObject
     */
    public GeneticChangeChromosomeAssocDTO decodeRow(ResultSet rs) throws SQLException {
        GeneticChangeChromosomeAssocDTO pObject = createGeneticChangeChromosomeAssocDTO();
        pObject.setTumorGeneticChangesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setChromosomeKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setCreateUser(rs.getString(3));
        pObject.setCreateDate(rs.getTimestamp(4));
        pObject.setUpdateUser(rs.getString(5));
        pObject.setUpdateDate(rs.getTimestamp(6));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the GeneticChangeChromosomeAssoc table on a GeneticChangeChromosomeAssocDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting GeneticChangeChromosomeAssocDTO pObject
     */
    public GeneticChangeChromosomeAssocDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        GeneticChangeChromosomeAssocDTO pObject = createGeneticChangeChromosomeAssocDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORGENETICCHANGES_KEY:
                    ++pos;
                    pObject.setTumorGeneticChangesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__CHROMOSOME_KEY:
                    ++pos;
                    pObject.setChromosomeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of GeneticChangeChromosomeAssocDTO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of GeneticChangeChromosomeAssocDTO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of GeneticChangeChromosomeAssocDTO objects
     */
    public List<GeneticChangeChromosomeAssocDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<GeneticChangeChromosomeAssocDTO> v = new ArrayList<GeneticChangeChromosomeAssocDTO>();
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
