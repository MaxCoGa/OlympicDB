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
public class Transport {
    private Integer tid;
    private Integer cap;
    private Integer freq;
    
    public Integer getId() {
        return tid;
    }

    public void setId(Integer tid) {
        this.tid = tid;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }
    
    
}
