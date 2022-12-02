//Write a program to find out first and last digit from a number.

package basicprogram;

import java.util.Scanner;

public class FindFirstAndLastDigit {
public static void main(String []args) 
{     
	Scanner sc=new Scanner(System.in);
	int num,firstdigit,lastdigit;      //declare variables
	System.out.println("Please Enter any Number:");   // taking input from user
         num=sc.nextInt();	
        // finding the first digit of the number:taking while loop
	firstdigit=num;   //assigning num value in first digit
	while(firstdigit>=10) //check condition:if first digit is greater or equal to 10 
	{
		firstdigit=firstdigit/10; //then divide first digit(num value) by 10 till firstdigit>=10.
	}                                //and assign the quotient vale in first digit
		//  finding the last digit of the number:taking modulo(%) with 10
	 lastdigit=num%10;  //here num value divided by 10 and remainder will assign in last digit variable
		//display output
	 System.out.println("The First Digit of a Given Number " +num+ "  =  " + firstdigit);
	 System.out.println("The Last Digit of a Given Number " +num+ "  =  " + lastdigit);
}
}
