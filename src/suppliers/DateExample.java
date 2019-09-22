package suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class DateExample 
{
	public static void main(String[] args) {
		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());
	}

}
