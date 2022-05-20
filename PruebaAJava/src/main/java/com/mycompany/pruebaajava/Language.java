/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaajava;

/**
 *
 * @author USER
 */
public abstract class Language {

    protected String name;
    protected String version;
    protected String tipo;

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String getTipo() {
        return this.tipo;
    }
    
    /*In this class I can put more useful methods for all the subclasses*/
    
}
