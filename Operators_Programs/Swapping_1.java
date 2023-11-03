/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
import java.lang.Math;
class Swapping_1{
  public static void main(String[] args){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value");
    a=sc.nextInt();
    System.out.println("Enter the b value");
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a and b values after swapping is ="+a+","+b);
  }


}