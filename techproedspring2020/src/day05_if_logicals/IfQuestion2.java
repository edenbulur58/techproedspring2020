package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter length and width");	
		float length=scan.nextFloat();
		float width=scan.nextFloat();
		if(length==width) {
			System.out.println("This is a square");	
		}
		if(length!=width) {
			System.out.println("This is not  a square");	
		}
	}

}
