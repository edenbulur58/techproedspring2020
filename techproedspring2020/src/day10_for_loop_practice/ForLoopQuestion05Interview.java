package day10_for_loop_practice;

import java.util.Scanner;

public class ForLoopQuestion05Interview {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter an integer to calculate factorial value");
		int num=scan.nextInt();
		
		
		double mult=1;
		
		for(int i=1; i<=num; i++) {
		mult=mult*i;
		
		
			}
		System.out.print("Factorial values is"+mult);		
		
	}

}
