package day05_if_logicals;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
	System.out.println("please enter a 4 digits integer");	
	int num=scan.nextInt();
	int num2=num%10;
		int num3=num/1000;
		System.out.println(num2+num3);
	}

}
