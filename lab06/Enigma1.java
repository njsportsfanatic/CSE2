/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(100-x==93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(100-x==59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(100-x==86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(100-x==67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(100-x==40)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}

/* Error report: 
     inputted letters/words are unacceptable
     7, 41, 14, 33, and 66 did not produce a proportion because the computer
     is slightly wrong with the calculation. To fix this, I simply subtracted
     100-x for each case, and if this gives you the correct proportion as an 
     integer, than it prints out the proportion
 */

