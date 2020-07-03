package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion01 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
		System.out.println("Please enter an integer");
		int num=scan.nextInt();
		int mult=1;
		int i=1;
		while(i<=10) {
		mult=i*num;	
		System.out.println(num+"*"+i+"="+mult);
		i++;
		
		}
		

	}

}
