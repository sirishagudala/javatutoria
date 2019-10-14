package accessmodifiers;

public class Modifiersexample1 {
	public int i = 10;
	private String str = "Hello";
	protected char c = 's';
	int j = 10;
	public static void main (String[]args)
	{
	Modifiersexample1 obj = new Modifiersexample1();
	obj.test1();
	obj.test2();
	obj.test3();
	obj.test4();
	System.out.println(obj.i);
	System.out.println(obj.str);   /*all access modifiers are accessible within the class*/
	System.out.println(obj.c);
	System.out.println(obj.j);


	}
	public void test1()/*public modifier is accessible from anywhere.we can access this from different class from same package and
	                  also access this from different package*/
	{
	System.out.println("Access modifier public");	
	}
	private void test2()/* private can be accessible with in the class only*/
	{
	System.out.println("Access modifier private");	
	}
	protected void test3()/*we can access protected from different class by ceating an object of this class in that class.
	                        We can also access this protected from completely different package by using inheritance */
	{
	System.out.println("Access modifier protected");	
	}
	void test4()/*if we dont use any modifier then it would be treated as default modifier.The default modifier is accessible only
	            with in the package.*/
	{
		System.out.println("Access modifier default");
	}

}
