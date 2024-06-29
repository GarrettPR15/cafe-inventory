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
public class CafeOrderTest {
    
    public CafeOrderTest() {
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
     * Test of getScone method, of class CafeOrder.
     */
    @Test
    public void testGetScone() {
        System.out.println("getScone");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getScone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setScone method, of class CafeOrder.
     */
    @Test
    public void testSetScone() {
        System.out.println("setScone");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setScone(x);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCroissant method, of class CafeOrder.
     */
    @Test
    public void testGetCroissant() {
        System.out.println("getCroissant");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getCroissant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setCroissant method, of class CafeOrder.
     */
    @Test
    public void testSetCroissant() {
        System.out.println("setCroissant");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setCroissant(x);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getTuna method, of class CafeOrder.
     */
    @Test
    public void testGetTuna() {
        System.out.println("getTuna");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getTuna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setTuna method, of class CafeOrder.
     */
    @Test
    public void testSetTuna() {
        System.out.println("setTuna");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setTuna(x);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getCoffeeS method, of class CafeOrder.
     */
    @Test
    public void testGetCoffeeS() {
        System.out.println("getCoffeeS");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getCoffeeS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setCoffeeS method, of class CafeOrder.
     */
    @Test
    public void testSetCoffeeS() {
        System.out.println("setCoffeeS");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setCoffeeS(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCoffeeL method, of class CafeOrder.
     */
    @Test
    public void testGetCoffeeL() {
        System.out.println("getCoffeeL");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getCoffeeL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCoffeeL method, of class CafeOrder.
     */
    @Test
    public void testSetCoffeeL() {
        System.out.println("setCoffeeL");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setCoffeeL(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTea method, of class CafeOrder.
     */
    @Test
    public void testGetTea() {
        System.out.println("getTea");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getTea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTea method, of class CafeOrder.
     */
    @Test
    public void testSetTea() {
        System.out.println("setTea");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setTea(x);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTotal method, of class CafeOrder.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        CafeOrder instance = new CafeOrder();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTotal method, of class CafeOrder.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double x = 0.0;
        CafeOrder instance = new CafeOrder();
        instance.setTotal(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTotalReward method, of class CafeOrder.
     */
    @Test
    public void testGetTotalReward() {
        System.out.println("getTotalReward");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getTotalReward();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTotalReward method, of class CafeOrder.
     */
    @Test
    public void testSetTotalReward() {
        System.out.println("setTotalReward");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setTotalReward(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrderNum method, of class CafeOrder.
     */
    @Test
    public void testGetOrderNum() {
        System.out.println("getOrderNum");
        CafeOrder instance = new CafeOrder();
        int expResult = 0;
        int result = instance.getOrderNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrderNum method, of class CafeOrder.
     */
    @Test
    public void testSetOrderNum() {
        System.out.println("setOrderNum");
        int x = 0;
        CafeOrder instance = new CafeOrder();
        instance.setOrderNum(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class CafeOrder.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CafeOrder instance = new CafeOrder();
        String expResult = "Scone(s): " + instance.scone + 
                "\nCroissant(s): " + instance.croissant +
                "\nTuna Sandwiche(s): " + instance.tuna +
                "\nSmall Coffee(s): " + instance.coffeeS +
                "\nLarge Coffee(s): " + instance.coffeeL +
                "\nTea(s): " + instance.tea +
                "\nTotal Rewards: " + instance.totalReward +
                "\nTotal: $" + instance.total +
                "\nOrder Number: " + instance.orderNum;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
