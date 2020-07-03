package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the name of the day of a week");		
	String dayOfWeek=scan.nextLine();
	
	if(dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday")|| dayOfWeek.equals("Wendsday")) {
	
		System.out.println("WeekDay");
	
	}
	if(dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
		
		System.out.println("WeekDay");
	}
if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
		
		System.out.println("WeekendDay");	
	
	}
	}
}