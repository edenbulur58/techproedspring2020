package day17_static_arrays;

public class ArrayQuestion00 {

	public static void main(String[] args) {
		
//Declare two Arrays
//Create two Arrays which has 4 elements
//Initialize all elements for the first Array use the long wayto initialize
//for the second one use the short way to initialize	
		
		int Array []= new int[4];//Here I put primitive
	   Array[0]= 1;
	   Array[1]= 2;
	   Array[2]= 3;
	   Array[3]= 4;
		
		
		
		int myArray []= {9, 10, 11, 12};
			   
//If you use more than or equal to length of an array		
//1-)We do not get compile time error
//2-)We get runtime error which is "ArrayIndexOutBoundsException"

		String arr[]= {"Ali","Veli","Can","Halit"};//Here I put reference	
		
System.out.println(Array[0]);	
System.out.println(Array[1]);	
System.out.println(Array[2]);	
System.out.println(Array[3]);	

//for loop to print all elements of the array on the console


for(int i=0;  i<=3; i++) {
	System.out.println(Array[i]);
}	
	for(int j=0;  j<arr.length; j++) {
		System.out.println(arr[j]);	
	
	



}
	}

	}
