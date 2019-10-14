package accessmodifiers;

public class Modifiersexample5 extends Modifiersexample1 {
	public static void main (String[]args){
		Modifiersexample5 obj = new Modifiersexample5();
		obj.test1();
		obj.test3();
		obj.test4();
		System.out.println("********************");
		System.out.println(obj.i);
		System.out.println(obj.c);/*we can access protected method of one class in another class through inheritance in different class
		of same package as well as of different package through inheritance.The only difference is while we are dealing with the same
		package we don't need to import packagename.classname unlike different package.In this class we can access all the modifiers
		except private.*/
		System.out.println(obj.j);

	}

}
