package array;
import java.util.Scanner;
public class LabNegativeArray {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	int size,i;	         //initializing variables
	System.out.println("Please enter an Array size: ");
	size = sc.nextInt();
	int[] Neg_arr = new int[size]; //Initializing Array 
	System.out.println("Enter "+size+" element in an array:");
	for(i=0;i<size;i++) 
	{
		Neg_arr[i] = sc.nextInt();  //Adding elements in Array
	}
	//Loop through the array for negative value
	System.out.println("List of Negative Elements in an Array : ");
	for(i= 0;i<size;i++)
	{
		if(Neg_arr[i]<0) 
		{
			System.out.print(Neg_arr[i]+" ");
		}
	}
}
}
