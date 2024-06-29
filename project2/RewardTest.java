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
public class RewardTest {
    
    public RewardTest() {
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
     * Test of getName method, of class Reward.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Reward instance = new Reward();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class Reward.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        Reward instance = new Reward();
        instance.setName(n);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getID method, of class Reward.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Reward instance = new Reward();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setID method, of class Reward.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int i = 0;
        Reward instance = new Reward();
        instance.setID(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getStock method, of class Reward.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Reward instance = new Reward();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setStock method, of class Reward.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int s = 0;
        Reward instance = new Reward();
        instance.setStock(s);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Reward.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reward instance = new Reward();
        String expResult = "Name: " + instance.name +
                "\nID: " + instance.id +
                "\nStock: " + instance.stock;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
