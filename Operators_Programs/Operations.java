/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
  public static void main(String[] args){
    int number_1,number_2,difference=0,product=0,division=0,incr=0,decr=0,remainder=0;
    number_1=30;
    number_2=10;
    difference=number_1-number_2;
    number_1=45;
    number_2=2;
    product=number_1*number_2;
    number_1=600;
    number_2=10;
    division=number_1/number_2;
    number_1=15;
    incr=number_1++;
    decr=number_1--;
    number_1=14;
    number_2=2;
    remainder=number_1%number_2;
    System.out.println("the difference between 30 and 20 is ="+difference);
    System.out.println("the product of 45 and 2 is ="+product);
    System.out.println("the division of 600 and 10 is ="+division);
    System.out.println("the increment and decrement of 15 is ="+incr+","+decr);
    System.out.println("the remainder of 14 and 5 is ="+remainder);
  }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}