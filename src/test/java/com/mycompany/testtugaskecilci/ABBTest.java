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
 * @author BBBE
 */
public class ABBTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    /**
     *
     * @param testName
     */
    public ABBTest(String testName) {
        super(testName);
    }
    
    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }
    
    /**
     *
     * @throws Exception
     */
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
     
    /**
     *
     */
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
    
    public void testKelilingPersegiPanjang()
    {
        ABB instance = new ABB();
        assertEquals(instance.kelilingPersegiPanjang(5, 10), 30);
        assertEquals(instance.kelilingPersegiPanjang(20, 100), 240);
        assertEquals(instance.kelilingPersegiPanjang(2, 10), 24);
        assertEquals(instance.kelilingPersegiPanjang(5, 11), 32);
    }
    
    public void testLuasPersegiPanjang()
    {
        ABB instance = new ABB();
        assertEquals(instance.LuasPersegiPanjang(5, 10), 50);
        assertEquals(instance.LuasPersegiPanjang(5, 8), 40);
        assertEquals(instance.LuasPersegiPanjang(2, 10), 20);
        assertEquals(instance.LuasPersegiPanjang(7, 0), 0);
        assertEquals(instance.LuasPersegiPanjang(8, 40), 320);
    }
}
