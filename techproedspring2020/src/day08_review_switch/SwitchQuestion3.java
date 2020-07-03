package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion3 {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
System.out.println("Enter 1,2 or 3");
int num=scan.nextInt();

switch(num) {

case 1:
	System.out.println("one");
break;
case 2:
	System.out.println("two");
break;
case 3:
	System.out.println("three");
break;
default:
	System.out.println("Not allowed");

}
		
	}

}
