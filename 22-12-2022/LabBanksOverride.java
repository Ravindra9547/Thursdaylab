package thursdaylab;
class Bank //parent class
{
	int getRateOfIntrest()
	{
		return 0;
	}
}
//derived class
//inheriting and overriding parent class method
class BOI extends Bank 
{
	int getRateOfInterest()
	{
		return 9;
	}
}
//derived class
//inheriting and overriding parent class method 
class HDFC extends Bank 
{
	int getRateOfInterest()
	{
		return 8;
	}
}
//derived class
//inheriting and overriding parent class method
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

public class LabBanksOverride {
public static void main (String []args)
{
	//Creating object of each class in order to display the output
	BOI boi = new BOI();
	System.out.println("Rate of Interest for HDFC is:"+boi.getRateOfInterest()+"%");
	HDFC hdfc = new HDFC();
	System.out.println("Rate of Interest for PMC is: "+hdfc.getRateOfInterest()+"%");
	SBI sbi = new SBI();	
	System.out.println("Rate of Interest for SBI is: "+sbi.getRateOfInterest()+"%");
} 
}
