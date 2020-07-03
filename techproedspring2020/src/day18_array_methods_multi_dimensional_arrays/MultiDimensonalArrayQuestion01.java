package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensonalArrayQuestion01 {

	public static void main(String[] args) {
		/*
		 * Create a multi dimensional array and print it on the console 
		 * 
		 * 
		 */

		int arr[][]= {{1,2},{3},{4,5,6}};
		//Long way to print multi dimensional array on the console
		System.out.print(Arrays.toString(arr[0]) + " ");
		System.out.print(Arrays.toString(arr[1]) + " ");
		System.out.println(Arrays.toString(arr[2]));
		
		
		//If you want to type a multi dimensional array on the console use deepToString()
		System.out.println(Arrays.deepToString(arr));
		
		//Print 5 on the console
		System.out.println(arr[2][1]);//5
		//Print 1,3, and 6 on the console
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		System.out.println(arr[2][2]);
		
	}

}
