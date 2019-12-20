package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MyTest3 
{
	static Comparator<Employee> C3=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return -o1.getName().compareTo(o2.getName());
		}
	};
	public static void main(String[] args) {
		
		Employee e1=new Employee("Shweetha", 29, 3000);
		Employee e2=new Employee("Geetha", 26, 50000);
		Employee e3=new Employee("Chaithra", 27, 35000);
		Employee e4=new Employee("Kranthi", 25, 34000);
		
		List<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		System.out.println(l1);
		Comparator<Employee> C1=(o1, o2)->o1.getSal()>o2.getSal()?-1:o1.getSal()<o2.getSal()?1:0;
		EmpComparator C2=new EmpComparator();
		
		Collections.sort(l1, C3);
		System.out.println(l1);
		
		Set<Employee> s1=new TreeSet<>(C1);
		s1.addAll(l1);
		System.out.println(s1);
		
		
	}

}
