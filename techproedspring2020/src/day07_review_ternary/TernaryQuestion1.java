package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer");	
		int num=scan.nextInt();
		
		String result=num % 2==0 ? "The integer is even" : "The integer is odd";
		
System.out.println(result);
	}

}
