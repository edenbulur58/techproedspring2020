package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion03Interview {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		System.out.println("Please enter your lastName");	
	String lastName=scan.next();	

	/*for(int i=lastName.length()-1; i>=0; i--) {
		
		System.out.println(lastName.charAt(i));	
		
	}*/
	String reversedlastName="";
	
	for(int i=1; i<=lastName.length(); i++)  {

	System.out.println(reversedlastName+lastName.charAt(lastName.length()-i));
	
}
	/*
	System.out.println("Please enter an integer");	
String num=scan.next();	
String reversedNum="";
	
	for(int i=1; i<=num.length(); i++)  {

	System.out.println(reversedNum+num.charAt(num.length()-i));
	int reversedInt=Integer.parseInt(reversedNum);
	System.out.println(reversedInt);
}	
	
	
	*/
	
	}

}
