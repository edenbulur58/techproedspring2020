package day18_array_methods_multi_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;
public class SortQuestion01 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter length of an array");
		int length=scan.nextInt();
		int array[]=new int [length];
		System.out.println("Please enter elements of array");
		
		
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
			
			
			
			
		}
for(int i=0; i<array.length; i++) {
			
     	System.out.println(array[i]+" ");
		}
        System.out.println();
	
//ascending order
		Arrays.sort(array);
		for(int i=0; i<array.length; i++) {
			
		System.out.print(array[i]+" ");
			
		}	
		
		//descending order
		System.out.println();
		
		Arrays.sort(array);
	    for(int i=0; i<array.length; i++) {
					
	   System.out.print(array[length-1-i]+" ");
					
				}			
		

	}

}
