/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;
import java.util.Scanner;
/**
 *
 * @author chinonsoobidike
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare necessary variables
      int sales=0, sales1=0, sales2=0, sales3=0, sales4=0, sales5=0;
      Scanner keyboard = new Scanner(System.in);
      
      //Get the sales value for each store
      for(int i = 1; i <=5; i++)
      { 
         System.out.print("Enter today's sales for store "+ i+ ": ");
         sales = keyboard.nextInt();
         if(i == 1)
         sales1 = sales;
         else if(i == 2)
         sales2 = sales;
         else if(i == 3)
         sales3 = sales;
         else if(i == 4)
         sales4 = sales;
         else
         sales5 = sales;
         keyboard.nextLine();//consume the remaining newline character
      }
      System.out.println("SALES BAR CHART");//Title of the output
      
      //Assign the sales value of the different stores to the sales variable for iteration
      for(int c = 1; c <= 5; c++)
      {
        switch (c)
         {
           case 1:
             sales = sales1/100;
             break;
           case 2:
             sales = sales2/100;
             break;
           case 3:
             sales = sales3/100;
             break;
           case 4:
             sales = sales4/100;
             break;
           case 5:
             sales = sales5/100;
             break;
         }
         
        System.out.print("Store " + c +": ");
        //Iterater through each store sales value to print out the star bars
        for(int k = 0; k < sales; k++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }   
    }
    
}
