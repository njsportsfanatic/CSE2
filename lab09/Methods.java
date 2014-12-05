import java.util.Scanner;

public class Methods{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three ints");
        a=getInt(scan);
        b=getInt(scan);
        c=getInt(scan);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+
                           " is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                           ", and "+c+" are in ascending order");
    }
    public static int getInt(Scanner scan){
        System.out.print("Enter an int- ");
        while(true){
            if (scan.hasNextInt()){ 
                int input = scan.nextInt();
                return input;
            }
            else {
                System.out.print("You did not enter an int; try again- ");
                scan.next(); //gets user to reenter number
            }
        }
    }
    
    public static int larger(int x, int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }
    
    public static String ascending(int x, int y, int z){
        if (x<y && x<z && y<z){
             return "true";
        }
        else{
            return "false";
        }
    }
}
    
