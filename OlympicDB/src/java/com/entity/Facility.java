/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;

/**
 *
 * @author Maxime
 */
public class Facility implements Serializable {
    
    
    private Integer fid;
    private int cap;
    private String adr;
    private String descr;
    private Boolean competition;
    private Boolean training;

    public Boolean getTraining() {
        return training;
    }

    public void setTraining(Boolean training) {
        this.training = training;
    }

    public Boolean getCompetition() {
        return competition;
    }

    public void setCompetition(Boolean competition) {
        this.competition = competition;
    }

    
    public Facility(){
        
    }
    public Integer getId() {
        return fid;
    }

    public void setId(Integer facility_id) {
        this.fid = facility_id;
    }

    public int getCapacity() {
        return cap;
    }

    public void setCapacity(int capacity) {
        this.cap = capacity;
    }

    public String getAdresses() {
        return adr;
    }

    public void setAdresses(String adresses) {
        this.adr = adresses;
    }

    public String getNom() {
        return descr;
    }

    public void setNom(String nom) {
        this.descr = nom;
    }
    
    @Override
    public String toString() {
        return "com.Facility[ id=" + fid + " ]";
    }
    
    
    
}
