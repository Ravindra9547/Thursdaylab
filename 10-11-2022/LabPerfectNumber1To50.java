//Write a program to print Perfect number between 1 to 50.
package basicprogram;

import java.util.Scanner;
public class PerfectNUmber1To50 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i;    // declare and initialize variables
	System.out.println("Perfect Number between 1 to 50:");  //output
	
	for(n=1;n<=50;n++) //check and take input 1 to 50
	{
		for(i=1;i<=n/2;i++) //proper divisor of 6 = 1,2,3
		{
			if(n%i==0) //if n is divisible by i
			{
				sum+=i;    //sum=1+2+3=6
			}
		}
		if(n==sum)   //print perfect number if num is equal to sum
		{
			System.out.println(sum);
		}
		 sum=0;//sum=0 for 2nd iteration
	}
	
}	
	
}	
