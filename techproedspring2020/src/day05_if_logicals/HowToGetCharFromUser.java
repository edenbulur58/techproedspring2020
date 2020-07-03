package day05_if_logicals;

import java.util.Scanner;

public class HowToGetCharFromUser {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the initial of your first and last name");	
		char initialOfFirstName=scan.next().charAt(0);	
		char initialOfLastName=scan.next().charAt(0);
		
		System.out.println("First name initial :"+initialOfFirstName);
		System.out.println("Last name initial :"+initialOfLastName);
		
	}

}
