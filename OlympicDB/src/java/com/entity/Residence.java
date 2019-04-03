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
/**
@Entity
@Table(name = "residence")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Residence.findAll", query = "SELECT r FROM Residence r")
    , @NamedQuery(name = "Residence.findByRid", query = "SELECT r FROM Residence r WHERE r.rid = :rid")
    , @NamedQuery(name = "Residence.findByCap", query = "SELECT r FROM Residence r WHERE r.cap = :cap")
    , @NamedQuery(name = "Residence.findByAdr", query = "SELECT r FROM Residence r WHERE r.adr = :adr")
    , @NamedQuery(name = "Residence.findByPhoneNo", query = "SELECT r FROM Residence r WHERE r.phoneNo = :phoneNo")})
    * **/
public class Residence implements Serializable {


    private Integer rid;

    private Integer cap;

    private String adr;

    private String phone;

    public Residence() {
    }

    public Residence(Integer rid) {
        this.rid = rid;
    }

    public Integer getId() {
        return rid;
    }

    public void setId(Integer rid) {
        this.rid = rid;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    
}
