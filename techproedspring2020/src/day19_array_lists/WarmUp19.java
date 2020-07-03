package day19_array_lists;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp19 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two long sententences.Then type a program to count all "words" in the sentences.
		 * For Example; if user enters "Java is easy,if you study.Nothing is easy,if you do not study"output will be 14.
		 * Hint:Use split() 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two long sentences");
		String str=scan.nextLine();
		
		
	//String str=	"Java is easy, if you study. Nothing is easy, if you do not study";
		String words[]=str.split(" ");
	System.out.println(Arrays.toString(words));	
		System.out.println("The number of word is "+words.length);
	}

}
