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
public class addDignosisTest {
    
    public addDignosisTest() {
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
     * Test of main method, of class addDignosis.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addDignosis.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPatientExistence method, of class addDignosis.
     */
    @Test
    public void testCheckPatientExistence1() {
        System.out.println("checkPatientExistenceTest1");
        String patientID = "1";
        addDignosis instance = new addDignosis();
        boolean expResult = true;
        boolean result = instance.checkPatientExistence(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testCheckPatientExistence2() {
        System.out.println("checkPatientExistenceTest2");
        String patientID = "100";
        addDignosis instance = new addDignosis();
        boolean expResult = false;
        boolean result = instance.checkPatientExistence(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckPatientExistence3() {
        System.out.println("checkPatientExistenceTest3");
        String patientID = "4";
        addDignosis instance = new addDignosis();
        boolean expResult = true;
        boolean result = instance.checkPatientExistence(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
