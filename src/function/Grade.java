package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
public class Grade 
{
	public static void main(String[] args) {
		Student s1=new Student("Reeeta", 35);
		Student s2=new Student("Geeta", 55);
		Student s3=new Student("Shweetha", 85);
		Student s4=new Student("Sandhya", 90);
		Student s5=new Student("Megha", 60);
		Student s6=new Student("Ramya", 45);
		
		Function<Integer, String> f1=i->{
			if(i>85)
			{
				return "FCD";
			}
			else
				return"below FCD";
		};
		
		Function<Student, String> f= i->i.marks>=85?"FCD":i.marks>=65?"First Class":i.marks>=40?"Second Class":"Fail";
		//Consumer<Integer> c= i->i>=85?System.out.println("FCD"):i>=65?System.out.println("First Class"):i>=40?System.out.println("Second Class"):System.out.println("Fail");
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);
		for (Student student : l1) 
		{
			System.out.println(student.getName());
			System.out.println(student.getMarks());
			System.out.println(f.apply(student));
			
		}
		
	}

}
