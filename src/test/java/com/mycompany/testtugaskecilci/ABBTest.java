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
public class ABBTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ABBTest(String testName) {
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
     * Test of f method, of class ABB.
     */
    
     public void testABB(){
        ABB instance = new ABB();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("ctor-A", outPut[0]);
        assertEquals("ctor-AB", outPut[1]);
        assertEquals("ctor-ABB", outPut[2]);
    }
     
    public void testF() {
        ABB instance = new ABB();
        instance.f();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("ABB", outPut[3]);
    }

    /**
     * Test of ToSTring method, of class ABB.
     */
    public void testToSTring() {
        ABB instance = new ABB();
        instance.ToSTring();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals(instance.getX()+"", outPut[3]);
    }

    /**
     * Test of getX method, of class ABB.
     */
    public void testGetX() {
        //System.out.println("getX");
        ABB instance = new ABB();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }
    
}
