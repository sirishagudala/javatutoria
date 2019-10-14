package methodoverriding;

public class Example10 extends Example9 
{
	/*final void test1()//cannot override the final method from the parent class.
	{
		System.out.println("Child class test1() method");
	}*/
	/*public void test2()//This instance method cannot override the static method from Example9.
	{
		System.out.println("Child class test2() method");
	}*/
	public void test()
	{
		System.out.println("Child class test() method");
	}
	public static void main(String[]args)
	{
	Example10 obj = new Example10();
	obj.test2();
	obj.test();
	}

}
