package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class BinarySearchQuestion01 {

	public static void main(String[] args) {
		// {3,5,6,9,5,10}
	//Use binarySearch()  for 1,5,11,14
		
		
		int arr[]= {3,5,6,9,5,10};
			
		Arrays.sort(arr);
	//if you have duplicate elements, you will get the index of first occurence
		
		
		
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 11));
		System.out.println(Arrays.binarySearch(arr, 14));
		
		

	}

}
