package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class StringMethods00 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your first name");
		String name=scan.nextLine();		
		
		String str1=name.replace(name.charAt(0), '*');
		char str3=str1.charAt(0);
		String str2=name.replace(name.charAt(name.length()-1), '*');
		String str4=str2.substring(1, str2.length());
		System.out.println(str3+str4);
	}

}
