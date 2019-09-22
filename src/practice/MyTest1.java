package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyTest1 
{
	public static void main(String[] args) 
	{
		
		List<Laptop> laplist=new ArrayList<>();
		
		Laptop l1=new Laptop("Lenovo", 35000, 5);
		Laptop l2=new Laptop("Dell", 40000, 6);
		Laptop l3=new Laptop("HP", 38000, 3);
		Laptop l4=new Laptop("Asus", 25000, 8);
		Laptop l5=new Laptop("Acer", 20000, 4);
		
		laplist.add(l1);
		laplist.add(l2);
		laplist.add(l3);
		laplist.add(l4);
		laplist.add(l5);
		
		Collections.sort(laplist);
		laplist.stream().forEach(System.out::println);
		
		
		
	}

}
