package array;
import java.util.Scanner;
public class LabOccurenceCountString {
public static void main(String []args)
{
	String input;         // Character to input 
    char search;          // Character to search
	int count=0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your input String:");
	input = sc.nextLine();

	System.out.println("Enter the character you wish to search for:");
	search = sc.next().charAt(0);
	
	// To search for the character
	for(int i=0;i<input.length();i++)
	{
	    if(input.charAt(i)==search)
	    count++;  //To count and store the occurrence of the character
    }
    System.out.println("The Character '"+search+"' appears "+count+" times.");
	}	   
}

