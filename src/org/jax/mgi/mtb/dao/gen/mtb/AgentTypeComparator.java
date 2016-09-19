
package org.jax.mgi.mtb.dao.gen.mtb;

import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the AgentTypeDTO objects.
 */
public class AgentTypeComparator
       implements Comparator<AgentTypeDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for AgentTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AgentTypeComparator(AgentTypeDAO._AGENTTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AgentTypeDAO.ID__AGENTTYPE_KEY
     *   <li>AgentTypeDAO.ID_NAME
     *   <li>AgentTypeDAO.ID_DESCRIPTION
     *   <li>AgentTypeDAO.ID_CREATE_USER
     *   <li>AgentTypeDAO.ID_CREATE_DATE
     *   <li>AgentTypeDAO.ID_UPDATE_USER
     *   <li>AgentTypeDAO.ID_UPDATE_DATE
     * </ul>
     */
    public AgentTypeComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for AgentTypeComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new AgentTypeComparator(AgentTypeDAO._AGENTTYPE_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>AgentTypeDAO.ID__AGENTTYPE_KEY
     *   <li>AgentTypeDAO.ID_NAME
     *   <li>AgentTypeDAO.ID_DESCRIPTION
     *   <li>AgentTypeDAO.ID_CREATE_USER
     *   <li>AgentTypeDAO.ID_CREATE_DATE
     *   <li>AgentTypeDAO.ID_UPDATE_USER
     *   <li>AgentTypeDAO.ID_UPDATE_DATE
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public AgentTypeComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(AgentTypeDTO dto1, AgentTypeDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case AgentTypeDAO.ID__AGENTTYPE_KEY:
                if (dto1.getAgentTypeKey() == null && dto2.getAgentTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAgentTypeKey() == null && dto2.getAgentTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAgentTypeKey() != null && dto2.getAgentTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAgentTypeKey().compareTo(dto2.getAgentTypeKey());
                }
                break;
            case AgentTypeDAO.ID_NAME:
                if (dto1.getName() == null && dto2.getName() != null) {
                    nReturn = -1;
                } else if (dto1.getName() == null && dto2.getName() == null) {
                    nReturn = 0;
                } else if (dto1.getName() != null && dto2.getName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getName().compareTo(dto2.getName());
                }
                break;
            case AgentTypeDAO.ID_DESCRIPTION:
                if (dto1.getDescription() == null && dto2.getDescription() != null) {
                    nReturn = -1;
                } else if (dto1.getDescription() == null && dto2.getDescription() == null) {
                    nReturn = 0;
                } else if (dto1.getDescription() != null && dto2.getDescription() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getDescription().compareTo(dto2.getDescription());
                }
                break;
            case AgentTypeDAO.ID_CREATE_USER:
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
            case AgentTypeDAO.ID_CREATE_DATE:
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
            case AgentTypeDAO.ID_UPDATE_USER:
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
            case AgentTypeDAO.ID_UPDATE_DATE:
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
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }
// class+ 

// class- 

}
