package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in)	;	
		
		int num=0;

		do {
			System.out.println("Please enter an integer");		

			num=scan.nextInt();

			if(num>0) {
				System.out.println("You Won");
			}
			else if(num==0){
			
			System.out.println("You Lost");}
			
		}
		while(num!=0 );

		
		
		
		

	}

}
