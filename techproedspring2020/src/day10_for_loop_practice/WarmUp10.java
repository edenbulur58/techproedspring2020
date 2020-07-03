package day10_for_loop_practice;

import java.util.Scanner;

public class WarmUp10 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
		System.out.println("Please enter first name,last name and security number");
		String firstName=scan.next();
		String lastName=scan.next();
	    String social=scan.next();
		
		String str1=firstName.substring(0,1).toUpperCase();
		String str2=firstName.substring(1).toLowerCase();
		
		String str3=lastName.substring(0,1).toUpperCase();
		String str4=lastName.substring(1).toLowerCase();

	String str5=social.substring(0, 5).replaceAll("\\d","*");
	String str6=social.substring(5);
	System.out.println(str1+str2+" "+str3+str4);
	
	System.out.println(str5+str6);
	
	
	}

}
