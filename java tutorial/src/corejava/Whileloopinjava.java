package corejava;

public class Whileloopinjava {
	/*In while loop condition is evaluated first and if it returns true then the statements inside while loop execute.
	 * when condition returns false, the control returns false, the control comes out of the loop and jumps to the next statement*/
	
	/*syntax of while loop
	 * while(condition)
	 * {
	 * statement(s)
	 * }*/
	
	public static void main(String[]args){
		int i=10;//initialization
		while(i>1)//condition
		{
			System.out.println("The value of i :"+i);
			i--;//incriment or decrement
		}
		/*It is important to use increment or decrement statement inside while loop so that the loop variable gets changed on each 
		 * iteration, and at some point condition returns false. This way we can end the execution of while loop otherwise the loop 
		 * would execute indefinitely
		 */
		
		int j = 5;
		while(j<50){
			System.out.println("The value of j is:"+j);
			j++;
		}
			/*example for infinite while loop*/
			/*int k = 50;
		    while(k>5)
		    {
		    	System.out.println("The value of k is:"+k);
		    	k++;
		    }*/
		int l = 50;
		while(l<=100){
			System.out.println("The value of l is : "+l);
			l++;
		}
			
		
		
	}

}
