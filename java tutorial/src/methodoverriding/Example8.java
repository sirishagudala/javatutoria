package methodoverriding;

public class Example8 extends Example7 {
	/*protected void test1()//we cannot reduce the visibility of the inherited method from example7.
	{
		System.out.println("Child class test1()");
	}*/
	public void test1()
	{
	System.out.println("Child class test1()");	
	}
public static void main(String[]args)
{
	Example7 obj = new Example8();
	obj.test1();
}
}
