
package org.jax.mgi.mtb.dao.custom.mtb;


import java.util.Comparator;
// imports+ 

// imports- 


/**
 * Comparator class is used to sort the MTBTumorGeneticChangesDTO objects.
 * Customized to sort based on DisplayChromosome or AlleleTypeName strings
 */
public class MTBTumorGeneticChangesComparator
       implements Comparator<MTBTumorGeneticChangesDTO> {
    /**
     * Holds the field on which the comparison is performed.
     */
    private int nColumn;
    /**
     * Value that will contain the information about the order of the sort: normal or reversal.
     */
    private boolean bReverse;

    /**
     * Constructor class for MTBTumorGeneticChangesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBTumorGeneticChangesComparator(MTBTumorGeneticChangesDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBTumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID_NAME
     *   <li>MTBTumorGeneticChangesDAO.ID_NOTES
     *   <li>MTBTumorGeneticChangesDAO.ID_CREATE_USER
     *   <li>MTBTumorGeneticChangesDAO.ID_CREATE_DATE
     *   <li>MTBTumorGeneticChangesDAO.ID_UPDATE_USER
     *   <li>MTBTumorGeneticChangesDAO.ID_UPDATE_DATE
     *   <li>MTBTumorGeneticChangesDAO.ID__ALLELETYPE_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID_DISPLAY_CHROMOSOME
     *   <li>MTBTumorGeneticChangesDAO.ID_ALLELE_TYPE_NAME
     * </ul>
     */
    public MTBTumorGeneticChangesComparator(int nColumn) {
        this(nColumn, false);
    }

    /**
     * Constructor class for MTBTumorGeneticChangesComparator.
     * <br>
     * Example:
     * <br>
     * <code>Arrays.sort(pArray, new MTBTumorGeneticChangesComparator(MTBTumorGeneticChangesDAO._TUMORGENETICCHANGES_KEY, bReverse));<code>
     *
     * @param nColumn the field from which you want to sort.
     * <br>
     * Possible values are:
     * <ul>
     *   <li>MTBTumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID_NAME
     *   <li>MTBTumorGeneticChangesDAO.ID_NOTES
     *   <li>MTBTumorGeneticChangesDAO.ID_CREATE_USER
     *   <li>MTBTumorGeneticChangesDAO.ID_CREATE_DATE
     *   <li>MTBTumorGeneticChangesDAO.ID_UPDATE_USER
     *   <li>MTBTumorGeneticChangesDAO.ID_UPDATE_DATE
     *   <li>MTBTumorGeneticChangesDAO.ID__ALLELETYPE_KEY
     *   <li>MTBTumorGeneticChangesDAO.ID_DISPLAY_CHROMOSOME
     *   <li>MTBTumorGeneticChangesDAO.ID_ALLELE_TYPE_NAME
     * </ul>
     *
     * @param bReverse set this value to true, if you want to reverse the sorting results
     */
    public MTBTumorGeneticChangesComparator(int nColumn, boolean bReverse) {
        this.nColumn = nColumn;
        this.bReverse = bReverse;
    }

    /**
     * Implementation of the compare method.
     */
    public int compare(MTBTumorGeneticChangesDTO dto1, MTBTumorGeneticChangesDTO dto2) {
        int nReturn = 0;
        switch(nColumn) {
            case MTBTumorGeneticChangesDAO.ID__TUMORGENETICCHANGES_KEY:
                if (dto1.getTumorGeneticChangesKey() == null && dto2.getTumorGeneticChangesKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorGeneticChangesKey() == null && dto2.getTumorGeneticChangesKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorGeneticChangesKey() != null && dto2.getTumorGeneticChangesKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorGeneticChangesKey().compareTo(dto2.getTumorGeneticChangesKey());
                }
                break;
            case MTBTumorGeneticChangesDAO.ID__TUMORFREQUENCY_KEY:
                if (dto1.getTumorFrequencyKey() == null && dto2.getTumorFrequencyKey() != null) {
                    nReturn = -1;
                } else if (dto1.getTumorFrequencyKey() == null && dto2.getTumorFrequencyKey() == null) {
                    nReturn = 0;
                } else if (dto1.getTumorFrequencyKey() != null && dto2.getTumorFrequencyKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getTumorFrequencyKey().compareTo(dto2.getTumorFrequencyKey());
                }
                break;
            case MTBTumorGeneticChangesDAO.ID_NAME:
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
            case MTBTumorGeneticChangesDAO.ID_NOTES:
                if (dto1.getNotes() == null && dto2.getNotes() != null) {
                    nReturn = -1;
                } else if (dto1.getNotes() == null && dto2.getNotes() == null) {
                    nReturn = 0;
                } else if (dto1.getNotes() != null && dto2.getNotes() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getNotes().compareTo(dto2.getNotes());
                }
                break;
            case MTBTumorGeneticChangesDAO.ID_CREATE_USER:
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
            case MTBTumorGeneticChangesDAO.ID_CREATE_DATE:
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
            case MTBTumorGeneticChangesDAO.ID_UPDATE_USER:
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
            case MTBTumorGeneticChangesDAO.ID_UPDATE_DATE:
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
            case MTBTumorGeneticChangesDAO.ID__ALLELETYPE_KEY:
                if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleTypeKey() == null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 0;
                } else if (dto1.getAlleleTypeKey() != null && dto2.getAlleleTypeKey() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleTypeKey().compareTo(dto2.getAlleleTypeKey());
                }
                break;
                
            case MTBTumorGeneticChangesDAO.ID_DISPLAY_CHROMOSOMES: 
                 nReturn = compareDisplayChromosomes(dto1,dto2);
                break;
                
            case MTBTumorGeneticChangesDAO.ID_ALLELE_TYPE_NAME:
                if (dto1.getAlleleTypeName() == null && dto2.getAlleleTypeName() != null) {
                    nReturn = -1;
                } else if (dto1.getAlleleTypeName() == null && dto2.getAlleleTypeName() == null) {
                    nReturn = compareDisplayChromosomes(dto1,dto2);
                } else if (dto1.getAlleleTypeName() != null && dto2.getAlleleTypeName() == null) {
                    nReturn = 1;
                } else { 
                    nReturn = dto1.getAlleleTypeName().compareTo(dto2.getAlleleTypeName());
                    if(nReturn == 0){
                        nReturn = compareDisplayChromosomes(dto1,dto2);
                    }
                }
                break;  
            
            default: 
                throw new IllegalArgumentException("Type passed for the field is not supported");
        }

        return bReverse ? (-1 * nReturn) : nReturn;
    }
    
    // displayChromosomes is a comma seperated list of chromosomes mostly ints but also X and Y and other chars
    private int compareDisplayChromosomes(MTBTumorGeneticChangesDTO dto1, MTBTumorGeneticChangesDTO dto2){
        int nReturn = 0;
        if (dto1.getDisplayChromosomes() == null && dto2.getDisplayChromosomes() != null) {
                    nReturn = -1;
                } else if (dto1.getDisplayChromosomes() == null && dto2.getDisplayChromosomes() == null) {
                    nReturn = 0;
                } else if (dto1.getDisplayChromosomes() != null && dto2.getDisplayChromosomes() == null) {
                    nReturn = 1;
                } else {
                    // FUN!  
                    // need to compare inidividual chromosomes in a comma seperated list
                    // sort order for X and Y
                   String chroms1 = dto1.getDisplayChromosomes().replaceAll("X","23").replaceAll("Y", "24");
                   String chroms2 = dto2.getDisplayChromosomes().replaceAll("X","23").replaceAll("Y", "24");
                   
                   String[] dto1Chroms = chroms1.split(",");
                   String[] dto2Chroms = chroms2.split(",");
                   int i = Math.min(dto1Chroms.length, dto2Chroms.length);
                   int j = 0;
                   while(j < i){
                       Integer int1 = new Integer("25");
                       Integer int2 = new Integer("25");
                       try{
                         int1 = new Integer(dto1Chroms[j]);
                       }catch( Exception e){}
                       try{
                         int2 = new Integer(dto2Chroms[j]);
                       }catch( Exception e){}
                       
                       nReturn = int1.compareTo(int2);
                       if(nReturn != 0) break;
                       j++;
                   }
                   if(j >= i){
                       // the longer chrom list has all the chroms as the shorter plus a few
                       // display the shorter one first.
                       Integer len1 = new Integer(dto1Chroms.length);
                       nReturn = len1.compareTo(new Integer(dto2Chroms.length));
                   }
               }
      return nReturn;
   }
    
// class+ 

// class- 

}
