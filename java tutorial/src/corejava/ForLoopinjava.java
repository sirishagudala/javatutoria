package corejava;

public class ForLoopinjava {
	/*syntax of for loop:
	 * for(initialization; condition; increment/decrement)
	 * {
	 * Statement(s);
	 * }*/
	/*Loops are used to execute a set of statements repeatedly until a particular condition is satisfied */
    public static void main (String[]args){
    	int i;
    	for (i=1;i<=10;i++){
    		System.out.println("The value of i is:" +i);
    	}
    	/* Another example of for loop*/
    	int j;
    	for(j=15;j>=10;j--){
    		System.out.println("The value of j is :" +j);
    	}
    	/*Example for infinite for loop*/
    	int k;
    	for(k=1;k>=1;k++){
    		System.out.println("The value of k is :" +k);
    	}
    	/* Notes: This is a condition that would never return false that leads to infinite loop
    	 * So Boolean expression and increment/decrement operation co-ordination is important.*/
}
}
