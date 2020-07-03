package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num=scan.nextInt();
	int i=1;
	int product=1;
		while(i<=num) {
		
	product=i*product;
	i++;
			
		}
	System.out.println(product);	
		

	}

}
