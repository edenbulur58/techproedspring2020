package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoIntegersInterview {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer ");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			System.out.println("Before swapping: "+num1+"<=========>"+num2);
			
		int num3=num1;
		
		num1=num2;
		num2=num3;
		System.out.println("After swapping: "+num1+"<=========>"+num2);
		
		
	}

}
