//Mark Quentzel
//October 14, 2014
//CSE002
//Roulette Java Program 

//use loops to create a roulette program

import java.util.Random;

// define a class 
public class Roulette{

// add main method
    public static void main(String[] args) {
        
        //initialize variables
        int nPlays;
        int moneyEarned = 0;
        int nTrials = 0;
        int timesWon = 0; //The number of times he made profit
        int totalWinnings = 0;
        int timesLost = 0;
        int timesMade = 0; //number of times he won without profit
        
        while (nTrials < 1000){
            nTrials++; //increment for trial
            nPlays = 0; //set back to zero
            moneyEarned = 0; //set back to zero
            while (nPlays < 100){
                nPlays++; //increment for play
                if ((int) Math.ceil(Math.random()*38) == 1){
                    moneyEarned += 36; //win $36 for a win
                    
                }
                
            }
                if (moneyEarned > 100){
                    timesWon++; //increment if you make profit
                }
                else if (moneyEarned == 0){
                    timesLost++; //increment if you lose
                }
                else if (moneyEarned > 0 && moneyEarned <= 100){
                    timesMade++; //increment if you make win without profit
                }
                totalWinnings += moneyEarned; //add money earned in round to total earnings
            
        }
            System.out.println("number of times I lose everything: " + timesLost);
            System.out.println("the total winnings: " + totalWinnings);
            System.out.println("the number of times I walked away with a profit: " + timesWon);
            System.out.println("the number of times I won but did not make a profit: " + timesMade);
    }
    
}