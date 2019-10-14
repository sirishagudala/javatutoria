package thiskeyword;

public class Example5 {
	//This keyword can also be passed as an argument in the method.
	int a;
	int b;
	Example5()
	{
		a=10;
		b=20;
	}
public void display ( int obj)//class object
{
	System.out.println("Value of a is : "+a +"value of B is : "+b);
}
public void get()
{
display(70);
}

public static void main(String[]args)
{
	Example5 obj = new Example5();
	obj.get();
}
}
