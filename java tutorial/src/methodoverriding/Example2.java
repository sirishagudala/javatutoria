package methodoverriding;

public class Example2 extends Example1 {
	public void test1(){
		System.out.println("Child class test1()");
	}
	public static void main (String[]args)
	{
		Example2 obj = new Example2();
		//Example1 obj = new Example2();in this case also child class will be given priority.
		obj.test1();
	}
}
//child class methods will be given priority in method overriding.