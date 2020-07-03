package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
int num=scan.nextInt();



if(num>0) {
	System.out.println("This is a positive number: "+num);
}
else {
	
	System.out.println("This is absolute value of number: "+num*(-1));	
	
}
}
	}


