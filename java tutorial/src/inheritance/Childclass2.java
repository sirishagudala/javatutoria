package inheritance;

public class Childclass2 extends Parentclass2 {
	public void test3(){
		System.out.println("Child class test3()");
	}
	public static void main (String[] args){
		
		//Parentclass2 obj = new Childclass2();
		/*If we create an object for the child class with reference of parent class we can 
		acquire parent class properties only.If we want to acquire parent class as well as child class properties then we have to create 
		object for child class with reference of child class only */
		Childclass2 obj = new Childclass2();
		obj.test1();
		obj.test2();
		obj.test3();
		//multiple inheritance is not possible. We can not inherit from multiple parent classes in a single child class.
	}
	

}
