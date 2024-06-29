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
public class Beverage extends Product{
    protected int size;
    
    /**
     * Constructor
     */
    public Beverage(String t, double p, int s, int i, int r, int sz){
        super(t, p, s, i, r);
        size = sz;
    }
    
    /**
     * Default constructor
     */
    public Beverage(){
        super();
    }
    
    /**
     * Returns size
     */
    public int getSize(){
        return this.size;
    }
    
    /**
     * Manually sets Size
     */
    public void setSize(int sz){
        this.size = sz;
    }
    
    @Override
    public String toString(){
        return "Type: " + this.type + 
                "\nPrice : $" + this.price +
                "\nStock: " + this.stock +
                "\nID Number: " + this.prodID +
                "\nRewards Points: " + this.rewardPoints +
                "\nSize: " + this.size + "oz";
    }
    
}
