/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Garrett
 * @version 4.2.22
 */
public class Person {
    protected String name;
    protected double totalSpent;
    
    /**
     * Person constructor
     */
    public Person(String n, double t){
        name = n;
        totalSpent = t;

    }
    
    /**
     * Default constructor
     */
    public Person(){ 
        name = "";
        totalSpent = 0;
    }
    
    /**
     * Returns the person's name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Sets the person's name manually
     */
    public void setName(String n){
        this.name = n;
    }
    
    /**
     * Returns the total spent by the person
     */
    public double getTotal(){
        return this.totalSpent;
    }
    
    /**
     * Manually sets the total spent by the person
     */
    public void setTotalSpent(double x){
        this.totalSpent = x;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + 
                "\nTotal Spent: $" + this.totalSpent;
    }
}
