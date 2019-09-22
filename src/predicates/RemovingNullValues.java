package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemovingNullValues 
{
	
	static Predicate<String> p=s->s!=null && s.length()!=0;
	
	
	public static void m2(Predicate<String> p1, String[] x)
	{
		List<String> l1=new ArrayList<>();
		
		for(int i=0; i<x.length;i++)
		{
			String s1=x[i];
			if(p1.test(s1))
			{
				System.out.println(s1);
				l1.add(s1);
			}
		}
		System.out.println(l1);
	//	System.out.println(x1);
		/*for(String s:x)
		{
		if(p1.test(s))
		{
		System.out.println(s);	
		}
		}*/
			
	}
	
	public static void main(String[] args) 
	{
		String[] x={"Kavya", null, "Ramya", "Sowmya", "Asha", ""};
		m2(p, x);
		
		
	}

}
