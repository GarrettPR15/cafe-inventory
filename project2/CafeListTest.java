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
public class CafeListTest {
    
    public CafeListTest() {
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
     * Test of newOrder method, of class CafeList.
     */
    @Test
    public void testNewOrder() {
        System.out.println("newOrder");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        CafeList instance = new CafeList();
        int expResult = 0;
        int result = instance.newOrder(num1, num2, num3, num4, num5, num6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of cancelOrder method, of class CafeList.
     */
    @Test
    public void testCancelOrder() {
        System.out.println("cancelOrder");
        int num = 0;
        CafeList instance = new CafeList();
        instance.cancelOrder(num);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkOrder method, of class CafeList.
     */
    @Test
    public void testCheckOrder() {
        System.out.println("checkOrder");
        int num = 0;
        CafeList instance = new CafeList();
        instance.checkOrder(num);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of incrementNextOrderNum method, of class CafeList.
     */
    @Test
    public void testIncrementNextOrderNum() {
        System.out.println("incrementNextOrderNum");
        CafeList.incrementNextOrderNum();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printInfo method, of class CafeList.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        CafeList instance = new CafeList();
        instance.printInfo();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
