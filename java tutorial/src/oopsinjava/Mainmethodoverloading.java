package oopsinjava;//we can have any number of main methods in a class by method overloading but with different parameters.

public class Mainmethodoverloading {
public static void main (int a)
{
a = a+1;
System.out.println(a);	
}
public static void main (String[] args)
{
System.out.println("main method invoked");
main(10);
}
}
