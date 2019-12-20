package jodaTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class FirstStep 
{
	public static void main(String[] args) 
	{
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.printf("%d-%d-%d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
	}

}
