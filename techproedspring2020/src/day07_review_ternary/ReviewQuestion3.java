package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion3 {

	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter his kid's name");		
		char letter=scan.next().charAt(0);
			
		if(letter<='Z' && letter>='A' ) {
		  if(letter<'F') {
			System.out.println("Big before F");
		}
		  else {
			  System.out.println("Big after F");
  
			  
		  }
		  
		  
		}
		else if(letter<='z' && letter>='a' ) {
			  if(letter<'h') {
				System.out.println("Small before h");
			}
			  else {
				  System.out.println("Small after h");
	  
				  
			  }
			  
			  
			}	
		
	}

}
