package exceptionhandling;

public class Finallyinjava2 {
	public static void arithmeticException(){
		int i;
		try{
			i=5/0;
		}
		finally
		{
		System.out.println("finally block always executes");	
		}
	}
	public static void main(String[] args) {
		arithmeticException();
	}

}
