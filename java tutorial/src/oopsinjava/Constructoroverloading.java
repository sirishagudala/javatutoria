package oopsinjava;

public class Constructoroverloading {
	public static void main (String[]args)
	{
		Constructoroverloading obj = new Constructoroverloading();//by creating an object we can automatically call the constructor.
		Constructoroverloading obj1 = new Constructoroverloading(20,40);
		Constructoroverloading obj2 = new Constructoroverloading(20,40,60);
		Constructoroverloading obj3 = new Constructoroverloading(24.22,42.44);


		
		
	}
	Constructoroverloading(){
		System.out.println("Default Constructor or no args Constructor");
	}
	Constructoroverloading(int a, int b){
		System.out.println("Parameterised Constructor(int a, int b)"); 
	}
	Constructoroverloading(double a, double b)
	{
		System.out.println("Parameterised Constructor(double a, double b)");
	}
	Constructoroverloading(int a, int b,int c)
	{
		System.out.println("Parameterised Constructor(int a,int b, int c)");
	}
}
