package encapsulation;

public class Example1 {
	/*Encapsulation is a process of wrapping code and data together into a single unit.
	 * We can create a fully encapsulated class by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.
By providing only setter or getter method, you can make the class read-only or write-only.
It provides you the control over the data. Suppose you want to set the value of id i.e. greater than 100 only, you can write the logic inside the setter method.
 */
private int age;
private int EmpID;
private String name;
public void setName(String name)
{
	this.name = name;
}
public String getName()
{
	return name;
}
public void setAge(int age)
{
this.age = age;	
}
public int getAge()
{
	return age;
}
public void setEmpID(int EmpID)
{
	this.EmpID = EmpID;
}
public int getEmpID()
{
return EmpID;	
}
}
