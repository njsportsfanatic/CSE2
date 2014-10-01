//Mark Quentzel
//September 26, 2014
//CSE002
//Random Games Java Program 

//use switch statements Math.random(), a random number generator

import java.util.Scanner; 

// define a class 
public class RandomGames{

// add main method
    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //creates variables for what user puts in scanner
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String userGameString = myScanner.nextInt();
        switch (userGame) {
            case 'R': 
            case 'r':
                System.out.println(userGameString);
                break;
            case 'C': 
            case 'c':
                System.out.println("Craps option is yet to be implemented");
                break;
            case 'P': 
            case 'p':
                System.out.println("Picking a card not implemented yet");
                break;
            
            default: 
                System.out.println("'" + userGameString + "' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                break;
        }
        
        if(userGame = 'R' || userGame = 'r')
                
        