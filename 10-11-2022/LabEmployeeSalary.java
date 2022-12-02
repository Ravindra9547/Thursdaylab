/*Write a program to create Employee class assign variables like id,name,basic salary and designation.
 *Using method add values into it. Calculate annual salary base on basic salary.
 *calculate Travel allowance(TA) based on designation. If employee’s designation is manager 
 *then provide TA 2000 and if employee is not a manager then provide 1500 TA. 
 *at last print details of employee along with the annual salary and TA.
 */
package oopsconcept;
import java.util.Scanner;
class Employee
{
	int id;
	float bs,as,ta;
	String name,designation;
	void details(int id,String name,String designation,float ta,float bs)  //parameter variable
	{
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.designation=designation;
		this.ta=ta;
		
	}
	void annualSalary()   //method
	{
		String position="manager";
			     if(designation.equals(position))
			     {
			    	 as=bs*12;
					 as+=ta;
				 }
			     
			     else 
			     {
			    	    as=bs*12;
						as+=ta;
			     }
	}
	   void display()  //method
	   {
		   System.out.println("Id:"+id);
		   System.out.println("Name:"+name);
		   System.out.println("Designation:"+designation);
		   System.out.println("Travel Allowance:"+ta);
		   System.out.println("Annual Salary of Employee with TA:"+as);
	   }   
		
}
public class EmployeeSalary {
public static void main(String []args)	
{
	int id;
	String name,designation;
	float bs,ta;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter Employee id:");
	id=sc.nextInt();
	
	sc.nextLine();
	
	System.out.print("Enter Employee name:");
	name=sc.nextLine();
	System.out.print("Enter Employee Designation:");
	designation=sc.nextLine();
	System.out.print("Enter Travel Allowance:");
	ta=sc.nextFloat();
	System.out.print("Enter Employee Monthly Basic Salary:");
	bs=sc.nextFloat();
	System.out.println("-------------------------------------");
	
	Employee obj=new Employee();
        obj.details(id,name,designation,ta,bs);
	obj.annualSalary();
	obj.display();
}
}
