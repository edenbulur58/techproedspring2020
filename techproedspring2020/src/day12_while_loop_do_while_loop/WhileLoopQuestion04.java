package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num=scan.nextInt();
		int factor=1;
		
		while(factor<=num) {
			
			if(num%factor==0) {
				System.out.println(factor+" ");	
			}
			
			
			factor++;
		}
		
		
	}

}
