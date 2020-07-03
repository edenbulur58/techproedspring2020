package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter his/her age");
int age=scan.nextInt();


if(age>=18  && age<=65) {
	System.out.println("You should work");
}
else {
	
	System.out.println("No need to work ");	
	
}	
		
		

	}

}
