/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n;
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
        n was not initialized for the default case, it had no value
        to fix this, I initialized n above the if/else statement
        then, I changed the int n =... within the if/else to n=...
        lastly, I removed n from the list of initalized variable because I initialized it above
 */

