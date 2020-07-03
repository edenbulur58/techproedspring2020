package day02variablescanner;

import java.util.Scanner;

public class VolumeOfRectangularPrism {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a length a width and a height of Rectangular Prism ");
		Float width=input.nextFloat();
		Float length=input.nextFloat();
		Float height=input.nextFloat();
		System.out.println("Volume Of A Rectangular Prism: "+width*length*height);
		
		

	}

}
