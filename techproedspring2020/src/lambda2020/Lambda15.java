package lambda2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda15 {

	public static void main(String[] args) throws IOException {
//How to work with files using functional Programming
//How to print file content on the console	
	Files.lines(Paths.get("src/FileForLambda01")).forEach(System.out::println);
	
//Convert all letters to uppercase
	Files.lines(Paths.get("src/FileForLambda01")).map(t->t.toUpperCase()).forEach(System.out::println);

//Check if the word "Lambda" exist in the text	
	Files.lines(Paths.get("src/FileForLambda01")).anyMatch(t->t.contains("Lambda"));//true

//Print distinct words on the console
	Files.lines(Paths.get("src/FileForLambda01")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
	
//Print all the words on the console in alphabetic order	
Files.lines(Paths.get("src/FileForLambda01")).map(t->t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);
	
//Print the words which starts with "m" on the console
Files.lines(Paths.get("src/FileForLambda01")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.startsWith("m")).forEach(System.out::println);	
	
	
	
	}

}
