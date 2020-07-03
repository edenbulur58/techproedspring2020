package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion6 {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter the character if it is alphabet");
	char ch=scan.next().charAt(0);
	
	if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z') {
	System.out.println("This is a Alphabet");	
	
	}
	else {
		System.out.println("This is not a Alphabet");		
	}
		
		
	}

}
