/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.Comparator;

/**
 *
 * @author sbn
 */
public class MTBOrthologyComparator implements Comparator<MTBOrthologyDTO> {

  public static final int MOUSE_GS = 0;
  public static final int HUMAN_GS = 1;
  
  private int sort = 0;
  
  public MTBOrthologyComparator(int sortOn){
   sort = sortOn;  
  }
  
  public int compare(MTBOrthologyDTO o1, MTBOrthologyDTO o2){
    int comp = 0;
    switch(sort){
      
      case MOUSE_GS:{
        comp = o1.getMouseGS().compareTo(o2.getMouseGS());
        break;
      }
      case HUMAN_GS:{
        comp =  o1.getHumanGS().compareTo(o2.getHumanGS());
        break;
      }
      
    }
    return comp;
  }
  
  public boolean equals(MTBOrthologyDTO o1, MTBOrthologyDTO o2){
    
    boolean equal = false;
    switch(sort){
      
      case MOUSE_GS:{
        equal = o1.getMouseGS().equals(o2.getMouseGS());
        break;
      }
      case HUMAN_GS:{
        equal =  o1.getHumanGS().equals(o2.getHumanGS());
        break;
      }
      
    }
    return equal;
  }
}
