package day07_review_ternary;

import java.util.Scanner;

public class ReviewQuestion1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter an integer");		
		int num=scan.nextInt();
		
		if(num<10) {
		
		System.out.println("It is a square :"+num*num);
		}
		else if(num>10) {
			System.out.println("It is not a square :"+num*2);	
		}
		else {
			System.out.println("It is a same number :"+num);
		}
		
		}
	}


