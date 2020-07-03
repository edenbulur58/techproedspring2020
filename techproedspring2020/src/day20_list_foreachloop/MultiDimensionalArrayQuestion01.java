package day20_list_foreachloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayQuestion01 {

	public static void main(String[] args) {
	/*
	 * Find the sum of the elements in the array elements of the given multi dimensional array
	 * {{1,2,3},{4,5},{6,7}} and return an array.
	 * For example; for{{1,2,3},{4,5},{6,7}} output will be {6,9,13}
	 * 	
	 */
		int arr[][]={{1,2,3},{4,5},{6,7}};
		
		int arrsum[]=new int[arr.length]; 
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
			sum=sum+arr[i][j];
				
			}
			arrsum[i]=sum;
			sum=0;
		}
		System.out.println((Arrays.toString(arrsum)));	
		}
		
		

	}

