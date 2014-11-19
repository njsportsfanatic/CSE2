//Mark Quentzel
//October 10, 2014
//CSE002
//Loop The Loop Java Program 

//write while loops and break statements

import java.util.Scanner;

// define a class 
public class LoopTheLoop{

// add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        
        
        int nStars = -1;
        int counter = 0;/*
        while(nStars>=1 && nStars<=15){
            System.out.print("Enter an int between 1 and 15- ");
            while(myScanner.!hasNextInt()){
                System.out.print("Enter an int between 1 and 15- ");
                Scanner myScanner = new Scanner(System.in);
                if(myScanner.hasNextInt()){
                    break;
                }
            }
        }
        */
        nStars = 10;
        counter = 0;
        
        while(nStars > counter){
            System.out.print("*");
            counter++;
        }
        
        counter = 0;
        System.out.println();
        while(counter <= nStars){
            counter++;
            int counter2 = 0;
            while(counter > counter2){
                System.out.print("*");
                counter2++;
            }
            
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}