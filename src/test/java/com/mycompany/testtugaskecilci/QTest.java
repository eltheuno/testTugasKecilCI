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
public class QTest extends TestCase {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public QTest(String testName) {
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

    public void testQ() {
         Q instance = new Q();
        assertEquals("ctor-Q", outContent.toString().trim());
    }
    
}
