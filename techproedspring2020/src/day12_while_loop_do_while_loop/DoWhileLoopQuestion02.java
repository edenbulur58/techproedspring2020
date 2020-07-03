package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion02 {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in)	;	
		
System.out.println("Please enter an integer");		

String num=scan.next();
int length=num.length();
int i=1;

do {
	System.out.println(num.charAt(i));
	i=i+2;
}
while(i<length );



	}

}
