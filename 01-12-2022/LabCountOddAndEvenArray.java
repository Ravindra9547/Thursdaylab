package array;
import java.util.Scanner;
public class LabCountOddAndEvenArray {
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	int size,i,evenCount=0,oddCount=0;  //initializing variables
	//taking size of array
	System.out.println("Please enter size of elements in an array:");
	size = sc.nextInt();	
	
	int [] arr = new int[size];     // Initializing array
	
	System.out.println("Please Enter " +size+ " elements of an Array:");
	for (i=0;i<size;i++)
	{
		arr[i] = sc.nextInt(); //Adding elements in Array
	}   
	for(i=0;i<size;i++)
	{
		if(arr[i] % 2 == 0)    // checking for odd and even  value
		{
			evenCount++;   //Counting all even numbers
		}
		else
		{
			oddCount++;   //Counting all odd numbers
		}
	}		
	//output
	System.out.println("Total Number of Even Numbers in this Array = " +evenCount);
	System.out.println("Total Number of Odd  Numbers in this Array = " +oddCount);
}
}
