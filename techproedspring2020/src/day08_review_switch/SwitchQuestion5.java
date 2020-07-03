package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		char ch1=scan.next().charAt(0);
		switch (ch1) {
		case 'C':
			System.out.println("Your grade is below 50");
		break;
		
		case 'B':
			System.out.println("Your grade is 50 to 80 ");
		break;
	
		
		case 'A':
			System.out.println("Your grade is above 80");
		break;

	default:
		
		System.out.println("Enter a letter");	
		
	}
	
		
		
		

	}

}
