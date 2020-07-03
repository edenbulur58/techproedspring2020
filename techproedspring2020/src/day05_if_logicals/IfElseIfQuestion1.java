package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two integer");
int num1=scan.nextInt();
int num2=scan.nextInt();

if(num1>0 && num2>0) {
	System.out.println("Sum of two integer"+num1+num2);	
	

}
else if	(num1<0 && num2<0) {
	System.out.println("Multiplication of two integer"+num1*num2);	
	

}	
		
else {
	System.out.println("I cannot add or multiply different signed numbers");	
}		

	}

}
