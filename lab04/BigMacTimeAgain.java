//Mark Quentzel
//September 19, 2014
//CSE002
//Big Mac Java Program 

//take input from user and use the data to make basic computations 

import java.util.Scanner; 
import java.text.DecimalFormat;

// define a class 
public class BigMacTimeAgain{

// add main method
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("00.00");
        //creates variables for what user puts in scanner
        
        System.out.print("Enter the number of Big Macs: ");
        if(myScanner.hasNextInt()){
                int nBigMacs = myScanner.nextInt();
                if(nBigMacs>0){
                        System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of " + nBigMacs + "x2.22 = $" + nBigMacs*2.2);
                        System.out.print("Do you want an order of fries (Y/y/N/n)?: ");
                        Scanner scan = new Scanner(System.in);
                        String fries = scan.next();
                        
                        if(fries.equals("Y") || fries.equals("y")){
                                System.out.println("You ordered fries at a cost of $2.15");
                                System.out.println("The total cost of the meal is " + d.format(nBigMacs*2.22 + 2.15));
                                
                        }
                        else if (fries.equals("N") || fries.equals("n")){
                                System.out.println("The total cost of the meal is " + d.format(nBigMacs*2.22));
                        }
                        
                        else{
                                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                        }
                }
                else if (nBigMacs<=0){
                        System.out.println("You did not enter an int > 0");
                        return;
                }
        }
        else{ 
                System.out.println("You did not enter an int");
                return; //leaves the program, i.e. the program terminates
        }
       
    }
    
}
                
                