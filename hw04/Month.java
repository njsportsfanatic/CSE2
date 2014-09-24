//Mark Quentzel
//September 23, 2014
//CSE002
//Month Java Program

//the user enters an positive integer giving the number of seconds that have passed during the day and then displays the time in conventional form

import java.util.Scanner;

//  define a class
public class Month{
    
//  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        //creates variables for what user puts in scanner
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        int nMonth = myScanner.nextInt();
        
        //must be a valid month, otherwise it doesn't work
        if (nMonth < 1 || nMonth > 12){
            System.out.println("You did not enter an int between 1 and 12");
        }
        //prints 31 days for corresponding months
        if (nMonth == 1 || nMonth == 3 || nMonth == 5 || nMonth == 7 || nMonth == 8 || nMonth == 10 || nMonth == 12){
                System.out.println("The month has 31 days");
            }
        
        //prints 30 days for corresponding months
        else if (nMonth == 4 || nMonth == 6 || nMonth == 9 || nMonth == 11){
                System.out.println("The month has 30 days");
        }
        
        //take input (year) to determine days in febrary
        else if (nMonth == 2){
                System.out.print("Enter an int giving the year ");
                int nYear = myScanner.nextInt();
                
                {
                    //calculates which years are leap years; leap years correspond to 29 days in february
                    if ((nYear % 4 == 0) && (nYear % 100 != 0) || (nYear == 2000)){
                        System.out.println("The month has 29 days");
                    }
                    else
                    {
                        System.out.println("The month has 28 days");
                    }
                }
        }
        
       
    }
}
