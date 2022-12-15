package array;
import java.util.Scanner;
public class LabCompareTwoString {
public static void main(String []args)
{
	Scanner sc = new Scanner (System.in);
	
	//User input for string1
	System.out.println("Enter first string");
	String str1=sc.nextLine();
		
	//User input for string2
	System.out.println("Enter second string");
	String str2=sc.nextLine();

	//Comparing String 1 and String 2
	boolean result=str1.equals(str2);
    System.out.println("Strings are equal: "+result);
}
}
