//Mark Quentzel
//November 14, 2014
//CSE002
//Arrays lab java program

//practice writing methods that call methods
import java.util.Scanner;

public class Arrays{
    public static void main(String []  arg){
        int[] userInput = new int[10];
        System.out.print("Enter 10 ints- ");
        Scanner myScanner = new Scanner(System.in);
        userInput[0] = myScanner.nextInt();
        userInput[1] = myScanner.nextInt();
        userInput[2] = myScanner.nextInt();
        userInput[3] = myScanner.nextInt();
        userInput[4] = myScanner.nextInt();
        userInput[5] = myScanner.nextInt();
        userInput[6] = myScanner.nextInt();
        userInput[7] = myScanner.nextInt();
        userInput[8] = myScanner.nextInt();
        userInput[9] = myScanner.nextInt();
        
        
        int min = userInput[0];
        for (int i=1; i<userInput.length; i++){
        	if (userInput[i] < min) {
        		min = userInput[i];
        	}
        }
        System.out.println("The lowest entry is " + min);
        
        int max = userInput[0];
        for (int i=1; i<userInput.length; i++){
        	if (userInput[i] > max) {
        		max = userInput[i];
        	}
        }
        System.out.println("The highest entry is " + max);
        
        int sum = 0;
        for (int i=0; i<userInput.length; i++){
        	sum += userInput[i];
        }
        System.out.println("The sum is " + sum);
        
        int reverse[] = userInput;
        int i = 0;
        for (int k=9; k>-1; k--){
        	System.out.println(userInput[i] + " " + reverse[k]);
            i++;
        }
    }
    
}