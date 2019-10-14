package oopsinjava;

public class Methodoverloading1 {
	public static void main (String[]args)
	{
		Methodoverloading1 obj = new Methodoverloading1();
		obj.test (30,40);
		obj.test(29.5, 45.4);
	}
	/*public void test(int a, int b)//this method cannot be called by giving double parameters.
	{
		System.out.println("test(int a, int b)");
	}*/
	public void test(double a, double b)//this method will also be called by giving integer parameters 
	{
	System.out.println("test(double a, double b)");	
	}

}
