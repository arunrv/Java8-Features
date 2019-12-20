package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) {
		
		HashMap m1=new HashMap();
		m1.put("105", "Shweetha");
		m1.put(102, "Ramya");
		m1.put(103, "Raki");
		m1.put(107, "Reeta");
		System.out.println(m1);
		System.out.println(m1.put(107, "SenoReeta"));
		Set s1 = m1.keySet();
		System.out.println(s1);
		Collection s2 = m1.values();
		System.out.println(s2);
		Set s3 = m1.entrySet();
		System.out.println(s3);
		Iterator i1 = s3.iterator();
		while(i1.hasNext())
		{
			Map.Entry entry = (Map.Entry)i1.next();
			//System.out.println(entry);
			if(entry.getKey()=="105")
			{
				entry.setValue("Sowmya");
			}
		}
		System.out.println(m1);
		System.out.println(m1.get(102));
		TreeSet s=new TreeSet<>();
	
	}

}
