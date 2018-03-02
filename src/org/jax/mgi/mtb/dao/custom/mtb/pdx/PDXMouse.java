/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jax.mgi.mtb.dao.custom.mtb.pdx;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sbn
 */
public class PDXMouse {

    private String modelID;
    private String previousID;
    private String institution;
    private String tissue = "";  // tumor site
    private String sex;
    private String age;
    private String initialDiagnosis = "";
    private String clinicalDiagnosis = "";
    private String strain;
    private String location;  // implantation site
    private String sampleType;
    private String tumorType = "";
    private String tumorMarkers = "";
    private String race;
    private String ethnicity;
    private String sampleSite;
    private String primarySite = "";
    private String stage;
    private String grade;
    private String modelStatus;
    private String tag;

    // for now a string maybe needs to be a collection?
    private String gene = "";
    private String variant = "";
    private String consequence = "";

    private String currentSmoker = "";
    private String formerSmoker = "";
    private String treatmentNaive = "";

    // this is formatted for display not searching
    private String fusionGenes = "";

    private ArrayList<String> assocData = new ArrayList<String>();
    
    private int socGraph = 0;

    public PDXMouse() {

    }

    public PDXMouse clone() {
        PDXMouse m2 = new PDXMouse();
        m2.modelID = this.getModelID();
        m2.previousID = this.getPreviousID();
        m2.institution = this.getInstitution();
        m2.tissue = this.getTissue();
        m2.sex = this.getSex();
        m2.age = this.getAge();
        m2.initialDiagnosis = this.getInitialDiagnosis();
        m2.clinicalDiagnosis = this.getClinicalDiagnosis();
        m2.strain = this.getStrain();
        m2.location = this.getLocation();
        m2.sampleType = this.getSampleType();
        m2.tumorType = this.getTumorType();
        m2.tumorMarkers = this.getTumorMarkers();
        m2.race = this.getRace();
        m2.ethnicity = this.getEthnicity();
        m2.sampleSite = this.getSampleSite();
        m2.primarySite = this.getPrimarySite();
        m2.stage = this.getStage();
        m2.grade = this.getGrade();
        m2.modelStatus = this.getModelStatus();
        m2.tag = this.getTag();

        // don't duplicate these they are query specific
        //m2.gene = this.getGene();
        //m2.variant = this.getVariant();
        //m2.consequence = this.getConsequenc();           
        m2.currentSmoker = this.getCurrentSmoker();
        m2.formerSmoker = this.getFormerSmoker();
        m2.treatmentNaive = this.getTreatmentNaive();

        // get the value directly otherwise its a formatted string
        m2.assocData = this.assocData;
        
        m2.fusionGenes = this.fusionGenes;
        
        m2.setSocGraph(this.getSocGraph());

        return m2;
    }

    public String getModelID() {
        return modelID;
    }

    public void setModelID(String modelID) {
        this.modelID = modelID;
    }

    public String getTissue() {
        return tissue;
    }

