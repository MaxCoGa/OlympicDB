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

public class Medical implements Serializable {


    private Integer mid;

    private String nom;

    private String descr;

    private String phone;

    private String adr;

    public Medical() {
    }

    public Medical(Integer mid) {
        this.mid = mid;
    }

    public Integer getId() {
        return mid;
    }

    public void setId(Integer mid) {
        this.mid = mid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneNo) {
        this.phone = phoneNo;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    
}
