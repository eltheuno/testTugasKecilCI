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

    /**
     *
     * @return integer 2
     */
    public int w() {
        return 2;
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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
        System.out.println("Keliling Persegi Panjang dengan p = "+allconst.N+" dan l = 2 adalah "+a.kelilingPersegiPanjang(allconst.N,2));
        System.out.println("Luas Persegi Panjang dengan p = "+allconst.N+" dan l = 2 adalah "+a.LuasPersegiPanjang(allconst.N,2));
    }

   
    
}
