package exceptionhandling;

import java.io.FileNotFoundException;

public class Throwsinjava {
	public static void validateage(int age) throws FileNotFoundException 
{
		if(age<18)
		{
		 throw new FileNotFoundException("person is not eligible");	
		}
		else
		{
			System.out.println("person is eligible for votiong");
		}
	}
	/*public static void callvalidateage() throws FileNotFoundException                             
	                                                                 
	{

	validateage(15);
	
	
	System.out.println("Throws in java");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
     callvalidateage();
	}*/
	//to handling the exception.
	public static void callvalidateage() throws FileNotFoundException                             
    
	{
    try{
	validateage(15);
    }
    catch(Exception e){
    	e.printStackTrace();
    	
    }
	
	System.out.println("Throws in java");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
     callvalidateage();
	}

}
