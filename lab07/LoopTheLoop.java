//Mark Quentzel
//October 10, 2014
//CSE002
//Loop The Loop Java Program 

//write while loops and break statements

import java.util.Scanner;  //import scanner

public class LoopTheLoop {
    public static void main(String [] args) {
        
        while(true) {
            Scanner scan =new Scanner(System.in);
            System.out.print("Enter an int between 1 and 15: ");
            int nStars;
            boolean bool=scan.hasNextInt(); 
            
            if(!bool) {
                System.out.print("Enter an int in the range.. ");
                scan.next();
            }
            
            nStars=scan.nextInt();
            
            if(nStars>0 && nStars<=15) { 
                int counter=0;
                while (counter<nStars) {  
                    System.out.print("*");
                    counter++;
                }
                
                int counter2=0;
                while(counter2<=nStars){ 
                    int counter3=1;
                    while(counter3<=counter2) { 
                        System.out.print("*");
                        counter3++;
                    }
                    System.out.println();
                    counter2++;
                }
            
            }
            else {
                System.out.println("Your int was not in the range [1.15]");
            }
         
       
            Scanner myScanner = new Scanner(System.in);
            System.out.print("To continue enter Y or y- ");
            String goAgain=myScanner.next();   
               
            if(goAgain.equals("Y") || goAgain.equals("y")){}
            else{
                break;
            }
           
        }
        int nStars = 10;
        int counter = 0;
        
        while(nStars > counter){
            System.out.print("*");
            counter++;
        }
        
        counter = 0;
        System.out.println();
        while(counter < nStars){
            counter++;
            int counter2 = 0;
            while(counter > counter2){
                System.out.print("*");
                counter2++;
            }
            
            System.out.println();
        }
    }
}
