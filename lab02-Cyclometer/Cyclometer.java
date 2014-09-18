//Mark Quentzel
//September 5, 2014
//CSE002
//Cyclometer Java Program

//act as a cyclometer 

//  define a class
public class Cyclometer {
    
//  add main method
    public static void main(String[] args) {
        int secsTrip1=480; //seconds of trip1
        int secsTrip2=3220; //seconds of trip2
        int countsTrip1=1561; //counts for trip1
        int countsTrip2=9037; //counts for trip2
        
        double wheelDiameter=27.0, //diamter of wheel
        PI=3.14159, //value of pi
        feetPerMile=5280, //# feet per mile
        inchesPerFoot=12, //# inches per foot
        secondsPerMinute=60; //# seconds per minute
        double distanceTrip1, distanceTrip2,totalDistance; //create variables for distances
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute) +" minutes and "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute) +" minutes and "+ countsTrip2+" counts.");
        
        //run the calculations; store the values. Document calculations here. What are you calculating?
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distances in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data
        System.out.println("Trip1 was "+ distanceTrip1 +" miles");
        System.out.println("Trip2 was "+ distanceTrip2 +" miles");
        System.out.println("The total distance was "+ totalDistance +" miles");
        
        
    } 
}