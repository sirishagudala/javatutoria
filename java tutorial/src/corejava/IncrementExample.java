package corejava;

public class IncrementExample {
	public static void main(String[]args){
		int a = 20;
		int b = ++a;//pre increment
		/*it increments the 'a' value then stores the value in 'b'
		(a and b both values are increased in this method)*/
		System.out.println(a);
		System.out.println(b);
		int c = 15;
		int d = c++;//post increment
		/* It stores the 'c' value in to 'd'first and then increments the c value
		 * it only increments the c value */
		System.out.println(c);
		System.out.println(d);
		int e = 45;
		int f = e+1;
		/*to know the difference between e+1 and e++*/
		System.out.println(e);
		System.out.println(f);
		int g = 10;
		int h = --g;//pre decrement
		/*It decrements the g value first and then stores the value in h.
		 * here g and h both values gets decreased*/
		System.out .println(g);
		System.out.println(h);
		int i = 20;
		int j = i--;//post decrement
		/*It stores the i value in to j first and then decrements the i value
		 * It only decrements the i value*/
		System.out.println(i);
		System.out.println(j);
}
}
