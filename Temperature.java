 /* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.*;

public class Temperature{

//Define the main method
public static void main(String[] args)
  {
    //Declare the variables and initialize
    float temp=1000;
    int a=0;
    int day=0;


//Take temperature of 7 days as a input from user
Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of days ");
    int len=sc.nextInt();
    float temperature[]=new float[len];
    
//Calculate the lowest temperature
 for(int i=0;i<len;i++)
   {
     a=i+1;
     System.out.println("Enter the temperature of Day :"+a);
       temperature[i]=sc.nextFloat();
     if(temp>=temperature[i])
     {
       temp=temperature[i];
       day=i+1;
     }
   }
    
//Print the result
        System.out.println("The lowest temperature of the week "+day+" is "+temp+" celsius");
    
    }
}




// very goood
