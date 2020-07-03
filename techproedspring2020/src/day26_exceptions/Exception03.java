package day26_exceptions;

public class Exception03 {

	public static void main(String[] args)  {
	//indexNum("Java",2);	
	indexNum("Java",5);	
}
//try block cannot be use single
//try block must be together with catch block or/and finally block every time
//finally block runs every time(interview)
//if you use "finally" together with "try", "try" works
//if you need a code to run under every condition use "finally block"
//finally block can be used for example, ending connection to AWS or saving file
//after updating, to close the browser,to close a file etc...
//We can use try catch finally together
//if java finds an exception stops execution and tries to catch exception 
//Therefore, in the given code ArithmeticException will not caught
	public static void indexNum(String str,int idx) {
try {
	System.out.println("Result :"+str.charAt(idx));
	System.out.println("Result :"+idx/0);
}
catch(StringIndexOutOfBoundsException e){
	System.out.println("Be careful about the index 1st catch block");
        }
catch(ArithmeticException e){
	System.out.println("Be careful about the index 2nd catch block");
        }
finally {
	System.out.println("You did a good job");	
}
   }

}
