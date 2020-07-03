package day02variablescanner;

import java.util.Scanner;

public class AreaOfASquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter side length");
		int length=scan.nextInt();
		System.out.println("Area of a square: "+length*length);	
		System.out.println("Perimeter of a square: "+4*length);
		
		
	}

}
