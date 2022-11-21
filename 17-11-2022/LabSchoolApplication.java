package oopsconcept;

class Person1 
{
	 String name,dateOfBirth;
	 public Person1(String name,String dateOfBirth)
	 {
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	 }
	 public String getname()
	 {
		 return name;
	 }
	 public void setname(String name) 
	 {
		 this.name = name;
	 }
	 public String getdateOfBirth()
	 {
		 return dateOfBirth;
	 }
	 public void setdateOfBirth(String dateOfBirth) 
	 {
		 this.dateOfBirth=dateOfBirth;
	 }
}

class Teacher extends Person1 
{
    int salary;
    String subject;
    public Teacher(String name,String dateOfBirth,int salary,String subject)
    {
    	super(name,dateOfBirth);
    	this.salary=salary;
    	this.subject=subject;
    }
    public int getsalary()
    {
    	return salary;
    }
    public void setSalary(int salary) 
    {
		this.salary=salary;
	}
	public String getSubject() 
	{
		return subject;
	}

	public void setSubject(String subject) 
	{
		this.subject=subject;
	}
}
class Student1 extends Person1
{
	int StudentId;
	public Student1(String name,String dateOfBirth,int StudentId)
	{
		super(name,dateOfBirth);
		this.StudentId=StudentId;
	}
	public int getStudentId() 
	{
		return StudentId;
	}
	public void setStudentId(int StudentId) 
	{
		this.StudentId=StudentId;
	}
}

class CollegeStudent extends Student1
{
	String collegeName;
	String year;
	public CollegeStudent(String name,String dateOfBirth,int StudentId,String collegeName,String year)
	{
		super(name,dateOfBirth,StudentId);
		this.collegeName=collegeName;
		this.year=year;		
	}
	public String getCollegeName() 
	{
		return collegeName;
	}
	public void setCollegeName(String collegeName) 
	{
		this.collegeName=collegeName;
	}
	public String getYear() 
	{
		return year;
	}
	public void setYear(String year) 
	{
		this.year=year;
	}
}

public class LabSchoolApplication {
public static void main(String []args)
{
    System.out.println("College Application");    
    System.out.println("--------------------------------------");
    Teacher tea=new Teacher("Monalisa Chakraborty","15-07-1995",50000,"Java Full Stack");
    System.out.println("Teacher Name: "+tea.getname());
    System.out.println("Date of Birth: "+tea.getdateOfBirth());
    System.out.println("Salary: "+tea.getsalary());
    System.out.println("She Teaches us Subject: "+tea.getSubject());
    
    System.out.println("--------------------------------------");
    Student1 stud=new Student1("Ravindra","12-12-2002",101);  
    System.out.println("Student Name: "+stud.getname());
    System.out.println("Date of Birth: "+stud.getdateOfBirth());
    System.out.println("Student Id: "+stud.getStudentId());
    
    System.out.println("--------------------------------------");
    CollegeStudent colstud=new CollegeStudent("Ravindra","12-12-2002",101,"Anudip Foundation","First");
    System.out.println("Student Name: "+colstud.getname());
    System.out.println("Date of Birth: "+colstud.getdateOfBirth());
    System.out.println("Student Id: "+colstud.getStudentId());
    System.out.println("College Name: "+colstud.getCollegeName());
    System.out.println("Year of Studying: "+colstud.getYear());

}
}
