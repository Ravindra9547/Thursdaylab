//Write a program to find out the maximum among three numbers.
//in another method
package basicprogram;

import java.util.Scanner;

public class MaximumAmongThreeDigits {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int num1,num2,num3,max;
	System.out.println("Enter three numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
	if(num1>num2)
	{
	   if(num1>num3) 
	  {
		  max=num1;
	  }
	   else //internal else
	   {
		   max=num3;
	   }
	}  //External if end
	else //External else
	{
		if(num2>num3) //internal if
		{
			max=num2;
		}
		else // internal else
		{
			max=num3;
		}
	}
     System.out.println("Maximum number among all three is : "+ max);
}
}