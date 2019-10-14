package exceptionhandling;

public class Finallyinjava {
//Eventhough exception is there the code written in Finally block will be executed.
	public static void arithmeticException(){
   int i;
	try
	{
		 i=5/0;
	}
	catch(Exception e){
		e.printStackTrace();
	}
	finally
	{
		System.out.println("finally block always executes");
	}
		
	}
	
	public static void main(String[] args)
	{
		arithmeticException();	
	}
}
