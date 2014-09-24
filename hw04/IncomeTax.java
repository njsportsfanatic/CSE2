//Mark Quentzel
//September 23, 2014
//CSE002
//Income Tax Java Program

//prompt user to enter an int that gives the thousands of dollars of income and then writes out the amount of tax on the income

import java.util.Scanner;
import java.text.DecimalFormat;

//  define a class
public class IncomeTax{
    
//  add main method
    public static void main(String[] args) {
        
        DecimalFormat d = new DecimalFormat("0.0");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        //creates variables for what user puts in scanner
        System.out.print("Enter an int giving the number of thousands- ");
        double taxPercent1, taxPercent2, taxPercent3, taxPercent4;
        
        if (myScanner.hasNextInt())
        {
            int nThousands = myScanner.nextInt();
            
            if (nThousands < 0)
            {
                //doesn't work with negative int
                System.out.println("You did not enter a positive int");
            }
        
            //calculates and prints taxes for different incomes
            
            else if (nThousands >= 0 && nThousands < 20)
            {
                taxPercent1 = 0.05;
                System.out.println("The tax rate on $" + nThousands*1000 + " is " + d.format(taxPercent1*100) + "%, and the tax is $" + d.format(nThousands*1000 * taxPercent1));
            }
        
            else if (nThousands >= 20 && nThousands < 40)
            {   
                taxPercent2 = 0.07;
                System.out.println("The tax rate on $" + nThousands*1000 + " is " + d.format(taxPercent2*100) + "%, and the tax is $" + d.format(nThousands*1000 * taxPercent2));
            }
        
            else if (nThousands >= 40 && nThousands < 78)
            {
                taxPercent3 = 0.12;
                System.out.println("The tax rate on $" + nThousands*1000 + " is " + d.format(taxPercent3*100) + "%, and the tax is $" + d.format(nThousands*1000 * taxPercent3));
            }
            
            else if (nThousands >= 78)
            {
                taxPercent4 = 0.14;
                System.out.println("The tax rate on $" + nThousands*1000 + " is " + d.format(taxPercent4*100) + "%, and the tax is $" + d.format(nThousands*1000 * taxPercent4));
            }
        }
        else
        {
            //doesn't work without integer
            System.out.println("You did not enter an int");
        }
        
        
    }
    
}