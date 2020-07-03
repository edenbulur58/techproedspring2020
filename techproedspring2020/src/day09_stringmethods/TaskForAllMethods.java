package day09_stringmethods;

import java.util.Scanner;

public class TaskForAllMethods {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			System.out.println("Enter a password according to the given rules");
			String str=scan.nextLine();	
		
		//	str=" Hey Come1?  "
		int firstinitialword=str.indexOf(" ")+1;
		System.out.println(firstinitialword);
		int secondinitialword=str.indexOf(" ", 1)+1;
		System.out.println(secondinitialword);
		
		int lastidx=str.lastIndexOf('e');

		String security=str.replaceAll("\\d", "*");
	
		String security2=str.replaceAll("\\W", "?");
		
		String replace=str.replaceAll("H","//");
		
		int trimbeforelength=str.length();
		String trim=str.trim();
		int trimAfterLength=trim.length();
		
		String sub=str.substring(3);
		
		String betweensub=str.substring(1, 7);
		
		String upperCase=str.toUpperCase();
		
		String lowerCase=str.toLowerCase();
		
		System.out.println(firstinitialword);
		System.out.println(secondinitialword);
		System.out.println(lastidx);
		System.out.println(security);
		System.out.println(security2);
		System.out.println(replace);	
		System.out.println(trimbeforelength);
		System.out.println(trim);
		System.out.println(trimAfterLength);
		System.out.println(sub);
		System.out.println(betweensub);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		
		
		
		
	}

}
