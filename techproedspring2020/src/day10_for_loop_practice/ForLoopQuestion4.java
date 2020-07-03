package day10_for_loop_practice;

import java.util.Scanner;

public class ForLoopQuestion4 {

	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter the starting value");
	int start=scan.nextInt();
	System.out.println("please enter the endinging value");
	int end=scan.nextInt();
	int sum=0;
	for (int i=start; i<=end; i++) {
		
	if(i%2!=0)	{
	sum=sum+i;
	
	}
	}
System.out.println(sum);


	
	
}







	}

