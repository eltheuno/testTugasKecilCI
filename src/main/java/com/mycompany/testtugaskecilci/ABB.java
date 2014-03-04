    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

/**
 *
 * @author BBBE
 * 
 */
public class ABB extends AB{
    private int x;
    
    /**
     * Prints "ctor-ABB"
     * 
     */
    public ABB(){
        x=0;
        System.out.println("ctor-ABB");
    }
    
    /**
     *
     * @param a
     */
    public ABB(int a){
        x=a;
        System.out.println("ctor-ABB");
    }
    
    /**
     * Prints "ABB"
     */
    @Override
    public void f(){
        System.out.println("ABB");
    }
    
    /**
     * Print x as String
     */
    public void ToSTring(){
        System.out.println(x+"");
    }

    /**
     *
     * @return x
     */
    public int getX() {
        return x;
    }
    
    public int kelilingPersegiPanjang(int a, int b){
       return (2*tambah(a, b)); 
    }
    
    public int LuasPersegiPanjang(int a, int b){
       return (kali(a, b)); 
    }

}
