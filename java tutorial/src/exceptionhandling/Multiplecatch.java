package exceptionhandling;

public class Multiplecatch {
	public static void main(String[]args)
	{
		int arr[]=new int[4];
		try
		{
			String str= null;
			System.out.println(str.length());
			
		int i=5/1;	
		System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Handled Arithmetic Exception.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Handled ArrayIndexOutOfBoundsException.");
		}
	}
}
