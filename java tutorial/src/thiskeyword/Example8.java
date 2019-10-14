package thiskeyword;

public class Example8 {
	/*We can return the this keyword as an statement from the method. In such case, return type of the method must be the class type
	 *  (non-primitive). Let's see the example:
	 *  This can also be used to return current class instance. 
*/
	int i =90;
	public  Example8 test1()
	{
	return this;
	
	}
	public Example8 test2()
	{
		return new Example8();//Instead of using 'this' we can also write like the this way.
	}
	public static void main(String[] args) {
		Example8 obj = new Example8();
		System.out.println(obj.i);
	obj.test1();
		obj.test2();
	}

}
