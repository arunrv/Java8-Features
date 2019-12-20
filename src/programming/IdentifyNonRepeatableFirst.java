package programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class IdentifyNonRepeatableFirst {
	
	public static void main(String[] args) {
		Map<Character, Integer> m1=new LinkedHashMap<>();
		Map<Character, Integer> m2=new LinkedHashMap<>();
		
		String s="MuruganMani";
		char[] ch = s.toCharArray();
		
		for (char c : ch) {
			if(!m1.containsKey(c))
			{
				m1.put(c, 1);
			}
			else
				m1.put(c, m1.get(c)+1);
		}
		System.out.println(m1);
		
		
		
	}

}
