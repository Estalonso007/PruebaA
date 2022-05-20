/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaajava;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Main {

    private ArrayList<CodeGenerator> codeGenList;
    private ArrayList<UIGenerator> uiList;
    
    
    public void setCodeGenList(ArrayList<CodeGenerator> codeGenList) {
        this.codeGenList = codeGenList;
    }

    public ArrayList<CodeGenerator> getCodeGenList() {
        return this.codeGenList;
    }

    public void setUIList(ArrayList<UIGenerator> uiList) {
        this.uiList = uiList;
    }

    public ArrayList<UIGenerator> getUIList() {
        return this.uiList;
    }

    public CodeGenerator getCodeGenByLanguageName(String languageName) {
        /*this is a method for getting from the list of code generators a specific code generator by a language name*/
        return null;
    }
    
   public void setSpecificUItoSpecificGen(UIGenerator ui){
       /*Here we can use getCodeGenByLanguageName to get de specific Gen and inject the a specific UI choosen with Language and Code Generator*/
   }
    
}
