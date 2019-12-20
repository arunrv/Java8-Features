package jodaTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SecondStep 
{
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		LocalDate ld=LocalDate.of(1990, 5, 15);
		System.out.println(ld);
		LocalDateTime ldt = LocalDateTime.of(1990, 5, 15, 12, 10);
		
		System.out.println(ldt);
		
		String ldtp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-mm-yyy_hhmmss"));
		System.out.println(ldtp);
	}
	

}
