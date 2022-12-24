package thursdaylab;
import java.util.Scanner;
public class LabRemoveElement {
public static void main(String[] args)
{
	int i,j,size,element; //variable declaration
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter size of elements you want in array:");
    size=sc.nextInt();  //taking size & input from user
    System.out.println("Enter " +size+" Elements: ");
    int[] arr=new int[size];//declare array  
    for(i=0;i<size;i++)
    {
       arr[i]=sc.nextInt(); //Array element from user
    }
    //removing element
    System.out.print("Enter the Element to Remove: ");
    element=sc.nextInt();
    
    boolean status=false;
    for(i=0;i<size;i++)
    {
       if(element==arr[i])
       {
    	   //shifting element
          for(j=i;j<size-1;j++)
          {
              arr[j]=arr[j+1];
          }
          System.out.println("\nRemoved the element successfully!");
          status=true;
          break;
       }
    }
    if(status==true)
    {
        System.out.println("\nThe new array is: ");
        
      //display after remove element in array
        for(i=0;i<size-1;i++)  	
        {
            System.out.print(arr[i]+" ");	
        }
    }
    else
    {
    	System.out.println("\nElement not found!");
    }
}
}
