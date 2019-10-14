package testmodifiers; 
/*in order to access the modifiers from different package first we need to import that package by giving package name.class name*/
import accessmodifiers.Modifiersexample1;

public class Modifiersexample3 {
	public static void main(String[]args)
	{
	Modifiersexample1 obj = new Modifiersexample1();
	obj.test1();
	System.out.println("**************************");/*Here we are able to access public method and public variable only*/
	System.out.println("public variable : "+obj.i);
	}
}
