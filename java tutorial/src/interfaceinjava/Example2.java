package interfaceinjava;

public class Example2 implements Example1,Example3{
	/*Class implements interface.
	 * Interface extends Interface.
	 * Class extends Class.
	 * One Interface cannot Implements another Interface.
	 * Clas cannot implement another Class.*/
	
	public int i = 20;
	public int j = 50;

	@Override
	public void test1() {
		System.out.println("test1()");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		System.out.println("test2()");
		// TODO Auto-generated method stub
	}
	//@Override
		public void test3()
		{
		System.out.println("test3()");//If we want to initiate new method in Interface implemented class then we have make Override as a comment.
		}
		@Override
		public void test4()
		{
			System.out.println("test4()");
		}
	
	public static void main (String[]args)
	{
		Example2 obj= new Example2();
		obj.test1();
		obj.test2();

		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(k);/*As all data members are by default public static final we can directly call these members in main
		method wiht out using object. And also there is no need to add specifically static public fianl before interface members 
		*/
		System.out.println(l);
		obj.test3();
		obj.test4();
		
	}
	

}
