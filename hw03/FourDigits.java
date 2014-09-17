//Mark Quentzel
//September 16, 2014
//CSE002
//Four Digits Java Program

//take input as a double from the user and display four digits after decimal place

import java.util.Scanner;
import java.text.DecimalFormat;

//  define a class
public class FourDigits{
    
//  add main method
    public static void main(String[] args) {
        
        DecimalFormat d = new DecimalFormat("0000");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double randDouble = myScanner.nextDouble(); //inputted double
        
        int randInt = (int) randDouble; //cast inputted double to int
        int randDouble1 = (int) (10000 * (randDouble - randInt)); //calculations to get individual digits
        
        System.out.println("The four digits are " + d.format(randDouble1)); 
        
    }
    
}