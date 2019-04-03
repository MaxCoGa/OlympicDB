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
public class Employee implements Serializable {
    private Integer eid;
    private String psw;
    private String pnom;
    private String nom;
    private String phone;
    private String adr;
    
    private Integer rid;
    public Integer getRid(){
        return rid;
    }
    public void setRid(Integer rid){
        this.rid=rid;
    }
    
    public Employee(){
        
    }
    public Integer getId() {
        return eid;
    }

    public void setId(Integer eid) {
        this.eid = eid;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getPnom() {
        return pnom;
    }

    public void setPnom(String pnom) {
        this.pnom = pnom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }
    
}
