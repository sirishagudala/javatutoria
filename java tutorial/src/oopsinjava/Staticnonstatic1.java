package oopsinjava;

public class Staticnonstatic1 {
	public static String college = "Vignan";
	public int age;
	public int rollnumber;//global variables
	Staticnonstatic1(int rollnum,int ageinnum){
		age = ageinnum;
		rollnumber =rollnum;
		}
	public void display(){
		System.out.println("roll number of a student is :" +rollnumber  + "Student age is:"+ age+  "College name is:"+college);
	}
	public static void main (String[] args){
		Staticnonstatic1 a = new Staticnonstatic1(111,24);
		Staticnonstatic1 b = new Staticnonstatic1(222,23);
		a.display();
		b.display();
	}

}
