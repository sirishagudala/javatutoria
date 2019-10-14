package oopsinjava;// A class can have more than one method with same name but must have difference in number of parameters or datatypes.

public class Methodoverloading {
	public static void main(String[]args)
	{
	Methodoverloading obj = new Methodoverloading();
	obj.calculatearea(4);
	obj.calculatearea(4,5);
	obj.calculatearea(3,7,2);
	}
	public void calculatearea (int l)
	{
	System.out.println("The area of the square is :" +l*l);	
	}
	public void calculatearea (int l, int b)
	{
	System.out.println("The area of the rectangle is : " +l*b);	
	}
	public void calculatearea (int l, int b , int h)
	{
	System.out.println("The area of the triangle is : " +l*b*h);	
	}
	

}
