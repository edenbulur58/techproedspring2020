package day22_stringbuilder;

public class StringBuilderMethods01 {

	public static void main(String[] args) {
	/*
	 * Create a String which has at least 7 characters by using StringBuilder class
	 * Print on the console last 5 characters
	 * Print on the console first 5 characters
	 * 	
	 */
	//StringBuilder obj=new StringBuilder("Techproed");
		
		//StringBuilder obj=new StringBuilder();
	//	obj.append("Techproed");
		
		StringBuilder obj=new StringBuilder(3);
		obj.append("Techproed");
		
	System.out.println("First 5 chars :" + obj.substring(0,5));
	System.out.print("Last 5 chars :" + obj.substring(4));

	}

}
