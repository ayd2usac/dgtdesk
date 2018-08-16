/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayd2.dgtdesk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NELSONJAIR
 */
public class DataBaseTest {
    
    public DataBaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connect method, of class DataBase.
     */
    @Test
    public void testConnect() {
        System.out.println("Probando conexión a la base de datos");
        boolean res = DataBase.connect();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(res, true);        
    }
    
}
