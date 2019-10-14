package testmodifiers;
/*Accessing protected method and protected variable from Modifiersexample1 by using inheritance*/

import accessmodifiers.Modifiersexample1;

public class Modifiersexample4 extends Modifiersexample1{
public static void main (String[]args)
{
	Modifiersexample4 obj = new Modifiersexample4();//here we are creating object for current class only.
	obj.test1();
	obj.test3();
	System.out.println("***************************");
	System.out.println("public variable from Modifiersexample1 : " +obj.i);
	System.out.println( "public variable from Modifiersexample1 : " +obj.c);
}
}
