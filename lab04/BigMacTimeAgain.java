//Mark Quentzel
//September 19, 2014
//CSE002
//Big Mac Java Program 

//take input from user and use the data to make basic computations 

import java.util.Scanner; 

// define a class 
public class BigMacAgain{

// add main method
    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //creates variables for what user puts in scanner
        System.out.print("Enter the number of Big Macs: ");
        if(myScanner.hasNextInt())
                int nBigMacs = myScanner.nextInt();
        else{ System.out.println("You did not enter an int");
                return; //leaves the program, i.e. the program terminates
             }
        if(myScanner.hasNextInt>0())
                int nBigMacs = myScanner.nextInt();
        else{ System.out.println("You did not enter an int > 0");
                return;
             }
        int nBigMacs = myScanner.nextInt();
        System.out.print("Do you want an order of fries (Y/y/N/n)?: ");

        int fries;
        String answer=myScanner.next();
        if(answer.equals("Y"), answer.equals("y"), answer.equals("N"), answer.equals("n"))
        
        else { System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                return;
             }
        
        if(answer.equals("Y"), answer.equals("y"))
                int fries = myScanner.nextInt();
                System.out.println("You ordered fries at a cost of $2.15);
                
                