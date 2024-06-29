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
public class Reward{
    protected String name;
    protected int id;
    protected int stock;
    
    /**
     * Reward constructor
     */
    public Reward(String n, int i, int s){
        name = n;
        id = i;
        stock = s;
    }
    
    /**
    * Default constructor
    */
    public Reward(){
        name = "";
        id = 0;
        stock = 0;
    }
    
    /**
     * Returns reward's name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Manually sets name
     */
    public void setName(String n){
        this.name = n;
    }
    
    /**
     * Returns the reward's ID number
     */
    public int getID(){
        return this.id;
    }
    
    /**
     * Manually sets the reward's ID number
     */
    public void setID(int i){
        this.id = i;
    }
    
    /**
     * Returns the reward's stock
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Manually sets the reward's stock
     */
    public void setStock(int s){
        this.stock = s;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name +
                "\nID: " + this.id +
                "\nStock: " + this.stock;
    }
    
}
