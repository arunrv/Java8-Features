import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateRemovalHashMap 
{
	public static void main(String[] args) {
		String s="MuruganMani";
		char[] c1 = s.toCharArray();
		Map<Character, Integer> m1=new LinkedHashMap<>();
		Map<Character, Integer> m2=new LinkedHashMap<>();
		for(char c:c1)
		{
			if(!m1.containsKey(c))
			{
				m1.put(c, 1);
			}
			else
				m2.put(c, 2);
		}
		Set<Character> s1=new LinkedHashSet<>();
		Set<Character> s2=new LinkedHashSet<>();
		Set<Entry<Character, Integer>> mw = m1.entrySet();
		
		for (Entry<Character, Integer> entry : m1.entrySet()) {
	
				s1.add(entry.getKey());
		}
		for (Entry<Character, Integer> entry : m2.entrySet()) {
			
			s2.add(entry.getKey());
	}
		System.out.println(s1);
		System.out.println(s2);
		Set<Character> s3 = m1.keySet();
		System.out.println(s3);
	}

}
