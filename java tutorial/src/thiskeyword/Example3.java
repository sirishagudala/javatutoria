package thiskeyword;

public class Example3 {
	Example3()
	{
		System.out.println("default constructor");	
	}
	Example3(int i)
	{
		this();
		System.out.println("parameterized constructor(int i)");	
	}
	/*Example3(int i,int j)
	{
		System.out.println("parameterized constructor(int i,int j)");
		this(10);//Constructor call must be the first statement in a constructor.
	}*/
public static void main(String[]args)
{
	Example3 obj = new Example3(1250);
	
	
}
}
