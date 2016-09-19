
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.*;
import java.sql.*;
import org.jax.mgi.mtb.dao.*;
import org.jax.mgi.mtb.dao.mtb.*;
import org.jax.mgi.mtb.dao.gen.TableDTO;
// imports+ 

// imports- 


/**
 * Handles database calls for the Reference table.
 */
public class ReferenceDAO
// extends+ 

// extends- 

{


    // -------------------------------------------------------------- Constants

    /**
     * Column _Reference_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__REFERENCE_KEY = 0;
    public static final int TYPE__REFERENCE_KEY = Types.DECIMAL;
    public static final String NAME__REFERENCE_KEY = "_Reference_key";

    /**
     * Column title of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TITLE = 1;
    public static final int TYPE_TITLE = Types.VARCHAR;
    public static final String NAME_TITLE = "title";

    /**
     * Column title2 of type Types.VARCHAR mapped to String.
     */
    public static final int ID_TITLE2 = 2;
    public static final int TYPE_TITLE2 = Types.VARCHAR;
    public static final String NAME_TITLE2 = "title2";

    /**
     * Column authors of type Types.VARCHAR mapped to String.
     */
    public static final int ID_AUTHORS = 3;
    public static final int TYPE_AUTHORS = Types.VARCHAR;
    public static final String NAME_AUTHORS = "authors";

    /**
     * Column authors2 of type Types.VARCHAR mapped to String.
     */
    public static final int ID_AUTHORS2 = 4;
    public static final int TYPE_AUTHORS2 = Types.VARCHAR;
    public static final String NAME_AUTHORS2 = "authors2";

    /**
     * Column primaryAuthor of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PRIMARYAUTHOR = 5;
    public static final int TYPE_PRIMARYAUTHOR = Types.VARCHAR;
    public static final String NAME_PRIMARYAUTHOR = "primaryAuthor";

    /**
     * Column citation of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CITATION = 6;
    public static final int TYPE_CITATION = Types.VARCHAR;
    public static final String NAME_CITATION = "citation";

    /**
     * Column shortCitation of type Types.VARCHAR mapped to String.
     */
    public static final int ID_SHORTCITATION = 7;
    public static final int TYPE_SHORTCITATION = Types.VARCHAR;
    public static final String NAME_SHORTCITATION = "shortCitation";

    /**
     * Column journal of type Types.VARCHAR mapped to String.
     */
    public static final int ID_JOURNAL = 8;
    public static final int TYPE_JOURNAL = Types.VARCHAR;
    public static final String NAME_JOURNAL = "journal";

    /**
     * Column volume of type Types.VARCHAR mapped to String.
     */
    public static final int ID_VOLUME = 9;
    public static final int TYPE_VOLUME = Types.VARCHAR;
    public static final String NAME_VOLUME = "volume";

    /**
     * Column issue of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ISSUE = 10;
    public static final int TYPE_ISSUE = Types.VARCHAR;
    public static final String NAME_ISSUE = "issue";

    /**
     * Column pages of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PAGES = 11;
    public static final int TYPE_PAGES = Types.VARCHAR;
    public static final String NAME_PAGES = "pages";

    /**
     * Column year of type Types.VARCHAR mapped to String.
     */
    public static final int ID_YEAR = 12;
    public static final int TYPE_YEAR = Types.VARCHAR;
    public static final String NAME_YEAR = "year";

    /**
     * Column isReviewArticle of type Types.DECIMAL mapped to Long.
     */
    public static final int ID_ISREVIEWARTICLE = 13;
    public static final int TYPE_ISREVIEWARTICLE = Types.DECIMAL;
    public static final String NAME_ISREVIEWARTICLE = "isReviewArticle";

    /**
     * Column reviewStatus of type Types.VARCHAR mapped to String.
     */
    public static final int ID_REVIEWSTATUS = 14;
    public static final int TYPE_REVIEWSTATUS = Types.VARCHAR;
    public static final String NAME_REVIEWSTATUS = "reviewStatus";

    /**
     * Column person of type Types.VARCHAR mapped to String.
     */
    public static final int ID_PERSON = 15;
    public static final int TYPE_PERSON = Types.VARCHAR;
    public static final String NAME_PERSON = "person";

    /**
     * Column institution of type Types.VARCHAR mapped to String.
     */
    public static final int ID_INSTITUTION = 16;
    public static final int TYPE_INSTITUTION = Types.VARCHAR;
    public static final String NAME_INSTITUTION = "institution";

    /**
     * Column department of type Types.VARCHAR mapped to String.
     */
    public static final int ID_DEPARTMENT = 17;
    public static final int TYPE_DEPARTMENT = Types.VARCHAR;
    public static final String NAME_DEPARTMENT = "department";

    /**
     * Column address1 of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ADDRESS1 = 18;
    public static final int TYPE_ADDRESS1 = Types.VARCHAR;
    public static final String NAME_ADDRESS1 = "address1";

    /**
     * Column address2 of type Types.VARCHAR mapped to String.
     */
    public static final int ID_ADDRESS2 = 19;
    public static final int TYPE_ADDRESS2 = Types.VARCHAR;
    public static final String NAME_ADDRESS2 = "address2";

    /**
     * Column city of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CITY = 20;
    public static final int TYPE_CITY = Types.VARCHAR;
    public static final String NAME_CITY = "city";

    /**
     * Column stateProv of type Types.VARCHAR mapped to String.
     */
    public static final int ID_STATEPROV = 21;
    public static final int TYPE_STATEPROV = Types.VARCHAR;
    public static final String NAME_STATEPROV = "stateProv";

    /**
     * Column postalCode of type Types.VARCHAR mapped to String.
     */
    public static final int ID_POSTALCODE = 22;
    public static final int TYPE_POSTALCODE = Types.VARCHAR;
    public static final String NAME_POSTALCODE = "postalCode";

    /**
     * Column country of type Types.VARCHAR mapped to String.
     */
    public static final int ID_COUNTRY = 23;
    public static final int TYPE_COUNTRY = Types.VARCHAR;
    public static final String NAME_COUNTRY = "country";

    /**
     * Column url of type Types.VARCHAR mapped to String.
     */
    public static final int ID_URL = 24;
    public static final int TYPE_URL = Types.VARCHAR;
    public static final String NAME_URL = "url";

    /**
     * Column email of type Types.VARCHAR mapped to String.
     */
    public static final int ID_EMAIL = 25;
    public static final int TYPE_EMAIL = Types.VARCHAR;
    public static final String NAME_EMAIL = "email";

    /**
     * Column codedBy of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CODEDBY = 26;
    public static final int TYPE_CODEDBY = Types.VARCHAR;
    public static final String NAME_CODEDBY = "codedBy";

    /**
     * Column codedBy_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CODEDBY_DATE = 27;
    public static final int TYPE_CODEDBY_DATE = Types.TIMESTAMP;
    public static final String NAME_CODEDBY_DATE = "codedBy_date";

    /**
     * Column checkedBy of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CHECKEDBY = 28;
    public static final int TYPE_CHECKEDBY = Types.VARCHAR;
    public static final String NAME_CHECKEDBY = "checkedBy";

    /**
     * Column checkedBy_date of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CHECKEDBY_DATE = 29;
    public static final int TYPE_CHECKEDBY_DATE = Types.VARCHAR;
    public static final String NAME_CHECKEDBY_DATE = "checkedBy_date";

    /**
     * Column priority of type Types.DECIMAL mapped to Long.
     */
    public static final int ID_PRIORITY = 30;
    public static final int TYPE_PRIORITY = Types.DECIMAL;
    public static final String NAME_PRIORITY = "priority";

    /**
     * Column personalCommunication of type Types.CHAR mapped to String.
     */
    public static final int ID_PERSONALCOMMUNICATION = 31;
    public static final int TYPE_PERSONALCOMMUNICATION = Types.CHAR;
    public static final String NAME_PERSONALCOMMUNICATION = "personalCommunication";

    /**
     * Column note of type Types.VARCHAR mapped to String.
     */
    public static final int ID_NOTE = 32;
    public static final int TYPE_NOTE = Types.VARCHAR;
    public static final String NAME_NOTE = "note";

    /**
     * Column _MTBDataStatus_key of type Types.DECIMAL mapped to Long.
     */
    public static final int ID__MTBDATASTATUS_KEY = 33;
    public static final int TYPE__MTBDATASTATUS_KEY = Types.DECIMAL;
    public static final String NAME__MTBDATASTATUS_KEY = "_MTBDataStatus_key";

    /**
     * Column create_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_CREATE_USER = 34;
    public static final int TYPE_CREATE_USER = Types.VARCHAR;
    public static final String NAME_CREATE_USER = "create_user";

    /**
     * Column create_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_CREATE_DATE = 35;
    public static final int TYPE_CREATE_DATE = Types.TIMESTAMP;
    public static final String NAME_CREATE_DATE = "create_date";

    /**
     * Column update_user of type Types.VARCHAR mapped to String.
     */
    public static final int ID_UPDATE_USER = 36;
    public static final int TYPE_UPDATE_USER = Types.VARCHAR;
    public static final String NAME_UPDATE_USER = "update_user";

    /**
     * Column update_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_UPDATE_DATE = 37;
    public static final int TYPE_UPDATE_DATE = Types.TIMESTAMP;
    public static final String NAME_UPDATE_DATE = "update_date";

    /**
     * Column reference_date of type Types.TIMESTAMP mapped to java.util.Date.
     */
    public static final int ID_REFERENCE_DATE = 38;
    public static final int TYPE_REFERENCE_DATE = Types.TIMESTAMP;
    public static final String NAME_REFERENCE_DATE = "reference_date";

    /**
     * Column abstractText of type Types.LONGVARCHAR mapped to String.
     */
    public static final int ID_ABSTRACTTEXT = 39;
    public static final int TYPE_ABSTRACTTEXT = Types.LONGVARCHAR;
    public static final String NAME_ABSTRACTTEXT = "abstractText";


    private static final String TABLE_NAME = "Reference";

    /**
     * Create an array of type string containing all the fields of the Reference table.
     */
    private static final String[] FIELD_NAMES = {
        "Reference._Reference_key"
        ,"Reference.title"
        ,"Reference.title2"
        ,"Reference.authors"
        ,"Reference.authors2"
        ,"Reference.primaryAuthor"
        ,"Reference.citation"
        ,"Reference.shortCitation"
        ,"Reference.journal"
        ,"Reference.volume"
        ,"Reference.issue"
        ,"Reference.pages"
        ,"Reference.year"
        ,"Reference.isReviewArticle"
        ,"Reference.reviewStatus"
        ,"Reference.person"
        ,"Reference.institution"
        ,"Reference.department"
        ,"Reference.address1"
        ,"Reference.address2"
        ,"Reference.city"
        ,"Reference.stateProv"
        ,"Reference.postalCode"
        ,"Reference.country"
        ,"Reference.url"
        ,"Reference.email"
        ,"Reference.codedBy"
        ,"Reference.codedBy_date"
        ,"Reference.checkedBy"
        ,"Reference.checkedBy_date"
        ,"Reference.priority"
        ,"Reference.personalCommunication"
        ,"Reference.note"
        ,"Reference._MTBDataStatus_key"
        ,"Reference.create_user"
        ,"Reference.create_date"
        ,"Reference.update_user"
        ,"Reference.update_date"
        ,"Reference.reference_date"
        ,"Reference.abstractText"
    };

    /**
     * Create an array of type containing all the fields of the Reference table.
     */
    private static final Object[] FIELD_TYPES = {
        "Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"String"
        ,"Long"
        ,"String"
        ,"java.util.Date"
        ,"String"
        ,"java.util.Date"
        ,"java.util.Date"
        ,"String"
    };

    /**
     * Field that contains the comma separated fields of the Reference table.
     */
    private static final String ALL_FIELDS = "Reference._Reference_key"
                            + ",Reference.title"
                            + ",Reference.title2"
                            + ",Reference.authors"
                            + ",Reference.authors2"
                            + ",Reference.primaryAuthor"
                            + ",Reference.citation"
                            + ",Reference.shortCitation"
                            + ",Reference.journal"
                            + ",Reference.volume"
                            + ",Reference.issue"
                            + ",Reference.pages"
                            + ",Reference.year"
                            + ",Reference.isReviewArticle"
                            + ",Reference.reviewStatus"
                            + ",Reference.person"
                            + ",Reference.institution"
                            + ",Reference.department"
                            + ",Reference.address1"
                            + ",Reference.address2"
                            + ",Reference.city"
                            + ",Reference.stateProv"
                            + ",Reference.postalCode"
                            + ",Reference.country"
                            + ",Reference.url"
                            + ",Reference.email"
                            + ",Reference.codedBy"
                            + ",Reference.codedBy_date"
                            + ",Reference.checkedBy"
                            + ",Reference.checkedBy_date"
                            + ",Reference.priority"
                            + ",Reference.personalCommunication"
                            + ",Reference.note"
                            + ",Reference._MTBDataStatus_key"
                            + ",Reference.create_user"
                            + ",Reference.create_date"
                            + ",Reference.update_user"
                            + ",Reference.update_date"
                            + ",Reference.reference_date"
                            + ",Reference.abstractText";


    // ----------------------------------------------------- Instance Variables

    private static ReferenceDAO singleton = new ReferenceDAO();

    // --------------------------------------------------------- Public Methods

    /**
     * Get the ReferenceDAO singleton.
     *
     * @return ReferenceDAO 
     */
    synchronized public static ReferenceDAO getInstance() {
        return singleton;
    }

    /**
     * Sets your own ReferenceDAO instance.
     <br>
     * This is optional, by default we provide it for you.
     */
    synchronized public static void setInstance(ReferenceDAO instance) {
        singleton = instance;
    }


    /**
     * Creates a new ReferenceDTO instance.
     *
     * @return the new ReferenceDTO 
     */
    public ReferenceDTO createReferenceDTO() {
        return new ReferenceDTO();
    }

    //-------------------------------------------------------------------------
    // PRIMARY KEY METHODS
    //-------------------------------------------------------------------------

    /**
     * Loads a ReferenceDTO from the Reference using its key fields.
     *
     * @return a unique ReferenceDTO 
     */
    public ReferenceDTO loadByPrimaryKey(Long ReferenceKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Reference WHERE Reference._Reference_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ReferenceKey);
            List<ReferenceDTO> pReturn = loadByPreparedStatement(ps);
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
    public int deleteByPrimaryKey(Long ReferenceKey) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("DELETE from Reference WHERE Reference._Reference_key=?",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            DAOManagerMTB.setLong(ps, 1, ReferenceKey);
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
     * Loads all the rows from Reference.
     *
     * @return a List of ReferenceDAO objects
     */
    public List<ReferenceDTO> loadAll() throws SQLException {
        return loadAll(1, -1);
    }


    /**
     * Loads the given number of rows from Reference, given the start row.
     *
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return a List of ReferenceDAO objects
     */
    public List<ReferenceDTO> loadAll(int startRow, int numRows) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = getConnection();
            ps = c.prepareStatement("SELECT " + ALL_FIELDS + " FROM Reference",
                                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
            return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Retrieves a List of ReferenceDTO objects given a sql 'where' clause.
     *
     * @param where the sql 'where' clause
     * @return the resulting ReferenceDTO table 
     */
    public List<ReferenceDTO> loadByWhere(String where) throws SQLException {
        return loadByWhere(where, null);
    }

    /**
     * Retrieves a List of ReferenceDTO objects given a sql where clause, and a list of fields.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param fieldList table of the field's associated constants
     * @return the resulting ReferenceDTO table 
     */
    public List<ReferenceDTO> loadByWhere(String where, int[] fieldList) 
        throws SQLException {
        return loadByWhere(where, null, 1, -1);
    }

    /**
     * Retrieves a List of ReferenceDTO objects given a sql where clause and a list of fields, and startRow and numRows.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the sql 'where' clause
     * @param startRow the start row to be used (first row = 1, last row = -1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @param fieldList table of the field's associated constants
     * @return the resulting ReferenceDTO table 
     */
    public List<ReferenceDTO> loadByWhere(String where, 
                                         int[] fieldList, 
                                         int startRow, 
                                         int numRows) 
        throws SQLException {
        String sql = null;
        if(fieldList == null) {
            sql = "select " + ALL_FIELDS + " from Reference " + where;
        } else {
            StringBuffer buff = new StringBuffer(128);
            buff.append("select ");
            for(int i = 0; i < fieldList.length; i++) {
                if(i != 0) {
                    buff.append(',');
                }
                buff.append(FIELD_NAMES[fieldList[i]]);
            }
            buff.append(" from Reference ");
            buff.append(where);
            sql = buff.toString();
            buff = null;
        }
        Connection c = null;
        Statement pStatement = null;
        ResultSet rs =  null;
        List<ReferenceDTO> v = new ArrayList<ReferenceDTO>();
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
     * Deletes all rows from Reference table.
     * @return the number of deleted rows.
     */
    public int deleteAll() throws SQLException {
        return deleteByWhere("");
    }


    /**
     * Deletes rows from the Reference table using a 'where' clause.
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
            String delByWhereSQL = "DELETE FROM Reference " + where;
            ps = c.prepareStatement(delByWhereSQL);
            return ps.executeUpdate();
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Saves the ReferenceDTO pObject into the database.
     *
     * @param pObject the ReferenceDTO pObject to be saved
     */
    public ReferenceDTO save(ReferenceDTO pObject) 
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;

        if (pObject.getReferenceKey() == null) {
            Object obj = max(ID__REFERENCE_KEY);
            Long val = new Long(0);
            if (obj != null) {
                val = (Long)obj;
            }
            long key = val.longValue();
            pObject.setReferenceKey(++key);
        }
    
        try {
            c = getConnection();
            if (pObject.isNew()) {
                // ------------ SAVE ------------ 
                int _dirtyCount = 0;
                _sql = new StringBuffer("INSERT into Reference (");
    
                if (pObject.isReferenceKeyModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("_Reference_key");
                    _dirtyCount++;
                }

                if (pObject.isTitleModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("title");
                    _dirtyCount++;
                }

                if (pObject.isTitle2Modified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("title2");
                    _dirtyCount++;
                }

                if (pObject.isAuthorsModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("authors");
                    _dirtyCount++;
                }

                if (pObject.isAuthors2Modified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("authors2");
                    _dirtyCount++;
                }

                if (pObject.isPrimaryAuthorModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("primaryAuthor");
                    _dirtyCount++;
                }

                if (pObject.isCitationModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("citation");
                    _dirtyCount++;
                }

                if (pObject.isShortCitationModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("shortCitation");
                    _dirtyCount++;
                }

                if (pObject.isJournalModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("journal");
                    _dirtyCount++;
                }

                if (pObject.isVolumeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("volume");
                    _dirtyCount++;
                }

                if (pObject.isIssueModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("issue");
                    _dirtyCount++;
                }

                if (pObject.isPagesModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("pages");
                    _dirtyCount++;
                }

                if (pObject.isYearModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("year");
                    _dirtyCount++;
                }

                if (pObject.isIsReviewArticleModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("isReviewArticle");
                    _dirtyCount++;
                }

                if (pObject.isReviewStatusModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("reviewStatus");
                    _dirtyCount++;
                }

                if (pObject.isPersonModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("person");
                    _dirtyCount++;
                }

                if (pObject.isInstitutionModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("institution");
                    _dirtyCount++;
                }

                if (pObject.isDepartmentModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("department");
                    _dirtyCount++;
                }

                if (pObject.isAddress1Modified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("address1");
                    _dirtyCount++;
                }

                if (pObject.isAddress2Modified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("address2");
                    _dirtyCount++;
                }

                if (pObject.isCityModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("city");
                    _dirtyCount++;
                }

                if (pObject.isStateProvModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("stateProv");
                    _dirtyCount++;
                }

                if (pObject.isPostalCodeModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("postalCode");
                    _dirtyCount++;
                }

                if (pObject.isCountryModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("country");
                    _dirtyCount++;
                }

                if (pObject.isUrlModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("url");
                    _dirtyCount++;
                }

                if (pObject.isEmailModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("email");
                    _dirtyCount++;
                }

                if (pObject.isCodedByModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("codedBy");
                    _dirtyCount++;
                }

                if (pObject.isCodedByDateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("codedBy_date");
                    _dirtyCount++;
                }

                if (pObject.isCheckedByModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("checkedBy");
                    _dirtyCount++;
                }

                if (pObject.isCheckedByDateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("checkedBy_date");
                    _dirtyCount++;
                }

                if (pObject.isPriorityModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("priority");
                    _dirtyCount++;
                }

                if (pObject.isPersonalCommunicationModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("personalCommunication");
                    _dirtyCount++;
                }

                if (pObject.isNoteModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("note");
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

                if (pObject.isReferenceDateModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("reference_date");
                    _dirtyCount++;
                }

                if (pObject.isAbstractTextModified()) {
                    if (_dirtyCount>0) {
                        _sql.append(',');
                    }
                    _sql.append("abstractText");
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

                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isTitleModified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle());
                }
    
                if (pObject.isTitle2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle2());
                }
    
                if (pObject.isAuthorsModified()) {
                    ps.setString(++_dirtyCount, pObject.getAuthors());
                }
    
                if (pObject.isAuthors2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAuthors2());
                }
    
                if (pObject.isPrimaryAuthorModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrimaryAuthor());
                }
    
                if (pObject.isCitationModified()) {
                    ps.setString(++_dirtyCount, pObject.getCitation());
                }
    
                if (pObject.isShortCitationModified()) {
                    ps.setString(++_dirtyCount, pObject.getShortCitation());
                }
    
                if (pObject.isJournalModified()) {
                    ps.setString(++_dirtyCount, pObject.getJournal());
                }
    
                if (pObject.isVolumeModified()) {
                    ps.setString(++_dirtyCount, pObject.getVolume());
                }
    
                if (pObject.isIssueModified()) {
                    ps.setString(++_dirtyCount, pObject.getIssue());
                }
    
                if (pObject.isPagesModified()) {
                    ps.setString(++_dirtyCount, pObject.getPages());
                }
    
                if (pObject.isYearModified()) {
                    ps.setString(++_dirtyCount, pObject.getYear());
                }
    
                if (pObject.isIsReviewArticleModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getIsReviewArticle());
                }
    
                if (pObject.isReviewStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getReviewStatus());
                }
    
                if (pObject.isPersonModified()) {
                    ps.setString(++_dirtyCount, pObject.getPerson());
                }
    
                if (pObject.isInstitutionModified()) {
                    ps.setString(++_dirtyCount, pObject.getInstitution());
                }
    
                if (pObject.isDepartmentModified()) {
                    ps.setString(++_dirtyCount, pObject.getDepartment());
                }
    
                if (pObject.isAddress1Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAddress1());
                }
    
                if (pObject.isAddress2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAddress2());
                }
    
                if (pObject.isCityModified()) {
                    ps.setString(++_dirtyCount, pObject.getCity());
                }
    
                if (pObject.isStateProvModified()) {
                    ps.setString(++_dirtyCount, pObject.getStateProv());
                }
    
                if (pObject.isPostalCodeModified()) {
                    ps.setString(++_dirtyCount, pObject.getPostalCode());
                }
    
                if (pObject.isCountryModified()) {
                    ps.setString(++_dirtyCount, pObject.getCountry());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isEmailModified()) {
                    ps.setString(++_dirtyCount, pObject.getEmail());
                }
    
                if (pObject.isCodedByModified()) {
                    ps.setString(++_dirtyCount, pObject.getCodedBy());
                }
    
                if (pObject.isCodedByDateModified()) {
                    if (pObject.getCodedByDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCodedByDate().getTime())); }
                }
    
                if (pObject.isCheckedByModified()) {
                    ps.setString(++_dirtyCount, pObject.getCheckedBy());
                }
    
                if (pObject.isCheckedByDateModified()) {
                    ps.setString(++_dirtyCount, pObject.getCheckedByDate());
                }
    
                if (pObject.isPriorityModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPriority());
                }
    
                if (pObject.isPersonalCommunicationModified()) {
                    ps.setString(++_dirtyCount, pObject.getPersonalCommunication());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
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
    
                if (pObject.isReferenceDateModified()) {
                    if (pObject.getReferenceDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getReferenceDate().getTime())); }
                }
    
                if (pObject.isAbstractTextModified()) {
                    ps.setString(++_dirtyCount, pObject.getAbstractText());
                }
    
                ps.executeUpdate();
    
                pObject.isNew(false);
                pObject.resetIsModified();
            } else { 
                if (pObject.isOld()) { 
                    int num = deleteUsingTemplate(pObject);
                } else { // UPDATE 
                _sql = new StringBuffer("UPDATE Reference SET ");
                boolean useComma=false;

                if (pObject.isReferenceKeyModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("_Reference_key").append("=?");
                }

                if (pObject.isTitleModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("title").append("=?");
                }

                if (pObject.isTitle2Modified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("title2").append("=?");
                }

                if (pObject.isAuthorsModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("authors").append("=?");
                }

                if (pObject.isAuthors2Modified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("authors2").append("=?");
                }

                if (pObject.isPrimaryAuthorModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("primaryAuthor").append("=?");
                }

                if (pObject.isCitationModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("citation").append("=?");
                }

                if (pObject.isShortCitationModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("shortCitation").append("=?");
                }

                if (pObject.isJournalModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("journal").append("=?");
                }

                if (pObject.isVolumeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("volume").append("=?");
                }

                if (pObject.isIssueModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("issue").append("=?");
                }

                if (pObject.isPagesModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("pages").append("=?");
                }

                if (pObject.isYearModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("year").append("=?");
                }

                if (pObject.isIsReviewArticleModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("isReviewArticle").append("=?");
                }

                if (pObject.isReviewStatusModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("reviewStatus").append("=?");
                }

                if (pObject.isPersonModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("person").append("=?");
                }

                if (pObject.isInstitutionModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("institution").append("=?");
                }

                if (pObject.isDepartmentModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("department").append("=?");
                }

                if (pObject.isAddress1Modified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("address1").append("=?");
                }

                if (pObject.isAddress2Modified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("address2").append("=?");
                }

                if (pObject.isCityModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("city").append("=?");
                }

                if (pObject.isStateProvModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("stateProv").append("=?");
                }

                if (pObject.isPostalCodeModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("postalCode").append("=?");
                }

                if (pObject.isCountryModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("country").append("=?");
                }

                if (pObject.isUrlModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("url").append("=?");
                }

                if (pObject.isEmailModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("email").append("=?");
                }

                if (pObject.isCodedByModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("codedBy").append("=?");
                }

                if (pObject.isCodedByDateModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("codedBy_date").append("=?");
                }

                if (pObject.isCheckedByModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("checkedBy").append("=?");
                }

                if (pObject.isCheckedByDateModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("checkedBy_date").append("=?");
                }

                if (pObject.isPriorityModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("priority").append("=?");
                }

                if (pObject.isPersonalCommunicationModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("personalCommunication").append("=?");
                }

                if (pObject.isNoteModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("note").append("=?");
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

                if (pObject.isReferenceDateModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("reference_date").append("=?");
                }

                if (pObject.isAbstractTextModified()) {
                    if (useComma) {
                        _sql.append(',');
                    } else {
                        useComma=true;
                    }
                    _sql.append("abstractText").append("=?");
                }
                _sql.append(" WHERE ");
                _sql.append("Reference._Reference_key=?");
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                int _dirtyCount = 0;

                if (pObject.isReferenceKeyModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }

                if (pObject.isTitleModified()) {
                      ps.setString(++_dirtyCount, pObject.getTitle());
                }

                if (pObject.isTitle2Modified()) {
                      ps.setString(++_dirtyCount, pObject.getTitle2());
                }

                if (pObject.isAuthorsModified()) {
                      ps.setString(++_dirtyCount, pObject.getAuthors());
                }

                if (pObject.isAuthors2Modified()) {
                      ps.setString(++_dirtyCount, pObject.getAuthors2());
                }

                if (pObject.isPrimaryAuthorModified()) {
                      ps.setString(++_dirtyCount, pObject.getPrimaryAuthor());
                }

                if (pObject.isCitationModified()) {
                      ps.setString(++_dirtyCount, pObject.getCitation());
                }

                if (pObject.isShortCitationModified()) {
                      ps.setString(++_dirtyCount, pObject.getShortCitation());
                }

                if (pObject.isJournalModified()) {
                      ps.setString(++_dirtyCount, pObject.getJournal());
                }

                if (pObject.isVolumeModified()) {
                      ps.setString(++_dirtyCount, pObject.getVolume());
                }

                if (pObject.isIssueModified()) {
                      ps.setString(++_dirtyCount, pObject.getIssue());
                }

                if (pObject.isPagesModified()) {
                      ps.setString(++_dirtyCount, pObject.getPages());
                }

                if (pObject.isYearModified()) {
                      ps.setString(++_dirtyCount, pObject.getYear());
                }

                if (pObject.isIsReviewArticleModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getIsReviewArticle());
                }

                if (pObject.isReviewStatusModified()) {
                      ps.setString(++_dirtyCount, pObject.getReviewStatus());
                }

                if (pObject.isPersonModified()) {
                      ps.setString(++_dirtyCount, pObject.getPerson());
                }

                if (pObject.isInstitutionModified()) {
                      ps.setString(++_dirtyCount, pObject.getInstitution());
                }

                if (pObject.isDepartmentModified()) {
                      ps.setString(++_dirtyCount, pObject.getDepartment());
                }

                if (pObject.isAddress1Modified()) {
                      ps.setString(++_dirtyCount, pObject.getAddress1());
                }

                if (pObject.isAddress2Modified()) {
                      ps.setString(++_dirtyCount, pObject.getAddress2());
                }

                if (pObject.isCityModified()) {
                      ps.setString(++_dirtyCount, pObject.getCity());
                }

                if (pObject.isStateProvModified()) {
                      ps.setString(++_dirtyCount, pObject.getStateProv());
                }

                if (pObject.isPostalCodeModified()) {
                      ps.setString(++_dirtyCount, pObject.getPostalCode());
                }

                if (pObject.isCountryModified()) {
                      ps.setString(++_dirtyCount, pObject.getCountry());
                }

                if (pObject.isUrlModified()) {
                      ps.setString(++_dirtyCount, pObject.getUrl());
                }

                if (pObject.isEmailModified()) {
                      ps.setString(++_dirtyCount, pObject.getEmail());
                }

                if (pObject.isCodedByModified()) {
                      ps.setString(++_dirtyCount, pObject.getCodedBy());
                }

                if (pObject.isCodedByDateModified()) {
                      if (pObject.getCodedByDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCodedByDate().getTime())); }
                }

                if (pObject.isCheckedByModified()) {
                      ps.setString(++_dirtyCount, pObject.getCheckedBy());
                }

                if (pObject.isCheckedByDateModified()) {
                      ps.setString(++_dirtyCount, pObject.getCheckedByDate());
                }

                if (pObject.isPriorityModified()) {
                      DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPriority());
                }

                if (pObject.isPersonalCommunicationModified()) {
                      ps.setString(++_dirtyCount, pObject.getPersonalCommunication());
                }

                if (pObject.isNoteModified()) {
                      ps.setString(++_dirtyCount, pObject.getNote());
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

                if (pObject.isReferenceDateModified()) {
                      if (pObject.getReferenceDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getReferenceDate().getTime())); }
                }

                if (pObject.isAbstractTextModified()) {
                      ps.setString(++_dirtyCount, pObject.getAbstractText());
                }
    
                if (_dirtyCount == 0) {
                     return pObject;
                }
    
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKeyOriginal());
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
     * Saves a List of ReferenceDTO objects into the database.
     *
     * @param pObjects the ReferenceDTO pObject table to be saved
     * @return the saved ReferenceDTO List.
     */
    public List<ReferenceDTO> save(List<ReferenceDTO> pObjects) throws SQLException {
        for (ReferenceDTO bean : pObjects) {
            save(bean);
        }
        return pObjects;
    }



    /**
     * Loads a unique ReferenceDTO object from a template
     *
     * @param pObject the ReferenceDTO object to look for
     * @return the pObject matching the template
     */
    public ReferenceDTO loadUniqueUsingTemplate(ReferenceDTO pObject) 
        throws SQLException {
         List<ReferenceDTO> pReturn = loadUsingTemplate(pObject);
         if (pReturn.size() == 0) {
             return null;
         }
         if (pReturn.size() > 1) {
             throw new SQLException("More than one element !!");
         }
         return pReturn.get(0);
     }

    /**
     * Loads a List of ReferenceDTO objects from a template one.
     *
     * @param pObject the ReferenceDTO template to look for
     * @return all the ReferenceDTO objects matching the template
     */
    public List<ReferenceDTO> loadUsingTemplate(ReferenceDTO pObject) 
        throws SQLException {
        return loadUsingTemplate(pObject, 1, -1);
    }
    /**
     * Loads an array of ReferenceDTO from a template one, given the start row and number of rows.
     *
     * @param pObject the ReferenceDTO template to look for
     * @param startRow the start row to be used (first row = 1, last row=-1)
     * @param numRows the number of rows to be retrieved (all rows = a negative number)
     * @return all the ReferenceDTO matching the template
     */
    public List<ReferenceDTO> loadUsingTemplate(ReferenceDTO pObject,
                                               int startRow,
                                               int numRows)
        throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = new StringBuffer("SELECT " + ALL_FIELDS + " from Reference WHERE ");
        StringBuffer _sqlWhere = new StringBuffer("");
        try {
            int _dirtyCount = 0;
    
             if (pObject.isReferenceKeyModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
             }
    
             if (pObject.isTitleModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title= ?");
             }
    
             if (pObject.isTitle2Modified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title2= ?");
             }
    
             if (pObject.isAuthorsModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("authors= ?");
             }
    
             if (pObject.isAuthors2Modified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("authors2= ?");
             }
    
             if (pObject.isPrimaryAuthorModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("primaryAuthor= ?");
             }
    
             if (pObject.isCitationModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("citation= ?");
             }
    
             if (pObject.isShortCitationModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("shortCitation= ?");
             }
    
             if (pObject.isJournalModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("journal= ?");
             }
    
             if (pObject.isVolumeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("volume= ?");
             }
    
             if (pObject.isIssueModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("issue= ?");
             }
    
             if (pObject.isPagesModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("pages= ?");
             }
    
             if (pObject.isYearModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("year= ?");
             }
    
             if (pObject.isIsReviewArticleModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("isReviewArticle= ?");
             }
    
             if (pObject.isReviewStatusModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reviewStatus= ?");
             }
    
             if (pObject.isPersonModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("person= ?");
             }
    
             if (pObject.isInstitutionModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("institution= ?");
             }
    
             if (pObject.isDepartmentModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("department= ?");
             }
    
             if (pObject.isAddress1Modified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("address1= ?");
             }
    
             if (pObject.isAddress2Modified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("address2= ?");
             }
    
             if (pObject.isCityModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("city= ?");
             }
    
             if (pObject.isStateProvModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("stateProv= ?");
             }
    
             if (pObject.isPostalCodeModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("postalCode= ?");
             }
    
             if (pObject.isCountryModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("country= ?");
             }
    
             if (pObject.isUrlModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
             }
    
             if (pObject.isEmailModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("email= ?");
             }
    
             if (pObject.isCodedByModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("codedBy= ?");
             }
    
             if (pObject.isCodedByDateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("codedBy_date= ?");
             }
    
             if (pObject.isCheckedByModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("checkedBy= ?");
             }
    
             if (pObject.isCheckedByDateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("checkedBy_date= ?");
             }
    
             if (pObject.isPriorityModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("priority= ?");
             }
    
             if (pObject.isPersonalCommunicationModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("personalCommunication= ?");
             }
    
             if (pObject.isNoteModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
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
    
             if (pObject.isReferenceDateModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reference_date= ?");
             }
    
             if (pObject.isAbstractTextModified()) {
                 _dirtyCount ++; 
                 _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("abstractText= ?");
             }
    
             if (_dirtyCount == 0) {
                 throw new SQLException ("The pObject to look for is invalid : not initialized !");
             }
             _sql.append(_sqlWhere);
             c = getConnection();
             ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             _dirtyCount = 0;
    
             if (pObject.isReferenceKeyModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
             }
    
             if (pObject.isTitleModified()) {
                 ps.setString(++_dirtyCount, pObject.getTitle());
             }
    
             if (pObject.isTitle2Modified()) {
                 ps.setString(++_dirtyCount, pObject.getTitle2());
             }
    
             if (pObject.isAuthorsModified()) {
                 ps.setString(++_dirtyCount, pObject.getAuthors());
             }
    
             if (pObject.isAuthors2Modified()) {
                 ps.setString(++_dirtyCount, pObject.getAuthors2());
             }
    
             if (pObject.isPrimaryAuthorModified()) {
                 ps.setString(++_dirtyCount, pObject.getPrimaryAuthor());
             }
    
             if (pObject.isCitationModified()) {
                 ps.setString(++_dirtyCount, pObject.getCitation());
             }
    
             if (pObject.isShortCitationModified()) {
                 ps.setString(++_dirtyCount, pObject.getShortCitation());
             }
    
             if (pObject.isJournalModified()) {
                 ps.setString(++_dirtyCount, pObject.getJournal());
             }
    
             if (pObject.isVolumeModified()) {
                 ps.setString(++_dirtyCount, pObject.getVolume());
             }
    
             if (pObject.isIssueModified()) {
                 ps.setString(++_dirtyCount, pObject.getIssue());
             }
    
             if (pObject.isPagesModified()) {
                 ps.setString(++_dirtyCount, pObject.getPages());
             }
    
             if (pObject.isYearModified()) {
                 ps.setString(++_dirtyCount, pObject.getYear());
             }
    
             if (pObject.isIsReviewArticleModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getIsReviewArticle());
             }
    
             if (pObject.isReviewStatusModified()) {
                 ps.setString(++_dirtyCount, pObject.getReviewStatus());
             }
    
             if (pObject.isPersonModified()) {
                 ps.setString(++_dirtyCount, pObject.getPerson());
             }
    
             if (pObject.isInstitutionModified()) {
                 ps.setString(++_dirtyCount, pObject.getInstitution());
             }
    
             if (pObject.isDepartmentModified()) {
                 ps.setString(++_dirtyCount, pObject.getDepartment());
             }
    
             if (pObject.isAddress1Modified()) {
                 ps.setString(++_dirtyCount, pObject.getAddress1());
             }
    
             if (pObject.isAddress2Modified()) {
                 ps.setString(++_dirtyCount, pObject.getAddress2());
             }
    
             if (pObject.isCityModified()) {
                 ps.setString(++_dirtyCount, pObject.getCity());
             }
    
             if (pObject.isStateProvModified()) {
                 ps.setString(++_dirtyCount, pObject.getStateProv());
             }
    
             if (pObject.isPostalCodeModified()) {
                 ps.setString(++_dirtyCount, pObject.getPostalCode());
             }
    
             if (pObject.isCountryModified()) {
                 ps.setString(++_dirtyCount, pObject.getCountry());
             }
    
             if (pObject.isUrlModified()) {
                 ps.setString(++_dirtyCount, pObject.getUrl());
             }
    
             if (pObject.isEmailModified()) {
                 ps.setString(++_dirtyCount, pObject.getEmail());
             }
    
             if (pObject.isCodedByModified()) {
                 ps.setString(++_dirtyCount, pObject.getCodedBy());
             }
    
             if (pObject.isCodedByDateModified()) {
                 if (pObject.getCodedByDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCodedByDate().getTime())); }
             }
    
             if (pObject.isCheckedByModified()) {
                 ps.setString(++_dirtyCount, pObject.getCheckedBy());
             }
    
             if (pObject.isCheckedByDateModified()) {
                 ps.setString(++_dirtyCount, pObject.getCheckedByDate());
             }
    
             if (pObject.isPriorityModified()) {
                 DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPriority());
             }
    
             if (pObject.isPersonalCommunicationModified()) {
                 ps.setString(++_dirtyCount, pObject.getPersonalCommunication());
             }
    
             if (pObject.isNoteModified()) {
                 ps.setString(++_dirtyCount, pObject.getNote());
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
    
             if (pObject.isReferenceDateModified()) {
                 if (pObject.getReferenceDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getReferenceDate().getTime())); }
             }
    
             if (pObject.isAbstractTextModified()) {
                 ps.setString(++_dirtyCount, pObject.getAbstractText());
             }
    
             return loadByPreparedStatement(ps, null, startRow, numRows);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }
    /**
     * Deletes rows using a ReferenceDTO template.
     *
     * @param pObject the ReferenceDTO object(s) to be deleted
     * @return the number of deleted objects
     */
    public int deleteUsingTemplate(ReferenceDTO pObject) throws SQLException {
        if (pObject.isReferenceKeyInitialized()) {
            return deleteByPrimaryKey(pObject.getReferenceKey());
        }
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer sql = null;
    
        try  {
            sql = new StringBuffer("DELETE FROM Reference WHERE ");
            int _dirtyAnd = 0;
            if (pObject.isReferenceKeyInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("_Reference_key").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTitleInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("title").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isTitle2Initialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("title2").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAuthorsInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("authors").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAuthors2Initialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("authors2").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPrimaryAuthorInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("primaryAuthor").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCitationInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("citation").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isShortCitationInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("shortCitation").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isJournalInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("journal").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isVolumeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("volume").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isIssueInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("issue").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPagesInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("pages").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isYearInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("year").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isIsReviewArticleInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("isReviewArticle").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isReviewStatusInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("reviewStatus").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPersonInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("person").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isInstitutionInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("institution").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isDepartmentInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("department").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAddress1Initialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("address1").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAddress2Initialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("address2").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCityInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("city").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isStateProvInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("stateProv").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPostalCodeInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("postalCode").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCountryInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("country").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isUrlInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("url").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isEmailInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("email").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCodedByInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("codedBy").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCodedByDateInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("codedBy_date").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCheckedByInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("checkedBy").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isCheckedByDateInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("checkedBy_date").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPriorityInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("priority").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isPersonalCommunicationInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("personalCommunication").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isNoteInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("note").append("=?");
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
    
            if (pObject.isReferenceDateInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("reference_date").append("=?");
                _dirtyAnd ++;
            }
    
            if (pObject.isAbstractTextInitialized()) {
                if (_dirtyAnd > 0) {
                    sql.append(" AND ");
                }
                sql.append("abstractText").append("=?");
                _dirtyAnd ++;
            }
    
            c = getConnection();
            ps = c.prepareStatement(sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            int _dirtyCount = 0;
    
            if (pObject.isReferenceKeyInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
            }
    
            if (pObject.isTitleInitialized()) {
                ps.setString(++_dirtyCount, pObject.getTitle());
            }
    
            if (pObject.isTitle2Initialized()) {
                ps.setString(++_dirtyCount, pObject.getTitle2());
            }
    
            if (pObject.isAuthorsInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAuthors());
            }
    
            if (pObject.isAuthors2Initialized()) {
                ps.setString(++_dirtyCount, pObject.getAuthors2());
            }
    
            if (pObject.isPrimaryAuthorInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPrimaryAuthor());
            }
    
            if (pObject.isCitationInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCitation());
            }
    
            if (pObject.isShortCitationInitialized()) {
                ps.setString(++_dirtyCount, pObject.getShortCitation());
            }
    
            if (pObject.isJournalInitialized()) {
                ps.setString(++_dirtyCount, pObject.getJournal());
            }
    
            if (pObject.isVolumeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getVolume());
            }
    
            if (pObject.isIssueInitialized()) {
                ps.setString(++_dirtyCount, pObject.getIssue());
            }
    
            if (pObject.isPagesInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPages());
            }
    
            if (pObject.isYearInitialized()) {
                ps.setString(++_dirtyCount, pObject.getYear());
            }
    
            if (pObject.isIsReviewArticleInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getIsReviewArticle());
            }
    
            if (pObject.isReviewStatusInitialized()) {
                ps.setString(++_dirtyCount, pObject.getReviewStatus());
            }
    
            if (pObject.isPersonInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPerson());
            }
    
            if (pObject.isInstitutionInitialized()) {
                ps.setString(++_dirtyCount, pObject.getInstitution());
            }
    
            if (pObject.isDepartmentInitialized()) {
                ps.setString(++_dirtyCount, pObject.getDepartment());
            }
    
            if (pObject.isAddress1Initialized()) {
                ps.setString(++_dirtyCount, pObject.getAddress1());
            }
    
            if (pObject.isAddress2Initialized()) {
                ps.setString(++_dirtyCount, pObject.getAddress2());
            }
    
            if (pObject.isCityInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCity());
            }
    
            if (pObject.isStateProvInitialized()) {
                ps.setString(++_dirtyCount, pObject.getStateProv());
            }
    
            if (pObject.isPostalCodeInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPostalCode());
            }
    
            if (pObject.isCountryInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCountry());
            }
    
            if (pObject.isUrlInitialized()) {
                ps.setString(++_dirtyCount, pObject.getUrl());
            }
    
            if (pObject.isEmailInitialized()) {
                ps.setString(++_dirtyCount, pObject.getEmail());
            }
    
            if (pObject.isCodedByInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCodedBy());
            }
    
            if (pObject.isCodedByDateInitialized()) {
                if (pObject.getCodedByDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCodedByDate().getTime())); }
            }
    
            if (pObject.isCheckedByInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCheckedBy());
            }
    
            if (pObject.isCheckedByDateInitialized()) {
                ps.setString(++_dirtyCount, pObject.getCheckedByDate());
            }
    
            if (pObject.isPriorityInitialized()) {
                DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPriority());
            }
    
            if (pObject.isPersonalCommunicationInitialized()) {
                ps.setString(++_dirtyCount, pObject.getPersonalCommunication());
            }
    
            if (pObject.isNoteInitialized()) {
                ps.setString(++_dirtyCount, pObject.getNote());
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
    
            if (pObject.isReferenceDateInitialized()) {
                if (pObject.getReferenceDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getReferenceDate().getTime())); }
            }
    
            if (pObject.isAbstractTextInitialized()) {
                ps.setString(++_dirtyCount, pObject.getAbstractText());
            }
    
            int _rows = ps.executeUpdate();
            return _rows;
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }


    /**
     * Retrieves the max value for a specified column of the table Reference.
     *
     * @return the max value
     */
    public Object max(int column) throws SQLException {
        String sql = "select max(" + FIELD_NAMES[column] +") as MMAX from Reference";
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
                    case ID__REFERENCE_KEY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_TITLE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_TITLE2:
                        iReturn = rs.getString(1);
                        break;
                    case ID_AUTHORS:
                        iReturn = rs.getString(1);
                        break;
                    case ID_AUTHORS2:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PRIMARYAUTHOR:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CITATION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_SHORTCITATION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_JOURNAL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_VOLUME:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ISSUE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PAGES:
                        iReturn = rs.getString(1);
                        break;
                    case ID_YEAR:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ISREVIEWARTICLE:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_REVIEWSTATUS:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PERSON:
                        iReturn = rs.getString(1);
                        break;
                    case ID_INSTITUTION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_DEPARTMENT:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ADDRESS1:
                        iReturn = rs.getString(1);
                        break;
                    case ID_ADDRESS2:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CITY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_STATEPROV:
                        iReturn = rs.getString(1);
                        break;
                    case ID_POSTALCODE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_COUNTRY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_URL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_EMAIL:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CODEDBY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CODEDBY_DATE:
                        iReturn = rs.getTimestamp(1);
                        break;
                    case ID_CHECKEDBY:
                        iReturn = rs.getString(1);
                        break;
                    case ID_CHECKEDBY_DATE:
                        iReturn = rs.getString(1);
                        break;
                    case ID_PRIORITY:
                        iReturn = DAOManagerMTB.getLong(rs, 1);
                        break;
                    case ID_PERSONALCOMMUNICATION:
                        iReturn = rs.getString(1);
                        break;
                    case ID_NOTE:
                        iReturn = rs.getString(1);
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
                    case ID_REFERENCE_DATE:
                        iReturn = rs.getTimestamp(1);
                        break;
                    case ID_ABSTRACTTEXT:
                        iReturn = rs.getString(1);
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
     * Retrieves the min value for a specified column of the table Reference.
     *
     * @return the min value
     */
    public Object min(int column) throws SQLException {
        String sql = "select min(" + FIELD_NAMES[column] +") as MMIN from Reference";
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
                    case ID__REFERENCE_KEY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_TITLE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_TITLE2:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_AUTHORS:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_AUTHORS2:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PRIMARYAUTHOR:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CITATION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_SHORTCITATION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_JOURNAL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_VOLUME:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ISSUE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PAGES:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_YEAR:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ISREVIEWARTICLE:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_REVIEWSTATUS:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PERSON:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_INSTITUTION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_DEPARTMENT:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ADDRESS1:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_ADDRESS2:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CITY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_STATEPROV:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_POSTALCODE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_COUNTRY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_URL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_EMAIL:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CODEDBY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CODEDBY_DATE:
                        iReturn = (java.util.Date)rs.getObject(1);
                        break;
                    case ID_CHECKEDBY:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_CHECKEDBY_DATE:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_PRIORITY:
                        iReturn = (Long)rs.getObject(1);
                        break;
                    case ID_PERSONALCOMMUNICATION:
                        iReturn = (String)rs.getObject(1);
                        break;
                    case ID_NOTE:
                        iReturn = (String)rs.getObject(1);
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
                    case ID_REFERENCE_DATE:
                        iReturn = (java.util.Date)rs.getObject(1);
                        break;
                    case ID_ABSTRACTTEXT:
                        iReturn = (String)rs.getObject(1);
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
     * Retrieves the number of rows of the table Reference.
     *
     * @return the number of rows returned
     */
    public int countAll() throws SQLException {
        return countWhere("");
    }



    /**
     * Retrieves the number of rows of the table Reference with a 'where' clause.
     * It is up to you to pass the 'WHERE' in your where clausis.
     *
     * @param where the restriction clause
     * @return the number of rows returned
     */
    public int countWhere(String where) throws SQLException {
        String sql = "select count(*) as MCOUNT from Reference " + where;
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
     * Retrieves the number of rows of the table Reference with a prepared statement.
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
     * Looks for the number of elements of a specific ReferenceDTO pObject given a c
     *
     * @param pObject the ReferenceDTO pObject to look for
     * @return the number of rows returned
     */
    public int countUsingTemplate(ReferenceDTO pObject) throws SQLException  {
        Connection c = null;
        PreparedStatement ps = null;
        StringBuffer _sql = null;
        StringBuffer _sqlWhere = null;
    
        try {
                _sql = new StringBuffer("SELECT count(*) as MCOUNT  from Reference WHERE ");
                _sqlWhere = new StringBuffer("");
                int _dirtyCount = 0;
    
                if (pObject.isReferenceKeyModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("_Reference_key= ?");
                }
    
                if (pObject.isTitleModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title= ?");
                }
    
                if (pObject.isTitle2Modified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("title2= ?");
                }
    
                if (pObject.isAuthorsModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("authors= ?");
                }
    
                if (pObject.isAuthors2Modified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("authors2= ?");
                }
    
                if (pObject.isPrimaryAuthorModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("primaryAuthor= ?");
                }
    
                if (pObject.isCitationModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("citation= ?");
                }
    
                if (pObject.isShortCitationModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("shortCitation= ?");
                }
    
                if (pObject.isJournalModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("journal= ?");
                }
    
                if (pObject.isVolumeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("volume= ?");
                }
    
                if (pObject.isIssueModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("issue= ?");
                }
    
                if (pObject.isPagesModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("pages= ?");
                }
    
                if (pObject.isYearModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("year= ?");
                }
    
                if (pObject.isIsReviewArticleModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("isReviewArticle= ?");
                }
    
                if (pObject.isReviewStatusModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reviewStatus= ?");
                }
    
                if (pObject.isPersonModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("person= ?");
                }
    
                if (pObject.isInstitutionModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("institution= ?");
                }
    
                if (pObject.isDepartmentModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("department= ?");
                }
    
                if (pObject.isAddress1Modified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("address1= ?");
                }
    
                if (pObject.isAddress2Modified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("address2= ?");
                }
    
                if (pObject.isCityModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("city= ?");
                }
    
                if (pObject.isStateProvModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("stateProv= ?");
                }
    
                if (pObject.isPostalCodeModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("postalCode= ?");
                }
    
                if (pObject.isCountryModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("country= ?");
                }
    
                if (pObject.isUrlModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("url= ?");
                }
    
                if (pObject.isEmailModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("email= ?");
                }
    
                if (pObject.isCodedByModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("codedBy= ?");
                }
    
                if (pObject.isCodedByDateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("codedBy_date= ?");
                }
    
                if (pObject.isCheckedByModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("checkedBy= ?");
                }
    
                if (pObject.isCheckedByDateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("checkedBy_date= ?");
                }
    
                if (pObject.isPriorityModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("priority= ?");
                }
    
                if (pObject.isPersonalCommunicationModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("personalCommunication= ?");
                }
    
                if (pObject.isNoteModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("note= ?");
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
    
                if (pObject.isReferenceDateModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("reference_date= ?");
                }
    
                if (pObject.isAbstractTextModified()) {
                    _dirtyCount++; 
                    _sqlWhere.append((_sqlWhere.length() == 0) ? " " : " AND ").append("abstractText= ?");
                }
    
                if (_dirtyCount == 0) {
                   throw new SQLException ("The pObject to look is unvalid : not initialized !");
                }
    
                _sql.append(_sqlWhere);
                c = getConnection();
                ps = c.prepareStatement(_sql.toString(),ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    
                _dirtyCount = 0;
    
                if (pObject.isReferenceKeyModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getReferenceKey());
                }
    
                if (pObject.isTitleModified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle());
                }
    
                if (pObject.isTitle2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getTitle2());
                }
    
                if (pObject.isAuthorsModified()) {
                    ps.setString(++_dirtyCount, pObject.getAuthors());
                }
    
                if (pObject.isAuthors2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAuthors2());
                }
    
                if (pObject.isPrimaryAuthorModified()) {
                    ps.setString(++_dirtyCount, pObject.getPrimaryAuthor());
                }
    
                if (pObject.isCitationModified()) {
                    ps.setString(++_dirtyCount, pObject.getCitation());
                }
    
                if (pObject.isShortCitationModified()) {
                    ps.setString(++_dirtyCount, pObject.getShortCitation());
                }
    
                if (pObject.isJournalModified()) {
                    ps.setString(++_dirtyCount, pObject.getJournal());
                }
    
                if (pObject.isVolumeModified()) {
                    ps.setString(++_dirtyCount, pObject.getVolume());
                }
    
                if (pObject.isIssueModified()) {
                    ps.setString(++_dirtyCount, pObject.getIssue());
                }
    
                if (pObject.isPagesModified()) {
                    ps.setString(++_dirtyCount, pObject.getPages());
                }
    
                if (pObject.isYearModified()) {
                    ps.setString(++_dirtyCount, pObject.getYear());
                }
    
                if (pObject.isIsReviewArticleModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getIsReviewArticle());
                }
    
                if (pObject.isReviewStatusModified()) {
                    ps.setString(++_dirtyCount, pObject.getReviewStatus());
                }
    
                if (pObject.isPersonModified()) {
                    ps.setString(++_dirtyCount, pObject.getPerson());
                }
    
                if (pObject.isInstitutionModified()) {
                    ps.setString(++_dirtyCount, pObject.getInstitution());
                }
    
                if (pObject.isDepartmentModified()) {
                    ps.setString(++_dirtyCount, pObject.getDepartment());
                }
    
                if (pObject.isAddress1Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAddress1());
                }
    
                if (pObject.isAddress2Modified()) {
                    ps.setString(++_dirtyCount, pObject.getAddress2());
                }
    
                if (pObject.isCityModified()) {
                    ps.setString(++_dirtyCount, pObject.getCity());
                }
    
                if (pObject.isStateProvModified()) {
                    ps.setString(++_dirtyCount, pObject.getStateProv());
                }
    
                if (pObject.isPostalCodeModified()) {
                    ps.setString(++_dirtyCount, pObject.getPostalCode());
                }
    
                if (pObject.isCountryModified()) {
                    ps.setString(++_dirtyCount, pObject.getCountry());
                }
    
                if (pObject.isUrlModified()) {
                    ps.setString(++_dirtyCount, pObject.getUrl());
                }
    
                if (pObject.isEmailModified()) {
                    ps.setString(++_dirtyCount, pObject.getEmail());
                }
    
                if (pObject.isCodedByModified()) {
                    ps.setString(++_dirtyCount, pObject.getCodedBy());
                }
    
                if (pObject.isCodedByDateModified()) {
                    if (pObject.getCodedByDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getCodedByDate().getTime())); }
                }
    
                if (pObject.isCheckedByModified()) {
                    ps.setString(++_dirtyCount, pObject.getCheckedBy());
                }
    
                if (pObject.isCheckedByDateModified()) {
                    ps.setString(++_dirtyCount, pObject.getCheckedByDate());
                }
    
                if (pObject.isPriorityModified()) {
                    DAOManagerMTB.setLong(ps, ++_dirtyCount, pObject.getPriority());
                }
    
                if (pObject.isPersonalCommunicationModified()) {
                    ps.setString(++_dirtyCount, pObject.getPersonalCommunication());
                }
    
                if (pObject.isNoteModified()) {
                    ps.setString(++_dirtyCount, pObject.getNote());
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
    
                if (pObject.isReferenceDateModified()) {
                    if (pObject.getReferenceDate() == null) { ps.setNull(++_dirtyCount, Types.TIMESTAMP); } else { ps.setTimestamp(++_dirtyCount, new java.sql.Timestamp(pObject.getReferenceDate().getTime())); }
                }
    
                if (pObject.isAbstractTextModified()) {
                    ps.setString(++_dirtyCount, pObject.getAbstractText());
                }
    
                return countByPreparedStatement(ps);
        } finally {
            getManager().close(ps);
            freeConnection(c);
        }
    }

    /**
     * Transforms a ResultSet iterating on the Reference on a ReferenceDTO pObject.
     *
     * @param rs the ResultSet to be transformed
     * @return pObject resulting ReferenceDTO pObject
     */
    public ReferenceDTO decodeRow(ResultSet rs) throws SQLException {
        ReferenceDTO pObject = createReferenceDTO();
        pObject.setReferenceKey(DAOManagerMTB.getLong(rs, 1));
        pObject.setTitle(rs.getString(2));
        pObject.setTitle2(rs.getString(3));
        pObject.setAuthors(rs.getString(4));
        pObject.setAuthors2(rs.getString(5));
        pObject.setPrimaryAuthor(rs.getString(6));
        pObject.setCitation(rs.getString(7));
        pObject.setShortCitation(rs.getString(8));
        pObject.setJournal(rs.getString(9));
        pObject.setVolume(rs.getString(10));
        pObject.setIssue(rs.getString(11));
        pObject.setPages(rs.getString(12));
        pObject.setYear(rs.getString(13));
        pObject.setIsReviewArticle(DAOManagerMTB.getLong(rs, 14));
        pObject.setReviewStatus(rs.getString(15));
        pObject.setPerson(rs.getString(16));
        pObject.setInstitution(rs.getString(17));
        pObject.setDepartment(rs.getString(18));
        pObject.setAddress1(rs.getString(19));
        pObject.setAddress2(rs.getString(20));
        pObject.setCity(rs.getString(21));
        pObject.setStateProv(rs.getString(22));
        pObject.setPostalCode(rs.getString(23));
        pObject.setCountry(rs.getString(24));
        pObject.setUrl(rs.getString(25));
        pObject.setEmail(rs.getString(26));
        pObject.setCodedBy(rs.getString(27));
        pObject.setCodedByDate(rs.getTimestamp(28));
        pObject.setCheckedBy(rs.getString(29));
        pObject.setCheckedByDate(rs.getString(30));
        pObject.setPriority(DAOManagerMTB.getLong(rs, 31));
        pObject.setPersonalCommunication(rs.getString(32));
        pObject.setNote(rs.getString(33));
        pObject.setMTBDataStatusKey(DAOManagerMTB.getLong(rs, 34));
        pObject.setCreateUser(rs.getString(35));
        pObject.setCreateDate(rs.getTimestamp(36));
        pObject.setUpdateUser(rs.getString(37));
        pObject.setUpdateDate(rs.getTimestamp(38));
        pObject.setReferenceDate(rs.getTimestamp(39));
        pObject.setAbstractText(rs.getString(40));
        pObject.isNew(false);
        pObject.resetIsModified();
        return pObject;
    }

    /**
     * Transforms a ResultSet iterating on the Reference table on a ReferenceDTO pObject according to a list of fields.
     *
     * @param rs the ResultSet to be transformed
     * @param fieldList table of the field's associated constants
     * @return pObject resulting ReferenceDTO pObject
     */
    public ReferenceDTO decodeRow(ResultSet rs, int[] fieldList) throws SQLException {
        ReferenceDTO pObject = createReferenceDTO();
        int pos = 0;
        for(int i = 0; i < fieldList.length; i++) {
            switch(fieldList[i]) {
                case ID__REFERENCE_KEY:
                    ++pos;
                    pObject.setReferenceKey(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_TITLE:
                    ++pos;
                    pObject.setTitle(rs.getString(pos));
                    break;
                case ID_TITLE2:
                    ++pos;
                    pObject.setTitle2(rs.getString(pos));
                    break;
                case ID_AUTHORS:
                    ++pos;
                    pObject.setAuthors(rs.getString(pos));
                    break;
                case ID_AUTHORS2:
                    ++pos;
                    pObject.setAuthors2(rs.getString(pos));
                    break;
                case ID_PRIMARYAUTHOR:
                    ++pos;
                    pObject.setPrimaryAuthor(rs.getString(pos));
                    break;
                case ID_CITATION:
                    ++pos;
                    pObject.setCitation(rs.getString(pos));
                    break;
                case ID_SHORTCITATION:
                    ++pos;
                    pObject.setShortCitation(rs.getString(pos));
                    break;
                case ID_JOURNAL:
                    ++pos;
                    pObject.setJournal(rs.getString(pos));
                    break;
                case ID_VOLUME:
                    ++pos;
                    pObject.setVolume(rs.getString(pos));
                    break;
                case ID_ISSUE:
                    ++pos;
                    pObject.setIssue(rs.getString(pos));
                    break;
                case ID_PAGES:
                    ++pos;
                    pObject.setPages(rs.getString(pos));
                    break;
                case ID_YEAR:
                    ++pos;
                    pObject.setYear(rs.getString(pos));
                    break;
                case ID_ISREVIEWARTICLE:
                    ++pos;
                    pObject.setIsReviewArticle(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_REVIEWSTATUS:
                    ++pos;
                    pObject.setReviewStatus(rs.getString(pos));
                    break;
                case ID_PERSON:
                    ++pos;
                    pObject.setPerson(rs.getString(pos));
                    break;
                case ID_INSTITUTION:
                    ++pos;
                    pObject.setInstitution(rs.getString(pos));
                    break;
                case ID_DEPARTMENT:
                    ++pos;
                    pObject.setDepartment(rs.getString(pos));
                    break;
                case ID_ADDRESS1:
                    ++pos;
                    pObject.setAddress1(rs.getString(pos));
                    break;
                case ID_ADDRESS2:
                    ++pos;
                    pObject.setAddress2(rs.getString(pos));
                    break;
                case ID_CITY:
                    ++pos;
                    pObject.setCity(rs.getString(pos));
                    break;
                case ID_STATEPROV:
                    ++pos;
                    pObject.setStateProv(rs.getString(pos));
                    break;
                case ID_POSTALCODE:
                    ++pos;
                    pObject.setPostalCode(rs.getString(pos));
                    break;
                case ID_COUNTRY:
                    ++pos;
                    pObject.setCountry(rs.getString(pos));
                    break;
                case ID_URL:
                    ++pos;
                    pObject.setUrl(rs.getString(pos));
                    break;
                case ID_EMAIL:
                    ++pos;
                    pObject.setEmail(rs.getString(pos));
                    break;
                case ID_CODEDBY:
                    ++pos;
                    pObject.setCodedBy(rs.getString(pos));
                    break;
                case ID_CODEDBY_DATE:
                    ++pos;
                    pObject.setCodedByDate(rs.getTimestamp(pos));
                    break;
                case ID_CHECKEDBY:
                    ++pos;
                    pObject.setCheckedBy(rs.getString(pos));
                    break;
                case ID_CHECKEDBY_DATE:
                    ++pos;
                    pObject.setCheckedByDate(rs.getString(pos));
                    break;
                case ID_PRIORITY:
                    ++pos;
                    pObject.setPriority(DAOManagerMTB.getLong(rs, pos));
                    break;
                case ID_PERSONALCOMMUNICATION:
                    ++pos;
                    pObject.setPersonalCommunication(rs.getString(pos));
                    break;
                case ID_NOTE:
                    ++pos;
                    pObject.setNote(rs.getString(pos));
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
                case ID_REFERENCE_DATE:
                    ++pos;
                    pObject.setReferenceDate(rs.getTimestamp(pos));
                    break;
                case ID_ABSTRACTTEXT:
                    ++pos;
                    pObject.setAbstractText(rs.getString(pos));
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
     * @return a List of ReferenceDTO objects
     */
    public List<ReferenceDTO> loadByPreparedStatement(PreparedStatement ps) throws SQLException {
        return loadByPreparedStatement(ps, null);
    }

    /**
     * Loads all the elements using a prepared statement specifying a list of fields to be retrieved.
     *
     * @param ps the PreparedStatement to be used
     * @param fieldList table of the field's associated constants
     * @return a List of ReferenceDTO objects
     */
    public List<ReferenceDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList) throws SQLException {
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
     * @return a List of ReferenceDTO objects
     */
    public List<ReferenceDTO> loadByPreparedStatement(PreparedStatement ps, int[] fieldList, int startRow, int numRows) throws SQLException {
        ResultSet rs =  null;
        List<ReferenceDTO> v = new ArrayList<ReferenceDTO>();
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
