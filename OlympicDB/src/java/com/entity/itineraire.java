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
public class itineraire {
    private Integer id;
    private Integer tid;
    private Integer tof;
    private Integer fromf;
    
    public itineraire(){
        
    }
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTof() {
        return tof;
    }

    public void setTof(Integer tof) {
        this.tof = tof;
    }

    public Integer getFromf() {
        return fromf;
    }

    public void setFromf(Integer fromf) {
        this.fromf = fromf;
    }
    
}
