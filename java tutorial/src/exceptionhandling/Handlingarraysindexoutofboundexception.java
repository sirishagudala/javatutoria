package exceptionhandling;

public class Handlingarraysindexoutofboundexception {
	public static void arrayindexoutofboundexception()
	{
		int arr[] =new int[5];
		try 
		{
			System.out.println(arr[6]);
			
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		System.out.println("handled arrayindexoutofboundexception" );
		
	}

	public static void main (String[]args)
	{
		arrayindexoutofboundexception();
	}
}
