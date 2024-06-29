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
public class CafeOrder extends InventoryList{
    public int scone;
    public int croissant;
    public int tuna;
    public int coffeeS;
    public int coffeeL;
    public int tea;
    protected double total;
    protected int totalReward;
    protected int orderNum;
    
    /**
     * Constructor
     */
    public CafeOrder(int s, int c, int t, int c1, int c2, int t1, int num){
        scone = s;
        croissant = c;
        tuna = t;
        coffeeS = c1;
        coffeeL = c2;
        tea = t1;
        orderNum = num;
        
        total = (s * foodList.get(0).getPrice()) + (c * foodList.get(1).getPrice()) 
                + (t * foodList.get(2).getPrice()) + (c1 * bevList.get(0).getPrice())
                + (c2 * bevList.get(1).getPrice()) + (t1 * bevList.get(2).getPrice()); 
        
        total = ((int) (total * 100)) / 100;
        
        totalReward = (s * foodList.get(0).getPoints()) + (c * foodList.get(1).getPoints()) 
                + (t * foodList.get(2).getPoints()) + (c1 * bevList.get(0).getPoints())
                + (c2 * bevList.get(1).getPoints()) + (t1 * bevList.get(2).getPoints());
        
    }
    
    /**
     * Default Constructor
     */
    public CafeOrder(){
        scone = 0;
        croissant = 0;
        tuna = 0;
        coffeeS = 0;
        coffeeL = 0;
        tea = 0;
        orderNum = 0;
        total = 0;
        totalReward = 0;
    }
    
    /**
     * Returns number of Scones
     */
    public int getScone(){
        return this.scone;
    }
    
    /**
     * Manually sets number of Scones
     */
    public void setScone(int x){
        this.scone = x;
    }
    
    /**
     * Returns number of Croissants
     */
    public int getCroissant(){
        return this.croissant;
    }
    
    /**
     * Manually sets number of Croissants
     */
    public void setCroissant(int x){
        this.croissant = x;
    }
    
    /**
     * Returns number of Tuna Sandwiches
     */
    public int getTuna(){
        return this.tuna;
    }
    
    /**
     * Manually sets number of Tuna Sandwiches
     */
    public void setTuna(int x){
        this.tuna = x;
    }
    
    /**
     * Returns number of Small Coffees
     */
    public int getCoffeeS(){
        return this.coffeeS;
    }
    
    /**
     * Manually sets number of Small Coffees
     */
    public void setCoffeeS(int x){
        this.coffeeS = x;
    }
    
    /**
     * Returns number of Large Coffees
     */
    public int getCoffeeL(){
        return this.coffeeL;
    }
    
    /**
     * Manually sets number of Large Coffees
     */
    public void setCoffeeL(int x){
        this.coffeeL = x;
    }
    
    /**
     * Returns number of Teas
     */
    public int getTea(){
        return this.tea;
    }
    
    /**
     * Manually sets number of teas
     */
    public void setTea(int x){
        this.tea = x;
    }
    
    /**
     * Returns total
     */
    public double getTotal(){
        return this.total;
    }
    
    /**
     * Manually sets total
     */
    public void setTotal(double x){
        this.total = x;
    }
    
    /**
     * Returns total reward points
     */
    public int getTotalReward(){
        return this.totalReward;
    }
    
    /**
     * Manually sets total reward points
     */
    public void setTotalReward(int x){
        this.totalReward = x;
    }
    
    /**
     * Returns order number
     */
    public int getOrderNum(){
        return this.orderNum;
    }
    
    /**
     * Manually sets order number
     */
    public void setOrderNum(int x){
        this.orderNum = x;
    }
    
    @Override
    public String toString(){
        return "Scone(s): " + this.scone + 
                "\nCroissant(s): " + this.croissant +
                "\nTuna Sandwiche(s): " + this.tuna +
                "\nSmall Coffee(s): " + this.coffeeS +
                "\nLarge Coffee(s): " + this.coffeeL +
                "\nTea(s): " + this.tea +
                "\nTotal Rewards: " + this.totalReward +
                "\nTotal: $" + this.total +
                "\nOrder Number: " + this.orderNum;
                
    }    
}
