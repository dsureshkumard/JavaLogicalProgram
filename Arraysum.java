import java.util.*;
public class Arraysum 
{

//Define the main method
public static void main(String[] args)
  {
    int temp=0;
//Declare the variables and initialize
Scanner sc=new Scanner(System.in);
  
//Take input from user
  System.out.println("Enter the size of the array");
    int len=sc.nextInt();
  System.out.println("Enter the "+len+" elements");
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