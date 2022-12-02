package array;
import java.util.Scanner;
public class LabCopiedArray {
public static void main (String []args)
{
	Scanner sc = new Scanner(System.in);
	int i,size; //Initializing variable
	System.out.println("Enter the size of the Array: ");
	size = sc.nextInt(); 
	
	int arr1[] = new int [size]; //Initializing Array 1
	int arr2[] = new int [size]; //Initializing Array 2
	
	System.out.println("Enter "+size+" elements to add into the Array:");
	
	for(i=0;i<size;i++)
	{
		arr1[i]=sc.nextInt(); //Adding elements in Array 1
	}
	System.out.println("New Copied Array from previous one is follows:");
	
	for(i=0;i<size;i++)
	{
		arr2[i] = arr1[i];  //Copying Array 1 into Array 2
		System.out.print(arr2[i]+" "); //output new copied Array
	}
}
}
