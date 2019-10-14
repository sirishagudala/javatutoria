package superkeyword;

public class Example4 extends Example3 {
	String name;
	Example4(String name, int age, int salary )
	{
		//1st line of constructor
		//super();
		super(age,salary);
		//this.age=age;
		//this.salary=salary;
		this.name=name;
	}
	Example4()
	{
		//super();
		System.out.println("I am a child class constructor");
	}
	public void display()
	{
	System.out.println("name is : "+name + "age is : "+age+ "salary is : "+salary);	
	}
	public static void main(String[] args)
	{
	Example4 obj= new Example4("sireesha",33,300000);
	obj.display();
	System.out.println(obj.getAge());
	System.out.println(obj.getSalary());
	Example4 obj1=new Example4();
	}

}
