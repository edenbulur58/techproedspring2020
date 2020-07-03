package day02variablescanner;

import java.util.Scanner;

public class AreaAndPerimeterOfARectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a length and a perimeter of Rectangle ");
		int width=input.nextInt();
		int length=input.nextInt();
		System.out.println("Area Of A Rectangle: "+width*length);
		System.out.println("Perimeter Of A Rectangle: "+2*width*length);	
		
		
		

	}

}
