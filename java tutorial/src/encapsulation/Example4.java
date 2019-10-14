package encapsulation;

public class Example4 {
	public static void main(String[]args){
		Example3 obj = new Example3();
		/*obj.SetName("Sireesha");
		obj.SetAge(33);
		obj.SetEmpID(544);*/
		System.out.println("Name is : " +obj.getName() + " Age is : "+obj.getAge() + " EmpID is : "+obj.getEmpID());
	}

}
