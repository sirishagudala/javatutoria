package interfaceinjava;

public class Example5 implements Example4 {

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Interface example1 method test1()");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Interface example1 method test2()");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("Interface example3 method test4()");
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		System.out.println("Interface example4 method test5()");
	}
		/*Here we are able to access all the methods in Interfaces Example1, Example3, Example4.This is multiple inheritance.
		 * Multiple inheritance is not possible with respect to Class. But it is possible using Interface.*/
		
	public static void main (String[]args)
	{
		Example5 obj = new Example5();
		obj.test1();
		obj.test2();
		obj.test4();
		obj.test5();
	}

}
