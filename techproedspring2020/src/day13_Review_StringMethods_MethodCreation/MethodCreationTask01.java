package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreationTask01 {

	public static void main(String[] args) {
		
		
		
		productTwoNums ();	
		
		

	}
	
	public static void productTwoNums () {
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter two numbers to add");	
			double num1=scan.nextDouble();
			double num2=scan.nextDouble();
			System.out.println(num1*num2);
		}	
	
	
	
	

}
