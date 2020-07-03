package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		
		addTwoNums (4,5) ;	
		addTwoNums (4,5,6) ;
		addTwoNums (7,"8") ;
	}
	
	public static void addTwoNums (double num1, double num2) {
		
			
			
			System.out.println(num1+num2);
		}
	
	public static void addTwoNums (double num1, double num2,int num3) {
		
		
		
		System.out.println(num1+num2+num3);
	}
	
	public static void addTwoNums (int num1, String num2) {
		
		
		
		System.out.println(num1+num2);
	}

	

}
