//Mark Quentzel
//September 23, 2014
//CSE002
//Time Padding Java Program

//prompts user to enter an integer for the month and then displays the number of days in the month

import java.util.Scanner;
import java.text.DecimalFormat;

//  define a class
public class TimePadding{
    
//  add main method
    public static void main(String[] args) {
        
        DecimalFormat d = new DecimalFormat("00");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        //creates variables for what user puts in scanner
        System.out.print("Enter the time in seconds: ");
        int nSeconds = myScanner.nextInt();
        
        //calculations to get quantities for hours, minutes and seconds 
        int nHours = nSeconds / 3600;
        nSeconds = nSeconds % 3600;
        int nMinutes = nSeconds / 60;
        int nSeconds1 = nSeconds % 60;
        
        //print time in conventional form
        System.out.println(d.format(nHours) + ":" + d.format(nMinutes) + ":" + d.format(nSeconds1));
        
    }
}
        