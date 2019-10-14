package methodoverriding;

public class Example6 extends Example5 {
	public void test1(int a,int b,int c)
	{
	System.out.println("Child class example6");	
	}
	public static void main(String[]args)
	{
	Example5 obj = new Example6();
	obj.test1(10,20);
	}

}
