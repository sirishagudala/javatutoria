package methodoverriding;

public class Bankmethodoverride {
	public static void main(String[]args){
		Bankhdfc h = new Bankhdfc();
		Bankicici i = new Bankicici();
		Banksbi s = new Banksbi();
		System.out.println("The rate of interest for the Bank SBI : " +s.getrateofinterest());
		System.out.println("The rate of interest for the Bank ICICI : " +i.getrateofinterest());
		System.out.println("The rate of interest for the Bank HDFC : " +h.getrateofinterest());
		
		
		
	}

}
