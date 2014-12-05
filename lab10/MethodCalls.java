//Mark Quentzel
//October 31, 2014
//CSE002
//Methods Calling Method Java Program

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22;
        int c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
    
    public static int addDigit(int number, int digit) {
        int x=0;
        if(digit>=0 && digit<=9) {
           if(number>100 && number<1000){
                x=digit*1000;   
           }
           else if(number<0){
               number=-1*(Math.abs(number)+(digit*100));
               x=0;
           }
           else if(number<100){
               x=digit*100;
           }
           else if(number>1000 && number<10000){
               x=digit*10000;
           }
           else if(number>10000 && number<100000){
               x=digit*100000;
           }
           return number+x;
        }
        else {
           return number;
        }
        
    }
    
    public static int join(int number, int digit){
        int x=0;
        if(digit>1000){
            number=number*10000;
            x=digit;
        }
        else{
            number=Math.abs(number)*100;
            digit=Math.abs(digit);
            x=digit;
               
        }
        return number+x;
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
