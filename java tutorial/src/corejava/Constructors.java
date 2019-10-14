package corejava;

public class Constructors {
int a;//Global variables
int b;
Constructors(){
	System.out.println("Default constructor");
}
Constructors(int a, int b)
{
	this.a = a;
	this.b = b;//If global variables and local variables are same then we use this keyword
	System.out.println("Parameterised constructor");
}
public static void main(String[]args){
	Constructors obj = new Constructors();
	Constructors obj1 = new Constructors(80,90);
}
}
