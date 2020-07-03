package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter length of Array");
		int length=scan.nextInt();
		String arr[]=new String[length];
		
		System.out.println("Please enter the integer elements of Array");
		
		
		for(int i=0; i<length; i++) {
			arr[i]=scan.next();
			
		}
		for(int i=0; i<length; i++) {
			if (i%2==0) {
				System.out.print(arr[i]+ " ");
			}
		}
		
				
		
	}

}
