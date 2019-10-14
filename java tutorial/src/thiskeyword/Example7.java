package thiskeyword;

public class Example7 {
	int i=90;
	Example7()
	{//this can be passed as an argument in the current class constructor call.
		Example6 obj = new Example6(this);
		obj.display();
		}
	public static void main(String[]args)
	{
	Example7 obj = new Example7();	
	}

}
//If we want to call parent class constructor in child class then parent class should have child class reference.
//NOT CLEAR WITH THIS CONCEPT.