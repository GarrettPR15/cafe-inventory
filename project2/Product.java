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
public class Product {
    protected String type;
    protected double price;
    protected int stock;
    protected int prodID;
    protected int rewardPoints;
    
    /**
     * Constructor
     */
    public Product(String t, double p, int s,int i, int r){
        type = t;
        price = p;
        stock = s;
        prodID = i;
        rewardPoints = r;
    }
    
    /**
     * Default constructor
     */
    public Product(){
        type = "";
        price = 0;
        stock = 0;
        prodID = 0;
        rewardPoints = 0;
        
    }
    
    /**
     * Returns type
     */
    public String getType(){
        return this.type;
    }
    
    /**
     * Manually sets type
     */
    public void setType(String t){
        this.type = t;
    }
    
    /**
     * Returns price
     */
    public double getPrice(){
        return this.price;
    }
    
    /**
     * Manually sets price
     */
    public void setPrice(double p){
        this.price = p;
    }
    
    /**
     * Returns stock
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Manually sets stock
     */
    public void setStock(int s){
        this.stock = s;
    }
    
    /**
     * Returns product ID
     */
    public int getProdID(){
        return this.prodID;
    }
    
    /**
     * Manually sets product ID 
     */
    public void setProdID(int num){
        this.prodID = num;
    }
    
    /**
     * Returns reward points
     */
    public int getPoints(){
        return this.rewardPoints;
    }
    
    /**
     * Manually sets reward points
     */
    public void setPoints(int r){
        this.rewardPoints = r;
    }
    
    @Override
    public String toString(){
        return "Type: " + this.type + 
                "\nPrice : $" + this.price +
                "\nStock: " + this.stock +
                "\nID Number: " + this.prodID +
                "\nRewards Points: " + this.rewardPoints;
    }
}
