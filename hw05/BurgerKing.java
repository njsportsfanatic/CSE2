//Mark Quentzel
//September 30, 2014
//CSE002
//Burger King Java Program 

//use selection statements, operators, and boolean expressions

import java.util.Scanner; 

// define a class 
public class BurgerKing{

// add main method
    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //creates variables for what user puts in scanner
        System.out.print("Enter a letter to indicate a choice of \n Burger (B or b) \n Soda (S or s) \n Fries (F or f) ");
        String itemChoice = myScanner.next().toLowerCase(); 
        if (itemChoice.length() == 1){ //checks if string is one character
        
            switch (itemChoice) {
                case "b": //if user wants burgers
                    System.out.print("Enter A or a for \"all the fixins\" \n C or c for cheese \n N or n for none of the above ");
                    String itemFixin = myScanner.next().toLowerCase();
                        switch(itemFixin) {
                            case "a": //all fixins
                                System.out.println("You ordered a burger with all the fixins.");
                                break;
                            case "c": //cheese
                                System.out.println("You ordered a burger with cheese.");
                                break;
                            case "n": //no topping
                                System.out.println("You ordered a burger with none of the above options.");
                                break;
                            default: //wrong letter
                                System.out.println("You did not enter any of A, a, C, c, N or n.");
                                break;
                        }
                    break;
                    
                 case "s": //if user wants soda
                    System.out.print("Do you want Pepsi (p or P), \n Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                    String itemSoda = myScanner.next().toLowerCase();
                        switch(itemSoda) {
                            case "p": //pepsi
                                System.out.println("You ordered a Pepsi");
                                break;
                            case "c": //coke
                                System.out.println("You ordered a Coke");
                                break;
                            case "s": //sprite
                                System.out.println("You ordered a Sprite");
                                break;
                            case "m": //mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                break;
            
                        }
                    break;
                    
                case "f": //if user wants fries
                    System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                    String itemFries = myScanner.next().toLowerCase();
                        switch(itemFries) {
                            case "l": //large fries
                                System.out.println("You ordered large fries");
                                break;
                            case "s": //small fries
                                System.out.println("You ordered small fries");
                                break;
            
                        }
                    break;
                
                //letter inputed isn't a possible choice
                default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                    break;
            }
        }
        
        else 
        {
            System.out.println("a single character expected");
        }
                         
        
        
    }
}