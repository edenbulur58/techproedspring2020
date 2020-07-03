package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class SplitQuestion01 {

	public static void main(String[] args) {
		/*
		 * Creating a String "I liked Java, did you like it"
		 * 1)Split by Using "d"
		 * 2)Split by Using " "
		 * Print the arrays on the console
		 */
		
		String str= "I liked Java, did you like it";
		
		String arr[]=str.split("d");
		
		System.out.println(Arrays.toString(arr));
		
String str1[]=str.split(" ");
		
		System.out.println(Arrays.toString(str1));
		
		
	}

}
