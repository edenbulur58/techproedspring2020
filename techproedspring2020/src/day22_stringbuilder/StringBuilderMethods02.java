package day22_stringbuilder;

public class StringBuilderMethods02 {

	public static void main(String[] args) {
		/*
		 * Create a String "UnitedKingdom"
		 * 1)Print the length of the String on the console
		 * 2)Find the first occurence of the char 'n'
		 * 3)Find the last occurence of the char 'n'
		 * 4)Find the character in index 4
		 * 5)Make the String "UnitedKingdom 2020"
		 * 6)Insert 'X' after first 'i'==>UniXted Kingdom 2020
		 * 7)Delete  X ==>"UnitedKingdom 2020"
		 */

		StringBuilder str=new StringBuilder("United Kingdom");
		
		System.out.println("The length :"+str.length());
		
		System.out.println("First occurence of 'n' :"+str.indexOf("n"));
		
		
		System.out.println("Last occurence of 'n' :"+str.lastIndexOf("n"));
	
		System.out.println("The occurennce of in index 4 :"+str.charAt(4));

		System.out.println(str.append(" 2020"));
		
		//System.out.println(str.insert(3,"X"));
		
		System.out.println(str.insert(str.indexOf("i")+1,"X"));
		
		//System.out.println(str.deleteCharAt(3));
		
		System.out.println(str.delete(3, 4));
		
		System.out.println(str.reverse());//0202 modgniK detinU
	}	

}
