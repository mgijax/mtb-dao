
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the TumorFrequency table.
 */
public class TumorFrequencyDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _TumorFrequency_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORFREQUENCY_KEY = 0;
    public static final int TYPE__TUMORFREQUENCY_KEY = Types.NUMERIC;
    public static final String NAME__TUMORFREQUENCY_KEY = "_TumorFrequency_key";

    /**
     * Column _TumorType_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__TUMORTYPE_KEY = 1;
    public static final int TYPE__TUMORTYPE_KEY = Types.NUMERIC;
    public static final String NAME__TUMORTYPE_KEY = "_TumorType_key";

    /**
     * Column _Strain_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__STRAIN_KEY = 2;
    public static final int TYPE__STRAIN_KEY = Types.NUMERIC;
    public static final String NAME__STRAIN_KEY = "_Strain_key";

    /**
     * Column _Sex_key of type Types.CHAR mapped to String.
     */
    public static final int ID__SEX_KEY = 3;
    public static final int TYPE__SEX_KEY = Types.CHAR;
    public static final String NAME__SEX_KEY = "_Sex_key";

    /**
     * Column _Reference_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 4;
    public static final int TYPE__REFERENCE_KEY = Types.NUMERIC;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

    /**
     * Column _OrganAffected_key of type Types.NUMERIC mapped to Long.
     */
    public static final int ID__ORGANAFFECTED_KEY = 5;
    public static final int TYPE__ORGANAFFECTED_KEY = Types.NUMERIC;
    public static final String NAME__ORGANAFFECTED_KEY = "_OrganAffected_key";

    /**
     * Column note of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NOTE = 6;
    public static final int TYPE_NOTE = Types.VARCHAR;
    public static final String NAME_NOTE = "note";

    /**
     * Column colonySize of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_COLONYSIZE = 7;
    public static final int TYPE_COLONYSIZE = Types.NUMERIC;
    public static final String NAME_COLONYSIZE = "colonySize";

    /**
     * Column ageOnset of type Types.VARCHAR mapped to String.
     */
    public static final int ID_AGEONSET = 8;
    public static final int TYPE_AGEONSET = Types.VARCHAR;
    public static final String NAME_AGEONSET = "ageOnset";

    /**
     * Column ageDetection of type Types.VARCHAR mapped to String.
     */
    public static final int ID_AGEDETECTION = 9;
    public static final int TYPE_AGEDETECTION = Types.VARCHAR;
    public static final String NAME_AGEDETECTION = "ageDetection";

    /**
     * Column numMiceAffected of type Types.NUMERIC mapped to Long.
     */
    public static final int ID_NUMMICEAFFECTED = 10;
    public static final int TYPE_NUMMICEAFFECTED = Types.NUMERIC;
    public static final String NAME_NUMMICEAFFECTED = "numMiceAffected";

    /**
     * Column incidence of type Types.VARCHAR mapped to String.
     */
    public static final int ID_INCIDENCE = 11;
    public static final int TYPE_INCIDENCE = Types.VARCHAR;
    public static final String NAME_INCIDENCE = "incidence";

    /**
     * Column freqNum of type Types.NUMERIC mapped to java.math.BigDecimal.
     */
    public static final int ID_FREQNUM = 12;
    public static final int TYPE_FREQNUM = Types.NUMERIC;
    public static final String NAME_FREQNUM = "freqNum";

    /**
     * Column breedingStatus of type Types.VARCHAR mapped to String.
     */
    public static final int ID_BREEDINGSTATUS = 13;
    public static final int TYPE_BREEDINGSTATUS = Types.VARCHAR;
    public static final String NAME_BREEDINGSTATUS = "breedingStatus";

    /**
     * Column infectionStatus of type Types.VARCHAR mapped to String.
     */
    public static final int ID_INFECTIONSTATUS = 14;
    public static final int TYPE_INFECTIONSTATUS = Types.VARCHAR;
    public static final String NAME_INFECTIONSTATUS = "infectionStatus";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 15;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 16;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 17;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 18;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";


    private static final String TABLE_NAME = "TumorFrequency";

    /**
     * Create an array of type string containing all the fields of the TumorFrequency table.
     */
    private static final String[] FIELD_NAMES = {
        "TumorFrequency._TumorFrequency_key"
        ,"TumorFrequency._TumorType_key"
        ,"TumorFrequency._Strain_key"
        ,"TumorFrequency._Sex_key"
        ,"TumorFrequency._Reference_key"
        ,"TumorFrequency._OrganAffected_key"
        ,"TumorFrequency.note"
        ,"TumorFrequency.colonySize"
        ,"TumorFrequency.ageOnset"
        ,"TumorFrequency.ageDetection"
        ,"TumorFrequency.numMiceAffected"
        ,"TumorFrequency.incidence"
        ,"TumorFrequency.freqNum"
        ,"TumorFrequency.breedingStatus"
        ,"TumorFrequency.infectionStatus"
        ,"TumorFrequency.create_user"
        ,"TumorFrequency.create_date"
        ,"TumorFrequency.update_user"
        ,"TumorFrequency.update_date"
    };

    /**
     * Create an array of type containing all the fields of the TumorFrequency table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"Long"
        ,"Long"
        ,"String"
        ,"Long"
        ,"Long"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.math.BigDecimal"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
    };

    /**
     * Field that contains the comma separated fields of the TumorFrequency table.
     */
    private static final String ALL_FIELDS = "TumorFrequency._TumorFrequency_key"
                            + ",TumorFrequency._TumorType_key"
                            + ",TumorFrequency._Strain_key"
                            + ",TumorFrequency._Sex_key"
                            + ",TumorFrequency._Reference_key"
                            + ",TumorFrequency._OrganAffected_key"
                            + ",TumorFrequency.note"
                            + ",TumorFrequency.colonySize"
                            + ",TumorFrequency.ageOnset"
                            + ",TumorFrequency.ageDetection"
                            + ",TumorFrequency.numMiceAffected"
                            + ",TumorFrequency.incidence"
                            + ",TumorFrequency.freqNum"
                            + ",TumorFrequency.breedingStatus"
                            + ",TumorFrequency.infectionStatus"
                            + ",TumorFrequency.create_user"
                            + ",TumorFrequency.create_date"
                            + ",TumorFrequency.update_user"
                            + ",TumorFrequency.update_date";


    // ----------------------------------------------------- Instance Variables

    private static TumorFrequencyDAO singleton = new TumorFrequencyDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the TumorFrequencyDAO singleton.
     *
     * @return TumorFrequencyDAO 
     */
    synchronized public static TumorFrequencyDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own TumorFrequencyDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(TumorFrequencyDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new TumorFrequencyDTO instance.
     *
     * @return the new TumorFrequencyDTO 
     */
    public TumorFrequencyDTO createTumorFrequencyDTO() {
        return new TumorFrequencyDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a TumorFrequencyDTO from the TumorFrequency using its key fields.
     *
     * @return a unique TumorFrequencyDTO 
     */
    public TumorFrequencyDTO loadByPrimaryKey(Long TumorFrequencyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE TumorFrequency._TumorFrequency_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorFrequencyKey);
            List<TumorFrequencyDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long TumorFrequencyKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from TumorFrequency WHERE TumorFrequency._TumorFrequency_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, TumorFrequencyKey);
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
     * Loads a List of TumorFrequencyDTO objects from the TumorFrequency table using its _Sex_key field.
     *
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadBySexKey(String value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE _Sex_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            ps.setString(1, value);
            return loadByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Deletes from the TumorFrequency table by _Sex_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteBySexKey(String value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequency WHERE _Sex_key=?");
            ps.setString(1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorFrequencyDTO objects from the TumorFrequency table using its _Strain_key field.
     *
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByStrainKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE _Strain_key=?",
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
     * Deletes from the TumorFrequency table by _Strain_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByStrainKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequency WHERE _Strain_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorFrequencyDTO objects from the TumorFrequency table using its _OrganAffected_key field.
     *
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByOrganAffectedKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE _OrganAffected_key=?",
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
     * Deletes from the TumorFrequency table by _OrganAffected_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByOrganAffectedKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequency WHERE _OrganAffected_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorFrequencyDTO objects from the TumorFrequency table using its _Reference_key field.
     *
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByReferenceKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE _Reference_key=?",
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
     * Deletes from the TumorFrequency table by _Reference_key field.
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
            ps = c.prepareStatement("DELETE FROM TumorFrequency WHERE _Reference_key=?");
            DAOManagerMTB.setLong(ps, 1, value);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Loads a List of TumorFrequencyDTO objects from the TumorFrequency table using its _TumorType_key field.
     *
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByTumorTypeKey(Long value) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency WHERE _TumorType_key=?",
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
     * Deletes from the TumorFrequency table by _TumorType_key field.
     *
     * @param value the key value to seek
     * @return the number of rows deleted
     */
    public int deleteByTumorTypeKey(Long value)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE FROM TumorFrequency WHERE _TumorType_key=?");
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
     * Retrieves the SexDTO object from the TumorFrequency._Sex_key field.
     *
     * @param pObject the TumorFrequencyDTO 
     * @return the associated SexDTO pObject
     */
    public SexDTO getSexDTO(TumorFrequencyDTO pObject) 
    throws SQLException {
        SexDTO other = SexDAO.getInstance().createSexDTO();
        other.setSexKey(pObject.getSexKey());
        return SexDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyDTO object to the SexDTO object.
     *
     * @param pObject the TumorFrequencyDTO object to use
     * @param pObjectToBeSet the SexDTO object to associate to the TumorFrequencyDTO 
     * @return the associated SexDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyDTO setSexDTO(TumorFrequencyDTO pObject,SexDTO pObjectToBeSet) {
        pObject.setSexKey(pObjectToBeSet.getSexKey());
        return pObject;
    }

    /**
     * Retrieves the StrainDTO object from the TumorFrequency._Strain_key field.
     *
     * @param pObject the TumorFrequencyDTO 
     * @return the associated StrainDTO pObject
     */
    public StrainDTO getStrainDTO(TumorFrequencyDTO pObject) 
    throws SQLException {
        StrainDTO other = StrainDAO.getInstance().createStrainDTO();
        other.setStrainKey(pObject.getStrainKey());
        return StrainDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyDTO object to the StrainDTO object.
     *
     * @param pObject the TumorFrequencyDTO object to use
     * @param pObjectToBeSet the StrainDTO object to associate to the TumorFrequencyDTO 
     * @return the associated StrainDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyDTO setStrainDTO(TumorFrequencyDTO pObject,StrainDTO pObjectToBeSet) {
        pObject.setStrainKey(pObjectToBeSet.getStrainKey());
        return pObject;
    }

    /**
     * Retrieves the OrganDTO object from the TumorFrequency._Organ_key field.
     *
     * @param pObject the TumorFrequencyDTO 
     * @return the associated OrganDTO pObject
     */
    public OrganDTO getOrganDTO(TumorFrequencyDTO pObject) 
    throws SQLException {
        OrganDTO other = OrganDAO.getInstance().createOrganDTO();
        other.setOrganKey(pObject.getOrganAffectedKey());
        return OrganDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyDTO object to the OrganDTO object.
     *
     * @param pObject the TumorFrequencyDTO object to use
     * @param pObjectToBeSet the OrganDTO object to associate to the TumorFrequencyDTO 
     * @return the associated OrganDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyDTO setOrganDTO(TumorFrequencyDTO pObject,OrganDTO pObjectToBeSet) {
        pObject.setOrganAffectedKey(pObjectToBeSet.getOrganKey());
        return pObject;
    }

    /**
     * Retrieves the ReferenceDTO object from the TumorFrequency._Reference_key field.
     *
     * @param pObject the TumorFrequencyDTO 
     * @return the associated ReferenceDTO pObject
     */
    public ReferenceDTO getReferenceDTO(TumorFrequencyDTO pObject) 
    throws SQLException {
        ReferenceDTO other = ReferenceDAO.getInstance().createReferenceDTO();
        other.setReferenceKey(pObject.getReferenceKey());
        return ReferenceDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyDTO object to the ReferenceDTO object.
     *
     * @param pObject the TumorFrequencyDTO object to use
     * @param pObjectToBeSet the ReferenceDTO object to associate to the TumorFrequencyDTO 
     * @return the associated ReferenceDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyDTO setReferenceDTO(TumorFrequencyDTO pObject,ReferenceDTO pObjectToBeSet) {
        pObject.setReferenceKey(pObjectToBeSet.getReferenceKey());
        return pObject;
    }

    /**
     * Retrieves the TumorTypeDTO object from the TumorFrequency._TumorType_key field.
     *
     * @param pObject the TumorFrequencyDTO 
     * @return the associated TumorTypeDTO pObject
     */
    public TumorTypeDTO getTumorTypeDTO(TumorFrequencyDTO pObject) 
    throws SQLException {
        TumorTypeDTO other = TumorTypeDAO.getInstance().createTumorTypeDTO();
        other.setTumorTypeKey(pObject.getTumorTypeKey());
        return TumorTypeDAO.getInstance().loadUniqueUsingTemplate(other);
    }

    /**
     * Associates the TumorFrequencyDTO object to the TumorTypeDTO object.
     *
     * @param pObject the TumorFrequencyDTO object to use
     * @param pObjectToBeSet the TumorTypeDTO object to associate to the TumorFrequencyDTO 
     * @return the associated TumorTypeDTO pObject
     */
    // SET IMPORTED
    public TumorFrequencyDTO setTumorTypeDTO(TumorFrequencyDTO pObject,TumorTypeDTO pObjectToBeSet) {
        pObject.setTumorTypeKey(pObjectToBeSet.getTumorTypeKey());
        return pObject;
    }



    //-------------------------------------------------------------------------
    // GET/SET FOREIGN KEY BEAN METHOD
    //-------------------------------------------------------------------------

    /**
     * Loads all the rows from TumorFrequency.
     *
     * @return a List of TumorFrequencyDAO objects
     */
    public List<TumorFrequencyDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from TumorFrequency, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorFrequencyDAO objects
     */
    public List<TumorFrequencyDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM TumorFrequency",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting TumorFrequencyDTO table 
     */
    public List<TumorFrequencyDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorFrequencyDTO table 
     */
    public List<TumorFrequencyDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of TumorFrequencyDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting TumorFrequencyDTO table 
     */
    public List<TumorFrequencyDTO> loadByWhere(String where, 
                                              int[] fieldList, 
                                              int startRow, 
                                              int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from TumorFrequency " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from TumorFrequency ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<TumorFrequencyDTO> v = new ArrayList<TumorFrequencyDTO>();
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
     * Deletes all rows from TumorFrequency table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the TumorFrequency table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM TumorFrequency " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the TumorFrequencyDTO pObject into the database.
     *
     * @param pObject the TumorFrequencyDTO pObject to be saved
     */
    public TumorFrequencyDTO save(TumorFrequencyDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getTumorFrequencyKey() == null) {
            Object obj = max(ID__TUMORFREQUENCY_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setTumorFrequencyKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into TumorFrequency (");
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorFrequency_key");
                    _dirtyCount++;
                }

                if (pObject.isTumorTypeKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_TumorType_key");
                    _dirtyCount++;
                }

                if (pObject.isStrainKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Strain_key");
                    _dirtyCount++;
                }

                if (pObject.isSexKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Sex_key");
                    _dirtyCount++;
                }

                if (pObject.isReferenceKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Reference_key");
                    _dirtyCount++;
                }

                if (pObject.isOrganAffectedKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_OrganAffected_key");
                    _dirtyCount++;
                }

                if (pObject.isNoteModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("note");
                    _dirtyCount++;
                }

                if (pObject.isColonySizeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("colonySize");
                    _dirtyCount++;
                }

                if (pObject.isAgeOnsetModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("ageOnset");
                    _dirtyCount++;
                }

                if (pObject.isAgeDetectionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("ageDetection");
                    _dirtyCount++;
                }

                if (pObject.isNumMiceAffectedModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("numMiceAffected");
                    _dirtyCount++;
                }

                if (pObject.isIncidenceModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("incidence");
                    _dirtyCount++;
                }

                if (pObject.isFreqNumModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("freqNum");
                    _dirtyCount++;
                }

                if (pObject.isBreedingStatusModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("breedingStatus");
                    _dirtyCount++;
                }

                if (pObject.isInfectionStatusModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("infectionStatus");
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

                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isSexKeyModified()) {
                    ps.setString(++_dirtyCount, pObject.getSexKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isOrganAffectedKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganAffectedKey());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isColonySizeModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getColonySize());
                }
    
                if (pObject.isAgeOnsetModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeOnset());
                }
    
                if (pObject.isAgeDetectionModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeDetection());
                }
    
                if (pObject.isNumMiceAffectedModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumMiceAffected());
                }
    
                if (pObject.isIncidenceModified()) {
                    ps.setString(++_dirtyCount, pObject.getIncidence());
                }
    
                if (pObject.isFreqNumModified()) {
                    ps.setBigDecimal(++_dirtyCount, pObject.getFreqNum());
                }
    
                if (pObject.isBreedingStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getBreedingStatus());
                }
    
                if (pObject.isInfectionStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getInfectionStatus());
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
                _sql = new StringBuffer("UPDATE TumorFrequency SET ");
                boolean useComma=false;

                if (pObject.isTumorFrequencyKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorFrequency_key").append("=?");
                }

                if (pObject.isTumorTypeKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_TumorType_key").append("=?");
                }

                if (pObject.isStrainKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Strain_key").append("=?");
                }

                if (pObject.isSexKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Sex_key").append("=?");
                }

                if (pObject.isReferenceKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Reference_key").append("=?");
                }

                if (pObject.isOrganAffectedKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_OrganAffected_key").append("=?");
                }

                if (pObject.isNoteModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("note").append("=?");
                }

                if (pObject.isColonySizeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("colonySize").append("=?");
                }

                if (pObject.isAgeOnsetModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("ageOnset").append("=?");
                }

                if (pObject.isAgeDetectionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("ageDetection").append("=?");
                }

                if (pObject.isNumMiceAffectedModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("numMiceAffected").append("=?");
                }

                if (pObject.isIncidenceModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("incidence").append("=?");
                }

                if (pObject.isFreqNumModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("freqNum").append("=?");
                }

                if (pObject.isBreedingStatusModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("breedingStatus").append("=?");
                }

                if (pObject.isInfectionStatusModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("infectionStatus").append("=?");
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
                _sql.append("TumorFrequency._TumorFrequency_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isTumorFrequencyKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }

                if (pObject.isTumorTypeKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }

                if (pObject.isStrainKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }

                if (pObject.isSexKeyModified()) {
                      ps.setString(++_dirtyCount, pObject.getSexKey());
                }

                if (pObject.isReferenceKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }

                if (pObject.isOrganAffectedKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganAffectedKey());
                }

                if (pObject.isNoteModified()) {
                      ps.setString(++_dirtyCount, pObject.getNote());
                }

                if (pObject.isColonySizeModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getColonySize());
                }

                if (pObject.isAgeOnsetModified()) {
                      ps.setString(++_dirtyCount, pObject.getAgeOnset());
                }

                if (pObject.isAgeDetectionModified()) {
                      ps.setString(++_dirtyCount, pObject.getAgeDetection());
                }

                if (pObject.isNumMiceAffectedModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumMiceAffected());
                }

                if (pObject.isIncidenceModified()) {
                      ps.setString(++_dirtyCount, pObject.getIncidence());
                }

                if (pObject.isFreqNumModified()) {
                      ps.setBigDecimal(++_dirtyCount, pObject.getFreqNum());
                }

                if (pObject.isBreedingStatusModified()) {
                      ps.setString(++_dirtyCount, pObject.getBreedingStatus());
                }

                if (pObject.isInfectionStatusModified()) {
                      ps.setString(++_dirtyCount, pObject.getInfectionStatus());
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
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKeyOriginal());
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
     * Saves a List of TumorFrequencyDTO objects into the database.
     *
     * @param pObjects the TumorFrequencyDTO pObject table to be saved
     * @return the saved TumorFrequencyDTO List.
     */
    public List<TumorFrequencyDTO> save(List<TumorFrequencyDTO> pObjects) throws SQLException {
        for (TumorFrequencyDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique TumorFrequencyDTO object from a template
     *
     * @param pObject the TumorFrequencyDTO object to look for
     * @return the pObject matching the template
     */
    public TumorFrequencyDTO loadUniqueUsingTemplate(TumorFrequencyDTO pObject) 
        throws SQLException {
         List<TumorFrequencyDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of TumorFrequencyDTO objects from a template one.
     *
     * @param pObject the TumorFrequencyDTO template to look for
     * @return all the TumorFrequencyDTO objects matching the template
     */
    public List<TumorFrequencyDTO> loadUsingTemplate(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of TumorFrequencyDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the TumorFrequencyDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the TumorFrequencyDTO matching the template
     */
    public List<TumorFrequencyDTO> loadUsingTemplate(TumorFrequencyDTO pObject,
                                                    int startRow,
                                                    int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from TumorFrequency WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
             }
    
             if (pObject.isTumorTypeKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
             }
    
             if (pObject.isStrainKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
             }
    
             if (pObject.isSexKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Sex_key= ?");
             }
    
             if (pObject.isReferenceKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
             }
    
             if (pObject.isOrganAffectedKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_OrganAffected_key= ?");
             }
    
             if (pObject.isNoteModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
             }
    
             if (pObject.isColonySizeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("colonySize= ?");
             }
    
             if (pObject.isAgeOnsetModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageOnset= ?");
             }
    
             if (pObject.isAgeDetectionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageDetection= ?");
             }
    
             if (pObject.isNumMiceAffectedModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("numMiceAffected= ?");
             }
    
             if (pObject.isIncidenceModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("incidence= ?");
             }
    
             if (pObject.isFreqNumModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("freqNum= ?");
             }
    
             if (pObject.isBreedingStatusModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("breedingStatus= ?");
             }
    
             if (pObject.isInfectionStatusModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("infectionStatus= ?");
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
    
             if (pObject.isTumorFrequencyKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
             }
    
             if (pObject.isTumorTypeKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
             }
    
             if (pObject.isStrainKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
             }
    
             if (pObject.isSexKeyModified()) {
                 ps.setString(++_dirtyCount, pObject.getSexKey());
             }
    
             if (pObject.isReferenceKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
             }
    
             if (pObject.isOrganAffectedKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganAffectedKey());
             }
    
             if (pObject.isNoteModified()) {
                 ps.setString(++_dirtyCount, pObject.getNote());
             }
    
             if (pObject.isColonySizeModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getColonySize());
             }
    
             if (pObject.isAgeOnsetModified()) {
                 ps.setString(++_dirtyCount, pObject.getAgeOnset());
             }
    
             if (pObject.isAgeDetectionModified()) {
                 ps.setString(++_dirtyCount, pObject.getAgeDetection());
             }
    
             if (pObject.isNumMiceAffectedModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumMiceAffected());
             }
    
             if (pObject.isIncidenceModified()) {
                 ps.setString(++_dirtyCount, pObject.getIncidence());
             }
    
             if (pObject.isFreqNumModified()) {
                 ps.setBigDecimal(++_dirtyCount, pObject.getFreqNum());
             }
    
             if (pObject.isBreedingStatusModified()) {
                 ps.setString(++_dirtyCount, pObject.getBreedingStatus());
             }
    
             if (pObject.isInfectionStatusModified()) {
                 ps.setString(++_dirtyCount, pObject.getInfectionStatus());
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
     * Deletes rows using a TumorFrequencyDTO template.
     *
     * @param pObject the TumorFrequencyDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(TumorFrequencyDTO pObject) throws SQLException {
        if (pObject.isTumorFrequencyKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getTumorFrequencyKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM TumorFrequency WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isTumorFrequencyKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorFrequency_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTumorTypeKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_TumorType_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStrainKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Strain_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isSexKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Sex_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Reference_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isOrganAffectedKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_OrganAffected_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNoteInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("note").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isColonySizeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("colonySize").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAgeOnsetInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("ageOnset").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAgeDetectionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("ageDetection").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNumMiceAffectedInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("numMiceAffected").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isIncidenceInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("incidence").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isFreqNumInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("freqNum").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isBreedingStatusInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("breedingStatus").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isInfectionStatusInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("infectionStatus").append("=?");
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
    
            if (pObject.isTumorFrequencyKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
            }
    
            if (pObject.isTumorTypeKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
            }
    
            if (pObject.isStrainKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
            }
    
            if (pObject.isSexKeyInitialized()) {
                ps.setString(++_dirtyCount, pObject.getSexKey());
            }
    
            if (pObject.isReferenceKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
            }
    
            if (pObject.isOrganAffectedKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganAffectedKey());
            }
    
            if (pObject.isNoteInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNote());
            }
    
            if (pObject.isColonySizeInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getColonySize());
            }
    
            if (pObject.isAgeOnsetInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAgeOnset());
            }
    
            if (pObject.isAgeDetectionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAgeDetection());
            }
    
            if (pObject.isNumMiceAffectedInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumMiceAffected());
            }
    
            if (pObject.isIncidenceInitialized()) {
                ps.setString(++_dirtyCount, pObject.getIncidence());
            }
    
            if (pObject.isFreqNumInitialized()) {
                ps.setBigDecimal(++_dirtyCount, pObject.getFreqNum());
            }
    
            if (pObject.isBreedingStatusInitialized()) {
                ps.setString(++_dirtyCount, pObject.getBreedingStatus());
            }
    
            if (pObject.isInfectionStatusInitialized()) {
                ps.setString(++_dirtyCount, pObject.getInfectionStatus());
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
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequencyNotes given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequencyNotes(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadReferenceViaTumorFrequencyNotes(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequencyNotes given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequencyNotes(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        TumorFrequencyNotes");
        strSQL.append("  where TumorFrequencyNotes._TumorFrequency_key = ?");
        strSQL.append("    and TumorFrequencyNotes._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequencySynonyms given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequencySynonyms(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadReferenceViaTumorFrequencySynonyms(pObject, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects using the relation table TumorFrequencySynonyms given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDTO objects
     */
    // MANY TO MANY
    public List<ReferenceDTO> loadReferenceViaTumorFrequencySynonyms(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Reference, ");
        strSQL.append("        TumorFrequencySynonyms");
        strSQL.append("  where TumorFrequencySynonyms._TumorFrequency_key = ?");
        strSQL.append("    and TumorFrequencySynonyms._Reference_key = Reference._Reference_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return ReferenceDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of AgentDTO objects using the relation table TumorFrequencyTreatments given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of AgentDTO objects
     */
    // MANY TO MANY
    public List<AgentDTO> loadAgentViaTumorFrequencyTreatments(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadAgentViaTumorFrequencyTreatments(pObject, 1, -1);
    }

    /**
     * Retrieves a List of AgentDTO objects using the relation table TumorFrequencyTreatments given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AgentDTO objects
     */
    // MANY TO MANY
    public List<AgentDTO> loadAgentViaTumorFrequencyTreatments(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Agent, ");
        strSQL.append("        TumorFrequencyTreatments");
        strSQL.append("  where TumorFrequencyTreatments._TumorFrequency_key = ?");
        strSQL.append("    and TumorFrequencyTreatments._Agent_key = Agent._Agent_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return AgentDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of AlleleTypeDTO objects using the relation table TumorGeneticChanges given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of AlleleTypeDTO objects
     */
    // MANY TO MANY
    public List<AlleleTypeDTO> loadAlleleTypeViaTumorGeneticChanges(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadAlleleTypeViaTumorGeneticChanges(pObject, 1, -1);
    }

    /**
     * Retrieves a List of AlleleTypeDTO objects using the relation table TumorGeneticChanges given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AlleleTypeDTO objects
     */
    // MANY TO MANY
    public List<AlleleTypeDTO> loadAlleleTypeViaTumorGeneticChanges(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from AlleleType, ");
        strSQL.append("        TumorGeneticChanges");
        strSQL.append("  where TumorGeneticChanges._TumorFrequency_key = ?");
        strSQL.append("    and TumorGeneticChanges._AlleleType_key = AlleleType._AlleleType_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return AlleleTypeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of AllelePairDTO objects using the relation table TumorGenetics given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of AllelePairDTO objects
     */
    // MANY TO MANY
    public List<AllelePairDTO> loadAllelePairViaTumorGenetics(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadAllelePairViaTumorGenetics(pObject, 1, -1);
    }

    /**
     * Retrieves a List of AllelePairDTO objects using the relation table TumorGenetics given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of AllelePairDTO objects
     */
    // MANY TO MANY
    public List<AllelePairDTO> loadAllelePairViaTumorGenetics(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from AllelePair, ");
        strSQL.append("        TumorGenetics");
        strSQL.append("  where TumorGenetics._TumorFrequency_key = ?");
        strSQL.append("    and TumorGenetics._AllelePair_key = AllelePair._AllelePair_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return AllelePairDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of PathologyDTO objects using the relation table TumorPathologyAssoc given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of PathologyDTO objects
     */
    // MANY TO MANY
    public List<PathologyDTO> loadPathologyViaTumorPathologyAssoc(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadPathologyViaTumorPathologyAssoc(pObject, 1, -1);
    }

    /**
     * Retrieves a List of PathologyDTO objects using the relation table TumorPathologyAssoc given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of PathologyDTO objects
     */
    // MANY TO MANY
    public List<PathologyDTO> loadPathologyViaTumorPathologyAssoc(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from Pathology, ");
        strSQL.append("        TumorPathologyAssoc");
        strSQL.append("  where TumorPathologyAssoc._TumorFrequency_key = ?");
        strSQL.append("    and TumorPathologyAssoc._Pathology_key = Pathology._Pathology_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return PathologyDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }

    /**
     * Retrieves a List of TumorProgressionTypeDTO objects using the relation table TumorProgression given a TumorFrequencyDTO object.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @return a List of TumorProgressionTypeDTO objects
     */
    // MANY TO MANY
    public List<TumorProgressionTypeDTO> loadTumorProgressionTypeViaTumorProgression(TumorFrequencyDTO pObject) 
        throws SQLException {
        return loadTumorProgressionTypeViaTumorProgression(pObject, 1, -1);
    }

    /**
     * Retrieves a List of TumorProgressionTypeDTO objects using the relation table TumorProgression given a TumorFrequencyDTO object, specifying the start row and the number of rows.
     *
     * @param pObject the TumorFrequencyDTO pObject to be used
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of TumorProgressionTypeDTO objects
     */
    // MANY TO MANY
    public List<TumorProgressionTypeDTO> loadTumorProgressionTypeViaTumorProgression(TumorFrequencyDTO pObject, int startRow, int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer strSQL = new StringBuffer();
        strSQL.append(" select *");
        strSQL.append("   from TumorProgressionType, ");
        strSQL.append("        TumorProgression");
        strSQL.append("  where TumorProgression._Child_key = ?");
        strSQL.append("    and TumorProgression._TumorProgressionType_key = TumorProgressionType._TumorProgressionType_key");
         try {
             c = getConnection();
             ps = c.prepareStatement(strSQL.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             DAOManagerMTB.setLong(ps, 1, pObject.getTumorFrequencyKey());
             return TumorProgressionTypeDAO.getInstance().loadByPreparedStatement(ps, null, startRow, numRows);
         } finally {
            getManager().close(ps);
            freeConnection(c);
         }
    }


    /**
     * Retrieves the max value for a specified column of the table TumorFrequency.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from TumorFrequency";
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
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__TUMORTYPE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__STRAIN_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__SEX_KEY:
                        iReturn = rs.getString(1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID__ORGANAFFECTED_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_NOTE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COLONYSIZE:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_AGEONSET:
                        iReturn = rs.getString(1);
                        break;
                    case ID_AGEDETECTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NUMMICEAFFECTED:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_INCIDENCE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_FREQNUM:
                        iReturn = rs.getBigDecimal(1);
                        break;
                    case ID_BREEDINGSTATUS:
                        iReturn = rs.getString(1);
                        break;
                    case ID_INFECTIONSTATUS:
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
     * Retrieves the min value for a specified column of the table TumorFrequency.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from TumorFrequency";
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
                    case ID__TUMORFREQUENCY_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__TUMORTYPE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__STRAIN_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__SEX_KEY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID__REFERENCE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID__ORGANAFFECTED_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_NOTE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COLONYSIZE:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_AGEONSET:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_AGEDETECTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NUMMICEAFFECTED:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_INCIDENCE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_FREQNUM:
                        iReturn = (java.math.BigDecimal)rs.getObject(1);
                        break;
                    case ID_BREEDINGSTATUS:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_INFECTIONSTATUS:
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
     * Retrieves the number of rows of the table TumorFrequency.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table TumorFrequency with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from TumorFrequency " + where;
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
     * Retrieves the number of rows of the table TumorFrequency with a prepared statement.
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
     * Looks for the number of elements of a specific TumorFrequencyDTO pObject given a c
     *
     * @param pObject the TumorFrequencyDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(TumorFrequencyDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from TumorFrequency WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorFrequency_key= ?");
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_TumorType_key= ?");
                }
    
                if (pObject.isStrainKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Strain_key= ?");
                }
    
                if (pObject.isSexKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Sex_key= ?");
                }
    
                if (pObject.isReferenceKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
                }
    
                if (pObject.isOrganAffectedKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_OrganAffected_key= ?");
                }
    
                if (pObject.isNoteModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
                }
    
                if (pObject.isColonySizeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("colonySize= ?");
                }
    
                if (pObject.isAgeOnsetModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageOnset= ?");
                }
    
                if (pObject.isAgeDetectionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("ageDetection= ?");
                }
    
                if (pObject.isNumMiceAffectedModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("numMiceAffected= ?");
                }
    
                if (pObject.isIncidenceModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("incidence= ?");
                }
    
                if (pObject.isFreqNumModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("freqNum= ?");
                }
    
                if (pObject.isBreedingStatusModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("breedingStatus= ?");
                }
    
                if (pObject.isInfectionStatusModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("infectionStatus= ?");
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
    
                if (pObject.isTumorFrequencyKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorFrequencyKey());
                }
    
                if (pObject.isTumorTypeKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getTumorTypeKey());
                }
    
                if (pObject.isStrainKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getStrainKey());
                }
    
                if (pObject.isSexKeyModified()) {
                    ps.setString(++_dirtyCount, pObject.getSexKey());
                }
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isOrganAffectedKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getOrganAffectedKey());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
                }
    
                if (pObject.isColonySizeModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getColonySize());
                }
    
                if (pObject.isAgeOnsetModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeOnset());
                }
    
                if (pObject.isAgeDetectionModified()) {
                    ps.setString(++_dirtyCount, pObject.getAgeDetection());
                }
    
                if (pObject.isNumMiceAffectedModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getNumMiceAffected());
                }
    
                if (pObject.isIncidenceModified()) {
                    ps.setString(++_dirtyCount, pObject.getIncidence());
                }
    
                if (pObject.isFreqNumModified()) {
                    ps.setBigDecimal(++_dirtyCount, pObject.getFreqNum());
                }
    
                if (pObject.isBreedingStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getBreedingStatus());
                }
    
                if (pObject.isInfectionStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getInfectionStatus());
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
     * Transforms a ResultSet iterating on the TumorFrequency on a TumorFrequencyDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting TumorFrequencyDTO pObject
     */
    public TumorFrequencyDTO decodeRow(ResultSet rs) throws SQLException {
        TumorFrequencyDTO pObject = createTumorFrequencyDTO();
        pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, 2));
        pObject.setStrainKey(DAOManagerMTB.getLong(rs, 3));
        pObject.setSexKey(rs.getString(4));
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 5));
        pObject.setOrganAffectedKey(DAOManagerMTB.getLong(rs, 6));
        pObject.setNote(rs.getString(7));
        pObject.setColonySize(DAOManagerMTB.getLong(rs, 8));
        pObject.setAgeOnset(rs.getString(9));
        pObject.setAgeDetection(rs.getString(10));
        pObject.setNumMiceAffected(DAOManagerMTB.getLong(rs, 11));
        pObject.setIncidence(rs.getString(12));
        pObject.setFreqNum(rs.getBigDecimal(13));
        pObject.setBreedingStatus(rs.getString(14));
        pObject.setInfectionStatus(rs.getString(15));
        pObject.setCreateUser(rs.getString(16));
        pObject.setCreateDate(rs.getTimestamp(17));
        pObject.setUpdateUser(rs.getString(18));
        pObject.setUpdateDate(rs.getTimestamp(19));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the TumorFrequency table on a TumorFrequencyDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting TumorFrequencyDTO pObject
     */
    public TumorFrequencyDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        TumorFrequencyDTO pObject = createTumorFrequencyDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__TUMORFREQUENCY_KEY:
                    ++pos;
                    pObject.setTumorFrequencyKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__TUMORTYPE_KEY:
                    ++pos;
                    pObject.setTumorTypeKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__STRAIN_KEY:
                    ++pos;
                    pObject.setStrainKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__SEX_KEY:
                    ++pos;
                    pObject.setSexKey(rs.getString(pos));
                    break;
                case ID__REFERENCE_KEY:
                    ++pos;
                    pObject.setReferenceKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID__ORGANAFFECTED_KEY:
                    ++pos;
                    pObject.setOrganAffectedKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_NOTE:
                    ++pos;
                    pObject.setNote(rs.getString(pos));
                    break;
                case ID_COLONYSIZE:
                    ++pos;
                    pObject.setColonySize(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_AGEONSET:
                    ++pos;
                    pObject.setAgeOnset(rs.getString(pos));
                    break;
                case ID_AGEDETECTION:
                    ++pos;
                    pObject.setAgeDetection(rs.getString(pos));
                    break;
                case ID_NUMMICEAFFECTED:
                    ++pos;
                    pObject.setNumMiceAffected(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_INCIDENCE:
                    ++pos;
                    pObject.setIncidence(rs.getString(pos));
                    break;
                case ID_FREQNUM:
                    ++pos;
                    pObject.setFreqNum(rs.getBigDecimal(pos));
                    break;
                case ID_BREEDINGSTATUS:
                    ++pos;
                    pObject.setBreedingStatus(rs.getString(pos));
                    break;
                case ID_INFECTIONSTATUS:
                    ++pos;
                    pObject.setInfectionStatus(rs.getString(pos));
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
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of TumorFrequencyDTO objects
     */
    public List<TumorFrequencyDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<TumorFrequencyDTO> v = new ArrayList<TumorFrequencyDTO>();
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
