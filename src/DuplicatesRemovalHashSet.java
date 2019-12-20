import java.util.HashSet;
import java.util.Set;

public class DuplicatesRemovalHashSet {
	
	public static void main(String[] args) {
		String s1="MuruganMani";
		char[] ch = s1.toCharArray();
		Set<Character> s2=new HashSet<>();
		
		for (Character character : ch) {
			if(!s2.contains(ch))
			{
				s2.add(character);
			}
		}
	System.out.println(s2);
	}
	

}
