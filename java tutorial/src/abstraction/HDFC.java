package abstraction;

public class HDFC extends Bank{

	@Override
	public void loan()
	{
		System.out.println("HDFC loan");
		
	}
	public static void main(String[] args)
	{
	HDFC obj = new HDFC();
	obj.loan();
	obj.credit();
	obj.debit();
	}
	

}
