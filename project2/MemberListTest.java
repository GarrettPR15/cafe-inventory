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
public class MemberListTest {
    
    public MemberListTest() {
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
     * Test of add method, of class MemberList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String n = "";
        double t = 0.0;
        int num = 0;
        MemberList instance = new MemberList();
        int expResult = 7;
        int result = instance.add(n, t, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNextMemberID method, of class MemberList.
     */
    @Test
    public void testGetNextMemberID() {
        System.out.println("getNextMemberID");
        int expResult = 15;
        int result = MemberList.getNextMemberID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of incrementNextMemberID method, of class MemberList.
     */
    @Test
    public void testIncrementNextMemberID() {
        System.out.println("incrementNextMemberID");
        MemberList.incrementNextMemberID();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class MemberList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int memID = 0;
        MemberList instance = new MemberList();
        boolean expResult = false;
        boolean result = instance.remove(memID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addPoints method, of class MemberList.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        int amt = 0;
        int id = 0;
        MemberList instance = new MemberList();
        int expResult = 0;
        int result = instance.addPoints(amt, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtractPoints method, of class MemberList.
     */
    @Test
    public void testSubtractPoints() {
        System.out.println("subtractPoints");
        int amt = 0;
        int id = 0;
        MemberList instance = new MemberList();
        int expResult = 0;
        int result = instance.subtractPoints(amt, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkRandomPoints method, of class MemberList.
     */
    @Test
    public void testCheckRandomPoints() {
        System.out.println("checkRandomPoints");
        int id = 0;
        MemberList instance = new MemberList();
        boolean expResult = true;
        boolean result = instance.checkRandomPoints(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkChoosePoints method, of class MemberList.
     */
    @Test
    public void testCheckChoosePoints() {
        System.out.println("checkChoosePoints");
        int id = 0;
        MemberList instance = new MemberList();
        boolean expResult = true;
        boolean result = instance.checkChoosePoints(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printInfo method, of class MemberList.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        MemberList instance = new MemberList();
        instance.printInfo();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
