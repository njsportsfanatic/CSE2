//Mark Quentzel
//October 28, 2014
//CSE002
//Driver Java Program 

//practice writing methods, overloading methods, forcing the user to enter good input

import java.util.Scanner;
    public class HW8{
        public static void main(String []arg){//main method
            char input; //creates char variable
            Scanner scan=new Scanner(System.in); //allows user to input into scanner
            System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); 
            input=getInput(scan,"Cc"); //refers to first method
            System.out.println("You entered '"+input+"'"); //output of first method
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
            input=getInput(scan,"yYnN",5); //give up after 5 attempts, refers to second method
            if(input!=' '){
               System.out.println("You entered '"+input+"'"); //output of second method
            }
            input=getInput(scan,"Choose a digit.","0123456789");//refers to third method
            System.out.println("You entered '"+input+"'"); //output of third method
        }
        
        public static char getInput(Scanner scan, String compare){ //first method
            String userInput; //creates string
            while(true){
                userInput = scan.next();
                if(userInput.length() == 1){ //if input is one character
                    for (int i=0; i<compare.length(); i++){ //loop to compare input to character each time
                        if(userInput.equals(""+compare.charAt(i))){ //compares inputted character to each character 
                            return compare.charAt(i); //returns character
                        }
                    }
                    System.out.print("You did not enter a character from the list 'Cc'; try again- ");

                }
                else {
                    System.out.print("You should enter exactly one character- ");
                }
            }
            
        }
      
        public static char getInput(Scanner scan, String compare, int i){ //second method
            String userInput1; //creates string
            int p=0; //initialize variable
            while(p<i){ //loops when created variables is less than 5
                userInput1 = scan.next();
                if(userInput1.length() == 1){//if input is one character
                    for (int j=0; j<compare.length(); j++){//loop to compare input to character each time
                        if(userInput1.equals(""+compare.charAt(j))){//compares inputted character to each character 
                            return compare.charAt(j);//returns character
                        }
                    }
                    System.out.print("You did not enter a character from the list 'yYnN'; try again- ");

                }
                else {
                    System.out.print("Enter exactly one character- ");
                }
                
                if (p==4){ //if you fail 5 tries
                    System.out.println("");
                    System.out.println("You failed after 5 tries");
                }
                p++; //increments variable
            }
            return ' '; //returns nothing
        }
        
        public static char getInput(Scanner scan, String a, String compare){
            String userInput2; //creates string
            while(true){
                System.out.println(a); //prints the first string
                System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
                userInput2 = scan.next();
                if(userInput2.length() == 1){//if input is one character
                    for (int k=0; k<compare.length(); k++){//loop to compare input to character each time
                        if(userInput2.equals(""+compare.charAt(k))){//compares inputted character to each character 
                            return compare.charAt(k);//returns character
                        }
                    }
                    System.out.println("You did not enter an acceptable character");

                }
                else {
                    System.out.println("Enter exactly one character- ");
                }
                
            }
        }
    }

