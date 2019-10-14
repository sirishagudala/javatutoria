package oopsinjava;

public class Staticnonstatic {
public int i = 10;
public static int j = 10;
Staticnonstatic(){
	
	i++;
	j++;
	System.out.println("Value of i is:"+i +" value of j is:" +j);
}
/*public void display(){
	System.out.println("value of i is:"+i  +  "value of j is:" +j);
}*/

public static void main(String[] args){
	Staticnonstatic a = new Staticnonstatic();
	Staticnonstatic b = new Staticnonstatic();
	Staticnonstatic c = new Staticnonstatic();
	/*a.display();
	b.display();
	c.display()*/;
}
}
