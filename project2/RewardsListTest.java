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
public class RewardsListTest {
    
    public RewardsListTest() {
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
     * Test of addReward method, of class RewardsList.
     */
    @Test
    public void testAddReward() {
        System.out.println("addReward");
        String name = "";
        int amount = 0;
        RewardsList instance = new RewardsList();
        int expResult = 922;
        int result = instance.addReward(name, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeReward method, of class RewardsList.
     */
    @Test
    public void testRemoveReward() {
        System.out.println("removeReward");
        int ID = 0;
        RewardsList instance = new RewardsList();
        boolean expResult = false;
        boolean result = instance.removeReward(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of incrementNextRewardID method, of class RewardsList.
     */
    @Test
    public void testIncrementNextRewardID() {
        System.out.println("incrementNextRewardID");
        RewardsList.incrementNextRewardID();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printInfo method, of class RewardsList.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        RewardsList instance = new RewardsList();
        instance.printInfo();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of chooseReward method, of class RewardsList.
     */
    @Test
    public void testChooseReward() {
        System.out.println("chooseReward");
        int i = 0;
        RewardsList instance = new RewardsList();
        instance.chooseReward(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of randomReward method, of class RewardsList.
     */
    @Test
    public void testRandomReward() {
        System.out.println("randomReward");
        RewardsList instance = new RewardsList();
        instance.randomReward();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
