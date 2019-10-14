package interfaceinjava;

public class Example7 implements Example6
{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Interface example6 test");
	}
	public static void main(String[]args)
	{
		Example6 obj = new Example7();
		obj.sum();
		Example6.sub();//Static methods of the Interface can be called by Interface name.method name.
		obj.test();
	}

}
