package corejava;

public class Variables {
	int a = 10;//instance variable 
	String b = "My name is sireesha";//instance variable
	static int c = 20;//static variable
	public void method1()
	{
		int d = 30;//local variable
		System.out.println("Non static method1 value:" +d);
	}
	public void method2()
	{
		double e = 10.55;//local variable
		System.out.println("Non static method2 value is :" +e);
	}
	public static void method3(){
		int f = 40;
		System.out.println("Static method value :"+f);
	
	}
	public static void main (String[]args){
		System.out.println(c);
		Variables obj =new Variables();
		System.out.println(obj.a);
		System.out.println(obj.b);
		method3();
	obj.method1();
	obj.method2();
	obj.method4();
	
	}
	public void method4(){
		String i ="Sireesha";
		System.out.println("String value:" +i);
		
	}
	
}

