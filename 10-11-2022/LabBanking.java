/*Write a program to create a Bank class to calculate withdraw and deposit.for withdraw,
 *amount will be given by user.if amount is sufficient then “withdraw successful”
 *Later on deposit 5000rs in the account balance. Ex.:10000 after withdraw 5000,
 *current bal=5000,after deposit 5000 total bal=10000.

*/
package oopsconcept;
import java.util.Scanner;
class Bank
{
Scanner sc=new Scanner(System.in);
float total=10000,withdraw,deposit;

void withdraw()
{
	System.out.println("Total Available Balance is:"+total);
	System.out.println("---------------------------------------");
	System.out.print("Enter amount that you want to withdraw:");
	withdraw=sc.nextFloat();
	if(total>=withdraw)
	{
		total-=withdraw;
		System.out.println("Withdraw Successful:"+withdraw);
		System.out.println("After Withdraw current balance is:"+total);
	}
	else
	{    
		System.out.println("Insufficient Balance."+withdraw);
	     deposit();
		System.out.println("Available Balance is:"+total);
	}
	
}
     
void deposit()
{  
	System.out.println("=======================================");
	System.out.print("Enter amount that you want to Deposit:");
	deposit=sc.nextFloat();
	total=total+deposit;
	System.out.println("Deposited Successful:"+deposit);
	System.out.println("After Deposited Balance is:"+total);
}
}
public class Banking {
public static void main(String []args)
{
      Bank obj=new Bank();
      obj.withdraw();
	
}
}
