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
public class Pays implements Serializable {
    private String pid;

    public Pays() {
    }

    public Pays(String pid) {
        this.pid = pid;
    }

    public String getId() {
        return pid;
    }

    public void setId(String pid) {
        this.pid = pid;
    }
    
    @Override
    public String toString() {
        return "com.entity.Pays[ id=" + pid + " ]";
    }
    
}
