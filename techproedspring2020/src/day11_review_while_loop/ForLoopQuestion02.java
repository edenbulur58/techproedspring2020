package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("Please enter a positive integer");	
			int prime=scan.nextInt();
		boolean result=true;
		for(int i=2;  i<prime; i++) {
		if(prime%i==0) {
			result=false;
			break;
		}
		
		}
		if(result==true) {	
			
			System.out.println("Prime");
			}
				else {
					System.out.println("Not Prime");	
				}
	
	
	
		}

}
