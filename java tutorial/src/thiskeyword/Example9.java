package thiskeyword;

public class Example9 {
//this is only available for non-static
	public void test1()
	{
		this.test3();
		System.out.println("test1()");
	}
	public static void test2()
	{
	//this.test1();	//cannot use in static content.
	}
	public void test3()
	{
		System.out.println("test3()");
	}
	public static void main(String[] args) {
		Example9 obj = new Example9();
		obj.test1();
		
	}
	
}
