package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length and breadth of a rectangle");	
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		
		
		String result=(length==breadth) ? "This is a square" : "This is not a square";
	
		System.out.println(result);	
	}

}
