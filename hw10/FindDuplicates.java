//Mark Quentzel
//November 18, 2014
//CSE002
//Find Duplicates Java Program 

//practice manipulating arrays and writing methods that have array parameters.

import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10]; 
        String answer="";
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static boolean hasDups(int num[]){
        int j;//creates variable j
        for(int i=0; i<num.length; i++){//loops for number to be compared to other numbers
            for(j=i+1; j<num.length; j++){//loops for other numbers to be compared to original
                if(num[i] == num[j]){//compares each number to the following numbers to check if they are the same
                    return true; //boolean true if there are duplicates
                }
            }
        }
        return false; //boolean false if there aren't duplicates
    }
    
    public static boolean exactlyOneDup(int num[]){
        int j;//variable j
        int k=0;//creates for duplicates 
        for(int i=0; i<num.length; i++){
            for(j=i+1; j<num.length; j++){
                if(num[i] == num[j]){
                    k++;//increments every time there is a dupe
                }
            }
        }
        if(k==1){//if there is only one dupe
            return true;
        }
        else{//anything else
            return false;
        }
    }
}