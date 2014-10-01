//Mark Quentzel
//September 30, 2014
//CSE002
//Boola Boola Java Program 

//use selection statements, operators, and boolean expressions

import java.util.Scanner; 
import java.util.Random;

// define a class 
public class BoolaBoola{

// add main method
    public static void main(String[] args) {

        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //create three booleans 
        Boolean first;
        Boolean second;
        Boolean third;
        //create two strings to operate booleans
        String op1;
        String op2;
        //create two more booleans to use after operations
        Boolean logic1;
        Boolean logic2;

        int r;
        //create two random numbers
        Random generator = new Random();
        //use random numbers to make booleans true or false
        r = generator.nextInt(2);
            if (r==1){
                first = true;
            }
            else {
                first = false;
            }
        r = generator.nextInt(2);
            if (r==1){
                second = true;
            }
            else {
                second = false;
            }
        r = generator.nextInt(2);    
            if (r==1){
                third = true;
            }
            else {
                third = false;
            }
        //use random numbers to make operation && or ||
        r = generator.nextInt(2);    
            if (r==1){
                op1 = "&&";
            }
            else {
                op1 = "||";
            }
        r = generator.nextInt(2);    
            if (r==1){
                op2 = "&&";
            }
            else {
                op2 = "||";
            }
            
            //print out output so far and take input from user to guess the answer to operations
            System.out.print("Does " + first + " " + op1  +  " " + second + " " +  op2 + " " +  third + " have the value true(t/T) or false(f/F)? ");
            String guess = myScanner.next().toLowerCase();
            
            //perform the operations
            if(op1.equals("||")){
                logic1 = first || second;
            }
            else{
                logic1 = first && second; 
            }
            
            if(op2.equals("||")){
                logic2 = logic1 || third;
            }
            else{
                logic2 = logic1 && third; 
            }
            
            //prints out if use is correct or wrong
            if (((logic2 == true) && (guess.equals("t"))) || ((logic2 == false) && (guess.equals("f")))){
                System.out.println("Correct");
            }
            
            else if  (((logic2 == true) && (guess.equals("f"))) || ((logic2 == false) && (guess.equals("t")))){
                System.out.println("Wrong; try again");
            }
            
            else {
                System.out.println("Wrong; try again");
            }
            
        
    }
    
}