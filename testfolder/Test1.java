import java.util.Scanner;  //import scanner

public class Test1 {  //define class

    public static void main(String args [])   { //add main method
    
    //declare variables
        Scanner S;
        S= new Scanner (System.in); //Scanner constructor
        System.out.println("Enter R or r for roulette, C or c for Craps, P or p to pick a card: ");  //Prompt user to input
        String game=S.next(); //store input as string
        
            switch (game) {
               case "R": 
                   System.out.println("Roulette not implemented yet");
               break;
               case "r": 
                   System.out.println("Roulette not implemented yet");
               break;
               case "C": 
                   int x=(int)((Math.random()*6)+1); //first roll
                   int y=(int)((Math.random()*6)+1); //second roll
                   int z=x+y;  //add rolls
                   System.out.println("Craps: "+x+"+"+y+"="+z); //terminal output
               break;
               case "c": 
                   int f=(int)((Math.random()*6)+1);  //first roll
                   int g=(int)((Math.random()*6)+1);  //second roll
                   int h=f+g;  //add rolls
                   System.out.println("Craps: "+f+"+"+g+"="+h); //terminal output
               break;
               case "P": 
                    System.out.println("Pick a card not implemented yet");
               break;
               case "p": 
                    System.out.println("Pick a card not implemented yet");
               break;
            default:   System.out.println("Single character expected");
            break; 
           }
           

    }

 }