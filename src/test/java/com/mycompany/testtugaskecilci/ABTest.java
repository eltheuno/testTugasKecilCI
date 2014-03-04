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
public class ABTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    /**
     *
     * @param testName
     */
    public ABTest(String testName) {
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
     * Test of f method, of class AB.
     */
    public void testAB(){
        AB instance = new AB();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("ctor-A", outPut[0]);
        assertEquals("ctor-AB", outPut[1]);
    }
    
    /**
     *
     */
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
    public void testTambah() {
        AB instance = new AB();
        assertEquals(instance.tambah(0, 0),0);
        assertEquals(instance.tambah(1, 0),1);
        assertEquals(instance.tambah(3, 5),8);
        assertEquals(instance.tambah(2, 7),9);
        assertEquals(instance.tambah(2, 10),12);
    }

    /**
     * Test of g method, of class AB.
     */
    public void testKali() {
        AB instance = new AB();
        assertEquals(instance.kali(0, 0),0);
        assertEquals(instance.kali(1, 0),0);
        assertEquals(instance.kali(0, 1),0);
        assertEquals(instance.kali(2, 2),4);
        assertEquals(instance.kali(3, 2),6);
    }
    
}
