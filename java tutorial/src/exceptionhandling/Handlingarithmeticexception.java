package exceptionhandling;

public class Handlingarithmeticexception {
	public static void arithmeticexception() {

		int i;
		try 
		{
			i = 5 / 0;
			
		} 
		catch (ArithmeticException e)
		{

			e.printStackTrace();
		}
		System.out.println("Arithmetic exception handled");
	}

	public static void main(String[] args) {
		arithmeticexception();
	}

}
