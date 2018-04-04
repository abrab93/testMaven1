/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YOUNES
 */
public class CalculateTest {
    
    public CalculateTest() {
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
     * Test of add method, of class Calculate.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 2;
        Calculate instance = new Calculate();
        int expResult = 9;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculate.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 1;
        int b = 1;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Calculate.
     */
    @org.junit.Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 2;
        int b = 5;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculate.
     */
    @org.junit.Test
    public void testDivide() {
        System.out.println("divide");
        int a = 4;
        int b = 9;
        Calculate instance = new Calculate();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
