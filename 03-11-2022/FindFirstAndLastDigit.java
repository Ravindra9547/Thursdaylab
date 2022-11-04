//Write a program to find out first and last digit from a number.

package basicprogram;

import java.util.Scanner;

public class FindFirstAndLastDigit {
public static void main(String [] args) 
{     
	Scanner sc=new Scanner(System.in);
	int num,firstdigit,lastdigit;      //declare variables
	System.out.println("Please Enter any Number that you wish : ");   // taking input from user
    num = sc.nextInt();	
    // finding the first digit of the number :taking while loop
	firstdigit = num;
	while(firstdigit >= 10)
	{
		firstdigit = firstdigit / 10;
	}	
	//  finding the last digit of the number :taking modulo with 10
	 lastdigit = num % 10;
		//display output
	 System.out.println("The First Digit of a Given Number " + num + "  =  " + firstdigit);
	 System.out.println("The Last Digit of a Given Number " + num + "  =  " + lastdigit);
	}
}
