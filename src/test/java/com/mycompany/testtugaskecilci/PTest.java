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
public class PTest extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    /**
     *
     * @param testName
     */
    public PTest(String testName) {
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
     *
     */
    public void testP(){
        P instance = new P();
        assertEquals("ctor-P", outContent.toString().trim());
    }
    
}
