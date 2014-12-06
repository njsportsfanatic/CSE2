//Mark Quentzel
//December 5, 2014
//CSE002
//Poker Slabs Java Program 

//practice in manipulating arrays and multidimensional arrays, in writing methods that have array parameters, and in searching and sorting arrays

import java.util.Scanner;

public class PokerHands{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String goAgain = scan.next();
        while(goAgain.equals("Y")|| goAgain.equals("y")){
            int hand[] = new int[5];
            for(int i =0; i<5; i++){
                System.out.print("Enter five numbers- ");
                hand[i] = scan.nextInt();
            }
            showOneHand(hand);
        }
    }
    
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
          	out+=suit[s];
          	for(int rank=0;rank<13;rank++){
            	for(int card=0;card<5;card++){
                 	if(hand[card]/13==s && hand[card]%13==rank){
                  	    out+=face[rank];
                 	}
          	    out+='\n';
            	}
          	}
    	}
    	System.out.println(out);
    }

}
