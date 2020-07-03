package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion01 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("Please enter first nember");	
		int base=scan.nextInt();
		System.out.println("Please enter second nember");	
		int power=scan.nextInt();	
		
		int product=1;
		if(base<power) {
			for(int i=1; i<=power; i++) {
				
				product=product*base;
					
			}
			System.out.println(product);
		}
		
	}

}
