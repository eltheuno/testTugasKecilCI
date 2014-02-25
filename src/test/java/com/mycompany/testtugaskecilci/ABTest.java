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
public class ABTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ABTest(String testName) {
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
     * Test of f method, of class AB.
     */
    public void testAB(){
        AB instance = new AB();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("ctor-A", outPut[0]);
        assertEquals("ctor-AB", outPut[1]);
    }
    
    public void testF() {
        AB instance = new AB();
        instance.f();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("AB", outPut[2]);
    }

    /**
     * Test of v method, of class AB.
     */
    public void testV() {
        
    }

    /**
     * Test of g method, of class AB.
     */
    public void testG() {
        
    }
    
}
