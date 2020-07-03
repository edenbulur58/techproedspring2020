package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDate01 {

	public static void main(String[] args) {
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	
	//DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy");	
		
		LocalDate date=LocalDate.now();
		
		System.out.println(dtf.format(date));
		//16 jun 2020
		//06-16-2020
		
		
		
	}

}
