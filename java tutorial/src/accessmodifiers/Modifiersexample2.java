package accessmodifiers;

public class Modifiersexample2 {
	public static void main(String[]args)
	{
		Modifiersexample1 obj = new Modifiersexample1();/*here we creating an object for Modifiersexample1 class as we are intended 
		to access the methods and variables which are initiate in the Modifiersexample1 class */
		obj.test1();
		obj.test3();
		obj.test4();
		System.out.println("**************************");
		System.out.println(obj.i);
	                             
		System.out.println(obj.c);
		System.out.println(obj.j);

	}

}
