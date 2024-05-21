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
public class addnewPatiantTest {
    
    public addnewPatiantTest() {
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
     * Test of validateData method, of class addnewPatiant.
     */
    @Test
    public void testValidateData1() {
        System.out.println("validateData");
        String ID = "12";
        String name = "mina";
        String number = "010000123";
        String age = "21";
        String gender = "male";
        String blood = "A+";
        String address = "el-sadat";
        String majorDisease = "cold";
        addnewPatiant instance = new addnewPatiant();
        boolean expResult = true;
        boolean result = instance.validateData(ID, name, number, age, gender, blood, address, majorDisease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testValidateData2() {
        System.out.println("validateData");
        String ID = "medhat";
        String name = "mina";
        String number = "010000123";
        String age = "21";
        String gender = "male";
        String blood = "A+";
        String address = "el-sadat";
        String majorDisease = "cold";
        addnewPatiant instance = new addnewPatiant();
        boolean expResult = false;
        boolean result = instance.validateData(ID, name, number, age, gender, blood, address, majorDisease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testValidateData3() {
        System.out.println("validateData");
        String ID = "12";
        String name = "mina";
        String number = "010000123";
        String age = "tawfek";
        String gender = "male";
        String blood = "A+";
        String address = "el-sadat";
        String majorDisease = "cold";
        addnewPatiant instance = new addnewPatiant();
        boolean expResult = false;
        boolean result = instance.validateData(ID, name, number, age, gender, blood, address, majorDisease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class addnewPatiant.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addnewPatiant.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
