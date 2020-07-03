package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion06 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of an ARRAY");
		int length=scan.nextInt();
		System.out.println("Please enter elements of an Array");
		String arr[]=new String[length];
		
		for(int i=0; i<length; i++) {
			arr[i]=scan.nextLine();
			
			System.out.println(arr[i]);
			
		}
		int reversearr[]=new int[length];
		
		for(int i=0; i<length; i++) {
			
			System.out.println(reversearr[length-1-i]);
		
		}	
	}

}
