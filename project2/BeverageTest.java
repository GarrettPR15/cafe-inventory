/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garrett
 */
public class BeverageTest {
    
    public BeverageTest() {
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
     * Test of getSize method, of class Beverage.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Beverage instance = new Beverage();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setSize method, of class Beverage.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int sz = 0;
        Beverage instance = new Beverage();
        instance.setSize(sz);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of toString method, of class Beverage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Beverage instance = new Beverage();
        String expResult = "Type: " + instance.type + 
                "\nPrice : $" + instance.price +
                "\nStock: " + instance.stock +
                "\nID Number: " + instance.prodID +
                "\nRewards Points: " + instance.rewardPoints +
                "\nSize: " + instance.size + "oz";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
