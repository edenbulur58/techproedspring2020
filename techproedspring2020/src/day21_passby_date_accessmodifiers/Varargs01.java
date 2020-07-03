package day21_passby_date_accessmodifiers;

import java.util.Arrays;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 * Create a method which has 3 parameters outside the main method
		 * Make a parameter as varargs
		 * Call the method from main method in different arguments
		 */
varargs(1,2);//1-7-[]==>varargs is empty,it is not necessary to enter a value for varargs
varargs(1,2,7,3);//==>1-2-[7,3]
varargs(1,2,7,3,9,5);//==>1-2-[7,3,9,5]	
	
	}
	
	public static void varargs(int num1,int num2,int...nums) {
		
		
		System.out.println("Starting number :"+num1);
		System.out.println("Ending number :"+num2);
		System.out.println("Varargs: " + Arrays.toString(nums));
		
		
		
	}
	
	

}
