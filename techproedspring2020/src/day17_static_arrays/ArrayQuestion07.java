package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion07 {

	public static void main(String[] args) {
	
		
System.out.println("The sum of Array :"+sum());
	}
	
	public static int sum() {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Please enter the length of the array");
		int length=scan.nextInt();
		int arr[]=new int[length];
		System.out.println("Please enter the eelements of the array");
		int sum=0;
		for(int i=0; i<length; i++) {
			arr[i]=scan.nextInt();//We got the values from user and assign them to the array elemnts	
			sum=sum+arr[i];
		}
				
		return sum;
		
		
	}

}
