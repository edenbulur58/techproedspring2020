package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion05 {

	public static void main(String[] args) {
	
	
		int arr[]= {1,2,3,4,5,5};
	for(int i=0; i<arr.length; i++) {
	
	
		for(int j=i+1; j<arr.length; j++) {
		
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]+" ");		
			}
		
		}
	}	

	}
	}

