package day08_review_switch;

import java.util.Scanner;

public class NestedTernaryLeapInterview {

	public static void main(String[] args) {
		
	/*Type a java code by using nested ternary.
	 * Write a program to check if a year is leap year or not.
	 * if the year is divisible by 100 then it must be divisible by 400.
	 * 	if the year is not divisible by 100 then it must be divisible by 4.
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a integer");	
		int num=scan.nextInt();	
		
	String result=num%100==0 ? (num%400==0 ? "This is a leap year" : "This is not a leap year"):(num%4==0 ? "This is a leap year" : "This is not a leap year");
		System.out.println(result);	

	}

}
