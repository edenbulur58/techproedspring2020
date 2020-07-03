package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoIntegersWithoutThirdVariableInterview {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer to swap ");
			int num1=scan.nextInt();
			int num2=scan.nextInt();	
		
			System.out.println("Before swamming :"+num1+"<=============>"+num2);		
	num1=num1-num2;
	num2=num1+num2;
	num1=num2-num1;
	System.out.println("After swamming :"+num1+"<=============>"+num2);	
		
		
		
		
		
	}

}
