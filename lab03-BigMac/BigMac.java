//Mark Quentzel
//September 12, 2014
//CSE002
//Big Mac Java Program

//take input from user and use the data to make basic computations

import java.util.Scanner;

//  define a class
public class BigMac{
    
//  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        //creates variables for what user puts in scanner
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want proportion
        
        double cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fradction dollars= (int) cost$;
        //get dimes amount,e.g., 
        //(int)(6.73 *10) % 10 -> 67 % 10 -> 7 where the % (mod) operator returns the remainder 
        //after the division: 583%100 -> 83, 27%5 -> 2
        int dollars= (int) cost$; //whole dollar amount of cost dimes, pennies; for storing digits to the right of the decimal point for the cost$
        int dimes = (int) (cost$*10) % 10;
        int pennies = (int) (cost$*100) % 10;
        System.out.println("The total cost of " + nBigMacs + " Big Macs, at $" + bigMac$ +" per bigMac, with a sales tax of "+ (int)(taxRate*100) + "%, is $" + dollars + '.' + dimes + pennies);
        
        
        
    }//end of main method
    
}//end of class