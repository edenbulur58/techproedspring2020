package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a integer");	
		int num=scan.nextInt();

		if(num%2==0) {
		System.out.println("The integer is even");
		
		
		}
		if(num%2!=0){
			System.out.println("The integer is odd");	
		}
		}
		
		
	}


