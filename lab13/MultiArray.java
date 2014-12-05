//Mark Quentzel
//November 28, 2014
//CSE002
//Multi Array lab java program

public class MultiArray{
    public static void main (String [] args){
        int[][] original= new int [5][20];
        System.out.println("The array before sorting:");
        for(int j=0; j<5; j++){
            for(int n=0; n<(j*3)+5; n++){
                original[j][n]=(int)(Math.random()*40);
                System.out.print(original[j][n]+" ");
            }
            System.out.println();
        }
    
        System.out.println();
    
        System.out.println("The array after sorting:");

        for(int j=0; j<5; j++){
            for(int n=0; n<(j*3)+5; n++){
                int low=original[j][n]; //variable for finding max
                for(int i=n+1; i<(j*3)+5; i++){
                    if(original[j][i]<low){
                        int temp=original[j][n];
                        low=original[j][i];  //stores new max
                        original[j][n]=low;
                        original[j][i]=temp;
                    }
                }
            }
        }

        for(int j=0; j<5; j++){
            for(int n=0; n<(j*3)+5; n++){
                System.out.print(original[j][n]+" ");
            }
            System.out.println();
        }
    
    }
}