//Mark Quentzel
//October 14, 2014
//CSE002
//Root Java Program 

//use loops to create a root program

import java.util.Scanner;

// define a class 
public class Root{

// add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        double x = myScanner.nextDouble();
        
        //create variables for low, middle, and high
        double low = 0;
        double middle;
        double high = 1 + x;
        
        //create while loop
        while(true){ 
            middle = ((low + high)/2); //get middle of interval
            
            if((middle*middle)>x){ //algorithm
                high = middle;
            }
            else {
                low = middle;
            }
            
            if ((high-low)<(0.0000001*(1+x))){ //checks if square root is accurate enough
                break; //leaves loop
            }
        
        }
        
        System.out.print("The square root is: " + middle); //prints calculated middle
    }
    
}