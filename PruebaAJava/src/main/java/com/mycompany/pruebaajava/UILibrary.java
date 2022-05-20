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
public class UILibrary {
    private UIGenerator ui;
    public void setUI(UIGenerator ui){
        this.ui=ui;
    }
   public UIGenerator getUI(){
       return this.ui;
   }
   /*In this class we can have buttons, input elements, scrolling lists, headers, tab, grids...*/
}
