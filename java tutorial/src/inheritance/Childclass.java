package inheritance;

public class Childclass extends Parentclass{//syntax for inheritance.
	public void test3()
	{
		System.out.println("child class test3()");
	}
public static void main (String[]args){
	Childclass obj = new Childclass();//here we are creating object for the child class with reference of child class.
	//Parentclass obj = new Parentclass();
	obj.test1();
	obj.test2();
	obj.test3();
	
	/*If we want to acquire the properties from the parent class only then we can create an object for the child class with reference 
	 * of child class or also we can create an object for parent class with the reference of parent class.*/

//Child class doesnt bother whether parent class have the main method or not.
}
}
