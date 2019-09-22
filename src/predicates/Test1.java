package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import practice.Laptop;

public class Test1
{
	static void m1(Predicate<Integer> p, int[] x)
	{
		for(int x1:x)
		{
			
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
	}
	public static void main(String[] args) 
	{
		//Predicate<Integer> p=i->{return i>10?true:i==10?true:false;};
		Predicate<Integer> p=i->i>10;
		//System.out.println(p.test(10));
		
		Predicate<String> p1=s->s.length()>10;
		
		//System.out.println(p1.test("Hello"));
		
		Predicate<List<Laptop>> p2=l->l.isEmpty();
		System.out.println(p2.test(new ArrayList<Laptop>()));
		
		int[] x={0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p3=i->i>10;
		Predicate<Integer> p4=i->i%2==0;
		System.out.println("******Numbers greater than 10***********");
		m1(p3, x);
		System.out.println("******Even Numbers***********");
		m1(p4, x);
		System.out.println("******Numbers not greater than 10***********");
		m1(p3.negate(), x);
		
		System.out.println(("greatr than 10 and even are"));
		m1(p3.and(p4), x);
		
		System.out.println(("greatr than 10 and even are"));
		m1(p3.or(p4), x);
		
		
	}

}
