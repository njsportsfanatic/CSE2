//Mark Quentzel
//November 21, 2014
//CSE002
//Array Math lab java program

public class ArrayMath{
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
                y[]={2.3, 3, 4, -2.1, 82, 23},
                z[]={2.3, 13, 14},
                w[]={2.3, 13, 14, 12}, 
                v[],
                u[]={2.3, 12, 14};
                v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

    }
  
  
    public static double[] addArrays(double [] x, double [] y){
        
        double[] A=new double [x.length];  //initialize
        for(int i=0; i<x.length; i++){
            if(i<y.length){
                A[i]=x[i]+y[i];
            }
            else{
                A[i]=x[i];
            }
        }
      
        return A;
      
    }

    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=x[j];
        }
        return out+"}";
    }
    
    public static boolean equals(double [] x, double [] y){
        boolean test;
        if(x.length==y.length){
            test=true;
            for(int k=0; k<x.length; k++){
                if(x[k]!=y[k]){
                    test=false;
                }
            }
        }
        else{
            test=false;
        }
        return test;
    }
    
  
}

/*

OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}

*/
