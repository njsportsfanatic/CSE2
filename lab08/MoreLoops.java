//Mark Quentzel
//October 17, 2014
//CSE002
//More Loops Java Program 

//use knowledge of loops to rewrite loops as other loops

import java.util.Scanner;

// define a class 
public class MoreLoops{

// add main method
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int n=0;
        
        do{
            System.out.print("Enter an int- ");
            if(!scan.hasNextInt()){
                scan.next();
                System.out.print("You did not enter an int; try again- ");
            }
        }while(!scan.hasNextInt());

        n=scan.nextInt();
        int j = 0;
        int k=0;
        while(j<n && j<40){
            k=0;
            while(k<j+1){
                System.out.print('*');
                k++;
            }
            System.out.println();
            j++;
        }
        

        k=4;
        while(k<5){
            System.out.println("k="+k);
        	k++;
        }
        for(int count = 0; count<10; count++){
            if (n==1 || n==2){
                count = 0;
                System.out.print("Case 2 ");
            }
            else if(n==4){
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            else if(n==3){

            }
            else if(n==5){
                System.out.println("Case 5");
            }
            else{
                System.out.println(n + " is > 5 or <1");
            }
        }

        
    }
    
}