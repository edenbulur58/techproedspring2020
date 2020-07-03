package day09_stringmethods;

import java.util.Scanner;

public class WarmUp9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	/*	System.out.println("Enter USA");
		String str=scan.next();
		
			char ch1=str.charAt(0);
			char ch2=str.charAt(1);
			char ch3=str.charAt(2);
			switch (str) {
			case "ch1":
				System.out.println("United");
			break;
			
			case "ch2":
				System.out.println("Statement");
			break;
		
			
			case "ch3":
				System.out.println("America");
			break;
	
		default:
			
			System.out.println("Enter a valid data");	
				
			}
			
			*/
		System.out.println("Enter one of the 'U','S','A'.");
		char ch=scan.next().charAt(0);
		
		switch (ch) {
		case 'U':
			System.out.println("United");
		break;
		
		case 'S':
			System.out.println("States");
		break;
	
		
		case 'A':
			System.out.println("America");
		break;

	default:
		
		System.out.println("Enter a valid data");	
			
		}
		
		
		
		
		
		
		
		
		
	}

}
