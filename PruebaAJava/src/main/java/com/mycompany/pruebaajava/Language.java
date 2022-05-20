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
    protected String reservedWords;
    protected String code;

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

    public void setReservedWords(String reservedWords) {
        this.reservedWords = reservedWords;
    }

    public String getReservedWords() {
        return this.reservedWords;
    }
    
        public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
    
/*In this class I can put more useful methods for all the subclasses*/
    public abstract void getCompiler();
    public abstract void getInterpreter();
    
    
    
    
}
