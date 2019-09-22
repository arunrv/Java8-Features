package predicates;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemoSorting 
{
	public static void main(String[] args) 
	{
		Comparator<Integer> c=(i1, i2)->-i1>i2?1:-1;
		Map<Integer, String> m1=new TreeMap<>(c);
		m1.put(100, "Durrga");
		m1.put(600, "Sunny");
		m1.put(300, "Bunny");
		m1.put(200, "Chinny");
		m1.put(700, "Vinny");
		m1.put(400, "Pinny");
		System.out.println(m1);
		Set<Integer> s1 = m1.keySet();
		Set<Entry<Integer, String>> s2 = m1.entrySet();
		for (Entry<Integer, String> entry : s2) {
			System.out.println(entry.getKey()+"-----------"+entry.getValue());
			
		}
	}

}
