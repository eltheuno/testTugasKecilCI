/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

/**
 *
 * @author BBBE
 */
public class AB extends A implements B,C{

    /**
     * Prints "ctor-AB"
     */
    public AB(){
        System.out.println("ctor-AB");
    }
    
    /**
     * Prints "AB"
     */
    @Override
    public void f(){
        System.out.println("AB");
    }


    public int tambah(int a, int b) {
        return a+b;
    }

    public int kali(int a, int b) {
        return a*b;
    }
    
}
