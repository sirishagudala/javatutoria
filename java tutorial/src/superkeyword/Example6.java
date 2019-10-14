package superkeyword;

public class Example6 extends Example5{
	public void run()
	{
		System.out.println("Run method from Child class");
	}
    public void display()
    {
    	run();
    	super.run();
        //test();(what is this test.I have to read about this.   
    }
 
	public static void main(String[] args) {
		Example6 obj= new Example6();
		obj.display();
	}
}
