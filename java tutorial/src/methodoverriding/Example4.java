package methodoverriding;

public class Example4 extends Example3 {
	public static void main( String[]args){
		Example3 obj = new Example4();
		
		obj.test3();//private method cant be overrided.
		/*also we cannot decrease the visibility of a method while overriding. for example public method cannot be overrided with p
		 * private or default method */
	}

}
