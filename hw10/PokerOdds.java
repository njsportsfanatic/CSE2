//Mark Quentzel
//November 18, 2014
//CSE002
//Poker Odds Java Program 

//practice manipulating arrays and writing methods that have array parameters.

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    
    public static void showHands(){
        Scanner scan=new Scanner(System.in);
        String answer="";
        int[] hand; //cards in users hand
        int[] received = new int[5]; //rank of each card
        String randChoice = ""; //string to write rank received
        String clubs;
        String diamonds;
        String hearts;
        String spades;
        do{
            //resets suit each time through loop
            clubs = "clubs: ";
            diamonds = "diamonds: ";
            hearts = "hearts: ";
            spades = "spades: ";
            
            hand=getHand();//calls hand from getHand method
            for(int i =0; i<5; i++){
                received[i] = hand[i]%13;//received loop gives rank of each card in hand
                switch(received[i]){//assigns appropriate rank for randChoice
                    case 0: randChoice = "A";
                    break;
                    case 1: randChoice = "K";
                    break;
                    case 2: randChoice = "Q";
                    break;
                    case 3: randChoice = "J";
                    break;
                    case 4: randChoice = "10";
                    break;
                    case 5: randChoice = "9";
                    break;
                    case 6: randChoice = "8";
                    break;
                    case 7: randChoice = "7";
                    break;
                    case 8: randChoice = "6";
                    break;
                    case 9: randChoice = "5";
                    break;
                    case 10: randChoice = "4";
                    break;
                    case 11: randChoice = "3";
                    break;
                    case 12: randChoice = "2";
                    break;
                    
                }
                //if card is in certain range, it is a specific suit
                //put rank after suit name when card is in range
                if(hand[i]>=0 && hand[i]<13){
                    clubs += randChoice + " ";
                }
                if(hand[i]>=13 && hand[i]<26){
                    diamonds += randChoice + " ";
                }
                if(hand[i]>=26 && hand[i]<39){
                    hearts += randChoice + " ";
                }
                if(hand[i]>=39 && hand[i]<52){
                    spades += randChoice + " ";
                }
                
            }
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades);
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static int[] getHand(){
        Random rn = new Random();
        int deck[]=new int[52]; //loop for cards in deck
        int num = 0; //variable
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
    
    
    public static void simulateOdds(){
        int dupe = 0; //variables for duplicates
        int A = 0; int K= 0; int Q= 0; int J= 0; int ten= 0; int nine= 0; int eight= 0; int seven= 0; int six= 0; int five= 0; int four= 0; int three= 0; int two= 0; //variable for each rank
        int sum; //variable for sum of pairs
        int[] hand; //loop for cards in hand
        A = 0; K= 0; Q= 0; J= 0; ten= 0; nine= 0; eight= 0; seven= 0; six= 0; five= 0; four= 0; three= 0; two= 0;
            for(int p=0; p<10000; p++){//runs 10000 times
                hand = getHand();//calls getHand method to get cards in hand
                //from other hw, gets amount of times there is one dupe
                int k=0;
                for(int i=0; i<hand.length; i++){
                    for(int j=i+1; j<hand.length; j++){
                        if(hand[i]%13 == hand[j]%13){
                            k++;
                            
                            dupe = hand[i]%13;
                            
                        }
                    }
                }
                if(k==1){
                    switch(dupe){//increments rank if there is one dope for that rank
                        case 0: A++;
                        break;
                        case 1: K++;
                        break;
                        case 2: Q++;
                        break;
                        case 3: J++;
                        break;
                        case 4: ten++;
                        break;
                        case 5: nine++;
                        break;
                        case 6: eight++;
                        break;
                        case 7: seven++;
                        break;
                        case 8: six++;
                        break;
                        case 9: five++;
                        break;
                        case 10: four++;
                        break;
                        case 11: three++;
                        break;
                        case 12: two++;
                        break;
                    }
                    
                    
                }
                
            }
            sum = A + K + Q + J + ten + nine + eight + seven + six + five + four + three + two; //sums all times you only have one pair
                    //prints the freq of one pair at each rank
                    System.out.println("rank  freq of exactly one pair");
                    System.out.println("A     " + A);
                    System.out.println("K     " + K);
                    System.out.println("Q     " + Q);
                    System.out.println("J     " + J);
                    System.out.println("10    " + ten);
                    System.out.println("9     " + nine);
                    System.out.println("8     " + eight);
                    System.out.println("7     " + seven);
                    System.out.println("6     " + six);
                    System.out.println("5     " + five);
                    System.out.println("4     " + four);
                    System.out.println("3     " + three);
                    System.out.println("2     " + two);
                    System.out.println("---------------");
                    System.out.println("total not exactly one pair: " + (10000 - sum)); //prints total times you dont have one pair
                           
        
    }
    
    
}
