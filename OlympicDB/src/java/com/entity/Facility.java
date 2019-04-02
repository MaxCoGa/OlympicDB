/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Maxime
 */
public class Facility {
    
    
    private Integer facility_id;
    private int capacity;
    private String adresses;
    private String nom;

    public Integer getId() {
        return facility_id;
    }

    public void setId(Integer facility_id) {
        this.facility_id = facility_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAdresses() {
        return adresses;
    }

    public void setAdresses(String adresses) {
        this.adresses = adresses;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Override
    public String toString() {
        return "com.Facility[ id=" + facility_id + " ]";
    }
    
    
    
}
