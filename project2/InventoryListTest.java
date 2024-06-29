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
public class InventoryListTest {
    
    public InventoryListTest() {
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
     * Test of stockFood method, of class InventoryList.
     */
    @Test
    public void testStockFood() {
        System.out.println("stockFood");
        int id = 0;
        int amt = 0;
        InventoryList instance = new InventoryList();
        instance.stockFood(id, amt);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of stockBeverage method, of class InventoryList.
     */
    @Test
    public void testStockBeverage() {
        System.out.println("stockBeverage");
        int id = 0;
        int amt = 0;
        InventoryList instance = new InventoryList();
        instance.stockBeverage(id, amt);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printFoodStock method, of class InventoryList.
     */
    @Test
    public void testPrintFoodStock() {
        System.out.println("printFoodStock");
        InventoryList instance = new InventoryList();
        instance.printFoodStock();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printBevStock method, of class InventoryList.
     */
    @Test
    public void testPrintBevStock() {
        System.out.println("printBevStock");
        InventoryList instance = new InventoryList();
        instance.printBevStock();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of incrementNextFoodID method, of class InventoryList.
     */
    @Test
    public void testIncrementNextFoodID() {
        System.out.println("incrementNextFoodID");
        InventoryList.incrementNextFoodID();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of incrementNextBevID method, of class InventoryList.
     */
    @Test
    public void testIncrementNextBevID() {
        System.out.println("incrementNextBevID");
        InventoryList.incrementNextBevID();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtractStock method, of class InventoryList.
     */
    @Test
    public void testSubtractStock() {
        System.out.println("subtractStock");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        InventoryList instance = new InventoryList();
        instance.subtractStock(a, b, c, d, e, f);
        // TODO review the generated test code and remove the default call to fail.

    }

    
}
