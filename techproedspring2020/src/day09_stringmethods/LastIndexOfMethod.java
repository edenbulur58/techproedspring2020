package day09_stringmethods;

public class LastIndexOfMethod {

	public static void main(String[] args) {
		
		String str="Banana, apple";
		int idx1=str.lastIndexOf("a");
		int idx2=str.lastIndexOf("w");
		int idx3=str.lastIndexOf("Text");
		int idx4=str.lastIndexOf("apple");
		int idx5=str.lastIndexOf("a",4);
		int idx6=str.lastIndexOf("a",5);
		//int idx7=str.lastIndexOf("an",3);
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		System.out.println(idx5);
		System.out.println(idx6);
		//System.out.println(idx7);
		
	}

}
