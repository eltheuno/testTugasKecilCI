/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 *
 * @author SONY
 */
public class MainProgTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public MainProgTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }
    
    @Override
    protected void tearDown() throws Exception {
        System.setOut(null);
    }

    /**
     * Test of w method, of class MainProg.
     */
    public void testW() {
        MainProg instance = new MainProg();
        int expResult = 2;
        int result = instance.w();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class MainProg.
     */
    public void testMain() {
        String[] args = null;
        MainProg.main(args);
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("ctor-A", outPut[0]);
        assertEquals("ctor-AB", outPut[1]);
        assertEquals("ctor-ABB", outPut[2]);
        assertEquals("ctor-P", outPut[3]);
        assertEquals("ctor-Q", outPut[4]);
        assertEquals("ABB", outPut[5]);
        assertEquals("0", outPut[6]);
        assertEquals("1", outPut[7]);
        assertEquals("2", outPut[8]);
        assertEquals("3", outPut[9]);
        assertEquals("4", outPut[10]);
        assertEquals("5", outPut[11]);
        assertEquals("6", outPut[12]);
        assertEquals("7", outPut[13]);
        assertEquals("Keliling Persegi Panjang dengan p = 8 dan l = 2 adalah 20", outPut[14]);
        assertEquals("Luas Persegi Panjang dengan p = 8 dan l = 2 adalah 16", outPut[15]);
        
        
    }
    
}
