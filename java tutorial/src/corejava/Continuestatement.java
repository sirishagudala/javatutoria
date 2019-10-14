package corejava;

public class Continuestatement {
	/*Continue statement is mostly used inside loops.Whenever it is encountered inside a loop,control directly jumps to the beginning 
	 * of the loop for next iteration,skipping the execution of statements inside loop's body for the current iteration.This is useful when 
	 * you want to continue the loop but do not want the rest of the statements(after continue statement)in loop body to execute for 
	 * that particular iteration
	 * Syntax : continue;*/
	public static void main(String[]args){
		/* Continue statement usage in while loop*/
		int var = 50;
		while (var<=60)
		{
			if(var == 52)
			{
				var++;
	            continue;
	            
			}
			
			System.out.println("The value of var is :"+var);
			var++;
			
		}
		/*Continue statement usagen in for loop*/
		int j;
		for(j=10;j<=15;j++)
		{
			if(j==14)
			{
				continue;
			}
			System.out.println("The value of j is : "+j);
			int k = 60;
			while(k>=50){
				if(k==54)
				{
					k--;
					continue;
				}
				System.out.println("The value of k is :"+k);
				k--;
			}
				
			}
		}
			
	

}
	
