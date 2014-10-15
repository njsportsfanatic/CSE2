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
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        int nStars = 10;
        int counter = 0;
        
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
        
        System.out.print("Enter an int between 1 and 15- ");
        nStars = myScanner.nextInt();
        
        
    }
    
}