package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class MyTest2 
{
	public static void main(String[] args) {
		List<Mobile> laplist=new ArrayList<>();
		
		Mobile l1=new Mobile("Lenovo", 35000, 5);
		Mobile l2=new Mobile("Dell", 40000, 6);
		Mobile l3=new Mobile("HP", 38000, 3);
		Mobile l4=new Mobile("Asus", 25000, 8);
		Mobile l5=new Mobile("Acer", 20000, 4);
		
		laplist.add(l1);
		laplist.add(l2);
		laplist.add(l3);
		laplist.add(l4);
		laplist.add(l5);
		
		Comparator<Mobile> c=new Comparator<Mobile>()
		{

			@Override
			public int compare(Mobile o1, Mobile o2) {
			//	return o1.getBrand().compareTo(o2.getBrand());
			//	return -o1.getBrand().compareTo(o2.getBrand());
				if(o1.getRam()>o2.getRam())
				{
					return -1;
				}
				else
					return 1;
			}
			
		};
		
		Comparator<Mobile> c1=(o1,o2)->o1.getBrand().compareTo(o2.getBrand());
		Comparator<Mobile> c2=(o1, o2)->o1.getRam()>o2.getRam()?1:-1;
		Comparator<Mobile> c3=(o1,o2)->o1.getRam()>o2.getRam()?-1:1;
		Collections.sort(laplist, c3);
		laplist.stream().forEach(System.out::println);

	}
}
