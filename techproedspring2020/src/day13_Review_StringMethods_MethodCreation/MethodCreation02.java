package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		
		
		
		
		anyOperation()	;
		

	}
	public static void anyOperation() {
	Scanner scan=new Scanner(System.in);	
	System.out.println("Please enter two integer");	
		double num1=scan.nextDouble();	
		double num2=scan.nextDouble();
	System.out.println("Select one of the operation");
	char operation=scan.next().charAt(0);
	
	switch(operation) {
	
	case'+':
	System.out.println(num1+num2);
	break;
	
	
	case '-':
		System.out.println(num1-num2);
		break;
		
	case'*':
		System.out.println(num1*num2);
		break;
		
		
		case '/':
			System.out.println(num1/num2);
			break;
	
	default:
		System.out.println("Enter a valid operation");	
		
		
		
		
		
		
		
	
	}
	
	
	}
}
