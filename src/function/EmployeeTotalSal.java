package function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee
{
	String name;
	double sal;
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
public class EmployeeTotalSal
{
	static double count;
	public static void main(String[] args) {
		Employee e1=new Employee("Geeta", 1000);
		Employee e2=new Employee("Reeta", 800);
		Employee e3=new Employee("Shweetha", 1000);
		Employee e4=new Employee("Ramya", 500);
		Employee e5=new Employee("Sandhya", 500);
		
		ArrayList<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		l.stream().forEach(e->{count=e.getSal()+count;});//calculating sum of monthly sal
		System.out.println(count);
		count=0.0;
		
		//giving increment to only Employee Ramya and returning only salary
		List<Double> l1 = l.stream().map(e->{
			if(e.getName()=="Ramya")
			return e.getSal()+1000; 
			else
			return e.getSal();}).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l);
		
		Predicate<Employee> p=e->e.getName()=="Ramya"||e.getName()=="Shweetha";
		Comparator<Employee> c1=(t1, t2)->t1.getSal()>t2.getSal()?1:-1;
		List<Employee> l3 = l.stream().map((Employee e)->{
			if(p.test(e))
			{
				double b=e.getSal()+100;
				e.setSal(b);
				return e;
			}
			else
			return e;}).sorted(c1).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(l3);
		
		List<Integer> l5=new ArrayList<>();
		l5.add(9);
		l5.add(8);
		l5.add(10);
		l5.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(System.out::println);
		
		
		//Performing Salary Increment whose salary is less than 3500 by 477
		
		Employee e11=new Employee("Santhu", 2500);
		Employee e12=new Employee("Banti", 3300);
		Employee e13=new Employee("Ranju", 5000);
		Employee e14=new Employee("Sharu", 6000);
		Employee e15=new Employee("Shweetha", 4800);
		Employee e16=new Employee("Ansu", 3400);
		List<Employee> l11=new ArrayList<>();
		l11.add(e11);
		l11.add(e12);
		l11.add(e13);
		l11.add(e14);
		l11.add(e15);
		l11.add(e16);
		
		
	/*	for (Employee employee : l11) {
			if(employee.getSal()<3500)
			{
				double newsal = employee.getSal()+477;
				employee.setSal(newsal);
			}
		}
		System.out.println(l11);*/
		
		//uing stream concept
		/*l11.stream().forEach(e33->{
			
			if(e33.getSal()<3500)
			{
				double newsal=e33.getSal()+477;
				e33.setSal(newsal);
			}
		});*/
		
		//using stream and collecting to other list
		
		
List<Employee> l12 = l11.stream().map(e34->{if(e34.getSal()<3500)
	{
		double nsal=e34.getSal()+477;
		e34.setSal(nsal);
		return e34;
	}
	else
		return e34;
}).collect(Collectors.toList());
		
System.out.println(l11);
		System.out.println(l12);
		
		//filter the employees whose salary is lesser than 3500 and apply 500 increment.
		Employee e21=new Employee("Santhu", 2500);
		Employee e22=new Employee("Banti", 3300);
		Employee e23=new Employee("Ranju", 5000);
		Employee e24=new Employee("Sharu", 6000);
		Employee e25=new Employee("Shweetha", 4800);
		Employee e26=new Employee("Ansu", 3400);
		List<Employee> l21=new ArrayList<>();
		l21.add(e21);
		l21.add(e22);
		l21.add(e23);
		l21.add(e24);
		l21.add(e25);
		l21.add(e26);
		
		long n1 = l21.stream().filter(e->e.sal<3500).count();
		System.out.println(n1);
		System.out.println(l21);
		l21.stream().filter(e->e.sal<3500).forEach(e->{
			if(e.getSal()<3500)
			{
				double b = e.getSal()+500;
				e.setSal(b);
			}
				
		});
		System.out.println(l21);
		List<Employee> l22 = l21.stream().filter(e->e.getSal()<5000).collect(Collectors.toList());
		System.out.println(l22.size());
}
	
		
	}
