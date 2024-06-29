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
public class InventoryList{
    private static int nextFoodID = 101;
    private static int nextBevID = 201;
    
    public ArrayList<Food> foodList = new ArrayList();
    public ArrayList<Beverage> bevList = new ArrayList();
    
    /**
     * Default constructor
     */
    public InventoryList(){
        Food f1 = new Food("Scone", 1.5, 30, nextFoodID, 10);
        incrementNextFoodID();
        Food f2 = new Food("Croissant", 1.0, 50, nextFoodID, 5);
        incrementNextFoodID();
        Food f3 = new Food("Tuna Sandwich", 5.0, 20, nextFoodID, 50);
        incrementNextFoodID();
        Beverage b1 = new Beverage("8oz Coffee", .75, 50, nextBevID, 5, 8);
        incrementNextBevID();
        Beverage b2 = new Beverage("12oz Coffee", 1.25, 25, nextBevID, 10, 12);
        incrementNextBevID();
        Beverage b3 = new Beverage("Tea", 1.0, 35, nextBevID, 10, 12);
        incrementNextBevID();
        
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        bevList.add(b1);
        bevList.add(b2);
        bevList.add(b3);
    }
    
    /**
     * Changes the stock amount of a certain food object
     */
    public void stockFood(int id, int amt){
        if(amt > 100 && amt <= foodList.get(foodList.size() - 1).getProdID()){
            for(Food temp : foodList){
                if(id == temp.getProdID()){
                    temp.setStock(amt);
                    System.out.println(amt + " " + temp.getType() + " successfully stocked.");
                }
            }           
        } else {
            System.out.println("Error: Invalid food product ID");
        }
    }
    
    /**
     * Changes the stock amount of a certain beverage object
     */
    public void stockBeverage(int id, int amt){
        if(amt > 100 && amt <= bevList.get(bevList.size() - 1).getProdID()){
            for(Beverage temp : bevList){
                if(id == temp.getProdID()){
                    temp.setStock(amt);
                    System.out.println(amt + " " + temp.getType() + " successfully stocked.");
                }
            }           
        } else {
            System.out.println("Error: Invalid beverage product ID");
        }
    }
    
    /**
     * Prints the entire food list
     */
    public void printFoodStock(){
        for(Food food : foodList){
            System.out.println("\n" + food);
        }
    }
    
    /**
     * Prints the entire beverage list
     */
    public void printBevStock(){
        for(Beverage bev : bevList){
            System.out.println("\n" + bev);
        }
    }
    
    /**
     * Takes away certain amounts of each product
     */
    public void subtractStock(int a, int b, int c, int d, int e, int f){
        foodList.get(0).setStock(foodList.get(0).getStock() - a);
        foodList.get(1).setStock(foodList.get(1).getStock() - b);
        foodList.get(2).setStock(foodList.get(2).getStock() - c);
        bevList.get(0).setStock(bevList.get(0).getStock() - d);
        bevList.get(1).setStock(bevList.get(1).getStock() - e);
        bevList.get(2).setStock(bevList.get(2).getStock() - f);
    }
    
    /**
     * Adds one to next food ID
     */
    public static void incrementNextFoodID(){
        nextFoodID++;
    }
    
    /**
     * Adds one to next beverage ID
     */
    public static void incrementNextBevID(){
        nextBevID++;
    }
}
