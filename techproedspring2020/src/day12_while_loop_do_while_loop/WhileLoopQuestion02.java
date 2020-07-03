package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		str=str.toUpperCase();	
		int letterflag=0;
		int numberflag=0;
		int othersflag=0;
		int lengthflag=str.length();
		
	while ( lengthflag>0 ) {
	
	if (str.charAt(lengthflag-1)>='A'   &&   str.charAt(lengthflag-1)<='Z'    ) {	
		letterflag++;
		
	}
	else if (str.charAt(lengthflag-1)>='0'  &&   str.charAt(lengthflag-1)<='9'    ) {	
		numberflag++;}
	else {
	
		othersflag++;
	}
	lengthflag--;
	}		
	System.out.println("The number of the letters:"+letterflag);
	System.out.println("The number of the numbers:"+numberflag);
	System.out.println("The number of the others:"+othersflag);
	
		

	}

}
