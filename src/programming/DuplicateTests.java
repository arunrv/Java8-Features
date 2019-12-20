package programming;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateTests {
	public static void main(String[] args) {
		Map<Character, Integer> m1=new LinkedHashMap<Character, Integer>();
		String s="IT IS COLD OUTSIDE";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			m1.put(c, m1.containsKey(c)?m1.get(c)+1:1);
		}
		Set<Character> s4=new LinkedHashSet<>();
		for(Entry<Character, Integer> entry:m1.entrySet())
		{
			if(entry.getValue()==1)
			{
				s4.add(entry.getKey());
			}
		}
		
		Iterator<Character> itr = s4.iterator();
		Character ch2 = itr.next();
		System.out.println(ch2);
	}

}
