//Mark Quentzel
//September 16, 2014
//CSE002
//Bicycle Java Program

//take input from user and use the data to make basic computations

import java.util.Scanner;
import java.text.DecimalFormat;

//  define a class
public class Bicycle{
    
//  add main method
    public static void main(String[] args) {
        
        DecimalFormat d = new DecimalFormat("0.##");
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        double distanceTrip; //distance of trip
        double minTrip; //minutes in trip
        
        System.out.print("Enter the number of seconds: ");
        int secsTrip = myScanner.nextInt(); //seconds of trip (input)
        System.out.print("Enter the number of counts: ");
        int countsTrip = myScanner.nextInt(); //counts of trip (input)
        
        
        double wheelDiameter=27.0, //diamter of wheel
        PI=3.14159, //value of pi
        feetPerMile=5280, //# feet per mile
        inchesPerFoot=12, //# inches per foot
        secondsPerMinute=60; //# seconds per minute
        
        distanceTrip=countsTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculate distance of trip in miles
        minTrip=secsTrip/secondsPerMinute; //calculate minutes of trip
        
        //Print out the output data
        System.out.println("The distance was "+ d.format(distanceTrip) + " miles and took " + d.format(minTrip) + " minutes.");
        
        double aveSpeed=distanceTrip/(minTrip/60); //calculate speed
        
        //Print out the output data
        System.out.println("The average mph was "+ d.format(aveSpeed));
        
    }
    
}