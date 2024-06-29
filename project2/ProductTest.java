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
public class ProductTest {
    
    public ProductTest() {
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
     * Test of getType method, of class Product.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setType method, of class Product.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String t = "";
        Product instance = new Product();
        instance.setType(t);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double p = 0.0;
        Product instance = new Product();
        instance.setPrice(p);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getStock method, of class Product.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setStock method, of class Product.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int s = 0;
        Product instance = new Product();
        instance.setStock(s);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getProdID method, of class Product.
     */
    @Test
    public void testGetProdID() {
        System.out.println("getProdID");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getProdID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setProdID method, of class Product.
     */
    @Test
    public void testSetProdID() {
        System.out.println("setProdID");
        int num = 0;
        Product instance = new Product();
        instance.setProdID(num);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPoints method, of class Product.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPoints method, of class Product.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int r = 0;
        Product instance = new Product();
        instance.setPoints(r);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Product instance = new Product();
        String expResult = "Type: " + instance.type + 
                "\nPrice : $" + instance.price +
                "\nStock: " + instance.stock +
                "\nID Number: " + instance.prodID +
                "\nRewards Points: " + instance.rewardPoints;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
