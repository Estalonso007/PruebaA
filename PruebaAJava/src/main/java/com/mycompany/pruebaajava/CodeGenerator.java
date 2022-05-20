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
public class CodeGenerator {

    private Language language;
    private UIGenerator ui;

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setUI(UIGenerator ui) {
        this.ui = ui;
    }

    public UIGenerator getUI() {
        return this.ui;
    }

    public void readCode() {

    }

    public String translateCode() {
        return "";
    }

    public String writeCode() {
        return "";
    }

}
