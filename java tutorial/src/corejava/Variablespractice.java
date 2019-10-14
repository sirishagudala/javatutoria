package corejava;

public class Variablespractice {
double d = 12.343434;//instance variable
static int i =456;//static variable
public void methoda(){
	System.out.println("Q. What is your name?");
}
public void methodb(){
	System.out.println("Q. What is your huband's name?");
}
public static void method(){
	String s = "Sireesha";
	System.out.println("A. My name is : "+s);
}
public void method1(){
	String a = "Rajesh";
	System.out.println("A. My husband name is : " +a);
	
}
public void method3(){
	boolean b = false;
	System.out.println("Q. you are single : "+b);
}
public static void main(String[] args){
	Variablespractice obj = new Variablespractice();
	obj.methoda();
	method();
	obj.method3();
	obj.methodb();
	obj.method1();
	System.out.println("double value : " +obj.d);
	System.out.println("integer value : "+i);
	
}

}
