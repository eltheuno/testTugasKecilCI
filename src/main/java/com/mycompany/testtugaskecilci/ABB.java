    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

/**
 *
 * @author BBBE
 * Constructor prints ctor-ABB
 * 
 */
public class ABB extends AB{
    private int x;
    
    public ABB(){
        x=0;
        System.out.println("ctor-ABB");
    }
    
    public ABB(int a){
        x=a;
        System.out.println("ctor-ABB");
    }
    
    /**
     * procedure f() prints ABB
     */
    @Override
    public void f(){
        System.out.println("ABB");
    }
    
    /**
     * procedure ToSTring print x as String
     */
    public void ToSTring(){
        System.out.println(x+"");
    }
    
}
