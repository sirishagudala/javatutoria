package corejava;

public class Voidandreturninjava {
	
public static void main(String []args){
	
	
	test1();
	multiply2(4,5);
	multiply1(5,4);
}
	
	


public static void test1() {

	int a = 10;
	int b = 20;
    int c = multiply1(a,b);
   // int d = multiply2(a,b);
  //  System.out.println(c);	
    //return c;
	
}
public static int multiply1(int a, int b) {
	int c = (a*b);
	System.out.println(c);
	return c;
}

public static void multiply2(int a, int b) {
	int c = (a*b);
	System.out.println(c);
	//return c;
}



}
