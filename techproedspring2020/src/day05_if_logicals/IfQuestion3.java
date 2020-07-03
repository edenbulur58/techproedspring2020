package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the initial of the day as uppercase");	
		char initialOfTheDay=scan.next().charAt(0);
		if(initialOfTheDay=='M') {
			System.out.println("Monday");	
		}
		if(initialOfTheDay=='T') {
			System.out.println("Tuesday or Thursday");	
		}
		if(initialOfTheDay=='W') {
			System.out.println("Wendsday");	
		}
		if(initialOfTheDay=='F') {
			System.out.println("Friday");	
		}
		if(initialOfTheDay=='S') {
			System.out.println("Sunday or Saturday");	
		}
		
		
	}

}
