package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter his/her age and gender");
int age=scan.nextInt();
String gender=scan.next();

if(gender.equalsIgnoreCase("male")&& age>=65) {
	System.out.println("Hey man you retired!");
}
if(gender.equalsIgnoreCase("female")&& age>=60) {
	System.out.println("Hey lady you retired!");
}

	}

}
