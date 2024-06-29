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
public class CafeList extends InventoryList{
    private static int nextOrderNum = 1001;
    
    ArrayList<CafeOrder> orderList = new ArrayList();
    
    /**
     * Default Constructor
     */
    public CafeList(){
        CafeOrder c1 = new CafeOrder(2, 3, 1, 0, 2, 4, nextOrderNum);
        incrementNextOrderNum();
        CafeOrder c2 = new CafeOrder(1, 1, 1, 1, 1, 1, nextOrderNum);
        incrementNextOrderNum();
        CafeOrder c3 = new CafeOrder(0, 0, 0, 0, 0, 1, nextOrderNum);
        incrementNextOrderNum();
        
        orderList.add(c1);
        orderList.add(c2);
        orderList.add(c3);
    }
    
    
    /**
     * Creates and adds an order to the orderList
     */
    public int newOrder(int num1, int num2, int num3, int num4, int num5, int num6){
        CafeOrder temp = new CafeOrder(num1, num2, num3, num4, num5, num6, nextOrderNum);
        incrementNextOrderNum();
        orderList.add(temp);
        System.out.println(temp);
        return temp.getTotalReward();
    }
    
    /**
     * Cancels a certain order number
     */
    public void cancelOrder(int num){
        if(num > 1000 && num < orderList.get(orderList.size() - 1).getOrderNum()){
            for(CafeOrder c : orderList){
                if(num == c.getOrderNum() + 1){
                    orderList.remove(c);
                    System.out.println("Order successfully cancelled!");
                }
            }
        } else {
            System.out.println("Cannot find order number in system.");
        }
    }
    
    /**
     * Checks if order number is in orderList
     */
    public void checkOrder(int num){
        if(num > 1000 && num < orderList.get(orderList.size() - 1).getOrderNum()){
            for(CafeOrder c : orderList){
                if(num == c.getOrderNum() + 1){
                    System.out.println("Order is still in the kitchen.");
                }
            }
        } else {
            System.out.println("Cannot find order number. Order may have already been picked up.");
        }
    }
    
    /**
     * Adds one to nextOrderNum
     */
    public static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    /**
     * Prints entire orderList
     */
    public void printInfo(){
        for (CafeOrder x : orderList){
            System.out.println("\n" + x);
        }
    }
}
