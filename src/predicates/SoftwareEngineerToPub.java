package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class SoftwareEngineer
{
	String name;
	int age;
	boolean girlfriend;
	
	
	public SoftwareEngineer(String name, int age, boolean girlfriend) {
		super();
		this.name = name;
		this.age = age;
		this.girlfriend = girlfriend;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", girlfriend=" + girlfriend + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGirlfriend() {
		return girlfriend;
	}
	public void setGirlfriend(boolean girlfriend) {
		this.girlfriend = girlfriend;
	}
	
}
public class SoftwareEngineerToPub 
{
	public static void main(String[] args) {
		Predicate<SoftwareEngineer> p=s->s.getAge()>18&&s.isGirlfriend()==true;
		SoftwareEngineer swe1=new SoftwareEngineer("Arun", 25, false);
		SoftwareEngineer swe2=new SoftwareEngineer("Aravind", 20, true);
		SoftwareEngineer swe3=new SoftwareEngineer("Sham", 40, true);
		SoftwareEngineer swe4=new SoftwareEngineer("Raki", 25, false);
		SoftwareEngineer swe5=new SoftwareEngineer("Shanakar", 17, true);
		SoftwareEngineer swe6=new SoftwareEngineer("Shashi", 32, true);
		List<SoftwareEngineer> l1=new ArrayList<SoftwareEngineer>();
		l1.add(swe1);
		l1.add(swe2);
		l1.add(swe3);
		l1.add(swe4);
		l1.add(swe5);
		l1.add(swe6);
		for (SoftwareEngineer softwareEngineer : l1) 
		{
			if(p.test(softwareEngineer))
			System.out.println(softwareEngineer);
			
		}
	}

}
