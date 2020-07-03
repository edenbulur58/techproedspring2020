package day21_passby_date_accessmodifiers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeQuestion01 {

	public static void main(String[] args) {
		/*Take current date in the format 10/03/2020
		 * 
		 * Add 1 year, 2 months, and 11 days.
		 * 
		 * Print it on the console, output sholud be 21/05/2021
		 */
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//LocalDate date=LocalDate.now().plusYears(1).plusMonths(2).plusDays(11);
	LocalDate date1=LocalDate.now().plusYears(1);
		System.out.println(date1);
		
		LocalDate date2=date1.plusMonths(2);
		System.out.println(date2);
		
		LocalDate date3=date2.plusDays(11);
		System.out.println(date3);
		
		System.out.println(dtf.format(date3));
		//System.out.println(dtf.format(date));
	}
	

}
