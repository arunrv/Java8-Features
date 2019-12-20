package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test2 
{
	public static void main(String[] args) {
		
		HashMap<String, String> m1=new HashMap<>();
		m1.put("100", "Ramya");
		m1.put("101", "Sowmya");
		m1.put("103", "Shweetha");
		m1.put("104", "Lakshmi");
		m1.put(null, "HI");
		m1.put(null, "Bye");
		
		Set<Entry<String, String>> entries = m1.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey()+"------"+entry.getValue());
		}
		Set<String> s1=new TreeSet<>();
	}

}
