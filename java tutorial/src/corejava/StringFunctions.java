package corejava;

public class StringFunctions {
	public static void main(String[] args){
	
String i = "The candidate must pass in the written exam";
String j = "The candidate age  must be in between 21 and 35";
System.out.println("The following qualifications are required to proceed further:");
System.out.println("1)"+i);
System.out.println("2)"+j);
//To check the strings equal or not
System.out.println("Is two strings are equal : " +i.equals(j));
//To concat two strings
System.out.println("Result of concating the two strings is :" +i.concat(j));
//To concat two strings in by using '+' symbol
System.out.println("Concating the two strings by using + symbol :" +i+j);
//To change the case of output from lower case to upper case
System.out.println("Displaying the first string in uppercase :" +i.toUpperCase());
//To change the output from upper case to lower case
System.out.println("Displaying the second string in lowercase :" +j.toLowerCase());
System.out.println("Displaying the first string in lower case : " +i.toLowerCase());
//To find out the length of the String
System.out.println("Length of the string is : " +i.length());
//To get specific substring from a String
System.out.println("The result  of the  substring is : " +i.substring(2,10));
//To convert String to Integer
String s = "10";
int a = Integer.parseInt(s);
System.out.println("The result after conversion from String to integer is : " +a);
//To convert integer to String
int b = 65;
String c = String.valueOf(b);
System.out.println("The result after conversion from integer to String is :"+c);
//To display the specific character at the particular position
System.out.println("The charater at first index index position is :"+ c.charAt(1) );
//To split the string named 'j'on the base of the character 'd'
String splt[] = j.split("d");
System.out.println("1st value :" +splt[0]);
System.out.println("2nd value :" +splt[1]);
System.out.println("3rd value :" +splt[2]);
System.out.println("4th value :" +splt[3]);
//If we use addition function between two integers it simply add those integers
int n =10;
System.out.println(b+n);
//if we use addition function between two integers and then two strings then it will add those two integers
//and concat those two integers
System.out.println(b+n+i+j);
//if we use addition function between two strings and then two integers then it will concat both inters and string
System.out.println(i+j+b+n);

	}
}

