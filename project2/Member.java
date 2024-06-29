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
public class Member extends Person {
    protected int memberID;
    protected int points;
    public static int tempID = 1;
    
    ArrayList<Member> memberList = new ArrayList();
    
    /**
     * Member constructor
     */
    public Member(String n, double t, int ID, int p){
        super(n, t);
        memberID = ID;
        points = p;
        incrementID();
    }
    
    /**
     * Default constructor
     */
    public Member(){
        super();
        memberID = 0;
        points = 0;
    }
    
    /**
     * Returns member's ID number
     */
    public int getID(){
        return this.memberID;
    }
    
    /**
     * Manually sets the member's ID number
     */
    public void setID(int num){
        this.memberID = num;
    }
    
    /**
     * Returns member's reward points
     */
    public int getRewards(){
        return this.points;
    }
    
    /**
     * Manually sets member's reward points
     */
    public void setRewards(int p){
        this.points = p;
    }
    
    /**
     * Increases tempID by one
     */
    public static void incrementID(){
        tempID++;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name +
                "\nTotal Spent: $" + this.totalSpent +
                "\nID number: " + this.memberID +
                "\nPoints: " + this.points;
    }
}
