package day17_static_arrays;

public class ArrayQuestion02 {

	public static void main(String[] args) {
		
	char arr[]= {6,7,8,9};	
	int count6=0;
	int count4=0;
	
	for (int i=0; i<arr.length; i++) {
		
		if(arr[i]==6) {
	count6++;
	}
	if (arr[i]==4) {
	count4++;	
		
	}
	}
	if(count6 !=0) {
	System.out.println("Array contains this element");	
	}
	if(count4==0) {
	System.out.println("Array does not contain this element");		
	}
	}
}
