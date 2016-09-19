
package org.jax.mgi.mtb.dao.custom.mtb;

import org.jax.mgi.mtb.dao.gen.mtb.*;
import java.util.*;
import java.sql.*;

import org.jax.mgi.mtb.dao.mtb.*;

// imports+ 

// imports- 


/**
 * Handles database calls for the TumorGeneticChanges table.
 * Orginally generated but moved to package ..custom.mtb and modified 
 * to allow chromosome associations to be saved and deleted
 */
public class MTBTumorGeneticChangesDAO
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
     * Column _TumorFrequency_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORFREQUENCY_KEY = 1;
    public static final int TYPE__TUMORFREQUENCY_KEY = Types.NUMERIC;
    public static final String NAME__TUMORFREQUENCY_KEY = "_TumorFrequency_key";

    /**
     * Column name of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NAME = 2;
    public static final int TYPE_NAME = Types.VARCHAR;
    public static final String NAME_NAME = "name";

    /**
     * Column notes of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_NOTES = 3;
    public static final int TYPE_NOTES = Types.LONGVARCHAR;
    public static final String NAME_NOTES = "notes";

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
     * Column _AlleleType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ALLELETYPE_KEY = 8;
    public static final int TYPE__ALLELETYPE_KEY = Types.NUMERIC;
    public static final String NAME__ALLELETYPE_KEY = "_AlleleType_key";
    
    public static final int ID__ASSAYTYPE_KEY = 9;
    public static final int TYPE__ASSAYTYPE_KEY = Types.NUMERIC;
    public static final String NAME__ASSYAYTYPE_KEY = "_AssayType_key";
    
    public static final int ID_DISPLAY_CHROMOSOMES = 10;
    public static final int ID_ALLELE_TYPE_NAME = 11;


    private static final String TABLE_NAME = "TumorGeneticChanges";

    /**
     * Create an array of type string containing all the fields of the TumorGeneticChanges table.
     */
    private static final String[] FIELD_NAMES = {
        "TumorGeneticChanges._TumorGeneticChanges_key"
        ,"TumorGeneticChanges._TumorFrequency_key"
        ,"TumorGeneticChanges.name"
        ,"TumorGeneticChanges.notes"
        ,"TumorGeneticChanges.create_user"
        ,"TumorGeneticChanges.create_date"
        ,"TumorGeneticChanges.update_user"
        ,"TumorGeneticChanges.update_date"
        ,"TumorGeneticChanges._AlleleType_key"
        ,"TumorGeneticChanges._AssayType_key"
    };

    /**
     * Create an array of type containing all the fields of the TumorGeneticChanges table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
        ,"Long"
        ,"Long"
    };

    /**
     * Field that contains the comma separated fields of the TumorGeneticChanges table.
     */
    private static final String ALL_FIELDS = "TumorGeneticChanges._TumorGeneticChanges_key"
                            + ",TumorGeneticChanges._TumorFrequency_key"
                            + ",TumorGeneticChanges.name"
                            + ",TumorGeneticChanges.notes"
                            + ",TumorGeneticChanges.create_user"
                            + ",TumorGeneticChanges.create_date"
                            + ",TumorGeneticChanges.update_user"
                            + ",TumorGeneticChanges.update_date"
                            + ",TumorGeneticChanges._AlleleType_key"
                            + ",TumorGeneticChanges._AssayType_key";


    // ----------------------------------------------------- Instance Variables

    private static MTBTumorGeneticChangesDAO singleton = new MTBTumorGeneticChangesDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the MTBTumorGeneticChangesDAO singleton.
     *
     * @return MTBTumorGeneticChangesDAO 
     */
    synchronized public static MTBTumorGeneticChangesDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own MTBTumorGeneticChangesDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(MTBTumorGeneticChangesDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new MTBTumorGeneticChangesDTO instance.
     *
     * @return the new MTBTumorGeneticChangesDTO 
     */
    public MTBTumorGeneticChangesDTO createTumorGeneticChangesDTO() {
        return new MTBTumorGeneticChangesDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a MTBTumorGeneticChangesDTO from the TumorGeneticChanges using its key fields.
     *
     * @return a unique MTBTumorGeneticChangesDTO 
     */
    public MTBTumorGeneticChangesDTO loadByPrimaryKey(Long TumorGeneticChangesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorGeneticChanges WHERE TumorGeneticChanges._TumorGeneticChanges_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorGeneticChangesKey);
            List<MTBTumorGeneticChangesDTO> pReturn = loadByPreparedStatement(ps);
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
     public int deleteByPrimaryKey(Long TumorGeneticChangesKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            
              // delete any chromosome associations first
            GeneticChangeChromosomeAssocDAO gccaDAO = GeneticChangeChromosomeAssocDAO.getInstance();
            gccaDAO.deleteByTumorGeneticChangesKey(TumorGeneticChangesKey);
            
            // delete any assay image associations
            TmrGntcCngAssayImageAssocDAO.getInstance().deleteByTumorGeneticChangesKey(TumorGeneticChangesKey);
            
            c = getConnection();
            ps = c.prepareStatement("DELETE from TumorGeneticChanges WHERE TumorGeneticChanges._TumorGeneticChanges_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorGeneticChangesKey);
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
     * Loads a List of MTBTumorGeneticChangesDTO objects from the TumorGeneticChanges table using its _AlleleType_key field.
     *
     * @return a List of MTBTumorGeneticChangesDTO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadByAlleleTypeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorGeneticChanges WHERE _AlleleType_key=?",
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
     * Loads a List of MTBTumorGeneticChangesDTO objects from the TumorGeneticChanges table using its _TumorFrequency_key field.
     *
     * @return a List of MTBTumorGeneticChangesDTO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadByTumorFrequencyKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorGeneticChanges WHERE _TumorFrequency_key=?",
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
     * Deletes from the TumorGeneticChanges table by _TumorFrequency_key field.
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
            StringBuffer sql =
                    new StringBuffer("Delete from GeneticChangeChromosomeAssoc ");
            sql.append("where _TumorGeneticChanges_key in ");
            sql.append("(Select _TumorGeneticChanges_key from TumorGeneticChanges ");
            sql.append("WHERE _TumorFrequency_key=?)");
            ps = c.prepareStatement(sql.toString());
            DAOManagerMTB.setLong(ps, 1, value);
            ps.executeUpdate();
            
            sql = new StringBuffer("Delete from TmrGntcCngAssayImageAssoc ");
            sql.append("where _TumorGeneticChanges_key in ");
            sql.append("(Select _TumorGeneticChanges_key from TumorGeneticChanges ");
            sql.append("WHERE _TumorFrequency_key=?)");
            ps = c.prepareStatement(sql.toString());
            DAOManagerMTB.setLong(ps, 1, value);
            ps.executeUpdate();
            
            
            ps = c.prepareStatement("DELETE FROM TumorGeneticChanges WHERE _TumorFrequency_key=?");
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
     * Retrieves the AlleleTypeDTO object from the TumorGeneticChanges._AlleleType_key field.
     *
     * @param pObject the MTBTumorGeneticChangesDTO 
     * @return the associated AlleleTypeDTO pObject
     */
    public AlleleTypeDTO getAlleleTypeDTO(MTBTumorGeneticChangesDTO pObject) 
    throws SQLException {
        AlleleTypeDTO other = AlleleTypeDAO.getInstance().createAlleleTypeDTO();
        other.setAlleleTypeKey(pObject.getAlleleTypeKey());
        return AlleleTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MTBTumorGeneticChangesDTO object to the AlleleTypeDTO object.
     *
     * @param pObject the MTBTumorGeneticChangesDTO object to use
     * @param pObjectToBeSet the AlleleTypeDTO object to associate to the MTBTumorGeneticChangesDTO 
     * @return the associated AlleleTypeDTO pObject
     */
    // SET IMPORTED
    public MTBTumorGeneticChangesDTO setAlleleTypeDTO(MTBTumorGeneticChangesDTO pObject,AlleleTypeDTO pObjectToBeSet) {
        pObject.setAlleleTypeKey(pObjectToBeSet.getAlleleTypeKey());
        return pObject;
    }

    /**
     * Retrieves the TumorFrequencyDTO object from the TumorGeneticChanges._TumorFrequency_key field.
     *
     * @param pObject the MTBTumorGeneticChangesDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    public TumorFrequencyDTO getTumorFrequencyDTO(MTBTumorGeneticChangesDTO pObject) 
    throws SQLException {
        TumorFrequencyDTO other = TumorFrequencyDAO.getInstance().createTumorFrequencyDTO();
        other.setTumorFrequencyKey(pObject.getTumorFrequencyKey());
        return TumorFrequencyDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the MTBTumorGeneticChangesDTO object to the TumorFrequencyDTO object.
     *
     * @param pObject the MTBTumorGeneticChangesDTO object to use
     * @param pObjectToBeSet the TumorFrequencyDTO object to associate to the MTBTumorGeneticChangesDTO 
     * @return the associated TumorFrequencyDTO pObject
     */
    // SET IMPORTED
    public MTBTumorGeneticChangesDTO setTumorFrequencyDTO(MTBTumorGeneticChangesDTO pObject,TumorFrequencyDTO pObjectToBeSet) {
        pObject.setTumorFrequencyKey(pObjectToBeSet.getTumorFrequencyKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from TumorGeneticChanges.
     *
     * @return a List of MTBTumorGeneticChangesDAO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from TumorGeneticChanges, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of MTBTumorGeneticChangesDAO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorGeneticChanges",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of MTBTumorGeneticChangesDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting MTBTumorGeneticChangesDTO table 
     */
    public List<MTBTumorGeneticChangesDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of MTBTumorGeneticChangesDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBTumorGeneticChangesDTO table 
     */
    public List<MTBTumorGeneticChangesDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of MTBTumorGeneticChangesDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting MTBTumorGeneticChangesDTO table 
     */
    public List<MTBTumorGeneticChangesDTO> loadByWhere(String where, 
                                                   int[] fieldList, 
                                                   int startRow, 
                                                   int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from TumorGeneticChanges " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from TumorGeneticChanges ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<MTBTumorGeneticChangesDTO> v = new ArrayList<MTBTumorGeneticChangesDTO>();
        try {
            c = getConnection();
            pStatement = c.createStatement();
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
     * Saves the MTBTumorGeneticChangesDTO pObject into the database.
     *
     * @param pObject the MTBTumorGeneticChangesDTO pObject to be saved
     */
    private MTBTumorGeneticChangesDTO save(MTBTumorGeneticChangesDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getTumorGeneticChangesKey() == null) {
            Object obj = max(ID__TUMORGENETICCHANGES_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setTumorGeneticChangesKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into TumorGeneticChanges (");
    
                if (pObject.isTumorGeneticChangesKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorGeneticChanges_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorFrequency_key");
                    _dirtyCount++;
                }

               

                if (pObject.isNameModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("name");
                    _dirtyCount++;
                }

                if (pObject.isNotesModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("notes");
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

                if (pObject.isAlleleTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AlleleType_key");
                    _dirtyCount++;
                }
                
                if (pObject.isAssayTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_AssayType_key");
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
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
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
    
                if (pObject.isAlleleTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }

                if (pObject.isAssayTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayTypeKey());
                }
    
                
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE TumorGeneticChanges SET ");
                boolean useComma=false;

                if (pObject.isTumorGeneticChangesKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorGeneticChanges_key").append("=?");
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorFrequency_key").append("=?");
                }

                if (pObject.isNameModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("name").append("=?");
                }

                if (pObject.isNotesModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("notes").append("=?");
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

                if (pObject.isAlleleTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AlleleType_key").append("=?");
                }

                if (pObject.isAssayTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_AssayType_key").append("=?");
                }

                _sql.append(" WHERE ");
                _sql.append("TumorGeneticChanges._TumorGeneticChanges_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorGeneticChangesKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
                }

                if (pObject.isTumorFrequencyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }

                if (pObject.isNameModified()) {
                      ps.setString(++_dirtyCount, pObject.getName());
                }

                if (pObject.isNotesModified()) {
                      ps.setString(++_dirtyCount, pObject.getNotes());
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

                if (pObject.isAlleleTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }
                
                if (pObject.isAssayTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayTypeKey());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKeyOriginal());
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
     * Saves any chromosome associations for the TumorGeneticChange
     *
     * @param dto the MTBTumorGeneticChangesDTO pObject table being saved
     * @param tgcKey the primary key for the TumorGeneticChangeDTO
     */
    
    
     private void saveChromosomeAssociations(MTBTumorGeneticChangesDTO dto, long tgcKey) 
        throws SQLException {
       
           ArrayList<GeneticChangeChromosomeAssocDTO> list = new ArrayList<GeneticChangeChromosomeAssocDTO>(); 
           GeneticChangeChromosomeAssocDAO gccaDAO = GeneticChangeChromosomeAssocDAO.getInstance();
           for(ChromosomeDTO cDTO : dto.getChromosomes()){
            if(cDTO.isModified()){
                   GeneticChangeChromosomeAssocDTO gccaDTO = gccaDAO.createGeneticChangeChromosomeAssocDTO();
                   gccaDTO.setChromosomeKey(cDTO.getChromosomeKey());
                   gccaDTO.setTumorGeneticChangesKey(tgcKey);
                   gccaDTO.setCreateDate(dto.getUpdateDate());
                   gccaDTO.setCreateUser(dto.getUpdateUser());
                   gccaDTO.setUpdateDate(dto.getUpdateDate());
                   gccaDTO.setUpdateUser(dto.getUpdateUser());
                   list.add(gccaDTO);
             }
           }
           gccaDAO.save(list);
           dto.setChromosomesModified(false);
           
       
    }






    /**
     * Saves a List of MTBTumorGeneticChangesDTO objects into the database.
     *
     * @param pObjects the MTBTumorGeneticChangesDTO pObject table to be saved
     * @return the saved MTBTumorGeneticChangesDTO List.
     */
    public List<MTBTumorGeneticChangesDTO> save(List<MTBTumorGeneticChangesDTO> pObjects) throws SQLException {
        for (MTBTumorGeneticChangesDTO bean : pObjects) {
          long tgcKey = save(bean).getTumorGeneticChangesKey();
          saveChromosomeAssociations(bean,tgcKey);
        }
        return pObjects;
    }



    /**
     * Loads a unique MTBTumorGeneticChangesDTO object from a template
     *
     * @param pObject the MTBTumorGeneticChangesDTO object to look for
     * @return the pObject matching the template
     */
    public MTBTumorGeneticChangesDTO loadUniqueUsingTemplate(MTBTumorGeneticChangesDTO pObject) 
        throws SQLException {
         List<MTBTumorGeneticChangesDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of MTBTumorGeneticChangesDTO objects from a template one.
     *
     * @param pObject the MTBTumorGeneticChangesDTO template to look for
     * @return all the MTBTumorGeneticChangesDTO objects matching the template
     */
    public List<MTBTumorGeneticChangesDTO> loadUsingTemplate(MTBTumorGeneticChangesDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of MTBTumorGeneticChangesDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the MTBTumorGeneticChangesDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the MTBTumorGeneticChangesDTO matching the template
     */
    public List<MTBTumorGeneticChangesDTO> loadUsingTemplate(MTBTumorGeneticChangesDTO pObject,
                                                         int startRow,
                                                         int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from TumorGeneticChanges WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorGeneticChangesKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorGeneticChanges_key= ?");
             }
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
             }
    
             if (pObject.isNameModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
             }
    
             if (pObject.isNotesModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
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
    
             if (pObject.isAlleleTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleType_key= ?");
             }
    
             if (pObject.isAssayTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AssayType_key= ?");
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
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
             }
    
             if (pObject.isNameModified()) {
                 ps.setString(++_dirtyCount, pObject.getName());
             }
    
             if (pObject.isNotesModified()) {
                 ps.setString(++_dirtyCount, pObject.getNotes());
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
    
             if (pObject.isAlleleTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
             }
             
             if (pObject.isAssayTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayTypeKey());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a MTBTumorGeneticChangesDTO template.
     *
     * @param pObject the MTBTumorGeneticChangesDTO object(s) to be deleted
     * @return the number of deleted objects
     */
     public int deleteUsingTemplate(MTBTumorGeneticChangesDTO pObject) throws SQLException {
        if (pObject.isTumorGeneticChangesKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getTumorGeneticChangesKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
              // delete any associated chromosome associations first
            GeneticChangeChromosomeAssocDAO gccaDAO = GeneticChangeChromosomeAssocDAO.getInstance();
            gccaDAO.deleteByTumorGeneticChangesKey(pObject.getTumorGeneticChangesKey());
            
            // delete any assay image associations
            TmrGntcCngAssayImageAssocDAO.getInstance().deleteByTumorGeneticChangesKey(pObject.getTumorGeneticChangesKey());
            
            sql = new StringBuffer("DELETE FROM TumorGeneticChanges WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorGeneticChangesKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorGeneticChanges_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorFrequencyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorFrequency_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNameInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("name").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNotesInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("notes").append("=?");
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
    
            if (pObject.isAlleleTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AlleleType_key").append("=?");
                _dirtyAnd ++;
            }
            
            if (pObject.isAssayTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_AssayType_key").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isTumorGeneticChangesKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorGeneticChangesKey());
            }
    
            if (pObject.isTumorFrequencyKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
            }
  
            if (pObject.isNameInitialized()) {
                ps.setString(++_dirtyCount, pObject.getName());
            }
    
            if (pObject.isNotesInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNotes());
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
    
            if (pObject.isAlleleTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
            }
    
            if (pObject.isAssayTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayTypeKey());
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
     * Retrieves a List of ChromosomeDTO objects using the relation table GeneticChangeChromosomeAssoc given a MTBTumorGeneticChangesDTO object.
     *
     * @param pObject the MTBTumorGeneticChangesDTO pObject to be used
     * @return a List of ChromosomeDTO objects
     */
    // MANY TO MANY
    public List<ChromosomeDTO> loadChromosomeViaGeneticChangeChromosomeAssoc(MTBTumorGeneticChangesDTO pObject) 
        throws SQLException {
        return loadChromosomeViaGeneticChangeChromosomeAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ChromosomeDTO objects using the relation table GeneticChangeChromosomeAssoc given a MTBTumorGeneticChangesDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the MTBTumorGeneticChangesDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ChromosomeDTO objects
     */
    // MANY TO MANY
    public List<ChromosomeDTO> loadChromosomeViaGeneticChangeChromosomeAssoc(MTBTumorGeneticChangesDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Chromosome, ");
        strSQL.append("        GeneticChangeChromosomeAssoc");
        strSQL.append("  where GeneticChangeChromosomeAssoc._TumorGeneticChanges_key = ?");
        strSQL.append("    and GeneticChangeChromosomeAssoc._Chromosome_key = Chromosome._Chromosome_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorGeneticChangesKey());
             return ChromosomeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table TumorGeneticChanges.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from TumorGeneticChanges";
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
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NAME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTES:
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
                    case ID__ALLELETYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ASSAYTYPE_KEY:
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
     * Retrieves the min value for a specified column of the table TumorGeneticChanges.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from TumorGeneticChanges";
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
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NAME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTES:
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
                    case ID__ALLELETYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ASSAYTYPE_KEY:
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
     * Retrieves the number of rows of the table TumorGeneticChanges.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table TumorGeneticChanges with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from TumorGeneticChanges " + where;
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
     * Retrieves the number of rows of the table TumorGeneticChanges with a prepared statement.
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
     * Looks for the number of elements of a specific MTBTumorGeneticChangesDTO pObject given a c
     *
     * @param pObject the MTBTumorGeneticChangesDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(MTBTumorGeneticChangesDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from TumorGeneticChanges WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorGeneticChangesKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorGeneticChanges_key= ?");
                }
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
                }
    
                if (pObject.isNameModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("name= ?");
                }
    
                if (pObject.isNotesModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("notes= ?");
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
    
                if (pObject.isAlleleTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AlleleType_key= ?");
                }
                
                if (pObject.isAssayTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_AssayType_key= ?");
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
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isNameModified()) {
                    ps.setString(++_dirtyCount, pObject.getName());
                }
    
                if (pObject.isNotesModified()) {
                    ps.setString(++_dirtyCount, pObject.getNotes());
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
    
                if (pObject.isAlleleTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAlleleTypeKey());
                }
                
                if (pObject.isAssayTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getAssayTypeKey());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the TumorGeneticChanges on a MTBTumorGeneticChangesDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting MTBTumorGeneticChangesDTO pObject
     */
    public MTBTumorGeneticChangesDTO decodeRow(ResultSet rs) throws SQLException {
        MTBTumorGeneticChangesDTO pObject = createTumorGeneticChangesDTO();
        pObject.setTumorGeneticChangesKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setName(rs.getString(3));
        pObject.setNotes(rs.getString(4));
        pObject.setCreateUser(rs.getString(5));
        pObject.setCreateDate(rs.getTimestamp(6));
        pObject.setUpdateUser(rs.getString(7));
        pObject.setUpdateDate(rs.getTimestamp(8));
        pObject.setAlleleTypeKey(DAOManagerMTB.getLong(rs, 9));
        pObject.setAssayTypeKey(DAOManagerMTB.getLong(rs, 10));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the TumorGeneticChanges table on a MTBTumorGeneticChangesDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting MTBTumorGeneticChangesDTO pObject
     */
    public MTBTumorGeneticChangesDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        MTBTumorGeneticChangesDTO pObject = createTumorGeneticChangesDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORGENETICCHANGES_KEY:
                    ++pos;
                    pObject.setTumorGeneticChangesKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORFREQUENCY_KEY:
                    ++pos;
                    pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NAME:
                    ++pos;
                    pObject.setName(rs.getString(pos));
                    break;
                case ID_NOTES:
                    ++pos;
                    pObject.setNotes(rs.getString(pos));
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
                case ID__ALLELETYPE_KEY:
                    ++pos;
                    pObject.setAlleleTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ASSAYTYPE_KEY:
                    ++pos;
                    pObject.setAssayTypeKey(DAOManagerMTB.getLong(rs, pos));
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
     * @return a List of MTBTumorGeneticChangesDTO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of MTBTumorGeneticChangesDTO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of MTBTumorGeneticChangesDTO objects
     */
    public List<MTBTumorGeneticChangesDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<MTBTumorGeneticChangesDTO> v = new ArrayList<MTBTumorGeneticChangesDTO>();
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
