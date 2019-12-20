import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemoval 
{
	public static void main(String[] args) {
		
		Set<Character> s1=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		
		String s="Radha Ramana";
		for(int i=0;i<s.length();i++)
		{
			s1.add(s.charAt(i));	
		}
		System.out.println(s1);
		s1.stream().forEach(a->{sb.append(a);	
		});
		System.out.println(sb);
		
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					break;
				}
				
			}
			if(j==i)
				s2=s2+s.charAt(i);
		}
		System.out.println(s2);
	}

}
