package thiskeyword;

public class Example6 {
	//this keyword also passed as an argument in the constructor call.
	int i;
	Example6(Example7 obj)
	{
	i=obj.i;	
	}
	public void display(){
		System.out.println("value of i is: "+i);
	}

}
