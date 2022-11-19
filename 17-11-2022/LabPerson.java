package oopsconcept;
 class Person 
{
	String name;

	public Person(String name) 
	{
		this.name=name;
	}

	public String getName() 
	{
		return name;
	}

	@Override
	public String toString() 
	{
		return "Person [name=" +name+ "]";
	}
}
class Employees extends Person 
{
		double annualSalary;
		int yearOfStartWorking;
		String nationalInsuranceNo;
		
		public Employees(String name, double annualSalary, int yearOfStartWorking, String nationalInsuranceNo) 
		{
			super(name);
			this.annualSalary = annualSalary;
			this.yearOfStartWorking =yearOfStartWorking;
			this.nationalInsuranceNo = nationalInsuranceNo;
		}

		public double getAnnualSalary() 
		{
			return annualSalary;
		}

		public int getyearOfStartWorking() 
		{
			return yearOfStartWorking;
		}

		public String getNationalInsuranceNo() 
		{
			return nationalInsuranceNo;
		}
		
		@Override
		public String getName() 
		{
			return name;
		}

		@Override
		public String toString() 
		{
			return "Employee\n[AnnualSalary=" + annualSalary + "\nYearOfStartWorking=" + yearOfStartWorking 
					+ "\nNationalInsuranceNo="+ nationalInsuranceNo + "\nName=" + name + "]";
		}	
}	

public class LabPerson {
public static void main(String[] args) 
{
	Employees emp1 = new Employees("Ravindra Kumar Saw", 1000000, 2022, "2022aabbcc");
	System.out.println(emp1);
	
	System.out.println("---------------------");
	Employees emp2 = new Employees("Mr. Shiva", 800000, 2022, "2022ddeeff");
	System.out.println(emp2);
	
}	
}
