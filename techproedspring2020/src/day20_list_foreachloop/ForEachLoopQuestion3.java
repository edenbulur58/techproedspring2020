package day20_list_foreachloop;

public class ForEachLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the common elements 
		 * between two arrays (string values) 
		 */
String arr1[]= {"Ali","Veli","Can","Ayse"};
String arr2[]= {"Ahmet","Adem","Ali","Can"};

for(String w:arr1) {
for(String e:arr2) {
	if(w.equals(e)) {
		System.out.print( w+" ");
	}
}
	
}
	}

}
