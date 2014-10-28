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
    public static void getInt(int a, int b){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter an int- ");
        if (a>0 || a<=0){
            System.out.println()
        }
    }
    
    public static void larger(int a, int b){
        if (a>b){
            System.out.print(a);
        }
        else {
            System.out.print(b);
        }
        
        if (a>b && a>c){
            System.out.print(a);
        }
        else if (b>a && b>c){
            System.out.print(b);
        }
        else {
            System.out.print(c);
        }
    }
    
    public static void ascending(int a, int b){
        if (a<b && a<c && b<c){
             System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    
}