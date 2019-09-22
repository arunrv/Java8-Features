package practice;

class C
{
	public void m1()
	{
		System.out.println("hi");
	}
}

public class P extends C
{
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("Bye");
	}
	
	public static void main(String[] args) 
	{
		P p=new P();
		p.m1();
		
	}
	
}
