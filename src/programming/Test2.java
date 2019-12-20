package programming;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test2 
{
	public static void main(String[] args) {
		String s="Radha Ramana";
		StringBuffer sb=new StringBuffer();
		Set<Character> s1=new LinkedHashSet<>();
		for(int i=0; i<s.length();i++)
		{
			s1.add(s.charAt(i));
		}
		System.out.println(s1);
		s1.stream().forEach(ch->{sb.append(ch);
			
		});
		System.out.println(sb);
		
		Map<Character, Integer> m1=new LinkedHashMap<>();
		for(char ch1:s.toCharArray())
		{
			m1.put(ch1, m1.containsKey(ch1)?m1.get(ch1)+1:1);
		}
		System.out.println(m1);
		
	}

}