    public void setTissue(String tissue) {
        this.tissue = tissue;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        if ((age == null) || age.equals("0")) {
            age = "unspecified";
        }
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public String getLocation() {
        return this.location;
    }

    /**
     * @return the assocData
     *
     */
    public String getAssocData() {

        String assocDataStr = "";

        StringBuffer val = new StringBuffer();
        
        if(this.getSocGraph()>0){
            val.append("Dosing Studies,");
        }

        if (assocData != null) {

            Collections.sort(assocData);
            for (String s : assocData) {
                if (s.equals("1")) {
                    val.append("Histology,");
                }

                if (s.equals("3")) {
                    val.append("Genomics,");
                }

                // don't show drug response if there are SOC data
                if (s.equals("6") && this.getSocGraph()==0) {
                    val.append("Drug Response,");
                }

                if (s.equals("7")) {
                    val.append("Circos Plot,");
                }

                if (s.equals("8")) {
                    val.append("Tumor Growth Rate,");
                }

            }
            

        }
        assocDataStr = val.toString();
            if (assocDataStr.length() > 1) {
                assocDataStr = assocDataStr.substring(0, assocDataStr.length() - 1);
            }

        return assocDataStr;
    }

    /**
     * @param assocData the assocData to set
     */
    public void setAssocData(ArrayList<String> assocData) {
        if (assocData != null && assocData.size() > 1) {
            Collections.sort(assocData);
        }
        this.assocData = assocData;
    }

    /**
     * @return the sampleType
     */
    public String getSampleType() {
        return sampleType;
    }

    /**
     * @param sampleType the sampleType to set
     */
    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    /**
     * @return the tumorType
     */
    public String getTumorType() {
        return tumorType;
    }

    /**
     * @param tumorType the tumorType to set
     */
    public void setTumorType(String tumorType) {
        this.tumorType = tumorType;
    }

    /**
     * @return the tumorMarkers
     */
    public String getTumorMarkers() {
        return tumorMarkers;
    }

    /**
     * @param tumorMarkers the tumorMarkers to set
     */
    public void setTumorMarkers(String tumorMarkers) {
        if (tumorMarkers != null) {
            this.tumorMarkers = tumorMarkers;
        }
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * @param ethnicity the ethnicity to set
     */
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    /**
     * @return the sampleSite
     */
    public String getSampleSite() {
        return sampleSite;
    }

    /**
     * @param sampleSite the sampleSite to set
     */
    public void setSampleSite(String sampleSite) {
        this.sampleSite = sampleSite;
    }

    /**
     * @return the stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the previousID
     */
    public String getPreviousID() {
        return previousID;
    }

    /**
     * @param previousID the previousID to set
     */
    public void setPreviousID(String previousID) {
        this.previousID = previousID;
    }

    /**
     * @return the primarySite
     */
    public String getPrimarySite() {
        return primarySite;
    }

    /**
     * @param primarySite the primarySite to set
     */
    public void setPrimarySite(String primarySite) {
        if (primarySite != null && !"null".equals(primarySite)) {
            this.primarySite = primarySite;
        }
    }

    /**
     * @return the gene
     */
    public String getGene() {
        return gene;
    }

    /**
     * @param gene the gene to set
     */
    public void setGene(String gene) {
        this.gene = gene;
    }

    /**
     * @return the variant
     */
    public String getVariant() {
        return variant;
    }

    /**
     * @param variant the variant to set
     */
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * @return the consequence
     */
    public String getConsequence() {
        return consequence;
    }

    /**
     * @param consequence the consequence to set
     */
    public void setConsequence(String consequence) {
        this.consequence = consequence;
    }

    /**
     * @return the modelStatus
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * @param modelStatus the modelStatus to set
     */
    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the currentSmoker
     */
    public String getCurrentSmoker() {
        return currentSmoker;
    }

    /**
     * @param currentSmoker the currentSmoker to set
     */
    public void setCurrentSmoker(String currentSmoker) {
        if (currentSmoker != null && currentSmoker.length() > 0) {
            this.currentSmoker = currentSmoker;
        }
    }

    /**
     * @return the formerSmoker
     */
    public String getFormerSmoker() {
        return formerSmoker;
    }

    /**
     * @param formerSmoker the formerSmoker to set
     */
    public void setFormerSmoker(String formerSmoker) {
        if (formerSmoker != null && formerSmoker.length() > 0) {
            this.formerSmoker = formerSmoker;
        }
    }

    /**
     * @return the treatmentNaive
     */
    public String getTreatmentNaive() {
        return treatmentNaive;
    }

    /**
     * @param treatmentNaive the treatmentNaive to set
     */
    public void setTreatmentNaive(String treatmentNaive) {
        if (treatmentNaive != null && treatmentNaive.length() > 0) {
            this.treatmentNaive = treatmentNaive;
        }

    }

    /**
     * @return the initialDiagnosis
     */
    public String getInitialDiagnosis() {
        return initialDiagnosis;
    }

    /**
     * @param initialDiagnosis the initialDiagnosis to set
     */
    public void setInitialDiagnosis(String initialDiagnosis) {
        this.initialDiagnosis = initialDiagnosis;
    }

    /**
     * @return the clinicalDiagnosis
     */
    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    /**
     * @param clinicalDiagnosis the clinicalDiagnosis to set
     */
    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis;
    }

    /**
     * @return the fusionGenes
     */
    public String getFusionGenes() {
        return fusionGenes;
    }

    /**
     * @param fusionGenes the fusionGenes to set
     */
    public void setFusionGenes(String fusionGenes) {
        this.fusionGenes = fusionGenes;
    }

    /**
     * @return the socGraph
     */
    public int getSocGraph() {
        return socGraph;
    }

    /**
     * @param socGraph the socGraph to set
     */
    public void setSocGraph(int socGraph) {
        this.socGraph = socGraph;
    }

    /**
     * @return the institution
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * @param institution the institution to set
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

}
