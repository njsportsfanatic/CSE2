//Mark Quentzel
//December 5, 2014
//CSE002
//Poker Slabs Java Program 

//practice in manipulating arrays and multidimensional arrays, in writing methods that have array parameters, and in searching and sorting arrays

import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        int deck[]=new int[52]; //loop for cards in deck
        int hand[] = new int[5]; //loop for cards in hand
        for(int j=0;j<52;j++){
                deck[j] = j; //creates 52 cards in deck
        }
        for (int i=0; i<5; i++){ //creates five cards in hand
                int n = rn.nextInt(52-num);
                hand[i] = deck[n];
                deck[n] = deck[51-num];
                deck[51-num] = -1;
                num++;
        }
        return hand; //returns cards in hand
    }
}
