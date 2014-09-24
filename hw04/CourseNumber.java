//Mark Quentzel
//September 23, 2014
//CSE002
//Course Number Java Program

//read in a 6 digit number and then prints out the semester and year

import java.util.Scanner;

//  define a class
public class CourseNumber{
    
//  add main method
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        //creates variables for what user puts in scanner
        System.out.print("Enter a six digit number giving the course semester- ");
        int nCourse = myScanner.nextInt();
        
        //calculations to get year and specific semester separate
        int nYear = (int) (nCourse/100);
        int nSemester = nCourse - (nYear*100);
        
        //doesn't run for numbers outside range
        if (nCourse < 186510 || nCourse > 201440){
            System.out.println("The number was outside the range [186510,201440]");
        }
        
        else
        {
            //identifies and prints specific semesters based on value at end of number
            if (nSemester == 10){
                System.out.println("The course was offered in the spring semester of " + nYear);
            }
            else if (nSemester == 20){
                System.out.println("The course was offered in the Summer 1 semester of " + nYear);
            }
            else if (nSemester == 30){
                System.out.println("The course was offered in the Summer 2 semester of " + nYear);
            }
            else if (nSemester == 40){
                System.out.println("The course was offered in the fall semester of " + nYear);
            }
            else
            {
                //doesn't run for semesters not included
                System.out.println(nSemester + " is not a legitimate semester");
            }
            
        }
        
    }
    
}
        
