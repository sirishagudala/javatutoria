package interfaceinjava;

public interface Example6 {
	//We can also write method implementation in Interface. But only in Java8 onwards
	public void test();
	default void sum()
	{
		int a = 10; 
		int b = 20;
		int c = a+b;
		System.out.println("The addition of a+b is :"+c);
	}
	static void sub()
	{
		int i = 50;
		int j = 60;
		int k = j-i;
		System.out.println("The substraction of two numbers is :" +k);
	}
/*public static void main(String[]args)
{
	Example6 obj = new Example6();we cannot create object in Interface. Likewise we cannot create constructor in Interface.
	 As constructor can be by creating an object, there is no point creating constructor as we can't create an object in 
	 Interface.
	obj.sub();
}*/
}
//There is no point in creating an object in Interface when there is no body for Interface.