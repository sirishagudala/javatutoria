package corejava;

public class Twodimensionalarray {
	public static void main(String[]args){
	/*	int mynumbers[][]=new int[3][5];
		arr[0][0]=10;
		arr[0][1]=10;
		arr[0][2]=10;
		arr[0][3]=10;
		arr[0][4]=10;

		arr[1][0]=10;
		arr[1][1]=10;
		arr[1][2]=10;
		arr[1][3]=10;
		arr[1][4]=10;
 
		arr[2][0]=10;
		arr[2][1]=10;
		arr[2][2]=10;
		arr[2][3]=10;
		arr[2][4]=10;*/
		int mynumbers[][]={{10,20,30,40,50}, {15,25,35,45,55}, {65,75,85,95,37}};
		for (int i =0;i<mynumbers.length;i++){
			for (int j=0;j<mynumbers[0].length;j++)
			{
				System.out.print(mynumbers[i][j] +" ");
			}
			System.out.println();
			}
			int x = mynumbers[2][4];
			/* to access the specific element from the two dimensional array specify two indexes,one for the array and one for element 
			 * inside the array.This example accesses the 5th element(index number of 5th element is 4) in the third array(index number
			 *  of third array is 2.) of mynumbers*/
			System.out.println("The Value of the 5th element in the third array is: "+(x));
		//System.out.println("The value of the 5th element in the third array is : " +mynumbers[2][4]);

	}


		
	}


