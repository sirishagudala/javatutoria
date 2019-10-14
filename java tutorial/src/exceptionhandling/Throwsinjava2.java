package exceptionhandling;

import java.io.FileNotFoundException;

/*public class Throwsinjava2 extends Throwsinjava
{
public static void main(String[]args) throws FileNotFoundException{
	Throwsinjava obj= new Throwsinjava();
	
	obj.callvalidateage();
	System.out.println("Throws in java code");


}
}*/
//until we handle the exception we have to declare the throws declaration when ever we call that particular method.
//we can handle the above exception like this.

  public class Throwsinjava2 extends Throwsinjava
{
public static void main(String[]args) throws FileNotFoundException{
	Throwsinjava obj= new Throwsinjava();
	try{
	obj.callvalidateage();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	System.out.println("Throws in java code");
}
}
 