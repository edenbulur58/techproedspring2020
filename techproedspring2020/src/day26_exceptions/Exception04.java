package day26_exceptions;

public class Exception04 {

	public static void main(String[] args) {
		
		
	indexNum("Java",2);	
		
	}
//IndexOutOfBoundsException is the parent of StringIndexOutOfBoundsException	
//if you are using many catch blocks do not use parent before child, make order 
	//
	
	
		public static void indexNum(String str,int idx) {
			try {
				System.out.println("Result :"+str.charAt(idx));
				
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println("Be careful about the index 1st catch block");
			        }
			catch(IndexOutOfBoundsException e){
				System.out.println("Be careful about the index 2nd catch block");
			        }
			finally {
				System.out.println("You did a good job");	
			}

	}

}
