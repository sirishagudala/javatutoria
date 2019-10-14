package exceptionhandling;

public class Finallyinjava3 {
	public static void main(String[] args) {
		try{
			int i= 2/3;
			return;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("finally block always executes");
		}
	}

}
