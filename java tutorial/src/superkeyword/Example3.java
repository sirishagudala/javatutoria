package superkeyword;

public class Example3 {
	//To explicitly call parent class noarg constructor and parameterized constructor.
	int age; 
	int salary;
	Example3()
	{
	System.out.println("I am a parent class constructor");	
	}
	Example3(int age, int salary)
	{
	this.age=age;
	this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public int getAge()
	{
		return age;
	}
	

}
