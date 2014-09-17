//Mark Quentzel
//September 16, 2014
//CSE002
//Root Java Program

//take input from user and calculate cube root of a double

import java.util.Scanner;

//  define a class
public class Root{
    
//  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double, and I print its cube root- ");
        double X = myScanner.nextDouble(); //the inputted double
        //estimate cube root of number with multiple guesses
        double guess = X/3; 
        double guess1 = (2*guess*guess*guess+X)/(3*guess*guess);
        double guess2 = (2*guess1*guess1*guess1+X)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+X)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+X)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+X)/(3*guess4*guess4);
        
        System.out.println("The cube root is " + guess5 + ":"); //print out the output data
        
        double cubeResult=guess5*guess5*guess5; //calculate cube of the cube root
        
        System.out.println(guess5 + "*" + guess5 + "*" + guess5 + " = " + cubeResult); //print out the output data
        
        
        
        
    }
    
}