package oopsconcept;
class Animal
{
	public void eat()
	{
		System.out.println("Eat Method ");
	}
	public void sleep()
	{
		System.out.println("Sleep Method");
	}
}
class Bird extends Animal
{
	
	public void fly()
	{
		super.eat();//override the eat method
		super.sleep();//override the sleep method
		System.out.println("Fly Method ");
	}
}
public class LabAnimals {
public static void main(String []args)
{
	Animal ani=new Animal();
	ani.eat();
	ani.sleep();
	System.out.println("------------");
	Bird bir=new Bird();
	bir.fly();
}
}
