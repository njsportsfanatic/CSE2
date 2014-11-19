//Mark Quentzel
//September 26, 2014
//CSE002
//Random Games Java Program 

//use switch statements Math.random(), a random number generator

import java.util.Scanner; 
import java.util.Random;

// define a class 
public class RandomGames{

// add main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        //creates variables for what user puts in scanner
        Random rn = new Random();
        int roulette = rn.nextInt(38);
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        //char userPick = myScanner.nextChar();
        String userPick = myScanner.next();
        if(userPick.length() == 1){
            switch (userPick) {
            case "R": 
                if(roulette == 37){
                    System.out.println("Roulette: " + "00");
                }
                else{
                    System.out.println("Roulette: " + roulette);
                }
                break;
            case "r":
                if(roulette == 37){
                    System.out.println("Roulette: " + "00");
                }
                else{
                    System.out.println("Roulette: " + roulette);
                }
                break;
            case "C": 
                System.out.println("Craps option is yet to be implemented");
                break;
            case "c":
                System.out.println("Craps option is yet to be implemented");
                break;
            case "P": 
                System.out.println("Picking a card not implemented yet");
                break;
            case "p":
                System.out.println("Picking a card not implemented yet");
                break;
            
            default: 
                System.out.println("'" + userPick + "' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                break;
            }
        }
        else{
            System.out.println("a single character expected");
        }
        
        
    }
}
                
        