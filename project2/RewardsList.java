/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;
import java.util.ArrayList;
/**
 *
 * @author Garrett
 * @version 4.2.22
 */
public class RewardsList{
    private static int nextRewardID = 901;
    
    ArrayList<Reward> rewardList = new ArrayList();
    
    /**
     * RewardsList constructor
     */
    public RewardsList(){
        Reward r1 = new Reward("T-Shirt", nextRewardID, 10);
        incrementNextRewardID();
        Reward r2 = new Reward("Household Mug", nextRewardID, 10);
        incrementNextRewardID();
        Reward r3 = new Reward("Travel Mug", nextRewardID, 10);
        incrementNextRewardID();
        Reward r4 = new Reward("Free bag of coffee", nextRewardID, 10);
        incrementNextRewardID();
        
        rewardList.add(r1);
        rewardList.add(r2);
        rewardList.add(r3);
        rewardList.add(r4);
    }
    
    /**
     * Adds a new reward
     */
    public int addReward(String name, int amount){
        Reward temp = new Reward(name, nextRewardID, amount);
        incrementNextRewardID();
        rewardList.add(temp);
        return temp.getID();
    }
    
    /**
     * Removes an existing reward
     */
    public boolean removeReward(int ID){
        boolean removed = false;
        for(Reward rew : rewardList){
            if(ID == rew.getID()){
                rewardList.remove(rew);
                removed = true;
            } else {
                removed = false;
            }
        }
        return removed;
    }
    
    /**
     * Adds one to nextRewardID
     */
    public static void incrementNextRewardID(){
        nextRewardID++;
    }
    
    /**
     * Prints the entirety of rewardList
     */
    public void printInfo(){
        for(Reward r : rewardList){
            System.out.println("\n" + r);
        }
    }
    
    /**
     * Allows a member to choose a reward if they have 300 points
     */
    public void chooseReward(int i){
        if(i > 900 && i < rewardList.get(rewardList.size() - 1).getID()){
            for(Reward r : rewardList){
                if(i == r.getID()){
                    if(r.getStock() > 0){
                        r.setStock(r.getStock() - 1);
                        System.out.println("Item chosen: " + r.getName());
                    } else {
                        System.out.println("Sorry, there is none of this item left, please choose another.");
                    }                   
                }
            }
        } else {
            System.out.println("Error: Enter valid reward ID.");
        }
    }
    
    /**
     * Allows a member to receive a random reward if they have 150 points
     */
    public void randomReward(){
        int i = ((int) (Math.random() * (rewardList.size() - 1)));
        System.out.println("Congratulations! You have won a " + rewardList.get(i).getName() + "!");
    }
}
