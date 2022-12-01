package array;
import java.util.Scanner;
public class ReverseArray {
public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
    //Initialize array  
    int arr[] = new int[5],size,i;
    //taking size of array
    System.out.println("Enter the size of an array and elements:");
	size=sc.nextInt();
	System.out.println("Enter "+size+" element in an array:");
	 
	for(i=0;i<size;i++)
	{
		System.out.print("Value of index ["+i+"] = ");  // printing index
    	arr[i]=sc.nextInt();
    }
    System.out.println("Original array:");  
    for(i=0;i<size;i++)     	//for(i=0;i<arr.length;i++)  
       { 
    	  System.out.print(arr[i]+" ");  
       }          
         System.out.println("\nArray in reverse order:");  
       
        //Loop through the array in reverse order  
        for(i=size-1;i>=0;i--)        //for(i=arr.length-1;i>=0;i--)   
        {  
            System.out.print(arr[i]+" ");  
        }  	
	}
}
