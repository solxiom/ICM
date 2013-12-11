/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kavan
 */
public class TestUserTest {
    
    public TestUserTest() {
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
     * Test of getId method, of class TestUser.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        TestUser instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class TestUser.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        TestUser instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class TestUser.
     */
    @org.junit.Test
    public void testGetUsername() {
        System.out.println("getUsername");
        TestUser instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class TestUser.
     */
    @org.junit.Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        TestUser instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class TestUser.
     */
    @org.junit.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        TestUser instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class TestUser.
     */
    @org.junit.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        TestUser instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TestUser.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        TestUser instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}