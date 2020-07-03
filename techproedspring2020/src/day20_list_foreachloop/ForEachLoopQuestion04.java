package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopQuestion04 {

	public static void main(String[] args) {
		/*
		 * Create a list find the product of all elements by using for each loop
		 * and print the product on the console
		 */
List<Integer> list=new ArrayList<>();
list.add(5);
list.add(2);
list.add(3);
list.add(4);
System.out.println(list);
int product=1;

for(int w:list) {
	product=product*w;
	
}
System.out.println(product);
	}

}
