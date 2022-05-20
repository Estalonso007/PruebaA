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
    private ArrayList<UILibrary> listOfUILibraries;
    
    
    public void setCodeGenList(ArrayList<CodeGenerator> codeGenList) {
        this.codeGenList = codeGenList;
    }

    public ArrayList<CodeGenerator> getCodeGenList() {
        return this.codeGenList;
    }

    public void setLibraries(ArrayList<UILibrary> listOfUILibraries) {
        this.listOfUILibraries = listOfUILibraries;
    }

    public ArrayList<UILibrary> getUILibraries() {
        return this.listOfUILibraries;
    }
    
    public ArrayList<UIGenerator> getLibraryByLanguageName(String  languageName){
        /*this is a method for getting from the list of libraries a specific library by a language name*/
        return null;
    } 
    
       public void setSpecificUItoSpecificGen(UILibrary library){
           //Something like this
           this.getCodeGenByLanguageName("example").setUI(library.getUI());
         
       /*Here we can use getCodeGenByLanguageName to get de specific Gen and inject the a specific UI choosen by the selected library*/
   }
    
    public CodeGenerator getCodeGenByLanguageName(String languageName) {
        /*this is a method for getting from the list of code generators a specific code generator by a language name*/
        return null;
    }
    
    
}
