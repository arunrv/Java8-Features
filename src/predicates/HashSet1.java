package predicates;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 
{
	public static void main(String[] args) {
		Comparator<String>c=(s1, s2)->-s1.compareTo(s2);
		Set<String> s1=new HashSet<String>();
		s1.add("Sunny");
		s1.add("Bunny");
		s1.add("Chinny");
		s1.add("Sunny");
		s1.add("Andy");
		s1.add("Bindu");
		
		s1.stream().forEach(System.out::println);
		
		Set<String> s2=new TreeSet<>(c);
		s2.add("Sunny");
		s2.add("Bunny");
		s2.add("Chinny");
		s2.add("Sunny");
		s2.add("Andy");
		s2.add("Bindu");
		
		s2.stream().forEach(System.out::println);
	}

}
