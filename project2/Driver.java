/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Garrett
 * @version 4.2.22
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        MemberList memList = new MemberList();
        InventoryList invList = new InventoryList();
        RewardsList rewList = new RewardsList();
        CafeList cafeList = new CafeList();
        boolean var = true;
        
        while (var){
            System.out.println("********");
            System.out.println("Welcome! Please enter the # of the functionality would you like to use today.");
            System.out.println("1. Member" + "\r\n2. Cafe" + "\r\n3. Inventory" + "\r\n4. Rewards" + "\r\n5. Exit");
            int input = scnr.nextInt();

            switch(input){

                //Member information
                case 1:
                    System.out.println("********");
                    System.out.println("\nPlease select which Member functionality you would like to use.");
                    System.out.println("1. Add a new Member");
                    System.out.println("2. Remove a Member");
                    System.out.println("3. Get Member information");
                    System.out.println("4. Exit");

                    int mem = scnr.nextInt();

                    System.out.println("********");
                    switch (mem){

                        //Add a Member
                        case 1:
                            String first;
                            double spent;
                            System.out.println("Please enter the following:" + "\r\nFirst Name: ");
                            first = scnr.next();
                            System.out.println("Total spent:");
                            spent = scnr.nextDouble();

                            memList.add(first, spent, 0);
                            System.out.println("********");
                            break;

                        //Remove a Member    
                        case 2:
                            int memID;
                            System.out.println("Please enter the ID number of the Member you would like to remove.");
                            memID = scnr.nextInt();
                            if(memID > 0){
                                memList.remove(memID);
                                if(memList.remove(memID) == false){
                                    System.out.println("Member has been removed.");
                                } else {
                                    System.out.println("Cannot find member ID.");
                                }
                            } else {
                                System.out.println("Error: Invalid member ID");
                                break;
                            }
                            System.out.println("********");
                            break;

                        //Get all Member information
                        case 3:
                            memList.printInfo();
                            System.out.println("********");
                            break;

                        //Exit
                        case 4:
                            break;

                        default:
                            System.out.println("Enter a valid number.");
                    }
                    break;
                //Order functions
                case 2:
                    System.out.println("********");
                    System.out.println("Please select which Order function you would like to use.");
                    System.out.println("1. Make an order");
                    System.out.println("2. Cancel an order");
                    System.out.println("3. Check on an order");
                    System.out.println("4. Print all pending orders");
                    System.out.println("5. Exit");

                    int ord = scnr.nextInt();

                    System.out.println("********");
                    
                    switch (ord) {
                        
                        //Make an order and add reward points
                        case 1:
                            int numS;
                            int numC;
                            int numTS;
                            int numCS;
                            int numCL;
                            int numT;
                            int memID;
                            System.out.println("Please enter the amount of each item you would like.");
                            System.out.println("Scone: ");
                            numS = scnr.nextInt();
                            System.out.println("Croissant: ");
                            numC = scnr.nextInt();
                            System.out.println("Tuna Sandwich: ");
                            numTS = scnr.nextInt();
                            System.out.println("Small Coffee (8oz): ");
                            numCS = scnr.nextInt();
                            System.out.println("Large Coffee (12oz): ");
                            numCL = scnr.nextInt();
                            System.out.println("Tea: ");
                            numT = scnr.nextInt();
                            System.out.println("Please enter your member ID number.");
                            memID = scnr.nextInt();
                            memList.addPoints(cafeList.newOrder(numS, numC, numTS, numCS, numCL, numT), memID);
                            invList.subtractStock(numS, numC, numTS, numCS, numCL, numT);
                            System.out.println("********");
                            break;
                            
                        //Cancel an order
                        case 2:
                            int orderID;
                            System.out.println("Please enter your order number to be cancelled.");
                            orderID = scnr.nextInt();
                            cafeList.cancelOrder(orderID);
                            System.out.println("********");
                            break;
                            
                        //Check on an order
                        case 3:
                            System.out.println("Please enter your order number to be checked.");
                            orderID = scnr.nextInt();
                            cafeList.checkOrder(orderID);
                            System.out.println("********");
                            break;
                            
                        //Print all pending orders
                        case 4:
                            cafeList.printInfo();
                            System.out.println("********");
                            break;
                           
                        //Exit    
                        case 5:
                            break;
                            
                        default:
                            System.out.println("Enter a valid number.");
                    }
                    break;
                    
                //Inventory functions
                case 3:
                    System.out.println("********");
                    System.out.println("Please select which Inventory function you would like to use.");
                    System.out.println("1. Stock food item(s)");
                    System.out.println("2. Stock beverage item(s)");
                    System.out.println("3. Check food stock");
                    System.out.println("4. Check beverage stock");
                    System.out.println("5. Exit");

                    int inv = scnr.nextInt();

                    System.out.println("********");

                    switch (inv){

                        //Stock food function
                        case 1:
                            int tempID;
                            int stockAmt;
                            System.out.println("Please enter the ID of the food product.");
                            tempID = scnr.nextInt();
                            System.out.println("Please enter the new stock amount.");
                            stockAmt = scnr.nextInt();
                            invList.stockFood(tempID, stockAmt);
                            System.out.println("********");
                            break;

                        //Stock beverage function    
                        case 2:
                            System.out.println("Please enter the ID of the beverage product.");
                            tempID = scnr.nextInt();
                            System.out.println("Please enter the new stock amount.");
                            stockAmt = scnr.nextInt();
                            invList.stockBeverage(tempID, stockAmt);
                            System.out.println("********");
                            break;

                        //Check food stock    
                        case 3:
                            invList.printFoodStock();
                            System.out.println("********");
                            break;

                        //Check beverage stock    
                        case 4:
                            invList.printBevStock();
                            System.out.println("********");
                            break;
                        
                        //Exit    
                        case 5:
                            break;
                            
                        default:
                            System.out.println("Enter a valid number.");
                    }
                    break;
                    
                //Reward functions
                case 4:
                    System.out.println("********");
                    System.out.println("Please select which Rewards function you would like to use.");
                    System.out.println("1. Spin for a random reward (Costs 150 points");
                    System.out.println("2. Choose a reward (Costs 300 points)");
                    System.out.println("3. Add a new reward");
                    System.out.println("4. Remove a reward");
                    System.out.println("5. Print reward choices");
                    System.out.println("6. Exit");
                    
                    int rew = scnr.nextInt();
                    
                    System.out.println("********");
                    
                    switch (rew){
                        
                        //Allows user to choose a random reward
                        case 1:
                            int memID;
                            System.out.println("Please enter the following information.");
                            System.out.println("Member ID: ");
                            memID = scnr.nextInt();
                            if(memList.checkRandomPoints(memID) == true){;
                                rewList.randomReward();
                                memList.subtractPoints(150, memID);
                            } else {
                                System.out.println("Error: Invalid number of reward points.");
                            }
                            System.out.println("********");
                            break;
                        
                        //Allows user to choose the reward they want  
                        case 2:
                            int rewID;
                            System.out.println("Please enter the following information.");
                            System.out.println("Member ID: ");
                            memID = scnr.nextInt();
                            if(memList.checkChoosePoints(memID) == true){;
                                System.out.println("Reward ID: ");
                                rewID = scnr.nextInt();
                                rewList.chooseReward(rewID);
                                memList.subtractPoints(300, memID);
                            } else {
                                System.out.println("Error: Invalid number of reward points.");
                            }
                            System.out.println("********");
                            break;
                        
                        //Adds a new reward
                        case 3:
                            String name;
                            int amount;
                            System.out.println("Please enter the following information.");
                            System.out.println("Name of reward: ");
                            name = scnr.next();
                            System.out.println("Stock of reward: ");
                            amount = scnr.nextInt();
                            rewList.addReward(name, amount);
                            System.out.println("********");
                            break;
                           
                        //Removes a reward
                        case 4:
                            
                            System.out.println("Please enter the following information.");
                            System.out.println("ID of reward: ");
                            rewID = scnr.nextInt();
                            rewList.removeReward(rewID);
                            System.out.println("********");
                            break;
                            
                        //Prints a list of rewards
                        case 5:
                            rewList.printInfo();
                            System.out.println("********");
                            break;
                            
                        //Exit
                        case 6:
                            break;
                            
                        default:
                            System.out.println("Enter a valid number.");
                    }
                    break;
                    
                    
                case 5:
                    var = false;
                    break;
                    
                default:
                    System.out.println("Enter a valid number.");
            }
        }
       
        
    }
    
}
