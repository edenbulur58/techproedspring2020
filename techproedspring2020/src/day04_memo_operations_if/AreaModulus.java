package day04_memo_operations_if;

import java.util.Scanner;

public class AreaModulus {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two integer which first is greater than the second");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
		
			int width=num1/num2;
		int length=num1+num2;
		System.out.println("The Area of the rectangle :"+width*length);
		System.out.println("The Perimeter of the rectangle :"+2*(width+length));

	}

}
