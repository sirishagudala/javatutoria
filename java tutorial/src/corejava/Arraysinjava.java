package corejava;

public class Arraysinjava {
	public static void main(String[]args){
		//we can access the element of the array by simply referring to the index number.for example arr[0]=10
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//System.out.println("The value of array value in index 2 is:"+arr[2]);
		System.out.println("The length of array is :"+arr.length);
		System.out.println("****************************************************");
		for(int i =0; i<arr.length;i++)
		{
			System.out.println("The value of array is:"+arr[i]);
		}
		System.out.println("*******************************************************");
		//for each loop ;
		for(int obj:arr){
			System.out.println("The value of array is:"+obj);
		}
		System.out.println("********************************************************");
		//other way of declaring an array
		int arr1[] = {1,2,3,4,5};
		System.out.println("The length of array is :"+arr1.length);
		for(int j=0;j<arr1.length;j++)
		{
			System.out.println("The value of array is :"+arr1[j]);
		}
		System.out.println("*********************************************************");
		double db[] = new double[2];
		db[0] = 12.4445;
		db[1] = 34.445;
		System.out.println("The first element in the array db is : "+db[0]);
		System.out.println("The length of the array db is : "+db.length);
		//in for loop we have to declare the variable as integer because the index number is always an integer
		for (int a=0;a<db.length;a++){
			System.out.println("The value of the array db is : "+db[ a]);
		}
		System.out.println("*********************************************************");
		
		char c [] = new char[6];
		 c[0]= 'r';
		 c[1] = 'a';
		 c[2]= 'j';
		 c[3]= 'e';
		 c[4]= 's';
		 c[5]= 'h';
		 for(int k=0;k<c.length;k++){
			 System.out.println("My Husband name is : "+c[k]);
			 System.out.println("******************************************************");
			 
			 boolean bo[]={true,true};
			 System.out.println("The value of boolean is : "+bo[1]);
			/* boolean bo[]= new boolean[2];
			 bo[0]= true;
			 bo[1]=false;
			 System.out.println("The value of boolean is :"+bo[0]);*/
			 
			 for (int z=0;z<bo.length;z++){
				 System.out.println("The value of boolean is : "+bo[z]);
				 System.out.println("***************************************************");
				 
				/* String str[]= new String[3];
				 str[0]="America";
				 str[1]="Australia";
				 str[2]="India";
	 			 System.out.println("Second most populated country is : "+str[2]);*/
				
				 String str[] = {"America","Australia","India"};
				for (int y=0;y<str.length;y++)
				{
				System.out.println("Country names in alphabetical order is : "+str[y]);
				System.out.println("*********************************************************");
				
				/*Object obj[]=new Object[5];
				obj[0] = 20;
				obj[1] = 's';
				obj[2] = "sireesha";
				obj[3] = 19.225;
				obj[4] = true;*/
				Object obj[] = {20,"sireesha",'s',19.225,true};
				System.out.println("The length of the array is : "+obj.length);
				for(int x=0;x<obj.length;x++){
					System.out.println("The value of the datatype is : "+obj[x]);
				}
				
				
				 }
			 }
			 
			 
			 
		 }
		 
		
		}
	}

