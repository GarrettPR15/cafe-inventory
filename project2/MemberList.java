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
public class MemberList implements List {
    private static int nextMemberID = 1;
    
    public ArrayList<Member> memberList = new ArrayList<Member>();
    
    /**
     * Default constructor for the member list
     */
    public MemberList(){
        Member temp1 = new Member("Kanye", 50.0, nextMemberID, 450);
        incrementNextMemberID();
        Member temp2 = new Member("Taylor", 45.5, nextMemberID, 300);
        incrementNextMemberID();
        Member temp3 = new Member("Garrett", 99.5, nextMemberID, 1000);
        incrementNextMemberID();

        memberList.add(temp1);
        memberList.add(temp2);
        memberList.add(temp3);
    }
    
    /**
     * Adds a new member
     */
    @Override
    public int add(String n, double t, int num){
        Member x = new Member(n, t, nextMemberID, num);
        memberList.add(x);
        incrementNextMemberID();
        return x.getID();
    }
    
    /**
     * Returns the next member ID
     */
    public static int getNextMemberID(){
        return nextMemberID;
    }
    
    /**
     * Adds one to the next member ID
     */
    public static void incrementNextMemberID(){
        nextMemberID++;
    }
     
    /**
     * Removes a member based on the ID number passed in
     */
    @Override
    public boolean remove(int memID){
        boolean removed = false;
        for(Member mem : memberList){
            if(memID == mem.getID()){
                memberList.remove(mem);
                removed = true;
            } else {
                removed = false;
            }
        }
        return removed;
    }
    
    /**
     * Adds a certain amount of reward points to a member
     */
    public int addPoints(int amt, int id){
        int tempRew = 0;
        for(Member mem : memberList){
            if(id == mem.getID()){
                mem.setRewards(mem.getRewards() + amt);
                tempRew = mem.getRewards();
            }
        }
        System.out.println("Remaining points: " + tempRew);
        return tempRew;
    }
    
    /**
     * Subtracts a certain amount of reward points from a member
     */
    public int subtractPoints(int amt, int id){
        int tempRew = 0;
        for(Member mem : memberList){
            if(id == mem.getID()){
                mem.setRewards(mem.getRewards() - amt);
                tempRew = mem.getRewards();
            }
        }
        System.out.println("Remaining points: " + tempRew);
        return tempRew;
    }
    
    /**
     * Checks to see if a member has 150 reward points
     */
    public boolean checkRandomPoints(int id){
        boolean temp = true;
        for(Member mem : memberList){
            if(id == mem.getID()){
                if(mem.getRewards() >= 150){
                    temp = true;
                } else {
                    temp = false;
                }
            }
        }
        return temp;
    }
    
    /**
     * Checks to see if a member had 300 reward points
     */
    public boolean checkChoosePoints(int id){
        boolean temp = true;
        for(Member mem : memberList){
            if(id == mem.getID()){
                if(mem.getRewards() >= 300){
                    temp = true;
                } else {
                    temp = false;
                }
            }
        }
        return temp;
    }
    
    /**
     * Prints the entire member list
     */
    public void printInfo(){
        for(Member i: memberList){
            System.out.println("\n" + i);
        }
    }
}
