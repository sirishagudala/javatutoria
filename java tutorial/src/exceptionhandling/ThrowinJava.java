package exceptionhandling;

public class ThrowinJava {
//Throw keyword is used to throw customised exceptions.
	public static void validateage(int age){
		if(age<18)
		{
		 throw new ArithmeticException("person is not eligible");	
		}
		else
		{
			System.out.println("person is eligible for votiong");
		}
	}
	public static void main(String[] args) {
		//validateage(15);
		validateage(20);
	}
}
