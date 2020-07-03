
package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the quantity and price per item");
int qty=scan.nextInt();
int pricePerİtem=scan.nextInt();


if(qty>1000) {
	System.out.println("The price is :"+qty*pricePerİtem*0.90);
}
else {
	
	System.out.println("The price is: "+qty*pricePerİtem+"no discount");	
	
}
	
		
		

	}

}
