package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class EqualsAndToStringQuestions {

	public static void main(String[] args) {
		/*Create two arrays which have same elements in different order
		 * Use equals() to compare them before using sort() methods and after using sort() method
		 * Print the elements of the arrays on the console by using toString()
		 * 
		 */
        int[] arr1= {4,5,6,7,8};
		int[] arr2= {8,7,6,5,4};
		
		System.out.println("Before sorting "+ Arrays.equals(arr1, arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("After sorting "+ Arrays.equals(arr1, arr2));

		System.out.println(" "+ Arrays.toString(arr1));
		System.out.println(" "+ Arrays.toString(arr2));
	
	}

	
	
	
}
