package day08_review_switch;

import java.util.Scanner;

public class WarmUp8 {

	public static void main(String[] args) {
	/*	Ask user to enter a number.
	 * If the number is less than 10 and greater than or equal to 0, 
	 * calculate its cube.
	 * Otherwise,calculate its square
		
		
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a integer");	
		int num=scan.nextInt();
		
		String result=num>=0 && num<10 ? "Cube of num :="+num*num*num : "Square of num : "+num*num;
		System.out.println(result);
			
		
		

	}

}
