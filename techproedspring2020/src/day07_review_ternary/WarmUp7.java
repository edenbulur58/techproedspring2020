package day07_review_ternary;

import java.util.Scanner;

public class WarmUp7 {
	public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your first and last name");
	String firstName=scan.nextLine();
	String lastName=scan.nextLine();
	
	if(firstName.length()>lastName.length()) {
		System.out.println("First name is longer");
	}
	else if(firstName.length()==lastName.length()) {
		
		System.out.println("First name and last name have same length");
			
}
	else {
		System.out.println("Last name is longer");
	}
	
	}
}