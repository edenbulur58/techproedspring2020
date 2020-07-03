package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class WarmUp13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your fşrst ant last name");
		String name=scan.nextLine();
		
		String str1=name.replaceAll("\\w", "*");
	//	String str2=name.replaceAll("\\D", "*");
		String str3=name.replaceAll("\\S", "*");
		
		System.out.println(str1);
//		System.out.println(str2);
		System.out.println(str3);
		
		

	}

}
