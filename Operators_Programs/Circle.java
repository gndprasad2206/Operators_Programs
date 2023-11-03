//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 
  public static void main(String[] args){   //Define main method
    int radius;
    float circumference=0; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius value");
    radius=sc.nextInt();
    circumference=(float)(2*3.14*radius);
    System.out.println("the circumference of the circle is ="+circumference);
                                            
  }
} 