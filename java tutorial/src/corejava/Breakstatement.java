package corejava;

public class Breakstatement {
	/*Break statement is used to come out of the loop instantly.It is used along with if statement,whenever used inside loop so that
	 * the loop gets terminated for a particular condition.
	 * syntax : break;*/
	public static void main(String[] args){
		int i=10;
		while(i<=15){
			System.out.println("The value of i is :"+i);
			if (i==12)
			{
				break;
			}
			i++;
		}
			System.out.println("out of the while-loop");
			int j = 100;
			while(j>=90)
			{
				System.out.println("The value of j is :"+j);
				if(j==95){
					break;
				}
				j--;
			}
			/*break statement usage in a for loop*/
			int k;
			for(k=10;k<=15;k++)
			{
				System.out.println("The valule of k is :" +k);
				if(k==12)
				{
					break;
				}
			}
			System.out.println("out of for-loop");
			
	}

}

