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
    private String id;

    public Pays() {
    }

    public Pays(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        @Override
    public String toString() {
        return "com.entity.Pays[ id=" + id + " ]";
    }
    
}
