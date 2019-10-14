package superkeyword;

public class Example2 extends Example1 {
	public String colour= "Green";
	
	public void display()
	{
	System.out.println("Child class colour is : "+colour);
	System.out.println("Parent class colour is : "+super.colour);
	}
	public static void main(String[] args) {
		Example2 obj= new Example2();
		obj.display();
	}

}
