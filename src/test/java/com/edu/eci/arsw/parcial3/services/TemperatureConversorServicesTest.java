/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.eci.arsw.parcial3.services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante
 */
public class TemperatureConversorServicesTest {
    
    public TemperatureConversorServicesTest() {
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
     * Test of CelsiusToFahrenheit method, of class TemperatureConversorServices.
     */
    @Test
    public void testCelsiusToFahrenheit() {
        System.out.println("CelsiusToFahrenheit");
        double c = 10.0;
        TemperatureConversorServices instance = new TemperatureConversorServices();
        double expResult = 50.0;
        double result = instance.CelsiusToFahrenheit(c);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of FahrenheitToCelsius method, of class TemperatureConversorServices.
     */
    @Test
    public void testFahrenheitToCelsius() {
        System.out.println("FahrenheitToCelsius");
        double f = 59.0;
        TemperatureConversorServices instance = new TemperatureConversorServices();
        double expResult = 15.0;
        double result = instance.FahrenheitToCelsius(f);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
