//Mark Quentzel
//October 21, 2014
//CSE002
//Number Stack Java Program 

//practice writing while, for, and do-while loops

import java.util.Scanner; 

// define a class 
public class NumberStack{

// add main method
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number between 1 and 9- ");
        int nStacks = myScanner.nextInt(); //creates variable for what user puts in scanner
        
        System.out.println("Using for loops:");
        int z=1; //number of columns
        for(int j=1;j<nStacks+1;j++){ //sets the number in each block
	        for(int k=1;k<j+1;k++){ //sets number of rows in each block
	           for(int m=17;m>z;m-=2){ //sets spacing for blocked numbers
	               System.out.print(" ");
	           }
	           for(int m=1;m<z+1;m++){ //sets amount of numbers in each row
	               System.out.print(j);
	           }
		       System.out.println();
	        }
	    	for(int m=17;m>z;m-=2){ //sets spacing for dashes
	               System.out.print(" ");
	           	}
	        for(int n=1;n<z+1;n++){ //sets amount of dashes
	           System.out.print("-");
	        }
	        System.out.println();
	    z+=2;
	    }
	    
	    System.out.println("Using while loops:");
	    z=1; //number of columns
	    //create variables
	    int j=1;
	    int k=1;
	    int m=17;
	    int n=1;
	    int o=17;
	    int p=1;
	    
        while(j<nStacks+1){ //sets the number in each block
        	k=1;
	        while(k<j+1){//sets number of rows in each block
	        	m=17;
	           	while(m>z){ //sets spacing for blocked numbers
	               System.out.print(" ");
	               m-=2;
	           	}
	           	n=1;
	           	while(n<z+1){ //sets amount of numbers in each row
	               System.out.print(j);
	               n++;
	           	}
		       	System.out.println();
		       	k++;
	        }
	        o=17;
	    	while(o>z){ //sets spacing for dashes
	               System.out.print(" ");
	               o-=2;
	           	}
	        p=1;
	        while(p<z+1){ //sets amount of dashes
	           System.out.print("-");
	           p++;
	        }
	        System.out.println();
	    	z+=2;
	    	j++;
	    }
	    
        System.out.println("Using do-while loops:");
	    z=1; //number of columns
	    //reset variables
	    j=1;
	    k=1;
	    m=17;
	    n=1;
	    o=17;
	    p=1;
	    
	    do{ //sets the number in each block
        	k=1;
	        do{ //sets number of rows in each block
	        	m=19;
	           	do{ //sets spacing for blocked numbers
	               System.out.print(" ");
	               m-=2;
	           	}while(m>z);
	           	n=1;
	           	do{ //sets amount of numbers in each row
	               System.out.print(j);
	               n++;
	           	}while(n<z+1);
		       	System.out.println();
		       	k++;
	        }while(k<j+1);
	        o=19;
	    	do{ //sets spacing for dashes
	            System.out.print(" ");
	            o-=2;
	        }while(o>z);
	        p=1;
	        do{ //sets amount of dashes
	           System.out.print("-");
	           p++;
	        }while(p<z+1);
	        System.out.println();
	    	z+=2;
	    	j++;
	    }while(j<nStacks+1);
	    
    }
    
}