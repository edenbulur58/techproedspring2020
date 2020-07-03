package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter his kid's name");		
		String name=scan.nextLine();
		
		if(name.contains("a")) {
			
			System.out.println("This name contains 'a':");
			}
			else if(name.contains("z")) {
				System.out.println("This name contains 'z':");	
			}
			else {
				System.out.println("This name contains neither'a' nor 'z':");
			}
			
		
	}

}
