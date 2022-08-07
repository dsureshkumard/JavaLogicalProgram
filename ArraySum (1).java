 /*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum 
{

//Define the main method
public static void main(String[] args)
  {
    //Declare the variables and initialize
    int temp=0;

Scanner sc=new Scanner(System.in);
  
//Take input from user
  System.out.println("Enter the size of the array");
    int len=sc.nextInt();
  System.out.println("Enter the "+len+" elements : ");
 int a[] = new int[len]; 
	  
//Check user input values using for loop and add all values
    for(int i=0;i<len;i++)
      {
        a[i] = sc.nextInt();
        temp=temp+a[i];
        
      }
 
//Print the result
    System.out.println("Sum of array elements is :"+temp);
}
}



// very goood
