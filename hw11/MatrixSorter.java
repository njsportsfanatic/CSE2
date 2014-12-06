//Mark Quentzel
//December 5, 2014
//CSE002
//Poker Slabs Java Program 

//practice in manipulating arrays and multidimensional arrays, in writing methods that have array parameters, and in searching and sorting arrays

import java.util.Random;

public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d(){
        Random rand = new Random();
        int myArray[][][] = new int[3][][];
        
        for(int s=0; s<3; s++){//slab number
            int a = 3+2*s;
            myArray[s] = new int[a][];
            for(int j=0; j<a; j++){//loops through rows
                int b = s+j+1;
                myArray[s][j] = new int[b];
                for(int c=0; c<b; c++){//loops through columns
                    myArray[s][j][c] = rand.nextInt(99)+1;//number within 0 and 99
                }
            }
        }
        return myArray;
    }
    
    public static void show(int[][][] mat3d){
        //prints the three arrays
        for (int s=0; s<3; s++){
            System.out.println("--------------------- Slab " + (s+1));
            for (int j=0; j<2*s+3; j++){
                for (int c=0; c<mat3d[s][j].length; c++){
                    System.out.print(mat3d[s][j][c]+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("---------------------");
    }
    
    public static int findMin(int[][][] mat3d){
        //finds min of 3-D array
        int min = 100;
        for (int s=0; s<3; s++){
            for (int j=0; j<2*s+3; j++){
                for (int c=0; c<1+j+s; c++){
                    if (mat3d[s][j][c]<min){ //if it loops and finds a num smaller than min, it sets min to that num
                        min = mat3d[s][j][c];
                    }
                }
            }
        }
        
        return min;
    }
    
    public static void sort(int[][] mat3d){
        //sorts each row by selection sort
        for(int j=0; j<7; j++){
            for(int n=0; n<j+2; n++){
                int max=mat3d[j][n]; //variable for finding max
                for(int i=n+1; i<j+3; i++){
                    if(mat3d[j][i]<max){
                        int temp=mat3d[j][n];
                        max=mat3d[j][i];  //stores new max
                        mat3d[j][n]=max;
                        mat3d[j][i]=temp;
                    }
                }
            }
        }
        //sort by insert selection by the first num in each col
        int[][] colSort = new int[7][];
        for(int i=1; i<7; i++){
            int newTemp = i;
            for(int j=i-1; j>=0; j--){
                if(mat3d[newTemp][0] < mat3d[j][0]){
                    colSort[0] = new int[mat3d[newTemp].length];
                    colSort[0] = mat3d[newTemp];
                    colSort[1] = new int[mat3d[j].length];
                    colSort[1] = mat3d[j];
                    mat3d[newTemp] = new int[colSort[1].length];
                    mat3d[newTemp] = colSort[1];
                    mat3d[j] = new int[colSort[0].length];
                    mat3d[j] = colSort[0];
                    newTemp = j;
                }
            }
        }
        
    }
}
