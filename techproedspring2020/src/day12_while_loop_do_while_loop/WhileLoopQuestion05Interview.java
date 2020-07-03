package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion05Interview {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num=scan.nextInt();	
		
		int sum=0;
		
  while(0<num) {
	  int lastDigit=num%10;
	  sum=sum+lastDigit;
	 num=num/10;
  
  }
  System.out.println(sum);
	}

}
