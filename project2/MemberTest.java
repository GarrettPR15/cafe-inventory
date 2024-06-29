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
public class MemberTest {
    
    public MemberTest() {
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
     * Test of getID method, of class Member.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setID method, of class Member.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int num = 0;
        Member instance = new Member();
        instance.setID(num);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getRewards method, of class Member.
     */
    @Test
    public void testGetRewards() {
        System.out.println("getRewards");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getRewards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setRewards method, of class Member.
     */
    @Test
    public void testSetRewards() {
        System.out.println("setRewards");
        int p = 0;
        Member instance = new Member();
        instance.setRewards(p);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of incrementID method, of class Member.
     */
    @Test
    public void testIncrementID() {
        System.out.println("incrementID");
        Member.incrementID();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Member instance = new Member();
        String expResult = "Name: " + instance.name +
                "\nTotal Spent: $" + instance.totalSpent +
                "\nID number: " + instance.memberID +
                "\nPoints: " + instance.points;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
