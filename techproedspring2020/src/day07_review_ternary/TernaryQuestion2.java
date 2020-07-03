package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer");	
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=num1<=num2 ? num1 : num2;
		
System.out.println(num3);	
		
		
		
	}

}
