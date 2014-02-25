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
public class ATest extends TestCase {
  
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public ATest(String testName) {
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
     * Test of f method, of class A.
     */
    public void testA(){
        A instance = new A();
        assertEquals("ctor-A", outContent.toString().trim());
    }
    public void testF() {
        //System.out.println("f");
        A instance = new A();
        instance.f();
        String[] outPut = outContent.toString().split(
                System.getProperty("line.separator"));
        assertEquals("A", outPut[1]);
    }
    
}
