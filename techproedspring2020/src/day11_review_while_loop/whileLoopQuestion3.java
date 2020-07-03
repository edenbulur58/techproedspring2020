package day11_review_while_loop;

import java.util.Scanner;

public class whileLoopQuestion3 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("Please enter an  positive integer");	
		int num=scan.nextInt();
		int i=1;
		int mult=1;
		while(i<num) {
			mult=mult*i;
			
		i++;	
		}
		System.out.println(mult);	
	}

}
