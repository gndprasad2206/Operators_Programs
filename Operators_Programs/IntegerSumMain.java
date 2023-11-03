/*Question 4: 

You are given an array of integers. The array contains both positive and negative numbers. Your task is to find the two numbers in the array whose sum is closest to zero. If there are multiple pairs with the same absolute sum, return the pair with the smallest positive number. 

Write a Java program that takes an array of integers as input and returns the two numbers whose sum is closest to zero. 

Input: 

int[] nums = {1, 5, -4, -2, 9, -7, 3}; 

Output: 

result = [-2, 1] */
import java.util.Scanner;
class IntegerSum{
  public void doSum(int nums[]){
    int sum=0,check=0,num1=0,num2=0,neg=0,pos=0;
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        sum=nums[i]+nums[j];
        if(sum<=check){
          if(sum<0&&neg>sum){
            neg=sum;
            num1=nums[i];
            num2=nums[j];
            
          }
          else{
            num1=nums[i];
            num2=nums[j];
          }
        }
      }
    }
    System.out.println(num1+","+num2);
  }
}
public class IntegerSumMain{
  public static void main(String[] args){
    int range;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range of the array");
    range=sc.nextInt();
    int nums[]=new int[range];
    System.out.println("Enter the elements into array");
    for(int i=0;i<range;i++){
      nums[i]=sc.nextInt();
    }
    IntegerSum call=new IntegerSum();
    call.doSum(nums);
  }
}