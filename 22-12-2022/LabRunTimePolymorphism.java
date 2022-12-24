package thursdaylab;

//base class
class Hillstations
{  
	public void location()
	{
	    System.out.println("Location is");
	}  
	public void famousfor()
	{
	    System.out.println("Famous for");
	}  
}  

//derived class
// inheriting methods from parents class and overriding
class Manali extends Hillstations 
{  
	@Override
	public void location()
	{
	    System.out.println("Manali is in Himachal Pradesh");
	}  
	@Override
	public void famousfor()
	{
	    System.out.println("It is Famous for adventure sports");
	} 
}

//derived class
//inheriting methods from parents class and overriding
class Mussoorie extends Hillstations 
{  
	@Override
	public void location()
	{
	    System.out.println("Mussoorie is in Uttarakhand");
	}  
	@Override
	public void famousfor()
	{
	    System.out.println("It is Famous for Spending Holidays");
	}  	
}
	
//derived class
//inheriting methods from parents class and overriding
class Gulmarg extends Hillstations 
{  
	@Override
	public void location()
	{
	    System.out.println("Gulmarg is in J&K");
	} 
	@Override
	public void famousfor()
	{
	    System.out.println("It is Famous for skiing");
	}  
}
public class LabRunTimePolymorphism {
public static void main(String [] args)
{  
    Hillstations M = new Manali(); //Hillstations reference but Manali object
    Hillstations Mu = new Mussoorie();//Hillstations reference but Mussoorie object
    Hillstations G = new Gulmarg();//Hillstations reference but Gulmarg object

    M.location();  // runs the method in Manali class
    M.famousfor();

    Mu.location();  // runs the method in Mussorie class
    Mu.famousfor();

    G.location();  // runs the method in Gulmarg  class
    G.famousfor();
}		
}
