package oopsconcept;
class Employeees
{
	//instance variable
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80,Hra=1000.50,transportAllowance;
    
	//Constructor
	Employeees(long Id,String Name,String Address,long Phone)
   {
	   this.employeeId=Id;
	   this.employeeName=Name;
	   this.employeeAddress=Address;
	   this.employeePhone=Phone;
   }

	public long getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(long employeeId) 
	{
		this.employeeId = employeeId;
	}

	public long getEmployeePhone() 
	{
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) 
	{
		this.employeePhone = employeePhone;
	}

	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() 
	{
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) 
	{
		this.employeeAddress = employeeAddress;
	}

	public double getBasicSalary() 
	{
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) 
	{
		this.basicSalary = basicSalary;
	}
	//Using Method to Calculate Salary
    void calculateSalary()
    {
    	double Salary;  //local variable
    	Salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
    	System.out.println("The Calculated Salary: "+Salary);
    }
    //Using Method to calculate Transport Allowance
  	double calculateTransportAllowance()
  	{
  		
  		return transportAllowance=10*basicSalary/100;
  		
  	}
}
class Manager extends Employeees
{
	//overloaded constructor
	Manager(long Id, String Name,String Address,long Phone,double Salary)
	{
		super(Id,Name,Address,Phone);
		this.basicSalary=Salary;
	}
	//TransportAllowance Method
	double calculateTransportAllowance()
	{
		
		return transportAllowance=15*basicSalary/100;
	}
}

class Trainee extends Employeees
{
	//overloaded constructor
	Trainee(long Id,String Name,String Address,long Phone,double Salary)
	{
		super(Id,Name,Address,Phone);
		this.basicSalary=Salary;	
	}
	//TransportAllowance same as base class
	double calculateTransportAllowance()
  	{
  		
  		return transportAllowance=10*basicSalary/100;
  		
  	}
}
public class LabInheritanceActivity {
public static void main(String []args)
{
	System.out.println("Manager");
	Manager manager=new Manager(126534,"Peter","Chennai India",237844l,65000d);
	System.out.println("Id: "+manager.getEmployeeId());
	System.out.println("Name: "+manager.getEmployeeName());
	System.out.println("Address: "+manager.getEmployeeAddress());
	System.out.println("Phone: "+manager.getEmployeePhone());
	System.out.println("BasicSalary: "+manager.getBasicSalary());
	manager.calculateSalary();  //invoke manager salary
	System.out.println("Transport Allowance: "+manager.calculateTransportAllowance());
	
	System.out.println("-------------------");
	System.out.println("Trainee");
	Trainee trainee=new Trainee(29846,"jack","Mumbai India",442085l,45000d);
	System.out.println("Id: "+trainee.getEmployeeId());
	System.out.println("Name: "+trainee.getEmployeeName());
	System.out.println("Address: "+trainee.getEmployeeAddress());
	System.out.println("Phone: "+trainee.getEmployeePhone());
	System.out.println("BasicSalary: "+trainee.getBasicSalary());
	trainee.calculateSalary(); //invoke trainee salary
	System.out.println("Transport Allowance: "+trainee.calculateTransportAllowance());
}
}
