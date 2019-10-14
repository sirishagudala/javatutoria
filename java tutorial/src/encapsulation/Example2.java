package encapsulation;

public class Example2 {
	public static void main(String[]args)
	{
	Example1 obj = new Example1();	
	obj.setName("Sireesha");
	obj.setAge(33);
	obj.setEmpID(344);
	System.out.println("Name is : " +obj.getName() + " Age is : "+obj.getAge() + " EmpID is : "+obj.getEmpID());
	}

}
 