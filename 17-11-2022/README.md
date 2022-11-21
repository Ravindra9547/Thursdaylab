Lab Topics Covered on 17-11-2022

Hands-on Assignments for Inheritance
------------------
1. LabAnimals.java
------------------
Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

2.LabPerson.java
-----------------
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee who will inherit the Person class.The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have a necessary constructors and getter/setter methods. 

Write another class called TestEmployee, containing a main method to fully test your class definition.

3.LAbSchoolApplication.java
-----------------------------
Create a school application with a class called Person. Create name and date0fBirth as member Variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member Variable called studentld.

Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create	objects	of	each  of this	c1asses ,	invoke and test the methods that are available in these classes.

4.LabInheritanceActivity.java
-------------------------------
After completing the hands-on exercises, you will be able to:

• Implement Inheritance in your program
• Apply method overriding concept in inheritance

Scenario: In a company there are employees with two designations Manager and Trainee. Both employees share the same set of attributes and basic salary calculation logic is same but the basic salary of trainee and manager are different.

The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other employees the travel allowance is 10% of the basic salary. Write a program to maintain the entities using inheritance.

Problem Statement 1:

1. Create a class Employee with the following instance variables.

Instance variables        and                   Data type                     
employeeId                 -                     long,
employeeName                -                    String,
employee Address             -                   String,
employee Phone                -                  long,
basicSalary                    -                 double,
-------------------------------------------------------------
specialAllowance double default value- 250.80
Hra double,default value-1000.50
------------------------------------------------------------
2. Create an overloaded constructor in the employee class, which takes the below constructor parameters and initializes them to their respective instance variables.

Constructor parameter       and                   Instance Variable
Id                          -                   employeeId
Name                         -                  employeeName
address                       -                 employeeAddress
phone                          -                employeePhone
--------------------------------------------------------------------
3. Create a method calculateSalary in which the basic salary needs to be calculated as below.

salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);

The calculated salary should be displayed in the console.

 NOTE: salary is a local variable.
 
4. Create the sub classes Manager and Trainee with base class Employee. Create overloaded constructors which takes the below parameters and initializes them to their respective variables in the super class.

Constructor parameter         and                 Instance Variable
id                             -                employeeId
Name                            -               employeeName
address                          -              employeeAddress
phone                             -             employeePhone
salary                             -            basicSalary
---------------------------------------------------------------------------
5. Create a class “InheritanceActivity.java” with a main method which performs the below functions,

Test case #1:

• Create an instance of Manager class by calling the overloaded constructor with 
the below parameters,

Constructor parameter        and                 Instance Variable
id                            -                126534
Name                           -               "Peter"
address                         -              "Chennai India”
phone                            -             237844
salary                            -            65000
------------------------------------------------------------------
• Invoke the calculateSalary method of the manager object. 
The salary calculated should be printed in the console.

Test case #2:

• Create an instance of Trainee class by calling the overloaded constructor with the below parameters,

Constructor parameter        and                Instance Variable
id                            -               29846
Name                           -              "Jack"
address                         -             "Mumbai India”
phone                            -            442085
salary                            -           45000
----------------------------------------------------------------
• Invoke the calculateSalary method of the trainee object. 
The salary calculated should be printed in the console.

Problem Statement 2:

i. Add a method called calculateTransportAllowance in Employee class which should calculate the transport allowance by calculating 10% (default allowance) of the salary. Print the salary after calculating. 

transportAllowance = 10/100*basicSalary.

ii. For a manager, the transportation allowance is 15% of the basic salary. So override the calculateTransportAllowance method in Manager class which should calculate the transport allowance as 15% of the base salary. Print the salary after calculating. 

transportAllowance = 15*basicSalary /100.

iii. For a trainee, the transport allowance is same as the default allowance; the method calculateTransportAllowance in the base class can be used. 

iv. Invoke the calculateTransportAllowance for the manager and trainee class in the main 
method of InheritanceActivity.java

5.LabVaccination.java
---------------------
Ques: create class vaccine.create 2 concrete method firstDose() and 2ndDose().

Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs.

Scenario 2: user can take 2nd dose if already the first dose has completed.

Scenario 3: create class Bootstar dose and extend vaccine class.create static method boosterDose() in class Bootstar dose.if user has completed dose 1 and dose 2 then they are eligible for booster dose.
