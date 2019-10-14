package thiskeyword;

public class Example1 {
	/*If there is ambiguity between instance variable and local variables(arguments) this keyword is used to clear those confusion.
	 * This keyword is used to refer the current class instance variables.*/
	//The following will happen if we don't use this keyword if instance and local variables are same.
	int age;
	String name;
	
	/*public  Example1(int age, String name)
	{
		age=age;//The default value for the string null will be printed for the name. 0 will be printed for the age.
		name=name;
	}*/
/*	public Example1( int age,String name )
	{
		this.name = name;
		this.age = age;
	}*/
	//This keyword is not useful where the local and instacne variables are different with each other.
	public Example1(int i, String n)
	{
		age = i;
		name = n;
	}
	public void display()
	{
		System.out.println("The name of the student is: " +name +" The age of the student is : " +age);
	}
	public static void main(String[]args){
		Example1 obj = new Example1(34, "Rajesh");
		obj.display();
	}
	 

}
