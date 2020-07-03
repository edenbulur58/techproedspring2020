package day26_exceptions;

public class Exceptions01 {
//When you type a code , if you notice possible errors, you can use "throws" keyword with exception name to declare the possible error
//if you declare exception after method name use "throws" keyword.
//Sometimes we will declare exception inside the method body, then we will use "throw" keyword
	public static void main(String[] args)throws ArithmeticException  {
		System.out.println(division(12,3));
		System.out.println(division(12,0));

	}
public static int division(int num1,int num2) {
	
	
	return num1/num2;
}
}
