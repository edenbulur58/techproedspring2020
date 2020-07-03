package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestionInterview {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter age");
int num=scan.nextInt();	
		
if(num%400==0) {
	System.out.println("It is a leap year");	
	

}
else if	(num%4==0 && num%100!=0) {
	
	
	System.out.println("It is a leap year");	
	
	
}	
		
else {
	System.out.println("Not leap year");	
}		
		
		

	}

}
