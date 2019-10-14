package thiskeyword;
/*This() can be used to invoke current class constructor.This approach is better if we have many constructors in current class
 * and want to reuse the constructor.*/

public class Example2 {
	Example2()
	{
	System.out.println("default constructor");	
	}
	Example2(int i)
	{
		this();//It is used to invoke the current class constructor.
	System.out.println("parameterized  constructor(int i)");	
	}
	Example2(int i, int j)
	{
		this(10);
		System.out.println("parameterized constructor(int i,int j)");	
	}
	public static void main(String[]args)
	{
	Example2 obj = new Example2(10,20);
	
	}

}
