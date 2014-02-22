/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

/**
 *
 * @author SONY
 */
public class AB extends A implements B,C{
    public AB(){
        System.out.println("ctor-AB");
    }
    
    @Override
    public void f(){
        System.out.println("AB");
    }

    public void v() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void g() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
