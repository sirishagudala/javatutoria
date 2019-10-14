package exceptionhandling;

public class Multipletryornestedtry {
	public static void main(String[] args) {
		try
		{
		  try
		  {
			  String S = null;
			  System.out.println(S.length());
			  int i=5/0;
			  
		  }
		  catch(ArithmeticException e)
		  {
			 System.out.println(e);
			 System.out.println("Arithmetic Exception is getting called");
		  }
		  /* catch(Exception e)
		  {
			System.out.println(e); //if we write like this arithmetic even though null pointer exception is there Arithmetic exception will 
			be called. Because here we are not writing any specific exception.
			System.out.println("Handling Null pointer Exception");
		  }*/
		  catch(NullPointerException e)
		  {
			System.out.println(e); 
			System.out.println("Handling Null pointer Exception");
		  }
		  try
		  {
			int arr[]= new int[4];
			System.out.println(arr[6]);
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			System.out.println(e);
			System.out.println("Array Index OUt Of Bounds Exception is called");
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Outer Catch Block");
		}
		System.out.println("Normal flow");
	}

}
