//Mark Quentzel
//October 31, 2014
//CSE002
//Methods Calling Method Java Program

//practice writing methods that call methods
import java.util.Scanner;

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        //c=addDigit(addDigit(c,4),5);
        //System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        //System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        //c=join(a,b);
        //System.out.println("Join "+a+" to "+b+" to get "+c);
        //System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        //System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int inputNum, int digit){
        Scanner scan=new Scanner(System.in); //allows user to input into scanner
        inputNum = scan.nextInt();
        
        if (digit >=0 && digit <=9){
            return inputNum;
            return digit + inputNum;
        }
        else{
            return digit;
        }
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/