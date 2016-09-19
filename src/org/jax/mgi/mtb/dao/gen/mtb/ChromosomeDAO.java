
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Chromosome table.
 */
public class ChromosomeDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Chromosome_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__CHROMOSOME_KEY = 0;
    public static final int TYPE__CHROMOSOME_KEY = Types.NUMERIC;
    public static final String NAME__CHROMOSOME_KEY = "_Chromosome_key";

    /**
     * Column _Organism_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ORGANISM_KEY = 1;
    public static final int TYPE__ORGANISM_KEY = Types.NUMERIC;
    public static final String NAME__ORGANISM_KEY = "_Organism_key";

    /**
     * Column chromosome of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CHROMOSOME = 2;
    public static final int TYPE_CHROMOSOME = Types.VARCHAR;
    public static final String NAME_CHROMOSOME = "chromosome";

    /**
     * Column orderNum of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_ORDERNUM = 3;
    public static final int TYPE_ORDERNUM = Types.NUMERIC;
    public static final String NAME_ORDERNUM = "orderNum";

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


    private static final String TABLE_NAME = "Chromosome";

    /**
     * Create an array of type string containing all the fields of the Chromosome table.
     */
    private static final String[] FIELD_NAMES = {
        "Chromosome._Chromosome_key"
        ,"Chromosome._Organism_key"
        ,"Chromosome.chromosome"
        ,"Chromosome.orderNum"
        ,"Chromosome.create_user"
        ,"Chromosome.create_date"
        ,"Chromosome.update_user"
        ,"Chromosome.update_date"
    };

    /**
     * Create an array of type containing all the fields of the Chromosome table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the Chromosome table.
     */
    private static final String ALL_FIELDS = "Chromosome._Chromosome_key"
                            + ",Chromosome._Organism_key"
                            + ",Chromosome.chromosome"
                            + ",Chromosome.orderNum"
                            + ",Chromosome.create_user"
                            + ",Chromosome.create_date"
                            + ",Chromosome.update_user"
                            + ",Chromosome.update_date";


    // ----------------------------------------------------- Instance Variables

    private static ChromosomeDAO singleton = new ChromosomeDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the ChromosomeDAO singleton.
     *
     * @return ChromosomeDAO 
     */
    synchronized public static ChromosomeDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own ChromosomeDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ChromosomeDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new ChromosomeDTO instance.
     *
     * @return the new ChromosomeDTO 
     */
    public ChromosomeDTO createChromosomeDTO() {
        return new ChromosomeDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a ChromosomeDTO from the Chromosome using its key fields.
     *
     * @return a unique ChromosomeDTO 
     */
    public ChromosomeDTO loadByPrimaryKey(Long ChromosomeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Chromosome WHERE Chromosome._Chromosome_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ChromosomeKey);
            List<ChromosomeDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ChromosomeKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Chromosome WHERE Chromosome._Chromosome_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ChromosomeKey);
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
     * Loads a List of ChromosomeDTO objects from the Chromosome table using its _Organism_key field.
     *
     * @return a List of ChromosomeDTO objects
     */
    public List<ChromosomeDTO> loadByOrganismKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Chromosome WHERE _Organism_key=?",
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
     * Deletes from the Chromosome table by _Organism_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByOrganismKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM Chromosome WHERE _Organism_key=?");
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
     * Retrieves the OrganismDTO object from the Chromosome._Organism_key field.
     *
     * @param pObject the ChromosomeDTO 
     * @return the associated OrganismDTO pObject
     */
    public OrganismDTO getOrganismDTO(ChromosomeDTO pObject) 
    throws SQLException {
        OrganismDTO other = OrganismDAO.getInstance().createOrganismDTO();
        other.setOrganismKey(pObject.getOrganismKey());
        return OrganismDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the ChromosomeDTO object to the OrganismDTO object.
     *
     * @param pObject the ChromosomeDTO object to use
     * @param pObjectToBeSet the OrganismDTO object to associate to the ChromosomeDTO 
     * @return the associated OrganismDTO pObject
     */
    // SET IMPORTED
    public ChromosomeDTO setOrganismDTO(ChromosomeDTO pObject,OrganismDTO pObjectToBeSet) {
        pObject.setOrganismKey(pObjectToBeSet.getOrganismKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from Chromosome.
     *
     * @return a List of ChromosomeDAO objects
     */
    public List<ChromosomeDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Chromosome, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ChromosomeDAO objects
     */
    public List<ChromosomeDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Chromosome",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of ChromosomeDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ChromosomeDTO table 
     */
    public List<ChromosomeDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of ChromosomeDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ChromosomeDTO table 
     */
    public List<ChromosomeDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of ChromosomeDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting ChromosomeDTO table 
     */
    public List<ChromosomeDTO> loadByWhere(String where, 
                                          int[] fieldList, 
                                          int startRow, 
                                          int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Chromosome " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Chromosome ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<ChromosomeDTO> v = new ArrayList<ChromosomeDTO>();
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
     * Deletes all rows from Chromosome table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Chromosome table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Chromosome " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the ChromosomeDTO pObject into the database.
     *
     * @param pObject the ChromosomeDTO pObject to be saved
     */
    public ChromosomeDTO save(ChromosomeDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getChromosomeKey() == null) {
            Object obj = max(ID__CHROMOSOME_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setChromosomeKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Chromosome (");
    
                if (pObject.isChromosomeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Chromosome_key");
                    _dirtyCount++;
                }

                if (pObject.isOrganismKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Organism_key");
                    _dirtyCount++;
                }

                if (pObject.isChromosomeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("chromosome");
                    _dirtyCount++;
                }

                if (pObject.isOrderNumModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("orderNum");
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

                if (pObject.isChromosomeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
                }
    
                if (pObject.isOrganismKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganismKey());
                }
    
                if (pObject.isChromosomeModified()) {
                    ps.setString(++_dirtyCount, pObject.getChromosome());
                }
    
                if (pObject.isOrderNumModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrderNum());
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
                _sql = new StringBuffer("UPDATE Chromosome SET ");
                boolean useComma=false;

                if (pObject.isChromosomeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Chromosome_key").append("=?");
                }

                if (pObject.isOrganismKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Organism_key").append("=?");
                }

                if (pObject.isChromosomeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("chromosome").append("=?");
                }

                if (pObject.isOrderNumModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("orderNum").append("=?");
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
                _sql.append("Chromosome._Chromosome_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isChromosomeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
                }

                if (pObject.isOrganismKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganismKey());
                }

                if (pObject.isChromosomeModified()) {
                      ps.setString(++_dirtyCount, pObject.getChromosome());
                }

                if (pObject.isOrderNumModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrderNum());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKeyOriginal());
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
     * Saves a List of ChromosomeDTO objects into the database.
     *
     * @param pObjects the ChromosomeDTO pObject table to be saved
     * @return the saved ChromosomeDTO List.
     */
    public List<ChromosomeDTO> save(List<ChromosomeDTO> pObjects) throws SQLException {
        for (ChromosomeDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique ChromosomeDTO object from a template
     *
     * @param pObject the ChromosomeDTO object to look for
     * @return the pObject matching the template
     */
    public ChromosomeDTO loadUniqueUsingTemplate(ChromosomeDTO pObject) 
        throws SQLException {
         List<ChromosomeDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of ChromosomeDTO objects from a template one.
     *
     * @param pObject the ChromosomeDTO template to look for
     * @return all the ChromosomeDTO objects matching the template
     */
    public List<ChromosomeDTO> loadUsingTemplate(ChromosomeDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of ChromosomeDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the ChromosomeDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the ChromosomeDTO matching the template
     */
    public List<ChromosomeDTO> loadUsingTemplate(ChromosomeDTO pObject,
                                                int startRow,
                                                int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Chromosome WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isChromosomeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Chromosome_key= ?");
             }
    
             if (pObject.isOrganismKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organism_key= ?");
             }
    
             if (pObject.isChromosomeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("chromosome= ?");
             }
    
             if (pObject.isOrderNumModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("orderNum= ?");
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
    
             if (pObject.isChromosomeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
             }
    
             if (pObject.isOrganismKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganismKey());
             }
    
             if (pObject.isChromosomeModified()) {
                 ps.setString(++_dirtyCount, pObject.getChromosome());
             }
    
             if (pObject.isOrderNumModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrderNum());
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
     * Deletes rows using a ChromosomeDTO template.
     *
     * @param pObject the ChromosomeDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(ChromosomeDTO pObject) throws SQLException {
        if (pObject.isChromosomeKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getChromosomeKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Chromosome WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isChromosomeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Chromosome_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isOrganismKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Organism_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isChromosomeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("chromosome").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isOrderNumInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("orderNum").append("=?");
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
    
            if (pObject.isChromosomeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
            }
    
            if (pObject.isOrganismKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganismKey());
            }
    
            if (pObject.isChromosomeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getChromosome());
            }
    
            if (pObject.isOrderNumInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrderNum());
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
     * Retrieves a List of TumorGeneticChangesDTO objects using the relation table GeneticChangeChromosomeAssoc given a ChromosomeDTO object.
     *
     * @param pObject the ChromosomeDTO pObject to be used
     * @return a List of TumorGeneticChangesDTO objects
     */
    // MANY TO MANY
    public List<TumorGeneticChangesDTO> loadTumorGeneticChangesViaGeneticChangeChromosomeAssoc(ChromosomeDTO pObject) 
        throws SQLException {
        return loadTumorGeneticChangesViaGeneticChangeChromosomeAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorGeneticChangesDTO objects using the relation table GeneticChangeChromosomeAssoc given a ChromosomeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the ChromosomeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorGeneticChangesDTO objects
     */
    // MANY TO MANY
    public List<TumorGeneticChangesDTO> loadTumorGeneticChangesViaGeneticChangeChromosomeAssoc(ChromosomeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorGeneticChanges, ");
        strSQL.append("        GeneticChangeChromosomeAssoc");
        strSQL.append("  where GeneticChangeChromosomeAssoc._Chromosome_key = ?");
        strSQL.append("    and GeneticChangeChromosomeAssoc._TumorGeneticChanges_key = TumorGeneticChanges._TumorGeneticChanges_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getChromosomeKey());
             return TumorGeneticChangesDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of MarkerTypeDTO objects using the relation table Marker given a ChromosomeDTO object.
     *
     * @param pObject the ChromosomeDTO pObject to be used
     * @return a List of MarkerTypeDTO objects
     */
    // MANY TO MANY
    public List<MarkerTypeDTO> loadMarkerTypeViaMarker(ChromosomeDTO pObject) 
        throws SQLException {
        return loadMarkerTypeViaMarker(pObject, 1, -1);
    }

    /**
     * Retrieves a List of MarkerTypeDTO objects using the relation table Marker given a ChromosomeDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the ChromosomeDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MarkerTypeDTO objects
     */
    // MANY TO MANY
    public List<MarkerTypeDTO> loadMarkerTypeViaMarker(ChromosomeDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from MarkerType, ");
        strSQL.append("        Marker");
        strSQL.append("  where Marker._Chromosome_key = ?");
        strSQL.append("    and Marker._MarkerType_key = MarkerType._MarkerType_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getChromosomeKey());
             return MarkerTypeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table Chromosome.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Chromosome";
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
                    case ID__CHROMOSOME_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ORGANISM_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_CHROMOSOME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ORDERNUM:
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
     * Retrieves the min value for a specified column of the table Chromosome.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Chromosome";
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
                    case ID__CHROMOSOME_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ORGANISM_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_CHROMOSOME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ORDERNUM:
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
     * Retrieves the number of rows of the table Chromosome.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Chromosome with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Chromosome " + where;
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
     * Retrieves the number of rows of the table Chromosome with a prepared statement.
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
     * Looks for the number of elements of a specific ChromosomeDTO pObject given a c
     *
     * @param pObject the ChromosomeDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(ChromosomeDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Chromosome WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isChromosomeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Chromosome_key= ?");
                }
    
                if (pObject.isOrganismKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Organism_key= ?");
                }
    
                if (pObject.isChromosomeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("chromosome= ?");
                }
    
                if (pObject.isOrderNumModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("orderNum= ?");
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
    
                if (pObject.isChromosomeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getChromosomeKey());
                }
    
                if (pObject.isOrganismKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganismKey());
                }
    
                if (pObject.isChromosomeModified()) {
                    ps.setString(++_dirtyCount, pObject.getChromosome());
                }
    
                if (pObject.isOrderNumModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrderNum());
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
     * Transforms a ResultSet iterating on the Chromosome on a ChromosomeDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ChromosomeDTO pObject
     */
    public ChromosomeDTO decodeRow(ResultSet rs) throws SQLException {
        ChromosomeDTO pObject = createChromosomeDTO();
        pObject.setChromosomeKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setOrganismKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setChromosome(rs.getString(3));
        pObject.setOrderNum(DAOManagerMTB.getLong(rs, 4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Chromosome table on a ChromosomeDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ChromosomeDTO pObject
     */
    public ChromosomeDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        ChromosomeDTO pObject = createChromosomeDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__CHROMOSOME_KEY:
                    ++pos;
                    pObject.setChromosomeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ORGANISM_KEY:
                    ++pos;
                    pObject.setOrganismKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_CHROMOSOME:
                    ++pos;
                    pObject.setChromosome(rs.getString(pos));
                    break;
                case ID_ORDERNUM:
                    ++pos;
                    pObject.setOrderNum(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of ChromosomeDTO objects
     */
    public List<ChromosomeDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of ChromosomeDTO objects
     */
    public List<ChromosomeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of ChromosomeDTO objects
     */
    public List<ChromosomeDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<ChromosomeDTO> v = new ArrayList<ChromosomeDTO>();
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
