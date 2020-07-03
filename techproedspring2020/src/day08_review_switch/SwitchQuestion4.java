package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A,B,C or D");
		char ch=scan.next().charAt(0);

		switch(ch) {

		case 'A':
			System.out.println("False");
		break;
		case 'B':
			System.out.println("False");
		break;
		case 'C':
			System.out.println("True");
		break;
		case 'D':
			System.out.println("False");
		break;
		
		default:
			System.out.println("Not allowed");

		}
					
		
		
		

	}

}
