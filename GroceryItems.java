 /* JFM1T5_Assignment :

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/
//import scanner class
import java.util.*;

//Define main class
public class GroceryItems 
{

//Define the main method
public static void main(String[] args)
  {
    //Declare and initialize variables
    double temp=0;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of Elements");
    int len=sc.nextInt();
    System.out.println("Enter a Elements");

    double a[]=new double[len];

    
//Take the 10 different expenses price Check the 10 different expenses price using for loop
       for(int i=0;i<len;i++)
       {
         a[i]=sc.nextDouble();
  //Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
         if(temp<=a[i])
          {
           temp=a[i];
      
           }
  
         }
//Print the result
System.out.println("The highest price you incurred is "+temp);


}
}