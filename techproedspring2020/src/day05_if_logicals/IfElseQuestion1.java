package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the password");		
	String password=scan.nextLine();
		
		
	
	//if(password.equals("JavaLearner")) {
	
		//System.out.println("The password is true");
	
	//}
	//else {
		
		//System.out.println("The password is False");
	//}	
		
	if(password.equals("JavaLearner")) {
		
		System.out.println("The password is true");
	
	}
	if(!password.equals("JavaLearner")) {
		
		System.out.println("The password is False");
	}		
		
		
	}

}
