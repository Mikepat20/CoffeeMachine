/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeevendingmachine;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class CoffeeVendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in = new Scanner(System.in);
     System.out.println("Enter Rand value (8.50;): ");
     double randValue = in.nextDouble();
     
                   
        
    double money = 0.0;               // declared money variable
    money = acceptMoney();            // assign value for money (accept money a method
    if(isMoneyEnough(money))          //method with a boolean data type
    {
            dispenseCoffee();
    }
    else
    {
        notify("Money not enough");
          System.out.println("Money not enough");
    }
    if(money > 8.50)
    {
        System.out.println("\nYour change is" + issueChange(money) + " : Rands ");
             
    }
    
    }
    public static double acceptMoney()     //method
    {
        Scanner input= new Scanner(System.in);  // declare scanner class               
        
        double payAmount = 0.0;
        System.out.println("Enter money:");
        payAmount = input.nextDouble();
    
        return payAmount;
    
    }
  public static boolean isMoneyEnough(double myMoney)  
  {
      if(myMoney > 8.50)
      {
          return true;
           }
 else
      {
          return false;
      }
                 
      }
  public static void dispenseCoffee()
          {
              System.out.println("Coffee is served");
          }
  public static void notify(String message)
  {
      System.out.println("message");
  }
          
       public static double issueChange(double payment)   
       {
           double change = 0.0;
           change = payment - 8.50;
           
           return change;
           
       }
          
          
          
          
          
          
          
          
          
          
          
          