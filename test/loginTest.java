/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TheGenius
 */
public class loginTest {
    
    public loginTest() {
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
     * Test of checkAdmin method, of class login.
     */
    @Test
    public void testCheckAdmin1() {
        System.out.println("checkAdminTest1");
        String username = "SWTeam";
        String password = "123456789";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkAdmin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckAdmin2() {
        System.out.println("checkAdminTest2");
        String username = "medhat";
        String password = "13565";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.checkAdmin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
