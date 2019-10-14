package thiskeyword;

public class Example4 {
	//This keyword can be used to invoke current class method.
	public void display()
	{
		//this.show();// no need to add this.show() to invoke show method. compiler does that by default. we can just write as show()
		System.out.println("I am in display method");
	}
	public void show()
	{
		display();
		System.out.println("I am in show method");
	}
	public static void main(String[]args)
	{
	Example4 obj = new Example4();
	obj.show();
	}

}
