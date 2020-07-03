package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter age");
int num1=scan.nextInt();

if(num1<13) {
	System.out.println("Should not work");	
	

}
else if	(num1>65) {
	System.out.println("Retired");	
	

}	
		
else {
	System.out.println("Should work");	
}		
	
		
	}

}
