package oopsinjava;

public class Functionsinjava {
	public static void main(String[] args){
		Functionsinjava obj = new Functionsinjava();
		obj.test1();
		obj.test2();
		obj.test3();
		int n = obj.test6(3,4);
		System.out.println(n);
		int g = obj.test6(1,2, 3);
		System.out.println(g);
	}
	public void test1(){
		int i = 10;
		String s = "Australia";
		System.out.println(i);
		System.out.println(s);
		
	}
public int test2(){
	int a = 10;
	int b = 20;
	int c =(a+b);
	System.out.println(c);
	return c;
}
public String test3(){
	String Firstname = "Rajesh";
	String Lastname = "Kamuju";
	String Name = test4(Firstname,Lastname);
	//System.out.println(Name);
	return Name;
	
}
public String test4(String Firstname,String Lastname)
{
	String Name =(Firstname + Lastname);
	System.out.println(Name);
	return Name;
}



public int test6(int x, int y)
{
	int z= x+y;
	return z;
}
public int test6(int x,int y, int z)
{
	int f= x+y+z;
	return f;
}
}


