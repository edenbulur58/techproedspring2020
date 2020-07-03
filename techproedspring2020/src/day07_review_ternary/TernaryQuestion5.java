package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a integer");	
		int num=scan.nextInt();
		
		String result=num>99 && num<=1000 ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
		

	}

}
