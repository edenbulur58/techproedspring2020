package day02variablescanner;

import java.util.Scanner;

public class PerimeterOfATriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter three number for sides of Triangle");
		byte num1=input.nextByte();
		byte num2=input.nextByte();
		byte num3=input.nextByte();
		System.out.println("Perimeter of a triangle: "+(num1+num2+num3));

	}

}
