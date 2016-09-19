/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb;

import java.util.ArrayList;
import org.jax.mgi.mtb.dao.gen.mtb.SampleDTO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesDAO;
import org.jax.mgi.mtb.dao.gen.mtb.SeriesDTO;

/**
 * Encapsulates data for a Series and its associated Samples
 * 
 * @author sbn
 */
public class MTBSeriesSampleSearchDTO {

  private SeriesDTO series = SeriesDAO.getInstance().createSeriesDTO();
  private int totalSamples;
  private ArrayList<SampleDTO> samples = new ArrayList<SampleDTO>();
  private String siteURL;

  public SeriesDTO getSeries() {
    return series;
  }

  public void setSeries(SeriesDTO series) {
    this.series = series;
  }

  public int getTotalSamples() {
    return totalSamples;
  }

  public void setTotalSamples(int totalSamples) {
    this.totalSamples = totalSamples;
  }

  public void addSample(SampleDTO dto) {
    samples.add(dto);
  }

  public ArrayList<SampleDTO> getSamples() {
    return samples;
  }

  public void setSamples(ArrayList<SampleDTO> samples) {
    this.samples = samples;
  }

  public int getSampleCount() {
    return samples.size();
  }

  public String getSiteURL() {
    return siteURL;
  }

  public void setSiteURL(String siteURL) {
    this.siteURL = siteURL;
  }
}