package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
//The following are the types of exceptions we can get in java.

public class TypesofExceptions {
	public static void arithmeticexception()//unchecked Exception.
	{
	int i =5/0;
	System.out.println(i);
	System.out.println("Arithmetic Exception");
	}
	
	public static void arrayindexoutofboundsexception()//unchecked Exception.
	{
	int arr[]= new int[5];
	System.out.println(arr[6]);
	System.out.println("Array Index outofbound Exception");
	}
	public static void nullpointerexception()//unchecked Exception.
	{
	String str= null;
	System.out.println(str.length());
	System.out.println("Null pointer Exception");
	}
	public static void stackoverflow(){
		ArrayList<Integer> arr=new ArrayList<Integer>();//Unchecked Exception
		while(true)
		{
		System.out.println(arr.add(10));	
		}
	}
	public static void outofmemoryexception()
	{
	long l[]= new long[1000000000];	//unchecked Exception
	System.out.println(l);
	}
	public static void filenotfoundexception() throws FileNotFoundException  //checked Exception.
	{
	FileReader fr = new FileReader("c:\\test.xslx");	
	}
	public static void numberformatexception()//unchecked Exception(runtime exceptions)
	{
	String s= "Hi";
	int i= Integer.parseInt(s);
	System.out.println(i);
	}
	public static void timeoutexception() throws InterruptedException//checked Exception.(compile time exception)
	{
	Thread.sleep(3000);	
	System.out.println("Timeout exception");
	}
	
	
	public static void illegalstateexception()//unchecked exception
	{
	String s="hello";
	Scanner sc= new Scanner(s);
	System.out.println(sc.nextLine());
	sc.close();
	System.out.println(sc.nextLine());
	}
	public static void classnotfoundexception() throws ClassNotFoundException//checked exception.
	{
	Class.forName("test");	
	}
	public static void main(String[]args) throws InterruptedException, ClassNotFoundException
	{
		classnotfoundexception();
	}


}
