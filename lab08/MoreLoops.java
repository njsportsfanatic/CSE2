//Mark Quentzel
//October 17, 2014
//CSE002
//More Loops Java Program 

//use knowledge of loops to rewrite loops as other loops

import java.util.Scanner;

// define a class 
public class MoreLoops{

// add main method
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int n=0;

        /*System.out.print("Enter an int- ");
        while(!scan.hasNextInt()){
            scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
        }*/
        
        do{
            System.out.print("Enter an int- ");
            do{
                scan.next();
                while(!scan.hasNextInt()){
                    System.out.print("You did not enter an int; try again- ");
                }
            }while(scan.hasNextInt());
            
                
        }while(true);

        
        
        
    }
    
}