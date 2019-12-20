package programming;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class IdentifyFirstNonReptativeCharacter 
{
	public static void main(String[] args) {
		String s="IT IS COLD OUTSIDE";
		Map<Character, Integer> m1=new LinkedHashMap<>();
		for (Character c : s.toCharArray()) {
			m1.put(c, m1.containsKey(c)?m1.get(c)+1:1);
		}
		System.out.println(m1);
		
		for (Entry<Character, Integer> es : m1.entrySet()) 
		{
			if(es.getValue()==1)
			{
				System.out.println(es.getKey());
				//break;
			}
			
		}
		
		
		
			
	
	}

}
