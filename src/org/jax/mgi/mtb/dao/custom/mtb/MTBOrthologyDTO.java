/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jax.mgi.mtb.dao.custom.mtb;

/**
 *
 * @author sbn
 */
public class MTBOrthologyDTO {
  
  private String humanGS;
  private String mouseGS;
  private String accID;
  private String symbol;
  private int strains;
  private int tumors;
  private int mgiGSKey;

  public String getHumanGS() {
    return humanGS;
  }

  public void setHumanGS(String humanGS) {
    this.humanGS = humanGS;
  }

  public String getMouseGS() {
    return mouseGS;
  }

  public void setMouseGS(String mouseGS) {
    this.mouseGS = mouseGS;
  }

  public String getAccID() {
    return accID;
  }

  public void setAccID(String accID) {
    this.accID = accID;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public int getStrains() {
    return strains;
  }

  public void setStrains(int strains) {
    this.strains = strains;
  }

  public int getTumors() {
    return tumors;
  }

  public void setTumors(int tumors) {
    this.tumors = tumors;
  }

  public int getMgiGSKey() {
    return mgiGSKey;
  }

  public void setMgiGSKey(int mgiGSKey) {
    this.mgiGSKey = mgiGSKey;
  }

}
