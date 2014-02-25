/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

import java.util.Vector;

/**
 *
 * @author BBBE
 */
public class MainProg implements X{

     public int w() {
        return 2;
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Mulai");
       AllConst allconst = new AllConst();
       ABB a = new ABB();
       P p = new P();
       Q q = new Q();
       Vector<Integer> v = new Vector<Integer>(allconst.N);
       a.f();
       
        for (int i = 0; i < allconst.N; i++) {
            v.add(i);
            System.out.println(v.get(i)+"");
        }
    }

   
    
}
