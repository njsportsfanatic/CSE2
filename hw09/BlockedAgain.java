//Mark Quentzel
//November 4, 2014
//CSE002
//Blocked Again Java Program 

//practice designing a nested sequence of method calls that divide a larger problem into subproblems

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    
    public static int getInt(){ 
        Scanner userInput = new Scanner(System.in);
        int nStacks = checkInt(userInput); //calls checkInt method
            return nStacks;
    }
    
    public static int checkInt(Scanner userInput){
        int nStacks;
        System.out.print("Enter an in int between 1 and 9, inclusive: ");
        while(true){
            if (userInput.hasNextInt()){ 
                nStacks = userInput.nextInt(); //sets nStacks to be an int
                if(checkRange(nStacks)){ //calls checkRange method
                    return nStacks;
                }
                else{
                    System.out.print("You did not enter an int in [1,9]; try again: ");
                }
            }
            else {
                System.out.print("You did not enter an int; try again: ");
                userInput.next(); //gets user to reenter number
            }
        }
    }
    
    public static boolean checkRange(int nStacks){
            if (nStacks >= 1  && nStacks <=9){
                return true;
            }
            else {
                return false;
            }
    
    }
    
    public static void allBlocks(int nStacks){
        int x=1; //number of columns
        for(int j=1;j<nStacks+1;j++){
            block(j, x); //calls block method
            x+=2;
        }
    }

    public static void block(int j, int x){
        
         //sets the number in each block
	        for(int k=1;k<j+1;k++){ //sets number of rows in each block
	           for(int m=17;m>x;m-=2){ //sets spacing for blocked numbers
	               System.out.print(" ");
	           }
	           for(int m=1;m<x+1;m++){ //sets amount of numbers in each row
	               System.out.print(j);
	           }
		       System.out.println();
	        }
	    	for(int m=17;m>x;m-=2){ //sets spacing for dashes
	               System.out.print(" ");
	           	}
	        line(x); //calls line method
	        System.out.println();
	        
    }
    
    public static void line(int x){
        for(int n=1;n<x+1;n++){ //sets amount of dashes
	           System.out.print("-");
	    }
    }
}