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

public class Discipline implements Serializable {

    private Integer did;

    private String nom;

    public Discipline() {
    }

    public Discipline(Integer did) {
        this.did = did;
    }

    public Integer getId() {
        return did;
    }

    public void setId(Integer did) {
        this.did = did;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "com.entity.Discipline[ id=" + did + " ]";
    }
    
}
