package day11_review_while_loop;

import java.util.Scanner;

public class WarmUp11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter his/her first name");
		String name=scan.next();
		
	for(int i=0; i<name.length();    i++)     {	
		
		System.out.println(name.charAt(i));		
	}
	
	}

}
