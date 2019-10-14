package methodoverriding;

public class Animaltest {
	public static void main(String[]args)
	{
	
	Animal2 obj1 = new Animal2();
	Animal1 obj2 = new Animal1();
	Animal obj = new Animal();
	
	obj.makesound();

obj1.makesound();	
obj2.makesound();



}



}


