package thursdaylab;
import java.util.Scanner;
public class SumOfAlphaNumericString {
public static void main(String []args)
{
    //declare variables
    String str;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter alphanumeric string: "); // taking input from user
    str=sc.nextLine();
    
    for(int i=0;i<str.length();i++)
    { 
    	//check character is digit and find numeric value of character
    	if(str.charAt(i)>='0' && str.charAt(i)<='9')
    	{
    		// then add it to sum variable
    	    sum+=(str.charAt(i)-'0');
    	}
                    
    }   
    //display output
    System.out.println("Sum of all the digit present in String:" +sum);
}
}
