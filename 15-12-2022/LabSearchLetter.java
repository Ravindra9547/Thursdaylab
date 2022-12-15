package array;
import java.util.Scanner;
public class LabSearchLetter {
public static void main(String[] args) 
{

	//mumbai
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your input here:");
	String str = sc.nextLine();
	
	// Checking for 'e' in the string
	if(str.contains("e"))
		System.out.println("'e'  character is present");	
	else
        System.out.println("'e' character is not present");
	
    //I love my India
	System.out.println("\nEnter your input here:"); 
	String str1= sc.nextLine();
	
	//Checking for 'I' in the string	
	if(str1.contains("I"))
		System.out.println("'I' character is present");
	else	
	    System.out.println("'I' character is not present");
}
}
