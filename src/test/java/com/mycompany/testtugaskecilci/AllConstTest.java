/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.testtugaskecilci;

import junit.framework.TestCase;

/**
 *
 * @author BBBE
 */
public class AllConstTest extends TestCase {
    
    /**
     *
     * @param testName
     */
    public AllConstTest(String testName) {
        super(testName);
    }
    
    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    /**
     *
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     *
     */
    public void testAllConst() {
        AllConst instance = new AllConst();
        assertEquals(instance.EPSILON, 0.005);
        assertEquals(instance.PI, 3.1417);
        assertEquals(instance.RHO, 9.0);
        assertEquals(instance.N, 8);
    }
    
}
