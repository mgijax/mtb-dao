
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the TumorFrequencyTreatments table.
 */
public class TumorFrequencyTreatmentsDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _TumorFrequencyTreatments_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORFREQUENCYTREATMENTS_KEY = 0;
    public static final int TYPE__TUMORFREQUENCYTREATMENTS_KEY = Types.NUMERIC;
    public static final String NAME__TUMORFREQUENCYTREATMENTS_KEY = "_TumorFrequencyTreatments_key";

    /**
     * Column _TumorFrequency_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORFREQUENCY_KEY = 1;
    public static final int TYPE__TUMORFREQUENCY_KEY = Types.NUMERIC;
    public static final String NAME__TUMORFREQUENCY_KEY = "_TumorFrequency_key";

    /**
     * Column _Agent_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__AGENT_KEY = 2;
    public static final int TYPE__AGENT_KEY = Types.NUMERIC;
    public static final String NAME__AGENT_KEY = "_Agent_key";

    /**
     * Column dose of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_DOSE = 3;
    public static final int TYPE_DOSE = Types.NUMERIC;
    public static final String NAME_DOSE = "dose";

    /**
     * Column age of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_AGE = 4;
    public static final int TYPE_AGE = Types.NUMERIC;
    public static final String NAME_AGE = "age";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 5;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 6;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 7;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 8;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "TumorFrequencyTreatments";

    /**
     * Create an array of type string containing all the fields of the TumorFrequencyTreatments table.
     */
    private static final String[] FIELD_NAMES = {
        "TumorFrequencyTreatments._TumorFrequencyTreatments_key"
        ,"TumorFrequencyTreatments._TumorFrequency_key"
        ,"TumorFrequencyTreatments._Agent_key"
        ,"TumorFrequencyTreatments.dose"
        ,"TumorFrequencyTreatments.age"
        ,"TumorFrequencyTreatments.create_user"
        ,"TumorFrequencyTreatments.create_date"
        ,"TumorFrequencyTreatments.update_user"
        ,"TumorFrequencyTreatments.update_date"
    };

    /**
     * Create an array of type containing all the fields of the TumorFrequencyTreatments table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
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
     * Field that contains the comma separated fields of the TumorFrequencyTreatments table.
     */
    private static final String ALL_FIELDS = "TumorFrequencyTreatments._TumorFrequencyTreatments_key"
                            + ",TumorFrequencyTreatments._TumorFrequency_key"
                            + ",TumorFrequencyTreatments._Agent_key"
                            + ",TumorFrequencyTreatments.dose"
                            + ",TumorFrequencyTreatments.age"
                            + ",TumorFrequencyTreatments.create_user"
                            + ",TumorFrequencyTreatments.create_date"
                            + ",TumorFrequencyTreatments.update_user"
                            + ",TumorFrequencyTreatments.update_date";


    // ----------------------------------------------------- Instance Variables

    private static TumorFrequencyTreatmentsDAO singleton = new TumorFrequencyTreatmentsDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the TumorFrequencyTreatmentsDAO singleton.
     *
     * @return TumorFrequencyTreatmentsDAO 
     */
    synchronized public static TumorFrequencyTreatmentsDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own TumorFrequencyTreatmentsDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(TumorFrequencyTreatmentsDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new TumorFrequencyTreatmentsDTO instance.
     *
     * @return the new TumorFrequencyTreatmentsDTO 
     */
    public TumorFrequencyTreatmentsDTO createTumorFrequencyTreatmentsDTO() {
        return new TumorFrequencyTreatmentsDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a TumorFrequencyTreatmentsDTO from the TumorFrequencyTreatments using its key fields.
     *
     * @return a unique TumorFrequencyTreatmentsDTO 
     */
    public TumorFrequencyTreatmentsDTO loadByPrimaryKey(Long TumorFrequencyTreatmentsKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequencyTreatments WHERE TumorFrequencyTreatments._TumorFrequencyTreatments_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorFrequencyTreatmentsKey);
            List<TumorFrequencyTreatmentsDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long TumorFrequencyTreatmentsKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from TumorFrequencyTreatments WHERE TumorFrequencyTreatments._TumorFrequencyTreatments_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorFrequencyTreatmentsKey);
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
     * Loads a List of TumorFrequencyTreatmentsDTO objects from the TumorFrequencyTreatments table using its _Agent_key field.
     *
     * @return a List of TumorFrequencyTreatmentsDTO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadByAgentKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequencyTreatments WHERE _Agent_key=?",
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
     * Deletes from the TumorFrequencyTreatments table by _Agent_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByAgentKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequencyTreatments WHERE _Agent_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorFrequencyTreatmentsDTO objects from the TumorFrequencyTreatments table using its _TumorFrequency_key field.
     *
     * @return a List of TumorFrequencyTreatmentsDTO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadByTumorFrequencyKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequencyTreatments WHERE _TumorFrequency_key=?",
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
     * Deletes from the TumorFrequencyTreatments table by _TumorFrequency_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByTumorFrequencyKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequencyTreatments WHERE _TumorFrequency_key=?");
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
     * Retrieves the AgentDTO object from the TumorFrequencyTreatments._Agent_key field.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO 
     * @return the associated AgentDTO pObject
     */
    public AgentDTO getAgentDTO(TumorFrequencyTreatmentsDTO pObject) 
    throws SQLException {
        AgentDTO other = AgentDAO.getInstance().createAgentDTO();
        other.setAgentKey(pObject.getAgentKey());
        return AgentDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyTreatmentsDTO object to the AgentDTO object.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO object to use
     * @param pObjectToBeSet the AgentDTO object to associate to the TumorFrequencyTreatmentsDTO 
     * @return the associated AgentDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyTreatmentsDTO setAgentDTO(TumorFrequencyTreatmentsDTO pObject,AgentDTO pObjectToBeSet) {
        pObject.setAgentKey(pObjectToBeSet.getAgentKey());
        return pObject;
    }

    /**
     * Retrieves the TumorFrequencyDTO object from the TumorFrequencyTreatments._TumorFrequency_key field.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    public TumorFrequencyDTO getTumorFrequencyDTO(TumorFrequencyTreatmentsDTO pObject) 
    throws SQLException {
        TumorFrequencyDTO other = TumorFrequencyDAO.getInstance().createTumorFrequencyDTO();
        other.setTumorFrequencyKey(pObject.getTumorFrequencyKey());
        return TumorFrequencyDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyTreatmentsDTO object to the TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO object to use
     * @param pObjectToBeSet the TumorFrequencyDTO object to associate to the TumorFrequencyTreatmentsDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyTreatmentsDTO setTumorFrequencyDTO(TumorFrequencyTreatmentsDTO pObject,TumorFrequencyDTO pObjectToBeSet) {
        pObject.setTumorFrequencyKey(pObjectToBeSet.getTumorFrequencyKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from TumorFrequencyTreatments.
     *
     * @return a List of TumorFrequencyTreatmentsDAO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from TumorFrequencyTreatments, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorFrequencyTreatmentsDAO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequencyTreatments",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of TumorFrequencyTreatmentsDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting TumorFrequencyTreatmentsDTO table 
     */
    public List<TumorFrequencyTreatmentsDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of TumorFrequencyTreatmentsDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorFrequencyTreatmentsDTO table 
     */
    public List<TumorFrequencyTreatmentsDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of TumorFrequencyTreatmentsDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorFrequencyTreatmentsDTO table 
     */
    public List<TumorFrequencyTreatmentsDTO> loadByWhere(String where, 
                                                        int[] fieldList, 
                                                        int startRow, 
                                                        int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from TumorFrequencyTreatments " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from TumorFrequencyTreatments ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<TumorFrequencyTreatmentsDTO> v = new ArrayList<TumorFrequencyTreatmentsDTO>();
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
     * Deletes all rows from TumorFrequencyTreatments table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the TumorFrequencyTreatments table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM TumorFrequencyTreatments " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the TumorFrequencyTreatmentsDTO pObject into the database.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO pObject to be saved
     */
    public TumorFrequencyTreatmentsDTO save(TumorFrequencyTreatmentsDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getTumorFrequencyTreatmentsKey() == null) {
            Object obj = max(ID__TUMORFREQUENCYTREATMENTS_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setTumorFrequencyTreatmentsKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into TumorFrequencyTreatments (");
    
                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorFrequencyTreatments_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorFrequency_key");
                    _dirtyCount++;
                }

                if (pObject.isAgentKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Agent_key");
                    _dirtyCount++;
                }

                if (pObject.isDoseModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("dose");
                    _dirtyCount++;
                }

                if (pObject.isAgeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("age");
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

                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKey());
                }
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isAgentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAgentKey());
                }
    
                if (pObject.isDoseModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getDose());
                }
    
                if (pObject.isAgeModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAge());
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
                _sql = new StringBuffer("UPDATE TumorFrequencyTreatments SET ");
                boolean useComma=false;

                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorFrequencyTreatments_key").append("=?");
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorFrequency_key").append("=?");
                }

                if (pObject.isAgentKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Agent_key").append("=?");
                }

                if (pObject.isDoseModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("dose").append("=?");
                }

                if (pObject.isAgeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("age").append("=?");
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
                _sql.append("TumorFrequencyTreatments._TumorFrequencyTreatments_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKey());
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }

                if (pObject.isAgentKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAgentKey());
                }

                if (pObject.isDoseModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getDose());
                }

                if (pObject.isAgeModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAge());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKeyOriginal());
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
     * Saves a List of TumorFrequencyTreatmentsDTO objects into the database.
     *
     * @param pObjects the TumorFrequencyTreatmentsDTO pObject table to be saved
     * @return the saved TumorFrequencyTreatmentsDTO List.
     */
    public List<TumorFrequencyTreatmentsDTO> save(List<TumorFrequencyTreatmentsDTO> pObjects) throws SQLException {
        for (TumorFrequencyTreatmentsDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique TumorFrequencyTreatmentsDTO object from a template
     *
     * @param pObject the TumorFrequencyTreatmentsDTO object to look for
     * @return the pObject matching the template
     */
    public TumorFrequencyTreatmentsDTO loadUniqueUsingTemplate(TumorFrequencyTreatmentsDTO pObject) 
        throws SQLException {
         List<TumorFrequencyTreatmentsDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of TumorFrequencyTreatmentsDTO objects from a template one.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO template to look for
     * @return all the TumorFrequencyTreatmentsDTO objects matching the template
     */
    public List<TumorFrequencyTreatmentsDTO> loadUsingTemplate(TumorFrequencyTreatmentsDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of TumorFrequencyTreatmentsDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the TumorFrequencyTreatmentsDTO matching the template
     */
    public List<TumorFrequencyTreatmentsDTO> loadUsingTemplate(TumorFrequencyTreatmentsDTO pObject,
                                                              int startRow,
                                                              int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from TumorFrequencyTreatments WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequencyTreatments_key= ?");
             }
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
             }
    
             if (pObject.isAgentKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Agent_key= ?");
             }
    
             if (pObject.isDoseModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("dose= ?");
             }
    
             if (pObject.isAgeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("age= ?");
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
    
             if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKey());
             }
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
             }
    
             if (pObject.isAgentKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAgentKey());
             }
    
             if (pObject.isDoseModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getDose());
             }
    
             if (pObject.isAgeModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAge());
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
     * Deletes rows using a TumorFrequencyTreatmentsDTO template.
     *
     * @param pObject the TumorFrequencyTreatmentsDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(TumorFrequencyTreatmentsDTO pObject) throws SQLException {
        if (pObject.isTumorFrequencyTreatmentsKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getTumorFrequencyTreatmentsKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM TumorFrequencyTreatments WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorFrequencyTreatmentsKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorFrequencyTreatments_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorFrequencyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorFrequency_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAgentKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Agent_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDoseInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("dose").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAgeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("age").append("=?");
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
    
            if (pObject.isTumorFrequencyTreatmentsKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKey());
            }
    
            if (pObject.isTumorFrequencyKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
            }
    
            if (pObject.isAgentKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAgentKey());
            }
    
            if (pObject.isDoseInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getDose());
            }
    
            if (pObject.isAgeInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAge());
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
     * Retrieves the max value for a specified column of the table TumorFrequencyTreatments.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from TumorFrequencyTreatments";
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
                    case ID__TUMORFREQUENCYTREATMENTS_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__AGENT_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_DOSE:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_AGE:
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
     * Retrieves the min value for a specified column of the table TumorFrequencyTreatments.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from TumorFrequencyTreatments";
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
                    case ID__TUMORFREQUENCYTREATMENTS_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__AGENT_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_DOSE:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_AGE:
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
     * Retrieves the number of rows of the table TumorFrequencyTreatments.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table TumorFrequencyTreatments with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from TumorFrequencyTreatments " + where;
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
     * Retrieves the number of rows of the table TumorFrequencyTreatments with a prepared statement.
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
     * Looks for the number of elements of a specific TumorFrequencyTreatmentsDTO pObject given a c
     *
     * @param pObject the TumorFrequencyTreatmentsDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(TumorFrequencyTreatmentsDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from TumorFrequencyTreatments WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequencyTreatments_key= ?");
                }
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
                }
    
                if (pObject.isAgentKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Agent_key= ?");
                }
    
                if (pObject.isDoseModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("dose= ?");
                }
    
                if (pObject.isAgeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("age= ?");
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
    
                if (pObject.isTumorFrequencyTreatmentsKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyTreatmentsKey());
                }
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isAgentKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAgentKey());
                }
    
                if (pObject.isDoseModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getDose());
                }
    
                if (pObject.isAgeModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAge());
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
     * Transforms a ResultSet iterating on the TumorFrequencyTreatments on a TumorFrequencyTreatmentsDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting TumorFrequencyTreatmentsDTO pObject
     */
    public TumorFrequencyTreatmentsDTO decodeRow(ResultSet rs) throws SQLException {
        TumorFrequencyTreatmentsDTO pObject = createTumorFrequencyTreatmentsDTO();
        pObject.setTumorFrequencyTreatmentsKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setAgentKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setDose(DAOManagerMTB.getLong(rs, 4));
        pObject.setAge(DAOManagerMTB.getLong(rs, 5));
        pObject.setCreateUser(rs.getString(6));
        pObject.setCreateDate(rs.getTimestamp(7));
        pObject.setUpdateUser(rs.getString(8));
        pObject.setUpdateDate(rs.getTimestamp(9));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the TumorFrequencyTreatments table on a TumorFrequencyTreatmentsDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting TumorFrequencyTreatmentsDTO pObject
     */
    public TumorFrequencyTreatmentsDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        TumorFrequencyTreatmentsDTO pObject = createTumorFrequencyTreatmentsDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORFREQUENCYTREATMENTS_KEY:
                    ++pos;
                    pObject.setTumorFrequencyTreatmentsKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORFREQUENCY_KEY:
                    ++pos;
                    pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__AGENT_KEY:
                    ++pos;
                    pObject.setAgentKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_DOSE:
                    ++pos;
                    pObject.setDose(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_AGE:
                    ++pos;
                    pObject.setAge(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of TumorFrequencyTreatmentsDTO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of TumorFrequencyTreatmentsDTO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of TumorFrequencyTreatmentsDTO objects
     */
    public List<TumorFrequencyTreatmentsDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<TumorFrequencyTreatmentsDTO> v = new ArrayList<TumorFrequencyTreatmentsDTO>();
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
