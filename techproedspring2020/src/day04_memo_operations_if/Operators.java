package day04_memo_operations_if;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
System.out.println("Please enter an integer");
	int num=scan.nextInt();
	
	int first=num%10;
	int num2=num/10;
	
	int second=num2%10;
	
	int third=num/100;
	
	System.out.println(third);
	System.out.println(second);
	System.out.println(first);
	
	System.out.println(first+""+second+third);

	
	
	}

}
