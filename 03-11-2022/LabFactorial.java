//Write a program to calculate factorial of a number.

package basicprogram;
import java.util.Scanner;
public class Factorial {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int i,num,fact=1;           //declare variables
	System.out.println("Enter a number:");       // taking input from user
	num=sc.nextInt();
	for(i=1;i<=num;i++)              //running loop form 1 to number of times
	{
		fact=fact*i;	             // calculating factorial
	}
	System.out.println("The Factorial of " +num+ "!= " +fact);   //display output
	
}
}
