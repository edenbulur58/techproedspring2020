package day02variablescanner;

import java.util.Scanner;

public class AreaAndPerimeterOfACircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a radius of Circle ");
		Float radius=input.nextFloat();
		Float pi=3.14159f;
		System.out.println("Area of a circle: "+pi*radius*radius);
		System.out.println("Perimeter of a circle: "+pi*2*radius);	
		
		
		
	}

}
