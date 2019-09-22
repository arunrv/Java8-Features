package biFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class Student
{
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class BiFunctionStudent 
{
	public static void main(String[] args) {
		BiFunction<String, Integer, Student> f1=(s1, i1)->new Student(s1, i1);
		BiFunction<String, Integer, Student> f2=Student::new;
		List<Student> l1=new ArrayList<Student>();
		l1.add(f2.apply("Santhu", 101));
		l1.add(f1.apply("Banti", 102));
		l1.add(f1.apply("Sudha", 103));
		l1.add(f1.apply("Amulya", 104));
		
		List<Student> l2 = l1.stream().sorted((s1, s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
		System.out.println(l2);
	}

}
