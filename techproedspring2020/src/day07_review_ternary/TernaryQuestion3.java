package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion3 {
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer");	
		int num1=scan.nextInt();
		
		int result=num1<0 ? num1*(-1) : num1;
		
System.out.println(result);	
		
		
		
	}
	
	
}
