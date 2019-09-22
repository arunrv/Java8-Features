package predicates;

import java.util.function.Predicate;

public class ExtractingStringStartsWithK 
{
	static void m1(Predicate<String> p1, String[] x)
	{
		for (String string : x) {
			if(p1.test(string))
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		
		String[] x={"Kavya", "Kiran", "Ramya", "Sowmya", "Asha"};
		Predicate<String> p1=s->s.charAt(0)=='K';
		
		m1(p1, x);
		
	}

}
