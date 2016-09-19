
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the ReferenceDTO objects.
 */
public class ReferenceComparator
       implements Comparator<ReferenceDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for ReferenceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ReferenceComparator(ReferenceDAO._REFERENCE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ReferenceDAO.ID__REFERENCE_KEY
     *   <li>ReferenceDAO.ID_TITLE
     *   <li>ReferenceDAO.ID_TITLE2
     *   <li>ReferenceDAO.ID_AUTHORS
     *   <li>ReferenceDAO.ID_AUTHORS2
     *   <li>ReferenceDAO.ID_PRIMARYAUTHOR
     *   <li>ReferenceDAO.ID_CITATION
     *   <li>ReferenceDAO.ID_SHORTCITATION
     *   <li>ReferenceDAO.ID_JOURNAL
     *   <li>ReferenceDAO.ID_VOLUME
     *   <li>ReferenceDAO.ID_ISSUE
     *   <li>ReferenceDAO.ID_PAGES
     *   <li>ReferenceDAO.ID_YEAR
     *   <li>ReferenceDAO.ID_ISREVIEWARTICLE
     *   <li>ReferenceDAO.ID_REVIEWSTATUS
     *   <li>ReferenceDAO.ID_PERSON
     *   <li>ReferenceDAO.ID_INSTITUTION
     *   <li>ReferenceDAO.ID_DEPARTMENT
     *   <li>ReferenceDAO.ID_ADDRESS1
     *   <li>ReferenceDAO.ID_ADDRESS2
     *   <li>ReferenceDAO.ID_CITY
     *   <li>ReferenceDAO.ID_STATEPROV
     *   <li>ReferenceDAO.ID_POSTALCODE
     *   <li>ReferenceDAO.ID_COUNTRY
     *   <li>ReferenceDAO.ID_URL
     *   <li>ReferenceDAO.ID_EMAIL
     *   <li>ReferenceDAO.ID_CODEDBY
     *   <li>ReferenceDAO.ID_CODEDBY_DATE
     *   <li>ReferenceDAO.ID_CHECKEDBY
     *   <li>ReferenceDAO.ID_CHECKEDBY_DATE
     *   <li>ReferenceDAO.ID_PRIORITY
     *   <li>ReferenceDAO.ID_PERSONALCOMMUNICATION
     *   <li>ReferenceDAO.ID_NOTE
     *   <li>ReferenceDAO.ID__MTBDATASTATUS_KEY
     *   <li>ReferenceDAO.ID_CREATE_USER
     *   <li>ReferenceDAO.ID_CREATE_DATE
     *   <li>ReferenceDAO.ID_UPDATE_USER
     *   <li>ReferenceDAO.ID_UPDATE_DATE
     *   <li>ReferenceDAO.ID_REFERENCE_DATE
     *   <li>ReferenceDAO.ID_ABSTRACTTEXT
     * </ul>
     */
    public ReferenceComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for ReferenceComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new ReferenceComparator(ReferenceDAO._REFERENCE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>ReferenceDAO.ID__REFERENCE_KEY
     *   <li>ReferenceDAO.ID_TITLE
     *   <li>ReferenceDAO.ID_TITLE2
     *   <li>ReferenceDAO.ID_AUTHORS
     *   <li>ReferenceDAO.ID_AUTHORS2
     *   <li>ReferenceDAO.ID_PRIMARYAUTHOR
     *   <li>ReferenceDAO.ID_CITATION
     *   <li>ReferenceDAO.ID_SHORTCITATION
     *   <li>ReferenceDAO.ID_JOURNAL
     *   <li>ReferenceDAO.ID_VOLUME
     *   <li>ReferenceDAO.ID_ISSUE
     *   <li>ReferenceDAO.ID_PAGES
     *   <li>ReferenceDAO.ID_YEAR
     *   <li>ReferenceDAO.ID_ISREVIEWARTICLE
     *   <li>ReferenceDAO.ID_REVIEWSTATUS
     *   <li>ReferenceDAO.ID_PERSON
     *   <li>ReferenceDAO.ID_INSTITUTION
     *   <li>ReferenceDAO.ID_DEPARTMENT
     *   <li>ReferenceDAO.ID_ADDRESS1
     *   <li>ReferenceDAO.ID_ADDRESS2
     *   <li>ReferenceDAO.ID_CITY
     *   <li>ReferenceDAO.ID_STATEPROV
     *   <li>ReferenceDAO.ID_POSTALCODE
     *   <li>ReferenceDAO.ID_COUNTRY
     *   <li>ReferenceDAO.ID_URL
     *   <li>ReferenceDAO.ID_EMAIL
     *   <li>ReferenceDAO.ID_CODEDBY
     *   <li>ReferenceDAO.ID_CODEDBY_DATE
     *   <li>ReferenceDAO.ID_CHECKEDBY
     *   <li>ReferenceDAO.ID_CHECKEDBY_DATE
     *   <li>ReferenceDAO.ID_PRIORITY
     *   <li>ReferenceDAO.ID_PERSONALCOMMUNICATION
     *   <li>ReferenceDAO.ID_NOTE
     *   <li>ReferenceDAO.ID__MTBDATASTATUS_KEY
     *   <li>ReferenceDAO.ID_CREATE_USER
     *   <li>ReferenceDAO.ID_CREATE_DATE
     *   <li>ReferenceDAO.ID_UPDATE_USER
     *   <li>ReferenceDAO.ID_UPDATE_DATE
     *   <li>ReferenceDAO.ID_REFERENCE_DATE
     *   <li>ReferenceDAO.ID_ABSTRACTTEXT
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public ReferenceComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(ReferenceDTO dto1, ReferenceDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case ReferenceDAO.ID__REFERENCE_KEY:
                if (dto1.getReferenceKey() == null && dto2.getReferenceKey() != null) {
                    nReturn = -1;
                } else if (dto1.getReferenceKey() == null && dto2.getReferenceKey() == null) {
                    nReturn = 0;
                } else if (dto1.getReferenceKey() != null && dto2.getReferenceKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReferenceKey().compareTo(dto2.getReferenceKey());
                }
                break;
            case ReferenceDAO.ID_TITLE:
                if (dto1.getTitle() == null && dto2.getTitle() != null) {
                    nReturn = -1;
                } else if (dto1.getTitle() == null && dto2.getTitle() == null) {
                    nReturn = 0;
                } else if (dto1.getTitle() != null && dto2.getTitle() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTitle().compareTo(dto2.getTitle());
                }
                break;
            case ReferenceDAO.ID_TITLE2:
                if (dto1.getTitle2() == null && dto2.getTitle2() != null) {
                    nReturn = -1;
                } else if (dto1.getTitle2() == null && dto2.getTitle2() == null) {
                    nReturn = 0;
                } else if (dto1.getTitle2() != null && dto2.getTitle2() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTitle2().compareTo(dto2.getTitle2());
                }
                break;
            case ReferenceDAO.ID_AUTHORS:
                if (dto1.getAuthors() == null && dto2.getAuthors() != null) {
                    nReturn = -1;
                } else if (dto1.getAuthors() == null && dto2.getAuthors() == null) {
                    nReturn = 0;
                } else if (dto1.getAuthors() != null && dto2.getAuthors() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAuthors().compareTo(dto2.getAuthors());
                }
                break;
            case ReferenceDAO.ID_AUTHORS2:
                if (dto1.getAuthors2() == null && dto2.getAuthors2() != null) {
                    nReturn = -1;
                } else if (dto1.getAuthors2() == null && dto2.getAuthors2() == null) {
                    nReturn = 0;
                } else if (dto1.getAuthors2() != null && dto2.getAuthors2() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAuthors2().compareTo(dto2.getAuthors2());
                }
                break;
            case ReferenceDAO.ID_PRIMARYAUTHOR:
                if (dto1.getPrimaryAuthor() == null && dto2.getPrimaryAuthor() != null) {
                    nReturn = -1;
                } else if (dto1.getPrimaryAuthor() == null && dto2.getPrimaryAuthor() == null) {
                    nReturn = 0;
                } else if (dto1.getPrimaryAuthor() != null && dto2.getPrimaryAuthor() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPrimaryAuthor().compareTo(dto2.getPrimaryAuthor());
                }
                break;
            case ReferenceDAO.ID_CITATION:
                if (dto1.getCitation() == null && dto2.getCitation() != null) {
                    nReturn = -1;
                } else if (dto1.getCitation() == null && dto2.getCitation() == null) {
                    nReturn = 0;
                } else if (dto1.getCitation() != null && dto2.getCitation() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCitation().compareTo(dto2.getCitation());
                }
                break;
            case ReferenceDAO.ID_SHORTCITATION:
                if (dto1.getShortCitation() == null && dto2.getShortCitation() != null) {
                    nReturn = -1;
                } else if (dto1.getShortCitation() == null && dto2.getShortCitation() == null) {
                    nReturn = 0;
                } else if (dto1.getShortCitation() != null && dto2.getShortCitation() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getShortCitation().compareTo(dto2.getShortCitation());
                }
                break;
            case ReferenceDAO.ID_JOURNAL:
                if (dto1.getJournal() == null && dto2.getJournal() != null) {
                    nReturn = -1;
                } else if (dto1.getJournal() == null && dto2.getJournal() == null) {
                    nReturn = 0;
                } else if (dto1.getJournal() != null && dto2.getJournal() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getJournal().compareTo(dto2.getJournal());
                }
                break;
            case ReferenceDAO.ID_VOLUME:
                if (dto1.getVolume() == null && dto2.getVolume() != null) {
                    nReturn = -1;
                } else if (dto1.getVolume() == null && dto2.getVolume() == null) {
                    nReturn = 0;
                } else if (dto1.getVolume() != null && dto2.getVolume() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getVolume().compareTo(dto2.getVolume());
                }
                break;
            case ReferenceDAO.ID_ISSUE:
                if (dto1.getIssue() == null && dto2.getIssue() != null) {
                    nReturn = -1;
                } else if (dto1.getIssue() == null && dto2.getIssue() == null) {
                    nReturn = 0;
                } else if (dto1.getIssue() != null && dto2.getIssue() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getIssue().compareTo(dto2.getIssue());
                }
                break;
            case ReferenceDAO.ID_PAGES:
                if (dto1.getPages() == null && dto2.getPages() != null) {
                    nReturn = -1;
                } else if (dto1.getPages() == null && dto2.getPages() == null) {
                    nReturn = 0;
                } else if (dto1.getPages() != null && dto2.getPages() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPages().compareTo(dto2.getPages());
                }
                break;
            case ReferenceDAO.ID_YEAR:
                if (dto1.getYear() == null && dto2.getYear() != null) {
                    nReturn = -1;
                } else if (dto1.getYear() == null && dto2.getYear() == null) {
                    nReturn = 0;
                } else if (dto1.getYear() != null && dto2.getYear() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getYear().compareTo(dto2.getYear());
                }
                break;
            case ReferenceDAO.ID_ISREVIEWARTICLE:
                if (dto1.getIsReviewArticle() == null && dto2.getIsReviewArticle() != null) {
                    nReturn = -1;
                } else if (dto1.getIsReviewArticle() == null && dto2.getIsReviewArticle() == null) {
                    nReturn = 0;
                } else if (dto1.getIsReviewArticle() != null && dto2.getIsReviewArticle() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getIsReviewArticle().compareTo(dto2.getIsReviewArticle());
                }
                break;
            case ReferenceDAO.ID_REVIEWSTATUS:
                if (dto1.getReviewStatus() == null && dto2.getReviewStatus() != null) {
                    nReturn = -1;
                } else if (dto1.getReviewStatus() == null && dto2.getReviewStatus() == null) {
                    nReturn = 0;
                } else if (dto1.getReviewStatus() != null && dto2.getReviewStatus() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReviewStatus().compareTo(dto2.getReviewStatus());
                }
                break;
            case ReferenceDAO.ID_PERSON:
                if (dto1.getPerson() == null && dto2.getPerson() != null) {
                    nReturn = -1;
                } else if (dto1.getPerson() == null && dto2.getPerson() == null) {
                    nReturn = 0;
                } else if (dto1.getPerson() != null && dto2.getPerson() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPerson().compareTo(dto2.getPerson());
                }
                break;
            case ReferenceDAO.ID_INSTITUTION:
                if (dto1.getInstitution() == null && dto2.getInstitution() != null) {
                    nReturn = -1;
                } else if (dto1.getInstitution() == null && dto2.getInstitution() == null) {
                    nReturn = 0;
                } else if (dto1.getInstitution() != null && dto2.getInstitution() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getInstitution().compareTo(dto2.getInstitution());
                }
                break;
            case ReferenceDAO.ID_DEPARTMENT:
                if (dto1.getDepartment() == null && dto2.getDepartment() != null) {
                    nReturn = -1;
                } else if (dto1.getDepartment() == null && dto2.getDepartment() == null) {
                    nReturn = 0;
                } else if (dto1.getDepartment() != null && dto2.getDepartment() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getDepartment().compareTo(dto2.getDepartment());
                }
                break;
            case ReferenceDAO.ID_ADDRESS1:
                if (dto1.getAddress1() == null && dto2.getAddress1() != null) {
                    nReturn = -1;
                } else if (dto1.getAddress1() == null && dto2.getAddress1() == null) {
                    nReturn = 0;
                } else if (dto1.getAddress1() != null && dto2.getAddress1() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAddress1().compareTo(dto2.getAddress1());
                }
                break;
            case ReferenceDAO.ID_ADDRESS2:
                if (dto1.getAddress2() == null && dto2.getAddress2() != null) {
                    nReturn = -1;
                } else if (dto1.getAddress2() == null && dto2.getAddress2() == null) {
                    nReturn = 0;
                } else if (dto1.getAddress2() != null && dto2.getAddress2() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAddress2().compareTo(dto2.getAddress2());
                }
                break;
            case ReferenceDAO.ID_CITY:
                if (dto1.getCity() == null && dto2.getCity() != null) {
                    nReturn = -1;
                } else if (dto1.getCity() == null && dto2.getCity() == null) {
                    nReturn = 0;
                } else if (dto1.getCity() != null && dto2.getCity() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCity().compareTo(dto2.getCity());
                }
                break;
            case ReferenceDAO.ID_STATEPROV:
                if (dto1.getStateProv() == null && dto2.getStateProv() != null) {
                    nReturn = -1;
                } else if (dto1.getStateProv() == null && dto2.getStateProv() == null) {
                    nReturn = 0;
                } else if (dto1.getStateProv() != null && dto2.getStateProv() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getStateProv().compareTo(dto2.getStateProv());
                }
                break;
            case ReferenceDAO.ID_POSTALCODE:
                if (dto1.getPostalCode() == null && dto2.getPostalCode() != null) {
                    nReturn = -1;
                } else if (dto1.getPostalCode() == null && dto2.getPostalCode() == null) {
                    nReturn = 0;
                } else if (dto1.getPostalCode() != null && dto2.getPostalCode() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPostalCode().compareTo(dto2.getPostalCode());
                }
                break;
            case ReferenceDAO.ID_COUNTRY:
                if (dto1.getCountry() == null && dto2.getCountry() != null) {
                    nReturn = -1;
                } else if (dto1.getCountry() == null && dto2.getCountry() == null) {
                    nReturn = 0;
                } else if (dto1.getCountry() != null && dto2.getCountry() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCountry().compareTo(dto2.getCountry());
                }
                break;
            case ReferenceDAO.ID_URL:
                if (dto1.getUrl() == null && dto2.getUrl() != null) {
                    nReturn = -1;
                } else if (dto1.getUrl() == null && dto2.getUrl() == null) {
                    nReturn = 0;
                } else if (dto1.getUrl() != null && dto2.getUrl() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUrl().compareTo(dto2.getUrl());
                }
                break;
            case ReferenceDAO.ID_EMAIL:
                if (dto1.getEmail() == null && dto2.getEmail() != null) {
                    nReturn = -1;
                } else if (dto1.getEmail() == null && dto2.getEmail() == null) {
                    nReturn = 0;
                } else if (dto1.getEmail() != null && dto2.getEmail() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getEmail().compareTo(dto2.getEmail());
                }
                break;
            case ReferenceDAO.ID_CODEDBY:
                if (dto1.getCodedBy() == null && dto2.getCodedBy() != null) {
                    nReturn = -1;
                } else if (dto1.getCodedBy() == null && dto2.getCodedBy() == null) {
                    nReturn = 0;
                } else if (dto1.getCodedBy() != null && dto2.getCodedBy() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCodedBy().compareTo(dto2.getCodedBy());
                }
                break;
            case ReferenceDAO.ID_CODEDBY_DATE:
                if (dto1.getCodedByDate() == null && dto2.getCodedByDate() != null) {
                    nReturn = -1;
                } else if (dto1.getCodedByDate() == null && dto2.getCodedByDate() == null) {
                    nReturn = 0;
                } else if (dto1.getCodedByDate() != null && dto2.getCodedByDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCodedByDate().compareTo(dto2.getCodedByDate());
                }
                break;
            case ReferenceDAO.ID_CHECKEDBY:
                if (dto1.getCheckedBy() == null && dto2.getCheckedBy() != null) {
                    nReturn = -1;
                } else if (dto1.getCheckedBy() == null && dto2.getCheckedBy() == null) {
                    nReturn = 0;
                } else if (dto1.getCheckedBy() != null && dto2.getCheckedBy() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCheckedBy().compareTo(dto2.getCheckedBy());
                }
                break;
            case ReferenceDAO.ID_CHECKEDBY_DATE:
                if (dto1.getCheckedByDate() == null && dto2.getCheckedByDate() != null) {
                    nReturn = -1;
                } else if (dto1.getCheckedByDate() == null && dto2.getCheckedByDate() == null) {
                    nReturn = 0;
                } else if (dto1.getCheckedByDate() != null && dto2.getCheckedByDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCheckedByDate().compareTo(dto2.getCheckedByDate());
                }
                break;
            case ReferenceDAO.ID_PRIORITY:
                if (dto1.getPriority() == null && dto2.getPriority() != null) {
                    nReturn = -1;
                } else if (dto1.getPriority() == null && dto2.getPriority() == null) {
                    nReturn = 0;
                } else if (dto1.getPriority() != null && dto2.getPriority() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPriority().compareTo(dto2.getPriority());
                }
                break;
            case ReferenceDAO.ID_PERSONALCOMMUNICATION:
                if (dto1.getPersonalCommunication() == null && dto2.getPersonalCommunication() != null) {
                    nReturn = -1;
                } else if (dto1.getPersonalCommunication() == null && dto2.getPersonalCommunication() == null) {
                    nReturn = 0;
                } else if (dto1.getPersonalCommunication() != null && dto2.getPersonalCommunication() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getPersonalCommunication().compareTo(dto2.getPersonalCommunication());
                }
                break;
            case ReferenceDAO.ID_NOTE:
                if (dto1.getNote() == null && dto2.getNote() != null) {
                    nReturn = -1;
                } else if (dto1.getNote() == null && dto2.getNote() == null) {
                    nReturn = 0;
                } else if (dto1.getNote() != null && dto2.getNote() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNote().compareTo(dto2.getNote());
                }
                break;
            case ReferenceDAO.ID__MTBDATASTATUS_KEY:
                if (dto1.getMTBDataStatusKey() == null && dto2.getMTBDataStatusKey() != null) {
                    nReturn = -1;
                } else if (dto1.getMTBDataStatusKey() == null && dto2.getMTBDataStatusKey() == null) {
                    nReturn = 0;
                } else if (dto1.getMTBDataStatusKey() != null && dto2.getMTBDataStatusKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getMTBDataStatusKey().compareTo(dto2.getMTBDataStatusKey());
                }
                break;
            case ReferenceDAO.ID_CREATE_USER:
                if (dto1.getCreateUser() == null && dto2.getCreateUser() != null) {
                    nReturn = -1;
                } else if (dto1.getCreateUser() == null && dto2.getCreateUser() == null) {
                    nReturn = 0;
                } else if (dto1.getCreateUser() != null && dto2.getCreateUser() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCreateUser().compareTo(dto2.getCreateUser());
                }
                break;
            case ReferenceDAO.ID_CREATE_DATE:
                if (dto1.getCreateDate() == null && dto2.getCreateDate() != null) {
                    nReturn = -1;
                } else if (dto1.getCreateDate() == null && dto2.getCreateDate() == null) {
                    nReturn = 0;
                } else if (dto1.getCreateDate() != null && dto2.getCreateDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getCreateDate().compareTo(dto2.getCreateDate());
                }
                break;
            case ReferenceDAO.ID_UPDATE_USER:
                if (dto1.getUpdateUser() == null && dto2.getUpdateUser() != null) {
                    nReturn = -1;
                } else if (dto1.getUpdateUser() == null && dto2.getUpdateUser() == null) {
                    nReturn = 0;
                } else if (dto1.getUpdateUser() != null && dto2.getUpdateUser() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUpdateUser().compareTo(dto2.getUpdateUser());
                }
                break;
            case ReferenceDAO.ID_UPDATE_DATE:
                if (dto1.getUpdateDate() == null && dto2.getUpdateDate() != null) {
                    nReturn = -1;
                } else if (dto1.getUpdateDate() == null && dto2.getUpdateDate() == null) {
                    nReturn = 0;
                } else if (dto1.getUpdateDate() != null && dto2.getUpdateDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getUpdateDate().compareTo(dto2.getUpdateDate());
                }
                break;
            case ReferenceDAO.ID_REFERENCE_DATE:
                if (dto1.getReferenceDate() == null && dto2.getReferenceDate() != null) {
                    nReturn = -1;
                } else if (dto1.getReferenceDate() == null && dto2.getReferenceDate() == null) {
                    nReturn = 0;
                } else if (dto1.getReferenceDate() != null && dto2.getReferenceDate() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getReferenceDate().compareTo(dto2.getReferenceDate());
                }
                break;
            case ReferenceDAO.ID_ABSTRACTTEXT:
                if (dto1.getAbstractText() == null && dto2.getAbstractText() != null) {
                    nReturn = -1;
                } else if (dto1.getAbstractText() == null && dto2.getAbstractText() == null) {
                    nReturn = 0;
                } else if (dto1.getAbstractText() != null && dto2.getAbstractText() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAbstractText().compareTo(dto2.getAbstractText());
                }
                break;
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }
// class+ 

// class- 

}
