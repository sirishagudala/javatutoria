package abstraction;

public abstract class Bank {
	public abstract void loan();
	public void credit()
	{
	System.out.println("credit");
	
	}
	public void debit()
	{
	System.out.println("debit");	
	}
	
Bank()
{
	
}
Bank(String name)//we can create constructor in abstract class.
{
	
}
/*public static void main(String[] args)
{
Bank obj= new Bank();//we cannot create an object for an abstract class.	
}*/
}
