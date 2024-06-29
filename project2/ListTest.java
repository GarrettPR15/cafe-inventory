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
public class ListTest {
    
    public ListTest() {
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
     * Test of add method, of class List.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String name = "";
        double amount = 0.0;
        int ID = 0;
        List instance = new ListImpl();
        int expResult = 0;
        int result = instance.add(name, amount, ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class List.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int ID = 0;
        List instance = new ListImpl();
        boolean expResult = false;
        boolean result = instance.remove(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printInfo method, of class List.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        List instance = new ListImpl();
        instance.printInfo();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class ListImpl implements List {

        public int add(String name, double amount, int ID) {
            return 0;
        }

        public boolean remove(int ID) {
            return false;
        }

        public void printInfo() {
        }
    }
    
}
