package day20_list_foreachloop;

public class ForEachLoopQuestion02 {

	public static void main(String[] args) {
		/*
		 *Create an integer array find the sum of all elements by using for each-loop 
		 *and print the sum on the console 
		 */
		int arr[]= {3,1,4,2,5};
		int sum=0;
		for(int e:arr) {
		sum=sum+e;
		
		}
		System.out.println("The sum is :"+sum);
	}

}
